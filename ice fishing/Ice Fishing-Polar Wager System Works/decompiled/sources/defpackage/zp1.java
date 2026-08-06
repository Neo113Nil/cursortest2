package defpackage;

/* loaded from: classes.dex */
public final class zp1 extends defpackage.ce1 implements defpackage.k00 {
    public int SH1y5HwkJhh;
    public final /* synthetic */ defpackage.aq1 ez2rX8ReCYw;
    public final /* synthetic */ int riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zp1(defpackage.aq1 aq1Var, defpackage.ej ejVar, int i) {
        super(2, ejVar);
        this.riuEU0zW4 = i;
        this.ez2rX8ReCYw = aq1Var;
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        int i = this.riuEU0zW4;
        defpackage.aq1 aq1Var = this.ez2rX8ReCYw;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        switch (i) {
            case 0:
                int i2 = this.SH1y5HwkJhh;
                if (i2 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.v0 v0Var = aq1Var.adDC3e2L;
                    this.SH1y5HwkJhh = 1;
                    java.lang.Object F7NU4MC0GW = v0Var.v5iciZok.F7NU4MC0GW(this);
                    if (F7NU4MC0GW != vjVar) {
                        F7NU4MC0GW = ok1Var;
                    }
                    if (F7NU4MC0GW == vjVar) {
                        break;
                    }
                } else if (i2 != 1) {
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    defpackage.f70.nBH8hAHy(obj);
                }
                break;
            default:
                int i3 = this.SH1y5HwkJhh;
                if (i3 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.v0 v0Var2 = aq1Var.adDC3e2L;
                    this.SH1y5HwkJhh = 1;
                    java.lang.Object IHQe1A4L2xu = v0Var2.D2vUnMij.IHQe1A4L2xu(this);
                    if (IHQe1A4L2xu != vjVar) {
                        IHQe1A4L2xu = ok1Var;
                    }
                    if (IHQe1A4L2xu == vjVar) {
                        break;
                    }
                } else if (i3 != 1) {
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    defpackage.f70.nBH8hAHy(obj);
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
        return ((defpackage.zp1) ez2rX8ReCYw(ejVar, ujVar)).SyNS6RMn(ok1Var);
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        int i = this.riuEU0zW4;
        defpackage.aq1 aq1Var = this.ez2rX8ReCYw;
        switch (i) {
            case 0:
                return new defpackage.zp1(aq1Var, ejVar, 0);
            default:
                return new defpackage.zp1(aq1Var, ejVar, 1);
        }
    }
}
