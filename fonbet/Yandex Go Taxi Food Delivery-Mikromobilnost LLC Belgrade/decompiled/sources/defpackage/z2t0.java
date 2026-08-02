package defpackage;

/* loaded from: classes.dex */
public final class z2t0 extends j5u0 {
    public long c;

    public z2t0(long j, long j2) {
        super(j);
        this.c = j2;
    }

    @Override // defpackage.j5u0
    public final void a(j5u0 j5u0Var) {
        this.c = ((z2t0) j5u0Var).c;
    }

    @Override // defpackage.j5u0
    public final j5u0 b() {
        return c(q2t0.j().g());
    }

    @Override // defpackage.j5u0
    public final j5u0 c(long j) {
        return new z2t0(j, this.c);
    }
}
