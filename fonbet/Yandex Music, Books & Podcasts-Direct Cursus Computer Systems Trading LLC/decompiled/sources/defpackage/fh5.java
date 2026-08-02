package defpackage;

/* loaded from: classes3.dex */
public final class fh5 {
    public final hh5 a;
    public final eh5 b;

    public fh5(hh5 hh5Var, eh5 eh5Var) {
        this.a = hh5Var;
        this.b = eh5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fh5)) {
            return false;
        }
        fh5 fh5Var = (fh5) obj;
        return this.a.equals(fh5Var.a) && this.b.equals(fh5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Button(image=" + this.a + ", action=" + this.b + ")";
    }
}
