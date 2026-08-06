package defpackage;

/* loaded from: classes.dex */
public final class ae0 extends defpackage.vm1 {
    public final defpackage.xk0 oh6vYeIP;

    public ae0() {
        defpackage.xk0 xk0Var = defpackage.y60.IHQe1A4L2xu;
        this.oh6vYeIP = new defpackage.xk0();
    }

    @Override // defpackage.vm1
    public final void F7NU4MC0GW() {
        defpackage.xk0 xk0Var = this.oh6vYeIP;
        int[] iArr = xk0Var.oh6vYeIP;
        java.lang.Object[] objArr = xk0Var.r1MBDhnF;
        long[] jArr = xk0Var.IHQe1A4L2xu;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        defpackage.gl0 gl0Var = (defpackage.gl0) objArr[i4];
                        java.lang.Object[] objArr2 = gl0Var.IHQe1A4L2xu;
                        int i6 = gl0Var.oh6vYeIP;
                        for (int i7 = 0; i7 < i6; i7++) {
                            defpackage.zd0 zd0Var = (defpackage.zd0) objArr2[i7];
                            defpackage.eb ebVar = zd0Var.F7NU4MC0GW;
                            if (ebVar != null) {
                                ebVar.cancel();
                            }
                            zd0Var.F7NU4MC0GW = null;
                            defpackage.mg0 mg0Var = (defpackage.mg0) zd0Var.IHQe1A4L2xu.xiZrDbcSW0;
                            mg0Var.xiZrDbcSW0 = true;
                            mg0Var.adDC3e2L = false;
                            mg0Var.IHQe1A4L2xu();
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
