package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class pf0 implements defpackage.l00 {
    public final /* synthetic */ defpackage.g00 AARZUJiTa;
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ defpackage.rf0 xiZrDbcSW0;

    public /* synthetic */ pf0(defpackage.rf0 rf0Var, defpackage.g00 g00Var, int i) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = rf0Var;
        this.AARZUJiTa = g00Var;
    }

    @Override // defpackage.l00
    public final java.lang.Object F7NU4MC0GW(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int i = this.adDC3e2L;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        defpackage.g00 g00Var = this.AARZUJiTa;
        defpackage.rf0 rf0Var = this.xiZrDbcSW0;
        byte b = 0;
        switch (i) {
            case 0:
                defpackage.at0 at0Var = (defpackage.at0) obj;
                defpackage.t10 t10Var = (defpackage.t10) obj2;
                int intValue = ((java.lang.Integer) obj3).intValue();
                at0Var.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= t10Var.xiZrDbcSW0(at0Var) ? 4 : 2;
                }
                if (!t10Var.lpprD5VAS(intValue & 1, (intValue & 19) != 18)) {
                    t10Var.WLpAkxCo();
                    break;
                } else {
                    defpackage.mj0 mAr5m2L7gYDP = defpackage.s21.mAr5m2L7gYDP(defpackage.ba1.oh6vYeIP, at0Var);
                    defpackage.ct0 ct0Var = new defpackage.ct0(16.0f, 16.0f, 16.0f, 16.0f);
                    defpackage.i6 i6Var = new defpackage.i6(10.0f, true, new defpackage.e6(b, b));
                    boolean EXtogiMhuM = t10Var.EXtogiMhuM(rf0Var) | t10Var.xiZrDbcSW0(g00Var);
                    java.lang.Object mAr5m2L7gYDP2 = t10Var.mAr5m2L7gYDP();
                    if (EXtogiMhuM || mAr5m2L7gYDP2 == defpackage.bh.IHQe1A4L2xu) {
                        mAr5m2L7gYDP2 = new defpackage.r1MBDhnF(12, rf0Var, g00Var);
                        t10Var.OtkytngK3Mr(mAr5m2L7gYDP2);
                    }
                    defpackage.s70.IHQe1A4L2xu(mAr5m2L7gYDP, null, ct0Var, i6Var, null, null, false, null, (defpackage.g00) mAr5m2L7gYDP2, t10Var, 24960);
                    break;
                }
            default:
                defpackage.t10 t10Var2 = (defpackage.t10) obj2;
                int intValue2 = ((java.lang.Integer) obj3).intValue();
                ((defpackage.d9) obj).getClass();
                if (!t10Var2.lpprD5VAS(1 & intValue2, (intValue2 & 17) != 16)) {
                    t10Var2.WLpAkxCo();
                    break;
                } else {
                    long j = defpackage.ae.adDC3e2L;
                    java.util.WeakHashMap weakHashMap = defpackage.wo1.PAEGRtP0bX;
                    defpackage.x80.r1MBDhnF(null, null, null, null, null, 0, j, 0L, defpackage.c41.AARZUJiTa(t10Var2).JlrlGoKF, defpackage.h1.XZx205DYe(-1575226770, new defpackage.pf0(rf0Var, g00Var, b), t10Var2), t10Var2, 806879232);
                    break;
                }
        }
        return ok1Var;
    }
}
