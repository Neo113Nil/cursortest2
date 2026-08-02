package x;

import java.util.ArrayList;
import u.AbstractC5050e;
import w.C5129d;
import w.C5130e;

/* renamed from: x.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5172k extends AbstractC5177p {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f41785k = new int[2];

    public static void m(int[] iArr, int i, int i4, int i6, int i9, float f2, int i10) {
        int i11 = i4 - i;
        int i12 = i9 - i6;
        if (i10 != -1) {
            if (i10 == 0) {
                iArr[0] = (int) ((i12 * f2) + 0.5f);
                iArr[1] = i12;
                return;
            } else {
                if (i10 != 1) {
                    return;
                }
                iArr[0] = i11;
                iArr[1] = (int) ((i11 * f2) + 0.5f);
                return;
            }
        }
        int i13 = (int) ((i12 * f2) + 0.5f);
        int i14 = (int) ((i11 / f2) + 0.5f);
        if (i13 <= i11) {
            iArr[0] = i13;
            iArr[1] = i12;
        } else if (i14 <= i12) {
            iArr[0] = i11;
            iArr[1] = i14;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0243, code lost:
    
        if (r7 != 1) goto L125;
     */
    @Override // x.InterfaceC5165d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC5165d interfaceC5165d) {
        float f2;
        float f9;
        float f10;
        float f11;
        int i;
        if (AbstractC5050e.d(this.f41804j) == 3) {
            C5130e c5130e = this.f41797b;
            l(c5130e.f41266I, c5130e.f41267K, 0);
            return;
        }
        C5168g c5168g = this.f41800e;
        boolean z6 = c5168g.f41780j;
        C5167f c5167f = this.f41803h;
        C5167f c5167f2 = this.i;
        if (!z6 && this.f41799d == 3) {
            C5130e c5130e2 = this.f41797b;
            int i4 = c5130e2.f41313r;
            if (i4 == 2) {
                f2 = 0.5f;
                C5130e c5130e3 = c5130e2.f41276T;
                if (c5130e3 != null) {
                    if (c5130e3.f41288d.f41800e.f41780j) {
                        c5168g.d((int) ((r7.f41778g * c5130e2.f41318w) + 0.5f));
                    }
                }
            } else if (i4 == 3) {
                int i6 = c5130e2.f41314s;
                if (i6 == 0 || i6 == 3) {
                    C5174m c5174m = c5130e2.f41290e;
                    C5167f c5167f3 = c5174m.f41803h;
                    C5167f c5167f4 = c5174m.i;
                    boolean z9 = c5130e2.f41266I.f41255f != null;
                    boolean z10 = c5130e2.J.f41255f != null;
                    boolean z11 = c5130e2.f41267K.f41255f != null;
                    boolean z12 = c5130e2.f41268L.f41255f != null;
                    f2 = 0.5f;
                    int i9 = c5130e2.f41280X;
                    if (z9 && z10 && z11 && z12) {
                        float f12 = c5130e2.f41279W;
                        boolean z13 = c5167f3.f41780j;
                        int[] iArr = f41785k;
                        if (z13 && c5167f4.f41780j) {
                            if (c5167f.f41774c && c5167f2.f41774c) {
                                m(iArr, ((C5167f) c5167f.f41782l.get(0)).f41778g + c5167f.f41777f, ((C5167f) c5167f2.f41782l.get(0)).f41778g - c5167f2.f41777f, c5167f3.f41778g + c5167f3.f41777f, c5167f4.f41778g - c5167f4.f41777f, f12, i9);
                                c5168g.d(iArr[0]);
                                this.f41797b.f41290e.f41800e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z14 = c5167f.f41780j;
                        ArrayList arrayList = c5167f3.f41782l;
                        if (z14 && c5167f2.f41780j) {
                            if (!c5167f3.f41774c || !c5167f4.f41774c) {
                                return;
                            }
                            m(iArr, c5167f.f41778g + c5167f.f41777f, c5167f2.f41778g - c5167f2.f41777f, ((C5167f) arrayList.get(0)).f41778g + c5167f3.f41777f, ((C5167f) c5167f4.f41782l.get(0)).f41778g - c5167f4.f41777f, f12, i9);
                            c5168g.d(iArr[0]);
                            this.f41797b.f41290e.f41800e.d(iArr[1]);
                        }
                        if (!c5167f.f41774c || !c5167f2.f41774c || !c5167f3.f41774c || !c5167f4.f41774c) {
                            return;
                        }
                        m(iArr, ((C5167f) c5167f.f41782l.get(0)).f41778g + c5167f.f41777f, ((C5167f) c5167f2.f41782l.get(0)).f41778g - c5167f2.f41777f, ((C5167f) arrayList.get(0)).f41778g + c5167f3.f41777f, ((C5167f) c5167f4.f41782l.get(0)).f41778g - c5167f4.f41777f, f12, i9);
                        c5168g.d(iArr[0]);
                        this.f41797b.f41290e.f41800e.d(iArr[1]);
                    } else if (z9 && z11) {
                        if (!c5167f.f41774c || !c5167f2.f41774c) {
                            return;
                        }
                        float f13 = c5130e2.f41279W;
                        int i10 = ((C5167f) c5167f.f41782l.get(0)).f41778g + c5167f.f41777f;
                        int i11 = ((C5167f) c5167f2.f41782l.get(0)).f41778g - c5167f2.f41777f;
                        if (i9 == -1 || i9 == 0) {
                            int g9 = g(i11 - i10, 0);
                            int i12 = (int) ((g9 * f13) + 0.5f);
                            int g10 = g(i12, 1);
                            if (i12 != g10) {
                                g9 = (int) ((g10 / f13) + 0.5f);
                            }
                            c5168g.d(g9);
                            this.f41797b.f41290e.f41800e.d(g10);
                        } else if (i9 == 1) {
                            int g11 = g(i11 - i10, 0);
                            int i13 = (int) ((g11 / f13) + 0.5f);
                            int g12 = g(i13, 1);
                            if (i13 != g12) {
                                g11 = (int) ((g12 * f13) + 0.5f);
                            }
                            c5168g.d(g11);
                            this.f41797b.f41290e.f41800e.d(g12);
                        }
                    } else if (z10 && z12) {
                        if (!c5167f3.f41774c || !c5167f4.f41774c) {
                            return;
                        }
                        float f14 = c5130e2.f41279W;
                        int i14 = ((C5167f) c5167f3.f41782l.get(0)).f41778g + c5167f3.f41777f;
                        int i15 = ((C5167f) c5167f4.f41782l.get(0)).f41778g - c5167f4.f41777f;
                        if (i9 != -1) {
                            if (i9 == 0) {
                                int g13 = g(i15 - i14, 1);
                                int i16 = (int) ((g13 * f14) + 0.5f);
                                int g14 = g(i16, 0);
                                if (i16 != g14) {
                                    g13 = (int) ((g14 / f14) + 0.5f);
                                }
                                c5168g.d(g14);
                                this.f41797b.f41290e.f41800e.d(g13);
                            }
                        }
                        int g15 = g(i15 - i14, 1);
                        int i17 = (int) ((g15 / f14) + 0.5f);
                        int g16 = g(i17, 0);
                        if (i17 != g16) {
                            g15 = (int) ((g16 * f14) + 0.5f);
                        }
                        c5168g.d(g16);
                        this.f41797b.f41290e.f41800e.d(g15);
                    }
                } else {
                    int i18 = c5130e2.f41280X;
                    if (i18 == -1) {
                        f9 = c5130e2.f41290e.f41800e.f41778g;
                        f10 = c5130e2.f41279W;
                    } else if (i18 == 0) {
                        f11 = c5130e2.f41290e.f41800e.f41778g / c5130e2.f41279W;
                        i = (int) (f11 + 0.5f);
                        c5168g.d(i);
                    } else if (i18 != 1) {
                        i = 0;
                        c5168g.d(i);
                    } else {
                        f9 = c5130e2.f41290e.f41800e.f41778g;
                        f10 = c5130e2.f41279W;
                    }
                    f11 = f9 * f10;
                    i = (int) (f11 + 0.5f);
                    c5168g.d(i);
                }
            }
            if (c5167f.f41774c || !c5167f2.f41774c) {
            }
            if (c5167f.f41780j && c5167f2.f41780j && c5168g.f41780j) {
                return;
            }
            if (!c5168g.f41780j && this.f41799d == 3) {
                C5130e c5130e4 = this.f41797b;
                if (c5130e4.f41313r == 0 && !c5130e4.x()) {
                    C5167f c5167f5 = (C5167f) c5167f.f41782l.get(0);
                    C5167f c5167f6 = (C5167f) c5167f2.f41782l.get(0);
                    int i19 = c5167f5.f41778g + c5167f.f41777f;
                    int i20 = c5167f6.f41778g + c5167f2.f41777f;
                    c5167f.d(i19);
                    c5167f2.d(i20);
                    c5168g.d(i20 - i19);
                    return;
                }
            }
            if (!c5168g.f41780j && this.f41799d == 3 && this.f41796a == 1 && c5167f.f41782l.size() > 0 && c5167f2.f41782l.size() > 0) {
                int min = Math.min((((C5167f) c5167f2.f41782l.get(0)).f41778g + c5167f2.f41777f) - (((C5167f) c5167f.f41782l.get(0)).f41778g + c5167f.f41777f), c5168g.f41783m);
                C5130e c5130e5 = this.f41797b;
                int i21 = c5130e5.f41317v;
                int max = Math.max(c5130e5.f41316u, min);
                if (i21 > 0) {
                    max = Math.min(i21, max);
                }
                c5168g.d(max);
            }
            if (c5168g.f41780j) {
                C5167f c5167f7 = (C5167f) c5167f.f41782l.get(0);
                C5167f c5167f8 = (C5167f) c5167f2.f41782l.get(0);
                int i22 = c5167f7.f41778g;
                int i23 = c5167f.f41777f + i22;
                int i24 = c5167f8.f41778g;
                int i25 = c5167f2.f41777f + i24;
                float f15 = this.f41797b.f41289d0;
                if (c5167f7 == c5167f8) {
                    f15 = f2;
                } else {
                    i22 = i23;
                    i24 = i25;
                }
                c5167f.d((int) ((((i24 - i22) - c5168g.f41778g) * f15) + i22 + f2));
                c5167f2.d(c5167f.f41778g + c5168g.f41778g);
                return;
            }
            return;
        }
        f2 = 0.5f;
        if (c5167f.f41774c) {
        }
    }

    @Override // x.AbstractC5177p
    public final void d() {
        C5130e c5130e;
        C5130e c5130e2;
        int i;
        C5130e c5130e3;
        C5130e c5130e4;
        int i4;
        C5130e c5130e5 = this.f41797b;
        boolean z6 = c5130e5.f41282a;
        C5168g c5168g = this.f41800e;
        if (z6) {
            c5168g.d(c5130e5.q());
        }
        boolean z9 = c5168g.f41780j;
        C5167f c5167f = this.i;
        C5167f c5167f2 = this.f41803h;
        if (!z9) {
            C5130e c5130e6 = this.f41797b;
            int i6 = c5130e6.f41311p0[0];
            this.f41799d = i6;
            if (i6 != 3) {
                if (i6 == 4 && (c5130e4 = c5130e6.f41276T) != null && ((i4 = c5130e4.f41311p0[0]) == 1 || i4 == 4)) {
                    int q8 = (c5130e4.q() - this.f41797b.f41266I.e()) - this.f41797b.f41267K.e();
                    AbstractC5177p.b(c5167f2, c5130e4.f41288d.f41803h, this.f41797b.f41266I.e());
                    AbstractC5177p.b(c5167f, c5130e4.f41288d.i, -this.f41797b.f41267K.e());
                    c5168g.d(q8);
                    return;
                }
                if (i6 == 1) {
                    c5168g.d(c5130e6.q());
                }
            }
        } else if (this.f41799d == 4 && (c5130e2 = (c5130e = this.f41797b).f41276T) != null && ((i = c5130e2.f41311p0[0]) == 1 || i == 4)) {
            AbstractC5177p.b(c5167f2, c5130e2.f41288d.f41803h, c5130e.f41266I.e());
            AbstractC5177p.b(c5167f, c5130e2.f41288d.i, -this.f41797b.f41267K.e());
            return;
        }
        if (c5168g.f41780j) {
            C5130e c5130e7 = this.f41797b;
            if (c5130e7.f41282a) {
                C5129d[] c5129dArr = c5130e7.f41273Q;
                C5129d c5129d = c5129dArr[0];
                C5129d c5129d2 = c5129d.f41255f;
                if (c5129d2 != null && c5129dArr[1].f41255f != null) {
                    if (c5130e7.x()) {
                        c5167f2.f41777f = this.f41797b.f41273Q[0].e();
                        c5167f.f41777f = -this.f41797b.f41273Q[1].e();
                        return;
                    }
                    C5167f h3 = AbstractC5177p.h(this.f41797b.f41273Q[0]);
                    if (h3 != null) {
                        AbstractC5177p.b(c5167f2, h3, this.f41797b.f41273Q[0].e());
                    }
                    C5167f h9 = AbstractC5177p.h(this.f41797b.f41273Q[1]);
                    if (h9 != null) {
                        AbstractC5177p.b(c5167f, h9, -this.f41797b.f41273Q[1].e());
                    }
                    c5167f2.f41773b = true;
                    c5167f.f41773b = true;
                    return;
                }
                if (c5129d2 != null) {
                    C5167f h10 = AbstractC5177p.h(c5129d);
                    if (h10 != null) {
                        AbstractC5177p.b(c5167f2, h10, this.f41797b.f41273Q[0].e());
                        AbstractC5177p.b(c5167f, c5167f2, c5168g.f41778g);
                        return;
                    }
                    return;
                }
                C5129d c5129d3 = c5129dArr[1];
                if (c5129d3.f41255f != null) {
                    C5167f h11 = AbstractC5177p.h(c5129d3);
                    if (h11 != null) {
                        AbstractC5177p.b(c5167f, h11, -this.f41797b.f41273Q[1].e());
                        AbstractC5177p.b(c5167f2, c5167f, -c5168g.f41778g);
                        return;
                    }
                    return;
                }
                if ((c5130e7 instanceof w.j) || c5130e7.f41276T == null || c5130e7.i(7).f41255f != null) {
                    return;
                }
                C5130e c5130e8 = this.f41797b;
                AbstractC5177p.b(c5167f2, c5130e8.f41276T.f41288d.f41803h, c5130e8.r());
                AbstractC5177p.b(c5167f, c5167f2, c5168g.f41778g);
                return;
            }
        }
        if (this.f41799d == 3) {
            C5130e c5130e9 = this.f41797b;
            int i9 = c5130e9.f41313r;
            if (i9 == 2) {
                C5130e c5130e10 = c5130e9.f41276T;
                if (c5130e10 != null) {
                    C5168g c5168g2 = c5130e10.f41290e.f41800e;
                    c5168g.f41782l.add(c5168g2);
                    c5168g2.f41781k.add(c5168g);
                    c5168g.f41773b = true;
                    c5168g.f41781k.add(c5167f2);
                    c5168g.f41781k.add(c5167f);
                }
            } else if (i9 == 3) {
                if (c5130e9.f41314s == 3) {
                    c5167f2.f41772a = this;
                    c5167f.f41772a = this;
                    C5174m c5174m = c5130e9.f41290e;
                    c5174m.f41803h.f41772a = this;
                    c5174m.i.f41772a = this;
                    c5168g.f41772a = this;
                    if (c5130e9.y()) {
                        c5168g.f41782l.add(this.f41797b.f41290e.f41800e);
                        this.f41797b.f41290e.f41800e.f41781k.add(c5168g);
                        C5174m c5174m2 = this.f41797b.f41290e;
                        c5174m2.f41800e.f41772a = this;
                        c5168g.f41782l.add(c5174m2.f41803h);
                        c5168g.f41782l.add(this.f41797b.f41290e.i);
                        this.f41797b.f41290e.f41803h.f41781k.add(c5168g);
                        this.f41797b.f41290e.i.f41781k.add(c5168g);
                    } else if (this.f41797b.x()) {
                        this.f41797b.f41290e.f41800e.f41782l.add(c5168g);
                        c5168g.f41781k.add(this.f41797b.f41290e.f41800e);
                    } else {
                        this.f41797b.f41290e.f41800e.f41782l.add(c5168g);
                    }
                } else {
                    C5168g c5168g3 = c5130e9.f41290e.f41800e;
                    c5168g.f41782l.add(c5168g3);
                    c5168g3.f41781k.add(c5168g);
                    this.f41797b.f41290e.f41803h.f41781k.add(c5168g);
                    this.f41797b.f41290e.i.f41781k.add(c5168g);
                    c5168g.f41773b = true;
                    c5168g.f41781k.add(c5167f2);
                    c5168g.f41781k.add(c5167f);
                    c5167f2.f41782l.add(c5168g);
                    c5167f.f41782l.add(c5168g);
                }
            }
        }
        C5130e c5130e11 = this.f41797b;
        C5129d[] c5129dArr2 = c5130e11.f41273Q;
        C5129d c5129d4 = c5129dArr2[0];
        C5129d c5129d5 = c5129d4.f41255f;
        if (c5129d5 != null && c5129dArr2[1].f41255f != null) {
            if (c5130e11.x()) {
                c5167f2.f41777f = this.f41797b.f41273Q[0].e();
                c5167f.f41777f = -this.f41797b.f41273Q[1].e();
                return;
            }
            C5167f h12 = AbstractC5177p.h(this.f41797b.f41273Q[0]);
            C5167f h13 = AbstractC5177p.h(this.f41797b.f41273Q[1]);
            if (h12 != null) {
                h12.b(this);
            }
            if (h13 != null) {
                h13.b(this);
            }
            this.f41804j = 4;
            return;
        }
        if (c5129d5 != null) {
            C5167f h14 = AbstractC5177p.h(c5129d4);
            if (h14 != null) {
                AbstractC5177p.b(c5167f2, h14, this.f41797b.f41273Q[0].e());
                c(c5167f, c5167f2, 1, c5168g);
                return;
            }
            return;
        }
        C5129d c5129d6 = c5129dArr2[1];
        if (c5129d6.f41255f != null) {
            C5167f h15 = AbstractC5177p.h(c5129d6);
            if (h15 != null) {
                AbstractC5177p.b(c5167f, h15, -this.f41797b.f41273Q[1].e());
                c(c5167f2, c5167f, -1, c5168g);
                return;
            }
            return;
        }
        if ((c5130e11 instanceof w.j) || (c5130e3 = c5130e11.f41276T) == null) {
            return;
        }
        AbstractC5177p.b(c5167f2, c5130e3.f41288d.f41803h, c5130e11.r());
        c(c5167f, c5167f2, 1, c5168g);
    }

    @Override // x.AbstractC5177p
    public final void e() {
        C5167f c5167f = this.f41803h;
        if (c5167f.f41780j) {
            this.f41797b.Y = c5167f.f41778g;
        }
    }

    @Override // x.AbstractC5177p
    public final void f() {
        this.f41798c = null;
        this.f41803h.c();
        this.i.c();
        this.f41800e.c();
        this.f41802g = false;
    }

    @Override // x.AbstractC5177p
    public final boolean k() {
        return this.f41799d != 3 || this.f41797b.f41313r == 0;
    }

    public final void n() {
        this.f41802g = false;
        C5167f c5167f = this.f41803h;
        c5167f.c();
        c5167f.f41780j = false;
        C5167f c5167f2 = this.i;
        c5167f2.c();
        c5167f2.f41780j = false;
        this.f41800e.f41780j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f41797b.f41297h0;
    }
}
