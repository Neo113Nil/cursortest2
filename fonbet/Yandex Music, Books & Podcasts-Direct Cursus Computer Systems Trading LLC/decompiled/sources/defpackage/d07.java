package defpackage;

/* loaded from: classes5.dex */
public final class d07 extends v0 {
    public int c;

    public d07(d0[] d0VarArr) {
        if (d0VarArr != null) {
            for (d0 d0Var : d0VarArr) {
                if (d0Var != null) {
                }
            }
            this.a = e0.f(d0VarArr);
            this.c = -1;
            return;
        }
        jj4.j("'elements' cannot be null, or contain null");
        throw null;
    }

    @Override // defpackage.v0
    public final z H() {
        return new sz6(ci2.D(B()), false);
    }

    @Override // defpackage.v0
    public final o0 K() {
        return new a07(fi2.D(D()));
    }

    @Override // defpackage.v0
    public final w0 L() {
        return new e07(1, false, this.a);
    }

    public final int M() {
        if (this.c < 0) {
            int length = this.a.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                i += this.a[i2].n().z().w(true);
            }
            this.c = i;
        }
        return this.c;
    }

    @Override // defpackage.s0
    public final void u(qxp qxpVar, boolean z) {
        qxpVar.A(48, z);
        b07 f = qxpVar.f();
        int length = this.a.length;
        int i = 0;
        if (this.c >= 0 || length > 16) {
            qxpVar.t(M());
            while (i < length) {
                this.a[i].n().z().u(f, true);
                i++;
            }
            return;
        }
        s0[] s0VarArr = new s0[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            s0 z2 = this.a[i3].n().z();
            s0VarArr[i3] = z2;
            i2 += z2.w(true);
        }
        this.c = i2;
        qxpVar.t(i2);
        while (i < length) {
            s0VarArr[i].u(f, true);
            i++;
        }
    }

    @Override // defpackage.s0
    public final int w(boolean z) {
        return qxp.n(M(), z);
    }

    @Override // defpackage.v0, defpackage.s0
    public final s0 A() {
        return this;
    }

    @Override // defpackage.v0, defpackage.s0
    public final s0 z() {
        return this;
    }

    public d07() {
        this.c = -1;
    }
}
