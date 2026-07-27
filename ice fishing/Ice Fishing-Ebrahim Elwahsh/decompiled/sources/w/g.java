package w;

import java.util.ArrayList;
import u.C5086c;
import x.C5185b;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: A0, reason: collision with root package name */
    public int f41516A0;

    /* renamed from: B0, reason: collision with root package name */
    public C5185b f41517B0;
    public z.f C0;

    /* renamed from: D0, reason: collision with root package name */
    public int f41518D0;

    /* renamed from: E0, reason: collision with root package name */
    public int f41519E0;

    /* renamed from: F0, reason: collision with root package name */
    public int f41520F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f41521G0;

    /* renamed from: H0, reason: collision with root package name */
    public int f41522H0;

    /* renamed from: I0, reason: collision with root package name */
    public int f41523I0;

    /* renamed from: J0, reason: collision with root package name */
    public float f41524J0;

    /* renamed from: K0, reason: collision with root package name */
    public float f41525K0;

    /* renamed from: L0, reason: collision with root package name */
    public float f41526L0;

    /* renamed from: M0, reason: collision with root package name */
    public float f41527M0;

    /* renamed from: N0, reason: collision with root package name */
    public float f41528N0;

    /* renamed from: O0, reason: collision with root package name */
    public float f41529O0;

    /* renamed from: P0, reason: collision with root package name */
    public int f41530P0;

    /* renamed from: Q0, reason: collision with root package name */
    public int f41531Q0;

    /* renamed from: R0, reason: collision with root package name */
    public int f41532R0;

    /* renamed from: S0, reason: collision with root package name */
    public int f41533S0;

    /* renamed from: T0, reason: collision with root package name */
    public int f41534T0;

    /* renamed from: U0, reason: collision with root package name */
    public int f41535U0;

    /* renamed from: V0, reason: collision with root package name */
    public int f41536V0;

    /* renamed from: W0, reason: collision with root package name */
    public ArrayList f41537W0;

    /* renamed from: X0, reason: collision with root package name */
    public C5144d[] f41538X0;

    /* renamed from: Y0, reason: collision with root package name */
    public C5144d[] f41539Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public int[] f41540Z0;

    /* renamed from: a1, reason: collision with root package name */
    public C5144d[] f41541a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f41542b1;

    /* renamed from: s0, reason: collision with root package name */
    public int f41543s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f41544t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f41545u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f41546v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f41547w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f41548x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f41549y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f41550z0;

    @Override // w.i
    public final void S() {
        for (int i = 0; i < this.f41558r0; i++) {
            C5144d c5144d = this.f41557q0[i];
            if (c5144d != null) {
                c5144d.f41419F = true;
            }
        }
    }

    public final int T(C5144d c5144d, int i) {
        C5144d c5144d2;
        if (c5144d != null) {
            int[] iArr = c5144d.f41467p0;
            if (iArr[1] == 3) {
                int i4 = c5144d.f41470s;
                if (i4 != 0) {
                    if (i4 == 2) {
                        int i9 = (int) (c5144d.f41477z * i);
                        if (i9 != c5144d.k()) {
                            c5144d.f41450g = true;
                            V(iArr[0], c5144d.q(), 1, i9, c5144d);
                        }
                        return i9;
                    }
                    c5144d2 = c5144d;
                    if (i4 == 1) {
                        return c5144d2.k();
                    }
                    if (i4 == 3) {
                        return (int) ((c5144d2.q() * c5144d2.f41435W) + 0.5f);
                    }
                }
            } else {
                c5144d2 = c5144d;
            }
            return c5144d2.k();
        }
        return 0;
    }

    public final int U(C5144d c5144d, int i) {
        C5144d c5144d2;
        if (c5144d != null) {
            int[] iArr = c5144d.f41467p0;
            if (iArr[0] == 3) {
                int i4 = c5144d.f41469r;
                if (i4 != 0) {
                    if (i4 == 2) {
                        int i9 = (int) (c5144d.f41474w * i);
                        if (i9 != c5144d.q()) {
                            c5144d.f41450g = true;
                            V(1, i9, iArr[1], c5144d.k(), c5144d);
                        }
                        return i9;
                    }
                    c5144d2 = c5144d;
                    if (i4 == 1) {
                        return c5144d2.q();
                    }
                    if (i4 == 3) {
                        return (int) ((c5144d2.k() * c5144d2.f41435W) + 0.5f);
                    }
                }
            } else {
                c5144d2 = c5144d;
            }
            return c5144d2.q();
        }
        return 0;
    }

    public final void V(int i, int i4, int i9, int i10, C5144d c5144d) {
        z.f fVar;
        C5144d c5144d2;
        while (true) {
            fVar = this.C0;
            if (fVar != null || (c5144d2 = this.f41432T) == null) {
                break;
            } else {
                this.C0 = ((C5145e) c5144d2).f41493u0;
            }
        }
        C5185b c5185b = this.f41517B0;
        c5185b.f41714a = i;
        c5185b.f41715b = i9;
        c5185b.f41716c = i4;
        c5185b.f41717d = i10;
        fVar.b(c5144d, c5185b);
        c5144d.O(c5185b.f41718e);
        c5144d.L(c5185b.f41719f);
        c5144d.f41418E = c5185b.f41721h;
        c5144d.I(c5185b.f41720g);
    }

    @Override // w.C5144d
    public final void b(C5086c c5086c, boolean z8) {
        C5144d c5144d;
        float f6;
        int i;
        super.b(c5086c, z8);
        C5144d c5144d2 = this.f41432T;
        boolean z9 = c5144d2 != null && ((C5145e) c5144d2).f41494v0;
        int i4 = this.f41534T0;
        ArrayList arrayList = this.f41537W0;
        if (i4 != 0) {
            if (i4 == 1) {
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    ((f) arrayList.get(i9)).b(i9, z9, i9 == size + (-1));
                    i9++;
                }
            } else if (i4 != 2) {
                if (i4 == 3) {
                    int size2 = arrayList.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        ((f) arrayList.get(i10)).b(i10, z9, i10 == size2 + (-1));
                        i10++;
                    }
                }
            } else if (this.f41540Z0 != null && this.f41539Y0 != null && this.f41538X0 != null) {
                for (int i11 = 0; i11 < this.f41542b1; i11++) {
                    this.f41541a1[i11].D();
                }
                int[] iArr = this.f41540Z0;
                int i12 = iArr[0];
                int i13 = iArr[1];
                float f9 = this.f41524J0;
                C5144d c5144d3 = null;
                int i14 = 0;
                while (i14 < i12) {
                    if (z9) {
                        i = (i12 - i14) - 1;
                        f6 = 1.0f - this.f41524J0;
                    } else {
                        f6 = f9;
                        i = i14;
                    }
                    C5144d c5144d4 = this.f41539Y0[i];
                    if (c5144d4 != null && c5144d4.f41451g0 != 8) {
                        C5143c c5143c = c5144d4.f41422I;
                        if (i14 == 0) {
                            c5144d4.f(c5143c, this.f41422I, this.f41547w0);
                            c5144d4.f41454i0 = this.f41518D0;
                            c5144d4.f41445d0 = f6;
                        }
                        if (i14 == i12 - 1) {
                            c5144d4.f(c5144d4.f41423K, this.f41423K, this.f41548x0);
                        }
                        if (i14 > 0 && c5144d3 != null) {
                            int i15 = this.f41530P0;
                            C5143c c5143c2 = c5144d3.f41423K;
                            c5144d4.f(c5143c, c5143c2, i15);
                            c5144d3.f(c5143c2, c5143c, 0);
                        }
                        c5144d3 = c5144d4;
                    }
                    i14++;
                    f9 = f6;
                }
                for (int i16 = 0; i16 < i13; i16++) {
                    C5144d c5144d5 = this.f41538X0[i16];
                    if (c5144d5 != null && c5144d5.f41451g0 != 8) {
                        C5143c c5143c3 = c5144d5.J;
                        if (i16 == 0) {
                            c5144d5.f(c5143c3, this.J, this.f41543s0);
                            c5144d5.f41456j0 = this.f41519E0;
                            c5144d5.f41447e0 = this.f41525K0;
                        }
                        if (i16 == i13 - 1) {
                            c5144d5.f(c5144d5.f41424L, this.f41424L, this.f41544t0);
                        }
                        if (i16 > 0 && c5144d3 != null) {
                            int i17 = this.f41531Q0;
                            C5143c c5143c4 = c5144d3.f41424L;
                            c5144d5.f(c5143c3, c5143c4, i17);
                            c5144d3.f(c5143c4, c5143c3, 0);
                        }
                        c5144d3 = c5144d5;
                    }
                }
                for (int i18 = 0; i18 < i12; i18++) {
                    for (int i19 = 0; i19 < i13; i19++) {
                        int i20 = (i19 * i12) + i18;
                        if (this.f41536V0 == 1) {
                            i20 = (i18 * i13) + i19;
                        }
                        C5144d[] c5144dArr = this.f41541a1;
                        if (i20 < c5144dArr.length && (c5144d = c5144dArr[i20]) != null && c5144d.f41451g0 != 8) {
                            C5144d c5144d6 = this.f41539Y0[i18];
                            C5144d c5144d7 = this.f41538X0[i19];
                            if (c5144d != c5144d6) {
                                c5144d.f(c5144d.f41422I, c5144d6.f41422I, 0);
                                c5144d.f(c5144d.f41423K, c5144d6.f41423K, 0);
                            }
                            if (c5144d != c5144d7) {
                                c5144d.f(c5144d.J, c5144d7.J, 0);
                                c5144d.f(c5144d.f41424L, c5144d7.f41424L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z9, true);
        }
        this.f41549y0 = false;
    }
}
