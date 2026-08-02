package defpackage;

/* loaded from: classes5.dex */
public final class f67 extends v0 {
    public int c;

    @Override // defpackage.v0
    public final z H() {
        return new b67(ci2.D(B()), false);
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
                i += this.a[i2].n().A().w(true);
            }
            this.c = i;
        }
        return this.c;
    }

    @Override // defpackage.s0
    public final void u(qxp qxpVar, boolean z) {
        qxpVar.A(48, z);
        e67 g = qxpVar.g();
        int length = this.a.length;
        int i = 0;
        if (this.c >= 0 || length > 16) {
            qxpVar.t(M());
            while (i < length) {
                g.B(this.a[i].n());
                i++;
            }
            return;
        }
        s0[] s0VarArr = new s0[length];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            s0 A = this.a[i3].n().A();
            s0VarArr[i3] = A;
            i2 += A.w(true);
        }
        this.c = i2;
        qxpVar.t(i2);
        while (i < length) {
            g.B(s0VarArr[i]);
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
}
