package defpackage;

/* loaded from: classes10.dex */
public final class r0t0 implements o0t0 {
    public final s0t0 a;
    public final j18 b;

    public r0t0(s0t0 s0t0Var, j18 j18Var) {
        this.a = s0t0Var;
        this.b = j18Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r0t0.class == obj.getClass()) {
            r0t0 r0t0Var = (r0t0) obj;
            return jl40.l(this.a, r0t0Var.a) && this.b == r0t0Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
