package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class x3e extends ynv {
    public static final int[] k = new int[2];

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0245, code lost:
    
        if (r6 != 1) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02ac  */
    @Override // defpackage.px7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(px7 px7Var) {
        float f;
        boolean z;
        float f2;
        float f3;
        float f4;
        int i;
        if (ouj.D(this.j) == 3) {
            aa6 aa6Var = this.b;
            l(aa6Var.J, aa6Var.L, 0);
            return;
        }
        v38 v38Var = this.e;
        boolean z2 = v38Var.j;
        z96 z96Var = z96.c;
        sx7 sx7Var = this.h;
        sx7 sx7Var2 = this.i;
        if (!z2 && this.d == z96Var) {
            aa6 aa6Var2 = this.b;
            int i2 = aa6Var2.r;
            if (i2 == 2) {
                f = 0.5f;
                aa6 aa6Var3 = aa6Var2.V;
                if (aa6Var3 != null) {
                    if (aa6Var3.d.e.j) {
                        v38Var.d((int) ((r3.g * aa6Var2.w) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                int i3 = aa6Var2.s;
                if (i3 == 0 || i3 == 3) {
                    f1u f1uVar = aa6Var2.e;
                    sx7 sx7Var3 = f1uVar.h;
                    sx7 sx7Var4 = f1uVar.i;
                    boolean z3 = aa6Var2.J.f != null;
                    boolean z4 = aa6Var2.K.f != null;
                    boolean z5 = aa6Var2.L.f != null;
                    boolean z6 = aa6Var2.M.f != null;
                    f = 0.5f;
                    int i4 = aa6Var2.Z;
                    if (z3 && z4 && z5 && z6) {
                        float f5 = aa6Var2.Y;
                        boolean z7 = sx7Var3.j;
                        ArrayList arrayList = sx7Var3.l;
                        int[] iArr = k;
                        if (z7 && sx7Var4.j) {
                            if (sx7Var.c && sx7Var2.c) {
                                m(iArr, ((sx7) sx7Var.l.get(0)).g + sx7Var.f, ((sx7) sx7Var2.l.get(0)).g - sx7Var2.f, sx7Var3.g + sx7Var3.f, sx7Var4.g - sx7Var4.f, f5, i4);
                                v38Var.d(iArr[0]);
                                this.b.e.e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (sx7Var.j && sx7Var2.j) {
                            if (!sx7Var3.c || !sx7Var4.c) {
                                return;
                            }
                            m(iArr, sx7Var.g + sx7Var.f, sx7Var2.g - sx7Var2.f, ((sx7) arrayList.get(0)).g + sx7Var3.f, ((sx7) sx7Var4.l.get(0)).g - sx7Var4.f, f5, i4);
                            v38Var.d(iArr[0]);
                            this.b.e.e.d(iArr[1]);
                        }
                        if (!sx7Var.c || !sx7Var2.c || !sx7Var3.c || !sx7Var4.c) {
                            return;
                        }
                        m(iArr, ((sx7) sx7Var.l.get(0)).g + sx7Var.f, ((sx7) sx7Var2.l.get(0)).g - sx7Var2.f, ((sx7) arrayList.get(0)).g + sx7Var3.f, ((sx7) sx7Var4.l.get(0)).g - sx7Var4.f, f5, i4);
                        v38Var.d(iArr[0]);
                        this.b.e.e.d(iArr[1]);
                    } else if (z3 && z5) {
                        if (!sx7Var.c || !sx7Var2.c) {
                            return;
                        }
                        float f6 = aa6Var2.Y;
                        int i5 = ((sx7) sx7Var.l.get(0)).g + sx7Var.f;
                        int i6 = ((sx7) sx7Var2.l.get(0)).g - sx7Var2.f;
                        if (i4 == -1 || i4 == 0) {
                            int g = g(i6 - i5, 0);
                            int i7 = (int) ((g * f6) + 0.5f);
                            int g2 = g(i7, 1);
                            if (i7 != g2) {
                                g = (int) ((g2 / f6) + 0.5f);
                            }
                            v38Var.d(g);
                            this.b.e.e.d(g2);
                        } else if (i4 == 1) {
                            int g3 = g(i6 - i5, 0);
                            int i8 = (int) ((g3 / f6) + 0.5f);
                            int g4 = g(i8, 1);
                            if (i8 != g4) {
                                g3 = (int) ((g4 * f6) + 0.5f);
                            }
                            v38Var.d(g3);
                            this.b.e.e.d(g4);
                        }
                    } else if (z4 && z6) {
                        if (!sx7Var3.c || !sx7Var4.c) {
                            return;
                        }
                        float f7 = aa6Var2.Y;
                        int i9 = ((sx7) sx7Var3.l.get(0)).g + sx7Var3.f;
                        int i10 = ((sx7) sx7Var4.l.get(0)).g - sx7Var4.f;
                        if (i4 != -1) {
                            if (i4 == 0) {
                                int g5 = g(i10 - i9, 1);
                                int i11 = (int) ((g5 * f7) + 0.5f);
                                int g6 = g(i11, 0);
                                if (i11 != g6) {
                                    g5 = (int) ((g6 / f7) + 0.5f);
                                }
                                v38Var.d(g6);
                                this.b.e.e.d(g5);
                            }
                        }
                        int g7 = g(i10 - i9, 1);
                        int i12 = (int) ((g7 / f7) + 0.5f);
                        int g8 = g(i12, 0);
                        if (i12 != g8) {
                            g7 = (int) ((g8 * f7) + 0.5f);
                        }
                        v38Var.d(g8);
                        this.b.e.e.d(g7);
                    }
                } else {
                    int i13 = aa6Var2.Z;
                    if (i13 == -1) {
                        f2 = aa6Var2.e.e.g;
                        f3 = aa6Var2.Y;
                    } else if (i13 == 0) {
                        f4 = aa6Var2.e.e.g / aa6Var2.Y;
                        i = (int) (f4 + 0.5f);
                        v38Var.d(i);
                    } else if (i13 != 1) {
                        i = 0;
                        v38Var.d(i);
                    } else {
                        f2 = aa6Var2.e.e.g;
                        f3 = aa6Var2.Y;
                    }
                    f4 = f2 * f3;
                    i = (int) (f4 + 0.5f);
                    v38Var.d(i);
                }
            }
            z = sx7Var.c;
            ArrayList arrayList2 = sx7Var.l;
            if (z) {
                return;
            }
            boolean z8 = sx7Var2.c;
            ArrayList arrayList3 = sx7Var2.l;
            if (z8) {
                if (sx7Var.j && sx7Var2.j && v38Var.j) {
                    return;
                }
                if (!v38Var.j && this.d == z96Var) {
                    aa6 aa6Var4 = this.b;
                    if (aa6Var4.r == 0 && !aa6Var4.y()) {
                        sx7 sx7Var5 = (sx7) arrayList2.get(0);
                        sx7 sx7Var6 = (sx7) arrayList3.get(0);
                        int i14 = sx7Var5.g + sx7Var.f;
                        int i15 = sx7Var6.g + sx7Var2.f;
                        sx7Var.d(i14);
                        sx7Var2.d(i15);
                        v38Var.d(i15 - i14);
                        return;
                    }
                }
                if (!v38Var.j && this.d == z96Var && this.a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int min = Math.min((((sx7) arrayList3.get(0)).g + sx7Var2.f) - (((sx7) arrayList2.get(0)).g + sx7Var.f), v38Var.m);
                    aa6 aa6Var5 = this.b;
                    int i16 = aa6Var5.v;
                    int max = Math.max(aa6Var5.u, min);
                    if (i16 > 0) {
                        max = Math.min(i16, max);
                    }
                    v38Var.d(max);
                }
                if (v38Var.j) {
                    sx7 sx7Var7 = (sx7) arrayList2.get(0);
                    sx7 sx7Var8 = (sx7) arrayList3.get(0);
                    int i17 = sx7Var7.g;
                    int i18 = sx7Var.f + i17;
                    int i19 = sx7Var8.g;
                    int i20 = sx7Var2.f + i19;
                    float f8 = this.b.f0;
                    if (sx7Var7 == sx7Var8) {
                        f8 = f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    sx7Var.d((int) ((((i19 - i17) - v38Var.g) * f8) + i17 + f));
                    sx7Var2.d(sx7Var.g + v38Var.g);
                    return;
                }
                return;
            }
            return;
        }
        f = 0.5f;
        z = sx7Var.c;
        ArrayList arrayList22 = sx7Var.l;
        if (z) {
        }
    }

    @Override // defpackage.ynv
    public final void d() {
        aa6 aa6Var;
        aa6 aa6Var2;
        z96 z96Var;
        aa6 aa6Var3;
        aa6 aa6Var4;
        z96 z96Var2;
        aa6 aa6Var5 = this.b;
        boolean z = aa6Var5.a;
        v38 v38Var = this.e;
        if (z) {
            v38Var.d(aa6Var5.r());
        }
        boolean z2 = v38Var.j;
        ArrayList arrayList = v38Var.k;
        ArrayList arrayList2 = v38Var.l;
        z96 z96Var3 = z96.d;
        z96 z96Var4 = z96.c;
        z96 z96Var5 = z96.a;
        sx7 sx7Var = this.i;
        sx7 sx7Var2 = this.h;
        if (!z2) {
            aa6 aa6Var6 = this.b;
            z96 z96Var6 = aa6Var6.U[0];
            this.d = z96Var6;
            if (z96Var6 != z96Var4) {
                if (z96Var6 == z96Var3 && (aa6Var4 = aa6Var6.V) != null && ((z96Var2 = aa6Var4.U[0]) == z96Var5 || z96Var2 == z96Var3)) {
                    int r = (aa6Var4.r() - this.b.J.e()) - this.b.L.e();
                    ynv.b(sx7Var2, aa6Var4.d.h, this.b.J.e());
                    ynv.b(sx7Var, aa6Var4.d.i, -this.b.L.e());
                    v38Var.d(r);
                    return;
                }
                if (z96Var6 == z96Var5) {
                    v38Var.d(aa6Var6.r());
                }
            }
        } else if (this.d == z96Var3 && (aa6Var2 = (aa6Var = this.b).V) != null && ((z96Var = aa6Var2.U[0]) == z96Var5 || z96Var == z96Var3)) {
            ynv.b(sx7Var2, aa6Var2.d.h, aa6Var.J.e());
            ynv.b(sx7Var, aa6Var2.d.i, -this.b.L.e());
            return;
        }
        if (v38Var.j) {
            aa6 aa6Var7 = this.b;
            if (aa6Var7.a) {
                o86[] o86VarArr = aa6Var7.R;
                o86 o86Var = o86VarArr[0];
                o86 o86Var2 = o86Var.f;
                if (o86Var2 != null && o86VarArr[1].f != null) {
                    boolean y = aa6Var7.y();
                    aa6 aa6Var8 = this.b;
                    if (y) {
                        sx7Var2.f = aa6Var8.R[0].e();
                        sx7Var.f = -this.b.R[1].e();
                        return;
                    }
                    sx7 h = ynv.h(aa6Var8.R[0]);
                    if (h != null) {
                        ynv.b(sx7Var2, h, this.b.R[0].e());
                    }
                    sx7 h2 = ynv.h(this.b.R[1]);
                    if (h2 != null) {
                        ynv.b(sx7Var, h2, -this.b.R[1].e());
                    }
                    sx7Var2.b = true;
                    sx7Var.b = true;
                    return;
                }
                if (o86Var2 != null) {
                    sx7 h3 = ynv.h(o86Var);
                    if (h3 != null) {
                        ynv.b(sx7Var2, h3, this.b.R[0].e());
                        ynv.b(sx7Var, sx7Var2, v38Var.g);
                        return;
                    }
                    return;
                }
                o86 o86Var3 = o86VarArr[1];
                if (o86Var3.f != null) {
                    sx7 h4 = ynv.h(o86Var3);
                    if (h4 != null) {
                        ynv.b(sx7Var, h4, -this.b.R[1].e());
                        ynv.b(sx7Var2, sx7Var, -v38Var.g);
                        return;
                    }
                    return;
                }
                if ((aa6Var7 instanceof fxd) || aa6Var7.V == null || aa6Var7.j(7).f != null) {
                    return;
                }
                aa6 aa6Var9 = this.b;
                ynv.b(sx7Var2, aa6Var9.V.d.h, aa6Var9.s());
                ynv.b(sx7Var, sx7Var2, v38Var.g);
                return;
            }
        }
        if (this.d == z96Var4) {
            aa6 aa6Var10 = this.b;
            int i = aa6Var10.r;
            if (i == 2) {
                aa6 aa6Var11 = aa6Var10.V;
                if (aa6Var11 != null) {
                    v38 v38Var2 = aa6Var11.e.e;
                    arrayList2.add(v38Var2);
                    v38Var2.k.add(v38Var);
                    v38Var.b = true;
                    arrayList.add(sx7Var2);
                    arrayList.add(sx7Var);
                }
            } else if (i == 3) {
                if (aa6Var10.s == 3) {
                    sx7Var2.a = this;
                    sx7Var.a = this;
                    f1u f1uVar = aa6Var10.e;
                    f1uVar.h.a = this;
                    f1uVar.i.a = this;
                    v38Var.a = this;
                    if (aa6Var10.z()) {
                        arrayList2.add(this.b.e.e);
                        this.b.e.e.k.add(v38Var);
                        f1u f1uVar2 = this.b.e;
                        f1uVar2.e.a = this;
                        arrayList2.add(f1uVar2.h);
                        arrayList2.add(this.b.e.i);
                        this.b.e.h.k.add(v38Var);
                        this.b.e.i.k.add(v38Var);
                    } else {
                        boolean y2 = this.b.y();
                        aa6 aa6Var12 = this.b;
                        if (y2) {
                            aa6Var12.e.e.l.add(v38Var);
                            arrayList.add(this.b.e.e);
                        } else {
                            aa6Var12.e.e.l.add(v38Var);
                        }
                    }
                } else {
                    v38 v38Var3 = aa6Var10.e.e;
                    arrayList2.add(v38Var3);
                    v38Var3.k.add(v38Var);
                    this.b.e.h.k.add(v38Var);
                    this.b.e.i.k.add(v38Var);
                    v38Var.b = true;
                    arrayList.add(sx7Var2);
                    arrayList.add(sx7Var);
                    sx7Var2.l.add(v38Var);
                    sx7Var.l.add(v38Var);
                }
            }
        }
        aa6 aa6Var13 = this.b;
        o86[] o86VarArr2 = aa6Var13.R;
        o86 o86Var4 = o86VarArr2[0];
        o86 o86Var5 = o86Var4.f;
        if (o86Var5 != null && o86VarArr2[1].f != null) {
            boolean y3 = aa6Var13.y();
            aa6 aa6Var14 = this.b;
            if (y3) {
                sx7Var2.f = aa6Var14.R[0].e();
                sx7Var.f = -this.b.R[1].e();
                return;
            }
            sx7 h5 = ynv.h(aa6Var14.R[0]);
            sx7 h6 = ynv.h(this.b.R[1]);
            if (h5 != null) {
                h5.b(this);
            }
            if (h6 != null) {
                h6.b(this);
            }
            this.j = 4;
            return;
        }
        if (o86Var5 != null) {
            sx7 h7 = ynv.h(o86Var4);
            if (h7 != null) {
                ynv.b(sx7Var2, h7, this.b.R[0].e());
                c(sx7Var, sx7Var2, 1, v38Var);
                return;
            }
            return;
        }
        o86 o86Var6 = o86VarArr2[1];
        if (o86Var6.f != null) {
            sx7 h8 = ynv.h(o86Var6);
            if (h8 != null) {
                ynv.b(sx7Var, h8, -this.b.R[1].e());
                c(sx7Var2, sx7Var, -1, v38Var);
                return;
            }
            return;
        }
        if ((aa6Var13 instanceof fxd) || (aa6Var3 = aa6Var13.V) == null) {
            return;
        }
        ynv.b(sx7Var2, aa6Var3.d.h, aa6Var13.s());
        c(sx7Var, sx7Var2, 1, v38Var);
    }

    @Override // defpackage.ynv
    public final void e() {
        sx7 sx7Var = this.h;
        if (sx7Var.j) {
            this.b.a0 = sx7Var.g;
        }
    }

    @Override // defpackage.ynv
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.ynv
    public final boolean k() {
        return this.d != z96.c || this.b.r == 0;
    }

    public final void n() {
        this.g = false;
        sx7 sx7Var = this.h;
        sx7Var.c();
        sx7Var.j = false;
        sx7 sx7Var2 = this.i;
        sx7Var2.c();
        sx7Var2.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.k0;
    }
}
