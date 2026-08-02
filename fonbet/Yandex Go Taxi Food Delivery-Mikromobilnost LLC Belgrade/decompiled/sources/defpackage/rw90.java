package defpackage;

/* loaded from: classes2.dex */
public final class rw90 {
    public final pw90 a;
    public final qw90 b;

    public rw90(pw90 pw90Var, qw90 qw90Var) {
        this.a = pw90Var;
        this.b = qw90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rw90)) {
            return false;
        }
        rw90 rw90Var = (rw90) obj;
        return jl40.l(this.a, rw90Var.a) && jl40.l(this.b, rw90Var.b);
    }

    public final int hashCode() {
        pw90 pw90Var = this.a;
        int hashCode = (pw90Var == null ? 0 : pw90Var.hashCode()) * 31;
        qw90 qw90Var = this.b;
        return hashCode + (qw90Var != null ? qw90Var.hashCode() : 0);
    }

    public final String toString() {
        return "PaymentButtonAsset(badgeText=" + this.a + ", subtitleText=" + this.b + ')';
    }
}
