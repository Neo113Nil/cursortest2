package defpackage;

/* loaded from: classes.dex */
public final class d4 extends defpackage.p90 implements defpackage.l00 {
    public final /* synthetic */ java.lang.Object AARZUJiTa;
    public final /* synthetic */ defpackage.p4 EXtogiMhuM;
    public final /* synthetic */ defpackage.sf riuEU0zW4;
    public final /* synthetic */ defpackage.gb1 xiZrDbcSW0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(defpackage.gb1 gb1Var, java.lang.Object obj, defpackage.p4 p4Var, defpackage.sf sfVar) {
        super(3);
        this.xiZrDbcSW0 = gb1Var;
        this.AARZUJiTa = obj;
        this.EXtogiMhuM = p4Var;
        this.riuEU0zW4 = sfVar;
    }

    @Override // defpackage.l00
    public final java.lang.Object F7NU4MC0GW(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        defpackage.w4 w4Var = (defpackage.w4) obj;
        defpackage.t10 t10Var = (defpackage.t10) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= (intValue & 8) == 0 ? t10Var.xiZrDbcSW0(w4Var) : t10Var.EXtogiMhuM(w4Var) ? 4 : 2;
        }
        if (t10Var.lpprD5VAS(intValue & 1, (intValue & 19) != 18)) {
            defpackage.gb1 gb1Var = this.xiZrDbcSW0;
            boolean xiZrDbcSW0 = t10Var.xiZrDbcSW0(gb1Var);
            java.lang.Object obj4 = this.AARZUJiTa;
            boolean EXtogiMhuM = xiZrDbcSW0 | t10Var.EXtogiMhuM(obj4);
            defpackage.p4 p4Var = this.EXtogiMhuM;
            boolean EXtogiMhuM2 = EXtogiMhuM | t10Var.EXtogiMhuM(p4Var);
            java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
            defpackage.ad1 ad1Var = defpackage.bh.IHQe1A4L2xu;
            if (EXtogiMhuM2 || mAr5m2L7gYDP == ad1Var) {
                mAr5m2L7gYDP = new defpackage.c4(gb1Var, obj4, p4Var, 0);
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
            }
            defpackage.s21.oh6vYeIP(w4Var, (defpackage.g00) mAr5m2L7gYDP, t10Var);
            defpackage.nl0 nl0Var = p4Var.F7NU4MC0GW;
            w4Var.getClass();
            nl0Var.DFo87pBq1E5(obj4, ((defpackage.x4) w4Var).IHQe1A4L2xu);
            java.lang.Object mAr5m2L7gYDP2 = t10Var.mAr5m2L7gYDP();
            if (mAr5m2L7gYDP2 == ad1Var) {
                mAr5m2L7gYDP2 = new defpackage.j4();
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP2);
            }
            this.riuEU0zW4.riuEU0zW4((defpackage.j4) mAr5m2L7gYDP2, obj4, t10Var, 0);
        } else {
            t10Var.WLpAkxCo();
        }
        return defpackage.ok1.IHQe1A4L2xu;
    }
}
