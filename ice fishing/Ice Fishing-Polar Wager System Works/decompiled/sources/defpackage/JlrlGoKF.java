package defpackage;

/* loaded from: classes.dex */
public final class JlrlGoKF extends defpackage.ce1 implements defpackage.k00 {
    public final /* synthetic */ defpackage.dd SH1y5HwkJhh;
    public final /* synthetic */ int riuEU0zW4;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ JlrlGoKF(defpackage.dd ddVar, defpackage.ej ejVar, int i) {
        super(2, ejVar);
        this.riuEU0zW4 = i;
        this.SH1y5HwkJhh = ddVar;
    }

    @Override // defpackage.v7
    public final java.lang.Object SyNS6RMn(java.lang.Object obj) {
        int i = this.riuEU0zW4;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        defpackage.ej ejVar = null;
        defpackage.dd ddVar = this.SH1y5HwkJhh;
        switch (i) {
            case 0:
                defpackage.f70.nBH8hAHy(obj);
                if (ddVar.D2vUnMij == null) {
                    defpackage.l40 l40Var = new defpackage.l40();
                    defpackage.zk0 zk0Var = ddVar.kNAkVymC;
                    if (zk0Var != null) {
                        defpackage.fm.SiPhmbmu(ddVar.dOmtpLcqqI1y(), null, new defpackage.adDC3e2L(zk0Var, l40Var, ejVar, 0), 3);
                    }
                    ddVar.D2vUnMij = l40Var;
                    break;
                }
                break;
            default:
                defpackage.f70.nBH8hAHy(obj);
                defpackage.l40 l40Var2 = ddVar.D2vUnMij;
                if (l40Var2 != null) {
                    defpackage.m40 m40Var = new defpackage.m40(l40Var2);
                    defpackage.zk0 zk0Var2 = ddVar.kNAkVymC;
                    if (zk0Var2 != null) {
                        defpackage.fm.SiPhmbmu(ddVar.dOmtpLcqqI1y(), null, new defpackage.adDC3e2L(zk0Var2, m40Var, ejVar, 1), 3);
                    }
                    ddVar.D2vUnMij = null;
                    break;
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
            case 0:
                ((defpackage.JlrlGoKF) ez2rX8ReCYw(ejVar, ujVar)).SyNS6RMn(ok1Var);
                break;
            default:
                ((defpackage.JlrlGoKF) ez2rX8ReCYw(ejVar, ujVar)).SyNS6RMn(ok1Var);
                break;
        }
        return ok1Var;
    }

    @Override // defpackage.v7
    public final defpackage.ej ez2rX8ReCYw(defpackage.ej ejVar, java.lang.Object obj) {
        int i = this.riuEU0zW4;
        defpackage.dd ddVar = this.SH1y5HwkJhh;
        switch (i) {
            case 0:
                return new defpackage.JlrlGoKF(ddVar, ejVar, 0);
            default:
                return new defpackage.JlrlGoKF(ddVar, ejVar, 1);
        }
    }
}
