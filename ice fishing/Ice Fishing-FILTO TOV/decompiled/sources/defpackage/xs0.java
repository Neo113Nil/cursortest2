package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class xs0 extends y31 {
    public int EljAMC1QTz;
    public final hv OOA6hdeuvCS;

    public xs0(long j, c41 c41Var, hv hvVar) {
        super(j, c41Var);
        this.OOA6hdeuvCS = hvVar;
        this.EljAMC1QTz = 1;
    }

    @Override // defpackage.y31
    public final void E7jCp8Ls() {
        int i = this.EljAMC1QTz - 1;
        this.EljAMC1QTz = i;
        if (i == 0) {
            GWasM1elztuh();
        }
    }

    @Override // defpackage.y31
    public final boolean EljAMC1QTz() {
        return true;
    }

    @Override // defpackage.y31
    public final hv OOA6hdeuvCS() {
        return this.OOA6hdeuvCS;
    }

    @Override // defpackage.y31
    public final void X1lG3V04pd() {
        if (this.X1lG3V04pd) {
            return;
        }
        E7jCp8Ls();
        this.X1lG3V04pd = true;
        synchronized (e41.X1lG3V04pd) {
            iwATDS1i01k();
        }
    }

    @Override // defpackage.y31
    public final y31 Y6hRI1cF8(hv hvVar) {
        e41.X1lG3V04pd(this);
        return new ij0(this.Yi7zF1RB1, this.GWasM1elztuh, e41.rQPn8YBR(hvVar, this.OOA6hdeuvCS, true), this);
    }

    @Override // defpackage.y31
    public final hv mOu10nynGul() {
        return null;
    }

    @Override // defpackage.y31
    public final void rQPn8YBR() {
        this.EljAMC1QTz++;
    }

    @Override // defpackage.y31
    public final void uFEq9NpZ(s51 s51Var) {
        dx0 dx0Var = e41.GWasM1elztuh;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.y31
    public final void XnEVoBF0td1l() {
    }
}
