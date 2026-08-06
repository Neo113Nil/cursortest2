package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class n31 {
    public final String GWasM1elztuh;
    public final h31 Yi7zF1RB1;

    public n31(String str, h31 h31Var) {
        this.GWasM1elztuh = str;
        this.Yi7zF1RB1 = h31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n31.class != obj.getClass()) {
            return false;
        }
        n31 n31Var = (n31) obj;
        return o30.rQPn8YBR(this.GWasM1elztuh, n31Var.GWasM1elztuh) && this.Yi7zF1RB1 == n31Var.Yi7zF1RB1;
    }

    public final int hashCode() {
        return this.Yi7zF1RB1.hashCode() + mr0.xqGvceK5x(this.GWasM1elztuh.hashCode() * 961, 31, false);
    }
}
