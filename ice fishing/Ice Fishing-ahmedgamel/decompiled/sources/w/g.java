package w;

import java.util.ArrayList;
import u.C5047c;
import x.C5164b;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: A0, reason: collision with root package name */
    public int f41581A0;

    /* renamed from: B0, reason: collision with root package name */
    public C5164b f41582B0;
    public z.f C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f41583D0;

    /* renamed from: E0, reason: collision with root package name */
    public int f41584E0;

    /* renamed from: F0, reason: collision with root package name */
    public int f41585F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f41586G0;

    /* renamed from: H0, reason: collision with root package name */
    public int f41587H0;

    /* renamed from: I0, reason: collision with root package name */
    public int f41588I0;

    /* renamed from: J0, reason: collision with root package name */
    public float f41589J0;

    /* renamed from: K0, reason: collision with root package name */
    public float f41590K0;

    /* renamed from: L0, reason: collision with root package name */
    public float f41591L0;

    /* renamed from: M0, reason: collision with root package name */
    public float f41592M0;

    /* renamed from: N0, reason: collision with root package name */
    public float f41593N0;

    /* renamed from: O0, reason: collision with root package name */
    public float f41594O0;

    /* renamed from: P0, reason: collision with root package name */
    public int f41595P0;

    /* renamed from: Q0, reason: collision with root package name */
    public int f41596Q0;

    /* renamed from: R0, reason: collision with root package name */
    public int f41597R0;

    /* renamed from: S0, reason: collision with root package name */
    public int f41598S0;

    /* renamed from: T0, reason: collision with root package name */
    public int f41599T0;

    /* renamed from: U0, reason: collision with root package name */
    public int f41600U0;

    /* renamed from: V0, reason: collision with root package name */
    public int f41601V0;

    /* renamed from: W0, reason: collision with root package name */
    public ArrayList f41602W0;

    /* renamed from: X0, reason: collision with root package name */
    public C5139d[] f41603X0;

    /* renamed from: Y0, reason: collision with root package name */
    public C5139d[] f41604Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public int[] f41605Z0;

    /* renamed from: a1, reason: collision with root package name */
    public C5139d[] f41606a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f41607b1;

    /* renamed from: s0, reason: collision with root package name */
    public int f41608s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f41609t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f41610u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f41611v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f41612w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f41613x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f41614y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f41615z0;

    @Override // w.i
    public final void S() {
        for (int i = 0; i < this.f41623r0; i++) {
            C5139d c5139d = this.f41622q0[i];
            if (c5139d != null) {
                c5139d.f41484F = true;
            }
        }
    }

    public final int T(C5139d c5139d, int i) {
        C5139d c5139d2;
        if (c5139d != null) {
            int[] iArr = c5139d.f41532p0;
            if (iArr[1] == 3) {
                int i6 = c5139d.f41535s;
                if (i6 != 0) {
                    if (i6 == 2) {
                        int i9 = (int) (c5139d.f41542z * i);
                        if (i9 != c5139d.k()) {
                            c5139d.f41515g = true;
                            V(iArr[0], c5139d.q(), 1, i9, c5139d);
                        }
                        return i9;
                    }
                    c5139d2 = c5139d;
                    if (i6 == 1) {
                        return c5139d2.k();
                    }
                    if (i6 == 3) {
                        return (int) ((c5139d2.q() * c5139d2.f41500W) + 0.5f);
                    }
                }
            } else {
                c5139d2 = c5139d;
            }
            return c5139d2.k();
        }
        return 0;
    }

    public final int U(C5139d c5139d, int i) {
        C5139d c5139d2;
        if (c5139d != null) {
            int[] iArr = c5139d.f41532p0;
            if (iArr[0] == 3) {
                int i6 = c5139d.f41534r;
                if (i6 != 0) {
                    if (i6 == 2) {
                        int i9 = (int) (c5139d.f41539w * i);
                        if (i9 != c5139d.q()) {
                            c5139d.f41515g = true;
                            V(1, i9, iArr[1], c5139d.k(), c5139d);
                        }
                        return i9;
                    }
                    c5139d2 = c5139d;
                    if (i6 == 1) {
                        return c5139d2.q();
                    }
                    if (i6 == 3) {
                        return (int) ((c5139d2.k() * c5139d2.f41500W) + 0.5f);
                    }
                }
            } else {
                c5139d2 = c5139d;
            }
            return c5139d2.q();
        }
        return 0;
    }

    public final void V(int i, int i6, int i9, int i10, C5139d c5139d) {
        z.f fVar;
        C5139d c5139d2;
        while (true) {
            fVar = this.C0;
            if (fVar != null || (c5139d2 = this.f41497T) == null) {
                break;
            } else {
                this.C0 = ((C5140e) c5139d2).f41558u0;
            }
        }
        C5164b c5164b = this.f41582B0;
        c5164b.f41698a = i;
        c5164b.f41699b = i9;
        c5164b.f41700c = i6;
        c5164b.f41701d = i10;
        fVar.b(c5139d, c5164b);
        c5139d.O(c5164b.f41702e);
        c5139d.L(c5164b.f41703f);
        c5139d.f41483E = c5164b.f41705h;
        c5139d.I(c5164b.f41704g);
    }

    @Override // w.C5139d
    public final void b(C5047c c5047c, boolean z3) {
        C5139d c5139d;
        float f3;
        int i;
        super.b(c5047c, z3);
        C5139d c5139d2 = this.f41497T;
        boolean z6 = c5139d2 != null && ((C5140e) c5139d2).f41559v0;
        int i6 = this.f41599T0;
        ArrayList arrayList = this.f41602W0;
        if (i6 != 0) {
            if (i6 == 1) {
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    ((f) arrayList.get(i9)).b(i9, z6, i9 == size + (-1));
                    i9++;
                }
            } else if (i6 != 2) {
                if (i6 == 3) {
                    int size2 = arrayList.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        ((f) arrayList.get(i10)).b(i10, z6, i10 == size2 + (-1));
                        i10++;
                    }
                }
            } else if (this.f41605Z0 != null && this.f41604Y0 != null && this.f41603X0 != null) {
                for (int i11 = 0; i11 < this.f41607b1; i11++) {
                    this.f41606a1[i11].D();
                }
                int[] iArr = this.f41605Z0;
                int i12 = iArr[0];
                int i13 = iArr[1];
                float f9 = this.f41589J0;
                C5139d c5139d3 = null;
                int i14 = 0;
                while (i14 < i12) {
                    if (z6) {
                        i = (i12 - i14) - 1;
                        f3 = 1.0f - this.f41589J0;
                    } else {
                        f3 = f9;
                        i = i14;
                    }
                    C5139d c5139d4 = this.f41604Y0[i];
                    if (c5139d4 != null && c5139d4.f41516g0 != 8) {
                        C5138c c5138c = c5139d4.f41487I;
                        if (i14 == 0) {
                            c5139d4.f(c5138c, this.f41487I, this.f41612w0);
                            c5139d4.f41519i0 = this.f41583D0;
                            c5139d4.f41510d0 = f3;
                        }
                        if (i14 == i12 - 1) {
                            c5139d4.f(c5139d4.f41488K, this.f41488K, this.f41613x0);
                        }
                        if (i14 > 0 && c5139d3 != null) {
                            int i15 = this.f41595P0;
                            C5138c c5138c2 = c5139d3.f41488K;
                            c5139d4.f(c5138c, c5138c2, i15);
                            c5139d3.f(c5138c2, c5138c, 0);
                        }
                        c5139d3 = c5139d4;
                    }
                    i14++;
                    f9 = f3;
                }
                for (int i16 = 0; i16 < i13; i16++) {
                    C5139d c5139d5 = this.f41603X0[i16];
                    if (c5139d5 != null && c5139d5.f41516g0 != 8) {
                        C5138c c5138c3 = c5139d5.J;
                        if (i16 == 0) {
                            c5139d5.f(c5138c3, this.J, this.f41608s0);
                            c5139d5.f41521j0 = this.f41584E0;
                            c5139d5.f41512e0 = this.f41590K0;
                        }
                        if (i16 == i13 - 1) {
                            c5139d5.f(c5139d5.f41489L, this.f41489L, this.f41609t0);
                        }
                        if (i16 > 0 && c5139d3 != null) {
                            int i17 = this.f41596Q0;
                            C5138c c5138c4 = c5139d3.f41489L;
                            c5139d5.f(c5138c3, c5138c4, i17);
                            c5139d3.f(c5138c4, c5138c3, 0);
                        }
                        c5139d3 = c5139d5;
                    }
                }
                for (int i18 = 0; i18 < i12; i18++) {
                    for (int i19 = 0; i19 < i13; i19++) {
                        int i20 = (i19 * i12) + i18;
                        if (this.f41601V0 == 1) {
                            i20 = (i18 * i13) + i19;
                        }
                        C5139d[] c5139dArr = this.f41606a1;
                        if (i20 < c5139dArr.length && (c5139d = c5139dArr[i20]) != null && c5139d.f41516g0 != 8) {
                            C5139d c5139d6 = this.f41604Y0[i18];
                            C5139d c5139d7 = this.f41603X0[i19];
                            if (c5139d != c5139d6) {
                                c5139d.f(c5139d.f41487I, c5139d6.f41487I, 0);
                                c5139d.f(c5139d.f41488K, c5139d6.f41488K, 0);
                            }
                            if (c5139d != c5139d7) {
                                c5139d.f(c5139d.J, c5139d7.J, 0);
                                c5139d.f(c5139d.f41489L, c5139d7.f41489L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z6, true);
        }
        this.f41614y0 = false;
    }
}
