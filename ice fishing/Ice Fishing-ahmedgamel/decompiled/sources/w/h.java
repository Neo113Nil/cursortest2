package w;

import java.util.ArrayList;
import u.C5048c;
import x.C5163b;

/* loaded from: classes.dex */
public final class h extends j {

    /* renamed from: A0, reason: collision with root package name */
    public int f41360A0;

    /* renamed from: B0, reason: collision with root package name */
    public C5163b f41361B0;
    public z.f C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f41362D0;

    /* renamed from: E0, reason: collision with root package name */
    public int f41363E0;

    /* renamed from: F0, reason: collision with root package name */
    public int f41364F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f41365G0;

    /* renamed from: H0, reason: collision with root package name */
    public int f41366H0;

    /* renamed from: I0, reason: collision with root package name */
    public int f41367I0;

    /* renamed from: J0, reason: collision with root package name */
    public float f41368J0;

    /* renamed from: K0, reason: collision with root package name */
    public float f41369K0;

    /* renamed from: L0, reason: collision with root package name */
    public float f41370L0;

    /* renamed from: M0, reason: collision with root package name */
    public float f41371M0;

    /* renamed from: N0, reason: collision with root package name */
    public float f41372N0;

    /* renamed from: O0, reason: collision with root package name */
    public float f41373O0;

    /* renamed from: P0, reason: collision with root package name */
    public int f41374P0;

    /* renamed from: Q0, reason: collision with root package name */
    public int f41375Q0;

    /* renamed from: R0, reason: collision with root package name */
    public int f41376R0;

    /* renamed from: S0, reason: collision with root package name */
    public int f41377S0;

    /* renamed from: T0, reason: collision with root package name */
    public int f41378T0;

    /* renamed from: U0, reason: collision with root package name */
    public int f41379U0;

    /* renamed from: V0, reason: collision with root package name */
    public int f41380V0;

    /* renamed from: W0, reason: collision with root package name */
    public ArrayList f41381W0;

    /* renamed from: X0, reason: collision with root package name */
    public C5130e[] f41382X0;

    /* renamed from: Y0, reason: collision with root package name */
    public C5130e[] f41383Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public int[] f41384Z0;

    /* renamed from: a1, reason: collision with root package name */
    public C5130e[] f41385a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f41386b1;

    /* renamed from: s0, reason: collision with root package name */
    public int f41387s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f41388t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f41389u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f41390v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f41391w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f41392x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f41393y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f41394z0;

    @Override // w.j
    public final void S() {
        for (int i = 0; i < this.f41402r0; i++) {
            C5130e c5130e = this.f41401q0[i];
            if (c5130e != null) {
                c5130e.f41263F = true;
            }
        }
    }

    public final int T(C5130e c5130e, int i) {
        C5130e c5130e2;
        if (c5130e != null) {
            int[] iArr = c5130e.f41311p0;
            if (iArr[1] == 3) {
                int i4 = c5130e.f41314s;
                if (i4 != 0) {
                    if (i4 == 2) {
                        int i6 = (int) (c5130e.f41321z * i);
                        if (i6 != c5130e.k()) {
                            c5130e.f41294g = true;
                            V(iArr[0], c5130e.q(), 1, i6, c5130e);
                        }
                        return i6;
                    }
                    c5130e2 = c5130e;
                    if (i4 == 1) {
                        return c5130e2.k();
                    }
                    if (i4 == 3) {
                        return (int) ((c5130e2.q() * c5130e2.f41279W) + 0.5f);
                    }
                }
            } else {
                c5130e2 = c5130e;
            }
            return c5130e2.k();
        }
        return 0;
    }

    public final int U(C5130e c5130e, int i) {
        C5130e c5130e2;
        if (c5130e != null) {
            int[] iArr = c5130e.f41311p0;
            if (iArr[0] == 3) {
                int i4 = c5130e.f41313r;
                if (i4 != 0) {
                    if (i4 == 2) {
                        int i6 = (int) (c5130e.f41318w * i);
                        if (i6 != c5130e.q()) {
                            c5130e.f41294g = true;
                            V(1, i6, iArr[1], c5130e.k(), c5130e);
                        }
                        return i6;
                    }
                    c5130e2 = c5130e;
                    if (i4 == 1) {
                        return c5130e2.q();
                    }
                    if (i4 == 3) {
                        return (int) ((c5130e2.k() * c5130e2.f41279W) + 0.5f);
                    }
                }
            } else {
                c5130e2 = c5130e;
            }
            return c5130e2.q();
        }
        return 0;
    }

    public final void V(int i, int i4, int i6, int i9, C5130e c5130e) {
        z.f fVar;
        C5130e c5130e2;
        while (true) {
            fVar = this.C0;
            if (fVar != null || (c5130e2 = this.f41276T) == null) {
                break;
            } else {
                this.C0 = ((f) c5130e2).f41337u0;
            }
        }
        C5163b c5163b = this.f41361B0;
        c5163b.f41753a = i;
        c5163b.f41754b = i6;
        c5163b.f41755c = i4;
        c5163b.f41756d = i9;
        fVar.b(c5130e, c5163b);
        c5130e.O(c5163b.f41757e);
        c5130e.L(c5163b.f41758f);
        c5130e.f41262E = c5163b.f41760h;
        c5130e.I(c5163b.f41759g);
    }

    @Override // w.C5130e
    public final void b(C5048c c5048c, boolean z6) {
        C5130e c5130e;
        float f2;
        int i;
        super.b(c5048c, z6);
        C5130e c5130e2 = this.f41276T;
        boolean z9 = c5130e2 != null && ((f) c5130e2).f41338v0;
        int i4 = this.f41378T0;
        ArrayList arrayList = this.f41381W0;
        if (i4 != 0) {
            if (i4 == 1) {
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    ((g) arrayList.get(i6)).b(i6, z9, i6 == size + (-1));
                    i6++;
                }
            } else if (i4 != 2) {
                if (i4 == 3) {
                    int size2 = arrayList.size();
                    int i9 = 0;
                    while (i9 < size2) {
                        ((g) arrayList.get(i9)).b(i9, z9, i9 == size2 + (-1));
                        i9++;
                    }
                }
            } else if (this.f41384Z0 != null && this.f41383Y0 != null && this.f41382X0 != null) {
                for (int i10 = 0; i10 < this.f41386b1; i10++) {
                    this.f41385a1[i10].D();
                }
                int[] iArr = this.f41384Z0;
                int i11 = iArr[0];
                int i12 = iArr[1];
                float f9 = this.f41368J0;
                C5130e c5130e3 = null;
                int i13 = 0;
                while (i13 < i11) {
                    if (z9) {
                        i = (i11 - i13) - 1;
                        f2 = 1.0f - this.f41368J0;
                    } else {
                        f2 = f9;
                        i = i13;
                    }
                    C5130e c5130e4 = this.f41383Y0[i];
                    if (c5130e4 != null && c5130e4.f41295g0 != 8) {
                        C5129d c5129d = c5130e4.f41266I;
                        if (i13 == 0) {
                            c5130e4.f(c5129d, this.f41266I, this.f41391w0);
                            c5130e4.f41298i0 = this.f41362D0;
                            c5130e4.f41289d0 = f2;
                        }
                        if (i13 == i11 - 1) {
                            c5130e4.f(c5130e4.f41267K, this.f41267K, this.f41392x0);
                        }
                        if (i13 > 0 && c5130e3 != null) {
                            int i14 = this.f41374P0;
                            C5129d c5129d2 = c5130e3.f41267K;
                            c5130e4.f(c5129d, c5129d2, i14);
                            c5130e3.f(c5129d2, c5129d, 0);
                        }
                        c5130e3 = c5130e4;
                    }
                    i13++;
                    f9 = f2;
                }
                for (int i15 = 0; i15 < i12; i15++) {
                    C5130e c5130e5 = this.f41382X0[i15];
                    if (c5130e5 != null && c5130e5.f41295g0 != 8) {
                        C5129d c5129d3 = c5130e5.J;
                        if (i15 == 0) {
                            c5130e5.f(c5129d3, this.J, this.f41387s0);
                            c5130e5.f41300j0 = this.f41363E0;
                            c5130e5.f41291e0 = this.f41369K0;
                        }
                        if (i15 == i12 - 1) {
                            c5130e5.f(c5130e5.f41268L, this.f41268L, this.f41388t0);
                        }
                        if (i15 > 0 && c5130e3 != null) {
                            int i16 = this.f41375Q0;
                            C5129d c5129d4 = c5130e3.f41268L;
                            c5130e5.f(c5129d3, c5129d4, i16);
                            c5130e3.f(c5129d4, c5129d3, 0);
                        }
                        c5130e3 = c5130e5;
                    }
                }
                for (int i17 = 0; i17 < i11; i17++) {
                    for (int i18 = 0; i18 < i12; i18++) {
                        int i19 = (i18 * i11) + i17;
                        if (this.f41380V0 == 1) {
                            i19 = (i17 * i12) + i18;
                        }
                        C5130e[] c5130eArr = this.f41385a1;
                        if (i19 < c5130eArr.length && (c5130e = c5130eArr[i19]) != null && c5130e.f41295g0 != 8) {
                            C5130e c5130e6 = this.f41383Y0[i17];
                            C5130e c5130e7 = this.f41382X0[i18];
                            if (c5130e != c5130e6) {
                                c5130e.f(c5130e.f41266I, c5130e6.f41266I, 0);
                                c5130e.f(c5130e.f41267K, c5130e6.f41267K, 0);
                            }
                            if (c5130e != c5130e7) {
                                c5130e.f(c5130e.J, c5130e7.J, 0);
                                c5130e.f(c5130e.f41268L, c5130e7.f41268L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((g) arrayList.get(0)).b(0, z9, true);
        }
        this.f41393y0 = false;
    }
}
