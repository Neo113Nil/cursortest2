package defpackage;

/* loaded from: classes.dex */
public final class nsk extends kiu {
    @Override // defpackage.kiu
    public final void V(int i, int i2, int i3, int i4) {
        int i5 = this.A0 + this.B0;
        int i6 = this.w0 + this.x0;
        if (this.v0 > 0) {
            i5 += this.u0[0].r();
            i6 += this.u0[0].l();
        }
        int max = Math.max(this.d0, i5);
        int max2 = Math.max(this.e0, i6);
        if (i != 1073741824) {
            i2 = i == Integer.MIN_VALUE ? Math.min(max, i2) : i == 0 ? max : 0;
        }
        if (i3 != 1073741824) {
            i4 = i3 == Integer.MIN_VALUE ? Math.min(max2, i4) : i3 == 0 ? max2 : 0;
        }
        this.D0 = i2;
        this.E0 = i4;
        P(i2);
        M(i4);
        this.C0 = this.v0 > 0;
    }

    @Override // defpackage.aa6
    public final void b(j7g j7gVar, boolean z) {
        super.b(j7gVar, z);
        if (this.v0 > 0) {
            aa6 aa6Var = this.u0[0];
            aa6Var.E();
            aa6Var.g0 = 0.5f;
            aa6Var.f0 = 0.5f;
            aa6Var.e(2, this, 2, 0);
            aa6Var.e(4, this, 4, 0);
            aa6Var.e(3, this, 3, 0);
            aa6Var.e(5, this, 5, 0);
        }
    }
}
