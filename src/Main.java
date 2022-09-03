import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 5000;
        int select, price;
        while (right > 0) {
            System.out.print("Kullanıcı Adınız : ");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("yasir") && password.equals("sam55")) {
                System.out.println("Merhaba, SAGLAM BANK'a Hoşgeldiniz!");
                do {
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Çıkış Yap");

                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Yatırmak istediğiniz tutarı giriniz : ");
                            price = input.nextInt();
                            balance += price;
                            //System.out.println("Güncel Bakiyeniz : " + balance);
                            break;

                        case 2:
                            System.out.print("Çekmek istediğiniz tutarı giriniz : ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiyeniz yetersizdir.");
                            } else {
                                balance -= price;
                                //System.out.println("Güncel Bakiyeniz : " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Güncel Bakiyeniz : " + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur, banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }

    }
}