package defpackage;

/* loaded from: classes9.dex */
public class sza extends rza {
    public static int d(char c) {
        int digit = Character.digit((int) c, 10);
        if (digit >= 0) {
            return digit;
        }
        throw new IllegalArgumentException("Char " + c + " is not a decimal digit");
    }

    public static Integer e(char c) {
        Integer valueOf = Integer.valueOf(Character.digit((int) c, 10));
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    public static final boolean f(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }
}
