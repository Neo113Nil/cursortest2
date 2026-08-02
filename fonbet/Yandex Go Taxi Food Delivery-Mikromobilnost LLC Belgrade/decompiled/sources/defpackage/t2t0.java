package defpackage;

/* loaded from: classes10.dex */
public final class t2t0 extends j5u0 {
    public double c;

    public t2t0(long j, double d) {
        super(j);
        this.c = d;
    }

    @Override // defpackage.j5u0
    public final void a(j5u0 j5u0Var) {
        this.c = ((t2t0) j5u0Var).c;
    }

    @Override // defpackage.j5u0
    public final j5u0 b() {
        return c(this.a);
    }

    @Override // defpackage.j5u0
    public final j5u0 c(long j) {
        return new t2t0(j, this.c);
    }
}
