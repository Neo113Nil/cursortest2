package defpackage;

/* loaded from: classes5.dex */
public final class l0 extends s0 {
    public final wz6 a;

    public l0(wz6 wz6Var) {
        this.a = wz6Var;
    }

    @Override // defpackage.s0, defpackage.k0
    public final int hashCode() {
        return ~j66.e0(this.a.a);
    }

    @Override // defpackage.s0
    public final boolean t(s0 s0Var) {
        if (s0Var instanceof l0) {
            return this.a.t(((l0) s0Var).a);
        }
        return false;
    }

    @Override // defpackage.s0
    public final void u(qxp qxpVar, boolean z) {
        qxpVar.A(7, z);
        qxpVar.v(25, false, this.a.a);
    }

    @Override // defpackage.s0
    public final boolean v() {
        return false;
    }

    @Override // defpackage.s0
    public final int w(boolean z) {
        return this.a.w(z);
    }

    @Override // defpackage.s0
    public final s0 A() {
        return this;
    }

    @Override // defpackage.s0
    public final s0 z() {
        return this;
    }
}
