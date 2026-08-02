package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f1u extends ynv {
    public sx7 k;
    public vu2 l;

    @Override // defpackage.px7
    public final void a(px7 px7Var) {
        float f;
        float f2;
        float f3;
        int i;
        if (ouj.D(this.j) == 3) {
            aa6 aa6Var = this.b;
            l(aa6Var.K, aa6Var.M, 1);
            return;
        }
        v38 v38Var = this.e;
        boolean z = v38Var.c;
        z96 z96Var = z96.c;
        if (z && !v38Var.j && this.d == z96Var) {
            aa6 aa6Var2 = this.b;
            int i2 = aa6Var2.s;
            if (i2 == 2) {
                aa6 aa6Var3 = aa6Var2.V;
                if (aa6Var3 != null) {
                    if (aa6Var3.e.e.j) {
                        v38Var.d((int) ((r1.g * aa6Var2.z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                v38 v38Var2 = aa6Var2.d.e;
                if (v38Var2.j) {
                    int i3 = aa6Var2.Z;
                    if (i3 == -1) {
                        f = v38Var2.g;
                        f2 = aa6Var2.Y;
                    } else if (i3 == 0) {
                        f3 = v38Var2.g * aa6Var2.Y;
                        i = (int) (f3 + 0.5f);
                        v38Var.d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        v38Var.d(i);
                    } else {
                        f = v38Var2.g;
                        f2 = aa6Var2.Y;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    v38Var.d(i);
                }
            }
        }
        sx7 sx7Var = this.h;
        boolean z2 = sx7Var.c;
        ArrayList arrayList = sx7Var.l;
        if (z2) {
            sx7 sx7Var2 = this.i;
            boolean z3 = sx7Var2.c;
            ArrayList arrayList2 = sx7Var2.l;
            if (z3) {
                if (sx7Var.j && sx7Var2.j && v38Var.j) {
                    return;
                }
                if (!v38Var.j && this.d == z96Var) {
                    aa6 aa6Var4 = this.b;
                    if (aa6Var4.r == 0 && !aa6Var4.z()) {
                        sx7 sx7Var3 = (sx7) arrayList.get(0);
                        sx7 sx7Var4 = (sx7) arrayList2.get(0);
                        int i4 = sx7Var3.g + sx7Var.f;
                        int i5 = sx7Var4.g + sx7Var2.f;
                        sx7Var.d(i4);
                        sx7Var2.d(i5);
                        v38Var.d(i5 - i4);
                        return;
                    }
                }
                if (!v38Var.j && this.d == z96Var && this.a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    sx7 sx7Var5 = (sx7) arrayList.get(0);
                    int i6 = (((sx7) arrayList2.get(0)).g + sx7Var2.f) - (sx7Var5.g + sx7Var.f);
                    int i7 = v38Var.m;
                    if (i6 < i7) {
                        v38Var.d(i6);
                    } else {
                        v38Var.d(i7);
                    }
                }
                if (v38Var.j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    sx7 sx7Var6 = (sx7) arrayList.get(0);
                    sx7 sx7Var7 = (sx7) arrayList2.get(0);
                    int i8 = sx7Var6.g;
                    int i9 = sx7Var.f + i8;
                    int i10 = sx7Var7.g;
                    int i11 = sx7Var2.f + i10;
                    float f4 = this.b.g0;
                    if (sx7Var6 == sx7Var7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    sx7Var.d((int) ((((i10 - i8) - v38Var.g) * f4) + i8 + 0.5f));
                    sx7Var2.d(sx7Var.g + v38Var.g);
                }
            }
        }
    }

    @Override // defpackage.ynv
    public final void d() {
        aa6 aa6Var;
        aa6 aa6Var2;
        aa6 aa6Var3;
        aa6 aa6Var4;
        sx7 sx7Var = this.k;
        aa6 aa6Var5 = this.b;
        boolean z = aa6Var5.a;
        v38 v38Var = this.e;
        if (z) {
            v38Var.d(aa6Var5.l());
        }
        boolean z2 = v38Var.j;
        ArrayList arrayList = v38Var.k;
        ArrayList arrayList2 = v38Var.l;
        z96 z96Var = z96.d;
        z96 z96Var2 = z96.a;
        z96 z96Var3 = z96.c;
        sx7 sx7Var2 = this.i;
        sx7 sx7Var3 = this.h;
        if (!z2) {
            aa6 aa6Var6 = this.b;
            this.d = aa6Var6.U[1];
            if (aa6Var6.E) {
                this.l = new vu2(this);
            }
            z96 z96Var4 = this.d;
            if (z96Var4 != z96Var3) {
                if (z96Var4 == z96Var && (aa6Var4 = this.b.V) != null && aa6Var4.U[1] == z96Var2) {
                    int l = (aa6Var4.l() - this.b.K.e()) - this.b.M.e();
                    ynv.b(sx7Var3, aa6Var4.e.h, this.b.K.e());
                    ynv.b(sx7Var2, aa6Var4.e.i, -this.b.M.e());
                    v38Var.d(l);
                    return;
                }
                if (z96Var4 == z96Var2) {
                    v38Var.d(this.b.l());
                }
            }
        } else if (this.d == z96Var && (aa6Var2 = (aa6Var = this.b).V) != null && aa6Var2.U[1] == z96Var2) {
            ynv.b(sx7Var3, aa6Var2.e.h, aa6Var.K.e());
            ynv.b(sx7Var2, aa6Var2.e.i, -this.b.M.e());
            return;
        }
        boolean z3 = v38Var.j;
        if (z3) {
            aa6 aa6Var7 = this.b;
            if (aa6Var7.a) {
                o86[] o86VarArr = aa6Var7.R;
                o86 o86Var = o86VarArr[2];
                o86 o86Var2 = o86Var.f;
                if (o86Var2 != null && o86VarArr[3].f != null) {
                    boolean z4 = aa6Var7.z();
                    aa6 aa6Var8 = this.b;
                    if (z4) {
                        sx7Var3.f = aa6Var8.R[2].e();
                        sx7Var2.f = -this.b.R[3].e();
                    } else {
                        sx7 h = ynv.h(aa6Var8.R[2]);
                        if (h != null) {
                            ynv.b(sx7Var3, h, this.b.R[2].e());
                        }
                        sx7 h2 = ynv.h(this.b.R[3]);
                        if (h2 != null) {
                            ynv.b(sx7Var2, h2, -this.b.R[3].e());
                        }
                        sx7Var3.b = true;
                        sx7Var2.b = true;
                    }
                    aa6 aa6Var9 = this.b;
                    if (aa6Var9.E) {
                        ynv.b(sx7Var, sx7Var3, aa6Var9.c0);
                        return;
                    }
                    return;
                }
                if (o86Var2 != null) {
                    sx7 h3 = ynv.h(o86Var);
                    if (h3 != null) {
                        ynv.b(sx7Var3, h3, this.b.R[2].e());
                        ynv.b(sx7Var2, sx7Var3, v38Var.g);
                        aa6 aa6Var10 = this.b;
                        if (aa6Var10.E) {
                            ynv.b(sx7Var, sx7Var3, aa6Var10.c0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                o86 o86Var3 = o86VarArr[3];
                if (o86Var3.f != null) {
                    sx7 h4 = ynv.h(o86Var3);
                    if (h4 != null) {
                        ynv.b(sx7Var2, h4, -this.b.R[3].e());
                        ynv.b(sx7Var3, sx7Var2, -v38Var.g);
                    }
                    aa6 aa6Var11 = this.b;
                    if (aa6Var11.E) {
                        ynv.b(sx7Var, sx7Var3, aa6Var11.c0);
                        return;
                    }
                    return;
                }
                o86 o86Var4 = o86VarArr[4];
                if (o86Var4.f != null) {
                    sx7 h5 = ynv.h(o86Var4);
                    if (h5 != null) {
                        ynv.b(sx7Var, h5, 0);
                        ynv.b(sx7Var3, sx7Var, -this.b.c0);
                        ynv.b(sx7Var2, sx7Var3, v38Var.g);
                        return;
                    }
                    return;
                }
                if ((aa6Var7 instanceof fxd) || aa6Var7.V == null || aa6Var7.j(7).f != null) {
                    return;
                }
                aa6 aa6Var12 = this.b;
                ynv.b(sx7Var3, aa6Var12.V.e.h, aa6Var12.t());
                ynv.b(sx7Var2, sx7Var3, v38Var.g);
                aa6 aa6Var13 = this.b;
                if (aa6Var13.E) {
                    ynv.b(sx7Var, sx7Var3, aa6Var13.c0);
                    return;
                }
                return;
            }
        }
        if (z3 || this.d != z96Var3) {
            v38Var.b(this);
        } else {
            aa6 aa6Var14 = this.b;
            int i = aa6Var14.s;
            if (i == 2) {
                aa6 aa6Var15 = aa6Var14.V;
                if (aa6Var15 != null) {
                    v38 v38Var2 = aa6Var15.e.e;
                    arrayList2.add(v38Var2);
                    v38Var2.k.add(v38Var);
                    v38Var.b = true;
                    arrayList.add(sx7Var3);
                    arrayList.add(sx7Var2);
                }
            } else if (i == 3 && !aa6Var14.z()) {
                aa6 aa6Var16 = this.b;
                if (aa6Var16.r != 3) {
                    v38 v38Var3 = aa6Var16.d.e;
                    arrayList2.add(v38Var3);
                    v38Var3.k.add(v38Var);
                    v38Var.b = true;
                    arrayList.add(sx7Var3);
                    arrayList.add(sx7Var2);
                }
            }
        }
        aa6 aa6Var17 = this.b;
        o86[] o86VarArr2 = aa6Var17.R;
        o86 o86Var5 = o86VarArr2[2];
        o86 o86Var6 = o86Var5.f;
        if (o86Var6 != null && o86VarArr2[3].f != null) {
            boolean z5 = aa6Var17.z();
            aa6 aa6Var18 = this.b;
            if (z5) {
                sx7Var3.f = aa6Var18.R[2].e();
                sx7Var2.f = -this.b.R[3].e();
            } else {
                sx7 h6 = ynv.h(aa6Var18.R[2]);
                sx7 h7 = ynv.h(this.b.R[3]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                this.j = 4;
            }
            if (this.b.E) {
                c(sx7Var, sx7Var3, 1, this.l);
            }
        } else if (o86Var6 != null) {
            sx7 h8 = ynv.h(o86Var5);
            if (h8 != null) {
                ynv.b(sx7Var3, h8, this.b.R[2].e());
                c(sx7Var2, sx7Var3, 1, v38Var);
                if (this.b.E) {
                    c(sx7Var, sx7Var3, 1, this.l);
                }
                if (this.d == z96Var3) {
                    aa6 aa6Var19 = this.b;
                    if (aa6Var19.Y > 0.0f) {
                        x3e x3eVar = aa6Var19.d;
                        if (x3eVar.d == z96Var3) {
                            x3eVar.e.k.add(v38Var);
                            arrayList2.add(this.b.d.e);
                            v38Var.a = this;
                        }
                    }
                }
            }
        } else {
            o86 o86Var7 = o86VarArr2[3];
            if (o86Var7.f != null) {
                sx7 h9 = ynv.h(o86Var7);
                if (h9 != null) {
                    ynv.b(sx7Var2, h9, -this.b.R[3].e());
                    c(sx7Var3, sx7Var2, -1, v38Var);
                    if (this.b.E) {
                        c(sx7Var, sx7Var3, 1, this.l);
                    }
                }
            } else {
                o86 o86Var8 = o86VarArr2[4];
                if (o86Var8.f != null) {
                    sx7 h10 = ynv.h(o86Var8);
                    if (h10 != null) {
                        ynv.b(sx7Var, h10, 0);
                        c(sx7Var3, sx7Var, -1, this.l);
                        c(sx7Var2, sx7Var3, 1, v38Var);
                    }
                } else if (!(aa6Var17 instanceof fxd) && (aa6Var3 = aa6Var17.V) != null) {
                    ynv.b(sx7Var3, aa6Var3.e.h, aa6Var17.t());
                    c(sx7Var2, sx7Var3, 1, v38Var);
                    if (this.b.E) {
                        c(sx7Var, sx7Var3, 1, this.l);
                    }
                    if (this.d == z96Var3) {
                        aa6 aa6Var20 = this.b;
                        if (aa6Var20.Y > 0.0f) {
                            x3e x3eVar2 = aa6Var20.d;
                            if (x3eVar2.d == z96Var3) {
                                x3eVar2.e.k.add(v38Var);
                                arrayList2.add(this.b.d.e);
                                v38Var.a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            v38Var.c = true;
        }
    }

    @Override // defpackage.ynv
    public final void e() {
        sx7 sx7Var = this.h;
        if (sx7Var.j) {
            this.b.b0 = sx7Var.g;
        }
    }

    @Override // defpackage.ynv
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.ynv
    public final boolean k() {
        return this.d != z96.c || this.b.s == 0;
    }

    public final void m() {
        this.g = false;
        sx7 sx7Var = this.h;
        sx7Var.c();
        sx7Var.j = false;
        sx7 sx7Var2 = this.i;
        sx7Var2.c();
        sx7Var2.j = false;
        sx7 sx7Var3 = this.k;
        sx7Var3.c();
        sx7Var3.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.k0;
    }
}
