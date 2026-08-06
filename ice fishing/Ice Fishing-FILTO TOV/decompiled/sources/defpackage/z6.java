package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class z6 {
    public w0 GWasM1elztuh = null;
    public Jz7YUlEP53 Yi7zF1RB1 = null;
    public u9 X1lG3V04pd = null;
    public h1 xqGvceK5x = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6)) {
            return false;
        }
        z6 z6Var = (z6) obj;
        return o30.rQPn8YBR(this.GWasM1elztuh, z6Var.GWasM1elztuh) && o30.rQPn8YBR(this.Yi7zF1RB1, z6Var.Yi7zF1RB1) && o30.rQPn8YBR(this.X1lG3V04pd, z6Var.X1lG3V04pd) && o30.rQPn8YBR(this.xqGvceK5x, z6Var.xqGvceK5x);
    }

    public final int hashCode() {
        w0 w0Var = this.GWasM1elztuh;
        int hashCode = (w0Var == null ? 0 : w0Var.hashCode()) * 31;
        Jz7YUlEP53 jz7YUlEP53 = this.Yi7zF1RB1;
        int hashCode2 = (hashCode + (jz7YUlEP53 == null ? 0 : jz7YUlEP53.hashCode())) * 31;
        u9 u9Var = this.X1lG3V04pd;
        int hashCode3 = (hashCode2 + (u9Var == null ? 0 : u9Var.hashCode())) * 31;
        h1 h1Var = this.xqGvceK5x;
        return hashCode3 + (h1Var != null ? h1Var.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.GWasM1elztuh + ", canvas=" + this.Yi7zF1RB1 + ", canvasDrawScope=" + this.X1lG3V04pd + ", borderPath=" + this.xqGvceK5x + ')';
    }
}
