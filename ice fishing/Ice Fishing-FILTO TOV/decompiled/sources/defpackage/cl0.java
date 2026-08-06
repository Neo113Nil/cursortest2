package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class cl0 extends d70 {
    public final y5 GWasM1elztuh;
    public final t90 Yi7zF1RB1;

    public cl0(y5 y5Var, t90 t90Var) {
        y5Var.getClass();
        this.GWasM1elztuh = y5Var;
        this.Yi7zF1RB1 = t90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cl0)) {
            return false;
        }
        cl0 cl0Var = (cl0) obj;
        return o30.rQPn8YBR(this.GWasM1elztuh, cl0Var.GWasM1elztuh) && o30.rQPn8YBR(this.Yi7zF1RB1, cl0Var.Yi7zF1RB1);
    }

    public final int hashCode() {
        int hashCode = this.GWasM1elztuh.hashCode() * 31;
        t90 t90Var = this.Yi7zF1RB1;
        return hashCode + (t90Var == null ? 0 : t90Var.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.GWasM1elztuh + ", owner=" + this.Yi7zF1RB1 + ')';
    }
}
