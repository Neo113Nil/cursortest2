package z1;

/* loaded from: classes.dex */
public abstract class o extends n {
    public static boolean M(String str, String suffix) {
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(suffix, "suffix");
        return str.endsWith(suffix);
    }

    public static boolean N(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static final boolean O(int i2, int i3, int i4, String str, String other, boolean z2) {
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(other, "other");
        return !z2 ? str.regionMatches(i2, other, i3, i4) : str.regionMatches(z2, i2, other, i3, i4);
    }

    public static String P(String str, String oldValue, String newValue) {
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(oldValue, "oldValue");
        kotlin.jvm.internal.i.e(newValue, "newValue");
        int W2 = g.W(str, oldValue, 0, false);
        if (W2 < 0) {
            return str;
        }
        int length = oldValue.length();
        int i2 = length >= 1 ? length : 1;
        int length2 = newValue.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i3 = 0;
        do {
            sb.append((CharSequence) str, i3, W2);
            sb.append(newValue);
            i3 = W2 + length;
            if (W2 >= str.length()) {
                break;
            }
            W2 = g.W(str, oldValue, W2 + i2, false);
        } while (W2 > 0);
        sb.append((CharSequence) str, i3, str.length());
        String sb2 = sb.toString();
        kotlin.jvm.internal.i.d(sb2, "toString(...)");
        return sb2;
    }

    public static boolean Q(int i2, String str, String str2, boolean z2) {
        kotlin.jvm.internal.i.e(str, "<this>");
        return !z2 ? str.startsWith(str2, i2) : O(i2, 0, str2.length(), str, str2, z2);
    }

    public static boolean R(String str, String prefix, boolean z2) {
        kotlin.jvm.internal.i.e(str, "<this>");
        kotlin.jvm.internal.i.e(prefix, "prefix");
        return !z2 ? str.startsWith(prefix) : O(0, 0, prefix.length(), str, prefix, z2);
    }
}
