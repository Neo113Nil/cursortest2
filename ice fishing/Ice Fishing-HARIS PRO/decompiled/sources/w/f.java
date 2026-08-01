package w;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f4605a;

    /* renamed from: d, reason: collision with root package name */
    public c f4608d;
    public c e;

    /* renamed from: f, reason: collision with root package name */
    public c f4609f;

    /* renamed from: g, reason: collision with root package name */
    public c f4610g;

    /* renamed from: h, reason: collision with root package name */
    public int f4611h;
    public int i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f4612k;

    /* renamed from: q, reason: collision with root package name */
    public int f4618q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f4619r;

    /* renamed from: b, reason: collision with root package name */
    public d f4606b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f4607c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f4613l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f4614m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f4615n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f4616o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f4617p = 0;

    public f(g gVar, int i, c cVar, c cVar2, c cVar3, c cVar4, int i2) {
        this.f4619r = gVar;
        this.f4611h = 0;
        this.i = 0;
        this.j = 0;
        this.f4612k = 0;
        this.f4618q = 0;
        this.f4605a = i;
        this.f4608d = cVar;
        this.e = cVar2;
        this.f4609f = cVar3;
        this.f4610g = cVar4;
        this.f4611h = gVar.f4650w0;
        this.i = gVar.s0;
        this.j = gVar.f4651x0;
        this.f4612k = gVar.f4647t0;
        this.f4618q = i2;
    }

    public final void a(d dVar) {
        int i = this.f4605a;
        g gVar = this.f4619r;
        if (i == 0) {
            int U2 = gVar.U(dVar, this.f4618q);
            if (dVar.f4575p0[0] == 3) {
                this.f4617p++;
                U2 = 0;
            }
            this.f4613l = U2 + (dVar.f4559g0 != 8 ? gVar.f4634P0 : 0) + this.f4613l;
            int T2 = gVar.T(dVar, this.f4618q);
            if (this.f4606b == null || this.f4607c < T2) {
                this.f4606b = dVar;
                this.f4607c = T2;
                this.f4614m = T2;
            }
        } else {
            int U3 = gVar.U(dVar, this.f4618q);
            int T3 = gVar.T(dVar, this.f4618q);
            if (dVar.f4575p0[1] == 3) {
                this.f4617p++;
                T3 = 0;
            }
            this.f4614m = T3 + (dVar.f4559g0 != 8 ? gVar.f4635Q0 : 0) + this.f4614m;
            if (this.f4606b == null || this.f4607c < U3) {
                this.f4606b = dVar;
                this.f4607c = U3;
                this.f4613l = U3;
            }
        }
        this.f4616o++;
    }

    public final void b(int i, boolean z2, boolean z3) {
        g gVar;
        int i2;
        int i3;
        int i4;
        d dVar;
        int i5;
        char c2;
        int i6;
        float f2;
        float f3;
        int i7;
        float f4;
        int i8;
        int i9 = this.f4616o;
        int i10 = 0;
        while (true) {
            gVar = this.f4619r;
            if (i10 >= i9 || (i8 = this.f4615n + i10) >= gVar.f4646b1) {
                break;
            }
            d dVar2 = gVar.f4645a1[i8];
            if (dVar2 != null) {
                dVar2.D();
            }
            i10++;
        }
        if (i9 == 0 || this.f4606b == null) {
            return;
        }
        boolean z4 = z3 && i == 0;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < i9; i13++) {
            int i14 = this.f4615n + (z2 ? (i9 - 1) - i13 : i13);
            if (i14 >= gVar.f4646b1) {
                break;
            }
            d dVar3 = gVar.f4645a1[i14];
            if (dVar3 != null && dVar3.f4559g0 == 0) {
                if (i11 == -1) {
                    i11 = i13;
                }
                i12 = i13;
            }
        }
        if (this.f4605a != 0) {
            d dVar4 = this.f4606b;
            dVar4.f4562i0 = gVar.f4623D0;
            int i15 = this.f4611h;
            if (i > 0) {
                i15 += gVar.f4634P0;
            }
            c cVar = dVar4.f4530I;
            c cVar2 = dVar4.f4531K;
            if (z2) {
                cVar2.a(this.f4609f, i15);
                if (z3) {
                    cVar.a(this.f4608d, this.j);
                }
                if (i > 0) {
                    this.f4609f.f4518d.f4530I.a(cVar2, 0);
                }
            } else {
                cVar.a(this.f4608d, i15);
                if (z3) {
                    cVar2.a(this.f4609f, this.j);
                }
                if (i > 0) {
                    this.f4608d.f4518d.f4531K.a(cVar, 0);
                }
            }
            d dVar5 = null;
            for (int i16 = 0; i16 < i9; i16++) {
                int i17 = this.f4615n + i16;
                if (i17 >= gVar.f4646b1) {
                    return;
                }
                d dVar6 = gVar.f4645a1[i17];
                if (dVar6 != null) {
                    c cVar3 = dVar6.J;
                    if (i16 == 0) {
                        dVar6.f(cVar3, this.e, this.i);
                        int i18 = gVar.f4624E0;
                        float f5 = gVar.f4629K0;
                        if (this.f4615n == 0) {
                            i4 = gVar.f4626G0;
                            i2 = i18;
                            i3 = -1;
                            if (i4 != -1) {
                                f5 = gVar.f4631M0;
                                dVar6.f4563j0 = i4;
                                dVar6.f4555e0 = f5;
                            }
                        } else {
                            i2 = i18;
                            i3 = -1;
                        }
                        if (!z3 || (i4 = gVar.f4627I0) == i3) {
                            i4 = i2;
                        } else {
                            f5 = gVar.f4633O0;
                        }
                        dVar6.f4563j0 = i4;
                        dVar6.f4555e0 = f5;
                    }
                    if (i16 == i9 - 1) {
                        dVar6.f(dVar6.f4532L, this.f4610g, this.f4612k);
                    }
                    if (dVar5 != null) {
                        int i19 = gVar.f4635Q0;
                        c cVar4 = dVar5.f4532L;
                        cVar3.a(cVar4, i19);
                        if (i16 == i11) {
                            int i20 = this.i;
                            if (cVar3.h()) {
                                cVar3.f4521h = i20;
                            }
                        }
                        cVar4.a(cVar3, 0);
                        if (i16 == i12 + 1) {
                            int i21 = this.f4612k;
                            if (cVar4.h()) {
                                cVar4.f4521h = i21;
                            }
                        }
                    }
                    if (dVar6 != dVar4) {
                        c cVar5 = dVar6.f4531K;
                        c cVar6 = dVar6.f4530I;
                        if (z2) {
                            int i22 = gVar.f4636R0;
                            if (i22 == 0) {
                                cVar5.a(cVar2, 0);
                            } else if (i22 == 1) {
                                cVar6.a(cVar, 0);
                            } else if (i22 == 2) {
                                cVar6.a(cVar, 0);
                                cVar5.a(cVar2, 0);
                            }
                        } else {
                            int i23 = gVar.f4636R0;
                            if (i23 == 0) {
                                cVar6.a(cVar, 0);
                            } else if (i23 == 1) {
                                cVar5.a(cVar2, 0);
                            } else if (i23 == 2) {
                                if (z4) {
                                    cVar6.a(this.f4608d, this.f4611h);
                                    cVar5.a(this.f4609f, this.j);
                                } else {
                                    cVar6.a(cVar, 0);
                                    cVar5.a(cVar2, 0);
                                }
                            }
                            dVar5 = dVar6;
                        }
                    }
                    dVar5 = dVar6;
                }
            }
            return;
        }
        d dVar7 = this.f4606b;
        dVar7.f4563j0 = gVar.f4624E0;
        int i24 = this.i;
        if (i > 0) {
            i24 += gVar.f4635Q0;
        }
        c cVar7 = this.e;
        c cVar8 = dVar7.J;
        cVar8.a(cVar7, i24);
        c cVar9 = dVar7.f4532L;
        if (z3) {
            cVar9.a(this.f4610g, this.f4612k);
        }
        if (i > 0) {
            this.e.f4518d.f4532L.a(cVar8, 0);
        }
        if (gVar.f4637S0 == 3 && !dVar7.f4526E) {
            for (int i25 = 0; i25 < i9; i25++) {
                int i26 = this.f4615n + (z2 ? (i9 - 1) - i25 : i25);
                if (i26 >= gVar.f4646b1) {
                    break;
                }
                dVar = gVar.f4645a1[i26];
                if (dVar.f4526E) {
                    break;
                }
            }
        }
        dVar = dVar7;
        int i27 = 0;
        d dVar8 = null;
        while (i27 < i9) {
            int i28 = z2 ? (i9 - 1) - i27 : i27;
            int i29 = this.f4615n + i28;
            if (i29 >= gVar.f4646b1) {
                return;
            }
            d dVar9 = gVar.f4645a1[i29];
            if (dVar9 == null) {
                i5 = i9;
                c2 = 3;
            } else {
                c cVar10 = dVar9.f4530I;
                if (i27 == 0) {
                    dVar9.f(cVar10, this.f4608d, this.f4611h);
                }
                if (i28 == 0) {
                    int i30 = gVar.f4623D0;
                    if (z2) {
                        i6 = i30;
                        f2 = 1.0f - gVar.f4628J0;
                    } else {
                        i6 = i30;
                        f2 = gVar.f4628J0;
                    }
                    if (this.f4615n == 0) {
                        int i31 = gVar.f4625F0;
                        f3 = f2;
                        if (i31 != -1) {
                            f4 = z2 ? 1.0f - gVar.f4630L0 : gVar.f4630L0;
                            i7 = i31;
                            dVar9.f4562i0 = i7;
                            dVar9.f4554d0 = f4;
                        }
                    } else {
                        f3 = f2;
                    }
                    if (!z3 || (i7 = gVar.H0) == -1) {
                        i7 = i6;
                        f4 = f3;
                    } else {
                        f4 = z2 ? 1.0f - gVar.f4632N0 : gVar.f4632N0;
                    }
                    dVar9.f4562i0 = i7;
                    dVar9.f4554d0 = f4;
                }
                if (i27 == i9 - 1) {
                    i5 = i9;
                    dVar9.f(dVar9.f4531K, this.f4609f, this.j);
                } else {
                    i5 = i9;
                }
                if (dVar8 != null) {
                    int i32 = gVar.f4634P0;
                    c cVar11 = dVar8.f4531K;
                    cVar10.a(cVar11, i32);
                    if (i27 == i11) {
                        int i33 = this.f4611h;
                        if (cVar10.h()) {
                            cVar10.f4521h = i33;
                        }
                    }
                    cVar11.a(cVar10, 0);
                    if (i27 == i12 + 1) {
                        int i34 = this.j;
                        if (cVar11.h()) {
                            cVar11.f4521h = i34;
                        }
                    }
                }
                if (dVar9 != dVar7) {
                    int i35 = gVar.f4637S0;
                    c2 = 3;
                    if (i35 == 3 && dVar.f4526E && dVar9 != dVar && dVar9.f4526E) {
                        dVar9.f4533M.a(dVar.f4533M, 0);
                    } else {
                        c cVar12 = dVar9.J;
                        if (i35 != 0) {
                            c cVar13 = dVar9.f4532L;
                            if (i35 == 1) {
                                cVar13.a(cVar9, 0);
                            } else if (z4) {
                                cVar12.a(this.e, this.i);
                                cVar13.a(this.f4610g, this.f4612k);
                            } else {
                                cVar12.a(cVar8, 0);
                                cVar13.a(cVar9, 0);
                            }
                        } else {
                            cVar12.a(cVar8, 0);
                        }
                    }
                } else {
                    c2 = 3;
                }
                dVar8 = dVar9;
            }
            i27++;
            i9 = i5;
        }
    }

    public final int c() {
        return this.f4605a == 1 ? this.f4614m - this.f4619r.f4635Q0 : this.f4614m;
    }

    public final int d() {
        return this.f4605a == 0 ? this.f4613l - this.f4619r.f4634P0 : this.f4613l;
    }

    public final void e(int i) {
        g gVar;
        int i2;
        int i3 = this.f4617p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.f4616o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            gVar = this.f4619r;
            if (i6 >= i4 || (i2 = this.f4615n + i6) >= gVar.f4646b1) {
                break;
            }
            d dVar = gVar.f4645a1[i2];
            if (this.f4605a == 0) {
                if (dVar != null) {
                    int[] iArr = dVar.f4575p0;
                    if (iArr[0] == 3 && dVar.f4577r == 0) {
                        gVar.V(1, i5, iArr[1], dVar.k(), dVar);
                    }
                }
            } else if (dVar != null) {
                int[] iArr2 = dVar.f4575p0;
                if (iArr2[1] == 3 && dVar.f4578s == 0) {
                    gVar.V(iArr2[0], dVar.q(), 1, i5, dVar);
                }
            }
            i6++;
        }
        this.f4613l = 0;
        this.f4614m = 0;
        this.f4606b = null;
        this.f4607c = 0;
        int i7 = this.f4616o;
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = this.f4615n + i8;
            if (i9 >= gVar.f4646b1) {
                return;
            }
            d dVar2 = gVar.f4645a1[i9];
            if (this.f4605a == 0) {
                int q2 = dVar2.q();
                int i10 = gVar.f4634P0;
                if (dVar2.f4559g0 == 8) {
                    i10 = 0;
                }
                this.f4613l = q2 + i10 + this.f4613l;
                int T2 = gVar.T(dVar2, this.f4618q);
                if (this.f4606b == null || this.f4607c < T2) {
                    this.f4606b = dVar2;
                    this.f4607c = T2;
                    this.f4614m = T2;
                }
            } else {
                int U2 = gVar.U(dVar2, this.f4618q);
                int T3 = gVar.T(dVar2, this.f4618q);
                int i11 = gVar.f4635Q0;
                if (dVar2.f4559g0 == 8) {
                    i11 = 0;
                }
                this.f4614m = T3 + i11 + this.f4614m;
                if (this.f4606b == null || this.f4607c < U2) {
                    this.f4606b = dVar2;
                    this.f4607c = U2;
                    this.f4613l = U2;
                }
            }
        }
    }

    public final void f(int i, c cVar, c cVar2, c cVar3, c cVar4, int i2, int i3, int i4, int i5, int i6) {
        this.f4605a = i;
        this.f4608d = cVar;
        this.e = cVar2;
        this.f4609f = cVar3;
        this.f4610g = cVar4;
        this.f4611h = i2;
        this.i = i3;
        this.j = i4;
        this.f4612k = i5;
        this.f4618q = i6;
    }
}
