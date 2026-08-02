package k6;

import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f38616a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f38617b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean[] f38618c;

    static {
        char[] cArr = new char[512];
        for (int i = 0; i < 256; i++) {
            cArr[i] = "0123456789abcdef".charAt(i >>> 4);
            cArr[i | 256] = "0123456789abcdef".charAt(i & 15);
        }
        f38616a = cArr;
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i4 = 0; i4 < 16; i4++) {
            bArr["0123456789abcdef".charAt(i4)] = (byte) i4;
        }
        f38617b = bArr;
        boolean[] zArr = new boolean[65535];
        int i6 = 0;
        while (i6 < 65535) {
            zArr[i6] = (48 <= i6 && i6 <= 57) || (97 <= i6 && i6 <= 102);
            i6++;
        }
        f38618c = zArr;
    }

    public static void a(String str, int i, byte[] bArr) {
        byte[] bArr2;
        byte b9;
        byte b10;
        for (int i4 = 0; i4 < i; i4 += 2) {
            int i6 = i4 / 2;
            char charAt = str.charAt(i4);
            char charAt2 = str.charAt(i4 + 1);
            if (charAt >= 128 || (b9 = (bArr2 = f38617b)[charAt]) == -1) {
                throw new IllegalArgumentException("invalid character " + charAt);
            }
            if (charAt2 >= 128 || (b10 = bArr2[charAt2]) == -1) {
                throw new IllegalArgumentException("invalid character " + charAt2);
            }
            bArr[i6] = (byte) (b10 | (b9 << 4));
        }
    }
}
