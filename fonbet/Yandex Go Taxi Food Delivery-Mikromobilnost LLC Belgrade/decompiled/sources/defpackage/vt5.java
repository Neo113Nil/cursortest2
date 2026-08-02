package defpackage;

/* loaded from: classes10.dex */
public final class vt5 implements f7q0 {
    public final yt5 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public vt5(yt5 yt5Var, long j, long j2, long j3, long j4, long j5) {
        this.a = yt5Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
    }

    @Override // defpackage.f7q0
    public final e7q0 b(long j) {
        h7q0 h7q0Var = new h7q0(j, xt5.b(this.a.c(j), 0L, this.c, this.d, this.e, this.f));
        return new e7q0(h7q0Var, h7q0Var);
    }

    @Override // defpackage.f7q0
    public final boolean c() {
        return true;
    }

    @Override // defpackage.f7q0
    public final long k() {
        return this.b;
    }
}
