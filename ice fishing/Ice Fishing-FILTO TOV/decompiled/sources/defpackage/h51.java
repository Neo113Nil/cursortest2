package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class h51 implements l3 {
    public final l3 GWasM1elztuh;
    public final long Yi7zF1RB1;

    public h51(xr xrVar, long j) {
        this.GWasM1elztuh = xrVar;
        this.Yi7zF1RB1 = j;
    }

    @Override // defpackage.l3
    public final td1 GWasM1elztuh(eb1 eb1Var) {
        return new i51(this.GWasM1elztuh.GWasM1elztuh(eb1Var), this.Yi7zF1RB1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h51)) {
            return false;
        }
        h51 h51Var = (h51) obj;
        return h51Var.Yi7zF1RB1 == this.Yi7zF1RB1 && o30.rQPn8YBR(h51Var.GWasM1elztuh, this.GWasM1elztuh);
    }

    public final int hashCode() {
        return Long.hashCode(this.Yi7zF1RB1) + (this.GWasM1elztuh.hashCode() * 31);
    }
}
