package defpackage;

/* loaded from: classes.dex */
public final class eb1 extends defpackage.ce1 implements defpackage.k00 {
    public final /* synthetic */ defpackage.sl0 DFo87pBq1E5;
    public final /* synthetic */ defpackage.k00 JlrlGoKF;
    public int SH1y5HwkJhh;
    public /* synthetic */ java.lang.Object ez2rX8ReCYw;
    public final /* synthetic */ int riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eb1(defpackage.k00 k00Var, defpackage.sl0 sl0Var, defpackage.ej ejVar, int i) {
        super(2, ejVar);
        this.riuEU0zW4 = i;
        this.JlrlGoKF = k00Var;
        this.DFo87pBq1E5 = sl0Var;
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        defpackage.sl0 sl0Var = this.DFo87pBq1E5;
        defpackage.k00 k00Var = this.JlrlGoKF;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        switch (i) {
            case 0:
                int i2 = this.SH1y5HwkJhh;
                if (i2 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.xx0 xx0Var = new defpackage.xx0(sl0Var, ((defpackage.uj) this.ez2rX8ReCYw).AARZUJiTa());
                    this.SH1y5HwkJhh = 1;
                    if (k00Var.adDC3e2L(xx0Var, this) == vjVar) {
                        break;
                    }
                } else if (i2 != 1) {
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    defpackage.f70.nBH8hAHy(obj);
                    break;
                }
                break;
            case 1:
                int i3 = this.SH1y5HwkJhh;
                if (i3 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.xx0 xx0Var2 = new defpackage.xx0(sl0Var, ((defpackage.uj) this.ez2rX8ReCYw).AARZUJiTa());
                    this.SH1y5HwkJhh = 1;
                    if (k00Var.adDC3e2L(xx0Var2, this) == vjVar) {
                        break;
                    }
                } else if (i3 != 1) {
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    defpackage.f70.nBH8hAHy(obj);
                    break;
                }
                break;
            default:
                int i4 = this.SH1y5HwkJhh;
                if (i4 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.xx0 xx0Var3 = new defpackage.xx0(sl0Var, ((defpackage.uj) this.ez2rX8ReCYw).AARZUJiTa());
                    this.SH1y5HwkJhh = 1;
                    if (k00Var.adDC3e2L(xx0Var3, this) == vjVar) {
                        break;
                    }
                } else if (i4 != 1) {
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    defpackage.f70.nBH8hAHy(obj);
                    break;
                }
                break;
        }
        return vjVar;
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        defpackage.uj ujVar = (defpackage.uj) obj;
        defpackage.ej ejVar = (defpackage.ej) obj2;
        switch (i) {
        }
        return ((defpackage.eb1) ez2rX8ReCYw(ejVar, ujVar)).SyNS6RMn(ok1Var);
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        switch (this.riuEU0zW4) {
            case 0:
                defpackage.eb1 eb1Var = new defpackage.eb1(this.JlrlGoKF, this.DFo87pBq1E5, ejVar, 0);
                eb1Var.ez2rX8ReCYw = obj;
                return eb1Var;
            case 1:
                defpackage.eb1 eb1Var2 = new defpackage.eb1(this.JlrlGoKF, this.DFo87pBq1E5, ejVar, 1);
                eb1Var2.ez2rX8ReCYw = obj;
                return eb1Var2;
            default:
                defpackage.eb1 eb1Var3 = new defpackage.eb1(this.JlrlGoKF, this.DFo87pBq1E5, ejVar, 2);
                eb1Var3.ez2rX8ReCYw = obj;
                return eb1Var3;
        }
    }
}
