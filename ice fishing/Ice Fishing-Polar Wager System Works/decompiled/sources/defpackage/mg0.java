package defpackage;

/* loaded from: classes.dex */
public final class mg0 implements defpackage.u11 {
    public boolean AARZUJiTa;
    public boolean xiZrDbcSW0;
    public boolean adDC3e2L = true;
    public final defpackage.nl0 EXtogiMhuM = new defpackage.nl0();

    public final void IHQe1A4L2xu() {
        defpackage.nl0 nl0Var = this.EXtogiMhuM;
        java.lang.Object[] objArr = nl0Var.r1MBDhnF;
        long[] jArr = nl0Var.IHQe1A4L2xu;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            java.lang.Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof defpackage.gl0) {
                                defpackage.gl0 gl0Var = (defpackage.gl0) obj;
                                java.lang.Object[] objArr2 = gl0Var.IHQe1A4L2xu;
                                int i4 = gl0Var.oh6vYeIP;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    java.lang.Object obj2 = objArr2[i5];
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        nl0Var.IHQe1A4L2xu();
    }
}
