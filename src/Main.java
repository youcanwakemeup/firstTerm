public class Main {
    public static void main(String[] args) {
        String str = "SkyPro";
        int halfLength = str.length() / 2;
        String firstHalf = str.substring(0, halfLength);
        String secondHalf = str.substring(halfLength);
        System.out.println(str);
        System.out.println(firstHalf);
        System.out.println(secondHalf);
    }
}