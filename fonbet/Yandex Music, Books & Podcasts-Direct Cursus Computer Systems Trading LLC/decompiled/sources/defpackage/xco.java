package defpackage;

/* loaded from: classes5.dex */
public final class xco extends ngg {
    public static final wu1 e = new wu1("io.grpc.internal.RetryingNameResolver.RESOLUTION_RESULT_LISTENER_KEY");
    public final ngg b;
    public final ck2 c;
    public final vq6 d;

    public xco(g2a g2aVar, ck2 ck2Var, vq6 vq6Var) {
        this.b = g2aVar;
        this.c = ck2Var;
        this.d = vq6Var;
    }

    @Override // defpackage.ngg
    public final void B() {
        this.b.B();
    }

    @Override // defpackage.ngg
    public final void I() {
        this.b.I();
        ck2 ck2Var = this.c;
        vq6 vq6Var = ck2Var.b;
        vq6Var.e();
        vq6Var.execute(new he0(8, ck2Var));
    }

    @Override // defpackage.ngg
    public final void K(bfg bfgVar) {
        this.b.K(new wco(this, bfgVar));
    }

    public final String toString() {
        z0j Y = ezf.Y(this);
        Y.q(this.b, "delegate");
        return Y.toString();
    }

    @Override // defpackage.ngg
    public String v() {
        return this.b.v();
    }
}
