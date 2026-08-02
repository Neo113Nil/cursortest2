package defpackage;

/* loaded from: classes12.dex */
public final class xpi0 {
    public final int a;
    public final h62 b;

    public xpi0(int i, h62 h62Var) {
        this.a = i;
        this.b = h62Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (xpi0.class.equals(obj != null ? obj.getClass() : null)) {
            return jl40.l(this.b, ((xpi0) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
