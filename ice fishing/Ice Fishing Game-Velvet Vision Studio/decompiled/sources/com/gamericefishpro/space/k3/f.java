package com.gamericefishpro.space.k3;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public int a;
    public c d;
    public c e;
    public c f;
    public c g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int q;
    public final /* synthetic */ g r;
    public d b = null;
    public int c = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;

    public f(g gVar, int i, c cVar, c cVar2, c cVar3, c cVar4, int i2) {
        this.r = gVar;
        this.a = i;
        this.d = cVar;
        this.e = cVar2;
        this.f = cVar3;
        this.g = cVar4;
        this.h = gVar.v0;
        this.i = gVar.r0;
        this.j = gVar.w0;
        this.k = gVar.s0;
        this.q = i2;
    }

    public final void a(d dVar) {
        int i = this.a;
        g gVar = this.r;
        if (i == 0) {
            int iP = gVar.P(dVar, this.q);
            if (dVar.o0[0] == 3) {
                this.p++;
                iP = 0;
            }
            this.l = iP + (dVar.f0 != 8 ? gVar.O0 : 0) + this.l;
            int iO = gVar.O(dVar, this.q);
            if (this.b == null || this.c < iO) {
                this.b = dVar;
                this.c = iO;
                this.m = iO;
            }
        } else {
            int iP2 = gVar.P(dVar, this.q);
            int iO2 = gVar.O(dVar, this.q);
            if (dVar.o0[1] == 3) {
                this.p++;
                iO2 = 0;
            }
            this.m = iO2 + (dVar.f0 != 8 ? gVar.P0 : 0) + this.m;
            if (this.b == null || this.c < iP2) {
                this.b = dVar;
                this.c = iP2;
                this.l = iP2;
            }
        }
        this.o++;
    }

    public final void b(int i, boolean z, boolean z2) {
        g gVar;
        int i2;
        d dVar;
        char c;
        int i3;
        int i4;
        int i5;
        int i6 = this.o;
        int i7 = 0;
        while (true) {
            gVar = this.r;
            if (i7 >= i6 || (i5 = this.n + i7) >= gVar.a1) {
                break;
            }
            d dVar2 = gVar.Z0[i5];
            if (dVar2 != null) {
                dVar2.A();
            }
            i7++;
        }
        if (i6 == 0 || this.b == null) {
            return;
        }
        boolean z3 = z2 && i == 0;
        int i8 = -1;
        int i9 = -1;
        for (int i10 = 0; i10 < i6; i10++) {
            int i11 = this.n + (z ? (i6 - 1) - i10 : i10);
            if (i11 >= gVar.a1) {
                break;
            }
            if (gVar.Z0[i11].f0 == 0) {
                if (i8 == -1) {
                    i8 = i10;
                }
                i9 = i10;
            }
        }
        if (this.a != 0) {
            d dVar3 = this.b;
            dVar3.h0 = gVar.C0;
            c cVar = dVar3.H;
            c cVar2 = dVar3.J;
            int i12 = this.h;
            if (i > 0) {
                i12 += gVar.O0;
            }
            if (z) {
                cVar2.a(this.f, i12);
                if (z2) {
                    cVar.a(this.d, this.j);
                }
                if (i > 0) {
                    this.f.d.H.a(cVar2, 0);
                }
            } else {
                cVar.a(this.d, i12);
                if (z2) {
                    cVar2.a(this.f, this.j);
                }
                if (i > 0) {
                    this.d.d.J.a(cVar, 0);
                }
            }
            d dVar4 = null;
            int i13 = 0;
            while (i13 < i6) {
                int i14 = this.n + i13;
                if (i14 >= gVar.a1) {
                    return;
                }
                d dVar5 = gVar.Z0[i14];
                if (i13 == 0) {
                    dVar5.f(dVar5.I, this.e, this.i);
                    int i15 = gVar.D0;
                    float f = gVar.J0;
                    if (this.n == 0) {
                        int i16 = gVar.F0;
                        i2 = -1;
                        if (i16 != -1) {
                            f = gVar.L0;
                        }
                        i15 = i16;
                        dVar5.i0 = i15;
                        dVar5.d0 = f;
                    } else {
                        i2 = -1;
                    }
                    if (z2 && (i16 = gVar.H0) != i2) {
                        f = gVar.N0;
                        i15 = i16;
                    }
                    dVar5.i0 = i15;
                    dVar5.d0 = f;
                }
                if (i13 == i6 - 1) {
                    dVar5.f(dVar5.K, this.g, this.k);
                }
                if (dVar4 != null) {
                    c cVar3 = dVar4.K;
                    c cVar4 = dVar5.I;
                    cVar4.a(cVar3, gVar.P0);
                    if (i13 == i8) {
                        int i17 = this.i;
                        if (cVar4.h()) {
                            cVar4.h = i17;
                        }
                    }
                    cVar3.a(cVar4, 0);
                    if (i13 == i9 + 1) {
                        int i18 = this.k;
                        if (cVar3.h()) {
                            cVar3.h = i18;
                        }
                    }
                }
                if (dVar5 != dVar3) {
                    if (z) {
                        int i19 = gVar.Q0;
                        if (i19 == 0) {
                            dVar5.J.a(cVar2, 0);
                        } else if (i19 == 1) {
                            dVar5.H.a(cVar, 0);
                        } else if (i19 == 2) {
                            dVar5.H.a(cVar, 0);
                            dVar5.J.a(cVar2, 0);
                        }
                    } else {
                        int i20 = gVar.Q0;
                        if (i20 == 0) {
                            dVar5.H.a(cVar, 0);
                        } else if (i20 == 1) {
                            dVar5.J.a(cVar2, 0);
                        } else if (i20 == 2) {
                            if (z3) {
                                dVar5.H.a(this.d, this.h);
                                dVar5.J.a(this.f, this.j);
                            } else {
                                dVar5.H.a(cVar, 0);
                                dVar5.J.a(cVar2, 0);
                            }
                        }
                    }
                }
                i13++;
                dVar4 = dVar5;
            }
            return;
        }
        d dVar6 = this.b;
        dVar6.i0 = gVar.D0;
        c cVar5 = dVar6.K;
        c cVar6 = dVar6.I;
        int i21 = this.i;
        if (i > 0) {
            i21 += gVar.P0;
        }
        cVar6.a(this.e, i21);
        if (z2) {
            cVar5.a(this.g, this.k);
        }
        if (i > 0) {
            this.e.d.K.a(cVar6, 0);
        }
        if (gVar.R0 != 3 || dVar6.D) {
            dVar = dVar6;
            break;
        }
        int i22 = 0;
        while (true) {
            if (i22 < i6) {
                int i23 = this.n + (z ? (i6 - 1) - i22 : i22);
                if (i23 < gVar.a1) {
                    dVar = gVar.Z0[i23];
                    if (dVar.D) {
                        break;
                    } else {
                        i22++;
                    }
                }
            }
            dVar = dVar6;
            break;
        }
        int i24 = 0;
        d dVar7 = null;
        while (i24 < i6) {
            int i25 = z ? (i6 - 1) - i24 : i24;
            int i26 = this.n + i25;
            if (i26 >= gVar.a1) {
                return;
            }
            d dVar8 = gVar.Z0[i26];
            if (i24 == 0) {
                dVar8.f(dVar8.H, this.d, this.h);
            }
            if (i25 == 0) {
                int i27 = gVar.C0;
                float f2 = z ? 1.0f - gVar.I0 : gVar.I0;
                if (this.n == 0 && (i4 = gVar.E0) != -1) {
                    f2 = z ? 1.0f - gVar.K0 : gVar.K0;
                    i3 = i4;
                } else if (!z2 || (i3 = gVar.G0) == -1) {
                    i3 = i27;
                } else {
                    f2 = z ? 1.0f - gVar.M0 : gVar.M0;
                }
                dVar8.h0 = i3;
                dVar8.c0 = f2;
            }
            if (i24 == i6 - 1) {
                dVar8.f(dVar8.J, this.f, this.j);
            }
            if (dVar7 != null) {
                c cVar7 = dVar7.J;
                c cVar8 = dVar8.H;
                cVar8.a(cVar7, gVar.O0);
                if (i24 == i8) {
                    int i28 = this.h;
                    if (cVar8.h()) {
                        cVar8.h = i28;
                    }
                }
                cVar7.a(cVar8, 0);
                if (i24 == i9 + 1) {
                    int i29 = this.j;
                    if (cVar7.h()) {
                        cVar7.h = i29;
                    }
                }
            }
            if (dVar8 != dVar6) {
                int i30 = gVar.R0;
                c = 3;
                if (i30 == 3 && dVar.D && dVar8 != dVar && dVar8.D) {
                    dVar8.L.a(dVar.L, 0);
                } else if (i30 == 0) {
                    dVar8.I.a(cVar6, 0);
                } else if (i30 == 1) {
                    dVar8.K.a(cVar5, 0);
                } else if (z3) {
                    dVar8.I.a(this.e, this.i);
                    dVar8.K.a(this.g, this.k);
                } else {
                    dVar8.I.a(cVar6, 0);
                    dVar8.K.a(cVar5, 0);
                }
            } else {
                c = 3;
            }
            i24++;
            dVar7 = dVar8;
        }
    }

    public final int c() {
        return this.a == 1 ? this.m - this.r.P0 : this.m;
    }

    public final int d() {
        return this.a == 0 ? this.l - this.r.O0 : this.l;
    }

    public final void e(int i) {
        g gVar;
        int i2;
        int i3 = this.p;
        if (i3 == 0) {
            return;
        }
        int i4 = this.o;
        int i5 = i / i3;
        int i6 = 0;
        while (true) {
            gVar = this.r;
            if (i6 >= i4 || (i2 = this.n + i6) >= gVar.a1) {
                break;
            }
            d dVar = gVar.Z0[i2];
            if (this.a == 0) {
                if (dVar != null) {
                    int[] iArr = dVar.o0;
                    if (iArr[0] == 3 && dVar.q == 0) {
                        gVar.Q(1, i5, iArr[1], dVar.k(), dVar);
                    }
                }
            } else if (dVar != null) {
                int[] iArr2 = dVar.o0;
                if (iArr2[1] == 3 && dVar.r == 0) {
                    int i7 = i5;
                    gVar.Q(iArr2[0], dVar.n(), 1, i7, dVar);
                    i5 = i7;
                }
            }
            i6++;
        }
        this.l = 0;
        this.m = 0;
        this.b = null;
        this.c = 0;
        int i8 = this.o;
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.n + i9;
            if (i10 >= gVar.a1) {
                return;
            }
            d dVar2 = gVar.Z0[i10];
            if (this.a == 0) {
                int iN = dVar2.n();
                int i11 = gVar.O0;
                if (dVar2.f0 == 8) {
                    i11 = 0;
                }
                this.l = iN + i11 + this.l;
                int iO = gVar.O(dVar2, this.q);
                if (this.b == null || this.c < iO) {
                    this.b = dVar2;
                    this.c = iO;
                    this.m = iO;
                }
            } else {
                int iP = gVar.P(dVar2, this.q);
                int iO2 = gVar.O(dVar2, this.q);
                int i12 = gVar.P0;
                if (dVar2.f0 == 8) {
                    i12 = 0;
                }
                this.m = iO2 + i12 + this.m;
                if (this.b == null || this.c < iP) {
                    this.b = dVar2;
                    this.c = iP;
                    this.l = iP;
                }
            }
        }
    }

    public final void f(int i, c cVar, c cVar2, c cVar3, c cVar4, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.d = cVar;
        this.e = cVar2;
        this.f = cVar3;
        this.g = cVar4;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.q = i6;
    }
}
