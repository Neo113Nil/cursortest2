package defpackage;

/* loaded from: classes5.dex */
public final class e07 extends w0 {
    public final /* synthetic */ int c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e07(int i, boolean z, d0[] d0VarArr) {
        super(z, d0VarArr);
        this.c = i;
        switch (i) {
            case 1:
                super(z, d0VarArr);
                this.d = -1;
                break;
            default:
                break;
        }
    }

    @Override // defpackage.w0, defpackage.s0
    public final s0 A() {
        int i = this.c;
        return this;
    }

    public int F() {
        if (this.d < 0) {
            int i = 0;
            for (d0 d0Var : this.a) {
                i += d0Var.n().z().w(true);
            }
            this.d = i;
        }
        return this.d;
    }

    public int G() {
        if (this.d < 0) {
            int i = 0;
            for (d0 d0Var : this.a) {
                i += d0Var.n().A().w(true);
            }
            this.d = i;
        }
        return this.d;
    }

    @Override // defpackage.s0
    public final void u(qxp qxpVar, boolean z) {
        switch (this.c) {
            case 0:
                qxpVar.A(49, z);
                b07 f = qxpVar.f();
                d0[] d0VarArr = this.a;
                int length = d0VarArr.length;
                int i = 0;
                if (this.d >= 0 || length > 16) {
                    qxpVar.t(F());
                    while (i < length) {
                        d0VarArr[i].n().z().u(f, true);
                        i++;
                    }
                    break;
                } else {
                    s0[] s0VarArr = new s0[length];
                    int i2 = 0;
                    for (int i3 = 0; i3 < length; i3++) {
                        s0 z2 = d0VarArr[i3].n().z();
                        s0VarArr[i3] = z2;
                        i2 += z2.w(true);
                    }
                    this.d = i2;
                    qxpVar.t(i2);
                    while (i < length) {
                        s0VarArr[i].u(f, true);
                        i++;
                    }
                    break;
                }
                break;
            default:
                qxpVar.A(49, z);
                e67 g = qxpVar.g();
                d0[] d0VarArr2 = this.a;
                int length2 = d0VarArr2.length;
                int i4 = 0;
                if (this.d >= 0 || length2 > 16) {
                    qxpVar.t(G());
                    while (i4 < length2) {
                        g.B(d0VarArr2[i4].n());
                        i4++;
                    }
                    break;
                } else {
                    s0[] s0VarArr2 = new s0[length2];
                    int i5 = 0;
                    for (int i6 = 0; i6 < length2; i6++) {
                        s0 A = d0VarArr2[i6].n().A();
                        s0VarArr2[i6] = A;
                        i5 += A.w(true);
                    }
                    this.d = i5;
                    qxpVar.t(i5);
                    while (i4 < length2) {
                        g.B(s0VarArr2[i4]);
                        i4++;
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.s0
    public final int w(boolean z) {
        switch (this.c) {
            case 0:
                return qxp.n(F(), z);
            default:
                return qxp.n(G(), z);
        }
    }

    @Override // defpackage.w0, defpackage.s0
    public s0 z() {
        switch (this.c) {
            case 0:
                if (!this.b) {
                    break;
                } else {
                    break;
                }
        }
        return super.z();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e07(e0 e0Var) {
        super(e0Var);
        this.c = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e07(d07 d07Var) {
        super(d07Var);
        this.c = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e07(d0[] d0VarArr) {
        super(d0VarArr);
        this.c = 0;
    }

    public /* synthetic */ e07() {
        this.c = 1;
    }
}
