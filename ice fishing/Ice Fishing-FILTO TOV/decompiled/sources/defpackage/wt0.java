package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class wt0 extends w60 {
    public final w60 GWasM1elztuh;
    public final int Yi7zF1RB1;

    public wt0(w60 w60Var, int i) {
        this.GWasM1elztuh = w60Var;
        this.Yi7zF1RB1 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wt0)) {
            return false;
        }
        wt0 wt0Var = (wt0) obj;
        return wt0Var.GWasM1elztuh.equals(this.GWasM1elztuh) && wt0Var.Yi7zF1RB1 == this.Yi7zF1RB1;
    }

    public final int hashCode() {
        return this.GWasM1elztuh.hashCode() + (this.Yi7zF1RB1 * 31);
    }
}
