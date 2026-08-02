package defpackage;

import kotlin.KotlinVersion;
import kotlin.collections.a;
import kotlin.text.c;

/* loaded from: classes5.dex */
public abstract class jxd {
    public static final int[] a;
    public static final int[] b;
    public static final long[] c;

    static {
        int[] iArr = new int[256];
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            iArr[i2] = "0123456789abcdef".charAt(i2 & 15) | ("0123456789abcdef".charAt(i2 >> 4) << '\b');
        }
        a = iArr;
        int[] iArr2 = new int[256];
        for (int i3 = 0; i3 < 256; i3++) {
            iArr2[i3] = "0123456789ABCDEF".charAt(i3 & 15) | ("0123456789ABCDEF".charAt(i3 >> 4) << '\b');
        }
        b = iArr2;
        int[] iArr3 = new int[256];
        for (int i4 = 0; i4 < 256; i4++) {
            iArr3[i4] = -1;
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i5)] = i6;
            i5++;
            i6++;
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i7)] = i8;
            i7++;
            i8++;
        }
        long[] jArr = new long[256];
        for (int i9 = 0; i9 < 256; i9++) {
            jArr[i9] = -1;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i10)] = i11;
            i10++;
            i11++;
        }
        int i12 = 0;
        while (i < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i)] = i12;
            i++;
            i12++;
        }
        c = jArr;
    }

    public static final int a(long j) {
        if (0 <= j && j <= 2147483647L) {
            return (int) j;
        }
        kac.l(net.a(j), "The resulting string length is too big: ");
        return 0;
    }

    public static final void b(int i, int i2, String str) {
        int i3 = i2 - i;
        if (i3 < 1) {
            StringBuilder r = k5r.r(i, "Expected at least 1 hexadecimal digits at index ", ", but was \"", str.substring(i, i2), "\" of length ");
            r.append(i3);
            throw new NumberFormatException(r.toString());
        }
        if (i3 > 16) {
            int i4 = (i3 + i) - 16;
            while (i < i4) {
                if (str.charAt(i) != '0') {
                    StringBuilder q = k5r.q(i, "Expected the hexadecimal digit '0' at index ", ", but was '");
                    q.append(str.charAt(i));
                    q.append("'.\nThe result won't fit the type being parsed.");
                    throw new NumberFormatException(q.toString());
                }
                i++;
            }
        }
    }

    public static final int c(byte[] bArr, int i, int[] iArr, char[] cArr, int i2) {
        int i3 = iArr[bArr[i] & 255];
        cArr[i2] = (char) (i3 >> 8);
        cArr[i2 + 1] = (char) (i3 & KotlinVersion.MAX_COMPONENT_VALUE);
        return i2 + 2;
    }

    public static long d(int i, int i2, String str) {
        mxd mxdVar = mxd.d;
        mxdVar.getClass();
        b7 b7Var = a.a;
        int length = str.length();
        b7Var.getClass();
        b7.a(i, i2, length);
        if (mxdVar.c.a) {
            b(i, i2, str);
            return e(i, i2, str);
        }
        if (i2 - i <= 0) {
            throw new NumberFormatException("Expected a hexadecimal number with prefix \"\" and suffix \"\", but was ".concat(str.substring(i, i2)));
        }
        b(i, i2, str);
        return e(i, i2, str);
    }

    public static final long e(int i, int i2, String str) {
        long j = 0;
        while (i < i2) {
            long j2 = j << 4;
            char charAt = str.charAt(i);
            if ((charAt >>> '\b') == 0) {
                long j3 = c[charAt];
                if (j3 >= 0) {
                    j = j2 | j3;
                    i++;
                }
            }
            StringBuilder q = k5r.q(i, "Expected a hexadecimal digit at index ", ", but was ");
            q.append(str.charAt(i));
            throw new NumberFormatException(q.toString());
        }
        return j;
    }

    public static final int f(String str, char[] cArr, int i) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                str.getChars(0, str.length(), cArr, i);
            } else {
                cArr[i] = str.charAt(0);
            }
        }
        return str.length() + i;
    }

    public static final String g(byte[] bArr, mxd mxdVar) {
        mxdVar.getClass();
        int length = bArr.length;
        b7 b7Var = a.a;
        int length2 = bArr.length;
        b7Var.getClass();
        b7.a(0, length, length2);
        if (length == 0) {
            return "";
        }
        int[] iArr = mxdVar.a ? b : a;
        kxd kxdVar = mxdVar.b;
        if (kxdVar.a) {
            if (kxdVar.b) {
                char[] cArr = new char[a(length * 2)];
                int i = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    i = c(bArr, i2, iArr, cArr, i);
                }
                return new String(cArr);
            }
            if (length <= 0) {
                xq0.x("Failed requirement.");
                return null;
            }
            long j = 0;
            char[] cArr2 = new char[a((length * (((2 + j) + j) + j)) - j)];
            int f = f("", cArr2, c(bArr, 0, iArr, cArr2, f("", cArr2, 0)));
            for (int i3 = 1; i3 < length; i3++) {
                f = f("", cArr2, c(bArr, i3, iArr, cArr2, f("", cArr2, f("", cArr2, f))));
            }
            return new String(cArr2);
        }
        if (length <= 0) {
            xq0.x("Failed requirement.");
            return null;
        }
        int i4 = length - 1;
        int i5 = i4 / Integer.MAX_VALUE;
        int i6 = length % Integer.MAX_VALUE;
        if (i6 == 0) {
            i6 = Integer.MAX_VALUE;
        }
        int i7 = (i6 - 1) / Integer.MAX_VALUE;
        long j2 = (i7 * 2) + i5;
        long j3 = (i4 - i5) - i7;
        long j4 = 0;
        int a2 = a(((j4 + 2 + j4) * length) + (j3 * j4) + j2);
        char[] cArr3 = new char[a2];
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (i9 == Integer.MAX_VALUE) {
                cArr3[i8] = '\n';
                i10 = 0;
                i8++;
                i9 = 0;
            } else if (i10 == Integer.MAX_VALUE) {
                i8 = f("  ", cArr3, i8);
                i10 = 0;
            }
            if (i10 != 0) {
                i8 = f("", cArr3, i8);
            }
            i8 = f("", cArr3, c(bArr, i11, iArr, cArr3, f("", cArr3, i8)));
            i10++;
            i9++;
        }
        if (i8 == a2) {
            return new String(cArr3);
        }
        xq0.q("Check failed.");
        return null;
    }

    public static String h(int i) {
        mxd mxdVar = mxd.d;
        mxdVar.getClass();
        String str = mxdVar.a ? "0123456789ABCDEF" : "0123456789abcdef";
        if (mxdVar.c.b) {
            return new String(new char[]{str.charAt((i >> 28) & 15), str.charAt((i >> 24) & 15), str.charAt((i >> 20) & 15), str.charAt((i >> 16) & 15), str.charAt((i >> 12) & 15), str.charAt((i >> 8) & 15), str.charAt((i >> 4) & 15), str.charAt(i & 15)});
        }
        long j = i;
        long j2 = 0;
        int a2 = a(j2 + j2 + 8 + j2);
        char[] cArr = new char[a2];
        int f = f("", cArr, 0);
        int i2 = 32;
        int i3 = 0;
        while (i3 < 8) {
            i2 -= 4;
            cArr[f] = str.charAt((int) ((j >> i2) & 15));
            i3++;
            f++;
        }
        int f2 = f("", cArr, f);
        return f2 == a2 ? new String(cArr) : c.l(cArr, 0, f2);
    }
}
