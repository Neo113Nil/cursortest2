package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class sc0 {
    public final String GWasM1elztuh;
    public final x20 Yi7zF1RB1;

    public sc0(String str, x20 x20Var) {
        this.GWasM1elztuh = str;
        this.Yi7zF1RB1 = x20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sc0)) {
            return false;
        }
        sc0 sc0Var = (sc0) obj;
        return this.GWasM1elztuh.equals(sc0Var.GWasM1elztuh) && this.Yi7zF1RB1.equals(sc0Var.Yi7zF1RB1);
    }

    public final int hashCode() {
        return this.Yi7zF1RB1.hashCode() + (this.GWasM1elztuh.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.GWasM1elztuh + ", range=" + this.Yi7zF1RB1 + ')';
    }
}
