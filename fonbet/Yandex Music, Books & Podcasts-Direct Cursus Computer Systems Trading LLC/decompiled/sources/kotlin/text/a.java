package kotlin.text;

/* loaded from: classes5.dex */
public class a extends CharsKt__CharJVMKt {
    public static Integer a(char c) {
        Integer valueOf = Integer.valueOf(Character.digit((int) c, 10));
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    public static Integer b(char c) {
        CharsKt__CharJVMKt.checkRadix(16);
        int digit = Character.digit((int) c, 16);
        Integer valueOf = Integer.valueOf(digit);
        if (digit >= 0) {
            return valueOf;
        }
        return null;
    }

    public static final boolean c(char c, char c2, boolean z) {
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
