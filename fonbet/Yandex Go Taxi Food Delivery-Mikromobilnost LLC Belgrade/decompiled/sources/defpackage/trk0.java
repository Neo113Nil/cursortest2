package defpackage;

/* loaded from: classes10.dex */
public final class trk0 {
    public final long a;
    public final rrk0 b;

    public trk0(rrk0 rrk0Var, int i) {
        long j = ldc.m;
        rrk0Var = (i & 2) != 0 ? null : rrk0Var;
        this.a = j;
        this.b = rrk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof trk0)) {
            return false;
        }
        trk0 trk0Var = (trk0) obj;
        return ldc.c(this.a, trk0Var.a) && jl40.l(this.b, trk0Var.b);
    }

    public final int hashCode() {
        int i = ldc.n;
        int hashCode = Long.hashCode(this.a) * 31;
        rrk0 rrk0Var = this.b;
        return hashCode + (rrk0Var != null ? rrk0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleConfiguration(color=");
        xvz.w(this.a, ", rippleAlpha=", sb);
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
