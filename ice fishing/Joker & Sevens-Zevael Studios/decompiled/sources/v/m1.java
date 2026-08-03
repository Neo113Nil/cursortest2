package v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m1 implements j1 {

    /* renamed from: g, reason: collision with root package name */
    public final k1 f6893g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6894h;

    /* renamed from: i, reason: collision with root package name */
    public final long f6895i;

    /* renamed from: j, reason: collision with root package name */
    public final long f6896j;

    public m1(k1 k1Var, int i10, long j3) {
        this.f6893g = k1Var;
        this.f6894h = i10;
        this.f6895i = (k1Var.m() + k1Var.l()) * 1000000;
        this.f6896j = j3 * 1000000;
    }

    @Override // v.j1
    public final boolean a() {
        return true;
    }

    @Override // v.j1
    public final long b(n nVar, n nVar2, n nVar3) {
        return Long.MAX_VALUE;
    }

    public final long c(long j3) {
        long j6 = j3 + this.f6896j;
        if (j6 <= 0) {
            return 0L;
        }
        long j10 = this.f6895i;
        long j11 = j6 / j10;
        return (this.f6894h == 1 || j11 % ((long) 2) == 0) ? j6 - (j11 * j10) : ((j11 + 1) * j10) - j6;
    }

    public final n d(long j3, n nVar, n nVar2, n nVar3) {
        long j6 = this.f6896j;
        long j10 = j3 + j6;
        long j11 = this.f6895i;
        return j10 > j11 ? this.f6893g.p(j11 - j6, nVar, nVar3, nVar2) : nVar2;
    }

    @Override // v.j1
    public final n k(long j3, n nVar, n nVar2, n nVar3) {
        return this.f6893g.k(c(j3), nVar, nVar2, d(j3, nVar, nVar3, nVar2));
    }

    @Override // v.j1
    public final n p(long j3, n nVar, n nVar2, n nVar3) {
        return this.f6893g.p(c(j3), nVar, nVar2, d(j3, nVar, nVar3, nVar2));
    }
}
