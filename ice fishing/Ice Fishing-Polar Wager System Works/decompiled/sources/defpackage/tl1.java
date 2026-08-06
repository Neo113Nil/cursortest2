package defpackage;

/* loaded from: classes.dex */
public final class tl1 {
    public final float[] AARZUJiTa;
    public final float[] EXtogiMhuM;
    public final defpackage.dl[] F7NU4MC0GW;
    public final boolean IHQe1A4L2xu;
    public int adDC3e2L;
    public final defpackage.sl1 oh6vYeIP;
    public final int r1MBDhnF;
    public final float[] xiZrDbcSW0;

    public tl1(boolean z, defpackage.sl1 sl1Var) {
        int i;
        this.IHQe1A4L2xu = z;
        this.oh6vYeIP = sl1Var;
        if (z && sl1Var.equals(defpackage.sl1.adDC3e2L)) {
            defpackage.db.AARZUJiTa("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int ordinal = sl1Var.ordinal();
        if (ordinal == 0) {
            i = 3;
        } else {
            if (ordinal != 1) {
                defpackage.db.F7NU4MC0GW();
                throw null;
            }
            i = 2;
        }
        this.r1MBDhnF = i;
        this.F7NU4MC0GW = new defpackage.dl[20];
        this.xiZrDbcSW0 = new float[20];
        this.AARZUJiTa = new float[20];
        this.EXtogiMhuM = new float[3];
    }

    public final void IHQe1A4L2xu(long j, float f) {
        int i = (this.adDC3e2L + 1) % 20;
        this.adDC3e2L = i;
        defpackage.dl[] dlVarArr = this.F7NU4MC0GW;
        defpackage.dl dlVar = dlVarArr[i];
        if (dlVar != null) {
            dlVar.IHQe1A4L2xu = j;
            dlVar.oh6vYeIP = f;
        } else {
            defpackage.dl dlVar2 = new defpackage.dl();
            dlVar2.IHQe1A4L2xu = j;
            dlVar2.oh6vYeIP = f;
            dlVarArr[i] = dlVar2;
        }
    }

    public final float oh6vYeIP(float f) {
        defpackage.sl1 sl1Var;
        float[] fArr;
        float[] fArr2;
        float f2;
        boolean z;
        int i;
        float f3;
        float f4;
        float f5 = 0.0f;
        if (f <= 0.0f) {
            defpackage.x50.oh6vYeIP("maximumVelocity should be a positive value. You specified=" + f);
        }
        int i2 = this.adDC3e2L;
        defpackage.dl[] dlVarArr = this.F7NU4MC0GW;
        defpackage.dl dlVar = dlVarArr[i2];
        if (dlVar == null) {
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            int i3 = 0;
            defpackage.dl dlVar2 = dlVar;
            while (true) {
                defpackage.dl dlVar3 = dlVarArr[i2];
                boolean z2 = this.IHQe1A4L2xu;
                sl1Var = this.oh6vYeIP;
                fArr = this.xiZrDbcSW0;
                fArr2 = this.AARZUJiTa;
                if (dlVar3 != null) {
                    long j = dlVar.IHQe1A4L2xu;
                    f2 = f5;
                    int i4 = i2;
                    long j2 = dlVar3.IHQe1A4L2xu;
                    float f6 = j - j2;
                    z = z2;
                    i = 1;
                    float abs = java.lang.Math.abs(j2 - dlVar2.IHQe1A4L2xu);
                    dlVar2 = (sl1Var == defpackage.sl1.adDC3e2L || z) ? dlVar3 : dlVar;
                    if (f6 > 100.0f || abs > 40.0f) {
                        break;
                    }
                    fArr[i3] = dlVar3.oh6vYeIP;
                    fArr2[i3] = -f6;
                    i2 = (i4 == 0 ? 20 : i4) - 1;
                    i3++;
                    if (i3 >= 20) {
                        break;
                    }
                    f5 = f2;
                } else {
                    f2 = f5;
                    z = z2;
                    i = 1;
                    break;
                }
            }
            if (i3 >= this.r1MBDhnF) {
                int ordinal = sl1Var.ordinal();
                if (ordinal == 0) {
                    try {
                        float[] fArr3 = this.EXtogiMhuM;
                        defpackage.e90.PAEGRtP0bX(fArr2, fArr, i3, fArr3);
                        f4 = fArr3[1];
                    } catch (java.lang.IllegalArgumentException unused) {
                        f4 = f2;
                    }
                } else {
                    if (ordinal != i) {
                        defpackage.db.F7NU4MC0GW();
                        return f2;
                    }
                    int i5 = i3 - i;
                    float f7 = fArr2[i5];
                    int i6 = i5;
                    float f8 = f2;
                    while (i6 > 0) {
                        int i7 = i6 - 1;
                        float f9 = fArr2[i7];
                        if (f7 != f9) {
                            float f10 = (z ? -fArr[i7] : fArr[i6] - fArr[i7]) / (f7 - f9);
                            f8 += java.lang.Math.abs(f10) * (f10 - (java.lang.Math.signum(f8) * ((float) java.lang.Math.sqrt(java.lang.Math.abs(f8) * 2.0f))));
                            if (i6 == i5) {
                                f8 *= 0.5f;
                            }
                        }
                        i6--;
                        f7 = f9;
                    }
                    f4 = java.lang.Math.signum(f8) * ((float) java.lang.Math.sqrt(java.lang.Math.abs(f8) * 2.0f));
                }
                f3 = f4 * 1000.0f;
            } else {
                f3 = f2;
            }
        }
        if (f3 == f2 || java.lang.Float.isNaN(f3)) {
            return f2;
        }
        if (f3 <= f2) {
            float f11 = -f;
            if (f3 < f11) {
                return f11;
            }
        } else if (f3 > f) {
            f3 = f;
        }
        return f3;
    }

    public /* synthetic */ tl1() {
        this(false, defpackage.sl1.adDC3e2L);
    }

    public tl1(int i) {
        this(true, defpackage.sl1.xiZrDbcSW0);
    }
}
