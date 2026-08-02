package defpackage;

/* loaded from: classes2.dex */
public final class y3k0 {
    public final d4k0 a;
    public final a4k0 b;

    public y3k0(d4k0 d4k0Var, a4k0 a4k0Var) {
        this.a = d4k0Var;
        this.b = a4k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3k0)) {
            return false;
        }
        y3k0 y3k0Var = (y3k0) obj;
        return this.a.equals(y3k0Var.a) && this.b.equals(y3k0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Color(light=" + this.a + ", dark=" + this.b + ')';
    }
}
