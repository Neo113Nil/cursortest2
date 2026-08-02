package w;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f41343a;

    /* renamed from: d, reason: collision with root package name */
    public C5129d f41346d;

    /* renamed from: e, reason: collision with root package name */
    public C5129d f41347e;

    /* renamed from: f, reason: collision with root package name */
    public C5129d f41348f;

    /* renamed from: g, reason: collision with root package name */
    public C5129d f41349g;

    /* renamed from: h, reason: collision with root package name */
    public int f41350h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f41351j;

    /* renamed from: k, reason: collision with root package name */
    public int f41352k;

    /* renamed from: q, reason: collision with root package name */
    public int f41358q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f41359r;

    /* renamed from: b, reason: collision with root package name */
    public C5130e f41344b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f41345c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f41353l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f41354m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f41355n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f41356o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f41357p = 0;

    public g(h hVar, int i, C5129d c5129d, C5129d c5129d2, C5129d c5129d3, C5129d c5129d4, int i4) {
        this.f41359r = hVar;
        this.f41343a = i;
        this.f41346d = c5129d;
        this.f41347e = c5129d2;
        this.f41348f = c5129d3;
        this.f41349g = c5129d4;
        this.f41350h = hVar.f41391w0;
        this.i = hVar.f41387s0;
        this.f41351j = hVar.f41392x0;
        this.f41352k = hVar.f41388t0;
        this.f41358q = i4;
    }

    public final void a(C5130e c5130e) {
        int i = this.f41343a;
        h hVar = this.f41359r;
        if (i == 0) {
            int U8 = hVar.U(c5130e, this.f41358q);
            if (c5130e.f41311p0[0] == 3) {
                this.f41357p++;
                U8 = 0;
            }
            this.f41353l = U8 + (c5130e.f41295g0 != 8 ? hVar.f41374P0 : 0) + this.f41353l;
            int T8 = hVar.T(c5130e, this.f41358q);
            if (this.f41344b == null || this.f41345c < T8) {
                this.f41344b = c5130e;
                this.f41345c = T8;
                this.f41354m = T8;
            }
        } else {
            int U9 = hVar.U(c5130e, this.f41358q);
            int T9 = hVar.T(c5130e, this.f41358q);
            if (c5130e.f41311p0[1] == 3) {
                this.f41357p++;
                T9 = 0;
            }
            this.f41354m = T9 + (c5130e.f41295g0 != 8 ? hVar.f41375Q0 : 0) + this.f41354m;
            if (this.f41344b == null || this.f41345c < U9) {
                this.f41344b = c5130e;
                this.f41345c = U9;
                this.f41353l = U9;
            }
        }
        this.f41356o++;
    }

    public final void b(int i, boolean z6, boolean z9) {
        h hVar;
        int i4;
        int i6;
        C5130e c5130e;
        boolean z10;
        char c9;
        float f2;
        float f9;
        int i9;
        float f10;
        float f11;
        int i10;
        int i11 = this.f41356o;
        int i12 = 0;
        while (true) {
            hVar = this.f41359r;
            if (i12 >= i11 || (i10 = this.f41355n + i12) >= hVar.f41386b1) {
                break;
            }
            C5130e c5130e2 = hVar.f41385a1[i10];
            if (c5130e2 != null) {
                c5130e2.D();
            }
            i12++;
        }
        if (i11 == 0 || this.f41344b == null) {
            return;
        }
        boolean z11 = z9 && i == 0;
        int i13 = -1;
        int i14 = -1;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = this.f41355n + (z6 ? (i11 - 1) - i15 : i15);
            if (i16 >= hVar.f41386b1) {
                break;
            }
            C5130e c5130e3 = hVar.f41385a1[i16];
            if (c5130e3 != null && c5130e3.f41295g0 == 0) {
                if (i13 == -1) {
                    i13 = i15;
                }
                i14 = i15;
            }
        }
        if (this.f41343a != 0) {
            boolean z12 = z11;
            C5130e c5130e4 = this.f41344b;
            c5130e4.f41298i0 = hVar.f41362D0;
            int i17 = this.f41350h;
            if (i > 0) {
                i17 += hVar.f41374P0;
            }
            C5129d c5129d = c5130e4.f41266I;
            C5129d c5129d2 = c5130e4.f41267K;
            if (z6) {
                c5129d2.a(this.f41348f, i17);
                if (z9) {
                    c5129d.a(this.f41346d, this.f41351j);
                }
                if (i > 0) {
                    this.f41348f.f41253d.f41266I.a(c5129d2, 0);
                }
            } else {
                c5129d.a(this.f41346d, i17);
                if (z9) {
                    c5129d2.a(this.f41348f, this.f41351j);
                }
                if (i > 0) {
                    this.f41346d.f41253d.f41267K.a(c5129d, 0);
                }
            }
            C5130e c5130e5 = null;
            for (int i18 = 0; i18 < i11; i18++) {
                int i19 = this.f41355n + i18;
                if (i19 >= hVar.f41386b1) {
                    return;
                }
                C5130e c5130e6 = hVar.f41385a1[i19];
                if (c5130e6 != null) {
                    C5129d c5129d3 = c5130e6.J;
                    if (i18 == 0) {
                        c5130e6.f(c5129d3, this.f41347e, this.i);
                        int i20 = hVar.f41363E0;
                        float f12 = hVar.f41369K0;
                        if (this.f41355n == 0) {
                            i6 = hVar.f41365G0;
                            i4 = -1;
                            if (i6 != -1) {
                                f12 = hVar.f41371M0;
                                i20 = i6;
                                c5130e6.f41300j0 = i20;
                                c5130e6.f41291e0 = f12;
                            }
                        } else {
                            i4 = -1;
                        }
                        if (z9 && (i6 = hVar.f41367I0) != i4) {
                            f12 = hVar.f41373O0;
                            i20 = i6;
                        }
                        c5130e6.f41300j0 = i20;
                        c5130e6.f41291e0 = f12;
                    }
                    if (i18 == i11 - 1) {
                        c5130e6.f(c5130e6.f41268L, this.f41349g, this.f41352k);
                    }
                    if (c5130e5 != null) {
                        int i21 = hVar.f41375Q0;
                        C5129d c5129d4 = c5130e5.f41268L;
                        c5129d3.a(c5129d4, i21);
                        if (i18 == i13) {
                            int i22 = this.i;
                            if (c5129d3.h()) {
                                c5129d3.f41257h = i22;
                            }
                        }
                        c5129d4.a(c5129d3, 0);
                        if (i18 == i14 + 1) {
                            int i23 = this.f41352k;
                            if (c5129d4.h()) {
                                c5129d4.f41257h = i23;
                            }
                        }
                    }
                    if (c5130e6 != c5130e4) {
                        C5129d c5129d5 = c5130e6.f41267K;
                        C5129d c5129d6 = c5130e6.f41266I;
                        if (z6) {
                            int i24 = hVar.f41376R0;
                            if (i24 == 0) {
                                c5129d5.a(c5129d2, 0);
                            } else if (i24 == 1) {
                                c5129d6.a(c5129d, 0);
                            } else if (i24 == 2) {
                                c5129d6.a(c5129d, 0);
                                c5129d5.a(c5129d2, 0);
                            }
                        } else {
                            int i25 = hVar.f41376R0;
                            if (i25 == 0) {
                                c5129d6.a(c5129d, 0);
                            } else if (i25 == 1) {
                                c5129d5.a(c5129d2, 0);
                            } else if (i25 == 2) {
                                if (z12) {
                                    c5129d6.a(this.f41346d, this.f41350h);
                                    c5129d5.a(this.f41348f, this.f41351j);
                                } else {
                                    c5129d6.a(c5129d, 0);
                                    c5129d5.a(c5129d2, 0);
                                }
                            }
                            c5130e5 = c5130e6;
                        }
                    }
                    c5130e5 = c5130e6;
                }
            }
            return;
        }
        C5130e c5130e7 = this.f41344b;
        c5130e7.f41300j0 = hVar.f41363E0;
        int i26 = this.i;
        if (i > 0) {
            i26 += hVar.f41375Q0;
        }
        C5129d c5129d7 = this.f41347e;
        C5129d c5129d8 = c5130e7.J;
        c5129d8.a(c5129d7, i26);
        C5129d c5129d9 = c5130e7.f41268L;
        if (z9) {
            c5129d9.a(this.f41349g, this.f41352k);
        }
        if (i > 0) {
            this.f41347e.f41253d.f41268L.a(c5129d8, 0);
        }
        if (hVar.f41377S0 == 3 && !c5130e7.f41262E) {
            for (int i27 = 0; i27 < i11; i27++) {
                int i28 = this.f41355n + (z6 ? (i11 - 1) - i27 : i27);
                if (i28 >= hVar.f41386b1) {
                    break;
                }
                c5130e = hVar.f41385a1[i28];
                if (c5130e.f41262E) {
                    break;
                }
            }
        }
        c5130e = c5130e7;
        int i29 = 0;
        C5130e c5130e8 = null;
        while (i29 < i11) {
            int i30 = z6 ? (i11 - 1) - i29 : i29;
            int i31 = this.f41355n + i30;
            if (i31 >= hVar.f41386b1) {
                return;
            }
            C5130e c5130e9 = hVar.f41385a1[i31];
            if (c5130e9 == null) {
                z10 = z11;
                c9 = 3;
            } else {
                C5129d c5129d10 = c5130e9.f41266I;
                if (i29 == 0) {
                    c5130e9.f(c5129d10, this.f41346d, this.f41350h);
                }
                if (i30 == 0) {
                    int i32 = hVar.f41362D0;
                    if (z6) {
                        f2 = 1.0f;
                        f9 = 1.0f - hVar.f41368J0;
                    } else {
                        f2 = 1.0f;
                        f9 = hVar.f41368J0;
                    }
                    if (this.f41355n == 0) {
                        i9 = hVar.f41364F0;
                        z10 = z11;
                        if (i9 != -1) {
                            if (z6) {
                                f11 = hVar.f41370L0;
                                f9 = f2 - f11;
                                c5130e9.f41298i0 = i9;
                                c5130e9.f41289d0 = f9;
                            } else {
                                f10 = hVar.f41370L0;
                                f9 = f10;
                                c5130e9.f41298i0 = i9;
                                c5130e9.f41289d0 = f9;
                            }
                        }
                    } else {
                        z10 = z11;
                    }
                    if (!z9 || (i9 = hVar.f41366H0) == -1) {
                        i9 = i32;
                        c5130e9.f41298i0 = i9;
                        c5130e9.f41289d0 = f9;
                    } else if (z6) {
                        f11 = hVar.f41372N0;
                        f9 = f2 - f11;
                        c5130e9.f41298i0 = i9;
                        c5130e9.f41289d0 = f9;
                    } else {
                        f10 = hVar.f41372N0;
                        f9 = f10;
                        c5130e9.f41298i0 = i9;
                        c5130e9.f41289d0 = f9;
                    }
                } else {
                    z10 = z11;
                }
                if (i29 == i11 - 1) {
                    c5130e9.f(c5130e9.f41267K, this.f41348f, this.f41351j);
                }
                if (c5130e8 != null) {
                    int i33 = hVar.f41374P0;
                    C5129d c5129d11 = c5130e8.f41267K;
                    c5129d10.a(c5129d11, i33);
                    if (i29 == i13) {
                        int i34 = this.f41350h;
                        if (c5129d10.h()) {
                            c5129d10.f41257h = i34;
                        }
                    }
                    c5129d11.a(c5129d10, 0);
                    if (i29 == i14 + 1) {
                        int i35 = this.f41351j;
                        if (c5129d11.h()) {
                            c5129d11.f41257h = i35;
                        }
                    }
                }
                if (c5130e9 != c5130e7) {
                    int i36 = hVar.f41377S0;
                    c9 = 3;
                    if (i36 == 3 && c5130e.f41262E && c5130e9 != c5130e && c5130e9.f41262E) {
                        c5130e9.f41269M.a(c5130e.f41269M, 0);
                    } else {
                        C5129d c5129d12 = c5130e9.J;
                        if (i36 != 0) {
                            C5129d c5129d13 = c5130e9.f41268L;
                            if (i36 == 1) {
                                c5129d13.a(c5129d9, 0);
                            } else if (z10) {
                                c5129d12.a(this.f41347e, this.i);
                                c5129d13.a(this.f41349g, this.f41352k);
                            } else {
                                c5129d12.a(c5129d8, 0);
                                c5129d13.a(c5129d9, 0);
                            }
                        } else {
                            c5129d12.a(c5129d8, 0);
                        }
                    }
                } else {
                    c9 = 3;
                }
                c5130e8 = c5130e9;
            }
            i29++;
            z11 = z10;
        }
    }

    public final int c() {
        return this.f41343a == 1 ? this.f41354m - this.f41359r.f41375Q0 : this.f41354m;
    }

    public final int d() {
        return this.f41343a == 0 ? this.f41353l - this.f41359r.f41374P0 : this.f41353l;
    }

    public final void e(int i) {
        h hVar;
        int i4;
        int i6 = this.f41357p;
        if (i6 == 0) {
            return;
        }
        int i9 = this.f41356o;
        int i10 = i / i6;
        int i11 = 0;
        while (true) {
            hVar = this.f41359r;
            if (i11 >= i9 || (i4 = this.f41355n + i11) >= hVar.f41386b1) {
                break;
            }
            C5130e c5130e = hVar.f41385a1[i4];
            if (this.f41343a == 0) {
                if (c5130e != null) {
                    int[] iArr = c5130e.f41311p0;
                    if (iArr[0] == 3 && c5130e.f41313r == 0) {
                        hVar.V(1, i10, iArr[1], c5130e.k(), c5130e);
                    }
                }
            } else if (c5130e != null) {
                int[] iArr2 = c5130e.f41311p0;
                if (iArr2[1] == 3 && c5130e.f41314s == 0) {
                    int i12 = iArr2[0];
                    int i13 = i10;
                    hVar.V(i12, c5130e.q(), 1, i13, c5130e);
                    i10 = i13;
                }
            }
            i11++;
        }
        this.f41353l = 0;
        this.f41354m = 0;
        this.f41344b = null;
        this.f41345c = 0;
        int i14 = this.f41356o;
        for (int i15 = 0; i15 < i14; i15++) {
            int i16 = this.f41355n + i15;
            if (i16 >= hVar.f41386b1) {
                return;
            }
            C5130e c5130e2 = hVar.f41385a1[i16];
            if (this.f41343a == 0) {
                int q8 = c5130e2.q();
                int i17 = hVar.f41374P0;
                if (c5130e2.f41295g0 == 8) {
                    i17 = 0;
                }
                this.f41353l = q8 + i17 + this.f41353l;
                int T8 = hVar.T(c5130e2, this.f41358q);
                if (this.f41344b == null || this.f41345c < T8) {
                    this.f41344b = c5130e2;
                    this.f41345c = T8;
                    this.f41354m = T8;
                }
            } else {
                int U8 = hVar.U(c5130e2, this.f41358q);
                int T9 = hVar.T(c5130e2, this.f41358q);
                int i18 = hVar.f41375Q0;
                if (c5130e2.f41295g0 == 8) {
                    i18 = 0;
                }
                this.f41354m = T9 + i18 + this.f41354m;
                if (this.f41344b == null || this.f41345c < U8) {
                    this.f41344b = c5130e2;
                    this.f41345c = U8;
                    this.f41353l = U8;
                }
            }
        }
    }

    public final void f(int i, C5129d c5129d, C5129d c5129d2, C5129d c5129d3, C5129d c5129d4, int i4, int i6, int i9, int i10, int i11) {
        this.f41343a = i;
        this.f41346d = c5129d;
        this.f41347e = c5129d2;
        this.f41348f = c5129d3;
        this.f41349g = c5129d4;
        this.f41350h = i4;
        this.i = i6;
        this.f41351j = i9;
        this.f41352k = i10;
        this.f41358q = i11;
    }
}
