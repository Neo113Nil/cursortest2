package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class o81 {
    public final w41 GWasM1elztuh;
    public final w41 X1lG3V04pd;
    public final w41 Yi7zF1RB1;
    public final w41 xqGvceK5x;

    public o81(w41 w41Var, w41 w41Var2, w41 w41Var3, w41 w41Var4) {
        this.GWasM1elztuh = w41Var;
        this.Yi7zF1RB1 = w41Var2;
        this.X1lG3V04pd = w41Var3;
        this.xqGvceK5x = w41Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o81)) {
            return false;
        }
        o81 o81Var = (o81) obj;
        return o30.rQPn8YBR(this.GWasM1elztuh, o81Var.GWasM1elztuh) && o30.rQPn8YBR(this.Yi7zF1RB1, o81Var.Yi7zF1RB1) && o30.rQPn8YBR(this.X1lG3V04pd, o81Var.X1lG3V04pd) && o30.rQPn8YBR(this.xqGvceK5x, o81Var.xqGvceK5x);
    }

    public final int hashCode() {
        w41 w41Var = this.GWasM1elztuh;
        int hashCode = (w41Var != null ? w41Var.hashCode() : 0) * 31;
        w41 w41Var2 = this.Yi7zF1RB1;
        int hashCode2 = (hashCode + (w41Var2 != null ? w41Var2.hashCode() : 0)) * 31;
        w41 w41Var3 = this.X1lG3V04pd;
        int hashCode3 = (hashCode2 + (w41Var3 != null ? w41Var3.hashCode() : 0)) * 31;
        w41 w41Var4 = this.xqGvceK5x;
        return hashCode3 + (w41Var4 != null ? w41Var4.hashCode() : 0);
    }
}
