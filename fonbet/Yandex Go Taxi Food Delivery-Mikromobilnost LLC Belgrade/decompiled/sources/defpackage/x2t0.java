package defpackage;

/* loaded from: classes.dex */
public final class x2t0 extends j5u0 {
    public int c;

    public x2t0(long j, int i) {
        super(j);
        this.c = i;
    }

    @Override // defpackage.j5u0
    public final void a(j5u0 j5u0Var) {
        this.c = ((x2t0) j5u0Var).c;
    }

    @Override // defpackage.j5u0
    public final j5u0 b() {
        return c(q2t0.j().g());
    }

    @Override // defpackage.j5u0
    public final j5u0 c(long j) {
        return new x2t0(j, this.c);
    }
}
