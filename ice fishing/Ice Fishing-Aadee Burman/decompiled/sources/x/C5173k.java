package x;

import java.util.ArrayList;
import u.AbstractC5049e;
import w.C5138c;
import w.C5139d;

/* renamed from: x.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5173k extends AbstractC5178p {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f41727k = new int[2];

    public static void m(int[] iArr, int i, int i6, int i9, int i10, float f3, int i11) {
        int i12 = i6 - i;
        int i13 = i10 - i9;
        if (i11 != -1) {
            if (i11 == 0) {
                iArr[0] = (int) ((i13 * f3) + 0.5f);
                iArr[1] = i13;
                return;
            } else {
                if (i11 != 1) {
                    return;
                }
                iArr[0] = i12;
                iArr[1] = (int) ((i12 * f3) + 0.5f);
                return;
            }
        }
        int i14 = (int) ((i13 * f3) + 0.5f);
        int i15 = (int) ((i12 / f3) + 0.5f);
        if (i14 <= i12) {
            iArr[0] = i14;
            iArr[1] = i13;
        } else if (i15 <= i13) {
            iArr[0] = i12;
            iArr[1] = i15;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0243, code lost:
    
        if (r7 != 1) goto L125;
     */
    @Override // x.InterfaceC5166d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC5166d interfaceC5166d) {
        float f3;
        float f9;
        float f10;
        float f11;
        int i;
        if (AbstractC5049e.d(this.f41746j) == 3) {
            C5139d c5139d = this.f41739b;
            l(c5139d.f41484I, c5139d.f41485K, 0);
            return;
        }
        C5169g c5169g = this.f41742e;
        boolean z3 = c5169g.f41722j;
        C5168f c5168f = this.f41745h;
        C5168f c5168f2 = this.i;
        if (!z3 && this.f41741d == 3) {
            C5139d c5139d2 = this.f41739b;
            int i6 = c5139d2.f41531r;
            if (i6 == 2) {
                f3 = 0.5f;
                C5139d c5139d3 = c5139d2.f41494T;
                if (c5139d3 != null) {
                    if (c5139d3.f41506d.f41742e.f41722j) {
                        c5169g.d((int) ((r7.f41720g * c5139d2.f41536w) + 0.5f));
                    }
                }
            } else if (i6 == 3) {
                int i9 = c5139d2.f41532s;
                if (i9 == 0 || i9 == 3) {
                    C5175m c5175m = c5139d2.f41508e;
                    C5168f c5168f3 = c5175m.f41745h;
                    C5168f c5168f4 = c5175m.i;
                    boolean z6 = c5139d2.f41484I.f41473f != null;
                    boolean z9 = c5139d2.J.f41473f != null;
                    boolean z10 = c5139d2.f41485K.f41473f != null;
                    boolean z11 = c5139d2.f41486L.f41473f != null;
                    f3 = 0.5f;
                    int i10 = c5139d2.f41498X;
                    if (z6 && z9 && z10 && z11) {
                        float f12 = c5139d2.f41497W;
                        boolean z12 = c5168f3.f41722j;
                        int[] iArr = f41727k;
                        if (z12 && c5168f4.f41722j) {
                            if (c5168f.f41716c && c5168f2.f41716c) {
                                m(iArr, ((C5168f) c5168f.f41724l.get(0)).f41720g + c5168f.f41719f, ((C5168f) c5168f2.f41724l.get(0)).f41720g - c5168f2.f41719f, c5168f3.f41720g + c5168f3.f41719f, c5168f4.f41720g - c5168f4.f41719f, f12, i10);
                                c5169g.d(iArr[0]);
                                this.f41739b.f41508e.f41742e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z13 = c5168f.f41722j;
                        ArrayList arrayList = c5168f3.f41724l;
                        if (z13 && c5168f2.f41722j) {
                            if (!c5168f3.f41716c || !c5168f4.f41716c) {
                                return;
                            }
                            m(iArr, c5168f.f41720g + c5168f.f41719f, c5168f2.f41720g - c5168f2.f41719f, ((C5168f) arrayList.get(0)).f41720g + c5168f3.f41719f, ((C5168f) c5168f4.f41724l.get(0)).f41720g - c5168f4.f41719f, f12, i10);
                            c5169g.d(iArr[0]);
                            this.f41739b.f41508e.f41742e.d(iArr[1]);
                        }
                        if (!c5168f.f41716c || !c5168f2.f41716c || !c5168f3.f41716c || !c5168f4.f41716c) {
                            return;
                        }
                        m(iArr, ((C5168f) c5168f.f41724l.get(0)).f41720g + c5168f.f41719f, ((C5168f) c5168f2.f41724l.get(0)).f41720g - c5168f2.f41719f, ((C5168f) arrayList.get(0)).f41720g + c5168f3.f41719f, ((C5168f) c5168f4.f41724l.get(0)).f41720g - c5168f4.f41719f, f12, i10);
                        c5169g.d(iArr[0]);
                        this.f41739b.f41508e.f41742e.d(iArr[1]);
                    } else if (z6 && z10) {
                        if (!c5168f.f41716c || !c5168f2.f41716c) {
                            return;
                        }
                        float f13 = c5139d2.f41497W;
                        int i11 = ((C5168f) c5168f.f41724l.get(0)).f41720g + c5168f.f41719f;
                        int i12 = ((C5168f) c5168f2.f41724l.get(0)).f41720g - c5168f2.f41719f;
                        if (i10 == -1 || i10 == 0) {
                            int g4 = g(i12 - i11, 0);
                            int i13 = (int) ((g4 * f13) + 0.5f);
                            int g9 = g(i13, 1);
                            if (i13 != g9) {
                                g4 = (int) ((g9 / f13) + 0.5f);
                            }
                            c5169g.d(g4);
                            this.f41739b.f41508e.f41742e.d(g9);
                        } else if (i10 == 1) {
                            int g10 = g(i12 - i11, 0);
                            int i14 = (int) ((g10 / f13) + 0.5f);
                            int g11 = g(i14, 1);
                            if (i14 != g11) {
                                g10 = (int) ((g11 * f13) + 0.5f);
                            }
                            c5169g.d(g10);
                            this.f41739b.f41508e.f41742e.d(g11);
                        }
                    } else if (z9 && z11) {
                        if (!c5168f3.f41716c || !c5168f4.f41716c) {
                            return;
                        }
                        float f14 = c5139d2.f41497W;
                        int i15 = ((C5168f) c5168f3.f41724l.get(0)).f41720g + c5168f3.f41719f;
                        int i16 = ((C5168f) c5168f4.f41724l.get(0)).f41720g - c5168f4.f41719f;
                        if (i10 != -1) {
                            if (i10 == 0) {
                                int g12 = g(i16 - i15, 1);
                                int i17 = (int) ((g12 * f14) + 0.5f);
                                int g13 = g(i17, 0);
                                if (i17 != g13) {
                                    g12 = (int) ((g13 / f14) + 0.5f);
                                }
                                c5169g.d(g13);
                                this.f41739b.f41508e.f41742e.d(g12);
                            }
                        }
                        int g14 = g(i16 - i15, 1);
                        int i18 = (int) ((g14 / f14) + 0.5f);
                        int g15 = g(i18, 0);
                        if (i18 != g15) {
                            g14 = (int) ((g15 * f14) + 0.5f);
                        }
                        c5169g.d(g15);
                        this.f41739b.f41508e.f41742e.d(g14);
                    }
                } else {
                    int i19 = c5139d2.f41498X;
                    if (i19 == -1) {
                        f9 = c5139d2.f41508e.f41742e.f41720g;
                        f10 = c5139d2.f41497W;
                    } else if (i19 == 0) {
                        f11 = c5139d2.f41508e.f41742e.f41720g / c5139d2.f41497W;
                        i = (int) (f11 + 0.5f);
                        c5169g.d(i);
                    } else if (i19 != 1) {
                        i = 0;
                        c5169g.d(i);
                    } else {
                        f9 = c5139d2.f41508e.f41742e.f41720g;
                        f10 = c5139d2.f41497W;
                    }
                    f11 = f9 * f10;
                    i = (int) (f11 + 0.5f);
                    c5169g.d(i);
                }
            }
            if (c5168f.f41716c || !c5168f2.f41716c) {
            }
            if (c5168f.f41722j && c5168f2.f41722j && c5169g.f41722j) {
                return;
            }
            if (!c5169g.f41722j && this.f41741d == 3) {
                C5139d c5139d4 = this.f41739b;
                if (c5139d4.f41531r == 0 && !c5139d4.x()) {
                    C5168f c5168f5 = (C5168f) c5168f.f41724l.get(0);
                    C5168f c5168f6 = (C5168f) c5168f2.f41724l.get(0);
                    int i20 = c5168f5.f41720g + c5168f.f41719f;
                    int i21 = c5168f6.f41720g + c5168f2.f41719f;
                    c5168f.d(i20);
                    c5168f2.d(i21);
                    c5169g.d(i21 - i20);
                    return;
                }
            }
            if (!c5169g.f41722j && this.f41741d == 3 && this.f41738a == 1 && c5168f.f41724l.size() > 0 && c5168f2.f41724l.size() > 0) {
                int min = Math.min((((C5168f) c5168f2.f41724l.get(0)).f41720g + c5168f2.f41719f) - (((C5168f) c5168f.f41724l.get(0)).f41720g + c5168f.f41719f), c5169g.f41725m);
                C5139d c5139d5 = this.f41739b;
                int i22 = c5139d5.f41535v;
                int max = Math.max(c5139d5.f41534u, min);
                if (i22 > 0) {
                    max = Math.min(i22, max);
                }
                c5169g.d(max);
            }
            if (c5169g.f41722j) {
                C5168f c5168f7 = (C5168f) c5168f.f41724l.get(0);
                C5168f c5168f8 = (C5168f) c5168f2.f41724l.get(0);
                int i23 = c5168f7.f41720g;
                int i24 = c5168f.f41719f + i23;
                int i25 = c5168f8.f41720g;
                int i26 = c5168f2.f41719f + i25;
                float f15 = this.f41739b.f41507d0;
                if (c5168f7 == c5168f8) {
                    f15 = f3;
                } else {
                    i23 = i24;
                    i25 = i26;
                }
                c5168f.d((int) ((((i25 - i23) - c5169g.f41720g) * f15) + i23 + f3));
                c5168f2.d(c5168f.f41720g + c5169g.f41720g);
                return;
            }
            return;
        }
        f3 = 0.5f;
        if (c5168f.f41716c) {
        }
    }

    @Override // x.AbstractC5178p
    public final void d() {
        C5139d c5139d;
        C5139d c5139d2;
        int i;
        C5139d c5139d3;
        C5139d c5139d4;
        int i6;
        C5139d c5139d5 = this.f41739b;
        boolean z3 = c5139d5.f41500a;
        C5169g c5169g = this.f41742e;
        if (z3) {
            c5169g.d(c5139d5.q());
        }
        boolean z6 = c5169g.f41722j;
        C5168f c5168f = this.i;
        C5168f c5168f2 = this.f41745h;
        if (!z6) {
            C5139d c5139d6 = this.f41739b;
            int i9 = c5139d6.f41529p0[0];
            this.f41741d = i9;
            if (i9 != 3) {
                if (i9 == 4 && (c5139d4 = c5139d6.f41494T) != null && ((i6 = c5139d4.f41529p0[0]) == 1 || i6 == 4)) {
                    int q8 = (c5139d4.q() - this.f41739b.f41484I.e()) - this.f41739b.f41485K.e();
                    AbstractC5178p.b(c5168f2, c5139d4.f41506d.f41745h, this.f41739b.f41484I.e());
                    AbstractC5178p.b(c5168f, c5139d4.f41506d.i, -this.f41739b.f41485K.e());
                    c5169g.d(q8);
                    return;
                }
                if (i9 == 1) {
                    c5169g.d(c5139d6.q());
                }
            }
        } else if (this.f41741d == 4 && (c5139d2 = (c5139d = this.f41739b).f41494T) != null && ((i = c5139d2.f41529p0[0]) == 1 || i == 4)) {
            AbstractC5178p.b(c5168f2, c5139d2.f41506d.f41745h, c5139d.f41484I.e());
            AbstractC5178p.b(c5168f, c5139d2.f41506d.i, -this.f41739b.f41485K.e());
            return;
        }
        if (c5169g.f41722j) {
            C5139d c5139d7 = this.f41739b;
            if (c5139d7.f41500a) {
                C5138c[] c5138cArr = c5139d7.f41491Q;
                C5138c c5138c = c5138cArr[0];
                C5138c c5138c2 = c5138c.f41473f;
                if (c5138c2 != null && c5138cArr[1].f41473f != null) {
                    if (c5139d7.x()) {
                        c5168f2.f41719f = this.f41739b.f41491Q[0].e();
                        c5168f.f41719f = -this.f41739b.f41491Q[1].e();
                        return;
                    }
                    C5168f h9 = AbstractC5178p.h(this.f41739b.f41491Q[0]);
                    if (h9 != null) {
                        AbstractC5178p.b(c5168f2, h9, this.f41739b.f41491Q[0].e());
                    }
                    C5168f h10 = AbstractC5178p.h(this.f41739b.f41491Q[1]);
                    if (h10 != null) {
                        AbstractC5178p.b(c5168f, h10, -this.f41739b.f41491Q[1].e());
                    }
                    c5168f2.f41715b = true;
                    c5168f.f41715b = true;
                    return;
                }
                if (c5138c2 != null) {
                    C5168f h11 = AbstractC5178p.h(c5138c);
                    if (h11 != null) {
                        AbstractC5178p.b(c5168f2, h11, this.f41739b.f41491Q[0].e());
                        AbstractC5178p.b(c5168f, c5168f2, c5169g.f41720g);
                        return;
                    }
                    return;
                }
                C5138c c5138c3 = c5138cArr[1];
                if (c5138c3.f41473f != null) {
                    C5168f h12 = AbstractC5178p.h(c5138c3);
                    if (h12 != null) {
                        AbstractC5178p.b(c5168f, h12, -this.f41739b.f41491Q[1].e());
                        AbstractC5178p.b(c5168f2, c5168f, -c5169g.f41720g);
                        return;
                    }
                    return;
                }
                if ((c5139d7 instanceof w.i) || c5139d7.f41494T == null || c5139d7.i(7).f41473f != null) {
                    return;
                }
                C5139d c5139d8 = this.f41739b;
                AbstractC5178p.b(c5168f2, c5139d8.f41494T.f41506d.f41745h, c5139d8.r());
                AbstractC5178p.b(c5168f, c5168f2, c5169g.f41720g);
                return;
            }
        }
        if (this.f41741d == 3) {
            C5139d c5139d9 = this.f41739b;
            int i10 = c5139d9.f41531r;
            if (i10 == 2) {
                C5139d c5139d10 = c5139d9.f41494T;
                if (c5139d10 != null) {
                    C5169g c5169g2 = c5139d10.f41508e.f41742e;
                    c5169g.f41724l.add(c5169g2);
                    c5169g2.f41723k.add(c5169g);
                    c5169g.f41715b = true;
                    c5169g.f41723k.add(c5168f2);
                    c5169g.f41723k.add(c5168f);
                }
            } else if (i10 == 3) {
                if (c5139d9.f41532s == 3) {
                    c5168f2.f41714a = this;
                    c5168f.f41714a = this;
                    C5175m c5175m = c5139d9.f41508e;
                    c5175m.f41745h.f41714a = this;
                    c5175m.i.f41714a = this;
                    c5169g.f41714a = this;
                    if (c5139d9.y()) {
                        c5169g.f41724l.add(this.f41739b.f41508e.f41742e);
                        this.f41739b.f41508e.f41742e.f41723k.add(c5169g);
                        C5175m c5175m2 = this.f41739b.f41508e;
                        c5175m2.f41742e.f41714a = this;
                        c5169g.f41724l.add(c5175m2.f41745h);
                        c5169g.f41724l.add(this.f41739b.f41508e.i);
                        this.f41739b.f41508e.f41745h.f41723k.add(c5169g);
                        this.f41739b.f41508e.i.f41723k.add(c5169g);
                    } else if (this.f41739b.x()) {
                        this.f41739b.f41508e.f41742e.f41724l.add(c5169g);
                        c5169g.f41723k.add(this.f41739b.f41508e.f41742e);
                    } else {
                        this.f41739b.f41508e.f41742e.f41724l.add(c5169g);
                    }
                } else {
                    C5169g c5169g3 = c5139d9.f41508e.f41742e;
                    c5169g.f41724l.add(c5169g3);
                    c5169g3.f41723k.add(c5169g);
                    this.f41739b.f41508e.f41745h.f41723k.add(c5169g);
                    this.f41739b.f41508e.i.f41723k.add(c5169g);
                    c5169g.f41715b = true;
                    c5169g.f41723k.add(c5168f2);
                    c5169g.f41723k.add(c5168f);
                    c5168f2.f41724l.add(c5169g);
                    c5168f.f41724l.add(c5169g);
                }
            }
        }
        C5139d c5139d11 = this.f41739b;
        C5138c[] c5138cArr2 = c5139d11.f41491Q;
        C5138c c5138c4 = c5138cArr2[0];
        C5138c c5138c5 = c5138c4.f41473f;
        if (c5138c5 != null && c5138cArr2[1].f41473f != null) {
            if (c5139d11.x()) {
                c5168f2.f41719f = this.f41739b.f41491Q[0].e();
                c5168f.f41719f = -this.f41739b.f41491Q[1].e();
                return;
            }
            C5168f h13 = AbstractC5178p.h(this.f41739b.f41491Q[0]);
            C5168f h14 = AbstractC5178p.h(this.f41739b.f41491Q[1]);
            if (h13 != null) {
                h13.b(this);
            }
            if (h14 != null) {
                h14.b(this);
            }
            this.f41746j = 4;
            return;
        }
        if (c5138c5 != null) {
            C5168f h15 = AbstractC5178p.h(c5138c4);
            if (h15 != null) {
                AbstractC5178p.b(c5168f2, h15, this.f41739b.f41491Q[0].e());
                c(c5168f, c5168f2, 1, c5169g);
                return;
            }
            return;
        }
        C5138c c5138c6 = c5138cArr2[1];
        if (c5138c6.f41473f != null) {
            C5168f h16 = AbstractC5178p.h(c5138c6);
            if (h16 != null) {
                AbstractC5178p.b(c5168f, h16, -this.f41739b.f41491Q[1].e());
                c(c5168f2, c5168f, -1, c5169g);
                return;
            }
            return;
        }
        if ((c5139d11 instanceof w.i) || (c5139d3 = c5139d11.f41494T) == null) {
            return;
        }
        AbstractC5178p.b(c5168f2, c5139d3.f41506d.f41745h, c5139d11.r());
        c(c5168f, c5168f2, 1, c5169g);
    }

    @Override // x.AbstractC5178p
    public final void e() {
        C5168f c5168f = this.f41745h;
        if (c5168f.f41722j) {
            this.f41739b.Y = c5168f.f41720g;
        }
    }

    @Override // x.AbstractC5178p
    public final void f() {
        this.f41740c = null;
        this.f41745h.c();
        this.i.c();
        this.f41742e.c();
        this.f41744g = false;
    }

    @Override // x.AbstractC5178p
    public final boolean k() {
        return this.f41741d != 3 || this.f41739b.f41531r == 0;
    }

    public final void n() {
        this.f41744g = false;
        C5168f c5168f = this.f41745h;
        c5168f.c();
        c5168f.f41722j = false;
        C5168f c5168f2 = this.i;
        c5168f2.c();
        c5168f2.f41722j = false;
        this.f41742e.f41722j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f41739b.f41515h0;
    }
}
