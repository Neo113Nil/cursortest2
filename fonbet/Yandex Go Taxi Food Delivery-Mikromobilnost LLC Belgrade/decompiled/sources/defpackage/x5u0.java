package defpackage;

/* loaded from: classes10.dex */
public final class x5u0 extends j5u0 {
    public o2b0 c;
    public int d;

    public x5u0(long j, o2b0 o2b0Var) {
        super(j);
        this.c = o2b0Var;
    }

    @Override // defpackage.j5u0
    public final void a(j5u0 j5u0Var) {
        synchronized (d0a1.a) {
            this.c = ((x5u0) j5u0Var).c;
            this.d = ((x5u0) j5u0Var).d;
        }
    }

    @Override // defpackage.j5u0
    public final j5u0 b() {
        return new x5u0(q2t0.j().g(), this.c);
    }

    @Override // defpackage.j5u0
    public final j5u0 c(long j) {
        return new x5u0(j, this.c);
    }
}
