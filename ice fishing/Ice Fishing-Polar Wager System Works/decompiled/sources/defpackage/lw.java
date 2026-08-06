package defpackage;

/* loaded from: classes.dex */
public final class lw extends defpackage.ce1 implements defpackage.k00 {
    public final /* synthetic */ defpackage.xx0 JlrlGoKF;
    public int SH1y5HwkJhh;
    public final /* synthetic */ defpackage.hw ez2rX8ReCYw;
    public final /* synthetic */ int riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lw(defpackage.hw hwVar, defpackage.xx0 xx0Var, defpackage.ej ejVar, int i) {
        super(2, ejVar);
        this.riuEU0zW4 = i;
        this.ez2rX8ReCYw = hwVar;
        this.JlrlGoKF = xx0Var;
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        defpackage.xx0 xx0Var = this.JlrlGoKF;
        defpackage.hw hwVar = this.ez2rX8ReCYw;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        switch (i) {
            case 0:
                int i2 = this.SH1y5HwkJhh;
                if (i2 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.kw kwVar = new defpackage.kw(xx0Var, 1);
                    this.SH1y5HwkJhh = 1;
                    if (hwVar.IHQe1A4L2xu(kwVar, this) == vjVar) {
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
            default:
                int i3 = this.SH1y5HwkJhh;
                if (i3 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.kw kwVar2 = new defpackage.kw(xx0Var, 3);
                    this.SH1y5HwkJhh = 1;
                    if (hwVar.IHQe1A4L2xu(kwVar2, this) == vjVar) {
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
        return ((defpackage.lw) ez2rX8ReCYw(ejVar, ujVar)).SyNS6RMn(ok1Var);
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        switch (this.riuEU0zW4) {
            case 0:
                return new defpackage.lw(this.ez2rX8ReCYw, this.JlrlGoKF, ejVar, 0);
            default:
                return new defpackage.lw(this.ez2rX8ReCYw, this.JlrlGoKF, ejVar, 1);
        }
    }
}
