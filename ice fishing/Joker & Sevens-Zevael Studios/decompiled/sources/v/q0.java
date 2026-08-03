package v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class q0 implements j1 {

    /* renamed from: g, reason: collision with root package name */
    public final j1 f6946g;

    /* renamed from: h, reason: collision with root package name */
    public final long f6947h;

    public q0(j1 j1Var, long j3) {
        this.f6946g = j1Var;
        this.f6947h = j3;
    }

    @Override // v.j1
    public final boolean a() {
        return this.f6946g.a();
    }

    @Override // v.j1
    public final long b(n nVar, n nVar2, n nVar3) {
        return this.f6946g.b(nVar, nVar2, nVar3) + this.f6947h;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return q0Var.f6947h == this.f6947h && pc.j.a(q0Var.f6946g, this.f6946g);
    }

    public final int hashCode() {
        return Long.hashCode(this.f6947h) + (this.f6946g.hashCode() * 31);
    }

    @Override // v.j1
    public final n k(long j3, n nVar, n nVar2, n nVar3) {
        long j6 = this.f6947h;
        return j3 < j6 ? nVar : this.f6946g.k(j3 - j6, nVar, nVar2, nVar3);
    }

    @Override // v.j1
    public final n p(long j3, n nVar, n nVar2, n nVar3) {
        long j6 = this.f6947h;
        return j3 < j6 ? nVar3 : this.f6946g.p(j3 - j6, nVar, nVar2, nVar3);
    }
}
