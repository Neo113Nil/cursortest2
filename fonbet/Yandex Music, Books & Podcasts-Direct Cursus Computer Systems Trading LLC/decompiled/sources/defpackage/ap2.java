package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class ap2 extends fxd {
    public int w0 = 0;
    public boolean x0 = true;
    public int y0 = 0;
    public boolean z0 = false;

    @Override // defpackage.aa6
    public final boolean B() {
        return this.z0;
    }

    @Override // defpackage.aa6
    public final boolean C() {
        return this.z0;
    }

    public final boolean V() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.v0;
            if (i4 >= i) {
                break;
            }
            aa6 aa6Var = this.u0[i4];
            if ((this.x0 || aa6Var.c()) && ((((i2 = this.w0) == 0 || i2 == 1) && !aa6Var.B()) || (((i3 = this.w0) == 2 || i3 == 3) && !aa6Var.C()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.v0; i6++) {
            aa6 aa6Var2 = this.u0[i6];
            if (this.x0 || aa6Var2.c()) {
                if (!z2) {
                    int i7 = this.w0;
                    if (i7 == 0) {
                        i5 = aa6Var2.j(2).d();
                    } else if (i7 == 1) {
                        i5 = aa6Var2.j(4).d();
                    } else if (i7 == 2) {
                        i5 = aa6Var2.j(3).d();
                    } else if (i7 == 3) {
                        i5 = aa6Var2.j(5).d();
                    }
                    z2 = true;
                }
                int i8 = this.w0;
                if (i8 == 0) {
                    i5 = Math.min(i5, aa6Var2.j(2).d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, aa6Var2.j(4).d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, aa6Var2.j(3).d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, aa6Var2.j(5).d());
                }
            }
        }
        int i9 = i5 + this.y0;
        int i10 = this.w0;
        if (i10 == 0 || i10 == 1) {
            K(i9, i9);
        } else {
            L(i9, i9);
        }
        this.z0 = true;
        return true;
    }

    public final int W() {
        int i = this.w0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // defpackage.aa6
    public final void b(j7g j7gVar, boolean z) {
        boolean z2;
        int i;
        o86[] o86VarArr = this.R;
        o86 o86Var = this.J;
        o86VarArr[0] = o86Var;
        int i2 = 2;
        o86 o86Var2 = this.K;
        o86VarArr[2] = o86Var2;
        o86 o86Var3 = this.L;
        o86VarArr[1] = o86Var3;
        o86 o86Var4 = this.M;
        o86VarArr[3] = o86Var4;
        for (o86 o86Var5 : o86VarArr) {
            o86Var5.i = j7gVar.k(o86Var5);
        }
        int i3 = this.w0;
        if (i3 < 0 || i3 >= 4) {
            return;
        }
        o86 o86Var6 = o86VarArr[i3];
        if (!this.z0) {
            V();
        }
        if (this.z0) {
            this.z0 = false;
            int i4 = this.w0;
            if (i4 == 0 || i4 == 1) {
                j7gVar.d(o86Var.i, this.a0);
                j7gVar.d(o86Var3.i, this.a0);
                return;
            } else {
                if (i4 == 2 || i4 == 3) {
                    j7gVar.d(o86Var2.i, this.b0);
                    j7gVar.d(o86Var4.i, this.b0);
                    return;
                }
                return;
            }
        }
        for (int i5 = 0; i5 < this.v0; i5++) {
            aa6 aa6Var = this.u0[i5];
            if (this.x0 || aa6Var.c()) {
                int i6 = this.w0;
                z96 z96Var = z96.c;
                if (((i6 == 0 || i6 == 1) && aa6Var.U[0] == z96Var && aa6Var.J.f != null && aa6Var.L.f != null) || ((i6 == 2 || i6 == 3) && aa6Var.U[1] == z96Var && aa6Var.K.f != null && aa6Var.M.f != null)) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        boolean z3 = o86Var.g() || o86Var3.g();
        boolean z4 = o86Var2.g() || o86Var4.g();
        int i7 = !(!z2 && (((i = this.w0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.v0) {
            aa6 aa6Var2 = this.u0[i8];
            if (this.x0 || aa6Var2.c()) {
                i3r k = j7gVar.k(aa6Var2.R[this.w0]);
                o86[] o86VarArr2 = aa6Var2.R;
                int i9 = this.w0;
                o86 o86Var7 = o86VarArr2[i9];
                o86Var7.i = k;
                o86 o86Var8 = o86Var7.f;
                int i10 = (o86Var8 == null || o86Var8.d != this) ? 0 : o86Var7.g;
                if (i9 == 0 || i9 == i2) {
                    i3r i3rVar = o86Var6.i;
                    int i11 = this.y0 - i10;
                    bz0 l = j7gVar.l();
                    i3r m = j7gVar.m();
                    m.d = 0;
                    l.c(i3rVar, k, m, i11);
                    j7gVar.c(l);
                } else {
                    i3r i3rVar2 = o86Var6.i;
                    int i12 = this.y0 + i10;
                    bz0 l2 = j7gVar.l();
                    i3r m2 = j7gVar.m();
                    m2.d = 0;
                    l2.b(i3rVar2, k, m2, i12);
                    j7gVar.c(l2);
                }
                j7gVar.e(o86Var6.i, k, this.y0 + i10, i7);
            }
            i8++;
            i2 = 2;
        }
        int i13 = this.w0;
        if (i13 == 0) {
            j7gVar.e(o86Var3.i, o86Var.i, 0, 8);
            j7gVar.e(o86Var.i, this.V.L.i, 0, 4);
            j7gVar.e(o86Var.i, this.V.J.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            j7gVar.e(o86Var.i, o86Var3.i, 0, 8);
            j7gVar.e(o86Var.i, this.V.J.i, 0, 4);
            j7gVar.e(o86Var.i, this.V.L.i, 0, 0);
        } else if (i13 == 2) {
            j7gVar.e(o86Var4.i, o86Var2.i, 0, 8);
            j7gVar.e(o86Var2.i, this.V.M.i, 0, 4);
            j7gVar.e(o86Var2.i, this.V.K.i, 0, 0);
        } else if (i13 == 3) {
            j7gVar.e(o86Var2.i, o86Var4.i, 0, 8);
            j7gVar.e(o86Var2.i, this.V.K.i, 0, 4);
            j7gVar.e(o86Var2.i, this.V.M.i, 0, 0);
        }
    }

    @Override // defpackage.aa6
    public final boolean c() {
        return true;
    }

    @Override // defpackage.fxd, defpackage.aa6
    public final void g(aa6 aa6Var, HashMap hashMap) {
        super.g(aa6Var, hashMap);
        ap2 ap2Var = (ap2) aa6Var;
        this.w0 = ap2Var.w0;
        this.x0 = ap2Var.x0;
        this.y0 = ap2Var.y0;
    }

    @Override // defpackage.aa6
    public final String toString() {
        String o = su4.o(new StringBuilder("[Barrier] "), this.k0, " {");
        for (int i = 0; i < this.v0; i++) {
            aa6 aa6Var = this.u0[i];
            if (i > 0) {
                o = o.concat(", ");
            }
            StringBuilder k = dfi.k(o);
            k.append(aa6Var.k0);
            o = k.toString();
        }
        return o.concat("}");
    }
}
