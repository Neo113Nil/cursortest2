package defpackage;

/* loaded from: classes.dex */
public final class u1 extends defpackage.p90 implements defpackage.k00 {
    public final /* synthetic */ java.lang.Object AARZUJiTa;
    public final /* synthetic */ java.lang.Object EXtogiMhuM;
    public final /* synthetic */ defpackage.k00 riuEU0zW4;
    public final /* synthetic */ int xiZrDbcSW0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(defpackage.aq1 aq1Var, defpackage.zg zgVar, defpackage.k00 k00Var) {
        super(2);
        this.xiZrDbcSW0 = 2;
        this.AARZUJiTa = aq1Var;
        this.EXtogiMhuM = zgVar;
        this.riuEU0zW4 = k00Var;
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.xiZrDbcSW0;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        defpackage.k00 k00Var = this.riuEU0zW4;
        java.lang.Object obj3 = this.EXtogiMhuM;
        java.lang.Object obj4 = this.AARZUJiTa;
        int i2 = 1;
        switch (i) {
            case 0:
                ((java.lang.Number) obj2).intValue();
                defpackage.fm.xiZrDbcSW0((defpackage.vz) obj4, (defpackage.oo) obj3, (defpackage.sf) k00Var, (defpackage.t10) obj, defpackage.a70.hyxIchWRW(385));
                break;
            case 1:
                ((java.lang.Number) obj2).intValue();
                defpackage.ph.IHQe1A4L2xu((defpackage.ts0) obj4, (defpackage.ad1) obj3, k00Var, (defpackage.t10) obj, defpackage.a70.hyxIchWRW(1));
                break;
            default:
                defpackage.t10 t10Var = (defpackage.t10) obj;
                int intValue = ((java.lang.Number) obj2).intValue();
                defpackage.aq1 aq1Var = (defpackage.aq1) obj4;
                int i3 = 0;
                if (!t10Var.lpprD5VAS(intValue & 1, (intValue & 3) != 2)) {
                    t10Var.WLpAkxCo();
                    break;
                } else {
                    defpackage.v0 v0Var = aq1Var.adDC3e2L;
                    boolean EXtogiMhuM = t10Var.EXtogiMhuM(aq1Var);
                    java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
                    defpackage.ej ejVar = null;
                    defpackage.ad1 ad1Var = defpackage.bh.IHQe1A4L2xu;
                    if (EXtogiMhuM || mAr5m2L7gYDP == ad1Var) {
                        mAr5m2L7gYDP = new defpackage.zp1(aq1Var, ejVar, i3);
                        t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
                    }
                    defpackage.s21.AARZUJiTa((defpackage.k00) mAr5m2L7gYDP, t10Var, v0Var);
                    boolean EXtogiMhuM2 = t10Var.EXtogiMhuM(aq1Var);
                    java.lang.Object mAr5m2L7gYDP2 = t10Var.mAr5m2L7gYDP();
                    if (EXtogiMhuM2 || mAr5m2L7gYDP2 == ad1Var) {
                        mAr5m2L7gYDP2 = new defpackage.zp1(aq1Var, ejVar, i2);
                        t10Var.OtkytngK3Mr(mAr5m2L7gYDP2);
                    }
                    defpackage.s21.AARZUJiTa((defpackage.k00) mAr5m2L7gYDP2, t10Var, v0Var);
                    ((defpackage.zg) obj3).IHQe1A4L2xu(v0Var, k00Var, t10Var, 0);
                    break;
                }
        }
        return ok1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u1(java.lang.Object obj, java.lang.Object obj2, defpackage.k00 k00Var, int i, int i2) {
        super(2);
        this.xiZrDbcSW0 = i2;
        this.AARZUJiTa = obj;
        this.EXtogiMhuM = obj2;
        this.riuEU0zW4 = k00Var;
    }
}
