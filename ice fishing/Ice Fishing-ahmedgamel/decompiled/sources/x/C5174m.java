package x;

import u.AbstractC5050e;
import w.C5129d;
import w.C5130e;

/* renamed from: x.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5174m extends AbstractC5177p {

    /* renamed from: k, reason: collision with root package name */
    public C5167f f41788k;

    /* renamed from: l, reason: collision with root package name */
    public C5162a f41789l;

    @Override // x.InterfaceC5165d
    public final void a(InterfaceC5165d interfaceC5165d) {
        float f2;
        float f9;
        float f10;
        int i;
        if (AbstractC5050e.d(this.f41804j) == 3) {
            C5130e c5130e = this.f41797b;
            l(c5130e.J, c5130e.f41268L, 1);
            return;
        }
        C5168g c5168g = this.f41800e;
        if (c5168g.f41774c && !c5168g.f41780j && this.f41799d == 3) {
            C5130e c5130e2 = this.f41797b;
            int i4 = c5130e2.f41314s;
            if (i4 == 2) {
                C5130e c5130e3 = c5130e2.f41276T;
                if (c5130e3 != null) {
                    if (c5130e3.f41290e.f41800e.f41780j) {
                        c5168g.d((int) ((r5.f41778g * c5130e2.f41321z) + 0.5f));
                    }
                }
            } else if (i4 == 3) {
                C5168g c5168g2 = c5130e2.f41288d.f41800e;
                if (c5168g2.f41780j) {
                    int i6 = c5130e2.f41280X;
                    if (i6 == -1) {
                        f2 = c5168g2.f41778g;
                        f9 = c5130e2.f41279W;
                    } else if (i6 == 0) {
                        f10 = c5168g2.f41778g * c5130e2.f41279W;
                        i = (int) (f10 + 0.5f);
                        c5168g.d(i);
                    } else if (i6 != 1) {
                        i = 0;
                        c5168g.d(i);
                    } else {
                        f2 = c5168g2.f41778g;
                        f9 = c5130e2.f41279W;
                    }
                    f10 = f2 / f9;
                    i = (int) (f10 + 0.5f);
                    c5168g.d(i);
                }
            }
        }
        C5167f c5167f = this.f41803h;
        if (c5167f.f41774c) {
            C5167f c5167f2 = this.i;
            if (c5167f2.f41774c) {
                if (c5167f.f41780j && c5167f2.f41780j && c5168g.f41780j) {
                    return;
                }
                if (!c5168g.f41780j && this.f41799d == 3) {
                    C5130e c5130e4 = this.f41797b;
                    if (c5130e4.f41313r == 0 && !c5130e4.y()) {
                        C5167f c5167f3 = (C5167f) c5167f.f41782l.get(0);
                        C5167f c5167f4 = (C5167f) c5167f2.f41782l.get(0);
                        int i9 = c5167f3.f41778g + c5167f.f41777f;
                        int i10 = c5167f4.f41778g + c5167f2.f41777f;
                        c5167f.d(i9);
                        c5167f2.d(i10);
                        c5168g.d(i10 - i9);
                        return;
                    }
                }
                if (!c5168g.f41780j && this.f41799d == 3 && this.f41796a == 1 && c5167f.f41782l.size() > 0 && c5167f2.f41782l.size() > 0) {
                    C5167f c5167f5 = (C5167f) c5167f.f41782l.get(0);
                    int i11 = (((C5167f) c5167f2.f41782l.get(0)).f41778g + c5167f2.f41777f) - (c5167f5.f41778g + c5167f.f41777f);
                    int i12 = c5168g.f41783m;
                    if (i11 < i12) {
                        c5168g.d(i11);
                    } else {
                        c5168g.d(i12);
                    }
                }
                if (c5168g.f41780j && c5167f.f41782l.size() > 0 && c5167f2.f41782l.size() > 0) {
                    C5167f c5167f6 = (C5167f) c5167f.f41782l.get(0);
                    C5167f c5167f7 = (C5167f) c5167f2.f41782l.get(0);
                    int i13 = c5167f6.f41778g;
                    int i14 = c5167f.f41777f + i13;
                    int i15 = c5167f7.f41778g;
                    int i16 = c5167f2.f41777f + i15;
                    float f11 = this.f41797b.f41291e0;
                    if (c5167f6 == c5167f7) {
                        f11 = 0.5f;
                    } else {
                        i13 = i14;
                        i15 = i16;
                    }
                    c5167f.d((int) ((((i15 - i13) - c5168g.f41778g) * f11) + i13 + 0.5f));
                    c5167f2.d(c5167f.f41778g + c5168g.f41778g);
                }
            }
        }
    }

    @Override // x.AbstractC5177p
    public final void d() {
        C5130e c5130e;
        C5130e c5130e2;
        C5130e c5130e3;
        C5130e c5130e4;
        C5130e c5130e5 = this.f41797b;
        boolean z6 = c5130e5.f41282a;
        C5168g c5168g = this.f41800e;
        if (z6) {
            c5168g.d(c5130e5.k());
        }
        boolean z9 = c5168g.f41780j;
        C5167f c5167f = this.i;
        C5167f c5167f2 = this.f41803h;
        if (!z9) {
            C5130e c5130e6 = this.f41797b;
            this.f41799d = c5130e6.f41311p0[1];
            if (c5130e6.f41262E) {
                this.f41789l = new C5162a(this);
            }
            int i = this.f41799d;
            if (i != 3) {
                if (i == 4 && (c5130e4 = this.f41797b.f41276T) != null && c5130e4.f41311p0[1] == 1) {
                    int k9 = (c5130e4.k() - this.f41797b.J.e()) - this.f41797b.f41268L.e();
                    AbstractC5177p.b(c5167f2, c5130e4.f41290e.f41803h, this.f41797b.J.e());
                    AbstractC5177p.b(c5167f, c5130e4.f41290e.i, -this.f41797b.f41268L.e());
                    c5168g.d(k9);
                    return;
                }
                if (i == 1) {
                    c5168g.d(this.f41797b.k());
                }
            }
        } else if (this.f41799d == 4 && (c5130e2 = (c5130e = this.f41797b).f41276T) != null && c5130e2.f41311p0[1] == 1) {
            AbstractC5177p.b(c5167f2, c5130e2.f41290e.f41803h, c5130e.J.e());
            AbstractC5177p.b(c5167f, c5130e2.f41290e.i, -this.f41797b.f41268L.e());
            return;
        }
        boolean z10 = c5168g.f41780j;
        C5167f c5167f3 = this.f41788k;
        if (z10) {
            C5130e c5130e7 = this.f41797b;
            if (c5130e7.f41282a) {
                C5129d[] c5129dArr = c5130e7.f41273Q;
                C5129d c5129d = c5129dArr[2];
                C5129d c5129d2 = c5129d.f41255f;
                if (c5129d2 != null && c5129dArr[3].f41255f != null) {
                    if (c5130e7.y()) {
                        c5167f2.f41777f = this.f41797b.f41273Q[2].e();
                        c5167f.f41777f = -this.f41797b.f41273Q[3].e();
                    } else {
                        C5167f h3 = AbstractC5177p.h(this.f41797b.f41273Q[2]);
                        if (h3 != null) {
                            AbstractC5177p.b(c5167f2, h3, this.f41797b.f41273Q[2].e());
                        }
                        C5167f h9 = AbstractC5177p.h(this.f41797b.f41273Q[3]);
                        if (h9 != null) {
                            AbstractC5177p.b(c5167f, h9, -this.f41797b.f41273Q[3].e());
                        }
                        c5167f2.f41773b = true;
                        c5167f.f41773b = true;
                    }
                    C5130e c5130e8 = this.f41797b;
                    if (c5130e8.f41262E) {
                        AbstractC5177p.b(c5167f3, c5167f2, c5130e8.f41283a0);
                        return;
                    }
                    return;
                }
                if (c5129d2 != null) {
                    C5167f h10 = AbstractC5177p.h(c5129d);
                    if (h10 != null) {
                        AbstractC5177p.b(c5167f2, h10, this.f41797b.f41273Q[2].e());
                        AbstractC5177p.b(c5167f, c5167f2, c5168g.f41778g);
                        C5130e c5130e9 = this.f41797b;
                        if (c5130e9.f41262E) {
                            AbstractC5177p.b(c5167f3, c5167f2, c5130e9.f41283a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C5129d c5129d3 = c5129dArr[3];
                if (c5129d3.f41255f != null) {
                    C5167f h11 = AbstractC5177p.h(c5129d3);
                    if (h11 != null) {
                        AbstractC5177p.b(c5167f, h11, -this.f41797b.f41273Q[3].e());
                        AbstractC5177p.b(c5167f2, c5167f, -c5168g.f41778g);
                    }
                    C5130e c5130e10 = this.f41797b;
                    if (c5130e10.f41262E) {
                        AbstractC5177p.b(c5167f3, c5167f2, c5130e10.f41283a0);
                        return;
                    }
                    return;
                }
                C5129d c5129d4 = c5129dArr[4];
                if (c5129d4.f41255f != null) {
                    C5167f h12 = AbstractC5177p.h(c5129d4);
                    if (h12 != null) {
                        AbstractC5177p.b(c5167f3, h12, 0);
                        AbstractC5177p.b(c5167f2, c5167f3, -this.f41797b.f41283a0);
                        AbstractC5177p.b(c5167f, c5167f2, c5168g.f41778g);
                        return;
                    }
                    return;
                }
                if ((c5130e7 instanceof w.j) || c5130e7.f41276T == null || c5130e7.i(7).f41255f != null) {
                    return;
                }
                C5130e c5130e11 = this.f41797b;
                AbstractC5177p.b(c5167f2, c5130e11.f41276T.f41290e.f41803h, c5130e11.s());
                AbstractC5177p.b(c5167f, c5167f2, c5168g.f41778g);
                C5130e c5130e12 = this.f41797b;
                if (c5130e12.f41262E) {
                    AbstractC5177p.b(c5167f3, c5167f2, c5130e12.f41283a0);
                    return;
                }
                return;
            }
        }
        if (z10 || this.f41799d != 3) {
            c5168g.b(this);
        } else {
            C5130e c5130e13 = this.f41797b;
            int i4 = c5130e13.f41314s;
            if (i4 == 2) {
                C5130e c5130e14 = c5130e13.f41276T;
                if (c5130e14 != null) {
                    C5168g c5168g2 = c5130e14.f41290e.f41800e;
                    c5168g.f41782l.add(c5168g2);
                    c5168g2.f41781k.add(c5168g);
                    c5168g.f41773b = true;
                    c5168g.f41781k.add(c5167f2);
                    c5168g.f41781k.add(c5167f);
                }
            } else if (i4 == 3 && !c5130e13.y()) {
                C5130e c5130e15 = this.f41797b;
                if (c5130e15.f41313r != 3) {
                    C5168g c5168g3 = c5130e15.f41288d.f41800e;
                    c5168g.f41782l.add(c5168g3);
                    c5168g3.f41781k.add(c5168g);
                    c5168g.f41773b = true;
                    c5168g.f41781k.add(c5167f2);
                    c5168g.f41781k.add(c5167f);
                }
            }
        }
        C5130e c5130e16 = this.f41797b;
        C5129d[] c5129dArr2 = c5130e16.f41273Q;
        C5129d c5129d5 = c5129dArr2[2];
        C5129d c5129d6 = c5129d5.f41255f;
        if (c5129d6 != null && c5129dArr2[3].f41255f != null) {
            if (c5130e16.y()) {
                c5167f2.f41777f = this.f41797b.f41273Q[2].e();
                c5167f.f41777f = -this.f41797b.f41273Q[3].e();
            } else {
                C5167f h13 = AbstractC5177p.h(this.f41797b.f41273Q[2]);
                C5167f h14 = AbstractC5177p.h(this.f41797b.f41273Q[3]);
                if (h13 != null) {
                    h13.b(this);
                }
                if (h14 != null) {
                    h14.b(this);
                }
                this.f41804j = 4;
            }
            if (this.f41797b.f41262E) {
                c(c5167f3, c5167f2, 1, this.f41789l);
            }
        } else if (c5129d6 != null) {
            C5167f h15 = AbstractC5177p.h(c5129d5);
            if (h15 != null) {
                AbstractC5177p.b(c5167f2, h15, this.f41797b.f41273Q[2].e());
                c(c5167f, c5167f2, 1, c5168g);
                if (this.f41797b.f41262E) {
                    c(c5167f3, c5167f2, 1, this.f41789l);
                }
                if (this.f41799d == 3) {
                    C5130e c5130e17 = this.f41797b;
                    if (c5130e17.f41279W > 0.0f) {
                        C5172k c5172k = c5130e17.f41288d;
                        if (c5172k.f41799d == 3) {
                            c5172k.f41800e.f41781k.add(c5168g);
                            c5168g.f41782l.add(this.f41797b.f41288d.f41800e);
                            c5168g.f41772a = this;
                        }
                    }
                }
            }
        } else {
            C5129d c5129d7 = c5129dArr2[3];
            if (c5129d7.f41255f != null) {
                C5167f h16 = AbstractC5177p.h(c5129d7);
                if (h16 != null) {
                    AbstractC5177p.b(c5167f, h16, -this.f41797b.f41273Q[3].e());
                    c(c5167f2, c5167f, -1, c5168g);
                    if (this.f41797b.f41262E) {
                        c(c5167f3, c5167f2, 1, this.f41789l);
                    }
                }
            } else {
                C5129d c5129d8 = c5129dArr2[4];
                if (c5129d8.f41255f != null) {
                    C5167f h17 = AbstractC5177p.h(c5129d8);
                    if (h17 != null) {
                        AbstractC5177p.b(c5167f3, h17, 0);
                        c(c5167f2, c5167f3, -1, this.f41789l);
                        c(c5167f, c5167f2, 1, c5168g);
                    }
                } else if (!(c5130e16 instanceof w.j) && (c5130e3 = c5130e16.f41276T) != null) {
                    AbstractC5177p.b(c5167f2, c5130e3.f41290e.f41803h, c5130e16.s());
                    c(c5167f, c5167f2, 1, c5168g);
                    if (this.f41797b.f41262E) {
                        c(c5167f3, c5167f2, 1, this.f41789l);
                    }
                    if (this.f41799d == 3) {
                        C5130e c5130e18 = this.f41797b;
                        if (c5130e18.f41279W > 0.0f) {
                            C5172k c5172k2 = c5130e18.f41288d;
                            if (c5172k2.f41799d == 3) {
                                c5172k2.f41800e.f41781k.add(c5168g);
                                c5168g.f41782l.add(this.f41797b.f41288d.f41800e);
                                c5168g.f41772a = this;
                            }
                        }
                    }
                }
            }
        }
        if (c5168g.f41782l.size() == 0) {
            c5168g.f41774c = true;
        }
    }

    @Override // x.AbstractC5177p
    public final void e() {
        C5167f c5167f = this.f41803h;
        if (c5167f.f41780j) {
            this.f41797b.f41281Z = c5167f.f41778g;
        }
    }

    @Override // x.AbstractC5177p
    public final void f() {
        this.f41798c = null;
        this.f41803h.c();
        this.i.c();
        this.f41788k.c();
        this.f41800e.c();
        this.f41802g = false;
    }

    @Override // x.AbstractC5177p
    public final boolean k() {
        return this.f41799d != 3 || this.f41797b.f41314s == 0;
    }

    public final void m() {
        this.f41802g = false;
        C5167f c5167f = this.f41803h;
        c5167f.c();
        c5167f.f41780j = false;
        C5167f c5167f2 = this.i;
        c5167f2.c();
        c5167f2.f41780j = false;
        C5167f c5167f3 = this.f41788k;
        c5167f3.c();
        c5167f3.f41780j = false;
        this.f41800e.f41780j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f41797b.f41297h0;
    }
}
