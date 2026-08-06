package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class s21 extends le {
    public final E7jCp8Ls AvO7iQsrTN;
    public t01 EljAMC1QTz;
    public ig0 OOA6hdeuvCS;
    public Object X1lG3V04pd;
    public Object Yi7zF1RB1;
    public final el0 encWxUiV2;
    public ig0 xqGvceK5x;

    public s21() {
        super(1);
        this.AvO7iQsrTN = new E7jCp8Ls(19, this);
        k4 k4Var = new k4(11, this);
        e41.OOA6hdeuvCS(e41.GWasM1elztuh);
        synchronized (e41.X1lG3V04pd) {
            e41.encWxUiV2 = rb.gHe2tSmr6w(e41.encWxUiV2, k4Var);
        }
        this.encWxUiV2 = new el0(k4Var);
    }

    @Override // defpackage.le
    public final void OOA6hdeuvCS() {
        this.encWxUiV2.GWasM1elztuh();
        this.X1lG3V04pd = null;
        this.OOA6hdeuvCS = null;
        synchronized (this.GWasM1elztuh) {
            this.EljAMC1QTz = null;
            this.Yi7zF1RB1 = null;
            this.xqGvceK5x = null;
        }
    }

    @Override // defpackage.le
    public final void X1lG3V04pd(t01 t01Var) {
        this.X1lG3V04pd = null;
        this.OOA6hdeuvCS = null;
    }

    @Override // defpackage.le
    public final hv encWxUiV2(t01 t01Var) {
        t01 t01Var2 = this.EljAMC1QTz;
        if (t01Var2 != null && !t01Var2.equals(t01Var)) {
            tq0.Yi7zF1RB1("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.EljAMC1QTz = t01Var;
        return this.AvO7iQsrTN;
    }

    @Override // defpackage.le
    public final void mOu10nynGul(z9 z9Var) {
        this.EljAMC1QTz = null;
        this.X1lG3V04pd = null;
        this.OOA6hdeuvCS = null;
        xqGvceK5x();
    }

    @Override // defpackage.le
    public final void xqGvceK5x() {
        synchronized (this.GWasM1elztuh) {
            try {
                this.Yi7zF1RB1 = this.X1lG3V04pd;
                if (this.OOA6hdeuvCS == null) {
                    this.xqGvceK5x = null;
                } else {
                    if (this.xqGvceK5x == null) {
                        ig0 ig0Var = lx0.GWasM1elztuh;
                        this.xqGvceK5x = new ig0();
                    }
                    ig0 ig0Var2 = this.xqGvceK5x;
                    this.xqGvceK5x = this.OOA6hdeuvCS;
                    this.OOA6hdeuvCS = ig0Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
