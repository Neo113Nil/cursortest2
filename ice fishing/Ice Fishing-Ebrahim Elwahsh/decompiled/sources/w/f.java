package w;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f41499a;

    /* renamed from: d, reason: collision with root package name */
    public C5143c f41502d;

    /* renamed from: e, reason: collision with root package name */
    public C5143c f41503e;

    /* renamed from: f, reason: collision with root package name */
    public C5143c f41504f;

    /* renamed from: g, reason: collision with root package name */
    public C5143c f41505g;

    /* renamed from: h, reason: collision with root package name */
    public int f41506h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f41507j;

    /* renamed from: k, reason: collision with root package name */
    public int f41508k;

    /* renamed from: q, reason: collision with root package name */
    public int f41514q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f41515r;

    /* renamed from: b, reason: collision with root package name */
    public C5144d f41500b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f41501c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f41509l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f41510m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f41511n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f41512o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f41513p = 0;

    public f(g gVar, int i, C5143c c5143c, C5143c c5143c2, C5143c c5143c3, C5143c c5143c4, int i4) {
        this.f41515r = gVar;
        this.f41499a = i;
        this.f41502d = c5143c;
        this.f41503e = c5143c2;
        this.f41504f = c5143c3;
        this.f41505g = c5143c4;
        this.f41506h = gVar.f41547w0;
        this.i = gVar.f41543s0;
        this.f41507j = gVar.f41548x0;
        this.f41508k = gVar.f41544t0;
        this.f41514q = i4;
    }

    public final void a(C5144d c5144d) {
        int i = this.f41499a;
        g gVar = this.f41515r;
        if (i == 0) {
            int U7 = gVar.U(c5144d, this.f41514q);
            if (c5144d.f41467p0[0] == 3) {
                this.f41513p++;
                U7 = 0;
            }
            this.f41509l = U7 + (c5144d.f41451g0 != 8 ? gVar.f41530P0 : 0) + this.f41509l;
            int T8 = gVar.T(c5144d, this.f41514q);
            if (this.f41500b == null || this.f41501c < T8) {
                this.f41500b = c5144d;
                this.f41501c = T8;
                this.f41510m = T8;
            }
        } else {
            int U8 = gVar.U(c5144d, this.f41514q);
            int T9 = gVar.T(c5144d, this.f41514q);
            if (c5144d.f41467p0[1] == 3) {
                this.f41513p++;
                T9 = 0;
            }
            this.f41510m = T9 + (c5144d.f41451g0 != 8 ? gVar.f41531Q0 : 0) + this.f41510m;
            if (this.f41500b == null || this.f41501c < U8) {
                this.f41500b = c5144d;
                this.f41501c = U8;
                this.f41509l = U8;
            }
        }
        this.f41512o++;
    }

    public final void b(int i, boolean z8, boolean z9) {
        g gVar;
        int i4;
        int i9;
        C5144d c5144d;
        boolean z10;
        char c4;
        float f6;
        float f9;
        int i10;
        float f10;
        float f11;
        int i11;
        int i12 = this.f41512o;
        int i13 = 0;
        while (true) {
            gVar = this.f41515r;
            if (i13 >= i12 || (i11 = this.f41511n + i13) >= gVar.f41542b1) {
                break;
            }
            C5144d c5144d2 = gVar.f41541a1[i11];
            if (c5144d2 != null) {
                c5144d2.D();
            }
            i13++;
        }
        if (i12 == 0 || this.f41500b == null) {
            return;
        }
        boolean z11 = z9 && i == 0;
        int i14 = -1;
        int i15 = -1;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = this.f41511n + (z8 ? (i12 - 1) - i16 : i16);
            if (i17 >= gVar.f41542b1) {
                break;
            }
            C5144d c5144d3 = gVar.f41541a1[i17];
            if (c5144d3 != null && c5144d3.f41451g0 == 0) {
                if (i14 == -1) {
                    i14 = i16;
                }
                i15 = i16;
            }
        }
        if (this.f41499a != 0) {
            boolean z12 = z11;
            C5144d c5144d4 = this.f41500b;
            c5144d4.f41454i0 = gVar.f41518D0;
            int i18 = this.f41506h;
            if (i > 0) {
                i18 += gVar.f41530P0;
            }
            C5143c c5143c = c5144d4.f41422I;
            C5143c c5143c2 = c5144d4.f41423K;
            if (z8) {
                c5143c2.a(this.f41504f, i18);
                if (z9) {
                    c5143c.a(this.f41502d, this.f41507j);
                }
                if (i > 0) {
                    this.f41504f.f41409d.f41422I.a(c5143c2, 0);
                }
            } else {
                c5143c.a(this.f41502d, i18);
                if (z9) {
                    c5143c2.a(this.f41504f, this.f41507j);
                }
                if (i > 0) {
                    this.f41502d.f41409d.f41423K.a(c5143c, 0);
                }
            }
            C5144d c5144d5 = null;
            for (int i19 = 0; i19 < i12; i19++) {
                int i20 = this.f41511n + i19;
                if (i20 >= gVar.f41542b1) {
                    return;
                }
                C5144d c5144d6 = gVar.f41541a1[i20];
                if (c5144d6 != null) {
                    C5143c c5143c3 = c5144d6.J;
                    if (i19 == 0) {
                        c5144d6.f(c5143c3, this.f41503e, this.i);
                        int i21 = gVar.f41519E0;
                        float f12 = gVar.f41525K0;
                        if (this.f41511n == 0) {
                            i9 = gVar.f41521G0;
                            i4 = -1;
                            if (i9 != -1) {
                                f12 = gVar.f41527M0;
                                i21 = i9;
                                c5144d6.f41456j0 = i21;
                                c5144d6.f41447e0 = f12;
                            }
                        } else {
                            i4 = -1;
                        }
                        if (z9 && (i9 = gVar.f41523I0) != i4) {
                            f12 = gVar.f41529O0;
                            i21 = i9;
                        }
                        c5144d6.f41456j0 = i21;
                        c5144d6.f41447e0 = f12;
                    }
                    if (i19 == i12 - 1) {
                        c5144d6.f(c5144d6.f41424L, this.f41505g, this.f41508k);
                    }
                    if (c5144d5 != null) {
                        int i22 = gVar.f41531Q0;
                        C5143c c5143c4 = c5144d5.f41424L;
                        c5143c3.a(c5143c4, i22);
                        if (i19 == i14) {
                            int i23 = this.i;
                            if (c5143c3.h()) {
                                c5143c3.f41413h = i23;
                            }
                        }
                        c5143c4.a(c5143c3, 0);
                        if (i19 == i15 + 1) {
                            int i24 = this.f41508k;
                            if (c5143c4.h()) {
                                c5143c4.f41413h = i24;
                            }
                        }
                    }
                    if (c5144d6 != c5144d4) {
                        C5143c c5143c5 = c5144d6.f41423K;
                        C5143c c5143c6 = c5144d6.f41422I;
                        if (z8) {
                            int i25 = gVar.f41532R0;
                            if (i25 == 0) {
                                c5143c5.a(c5143c2, 0);
                            } else if (i25 == 1) {
                                c5143c6.a(c5143c, 0);
                            } else if (i25 == 2) {
                                c5143c6.a(c5143c, 0);
                                c5143c5.a(c5143c2, 0);
                            }
                        } else {
                            int i26 = gVar.f41532R0;
                            if (i26 == 0) {
                                c5143c6.a(c5143c, 0);
                            } else if (i26 == 1) {
                                c5143c5.a(c5143c2, 0);
                            } else if (i26 == 2) {
                                if (z12) {
                                    c5143c6.a(this.f41502d, this.f41506h);
                                    c5143c5.a(this.f41504f, this.f41507j);
                                } else {
                                    c5143c6.a(c5143c, 0);
                                    c5143c5.a(c5143c2, 0);
                                }
                            }
                            c5144d5 = c5144d6;
                        }
                    }
                    c5144d5 = c5144d6;
                }
            }
            return;
        }
        C5144d c5144d7 = this.f41500b;
        c5144d7.f41456j0 = gVar.f41519E0;
        int i27 = this.i;
        if (i > 0) {
            i27 += gVar.f41531Q0;
        }
        C5143c c5143c7 = this.f41503e;
        C5143c c5143c8 = c5144d7.J;
        c5143c8.a(c5143c7, i27);
        C5143c c5143c9 = c5144d7.f41424L;
        if (z9) {
            c5143c9.a(this.f41505g, this.f41508k);
        }
        if (i > 0) {
            this.f41503e.f41409d.f41424L.a(c5143c8, 0);
        }
        if (gVar.f41533S0 == 3 && !c5144d7.f41418E) {
            for (int i28 = 0; i28 < i12; i28++) {
                int i29 = this.f41511n + (z8 ? (i12 - 1) - i28 : i28);
                if (i29 >= gVar.f41542b1) {
                    break;
                }
                c5144d = gVar.f41541a1[i29];
                if (c5144d.f41418E) {
                    break;
                }
            }
        }
        c5144d = c5144d7;
        int i30 = 0;
        C5144d c5144d8 = null;
        while (i30 < i12) {
            int i31 = z8 ? (i12 - 1) - i30 : i30;
            int i32 = this.f41511n + i31;
            if (i32 >= gVar.f41542b1) {
                return;
            }
            C5144d c5144d9 = gVar.f41541a1[i32];
            if (c5144d9 == null) {
                z10 = z11;
                c4 = 3;
            } else {
                C5143c c5143c10 = c5144d9.f41422I;
                if (i30 == 0) {
                    c5144d9.f(c5143c10, this.f41502d, this.f41506h);
                }
                if (i31 == 0) {
                    int i33 = gVar.f41518D0;
                    if (z8) {
                        f6 = 1.0f;
                        f9 = 1.0f - gVar.f41524J0;
                    } else {
                        f6 = 1.0f;
                        f9 = gVar.f41524J0;
                    }
                    if (this.f41511n == 0) {
                        i10 = gVar.f41520F0;
                        z10 = z11;
                        if (i10 != -1) {
                            if (z8) {
                                f11 = gVar.f41526L0;
                                f9 = f6 - f11;
                                c5144d9.f41454i0 = i10;
                                c5144d9.f41445d0 = f9;
                            } else {
                                f10 = gVar.f41526L0;
                                f9 = f10;
                                c5144d9.f41454i0 = i10;
                                c5144d9.f41445d0 = f9;
                            }
                        }
                    } else {
                        z10 = z11;
                    }
                    if (!z9 || (i10 = gVar.f41522H0) == -1) {
                        i10 = i33;
                        c5144d9.f41454i0 = i10;
                        c5144d9.f41445d0 = f9;
                    } else if (z8) {
                        f11 = gVar.f41528N0;
                        f9 = f6 - f11;
                        c5144d9.f41454i0 = i10;
                        c5144d9.f41445d0 = f9;
                    } else {
                        f10 = gVar.f41528N0;
                        f9 = f10;
                        c5144d9.f41454i0 = i10;
                        c5144d9.f41445d0 = f9;
                    }
                } else {
                    z10 = z11;
                }
                if (i30 == i12 - 1) {
                    c5144d9.f(c5144d9.f41423K, this.f41504f, this.f41507j);
                }
                if (c5144d8 != null) {
                    int i34 = gVar.f41530P0;
                    C5143c c5143c11 = c5144d8.f41423K;
                    c5143c10.a(c5143c11, i34);
                    if (i30 == i14) {
                        int i35 = this.f41506h;
                        if (c5143c10.h()) {
                            c5143c10.f41413h = i35;
                        }
                    }
                    c5143c11.a(c5143c10, 0);
                    if (i30 == i15 + 1) {
                        int i36 = this.f41507j;
                        if (c5143c11.h()) {
                            c5143c11.f41413h = i36;
                        }
                    }
                }
                if (c5144d9 != c5144d7) {
                    int i37 = gVar.f41533S0;
                    c4 = 3;
                    if (i37 == 3 && c5144d.f41418E && c5144d9 != c5144d && c5144d9.f41418E) {
                        c5144d9.f41425M.a(c5144d.f41425M, 0);
                    } else {
                        C5143c c5143c12 = c5144d9.J;
                        if (i37 != 0) {
                            C5143c c5143c13 = c5144d9.f41424L;
                            if (i37 == 1) {
                                c5143c13.a(c5143c9, 0);
                            } else if (z10) {
                                c5143c12.a(this.f41503e, this.i);
                                c5143c13.a(this.f41505g, this.f41508k);
                            } else {
                                c5143c12.a(c5143c8, 0);
                                c5143c13.a(c5143c9, 0);
                            }
                        } else {
                            c5143c12.a(c5143c8, 0);
                        }
                    }
                } else {
                    c4 = 3;
                }
                c5144d8 = c5144d9;
            }
            i30++;
            z11 = z10;
        }
    }

    public final int c() {
        return this.f41499a == 1 ? this.f41510m - this.f41515r.f41531Q0 : this.f41510m;
    }

    public final int d() {
        return this.f41499a == 0 ? this.f41509l - this.f41515r.f41530P0 : this.f41509l;
    }

    public final void e(int i) {
        g gVar;
        int i4;
        int i9 = this.f41513p;
        if (i9 == 0) {
            return;
        }
        int i10 = this.f41512o;
        int i11 = i / i9;
        int i12 = 0;
        while (true) {
            gVar = this.f41515r;
            if (i12 >= i10 || (i4 = this.f41511n + i12) >= gVar.f41542b1) {
                break;
            }
            C5144d c5144d = gVar.f41541a1[i4];
            if (this.f41499a == 0) {
                if (c5144d != null) {
                    int[] iArr = c5144d.f41467p0;
                    if (iArr[0] == 3 && c5144d.f41469r == 0) {
                        gVar.V(1, i11, iArr[1], c5144d.k(), c5144d);
                    }
                }
            } else if (c5144d != null) {
                int[] iArr2 = c5144d.f41467p0;
                if (iArr2[1] == 3 && c5144d.f41470s == 0) {
                    int i13 = iArr2[0];
                    int i14 = i11;
                    gVar.V(i13, c5144d.q(), 1, i14, c5144d);
                    i11 = i14;
                }
            }
            i12++;
        }
        this.f41509l = 0;
        this.f41510m = 0;
        this.f41500b = null;
        this.f41501c = 0;
        int i15 = this.f41512o;
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = this.f41511n + i16;
            if (i17 >= gVar.f41542b1) {
                return;
            }
            C5144d c5144d2 = gVar.f41541a1[i17];
            if (this.f41499a == 0) {
                int q6 = c5144d2.q();
                int i18 = gVar.f41530P0;
                if (c5144d2.f41451g0 == 8) {
                    i18 = 0;
                }
                this.f41509l = q6 + i18 + this.f41509l;
                int T8 = gVar.T(c5144d2, this.f41514q);
                if (this.f41500b == null || this.f41501c < T8) {
                    this.f41500b = c5144d2;
                    this.f41501c = T8;
                    this.f41510m = T8;
                }
            } else {
                int U7 = gVar.U(c5144d2, this.f41514q);
                int T9 = gVar.T(c5144d2, this.f41514q);
                int i19 = gVar.f41531Q0;
                if (c5144d2.f41451g0 == 8) {
                    i19 = 0;
                }
                this.f41510m = T9 + i19 + this.f41510m;
                if (this.f41500b == null || this.f41501c < U7) {
                    this.f41500b = c5144d2;
                    this.f41501c = U7;
                    this.f41509l = U7;
                }
            }
        }
    }

    public final void f(int i, C5143c c5143c, C5143c c5143c2, C5143c c5143c3, C5143c c5143c4, int i4, int i9, int i10, int i11, int i12) {
        this.f41499a = i;
        this.f41502d = c5143c;
        this.f41503e = c5143c2;
        this.f41504f = c5143c3;
        this.f41505g = c5143c4;
        this.f41506h = i4;
        this.i = i9;
        this.f41507j = i10;
        this.f41508k = i11;
        this.f41514q = i12;
    }
}
