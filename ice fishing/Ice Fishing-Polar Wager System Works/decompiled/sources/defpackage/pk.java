package defpackage;

/* loaded from: classes.dex */
public final class pk extends defpackage.ce1 implements defpackage.k00 {
    public final /* synthetic */ defpackage.g00 DFo87pBq1E5;
    public final /* synthetic */ boolean JlrlGoKF;
    public final /* synthetic */ defpackage.q21 SH1y5HwkJhh;
    public final /* synthetic */ boolean ez2rX8ReCYw;
    public int riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk(defpackage.ej ejVar, defpackage.g00 g00Var, defpackage.q21 q21Var, boolean z, boolean z2) {
        super(2, ejVar);
        this.SH1y5HwkJhh = q21Var;
        this.ez2rX8ReCYw = z;
        this.JlrlGoKF = z2;
        this.DFo87pBq1E5 = g00Var;
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        int i = this.riuEU0zW4;
        if (i != 0) {
            if (i == 1) {
                defpackage.f70.nBH8hAHy(obj);
                return obj;
            }
            defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        defpackage.f70.nBH8hAHy(obj);
        defpackage.g00 g00Var = this.DFo87pBq1E5;
        defpackage.q21 q21Var = this.SH1y5HwkJhh;
        boolean z = this.JlrlGoKF;
        boolean z2 = this.ez2rX8ReCYw;
        defpackage.sk skVar = new defpackage.sk(null, g00Var, q21Var, z, z2);
        this.riuEU0zW4 = 1;
        java.lang.Object JlrlGoKF = q21Var.JlrlGoKF(z2, skVar, this);
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        return JlrlGoKF == vjVar ? vjVar : JlrlGoKF;
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        return ((defpackage.pk) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.uj) obj)).SyNS6RMn(defpackage.ok1.IHQe1A4L2xu);
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        return new defpackage.pk(ejVar, this.DFo87pBq1E5, this.SH1y5HwkJhh, this.ez2rX8ReCYw, this.JlrlGoKF);
    }
}
