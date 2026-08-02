package defpackage;

/* loaded from: classes10.dex */
public final class r0u0 implements f531 {
    public final f531 a;
    public final long b;

    public r0u0(f531 f531Var, long j) {
        this.a = f531Var;
        this.b = j;
    }

    @Override // defpackage.f531
    public final boolean b() {
        return this.a.b();
    }

    @Override // defpackage.f531
    public final long e(sj2 sj2Var, sj2 sj2Var2, sj2 sj2Var3) {
        return this.a.e(sj2Var, sj2Var2, sj2Var3) + this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r0u0)) {
            return false;
        }
        r0u0 r0u0Var = (r0u0) obj;
        return r0u0Var.b == this.b && jl40.l(r0u0Var.a, this.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.f531
    public final sj2 k(long j, sj2 sj2Var, sj2 sj2Var2, sj2 sj2Var3) {
        long j2 = this.b;
        return j < j2 ? sj2Var3 : this.a.k(j - j2, sj2Var, sj2Var2, sj2Var3);
    }

    @Override // defpackage.f531
    public final sj2 n(long j, sj2 sj2Var, sj2 sj2Var2, sj2 sj2Var3) {
        long j2 = this.b;
        return j < j2 ? sj2Var : this.a.n(j - j2, sj2Var, sj2Var2, sj2Var3);
    }
}
