package w;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f41564a;

    /* renamed from: d, reason: collision with root package name */
    public C5138c f41567d;

    /* renamed from: e, reason: collision with root package name */
    public C5138c f41568e;

    /* renamed from: f, reason: collision with root package name */
    public C5138c f41569f;

    /* renamed from: g, reason: collision with root package name */
    public C5138c f41570g;

    /* renamed from: h, reason: collision with root package name */
    public int f41571h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f41572j;

    /* renamed from: k, reason: collision with root package name */
    public int f41573k;

    /* renamed from: q, reason: collision with root package name */
    public int f41579q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f41580r;

    /* renamed from: b, reason: collision with root package name */
    public C5139d f41565b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f41566c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f41574l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f41575m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f41576n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f41577o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f41578p = 0;

    public f(g gVar, int i, C5138c c5138c, C5138c c5138c2, C5138c c5138c3, C5138c c5138c4, int i6) {
        this.f41580r = gVar;
        this.f41564a = i;
        this.f41567d = c5138c;
        this.f41568e = c5138c2;
        this.f41569f = c5138c3;
        this.f41570g = c5138c4;
        this.f41571h = gVar.f41612w0;
        this.i = gVar.f41608s0;
        this.f41572j = gVar.f41613x0;
        this.f41573k = gVar.f41609t0;
        this.f41579q = i6;
    }

    public final void a(C5139d c5139d) {
        int i = this.f41564a;
        g gVar = this.f41580r;
        if (i == 0) {
            int U3 = gVar.U(c5139d, this.f41579q);
            if (c5139d.f41532p0[0] == 3) {
                this.f41578p++;
                U3 = 0;
            }
            this.f41574l = U3 + (c5139d.f41516g0 != 8 ? gVar.f41595P0 : 0) + this.f41574l;
            int T8 = gVar.T(c5139d, this.f41579q);
            if (this.f41565b == null || this.f41566c < T8) {
                this.f41565b = c5139d;
                this.f41566c = T8;
                this.f41575m = T8;
            }
        } else {
            int U8 = gVar.U(c5139d, this.f41579q);
            int T9 = gVar.T(c5139d, this.f41579q);
            if (c5139d.f41532p0[1] == 3) {
                this.f41578p++;
                T9 = 0;
            }
            this.f41575m = T9 + (c5139d.f41516g0 != 8 ? gVar.f41596Q0 : 0) + this.f41575m;
            if (this.f41565b == null || this.f41566c < U8) {
                this.f41565b = c5139d;
                this.f41566c = U8;
                this.f41574l = U8;
            }
        }
        this.f41577o++;
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
        int i12 = this.f41577o;
        int i13 = 0;
        while (true) {
            gVar = this.f41580r;
            if (i13 >= i12 || (i11 = this.f41576n + i13) >= gVar.f41607b1) {
                break;
            }
            C5139d c5139d2 = gVar.f41606a1[i11];
            if (c5139d2 != null) {
                c5139d2.D();
            }
            i13++;
        }
        if (i12 == 0 || this.f41565b == null) {
            return;
        }
        boolean z10 = z6 && i == 0;
        int i14 = -1;
        int i15 = -1;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = this.f41576n + (z3 ? (i12 - 1) - i16 : i16);
            if (i17 >= gVar.f41607b1) {
                break;
            }
            C5139d c5139d3 = gVar.f41606a1[i17];
            if (c5139d3 != null && c5139d3.f41516g0 == 0) {
                if (i14 == -1) {
                    i14 = i16;
                }
                i15 = i16;
            }
        }
        if (this.f41564a != 0) {
            boolean z11 = z10;
            C5139d c5139d4 = this.f41565b;
            c5139d4.f41519i0 = gVar.f41583D0;
            int i18 = this.f41571h;
            if (i > 0) {
                i18 += gVar.f41595P0;
            }
            C5138c c5138c = c5139d4.f41487I;
            C5138c c5138c2 = c5139d4.f41488K;
            if (z3) {
                c5138c2.a(this.f41569f, i18);
                if (z6) {
                    c5138c.a(this.f41567d, this.f41572j);
                }
                if (i > 0) {
                    this.f41569f.f41474d.f41487I.a(c5138c2, 0);
                }
            } else {
                c5138c.a(this.f41567d, i18);
                if (z6) {
                    c5138c2.a(this.f41569f, this.f41572j);
                }
                if (i > 0) {
                    this.f41567d.f41474d.f41488K.a(c5138c, 0);
                }
            }
            C5139d c5139d5 = null;
            for (int i19 = 0; i19 < i12; i19++) {
                int i20 = this.f41576n + i19;
                if (i20 >= gVar.f41607b1) {
                    return;
                }
                C5139d c5139d6 = gVar.f41606a1[i20];
                if (c5139d6 != null) {
                    C5138c c5138c3 = c5139d6.J;
                    if (i19 == 0) {
                        c5139d6.f(c5138c3, this.f41568e, this.i);
                        int i21 = gVar.f41584E0;
                        float f12 = gVar.f41590K0;
                        if (this.f41576n == 0) {
                            i9 = gVar.f41586G0;
                            i6 = -1;
                            if (i9 != -1) {
                                f12 = gVar.f41592M0;
                                i21 = i9;
                                c5139d6.f41521j0 = i21;
                                c5139d6.f41512e0 = f12;
                            }
                        } else {
                            i6 = -1;
                        }
                        if (z6 && (i9 = gVar.f41588I0) != i6) {
                            f12 = gVar.f41594O0;
                            i21 = i9;
                        }
                        c5139d6.f41521j0 = i21;
                        c5139d6.f41512e0 = f12;
                    }
                    if (i19 == i12 - 1) {
                        c5139d6.f(c5139d6.f41489L, this.f41570g, this.f41573k);
                    }
                    if (c5139d5 != null) {
                        int i22 = gVar.f41596Q0;
                        C5138c c5138c4 = c5139d5.f41489L;
                        c5138c3.a(c5138c4, i22);
                        if (i19 == i14) {
                            int i23 = this.i;
                            if (c5138c3.h()) {
                                c5138c3.f41478h = i23;
                            }
                        }
                        c5138c4.a(c5138c3, 0);
                        if (i19 == i15 + 1) {
                            int i24 = this.f41573k;
                            if (c5138c4.h()) {
                                c5138c4.f41478h = i24;
                            }
                        }
                    }
                    if (c5139d6 != c5139d4) {
                        C5138c c5138c5 = c5139d6.f41488K;
                        C5138c c5138c6 = c5139d6.f41487I;
                        if (z3) {
                            int i25 = gVar.f41597R0;
                            if (i25 == 0) {
                                c5138c5.a(c5138c2, 0);
                            } else if (i25 == 1) {
                                c5138c6.a(c5138c, 0);
                            } else if (i25 == 2) {
                                c5138c6.a(c5138c, 0);
                                c5138c5.a(c5138c2, 0);
                            }
                        } else {
                            int i26 = gVar.f41597R0;
                            if (i26 == 0) {
                                c5138c6.a(c5138c, 0);
                            } else if (i26 == 1) {
                                c5138c5.a(c5138c2, 0);
                            } else if (i26 == 2) {
                                if (z11) {
                                    c5138c6.a(this.f41567d, this.f41571h);
                                    c5138c5.a(this.f41569f, this.f41572j);
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
        C5139d c5139d7 = this.f41565b;
        c5139d7.f41521j0 = gVar.f41584E0;
        int i27 = this.i;
        if (i > 0) {
            i27 += gVar.f41596Q0;
        }
        C5138c c5138c7 = this.f41568e;
        C5138c c5138c8 = c5139d7.J;
        c5138c8.a(c5138c7, i27);
        C5138c c5138c9 = c5139d7.f41489L;
        if (z6) {
            c5138c9.a(this.f41570g, this.f41573k);
        }
        if (i > 0) {
            this.f41568e.f41474d.f41489L.a(c5138c8, 0);
        }
        if (gVar.f41598S0 == 3 && !c5139d7.f41483E) {
            for (int i28 = 0; i28 < i12; i28++) {
                int i29 = this.f41576n + (z3 ? (i12 - 1) - i28 : i28);
                if (i29 >= gVar.f41607b1) {
                    break;
                }
                c5139d = gVar.f41606a1[i29];
                if (c5139d.f41483E) {
                    break;
                }
            }
        }
        c5139d = c5139d7;
        int i30 = 0;
        C5139d c5139d8 = null;
        while (i30 < i12) {
            int i31 = z3 ? (i12 - 1) - i30 : i30;
            int i32 = this.f41576n + i31;
            if (i32 >= gVar.f41607b1) {
                return;
            }
            C5139d c5139d9 = gVar.f41606a1[i32];
            if (c5139d9 == null) {
                z9 = z10;
                c9 = 3;
            } else {
                C5138c c5138c10 = c5139d9.f41487I;
                if (i30 == 0) {
                    c5139d9.f(c5138c10, this.f41567d, this.f41571h);
                }
                if (i31 == 0) {
                    int i33 = gVar.f41583D0;
                    if (z3) {
                        f3 = 1.0f;
                        f9 = 1.0f - gVar.f41589J0;
                    } else {
                        f3 = 1.0f;
                        f9 = gVar.f41589J0;
                    }
                    if (this.f41576n == 0) {
                        i10 = gVar.f41585F0;
                        z9 = z10;
                        if (i10 != -1) {
                            if (z3) {
                                f11 = gVar.f41591L0;
                                f9 = f3 - f11;
                                c5139d9.f41519i0 = i10;
                                c5139d9.f41510d0 = f9;
                            } else {
                                f10 = gVar.f41591L0;
                                f9 = f10;
                                c5139d9.f41519i0 = i10;
                                c5139d9.f41510d0 = f9;
                            }
                        }
                    } else {
                        z9 = z10;
                    }
                    if (!z6 || (i10 = gVar.f41587H0) == -1) {
                        i10 = i33;
                        c5139d9.f41519i0 = i10;
                        c5139d9.f41510d0 = f9;
                    } else if (z3) {
                        f11 = gVar.f41593N0;
                        f9 = f3 - f11;
                        c5139d9.f41519i0 = i10;
                        c5139d9.f41510d0 = f9;
                    } else {
                        f10 = gVar.f41593N0;
                        f9 = f10;
                        c5139d9.f41519i0 = i10;
                        c5139d9.f41510d0 = f9;
                    }
                } else {
                    z9 = z10;
                }
                if (i30 == i12 - 1) {
                    c5139d9.f(c5139d9.f41488K, this.f41569f, this.f41572j);
                }
                if (c5139d8 != null) {
                    int i34 = gVar.f41595P0;
                    C5138c c5138c11 = c5139d8.f41488K;
                    c5138c10.a(c5138c11, i34);
                    if (i30 == i14) {
                        int i35 = this.f41571h;
                        if (c5138c10.h()) {
                            c5138c10.f41478h = i35;
                        }
                    }
                    c5138c11.a(c5138c10, 0);
                    if (i30 == i15 + 1) {
                        int i36 = this.f41572j;
                        if (c5138c11.h()) {
                            c5138c11.f41478h = i36;
                        }
                    }
                }
                if (c5139d9 != c5139d7) {
                    int i37 = gVar.f41598S0;
                    c9 = 3;
                    if (i37 == 3 && c5139d.f41483E && c5139d9 != c5139d && c5139d9.f41483E) {
                        c5139d9.f41490M.a(c5139d.f41490M, 0);
                    } else {
                        C5138c c5138c12 = c5139d9.J;
                        if (i37 != 0) {
                            C5138c c5138c13 = c5139d9.f41489L;
                            if (i37 == 1) {
                                c5138c13.a(c5138c9, 0);
                            } else if (z9) {
                                c5138c12.a(this.f41568e, this.i);
                                c5138c13.a(this.f41570g, this.f41573k);
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
        return this.f41564a == 1 ? this.f41575m - this.f41580r.f41596Q0 : this.f41575m;
    }

    public final int d() {
        return this.f41564a == 0 ? this.f41574l - this.f41580r.f41595P0 : this.f41574l;
    }

    public final void e(int i) {
        g gVar;
        int i6;
        int i9 = this.f41578p;
        if (i9 == 0) {
            return;
        }
        int i10 = this.f41577o;
        int i11 = i / i9;
        int i12 = 0;
        while (true) {
            gVar = this.f41580r;
            if (i12 >= i10 || (i6 = this.f41576n + i12) >= gVar.f41607b1) {
                break;
            }
            C5139d c5139d = gVar.f41606a1[i6];
            if (this.f41564a == 0) {
                if (c5139d != null) {
                    int[] iArr = c5139d.f41532p0;
                    if (iArr[0] == 3 && c5139d.f41534r == 0) {
                        gVar.V(1, i11, iArr[1], c5139d.k(), c5139d);
                    }
                }
            } else if (c5139d != null) {
                int[] iArr2 = c5139d.f41532p0;
                if (iArr2[1] == 3 && c5139d.f41535s == 0) {
                    int i13 = iArr2[0];
                    int i14 = i11;
                    gVar.V(i13, c5139d.q(), 1, i14, c5139d);
                    i11 = i14;
                }
            }
            i12++;
        }
        this.f41574l = 0;
        this.f41575m = 0;
        this.f41565b = null;
        this.f41566c = 0;
        int i15 = this.f41577o;
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = this.f41576n + i16;
            if (i17 >= gVar.f41607b1) {
                return;
            }
            C5139d c5139d2 = gVar.f41606a1[i17];
            if (this.f41564a == 0) {
                int q8 = c5139d2.q();
                int i18 = gVar.f41595P0;
                if (c5139d2.f41516g0 == 8) {
                    i18 = 0;
                }
                this.f41574l = q8 + i18 + this.f41574l;
                int T8 = gVar.T(c5139d2, this.f41579q);
                if (this.f41565b == null || this.f41566c < T8) {
                    this.f41565b = c5139d2;
                    this.f41566c = T8;
                    this.f41575m = T8;
                }
            } else {
                int U3 = gVar.U(c5139d2, this.f41579q);
                int T9 = gVar.T(c5139d2, this.f41579q);
                int i19 = gVar.f41596Q0;
                if (c5139d2.f41516g0 == 8) {
                    i19 = 0;
                }
                this.f41575m = T9 + i19 + this.f41575m;
                if (this.f41565b == null || this.f41566c < U3) {
                    this.f41565b = c5139d2;
                    this.f41566c = U3;
                    this.f41574l = U3;
                }
            }
        }
    }

    public final void f(int i, C5138c c5138c, C5138c c5138c2, C5138c c5138c3, C5138c c5138c4, int i6, int i9, int i10, int i11, int i12) {
        this.f41564a = i;
        this.f41567d = c5138c;
        this.f41568e = c5138c2;
        this.f41569f = c5138c3;
        this.f41570g = c5138c4;
        this.f41571h = i6;
        this.i = i9;
        this.f41572j = i10;
        this.f41573k = i11;
        this.f41579q = i12;
    }
}
