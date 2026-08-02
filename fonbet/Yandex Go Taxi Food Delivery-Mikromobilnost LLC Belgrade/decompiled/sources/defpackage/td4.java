package defpackage;

/* loaded from: classes9.dex */
public final class td4 extends r3 {
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ td4(int i, int i2, int i3, z1 z1Var, boolean z) {
        super(i, i2, i3, z1Var);
        this.x = 1;
    }

    @Override // defpackage.a3
    public final void i(g191 g191Var, boolean z) {
        int i = this.x;
        int i2 = this.c;
        int i3 = this.b;
        z1 z1Var = this.w;
        switch (i) {
            case 0:
                a3 aSN1Primitive = z1Var.toASN1Primitive();
                boolean q = q();
                if (z) {
                    if (q || aSN1Primitive.j()) {
                        i3 |= 32;
                    }
                    g191Var.b0(i3, i2);
                }
                if (!q) {
                    aSN1Primitive.i(g191Var, false);
                    break;
                } else {
                    g191Var.U(128);
                    aSN1Primitive.i(g191Var, true);
                    g191Var.U(0);
                    g191Var.U(0);
                    break;
                }
                break;
            case 1:
                a3 n = z1Var.toASN1Primitive().n();
                boolean q2 = q();
                if (z) {
                    if (q2 || n.j()) {
                        i3 |= 32;
                    }
                    g191Var.b0(i3, i2);
                }
                if (q2) {
                    g191Var.W(n.k(true));
                }
                n.i(g191Var.J(), q2);
                break;
            default:
                a3 o = z1Var.toASN1Primitive().o();
                boolean q3 = q();
                if (z) {
                    if (q3 || o.j()) {
                        i3 |= 32;
                    }
                    g191Var.b0(i3, i2);
                }
                if (q3) {
                    g191Var.W(o.k(true));
                }
                o.i(g191Var.K(), q3);
                break;
        }
    }

    @Override // defpackage.a3
    public final boolean j() {
        int i = this.x;
        z1 z1Var = this.w;
        switch (i) {
            case 0:
                if (!q() && !z1Var.toASN1Primitive().j()) {
                    break;
                }
                break;
            case 1:
                if (!q() && !z1Var.toASN1Primitive().n().j()) {
                    break;
                }
                break;
            default:
                if (!q() && !z1Var.toASN1Primitive().o().j()) {
                    break;
                }
                break;
        }
        return false;
    }

    @Override // defpackage.a3
    public final int k(boolean z) {
        int i = this.x;
        int i2 = this.c;
        z1 z1Var = this.w;
        switch (i) {
            case 0:
                a3 aSN1Primitive = z1Var.toASN1Primitive();
                boolean q = q();
                int k = aSN1Primitive.k(q);
                if (q) {
                    k += 3;
                }
                return k + (z ? g191.N(i2) : 0);
            case 1:
                a3 n = z1Var.toASN1Primitive().n();
                boolean q2 = q();
                int k2 = n.k(q2);
                if (q2) {
                    k2 += g191.L(k2);
                }
                return k2 + (z ? g191.N(i2) : 0);
            default:
                a3 o = z1Var.toASN1Primitive().o();
                boolean q3 = q();
                int k3 = o.k(q3);
                if (q3) {
                    k3 += g191.L(k3);
                }
                return k3 + (z ? g191.N(i2) : 0);
        }
    }

    @Override // defpackage.r3, defpackage.a3
    public a3 n() {
        switch (this.x) {
            case 1:
                return this;
            default:
                return super.n();
        }
    }

    @Override // defpackage.r3, defpackage.a3
    public a3 o() {
        switch (this.x) {
            case 1:
            case 2:
                return this;
            default:
                return super.o();
        }
    }

    @Override // defpackage.r3
    public final h3 r(a3 a3Var) {
        switch (this.x) {
            case 0:
                return new md4(a3Var);
            case 1:
                iqf iqfVar = new iqf(a3Var);
                iqfVar.c = -1;
                return iqfVar;
            default:
                wvf wvfVar = new wvf(a3Var);
                wvfVar.c = -1;
                return wvfVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ td4(int i, int i2, int i3, z1 z1Var, int i4) {
        super(i, i2, i3, z1Var);
        this.x = i4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ td4(boolean z, int i, z1 z1Var, int i2) {
        super(z, i, z1Var);
        this.x = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ td4(boolean z, int i, z1 z1Var, boolean z2) {
        super(z, i, z1Var);
        this.x = 1;
    }
}
