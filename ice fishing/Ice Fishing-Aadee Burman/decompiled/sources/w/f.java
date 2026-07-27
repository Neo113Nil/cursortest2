package w;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f41561a;

    /* renamed from: d, reason: collision with root package name */
    public C5138c f41564d;

    /* renamed from: e, reason: collision with root package name */
    public C5138c f41565e;

    /* renamed from: f, reason: collision with root package name */
    public C5138c f41566f;

    /* renamed from: g, reason: collision with root package name */
    public C5138c f41567g;

    /* renamed from: h, reason: collision with root package name */
    public int f41568h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f41569j;

    /* renamed from: k, reason: collision with root package name */
    public int f41570k;

    /* renamed from: q, reason: collision with root package name */
    public int f41576q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f41577r;

    /* renamed from: b, reason: collision with root package name */
    public C5139d f41562b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f41563c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f41571l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f41572m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f41573n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f41574o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f41575p = 0;

    public f(g gVar, int i, C5138c c5138c, C5138c c5138c2, C5138c c5138c3, C5138c c5138c4, int i6) {
        this.f41577r = gVar;
        this.f41561a = i;
        this.f41564d = c5138c;
        this.f41565e = c5138c2;
        this.f41566f = c5138c3;
        this.f41567g = c5138c4;
        this.f41568h = gVar.f41609w0;
        this.i = gVar.f41605s0;
        this.f41569j = gVar.f41610x0;
        this.f41570k = gVar.f41606t0;
        this.f41576q = i6;
    }

    public final void a(C5139d c5139d) {
        int i = this.f41561a;
        g gVar = this.f41577r;
        if (i == 0) {
            int U3 = gVar.U(c5139d, this.f41576q);
            if (c5139d.f41529p0[0] == 3) {
                this.f41575p++;
                U3 = 0;
            }
            this.f41571l = U3 + (c5139d.f41513g0 != 8 ? gVar.f41592P0 : 0) + this.f41571l;
            int T8 = gVar.T(c5139d, this.f41576q);
            if (this.f41562b == null || this.f41563c < T8) {
                this.f41562b = c5139d;
                this.f41563c = T8;
                this.f41572m = T8;
            }
        } else {
            int U8 = gVar.U(c5139d, this.f41576q);
            int T9 = gVar.T(c5139d, this.f41576q);
            if (c5139d.f41529p0[1] == 3) {
                this.f41575p++;
                T9 = 0;
            }
            this.f41572m = T9 + (c5139d.f41513g0 != 8 ? gVar.f41593Q0 : 0) + this.f41572m;
            if (this.f41562b == null || this.f41563c < U8) {
                this.f41562b = c5139d;
                this.f41563c = U8;
                this.f41571l = U8;
            }
        }
        this.f41574o++;
    }

    public final void b(int i, boolean z3, boolean z6) {
        g gVar;
        int i6;
        int i9;
        C5139d c5139d;
        boolean z9;
        char c9;
        float f3;
        float f9;
        int i10;
        float f10;
        float f11;
        int i11;
        int i12 = this.f41574o;
        int i13 = 0;
        while (true) {
            gVar = this.f41577r;
            if (i13 >= i12 || (i11 = this.f41573n + i13) >= gVar.f41604b1) {
                break;
            }
            C5139d c5139d2 = gVar.f41603a1[i11];
            if (c5139d2 != null) {
                c5139d2.D();
            }
            i13++;
        }
        if (i12 == 0 || this.f41562b == null) {
            return;
        }
        boolean z10 = z6 && i == 0;
        int i14 = -1;
        int i15 = -1;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = this.f41573n + (z3 ? (i12 - 1) - i16 : i16);
            if (i17 >= gVar.f41604b1) {
                break;
            }
            C5139d c5139d3 = gVar.f41603a1[i17];
            if (c5139d3 != null && c5139d3.f41513g0 == 0) {
                if (i14 == -1) {
                    i14 = i16;
                }
                i15 = i16;
            }
        }
        if (this.f41561a != 0) {
            boolean z11 = z10;
            C5139d c5139d4 = this.f41562b;
            c5139d4.f41516i0 = gVar.f41580D0;
            int i18 = this.f41568h;
            if (i > 0) {
                i18 += gVar.f41592P0;
            }
            C5138c c5138c = c5139d4.f41484I;
            C5138c c5138c2 = c5139d4.f41485K;
            if (z3) {
                c5138c2.a(this.f41566f, i18);
                if (z6) {
                    c5138c.a(this.f41564d, this.f41569j);
                }
                if (i > 0) {
                    this.f41566f.f41471d.f41484I.a(c5138c2, 0);
                }
            } else {
                c5138c.a(this.f41564d, i18);
                if (z6) {
                    c5138c2.a(this.f41566f, this.f41569j);
                }
                if (i > 0) {
                    this.f41564d.f41471d.f41485K.a(c5138c, 0);
                }
            }
            C5139d c5139d5 = null;
            for (int i19 = 0; i19 < i12; i19++) {
                int i20 = this.f41573n + i19;
                if (i20 >= gVar.f41604b1) {
                    return;
                }
                C5139d c5139d6 = gVar.f41603a1[i20];
                if (c5139d6 != null) {
                    C5138c c5138c3 = c5139d6.J;
                    if (i19 == 0) {
                        c5139d6.f(c5138c3, this.f41565e, this.i);
                        int i21 = gVar.f41581E0;
                        float f12 = gVar.f41587K0;
                        if (this.f41573n == 0) {
                            i9 = gVar.f41583G0;
                            i6 = -1;
                            if (i9 != -1) {
                                f12 = gVar.f41589M0;
                                i21 = i9;
                                c5139d6.f41518j0 = i21;
                                c5139d6.f41509e0 = f12;
                            }
                        } else {
                            i6 = -1;
                        }
                        if (z6 && (i9 = gVar.f41585I0) != i6) {
                            f12 = gVar.f41591O0;
                            i21 = i9;
                        }
                        c5139d6.f41518j0 = i21;
                        c5139d6.f41509e0 = f12;
                    }
                    if (i19 == i12 - 1) {
                        c5139d6.f(c5139d6.f41486L, this.f41567g, this.f41570k);
                    }
                    if (c5139d5 != null) {
                        int i22 = gVar.f41593Q0;
                        C5138c c5138c4 = c5139d5.f41486L;
                        c5138c3.a(c5138c4, i22);
                        if (i19 == i14) {
                            int i23 = this.i;
                            if (c5138c3.h()) {
                                c5138c3.f41475h = i23;
                            }
                        }
                        c5138c4.a(c5138c3, 0);
                        if (i19 == i15 + 1) {
                            int i24 = this.f41570k;
                            if (c5138c4.h()) {
                                c5138c4.f41475h = i24;
                            }
                        }
                    }
                    if (c5139d6 != c5139d4) {
                        C5138c c5138c5 = c5139d6.f41485K;
                        C5138c c5138c6 = c5139d6.f41484I;
                        if (z3) {
                            int i25 = gVar.f41594R0;
                            if (i25 == 0) {
                                c5138c5.a(c5138c2, 0);
                            } else if (i25 == 1) {
                                c5138c6.a(c5138c, 0);
                            } else if (i25 == 2) {
                                c5138c6.a(c5138c, 0);
                                c5138c5.a(c5138c2, 0);
                            }
                        } else {
                            int i26 = gVar.f41594R0;
                            if (i26 == 0) {
                                c5138c6.a(c5138c, 0);
                            } else if (i26 == 1) {
                                c5138c5.a(c5138c2, 0);
                            } else if (i26 == 2) {
                                if (z11) {
                                    c5138c6.a(this.f41564d, this.f41568h);
                                    c5138c5.a(this.f41566f, this.f41569j);
                                } else {
                                    c5138c6.a(c5138c, 0);
                                    c5138c5.a(c5138c2, 0);
                                }
                            }
                            c5139d5 = c5139d6;
                        }
                    }
                    c5139d5 = c5139d6;
                }
            }
            return;
        }
        C5139d c5139d7 = this.f41562b;
        c5139d7.f41518j0 = gVar.f41581E0;
        int i27 = this.i;
        if (i > 0) {
            i27 += gVar.f41593Q0;
        }
        C5138c c5138c7 = this.f41565e;
        C5138c c5138c8 = c5139d7.J;
        c5138c8.a(c5138c7, i27);
        C5138c c5138c9 = c5139d7.f41486L;
        if (z6) {
            c5138c9.a(this.f41567g, this.f41570k);
        }
        if (i > 0) {
            this.f41565e.f41471d.f41486L.a(c5138c8, 0);
        }
        if (gVar.f41595S0 == 3 && !c5139d7.f41480E) {
            for (int i28 = 0; i28 < i12; i28++) {
                int i29 = this.f41573n + (z3 ? (i12 - 1) - i28 : i28);
                if (i29 >= gVar.f41604b1) {
                    break;
                }
                c5139d = gVar.f41603a1[i29];
                if (c5139d.f41480E) {
                    break;
                }
            }
        }
        c5139d = c5139d7;
        int i30 = 0;
        C5139d c5139d8 = null;
        while (i30 < i12) {
            int i31 = z3 ? (i12 - 1) - i30 : i30;
            int i32 = this.f41573n + i31;
            if (i32 >= gVar.f41604b1) {
                return;
            }
            C5139d c5139d9 = gVar.f41603a1[i32];
            if (c5139d9 == null) {
                z9 = z10;
                c9 = 3;
            } else {
                C5138c c5138c10 = c5139d9.f41484I;
                if (i30 == 0) {
                    c5139d9.f(c5138c10, this.f41564d, this.f41568h);
                }
                if (i31 == 0) {
                    int i33 = gVar.f41580D0;
                    if (z3) {
                        f3 = 1.0f;
                        f9 = 1.0f - gVar.f41586J0;
                    } else {
                        f3 = 1.0f;
                        f9 = gVar.f41586J0;
                    }
                    if (this.f41573n == 0) {
                        i10 = gVar.f41582F0;
                        z9 = z10;
                        if (i10 != -1) {
                            if (z3) {
                                f11 = gVar.f41588L0;
                                f9 = f3 - f11;
                                c5139d9.f41516i0 = i10;
                                c5139d9.f41507d0 = f9;
                            } else {
                                f10 = gVar.f41588L0;
                                f9 = f10;
                                c5139d9.f41516i0 = i10;
                                c5139d9.f41507d0 = f9;
                            }
                        }
                    } else {
                        z9 = z10;
                    }
                    if (!z6 || (i10 = gVar.f41584H0) == -1) {
                        i10 = i33;
                        c5139d9.f41516i0 = i10;
                        c5139d9.f41507d0 = f9;
                    } else if (z3) {
                        f11 = gVar.f41590N0;
                        f9 = f3 - f11;
                        c5139d9.f41516i0 = i10;
                        c5139d9.f41507d0 = f9;
                    } else {
                        f10 = gVar.f41590N0;
                        f9 = f10;
                        c5139d9.f41516i0 = i10;
                        c5139d9.f41507d0 = f9;
                    }
                } else {
                    z9 = z10;
                }
                if (i30 == i12 - 1) {
                    c5139d9.f(c5139d9.f41485K, this.f41566f, this.f41569j);
                }
                if (c5139d8 != null) {
                    int i34 = gVar.f41592P0;
                    C5138c c5138c11 = c5139d8.f41485K;
                    c5138c10.a(c5138c11, i34);
                    if (i30 == i14) {
                        int i35 = this.f41568h;
                        if (c5138c10.h()) {
                            c5138c10.f41475h = i35;
                        }
                    }
                    c5138c11.a(c5138c10, 0);
                    if (i30 == i15 + 1) {
                        int i36 = this.f41569j;
                        if (c5138c11.h()) {
                            c5138c11.f41475h = i36;
                        }
                    }
                }
                if (c5139d9 != c5139d7) {
                    int i37 = gVar.f41595S0;
                    c9 = 3;
                    if (i37 == 3 && c5139d.f41480E && c5139d9 != c5139d && c5139d9.f41480E) {
                        c5139d9.f41487M.a(c5139d.f41487M, 0);
                    } else {
                        C5138c c5138c12 = c5139d9.J;
                        if (i37 != 0) {
                            C5138c c5138c13 = c5139d9.f41486L;
                            if (i37 == 1) {
                                c5138c13.a(c5138c9, 0);
                            } else if (z9) {
                                c5138c12.a(this.f41565e, this.i);
                                c5138c13.a(this.f41567g, this.f41570k);
                            } else {
                                c5138c12.a(c5138c8, 0);
                                c5138c13.a(c5138c9, 0);
                            }
                        } else {
                            c5138c12.a(c5138c8, 0);
                        }
                    }
                } else {
                    c9 = 3;
                }
                c5139d8 = c5139d9;
            }
            i30++;
            z10 = z9;
        }
    }

    public final int c() {
        return this.f41561a == 1 ? this.f41572m - this.f41577r.f41593Q0 : this.f41572m;
    }

    public final int d() {
        return this.f41561a == 0 ? this.f41571l - this.f41577r.f41592P0 : this.f41571l;
    }

    public final void e(int i) {
        g gVar;
        int i6;
        int i9 = this.f41575p;
        if (i9 == 0) {
            return;
        }
        int i10 = this.f41574o;
        int i11 = i / i9;
        int i12 = 0;
        while (true) {
            gVar = this.f41577r;
            if (i12 >= i10 || (i6 = this.f41573n + i12) >= gVar.f41604b1) {
                break;
            }
            C5139d c5139d = gVar.f41603a1[i6];
            if (this.f41561a == 0) {
                if (c5139d != null) {
                    int[] iArr = c5139d.f41529p0;
                    if (iArr[0] == 3 && c5139d.f41531r == 0) {
                        gVar.V(1, i11, iArr[1], c5139d.k(), c5139d);
                    }
                }
            } else if (c5139d != null) {
                int[] iArr2 = c5139d.f41529p0;
                if (iArr2[1] == 3 && c5139d.f41532s == 0) {
                    int i13 = iArr2[0];
                    int i14 = i11;
                    gVar.V(i13, c5139d.q(), 1, i14, c5139d);
                    i11 = i14;
                }
            }
            i12++;
        }
        this.f41571l = 0;
        this.f41572m = 0;
        this.f41562b = null;
        this.f41563c = 0;
        int i15 = this.f41574o;
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = this.f41573n + i16;
            if (i17 >= gVar.f41604b1) {
                return;
            }
            C5139d c5139d2 = gVar.f41603a1[i17];
            if (this.f41561a == 0) {
                int q8 = c5139d2.q();
                int i18 = gVar.f41592P0;
                if (c5139d2.f41513g0 == 8) {
                    i18 = 0;
                }
                this.f41571l = q8 + i18 + this.f41571l;
                int T8 = gVar.T(c5139d2, this.f41576q);
                if (this.f41562b == null || this.f41563c < T8) {
                    this.f41562b = c5139d2;
                    this.f41563c = T8;
                    this.f41572m = T8;
                }
            } else {
                int U3 = gVar.U(c5139d2, this.f41576q);
                int T9 = gVar.T(c5139d2, this.f41576q);
                int i19 = gVar.f41593Q0;
                if (c5139d2.f41513g0 == 8) {
                    i19 = 0;
                }
                this.f41572m = T9 + i19 + this.f41572m;
                if (this.f41562b == null || this.f41563c < U3) {
                    this.f41562b = c5139d2;
                    this.f41563c = U3;
                    this.f41571l = U3;
                }
            }
        }
    }

    public final void f(int i, C5138c c5138c, C5138c c5138c2, C5138c c5138c3, C5138c c5138c4, int i6, int i9, int i10, int i11, int i12) {
        this.f41561a = i;
        this.f41564d = c5138c;
        this.f41565e = c5138c2;
        this.f41566f = c5138c3;
        this.f41567g = c5138c4;
        this.f41568h = i6;
        this.i = i9;
        this.f41569j = i10;
        this.f41570k = i11;
        this.f41576q = i12;
    }
}
