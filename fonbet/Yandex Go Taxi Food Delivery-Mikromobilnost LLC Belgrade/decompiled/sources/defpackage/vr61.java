package defpackage;

import ru.CryptoPro.pc_0.pc_1.cl_0;

/* loaded from: classes4.dex */
public final class vr61 {
    public static final nq61 a;

    static {
        int i;
        int i2;
        byte[] bArr = new byte[128];
        int i3 = 0;
        for (int i4 = 0; i4 < 128; i4++) {
            bArr[i4] = -1;
        }
        for (int i5 = 65; i5 <= 90; i5++) {
            bArr[i5] = (byte) (i5 - 65);
        }
        for (int i6 = 97; i6 <= 122; i6++) {
            bArr[i6] = (byte) (i6 - 71);
        }
        for (int i7 = 48; i7 <= 57; i7++) {
            bArr[i7] = (byte) (i7 + 4);
        }
        bArr[43] = 62;
        bArr[47] = 63;
        bArr[61] = Byte.MAX_VALUE;
        char[] cArr = new char[64];
        while (true) {
            i = 26;
            if (i3 >= 26) {
                break;
            }
            cArr[i3] = (char) (i3 + 65);
            i3++;
        }
        while (true) {
            if (i >= 52) {
                break;
            }
            cArr[i] = (char) (i + 71);
            i++;
        }
        for (i2 = 52; i2 < 62; i2++) {
            cArr[i2] = (char) (i2 - 4);
        }
        cArr[62] = '+';
        cArr[63] = '/';
        try {
            int i8 = nq61.a;
            a = new nq61();
        } catch (cl_0 e) {
            throw new Error(e);
        }
    }
}
