package x;

import u.AbstractC5049e;
import w.C5138c;
import w.C5139d;

/* renamed from: x.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5175m extends AbstractC5178p {

    /* renamed from: k, reason: collision with root package name */
    public C5168f f41730k;

    /* renamed from: l, reason: collision with root package name */
    public C5163a f41731l;

    @Override // x.InterfaceC5166d
    public final void a(InterfaceC5166d interfaceC5166d) {
        float f3;
        float f9;
        float f10;
        int i;
        if (AbstractC5049e.d(this.f41746j) == 3) {
            C5139d c5139d = this.f41739b;
            l(c5139d.J, c5139d.f41486L, 1);
            return;
        }
        C5169g c5169g = this.f41742e;
        if (c5169g.f41716c && !c5169g.f41722j && this.f41741d == 3) {
            C5139d c5139d2 = this.f41739b;
            int i6 = c5139d2.f41532s;
            if (i6 == 2) {
                C5139d c5139d3 = c5139d2.f41494T;
                if (c5139d3 != null) {
                    if (c5139d3.f41508e.f41742e.f41722j) {
                        c5169g.d((int) ((r5.f41720g * c5139d2.f41539z) + 0.5f));
                    }
                }
            } else if (i6 == 3) {
                C5169g c5169g2 = c5139d2.f41506d.f41742e;
                if (c5169g2.f41722j) {
                    int i9 = c5139d2.f41498X;
                    if (i9 == -1) {
                        f3 = c5169g2.f41720g;
                        f9 = c5139d2.f41497W;
                    } else if (i9 == 0) {
                        f10 = c5169g2.f41720g * c5139d2.f41497W;
                        i = (int) (f10 + 0.5f);
                        c5169g.d(i);
                    } else if (i9 != 1) {
                        i = 0;
                        c5169g.d(i);
                    } else {
                        f3 = c5169g2.f41720g;
                        f9 = c5139d2.f41497W;
                    }
                    f10 = f3 / f9;
                    i = (int) (f10 + 0.5f);
                    c5169g.d(i);
                }
            }
        }
        C5168f c5168f = this.f41745h;
        if (c5168f.f41716c) {
            C5168f c5168f2 = this.i;
            if (c5168f2.f41716c) {
                if (c5168f.f41722j && c5168f2.f41722j && c5169g.f41722j) {
                    return;
                }
                if (!c5169g.f41722j && this.f41741d == 3) {
                    C5139d c5139d4 = this.f41739b;
                    if (c5139d4.f41531r == 0 && !c5139d4.y()) {
                        C5168f c5168f3 = (C5168f) c5168f.f41724l.get(0);
                        C5168f c5168f4 = (C5168f) c5168f2.f41724l.get(0);
                        int i10 = c5168f3.f41720g + c5168f.f41719f;
                        int i11 = c5168f4.f41720g + c5168f2.f41719f;
                        c5168f.d(i10);
                        c5168f2.d(i11);
                        c5169g.d(i11 - i10);
                        return;
                    }
                }
                if (!c5169g.f41722j && this.f41741d == 3 && this.f41738a == 1 && c5168f.f41724l.size() > 0 && c5168f2.f41724l.size() > 0) {
                    C5168f c5168f5 = (C5168f) c5168f.f41724l.get(0);
                    int i12 = (((C5168f) c5168f2.f41724l.get(0)).f41720g + c5168f2.f41719f) - (c5168f5.f41720g + c5168f.f41719f);
                    int i13 = c5169g.f41725m;
                    if (i12 < i13) {
                        c5169g.d(i12);
                    } else {
                        c5169g.d(i13);
                    }
                }
                if (c5169g.f41722j && c5168f.f41724l.size() > 0 && c5168f2.f41724l.size() > 0) {
                    C5168f c5168f6 = (C5168f) c5168f.f41724l.get(0);
                    C5168f c5168f7 = (C5168f) c5168f2.f41724l.get(0);
                    int i14 = c5168f6.f41720g;
                    int i15 = c5168f.f41719f + i14;
                    int i16 = c5168f7.f41720g;
                    int i17 = c5168f2.f41719f + i16;
                    float f11 = this.f41739b.f41509e0;
                    if (c5168f6 == c5168f7) {
                        f11 = 0.5f;
                    } else {
                        i14 = i15;
                        i16 = i17;
                    }
                    c5168f.d((int) ((((i16 - i14) - c5169g.f41720g) * f11) + i14 + 0.5f));
                    c5168f2.d(c5168f.f41720g + c5169g.f41720g);
                }
            }
        }
    }

    @Override // x.AbstractC5178p
    public final void d() {
        C5139d c5139d;
        C5139d c5139d2;
        C5139d c5139d3;
        C5139d c5139d4;
        C5139d c5139d5 = this.f41739b;
        boolean z3 = c5139d5.f41500a;
        C5169g c5169g = this.f41742e;
        if (z3) {
            c5169g.d(c5139d5.k());
        }
        boolean z6 = c5169g.f41722j;
        C5168f c5168f = this.i;
        C5168f c5168f2 = this.f41745h;
        if (!z6) {
            C5139d c5139d6 = this.f41739b;
            this.f41741d = c5139d6.f41529p0[1];
            if (c5139d6.f41480E) {
                this.f41731l = new C5163a(this);
            }
            int i = this.f41741d;
            if (i != 3) {
                if (i == 4 && (c5139d4 = this.f41739b.f41494T) != null && c5139d4.f41529p0[1] == 1) {
                    int k9 = (c5139d4.k() - this.f41739b.J.e()) - this.f41739b.f41486L.e();
                    AbstractC5178p.b(c5168f2, c5139d4.f41508e.f41745h, this.f41739b.J.e());
                    AbstractC5178p.b(c5168f, c5139d4.f41508e.i, -this.f41739b.f41486L.e());
                    c5169g.d(k9);
                    return;
                }
                if (i == 1) {
                    c5169g.d(this.f41739b.k());
                }
            }
        } else if (this.f41741d == 4 && (c5139d2 = (c5139d = this.f41739b).f41494T) != null && c5139d2.f41529p0[1] == 1) {
            AbstractC5178p.b(c5168f2, c5139d2.f41508e.f41745h, c5139d.J.e());
            AbstractC5178p.b(c5168f, c5139d2.f41508e.i, -this.f41739b.f41486L.e());
            return;
        }
        boolean z9 = c5169g.f41722j;
        C5168f c5168f3 = this.f41730k;
        if (z9) {
            C5139d c5139d7 = this.f41739b;
            if (c5139d7.f41500a) {
                C5138c[] c5138cArr = c5139d7.f41491Q;
                C5138c c5138c = c5138cArr[2];
                C5138c c5138c2 = c5138c.f41473f;
                if (c5138c2 != null && c5138cArr[3].f41473f != null) {
                    if (c5139d7.y()) {
                        c5168f2.f41719f = this.f41739b.f41491Q[2].e();
                        c5168f.f41719f = -this.f41739b.f41491Q[3].e();
                    } else {
                        C5168f h9 = AbstractC5178p.h(this.f41739b.f41491Q[2]);
                        if (h9 != null) {
                            AbstractC5178p.b(c5168f2, h9, this.f41739b.f41491Q[2].e());
                        }
                        C5168f h10 = AbstractC5178p.h(this.f41739b.f41491Q[3]);
                        if (h10 != null) {
                            AbstractC5178p.b(c5168f, h10, -this.f41739b.f41491Q[3].e());
                        }
                        c5168f2.f41715b = true;
                        c5168f.f41715b = true;
                    }
                    C5139d c5139d8 = this.f41739b;
                    if (c5139d8.f41480E) {
                        AbstractC5178p.b(c5168f3, c5168f2, c5139d8.f41501a0);
                        return;
                    }
                    return;
                }
                if (c5138c2 != null) {
                    C5168f h11 = AbstractC5178p.h(c5138c);
                    if (h11 != null) {
                        AbstractC5178p.b(c5168f2, h11, this.f41739b.f41491Q[2].e());
                        AbstractC5178p.b(c5168f, c5168f2, c5169g.f41720g);
                        C5139d c5139d9 = this.f41739b;
                        if (c5139d9.f41480E) {
                            AbstractC5178p.b(c5168f3, c5168f2, c5139d9.f41501a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C5138c c5138c3 = c5138cArr[3];
                if (c5138c3.f41473f != null) {
                    C5168f h12 = AbstractC5178p.h(c5138c3);
                    if (h12 != null) {
                        AbstractC5178p.b(c5168f, h12, -this.f41739b.f41491Q[3].e());
                        AbstractC5178p.b(c5168f2, c5168f, -c5169g.f41720g);
                    }
                    C5139d c5139d10 = this.f41739b;
                    if (c5139d10.f41480E) {
                        AbstractC5178p.b(c5168f3, c5168f2, c5139d10.f41501a0);
                        return;
                    }
                    return;
                }
                C5138c c5138c4 = c5138cArr[4];
                if (c5138c4.f41473f != null) {
                    C5168f h13 = AbstractC5178p.h(c5138c4);
                    if (h13 != null) {
                        AbstractC5178p.b(c5168f3, h13, 0);
                        AbstractC5178p.b(c5168f2, c5168f3, -this.f41739b.f41501a0);
                        AbstractC5178p.b(c5168f, c5168f2, c5169g.f41720g);
                        return;
                    }
                    return;
                }
                if ((c5139d7 instanceof w.i) || c5139d7.f41494T == null || c5139d7.i(7).f41473f != null) {
                    return;
                }
                C5139d c5139d11 = this.f41739b;
                AbstractC5178p.b(c5168f2, c5139d11.f41494T.f41508e.f41745h, c5139d11.s());
                AbstractC5178p.b(c5168f, c5168f2, c5169g.f41720g);
                C5139d c5139d12 = this.f41739b;
                if (c5139d12.f41480E) {
                    AbstractC5178p.b(c5168f3, c5168f2, c5139d12.f41501a0);
                    return;
                }
                return;
            }
        }
        if (z9 || this.f41741d != 3) {
            c5169g.b(this);
        } else {
            C5139d c5139d13 = this.f41739b;
            int i6 = c5139d13.f41532s;
            if (i6 == 2) {
                C5139d c5139d14 = c5139d13.f41494T;
                if (c5139d14 != null) {
                    C5169g c5169g2 = c5139d14.f41508e.f41742e;
                    c5169g.f41724l.add(c5169g2);
                    c5169g2.f41723k.add(c5169g);
                    c5169g.f41715b = true;
                    c5169g.f41723k.add(c5168f2);
                    c5169g.f41723k.add(c5168f);
                }
            } else if (i6 == 3 && !c5139d13.y()) {
                C5139d c5139d15 = this.f41739b;
                if (c5139d15.f41531r != 3) {
                    C5169g c5169g3 = c5139d15.f41506d.f41742e;
                    c5169g.f41724l.add(c5169g3);
                    c5169g3.f41723k.add(c5169g);
                    c5169g.f41715b = true;
                    c5169g.f41723k.add(c5168f2);
                    c5169g.f41723k.add(c5168f);
                }
            }
        }
        C5139d c5139d16 = this.f41739b;
        C5138c[] c5138cArr2 = c5139d16.f41491Q;
        C5138c c5138c5 = c5138cArr2[2];
        C5138c c5138c6 = c5138c5.f41473f;
        if (c5138c6 != null && c5138cArr2[3].f41473f != null) {
            if (c5139d16.y()) {
                c5168f2.f41719f = this.f41739b.f41491Q[2].e();
                c5168f.f41719f = -this.f41739b.f41491Q[3].e();
            } else {
                C5168f h14 = AbstractC5178p.h(this.f41739b.f41491Q[2]);
                C5168f h15 = AbstractC5178p.h(this.f41739b.f41491Q[3]);
                if (h14 != null) {
                    h14.b(this);
                }
                if (h15 != null) {
                    h15.b(this);
                }
                this.f41746j = 4;
            }
            if (this.f41739b.f41480E) {
                c(c5168f3, c5168f2, 1, this.f41731l);
            }
        } else if (c5138c6 != null) {
            C5168f h16 = AbstractC5178p.h(c5138c5);
            if (h16 != null) {
                AbstractC5178p.b(c5168f2, h16, this.f41739b.f41491Q[2].e());
                c(c5168f, c5168f2, 1, c5169g);
                if (this.f41739b.f41480E) {
                    c(c5168f3, c5168f2, 1, this.f41731l);
                }
                if (this.f41741d == 3) {
                    C5139d c5139d17 = this.f41739b;
                    if (c5139d17.f41497W > 0.0f) {
                        C5173k c5173k = c5139d17.f41506d;
                        if (c5173k.f41741d == 3) {
                            c5173k.f41742e.f41723k.add(c5169g);
                            c5169g.f41724l.add(this.f41739b.f41506d.f41742e);
                            c5169g.f41714a = this;
                        }
                    }
                }
            }
        } else {
            C5138c c5138c7 = c5138cArr2[3];
            if (c5138c7.f41473f != null) {
                C5168f h17 = AbstractC5178p.h(c5138c7);
                if (h17 != null) {
                    AbstractC5178p.b(c5168f, h17, -this.f41739b.f41491Q[3].e());
                    c(c5168f2, c5168f, -1, c5169g);
                    if (this.f41739b.f41480E) {
                        c(c5168f3, c5168f2, 1, this.f41731l);
                    }
                }
            } else {
                C5138c c5138c8 = c5138cArr2[4];
                if (c5138c8.f41473f != null) {
                    C5168f h18 = AbstractC5178p.h(c5138c8);
                    if (h18 != null) {
                        AbstractC5178p.b(c5168f3, h18, 0);
                        c(c5168f2, c5168f3, -1, this.f41731l);
                        c(c5168f, c5168f2, 1, c5169g);
                    }
                } else if (!(c5139d16 instanceof w.i) && (c5139d3 = c5139d16.f41494T) != null) {
                    AbstractC5178p.b(c5168f2, c5139d3.f41508e.f41745h, c5139d16.s());
                    c(c5168f, c5168f2, 1, c5169g);
                    if (this.f41739b.f41480E) {
                        c(c5168f3, c5168f2, 1, this.f41731l);
                    }
                    if (this.f41741d == 3) {
                        C5139d c5139d18 = this.f41739b;
                        if (c5139d18.f41497W > 0.0f) {
                            C5173k c5173k2 = c5139d18.f41506d;
                            if (c5173k2.f41741d == 3) {
                                c5173k2.f41742e.f41723k.add(c5169g);
                                c5169g.f41724l.add(this.f41739b.f41506d.f41742e);
                                c5169g.f41714a = this;
                            }
                        }
                    }
                }
            }
        }
        if (c5169g.f41724l.size() == 0) {
            c5169g.f41716c = true;
        }
    }

    @Override // x.AbstractC5178p
    public final void e() {
        C5168f c5168f = this.f41745h;
        if (c5168f.f41722j) {
            this.f41739b.f41499Z = c5168f.f41720g;
        }
    }

    @Override // x.AbstractC5178p
    public final void f() {
        this.f41740c = null;
        this.f41745h.c();
        this.i.c();
        this.f41730k.c();
        this.f41742e.c();
        this.f41744g = false;
    }

    @Override // x.AbstractC5178p
    public final boolean k() {
        return this.f41741d != 3 || this.f41739b.f41532s == 0;
    }

    public final void m() {
        this.f41744g = false;
        C5168f c5168f = this.f41745h;
        c5168f.c();
        c5168f.f41722j = false;
        C5168f c5168f2 = this.i;
        c5168f2.c();
        c5168f2.f41722j = false;
        C5168f c5168f3 = this.f41730k;
        c5168f3.c();
        c5168f3.f41722j = false;
        this.f41742e.f41722j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f41739b.f41515h0;
    }
}
