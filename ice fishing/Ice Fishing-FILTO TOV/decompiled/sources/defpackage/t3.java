package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class t3 {
    public final Object GWasM1elztuh;
    public final int X1lG3V04pd;
    public final int Yi7zF1RB1;
    public final String xqGvceK5x;

    public t3(Object obj, int i, int i2, String str) {
        this.GWasM1elztuh = obj;
        this.Yi7zF1RB1 = i;
        this.X1lG3V04pd = i2;
        this.xqGvceK5x = str;
        if (i <= i2) {
            return;
        }
        u10.GWasM1elztuh("Reversed range is not supported");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3)) {
            return false;
        }
        t3 t3Var = (t3) obj;
        return o30.rQPn8YBR(this.GWasM1elztuh, t3Var.GWasM1elztuh) && this.Yi7zF1RB1 == t3Var.Yi7zF1RB1 && this.X1lG3V04pd == t3Var.X1lG3V04pd && o30.rQPn8YBR(this.xqGvceK5x, t3Var.xqGvceK5x);
    }

    public final int hashCode() {
        Object obj = this.GWasM1elztuh;
        return this.xqGvceK5x.hashCode() + mr0.Yi7zF1RB1(this.X1lG3V04pd, mr0.Yi7zF1RB1(this.Yi7zF1RB1, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "Range(item=" + this.GWasM1elztuh + ", start=" + this.Yi7zF1RB1 + ", end=" + this.X1lG3V04pd + ", tag=" + this.xqGvceK5x + ')';
    }

    public t3(int i, int i2, Object obj) {
        this(obj, i, i2, "");
    }
}
