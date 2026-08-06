package defpackage;

/* loaded from: classes.dex */
public final class ez2rX8ReCYw extends defpackage.ce1 implements defpackage.k00 {
    public final /* synthetic */ defpackage.px0 JlrlGoKF;
    public int SH1y5HwkJhh;
    public final /* synthetic */ defpackage.dd ez2rX8ReCYw;
    public final /* synthetic */ int riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ez2rX8ReCYw(defpackage.dd ddVar, defpackage.px0 px0Var, defpackage.ej ejVar, int i) {
        super(2, ejVar);
        this.riuEU0zW4 = i;
        this.ez2rX8ReCYw = ddVar;
        this.JlrlGoKF = px0Var;
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        defpackage.px0 px0Var = this.JlrlGoKF;
        defpackage.dd ddVar = this.ez2rX8ReCYw;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        switch (i) {
            case 0:
                int i2 = this.SH1y5HwkJhh;
                if (i2 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.zk0 zk0Var = ddVar.kNAkVymC;
                    if (zk0Var != null) {
                        defpackage.ox0 ox0Var = new defpackage.ox0(px0Var);
                        this.SH1y5HwkJhh = 1;
                        if (zk0Var.IHQe1A4L2xu(ox0Var, this) == vjVar) {
                            break;
                        }
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
                    defpackage.zk0 zk0Var2 = ddVar.kNAkVymC;
                    if (zk0Var2 != null) {
                        defpackage.ox0 ox0Var2 = new defpackage.ox0(px0Var);
                        this.SH1y5HwkJhh = 1;
                        if (zk0Var2.IHQe1A4L2xu(ox0Var2, this) == vjVar) {
                            break;
                        }
                    }
                } else if (i3 != 1) {
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    defpackage.f70.nBH8hAHy(obj);
                    break;
                }
                break;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                int i4 = this.SH1y5HwkJhh;
                if (i4 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.zk0 zk0Var3 = ddVar.kNAkVymC;
                    if (zk0Var3 != null) {
                        this.SH1y5HwkJhh = 1;
                        if (zk0Var3.IHQe1A4L2xu(px0Var, this) == vjVar) {
                            break;
                        }
                    }
                } else if (i4 != 1) {
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    defpackage.f70.nBH8hAHy(obj);
                    break;
                }
                break;
            default:
                int i5 = this.SH1y5HwkJhh;
                if (i5 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.zk0 zk0Var4 = ddVar.kNAkVymC;
                    if (zk0Var4 != null) {
                        defpackage.qx0 qx0Var = new defpackage.qx0(px0Var);
                        this.SH1y5HwkJhh = 1;
                        if (zk0Var4.IHQe1A4L2xu(qx0Var, this) == vjVar) {
                            break;
                        }
                    }
                } else if (i5 != 1) {
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
        return ((defpackage.ez2rX8ReCYw) ez2rX8ReCYw(ejVar, ujVar)).SyNS6RMn(ok1Var);
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        int i = this.riuEU0zW4;
        defpackage.px0 px0Var = this.JlrlGoKF;
        defpackage.dd ddVar = this.ez2rX8ReCYw;
        switch (i) {
            case 0:
                return new defpackage.ez2rX8ReCYw(ddVar, px0Var, ejVar, 0);
            case 1:
                return new defpackage.ez2rX8ReCYw(ddVar, px0Var, ejVar, 1);
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                return new defpackage.ez2rX8ReCYw(ddVar, px0Var, ejVar, 2);
            default:
                return new defpackage.ez2rX8ReCYw(ddVar, px0Var, ejVar, 3);
        }
    }
}
