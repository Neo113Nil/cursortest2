package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;

/* loaded from: classes11.dex */
public abstract class tnb1 {
    public static int a(int i, byte[] bArr) {
        return ((bArr[i + 2] & 255) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    public static int b(int i, byte[] bArr) {
        return (bArr[i + 3] << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static void c(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    public static void d(long j, int i, byte[] bArr) {
        c((int) j, i, bArr);
        int i2 = (int) (j >>> 32);
        bArr[i + 4] = (byte) i2;
        bArr[i + 5] = (byte) (i2 >>> 8);
        bArr[i + 6] = (byte) (i2 >>> 16);
    }

    public static final cz20 e(wp2 wp2Var, sls slsVar, fid fidVar, int i) {
        if ((i & 1) != 0) {
            wp2Var = AppColor$Palette.Fog;
        }
        if ((i & 2) != 0) {
            slsVar = (sls) ((bts) fidVar).m(c3z.a);
        }
        boolean z = (i & 4) != 0;
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        if (Q == did.a) {
            Q = new cz20(wp2Var, slsVar, z, 8);
            btsVar.o0(Q);
        }
        return (cz20) Q;
    }

    public static final zry0 f(xry0 xry0Var) {
        return new zry0(xry0Var.c, xry0Var.d, xry0Var.h, xry0Var.n);
    }
}
