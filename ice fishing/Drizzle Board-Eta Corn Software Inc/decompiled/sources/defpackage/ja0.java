package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class ja0 extends ia0 {
    public static boolean Ey6iv0m0(String str, String str2) {
        str.getClass();
        return str.startsWith(str2);
    }

    public static String KlHjfFWx(String str, String str2, String str3) {
        str.getClass();
        int RXQxj5Oe = ba0.RXQxj5Oe(str, str2, 0, false);
        if (RXQxj5Oe < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, RXQxj5Oe);
            sb.append(str3);
            i2 = RXQxj5Oe + length;
            if (RXQxj5Oe >= str.length()) {
                break;
            }
            RXQxj5Oe = ba0.RXQxj5Oe(str, str2, RXQxj5Oe + i, false);
        } while (RXQxj5Oe > 0);
        sb.append((CharSequence) str, i2, str.length());
        return sb.toString();
    }
}
