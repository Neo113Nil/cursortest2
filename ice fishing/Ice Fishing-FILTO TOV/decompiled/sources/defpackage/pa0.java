package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class pa0 extends qa0 {
    public final String GWasM1elztuh;
    public final o81 Yi7zF1RB1;

    public pa0(String str, o81 o81Var) {
        this.GWasM1elztuh = str;
        this.Yi7zF1RB1 = o81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pa0)) {
            return false;
        }
        pa0 pa0Var = (pa0) obj;
        return this.GWasM1elztuh.equals(pa0Var.GWasM1elztuh) && o30.rQPn8YBR(this.Yi7zF1RB1, pa0Var.Yi7zF1RB1);
    }

    public final int hashCode() {
        int hashCode = this.GWasM1elztuh.hashCode() * 31;
        o81 o81Var = this.Yi7zF1RB1;
        return (hashCode + (o81Var != null ? o81Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return "LinkAnnotation.Url(url=" + this.GWasM1elztuh + ')';
    }
}
