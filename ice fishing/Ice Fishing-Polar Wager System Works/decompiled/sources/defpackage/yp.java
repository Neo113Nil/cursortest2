package defpackage;

/* loaded from: classes.dex */
public abstract class yp extends defpackage.ze1 {
    public int AARZUJiTa;

    public yp(int i) {
        super(0L, false);
        this.AARZUJiTa = i;
    }

    public final void EXtogiMhuM(java.lang.Throwable th) {
        defpackage.gq1.kNAkVymC(F7NU4MC0GW().xiZrDbcSW0(), new defpackage.yj("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract defpackage.ej F7NU4MC0GW();

    public java.lang.Throwable adDC3e2L(java.lang.Object obj) {
        defpackage.bf bfVar = obj instanceof defpackage.bf ? (defpackage.bf) obj : null;
        if (bfVar != null) {
            return bfVar.IHQe1A4L2xu;
        }
        return null;
    }

    public abstract java.lang.Object riuEU0zW4();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        r4 = (defpackage.u80) r5.cnag84Bm(defpackage.n.lpprD5VAS);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        try {
            defpackage.ej F7NU4MC0GW = F7NU4MC0GW();
            F7NU4MC0GW.getClass();
            defpackage.wp wpVar = (defpackage.wp) F7NU4MC0GW;
            defpackage.fj fjVar = wpVar.riuEU0zW4;
            java.lang.Object obj = wpVar.ez2rX8ReCYw;
            defpackage.lj xiZrDbcSW0 = fjVar.xiZrDbcSW0();
            java.lang.Object nVhUznk1t = defpackage.x70.nVhUznk1t(xiZrDbcSW0, obj);
            defpackage.u80 u80Var = null;
            defpackage.lk1 OtkytngK3Mr = nVhUznk1t != defpackage.x70.riuEU0zW4 ? defpackage.s21.OtkytngK3Mr(fjVar, xiZrDbcSW0, nVhUznk1t) : null;
            try {
                defpackage.lj xiZrDbcSW02 = fjVar.xiZrDbcSW0();
                java.lang.Object riuEU0zW4 = riuEU0zW4();
                java.lang.Throwable adDC3e2L = adDC3e2L(riuEU0zW4);
                if (adDC3e2L == null) {
                    int i = this.AARZUJiTa;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                }
                if (u80Var != null && !u80Var.oh6vYeIP()) {
                    java.util.concurrent.CancellationException kd6TUFXn = u80Var.kd6TUFXn();
                    oh6vYeIP(kd6TUFXn);
                    fjVar.SH1y5HwkJhh(defpackage.f70.riuEU0zW4(kd6TUFXn));
                } else if (adDC3e2L != null) {
                    fjVar.SH1y5HwkJhh(new defpackage.p11(adDC3e2L));
                } else {
                    fjVar.SH1y5HwkJhh(AARZUJiTa(riuEU0zW4));
                }
                if (OtkytngK3Mr != null && !OtkytngK3Mr.k3hcgHS3MP()) {
                    return;
                }
                defpackage.x70.hkbnNdmy(xiZrDbcSW0, nVhUznk1t);
            } catch (java.lang.Throwable th) {
                if (OtkytngK3Mr == null || OtkytngK3Mr.k3hcgHS3MP()) {
                    defpackage.x70.hkbnNdmy(xiZrDbcSW0, nVhUznk1t);
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            EXtogiMhuM(th2);
        }
    }

    public java.lang.Object AARZUJiTa(java.lang.Object obj) {
        return obj;
    }

    public void oh6vYeIP(java.util.concurrent.CancellationException cancellationException) {
    }
}
