package defpackage;

/* loaded from: classes2.dex */
public final class vrc0 {
    public final String a;
    public final jkc0 b;

    public vrc0(String str, jkc0 jkc0Var) {
        this.a = str;
        this.b = jkc0Var;
    }

    public final jkc0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrc0)) {
            return false;
        }
        vrc0 vrc0Var = (vrc0) obj;
        return this.a.equals(vrc0Var.a) && this.b.equals(vrc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnTaxiATContainer(__typename=" + this.a + ", plaqueContainer=" + this.b + ')';
    }
}
