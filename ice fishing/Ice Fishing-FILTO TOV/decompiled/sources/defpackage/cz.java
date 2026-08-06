package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class cz implements Runnable {
    public final /* synthetic */ ih AvO7iQsrTN;
    public Runnable EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS = 1;

    public cz(n9 n9Var, dz dzVar) {
        this.EljAMC1QTz = n9Var;
        this.AvO7iQsrTN = dzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.OOA6hdeuvCS;
        ih ihVar = this.AvO7iQsrTN;
        switch (i) {
            case 0:
                ((n9) this.EljAMC1QTz).eUH21U3apd((dz) ihVar);
                break;
            default:
                da0 da0Var = (da0) ihVar;
                ih ihVar2 = da0Var.encWxUiV2;
                int i2 = 0;
                while (true) {
                    try {
                        this.EljAMC1QTz.run();
                    } catch (Throwable th) {
                        rj0.pog2g9KITJA(vp.OOA6hdeuvCS, th);
                    }
                    Runnable JFJ3QoxA = da0Var.JFJ3QoxA();
                    if (JFJ3QoxA != null) {
                        this.EljAMC1QTz = JFJ3QoxA;
                        i2++;
                        if (i2 >= 16 && ihVar2.EljAMC1QTz(da0Var)) {
                            ihVar2.OOA6hdeuvCS(da0Var, this);
                            break;
                        }
                    } else {
                        break;
                    }
                }
                break;
        }
    }

    public cz(da0 da0Var, Runnable runnable) {
        this.AvO7iQsrTN = da0Var;
        this.EljAMC1QTz = runnable;
    }
}
