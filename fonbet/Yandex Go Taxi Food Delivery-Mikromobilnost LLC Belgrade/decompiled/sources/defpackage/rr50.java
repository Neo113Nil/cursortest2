package defpackage;

/* loaded from: classes8.dex */
public final class rr50 {
    public final m5j0 a;
    public final rvj0 b;
    public final long c;

    public rr50(m5j0 m5j0Var, rvj0 rvj0Var, long j) {
        this.a = m5j0Var;
        this.b = rvj0Var;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rr50)) {
            return false;
        }
        rr50 rr50Var = (rr50) obj;
        return jl40.l(this.a, rr50Var.a) && jl40.l(this.b, rr50Var.b) && this.c == rr50Var.c;
    }

    public final int hashCode() {
        m5j0 m5j0Var = this.a;
        int hashCode = (m5j0Var == null ? 0 : m5j0Var.hashCode()) * 31;
        rvj0 rvj0Var = this.b;
        return Long.hashCode(this.c) + ((hashCode + (rvj0Var != null ? rvj0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InteractionInfo(requestBody=");
        sb.append(this.a);
        sb.append(", responseBody=");
        sb.append(this.b);
        sb.append(", timestamp=");
        return b64.o(sb, this.c, ')');
    }
}
