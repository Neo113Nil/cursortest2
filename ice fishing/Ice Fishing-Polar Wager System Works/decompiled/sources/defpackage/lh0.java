package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class lh0 implements defpackage.l00 {
    public final /* synthetic */ defpackage.g00 AARZUJiTa;
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ defpackage.rh0 xiZrDbcSW0;

    public /* synthetic */ lh0(defpackage.rh0 rh0Var, defpackage.g00 g00Var, int i) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = rh0Var;
        this.AARZUJiTa = g00Var;
    }

    @Override // defpackage.l00
    public final java.lang.Object F7NU4MC0GW(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int i = this.adDC3e2L;
        defpackage.ad1 ad1Var = defpackage.bh.IHQe1A4L2xu;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        defpackage.g00 g00Var = this.AARZUJiTa;
        defpackage.rh0 rh0Var = this.xiZrDbcSW0;
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
                    defpackage.i6 i6Var = new defpackage.i6(12.0f, true, new defpackage.e6(b, b));
                    boolean EXtogiMhuM = t10Var.EXtogiMhuM(rh0Var) | t10Var.xiZrDbcSW0(g00Var);
                    java.lang.Object mAr5m2L7gYDP2 = t10Var.mAr5m2L7gYDP();
                    if (EXtogiMhuM || mAr5m2L7gYDP2 == ad1Var) {
                        mAr5m2L7gYDP2 = new defpackage.r1MBDhnF(13, rh0Var, g00Var);
                        t10Var.OtkytngK3Mr(mAr5m2L7gYDP2);
                    }
                    defpackage.s70.IHQe1A4L2xu(mAr5m2L7gYDP, null, ct0Var, i6Var, null, null, false, null, (defpackage.g00) mAr5m2L7gYDP2, t10Var, 24960);
                    break;
                }
            case 1:
                defpackage.t10 t10Var2 = (defpackage.t10) obj2;
                int intValue2 = ((java.lang.Integer) obj3).intValue();
                ((defpackage.hb0) obj).getClass();
                if (!t10Var2.lpprD5VAS(intValue2 & 1, (intValue2 & 17) != 16)) {
                    t10Var2.WLpAkxCo();
                    break;
                } else {
                    boolean z = rh0Var.AARZUJiTa;
                    java.lang.String str = z ? "Open daily chest" : "Daily chest";
                    java.lang.String concat = z ? null : "in ".concat(rh0Var.EXtogiMhuM);
                    defpackage.ov ovVar = defpackage.ba1.IHQe1A4L2xu;
                    boolean z2 = rh0Var.AARZUJiTa && !rh0Var.ez2rX8ReCYw;
                    boolean xiZrDbcSW0 = t10Var2.xiZrDbcSW0(g00Var);
                    java.lang.Object mAr5m2L7gYDP3 = t10Var2.mAr5m2L7gYDP();
                    if (xiZrDbcSW0 || mAr5m2L7gYDP3 == ad1Var) {
                        mAr5m2L7gYDP3 = new defpackage.bDeDBuv6ooq(g00Var, 4);
                        t10Var2.OtkytngK3Mr(mAr5m2L7gYDP3);
                    }
                    defpackage.gq1.adDC3e2L(str, (defpackage.vz) mAr5m2L7gYDP3, ovVar, z2, concat, t10Var2, 384, 0);
                    break;
                }
                break;
            default:
                defpackage.t10 t10Var3 = (defpackage.t10) obj2;
                int intValue3 = ((java.lang.Integer) obj3).intValue();
                ((defpackage.d9) obj).getClass();
                if (!t10Var3.lpprD5VAS(intValue3 & 1, (intValue3 & 17) != 16)) {
                    t10Var3.WLpAkxCo();
                    break;
                } else {
                    long j = defpackage.ae.adDC3e2L;
                    java.util.WeakHashMap weakHashMap = defpackage.wo1.PAEGRtP0bX;
                    defpackage.x80.r1MBDhnF(null, null, null, null, null, 0, j, 0L, defpackage.c41.AARZUJiTa(t10Var3).JlrlGoKF, defpackage.h1.XZx205DYe(-1615340130, new defpackage.lh0(rh0Var, g00Var, b), t10Var3), t10Var3, 806879232);
                    break;
                }
        }
        return ok1Var;
    }
}
