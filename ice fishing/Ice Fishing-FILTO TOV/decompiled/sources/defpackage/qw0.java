package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class qw0 implements r90, AutoCloseable {
    public boolean AvO7iQsrTN;
    public final pw0 EljAMC1QTz;
    public final String OOA6hdeuvCS;

    public qw0(String str, pw0 pw0Var) {
        this.OOA6hdeuvCS = str;
        this.EljAMC1QTz = pw0Var;
    }

    @Override // defpackage.r90
    public final void OOA6hdeuvCS(t90 t90Var, l90 l90Var) {
        if (l90Var == l90.ON_DESTROY) {
            this.AvO7iQsrTN = false;
            t90Var.AvO7iQsrTN().EljAMC1QTz(this);
        }
    }

    public final void xqGvceK5x(d dVar, w90 w90Var) {
        dVar.getClass();
        w90Var.getClass();
        if (this.AvO7iQsrTN) {
            o4.jivtDDk9H("Already attached to lifecycleOwner");
            return;
        }
        this.AvO7iQsrTN = true;
        w90Var.GWasM1elztuh(this);
        dVar.jivtDDk9H(this.OOA6hdeuvCS, (zc) this.EljAMC1QTz.Yi7zF1RB1.OOA6hdeuvCS);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
