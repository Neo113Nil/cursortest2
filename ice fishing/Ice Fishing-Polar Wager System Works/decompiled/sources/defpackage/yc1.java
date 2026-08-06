package defpackage;

/* loaded from: classes.dex */
public abstract class yc1 extends defpackage.xc1 {
    public static java.lang.String EoOhNTTfIN7K(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        int RmCzwkUxICV = defpackage.rc1.RmCzwkUxICV(0, str, str2, false);
        if (RmCzwkUxICV < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new java.lang.OutOfMemoryError();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((java.lang.CharSequence) str, i2, RmCzwkUxICV);
            sb.append(str3);
            i2 = RmCzwkUxICV + length;
            if (RmCzwkUxICV >= str.length()) {
                break;
            }
            RmCzwkUxICV = defpackage.rc1.RmCzwkUxICV(RmCzwkUxICV + i, str, str2, false);
        } while (RmCzwkUxICV > 0);
        sb.append((java.lang.CharSequence) str, i2, str.length());
        return sb.toString();
    }

    public static boolean wKlPRKlRnfqr(java.lang.String str, java.lang.String str2) {
        str.getClass();
        return str.startsWith(str2);
    }
}
