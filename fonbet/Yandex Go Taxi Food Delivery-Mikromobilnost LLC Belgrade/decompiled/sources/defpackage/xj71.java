package defpackage;

/* loaded from: classes7.dex */
public final class xj71 {
    public final v281 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public xj71(v281 v281Var, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        if (z4 && !z2) {
            w511.q();
            throw null;
        }
        if (z3 && !z2) {
            w511.q();
            throw null;
        }
        if (z && (z2 || z3 || z4)) {
            w511.q();
            throw null;
        }
        this.a = v281Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xj71.class != obj.getClass()) {
            return false;
        }
        xj71 xj71Var = (xj71) obj;
        if (this.b != xj71Var.b || this.c != xj71Var.c || this.d != xj71Var.d || this.e != xj71Var.e || this.f != xj71Var.f || this.g != xj71Var.g || this.h != xj71Var.h || this.i != xj71Var.i) {
            return false;
        }
        v281 v281Var = xj71Var.a;
        int i = rf71.a;
        return this.a.equals(v281Var);
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
