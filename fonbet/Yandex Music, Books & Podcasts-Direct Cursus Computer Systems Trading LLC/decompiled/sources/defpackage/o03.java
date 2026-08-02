package defpackage;

/* loaded from: classes.dex */
public final class o03 implements fap {
    public final p03 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public o03(p03 p03Var, long j, long j2, long j3, long j4, long j5) {
        this.a = p03Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
    }

    @Override // defpackage.fap
    public final eap e(long j) {
        iap iapVar = new iap(j, bq0.a(this.a.c(j), 0L, this.c, this.d, this.e, this.f));
        return new eap(iapVar, iapVar);
    }

    @Override // defpackage.fap
    public final boolean g() {
        return true;
    }

    @Override // defpackage.fap
    public final long k() {
        return this.b;
    }
}
