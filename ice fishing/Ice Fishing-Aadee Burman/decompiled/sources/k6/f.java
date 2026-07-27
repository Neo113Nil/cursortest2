package k6;

import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f38689a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f38690b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean[] f38691c;

    static {
        char[] cArr = new char[512];
        for (int i = 0; i < 256; i++) {
            cArr[i] = "0123456789abcdef".charAt(i >>> 4);
            cArr[i | 256] = "0123456789abcdef".charAt(i & 15);
        }
        f38689a = cArr;
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i6 = 0; i6 < 16; i6++) {
            bArr["0123456789abcdef".charAt(i6)] = (byte) i6;
        }
        f38690b = bArr;
        boolean[] zArr = new boolean[65535];
        int i9 = 0;
        while (i9 < 65535) {
            zArr[i9] = (48 <= i9 && i9 <= 57) || (97 <= i9 && i9 <= 102);
            i9++;
        }
        f38691c = zArr;
    }

    public static void a(String str, int i, byte[] bArr) {
        byte[] bArr2;
        byte b9;
        byte b10;
        for (int i6 = 0; i6 < i; i6 += 2) {
            int i9 = i6 / 2;
            char charAt = str.charAt(i6);
            char charAt2 = str.charAt(i6 + 1);
            if (charAt >= 128 || (b9 = (bArr2 = f38690b)[charAt]) == -1) {
                throw new IllegalArgumentException("invalid character " + charAt);
            }
            if (charAt2 >= 128 || (b10 = bArr2[charAt2]) == -1) {
                throw new IllegalArgumentException("invalid character " + charAt2);
            }
            bArr[i9] = (byte) (b10 | (b9 << 4));
        }
    }
}
