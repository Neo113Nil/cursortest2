package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class t9 {
    public el GWasM1elztuh;
    public s9 X1lG3V04pd;
    public p50 Yi7zF1RB1;
    public long xqGvceK5x;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9)) {
            return false;
        }
        t9 t9Var = (t9) obj;
        return o30.rQPn8YBR(this.GWasM1elztuh, t9Var.GWasM1elztuh) && this.Yi7zF1RB1 == t9Var.Yi7zF1RB1 && o30.rQPn8YBR(this.X1lG3V04pd, t9Var.X1lG3V04pd) && t21.GWasM1elztuh(this.xqGvceK5x, t9Var.xqGvceK5x);
    }

    public final int hashCode() {
        return Long.hashCode(this.xqGvceK5x) + ((this.X1lG3V04pd.hashCode() + ((this.Yi7zF1RB1.hashCode() + (this.GWasM1elztuh.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.GWasM1elztuh + ", layoutDirection=" + this.Yi7zF1RB1 + ", canvas=" + this.X1lG3V04pd + ", size=" + ((Object) t21.xqGvceK5x(this.xqGvceK5x)) + ')';
    }
}
