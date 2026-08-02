package defpackage;

/* loaded from: classes.dex */
public final class ojc {
    public int a;
    public o86 d;
    public o86 e;
    public o86 f;
    public o86 g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int q;
    public final /* synthetic */ qjc r;
    public aa6 b = null;
    public int c = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;

    public ojc(qjc qjcVar, int i, o86 o86Var, o86 o86Var2, o86 o86Var3, o86 o86Var4, int i2) {
        this.r = qjcVar;
        this.a = i;
        this.d = o86Var;
        this.e = o86Var2;
        this.f = o86Var3;
        this.g = o86Var4;
        this.h = qjcVar.A0;
        this.i = qjcVar.w0;
        this.j = qjcVar.B0;
        this.k = qjcVar.x0;
        this.q = i2;
    }

    public final void a(aa6 aa6Var) {
        int i = this.a;
        int i2 = this.q;
        z96 z96Var = z96.c;
        qjc qjcVar = this.r;
        if (i == 0) {
            int Y = qjcVar.Y(aa6Var, i2);
            if (aa6Var.U[0] == z96Var) {
                this.p++;
                Y = 0;
            }
            this.l = Y + (aa6Var.i0 != 8 ? qjcVar.T0 : 0) + this.l;
            int X = qjcVar.X(aa6Var, this.q);
            if (this.b == null || this.c < X) {
                this.b = aa6Var;
                this.c = X;
                this.m = X;
            }
        } else {
            int Y2 = qjcVar.Y(aa6Var, i2);
            int X2 = qjcVar.X(aa6Var, this.q);
            if (aa6Var.U[1] == z96Var) {
                this.p++;
                X2 = 0;
            }
            this.m = X2 + (aa6Var.i0 != 8 ? qjcVar.U0 : 0) + this.m;
            if (this.b == null || this.c < Y2) {
                this.b = aa6Var;
                this.c = Y2;
                this.l = Y2;
            }
        }
        this.o++;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0103, code lost:
    
        if (r24 != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0105, code lost:
    
        r9 = 1.0f - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0115, code lost:
    
        if (r24 != false) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, boolean z, boolean z2) {
        qjc qjcVar;
        int i2;
        int i3;
        int i4;
        aa6 aa6Var;
        boolean z3;
        int i5;
        int i6;
        char c;
        float f;
        int i7;
        float f2;
        int i8;
        int i9 = this.o;
        int i10 = 0;
        while (true) {
            qjcVar = this.r;
            if (i10 >= i9 || (i8 = this.n + i10) >= qjcVar.f1) {
                break;
            }
            aa6 aa6Var2 = qjcVar.e1[i8];
            if (aa6Var2 != null) {
                aa6Var2.E();
            }
            i10++;
        }
        if (i9 == 0 || this.b == null) {
            return;
        }
        boolean z4 = z2 && i == 0;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = this.n + (z ? (i9 - 1) - i13 : i13);
            if (i14 >= qjcVar.f1) {
                break;
            }
            aa6 aa6Var3 = qjcVar.e1[i14];
            if (aa6Var3 != null && aa6Var3.i0 == 0) {
                if (i11 == -1) {
                    i11 = i13;
                }
                i12 = i13;
            }
        }
        int i15 = this.a;
        aa6 aa6Var4 = this.b;
        if (i15 == 0) {
            aa6Var4.m0 = qjcVar.I0;
            o86 o86Var = aa6Var4.M;
            o86 o86Var2 = aa6Var4.K;
            int i16 = this.i;
            if (i > 0) {
                i16 += qjcVar.U0;
            }
            o86Var2.a(this.e, i16);
            if (z2) {
                o86Var.a(this.g, this.k);
            }
            if (i > 0) {
                this.e.d.M.a(o86Var2, 0);
            }
            if (qjcVar.W0 == 3 && !aa6Var4.E) {
                for (int i17 = 0; i17 < i9; i17++) {
                    int i18 = this.n + (z ? (i9 - 1) - i17 : i17);
                    if (i18 >= qjcVar.f1) {
                        break;
                    }
                    aa6Var = qjcVar.e1[i18];
                    if (aa6Var.E) {
                        break;
                    }
                }
            }
            aa6Var = aa6Var4;
            int i19 = 0;
            aa6 aa6Var5 = null;
            while (i19 < i9) {
                int i20 = z ? (i9 - 1) - i19 : i19;
                int i21 = this.n + i20;
                if (i21 >= qjcVar.f1) {
                    return;
                }
                aa6 aa6Var6 = qjcVar.e1[i21];
                if (aa6Var6 == null) {
                    i6 = i9;
                    z3 = z4;
                    i5 = i12;
                    c = 3;
                } else {
                    o86 o86Var3 = aa6Var6.K;
                    o86 o86Var4 = aa6Var6.M;
                    o86 o86Var5 = aa6Var6.J;
                    z3 = z4;
                    if (i19 == 0) {
                        i5 = i12;
                        aa6Var6.f(o86Var5, this.d, this.h);
                    } else {
                        i5 = i12;
                    }
                    if (i20 == 0) {
                        int i22 = qjcVar.H0;
                        float f3 = qjcVar.N0;
                        if (z) {
                            f3 = 1.0f - f3;
                        }
                        if (this.n == 0) {
                            i7 = qjcVar.J0;
                            f = f3;
                            if (i7 != -1) {
                                f2 = qjcVar.P0;
                            }
                        } else {
                            f = f3;
                        }
                        if (!z2 || (i7 = qjcVar.L0) == -1) {
                            i7 = i22;
                            f2 = f;
                        } else {
                            f2 = qjcVar.R0;
                        }
                        aa6Var6.l0 = i7;
                        aa6Var6.f0 = f2;
                    }
                    if (i19 == i9 - 1) {
                        i6 = i9;
                        aa6Var6.f(aa6Var6.L, this.f, this.j);
                    } else {
                        i6 = i9;
                    }
                    if (aa6Var5 != null) {
                        o86 o86Var6 = aa6Var5.L;
                        o86Var5.a(o86Var6, qjcVar.T0);
                        if (i19 == i11) {
                            int i23 = this.h;
                            if (o86Var5.h()) {
                                o86Var5.h = i23;
                            }
                        }
                        o86Var6.a(o86Var5, 0);
                        if (i19 == i5 + 1) {
                            int i24 = this.j;
                            if (o86Var6.h()) {
                                o86Var6.h = i24;
                            }
                        }
                    }
                    if (aa6Var6 != aa6Var4) {
                        int i25 = qjcVar.W0;
                        c = 3;
                        if (i25 == 3 && aa6Var.E && aa6Var6 != aa6Var && aa6Var6.E) {
                            aa6Var6.N.a(aa6Var.N, 0);
                        } else if (i25 == 0) {
                            o86Var3.a(o86Var2, 0);
                        } else if (i25 == 1) {
                            o86Var4.a(o86Var, 0);
                        } else if (z3) {
                            o86Var3.a(this.e, this.i);
                            o86Var4.a(this.g, this.k);
                        } else {
                            o86Var3.a(o86Var2, 0);
                            o86Var4.a(o86Var, 0);
                        }
                    } else {
                        c = 3;
                    }
                    aa6Var5 = aa6Var6;
                }
                i19++;
                z4 = z3;
                i12 = i5;
                i9 = i6;
            }
            return;
        }
        int i26 = i9;
        boolean z5 = z4;
        int i27 = i12;
        aa6Var4.l0 = qjcVar.H0;
        o86 o86Var7 = aa6Var4.J;
        o86 o86Var8 = aa6Var4.L;
        int i28 = this.h;
        if (i > 0) {
            i28 += qjcVar.T0;
        }
        if (z) {
            o86Var8.a(this.f, i28);
            if (z2) {
                o86Var7.a(this.d, this.j);
            }
            if (i > 0) {
                this.f.d.J.a(o86Var8, 0);
            }
        } else {
            o86Var7.a(this.d, i28);
            if (z2) {
                o86Var8.a(this.f, this.j);
            }
            if (i > 0) {
                this.d.d.L.a(o86Var7, 0);
            }
        }
        int i29 = 0;
        aa6 aa6Var7 = null;
        while (true) {
            int i30 = i26;
            if (i29 >= i30 || (i2 = this.n + i29) >= qjcVar.f1) {
                return;
            }
            aa6 aa6Var8 = qjcVar.e1[i2];
            if (aa6Var8 == null) {
                i26 = i30;
            } else {
                o86 o86Var9 = aa6Var8.J;
                o86 o86Var10 = aa6Var8.K;
                o86 o86Var11 = aa6Var8.L;
                if (i29 == 0) {
                    aa6Var8.f(o86Var10, this.e, this.i);
                    int i31 = qjcVar.I0;
                    float f4 = qjcVar.O0;
                    if (this.n == 0) {
                        i4 = qjcVar.K0;
                        i26 = i30;
                        i3 = -1;
                        if (i4 != -1) {
                            f4 = qjcVar.Q0;
                            i31 = i4;
                            aa6Var8.m0 = i31;
                            aa6Var8.g0 = f4;
                        }
                    } else {
                        i26 = i30;
                        i3 = -1;
                    }
                    if (z2 && (i4 = qjcVar.M0) != i3) {
                        f4 = qjcVar.S0;
                        i31 = i4;
                    }
                    aa6Var8.m0 = i31;
                    aa6Var8.g0 = f4;
                } else {
                    i26 = i30;
                }
                if (i29 == i26 - 1) {
                    aa6Var8.f(aa6Var8.M, this.g, this.k);
                }
                if (aa6Var7 != null) {
                    o86 o86Var12 = aa6Var7.M;
                    o86Var10.a(o86Var12, qjcVar.U0);
                    if (i29 == i11) {
                        int i32 = this.i;
                        if (o86Var10.h()) {
                            o86Var10.h = i32;
                        }
                    }
                    o86Var12.a(o86Var10, 0);
                    if (i29 == i27 + 1) {
                        int i33 = this.k;
                        if (o86Var12.h()) {
                            o86Var12.h = i33;
                        }
                    }
                }
                if (aa6Var8 != aa6Var4) {
                    int i34 = qjcVar.V0;
                    if (!z) {
                        if (i34 == 0) {
                            o86Var9.a(o86Var7, 0);
                        } else if (i34 == 1) {
                            o86Var11.a(o86Var8, 0);
                        } else if (i34 == 2) {
                            if (z5) {
                                o86Var9.a(this.d, this.h);
                                o86Var11.a(this.f, this.j);
                            } else {
                                o86Var9.a(o86Var7, 0);
                                o86Var11.a(o86Var8, 0);
                            }
                        }
                        aa6Var7 = aa6Var8;
                    } else if (i34 == 0) {
                        o86Var11.a(o86Var8, 0);
                    } else if (i34 == 1) {
                        o86Var9.a(o86Var7, 0);
                    } else if (i34 == 2) {
                        o86Var9.a(o86Var7, 0);
                        o86Var11.a(o86Var8, 0);
                    }
                }
                aa6Var7 = aa6Var8;
            }
            i29++;
        }
    }

    public final int c() {
        int i = this.a;
        int i2 = this.m;
        return i == 1 ? i2 - this.r.U0 : i2;
    }

    public final int d() {
        int i = this.a;
        int i2 = this.l;
        return i == 0 ? i2 - this.r.T0 : i2;
    }

    public final void e(int i) {
        qjc qjcVar;
        int i2;
        int i3 = this.p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            qjcVar = this.r;
            if (i6 >= i4 || (i2 = this.n + i6) >= qjcVar.f1) {
                break;
            }
            aa6 aa6Var = qjcVar.e1[i2];
            int i7 = this.a;
            z96 z96Var = z96.a;
            z96 z96Var2 = z96.c;
            if (i7 == 0) {
                if (aa6Var != null) {
                    z96[] z96VarArr = aa6Var.U;
                    if (z96VarArr[0] == z96Var2 && aa6Var.r == 0) {
                        qjcVar.W(aa6Var, z96Var, i5, z96VarArr[1], aa6Var.l());
                    }
                }
            } else if (aa6Var != null) {
                z96[] z96VarArr2 = aa6Var.U;
                if (z96VarArr2[1] == z96Var2 && aa6Var.s == 0) {
                    int i8 = i5;
                    qjcVar.W(aa6Var, z96VarArr2[0], aa6Var.r(), z96Var, i8);
                    i5 = i8;
                }
            }
            i6++;
        }
        this.l = 0;
        this.m = 0;
        this.b = null;
        this.c = 0;
        int i9 = this.o;
        for (int i10 = 0; i10 < i9; i10++) {
            int i11 = this.n + i10;
            if (i11 >= qjcVar.f1) {
                return;
            }
            aa6 aa6Var2 = qjcVar.e1[i11];
            if (this.a == 0) {
                int r = aa6Var2.r();
                int i12 = qjcVar.T0;
                if (aa6Var2.i0 == 8) {
                    i12 = 0;
                }
                this.l = r + i12 + this.l;
                int X = qjcVar.X(aa6Var2, this.q);
                if (this.b == null || this.c < X) {
                    this.b = aa6Var2;
                    this.c = X;
                    this.m = X;
                }
            } else {
                int Y = qjcVar.Y(aa6Var2, this.q);
                int X2 = qjcVar.X(aa6Var2, this.q);
                int i13 = qjcVar.U0;
                if (aa6Var2.i0 == 8) {
                    i13 = 0;
                }
                this.m = X2 + i13 + this.m;
                if (this.b == null || this.c < Y) {
                    this.b = aa6Var2;
                    this.c = Y;
                    this.l = Y;
                }
            }
        }
    }

    public final void f(int i, o86 o86Var, o86 o86Var2, o86 o86Var3, o86 o86Var4, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.d = o86Var;
        this.e = o86Var2;
        this.f = o86Var3;
        this.g = o86Var4;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.q = i6;
    }
}
