package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class vg1 implements defpackage.g00 {
    public final /* synthetic */ java.lang.Object AARZUJiTa;
    public final /* synthetic */ java.lang.Object EXtogiMhuM;
    public final /* synthetic */ int adDC3e2L = 0;
    public final /* synthetic */ float xiZrDbcSW0;

    public /* synthetic */ vg1(defpackage.bv0 bv0Var, defpackage.xg1 xg1Var, float f) {
        this.AARZUJiTa = bv0Var;
        this.EXtogiMhuM = xg1Var;
        this.xiZrDbcSW0 = f;
    }

    @Override // defpackage.g00
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        int i = this.adDC3e2L;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        java.lang.Object obj2 = this.EXtogiMhuM;
        float f = this.xiZrDbcSW0;
        java.lang.Object obj3 = this.AARZUJiTa;
        switch (i) {
            case 0:
                defpackage.bv0 bv0Var = (defpackage.bv0) obj3;
                defpackage.av0 av0Var = (defpackage.av0) obj;
                defpackage.w3 w3Var = ((defpackage.xg1) obj2).PAEGRtP0bX;
                defpackage.av0.JlrlGoKF(av0Var, bv0Var, w3Var != null ? (int) ((java.lang.Number) w3Var.F7NU4MC0GW()).floatValue() : (int) f, 0);
                break;
            default:
                defpackage.el1 el1Var = (defpackage.el1) obj3;
                defpackage.g00 g00Var = (defpackage.g00) obj2;
                long longValue = ((java.lang.Long) obj).longValue();
                if (el1Var.oh6vYeIP == Long.MIN_VALUE) {
                    el1Var.oh6vYeIP = longValue;
                }
                float f2 = el1Var.adDC3e2L;
                defpackage.e5 e5Var = new defpackage.e5(f2);
                defpackage.e5 e5Var2 = defpackage.el1.xiZrDbcSW0;
                long oh6vYeIP = f == 0.0f ? el1Var.IHQe1A4L2xu.oh6vYeIP(new defpackage.e5(f2), e5Var2, el1Var.r1MBDhnF) : defpackage.ci0.WLpAkxCo((longValue - el1Var.oh6vYeIP) / f);
                float f3 = ((defpackage.e5) el1Var.IHQe1A4L2xu.cnag84Bm(oh6vYeIP, e5Var, e5Var2, el1Var.r1MBDhnF)).IHQe1A4L2xu;
                el1Var.r1MBDhnF = (defpackage.e5) el1Var.IHQe1A4L2xu.JlrlGoKF(oh6vYeIP, e5Var, e5Var2, el1Var.r1MBDhnF);
                el1Var.oh6vYeIP = longValue;
                float f4 = el1Var.adDC3e2L - f3;
                el1Var.adDC3e2L = f3;
                g00Var.AARZUJiTa(java.lang.Float.valueOf(f4));
                break;
        }
        return ok1Var;
    }

    public /* synthetic */ vg1(defpackage.el1 el1Var, float f, defpackage.g00 g00Var) {
        this.AARZUJiTa = el1Var;
        this.xiZrDbcSW0 = f;
        this.EXtogiMhuM = g00Var;
    }
}
