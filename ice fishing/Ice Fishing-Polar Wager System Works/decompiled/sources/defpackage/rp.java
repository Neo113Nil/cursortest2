package defpackage;

/* loaded from: classes.dex */
public final class rp extends defpackage.ce1 implements defpackage.k00 {
    public final /* synthetic */ java.lang.Object JlrlGoKF;
    public int SH1y5HwkJhh;
    public final /* synthetic */ int ez2rX8ReCYw;
    public final /* synthetic */ int riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rp(java.lang.Object obj, int i, defpackage.ej ejVar, int i2) {
        super(2, ejVar);
        this.riuEU0zW4 = i2;
        this.JlrlGoKF = obj;
        this.ez2rX8ReCYw = i;
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        int i = this.riuEU0zW4;
        int i2 = this.ez2rX8ReCYw;
        java.lang.Object obj2 = this.JlrlGoKF;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        switch (i) {
            case 0:
                int i3 = this.SH1y5HwkJhh;
                if (i3 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.sp spVar = (defpackage.sp) obj2;
                    defpackage.c1NqjJifC7 c1nqjjifc7 = spVar.AARZUJiTa;
                    defpackage.qp qpVar = new defpackage.qp(spVar, i2, null);
                    this.SH1y5HwkJhh = 1;
                    if (c1nqjjifc7.SH1y5HwkJhh(this, qpVar) == vjVar) {
                    }
                } else if (i3 != 1) {
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    defpackage.f70.nBH8hAHy(obj);
                }
                break;
            default:
                int i4 = this.SH1y5HwkJhh;
                if (i4 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.gc0 gc0Var = ((defpackage.kc0) obj2).fnWB2E7cs;
                    this.SH1y5HwkJhh = 1;
                    defpackage.yc0 yc0Var = gc0Var.oh6vYeIP;
                    defpackage.F7NU4MC0GW f7nu4mc0gw = defpackage.yc0.abhbClRa;
                    yc0Var.getClass();
                    java.lang.Object F7NU4MC0GW = yc0Var.F7NU4MC0GW(defpackage.am0.adDC3e2L, new defpackage.ExFEDwBK(yc0Var, i2, (defpackage.ej) null), this);
                    if (F7NU4MC0GW != vjVar) {
                        F7NU4MC0GW = ok1Var;
                    }
                    if (F7NU4MC0GW != vjVar) {
                        F7NU4MC0GW = ok1Var;
                    }
                    if (F7NU4MC0GW == vjVar) {
                    }
                } else if (i4 != 1) {
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    defpackage.f70.nBH8hAHy(obj);
                }
                break;
        }
        return ok1Var;
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        defpackage.uj ujVar = (defpackage.uj) obj;
        defpackage.ej ejVar = (defpackage.ej) obj2;
        switch (i) {
        }
        return ((defpackage.rp) ez2rX8ReCYw(ejVar, ujVar)).SyNS6RMn(ok1Var);
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        int i = this.riuEU0zW4;
        int i2 = this.ez2rX8ReCYw;
        java.lang.Object obj2 = this.JlrlGoKF;
        switch (i) {
            case 0:
                return new defpackage.rp((defpackage.sp) obj2, i2, ejVar, 0);
            default:
                return new defpackage.rp((defpackage.kc0) obj2, i2, ejVar, 1);
        }
    }
}
