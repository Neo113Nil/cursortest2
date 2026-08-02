package defpackage;

/* loaded from: classes3.dex */
public final class du0 {
    public static final du0 c;
    public final long a;
    public final long b;

    static {
        long j = xme.e;
        c = new du0(j, j);
    }

    public du0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof du0)) {
            return false;
        }
        du0 du0Var = (du0) obj;
        return kes.a(this.a, du0Var.a) && kes.a(this.b, du0Var.b);
    }

    public final int hashCode() {
        les[] lesVarArr = kes.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return hrg.s("Size(width=", kes.d(this.a), ", height=", kes.d(this.b), ")");
    }
}
