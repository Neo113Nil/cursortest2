package defpackage;

/* loaded from: classes.dex */
public final class v4u0 extends j5u0 {
    public n2b0 c;
    public int d;
    public int e;

    public v4u0(long j, n2b0 n2b0Var) {
        super(j);
        this.c = n2b0Var;
    }

    @Override // defpackage.j5u0
    public final void a(j5u0 j5u0Var) {
        synchronized (d6z.c) {
            this.c = ((v4u0) j5u0Var).c;
            this.d = ((v4u0) j5u0Var).d;
            this.e = ((v4u0) j5u0Var).e;
        }
    }

    @Override // defpackage.j5u0
    public final j5u0 b() {
        return c(q2t0.j().g());
    }

    @Override // defpackage.j5u0
    public final j5u0 c(long j) {
        return new v4u0(j, this.c);
    }
}
