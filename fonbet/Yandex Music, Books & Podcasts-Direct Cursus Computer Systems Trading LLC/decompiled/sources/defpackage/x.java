package defpackage;

/* loaded from: classes5.dex */
public abstract class x extends z0 {
    public final z0 e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x(z0 z0Var) {
        super(r0, r1, z0Var.c, z0Var.d);
        int i = z0Var.a;
        int i2 = z0Var.b;
        if (64 != i2) {
            e7o.e();
            throw null;
        }
        this.e = z0Var;
    }

    @Override // defpackage.z0, defpackage.s0
    public s0 A() {
        return new a67((z0) this.e.A());
    }

    @Override // defpackage.z0
    public final v0 E(s0 s0Var) {
        return this.e.E(s0Var);
    }

    @Override // defpackage.s0
    public final void u(qxp qxpVar, boolean z) {
        this.e.u(qxpVar, z);
    }

    @Override // defpackage.s0
    public final boolean v() {
        return this.e.v();
    }

    @Override // defpackage.s0
    public final int w(boolean z) {
        return this.e.w(z);
    }

    @Override // defpackage.z0, defpackage.s0
    public s0 z() {
        return new ai2((z0) this.e.z(), 1);
    }
}
