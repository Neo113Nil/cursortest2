package defpackage;

import com.ybsdk.feature.autotopup.api.domain.model.PaymentMethodType;
import java.util.Arrays;
import ru.CryptoPro.JCSP.CSPVersionUtility;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes3.dex */
public abstract class ua91 {
    public static final int[] a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, CSPVersionUtility.CSP_BUILD_R2, 24000, 48000, -1, -1};
    public static final int[] c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, HProv.ALG_TYPE_BLOCK, 1920, 2048, 2304, HProv.ALG_TYPE_DH, 2688, 2816, 2823, 2944, HProv.ALG_TYPE_SECURECHANNEL, 3840, 4096, 6144, 7680};
    public static final int[] d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, CSPVersionUtility.CSP_BUILD_R2, 24000, 48000, 96000, 192000, 384000};
    public static final int[] e = {5, 8, 10, 12};
    public static final int[] f = {6, 9, 12, 15};
    public static final int[] g = {2, 4, 6, 8};
    public static final int[] h = {9, 11, 13, 16};
    public static final int[] i = {5, 8, 10, 12};

    public static final int a(int i2, ewi ewiVar) {
        return (int) (i2 * ewiVar.a);
    }

    public static df90 b(byte[] bArr) {
        byte[] bArr2;
        byte b2 = bArr[0];
        if (b2 == Byte.MAX_VALUE || b2 == 100 || b2 == 64 || b2 == 113) {
            return new df90(bArr, bArr.length);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        byte b3 = copyOf[0];
        if (b3 == -2 || b3 == -1 || b3 == 37 || b3 == -14 || b3 == -24) {
            for (int i2 = 0; i2 < copyOf.length - 1; i2 += 2) {
                byte b4 = copyOf[i2];
                int i3 = i2 + 1;
                copyOf[i2] = copyOf[i3];
                copyOf[i3] = b4;
            }
        }
        df90 df90Var = new df90(copyOf, copyOf.length);
        if (copyOf[0] == 31) {
            df90 df90Var2 = new df90(copyOf, copyOf.length);
            while (df90Var2.b() >= 16) {
                df90Var2.o(2);
                int g2 = df90Var2.g(14) & 16383;
                int min = Math.min(8 - df90Var.c, 14);
                int i4 = df90Var.c;
                int i5 = (8 - i4) - min;
                byte[] bArr3 = df90Var.a;
                int i6 = df90Var.b;
                byte b5 = (byte) (((65280 >> i4) | ((1 << i5) - 1)) & bArr3[i6]);
                bArr3[i6] = b5;
                int i7 = 14 - min;
                bArr3[i6] = (byte) (b5 | ((g2 >>> i7) << i5));
                int i8 = i6 + 1;
                while (true) {
                    bArr2 = df90Var.a;
                    if (i7 > 8) {
                        bArr2[i8] = (byte) (g2 >>> (i7 - 8));
                        i7 -= 8;
                        i8++;
                    }
                }
                int i9 = 8 - i7;
                byte b6 = (byte) (bArr2[i8] & ((1 << i9) - 1));
                bArr2[i8] = b6;
                bArr2[i8] = (byte) (((g2 & ((1 << i7) - 1)) << i9) | b6);
                df90Var.o(14);
                df90Var.a();
            }
        }
        df90Var.k(copyOf.length, copyOf);
        return df90Var;
    }

    public static int c(df90 df90Var, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && df90Var.f(); i3++) {
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += 1 << iArr[i5];
        }
        return df90Var.g(iArr[i2]) + i4;
    }

    public static final l5a0 d(h5a0 h5a0Var) {
        PaymentMethodType paymentMethodType;
        if (h5a0Var instanceof e5a0) {
            paymentMethodType = PaymentMethodType.Me2Me;
        } else if (h5a0Var instanceof f5a0) {
            paymentMethodType = PaymentMethodType.SavingsAccount;
        } else if (h5a0Var instanceof c5a0) {
            paymentMethodType = PaymentMethodType.Card;
        } else {
            if (!(h5a0Var instanceof g5a0)) {
                w511.b();
                return null;
            }
            paymentMethodType = PaymentMethodType.YandexAccount;
        }
        return new l5a0(h5a0Var.getId(), paymentMethodType);
    }
}
