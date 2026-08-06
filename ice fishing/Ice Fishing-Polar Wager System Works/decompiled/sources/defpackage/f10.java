package defpackage;

/* loaded from: classes.dex */
public final class f10 extends defpackage.ce1 implements defpackage.k00 {
    public int SH1y5HwkJhh;
    public final /* synthetic */ defpackage.l10 ez2rX8ReCYw;
    public final /* synthetic */ int riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f10(int i, defpackage.ej ejVar, defpackage.l10 l10Var) {
        super(2, ejVar);
        this.riuEU0zW4 = i;
        this.ez2rX8ReCYw = l10Var;
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        int i = this.riuEU0zW4;
        defpackage.l10 l10Var = this.ez2rX8ReCYw;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        int i2 = 1;
        defpackage.ej ejVar = null;
        switch (i) {
            case 0:
                int i3 = this.SH1y5HwkJhh;
                if (i3 == 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    com.corsair.ledger.data.local.CorsairDatabase corsairDatabase = l10Var.IHQe1A4L2xu;
                    defpackage.rl rlVar = new defpackage.rl(l10Var, ejVar, i2);
                    this.SH1y5HwkJhh = 1;
                    if (defpackage.s70.WLpAkxCo(corsairDatabase, new defpackage.dddYo2RGJ(corsairDatabase, rlVar, ejVar, 3), this) == vjVar) {
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
                    this.SH1y5HwkJhh = 1;
                    java.lang.Object QPwENk36pDC = defpackage.fm.QPwENk36pDC(l10Var.F7NU4MC0GW, new defpackage.f10(0, ejVar, l10Var), this);
                    if (QPwENk36pDC != vjVar) {
                        QPwENk36pDC = ok1Var;
                    }
                    if (QPwENk36pDC == vjVar) {
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
        switch (i) {
            case 0:
                return ((defpackage.f10) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.uj) obj)).SyNS6RMn(ok1Var);
            default:
                return ((defpackage.f10) ez2rX8ReCYw((defpackage.ej) obj2, (defpackage.iw) obj)).SyNS6RMn(ok1Var);
        }
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        int i = this.riuEU0zW4;
        defpackage.l10 l10Var = this.ez2rX8ReCYw;
        switch (i) {
            case 0:
                return new defpackage.f10(0, ejVar, l10Var);
            default:
                return new defpackage.f10(1, ejVar, l10Var);
        }
    }
}
