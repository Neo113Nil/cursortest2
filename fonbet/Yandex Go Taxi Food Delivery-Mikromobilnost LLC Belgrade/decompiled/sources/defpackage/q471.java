package defpackage;

/* loaded from: classes7.dex */
public final class q471 implements a871 {
    public final be71 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public q471(be71 be71Var, long j, long j2, long j3, long j4, long j5) {
        this.a = be71Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
    }

    @Override // defpackage.a871
    public final boolean b() {
        return true;
    }

    @Override // defpackage.a871
    public final long c() {
        return this.b;
    }

    @Override // defpackage.a871
    public final v171 d(long j) {
        oe71 oe71Var = new oe71(j, xt5.a(this.a.a(j), 0L, this.c, this.d, this.e, this.f));
        return new v171(oe71Var, oe71Var);
    }
}
