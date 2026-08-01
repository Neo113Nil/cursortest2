package K1;

/* loaded from: classes.dex */
public abstract class l extends k {
    public static final boolean e0(int i, int i2, int i3, String str, String str2, boolean z2) {
        D1.i.e(str, "<this>");
        D1.i.e(str2, "other");
        return !z2 ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z2, i, str2, i2, i3);
    }

    public static String f0(String str, String str2, String str3) {
        D1.i.e(str, "<this>");
        int i02 = d.i0(str, str2, 0, false);
        if (i02 < 0) {
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
            sb.append((CharSequence) str, i2, i02);
            sb.append(str3);
            i2 = i02 + length;
            if (i02 >= str.length()) {
                break;
            }
            i02 = d.i0(str, str2, i02 + i, false);
        } while (i02 > 0);
        sb.append((CharSequence) str, i2, str.length());
        String sb2 = sb.toString();
        D1.i.d(sb2, "toString(...)");
        return sb2;
    }
}
