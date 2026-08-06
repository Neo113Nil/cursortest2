package defpackage;

/* loaded from: classes.dex */
public final class gi extends defpackage.hi {
    public final float[] AARZUJiTa;
    public final defpackage.d21 adDC3e2L;
    public final defpackage.d21 xiZrDbcSW0;

    public gi(defpackage.d21 d21Var, defpackage.d21 d21Var2) {
        super(d21Var2, d21Var, d21Var2, null);
        float[] mAr5m2L7gYDP;
        this.adDC3e2L = d21Var;
        this.xiZrDbcSW0 = d21Var2;
        float[] fArr = (float[]) defpackage.c1NqjJifC7.AARZUJiTa.xiZrDbcSW0;
        defpackage.kn1 kn1Var = d21Var.F7NU4MC0GW;
        float[] fArr2 = d21Var.riuEU0zW4;
        defpackage.kn1 kn1Var2 = d21Var2.F7NU4MC0GW;
        float[] fArr3 = d21Var2.SH1y5HwkJhh;
        if (defpackage.ci0.G3OKOH3wZRC(kn1Var, kn1Var2)) {
            mAr5m2L7gYDP = defpackage.ci0.mAr5m2L7gYDP(fArr3, fArr2);
        } else {
            float[] IHQe1A4L2xu = kn1Var.IHQe1A4L2xu();
            float[] IHQe1A4L2xu2 = kn1Var2.IHQe1A4L2xu();
            defpackage.kn1 kn1Var3 = defpackage.mj1.riuEU0zW4;
            mAr5m2L7gYDP = defpackage.ci0.mAr5m2L7gYDP(defpackage.ci0.G3OKOH3wZRC(kn1Var2, kn1Var3) ? fArr3 : defpackage.ci0.yIx6ChFVk(defpackage.ci0.mAr5m2L7gYDP(defpackage.ci0.QoRHpC4k(fArr, IHQe1A4L2xu2, new float[]{0.964212f, 1.0f, 0.825188f}), d21Var2.riuEU0zW4)), defpackage.ci0.G3OKOH3wZRC(kn1Var, kn1Var3) ? fArr2 : defpackage.ci0.mAr5m2L7gYDP(defpackage.ci0.QoRHpC4k(fArr, IHQe1A4L2xu, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.AARZUJiTa = mAr5m2L7gYDP;
    }

    @Override // defpackage.hi
    public final long IHQe1A4L2xu(long j) {
        float EXtogiMhuM = defpackage.ae.EXtogiMhuM(j);
        float AARZUJiTa = defpackage.ae.AARZUJiTa(j);
        float adDC3e2L = defpackage.ae.adDC3e2L(j);
        float F7NU4MC0GW = defpackage.ae.F7NU4MC0GW(j);
        defpackage.z11 z11Var = this.adDC3e2L.QoRHpC4k;
        float r1MBDhnF = (float) z11Var.r1MBDhnF(EXtogiMhuM);
        float r1MBDhnF2 = (float) z11Var.r1MBDhnF(AARZUJiTa);
        float r1MBDhnF3 = (float) z11Var.r1MBDhnF(adDC3e2L);
        float[] fArr = this.AARZUJiTa;
        float f = (fArr[6] * r1MBDhnF3) + (fArr[3] * r1MBDhnF2) + (fArr[0] * r1MBDhnF);
        float f2 = (fArr[7] * r1MBDhnF3) + (fArr[4] * r1MBDhnF2) + (fArr[1] * r1MBDhnF);
        float f3 = (fArr[8] * r1MBDhnF3) + (fArr[5] * r1MBDhnF2) + (fArr[2] * r1MBDhnF);
        defpackage.d21 d21Var = this.xiZrDbcSW0;
        float r1MBDhnF4 = (float) d21Var.DFo87pBq1E5.r1MBDhnF(f);
        defpackage.z11 z11Var2 = d21Var.DFo87pBq1E5;
        return defpackage.w70.r1MBDhnF(r1MBDhnF4, (float) z11Var2.r1MBDhnF(f2), (float) z11Var2.r1MBDhnF(f3), F7NU4MC0GW, d21Var);
    }
}
