package defpackage;

/* loaded from: classes5.dex */
public final class ki2 extends z0 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki2(boolean z, int i, d0 d0Var, int i2) {
        super(z ? 1 : 2, 128, i, d0Var);
        this.e = i2;
    }

    @Override // defpackage.z0, defpackage.s0
    public s0 A() {
        switch (this.e) {
            case 1:
            case 2:
                return this;
            default:
                return super.A();
        }
    }

    @Override // defpackage.z0
    public final v0 E(s0 s0Var) {
        switch (this.e) {
            case 0:
                return new hi2(s0Var);
            case 1:
                d07 d07Var = new d07(s0Var);
                d07Var.c = -1;
                return d07Var;
            default:
                f67 f67Var = new f67(s0Var);
                f67Var.c = -1;
                return f67Var;
        }
    }

    @Override // defpackage.s0
    public final void u(qxp qxpVar, boolean z) {
        switch (this.e) {
            case 0:
                s0 n = this.d.n();
                boolean D = D();
                if (z) {
                    int i = this.b;
                    if (D || n.v()) {
                        i |= 32;
                    }
                    qxpVar.z(i, this.c);
                }
                if (!D) {
                    n.u(qxpVar, false);
                    break;
                } else {
                    qxpVar.q(128);
                    n.u(qxpVar, true);
                    qxpVar.q(0);
                    qxpVar.q(0);
                    break;
                }
                break;
            case 1:
                s0 z2 = this.d.n().z();
                boolean D2 = D();
                if (z) {
                    int i2 = this.b;
                    if (D2 || z2.v()) {
                        i2 |= 32;
                    }
                    qxpVar.z(i2, this.c);
                }
                if (D2) {
                    qxpVar.t(z2.w(true));
                }
                z2.u(qxpVar.f(), D2);
                break;
            default:
                s0 A = this.d.n().A();
                boolean D3 = D();
                if (z) {
                    int i3 = this.b;
                    if (D3 || A.v()) {
                        i3 |= 32;
                    }
                    qxpVar.z(i3, this.c);
                }
                if (D3) {
                    qxpVar.t(A.w(true));
                }
                A.u(qxpVar.g(), D3);
                break;
        }
    }

    @Override // defpackage.s0
    public final boolean v() {
        switch (this.e) {
            case 0:
                if (D() || this.d.n().v()) {
                }
                break;
            case 1:
                if (D() || this.d.n().z().v()) {
                }
                break;
            default:
                if (D() || this.d.n().A().v()) {
                }
                break;
        }
        return true;
    }

    @Override // defpackage.s0
    public final int w(boolean z) {
        switch (this.e) {
            case 0:
                s0 n = this.d.n();
                boolean D = D();
                int w = n.w(D);
                if (D) {
                    w += 3;
                }
                return w + (z ? qxp.o(this.c) : 0);
            case 1:
                s0 z2 = this.d.n().z();
                boolean D2 = D();
                int w2 = z2.w(D2);
                if (D2) {
                    w2 += qxp.l(w2);
                }
                return w2 + (z ? qxp.o(this.c) : 0);
            default:
                s0 A = this.d.n().A();
                boolean D3 = D();
                int w3 = A.w(D3);
                if (D3) {
                    w3 += qxp.l(w3);
                }
                return w3 + (z ? qxp.o(this.c) : 0);
        }
    }

    @Override // defpackage.z0, defpackage.s0
    public s0 z() {
        switch (this.e) {
            case 1:
                return this;
            default:
                return super.z();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ki2(int i, int i2, int i3, d0 d0Var, int i4) {
        super(i, i2, i3, d0Var);
        this.e = i4;
    }
}
