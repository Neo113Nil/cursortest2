package defpackage;

/* loaded from: classes.dex */
public final class wi extends defpackage.ce1 implements defpackage.k00 {
    public final /* synthetic */ defpackage.l9 DFo87pBq1E5;
    public final /* synthetic */ defpackage.yi JlrlGoKF;
    public /* synthetic */ java.lang.Object SH1y5HwkJhh;
    public final /* synthetic */ long SyNS6RMn;
    public final /* synthetic */ defpackage.u80 cnag84Bm;
    public final /* synthetic */ defpackage.el1 ez2rX8ReCYw;
    public int riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi(defpackage.el1 el1Var, defpackage.yi yiVar, defpackage.l9 l9Var, long j, defpackage.u80 u80Var, defpackage.ej ejVar) {
        super(2, ejVar);
        this.ez2rX8ReCYw = el1Var;
        this.JlrlGoKF = yiVar;
        this.DFo87pBq1E5 = l9Var;
        this.SyNS6RMn = j;
        this.cnag84Bm = u80Var;
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        int i = this.riuEU0zW4;
        if (i == 0) {
            defpackage.f70.nBH8hAHy(obj);
            defpackage.g61 g61Var = (defpackage.g61) this.SH1y5HwkJhh;
            long j = this.SyNS6RMn;
            defpackage.yi yiVar = this.JlrlGoKF;
            defpackage.l9 l9Var = this.DFo87pBq1E5;
            float UVjEelCZ = defpackage.yi.UVjEelCZ(yiVar, l9Var, j);
            defpackage.el1 el1Var = this.ez2rX8ReCYw;
            el1Var.adDC3e2L = UVjEelCZ;
            defpackage.vi viVar = new defpackage.vi(yiVar, el1Var, this.cnag84Bm, g61Var);
            defpackage.k7 k7Var = new defpackage.k7(yiVar, el1Var, l9Var, 2);
            this.riuEU0zW4 = 1;
            java.lang.Object IHQe1A4L2xu = el1Var.IHQe1A4L2xu(viVar, k7Var, this);
            defpackage.vj vjVar = defpackage.vj.adDC3e2L;
            if (IHQe1A4L2xu == vjVar) {
                return vjVar;
            }
        } else {
            if (i != 1) {
                defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            defpackage.f70.nBH8hAHy(obj);
        }
        return defpackage.ok1.IHQe1A4L2xu;
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.wi) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.g61) obj)).SyNS6RMn(defpackage.ok1.IHQe1A4L2xu);
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        defpackage.wi wiVar = new defpackage.wi(this.ez2rX8ReCYw, this.JlrlGoKF, this.DFo87pBq1E5, this.SyNS6RMn, this.cnag84Bm, ejVar);
        wiVar.SH1y5HwkJhh = obj;
        return wiVar;
    }
}
