package defpackage;

/* loaded from: classes.dex */
public final class v2t0 extends j5u0 {
    public float c;

    public v2t0(long j, float f) {
        super(j);
        this.c = f;
    }

    @Override // defpackage.j5u0
    public final void a(j5u0 j5u0Var) {
        this.c = ((v2t0) j5u0Var).c;
    }

    @Override // defpackage.j5u0
    public final j5u0 b() {
        return c(q2t0.j().g());
    }

    @Override // defpackage.j5u0
    public final j5u0 c(long j) {
        return new v2t0(j, this.c);
    }
}
