package defpackage;

/* loaded from: classes.dex */
public final class xg extends defpackage.p90 implements defpackage.k00 {
    public final /* synthetic */ defpackage.zg AARZUJiTa;
    public final /* synthetic */ defpackage.v0 EXtogiMhuM;
    public final /* synthetic */ defpackage.k00 riuEU0zW4;
    public final /* synthetic */ int xiZrDbcSW0 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg(defpackage.v0 v0Var, defpackage.zg zgVar, defpackage.k00 k00Var) {
        super(2);
        this.EXtogiMhuM = v0Var;
        this.AARZUJiTa = zgVar;
        this.riuEU0zW4 = k00Var;
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.xiZrDbcSW0;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        defpackage.k00 k00Var = this.riuEU0zW4;
        defpackage.v0 v0Var = this.EXtogiMhuM;
        defpackage.zg zgVar = this.AARZUJiTa;
        switch (i) {
            case 0:
                defpackage.t10 t10Var = (defpackage.t10) obj;
                int intValue = ((java.lang.Number) obj2).intValue();
                if (!t10Var.lpprD5VAS(intValue & 1, (intValue & 3) != 2)) {
                    t10Var.WLpAkxCo();
                    break;
                } else {
                    t10Var.AsxAYCCkb3Hi(866651995);
                    defpackage.ph.IHQe1A4L2xu(v0Var, zgVar.ez2rX8ReCYw, k00Var, t10Var, 0);
                    t10Var.QoRHpC4k(false);
                    break;
                }
            default:
                ((java.lang.Number) obj2).intValue();
                zgVar.IHQe1A4L2xu(v0Var, k00Var, (defpackage.t10) obj, defpackage.a70.hyxIchWRW(1));
                break;
        }
        return ok1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg(defpackage.zg zgVar, defpackage.v0 v0Var, defpackage.k00 k00Var, int i) {
        super(2);
        this.AARZUJiTa = zgVar;
        this.EXtogiMhuM = v0Var;
        this.riuEU0zW4 = k00Var;
    }
}
