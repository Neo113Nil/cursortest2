package defpackage;

/* loaded from: classes.dex */
public final class riuEU0zW4 extends defpackage.ce1 implements defpackage.k00 {
    public final /* synthetic */ defpackage.px0 JlrlGoKF;
    public int SH1y5HwkJhh;
    public final /* synthetic */ defpackage.zk0 ez2rX8ReCYw;
    public final /* synthetic */ int riuEU0zW4 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public riuEU0zW4(defpackage.zk0 zk0Var, defpackage.px0 px0Var, defpackage.ej ejVar) {
        super(2, ejVar);
        this.ez2rX8ReCYw = zk0Var;
        this.JlrlGoKF = px0Var;
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        defpackage.px0 px0Var = this.JlrlGoKF;
        defpackage.zk0 zk0Var = this.ez2rX8ReCYw;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        switch (i) {
            case 0:
                int i2 = this.SH1y5HwkJhh;
                if (i2 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.qx0 qx0Var = new defpackage.qx0(px0Var);
                    this.SH1y5HwkJhh = 1;
                    if (zk0Var.IHQe1A4L2xu(qx0Var, this) == vjVar) {
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
                    this.SH1y5HwkJhh = 1;
                    if (zk0Var.IHQe1A4L2xu(px0Var, this) == vjVar) {
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
        return ((defpackage.riuEU0zW4) ez2rX8ReCYw(ejVar, ujVar)).SyNS6RMn(ok1Var);
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        int i = this.riuEU0zW4;
        defpackage.px0 px0Var = this.JlrlGoKF;
        defpackage.zk0 zk0Var = this.ez2rX8ReCYw;
        switch (i) {
            case 0:
                return new defpackage.riuEU0zW4(px0Var, zk0Var, ejVar);
            default:
                return new defpackage.riuEU0zW4(zk0Var, px0Var, ejVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public riuEU0zW4(defpackage.px0 px0Var, defpackage.zk0 zk0Var, defpackage.ej ejVar) {
        super(2, ejVar);
        this.JlrlGoKF = px0Var;
        this.ez2rX8ReCYw = zk0Var;
    }
}
