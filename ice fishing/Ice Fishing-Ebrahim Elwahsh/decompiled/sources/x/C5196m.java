package x;

import u.AbstractC5088e;
import w.C5143c;
import w.C5144d;

/* renamed from: x.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5196m extends AbstractC5199p {

    /* renamed from: k, reason: collision with root package name */
    public C5189f f41749k;

    /* renamed from: l, reason: collision with root package name */
    public C5184a f41750l;

    @Override // x.InterfaceC5187d
    public final void a(InterfaceC5187d interfaceC5187d) {
        float f6;
        float f9;
        float f10;
        int i;
        if (AbstractC5088e.d(this.f41765j) == 3) {
            C5144d c5144d = this.f41758b;
            l(c5144d.J, c5144d.f41424L, 1);
            return;
        }
        C5190g c5190g = this.f41761e;
        if (c5190g.f41735c && !c5190g.f41741j && this.f41760d == 3) {
            C5144d c5144d2 = this.f41758b;
            int i4 = c5144d2.f41470s;
            if (i4 == 2) {
                C5144d c5144d3 = c5144d2.f41432T;
                if (c5144d3 != null) {
                    if (c5144d3.f41446e.f41761e.f41741j) {
                        c5190g.d((int) ((r5.f41739g * c5144d2.f41477z) + 0.5f));
                    }
                }
            } else if (i4 == 3) {
                C5190g c5190g2 = c5144d2.f41444d.f41761e;
                if (c5190g2.f41741j) {
                    int i9 = c5144d2.f41436X;
                    if (i9 == -1) {
                        f6 = c5190g2.f41739g;
                        f9 = c5144d2.f41435W;
                    } else if (i9 == 0) {
                        f10 = c5190g2.f41739g * c5144d2.f41435W;
                        i = (int) (f10 + 0.5f);
                        c5190g.d(i);
                    } else if (i9 != 1) {
                        i = 0;
                        c5190g.d(i);
                    } else {
                        f6 = c5190g2.f41739g;
                        f9 = c5144d2.f41435W;
                    }
                    f10 = f6 / f9;
                    i = (int) (f10 + 0.5f);
                    c5190g.d(i);
                }
            }
        }
        C5189f c5189f = this.f41764h;
        if (c5189f.f41735c) {
            C5189f c5189f2 = this.i;
            if (c5189f2.f41735c) {
                if (c5189f.f41741j && c5189f2.f41741j && c5190g.f41741j) {
                    return;
                }
                if (!c5190g.f41741j && this.f41760d == 3) {
                    C5144d c5144d4 = this.f41758b;
                    if (c5144d4.f41469r == 0 && !c5144d4.y()) {
                        C5189f c5189f3 = (C5189f) c5189f.f41743l.get(0);
                        C5189f c5189f4 = (C5189f) c5189f2.f41743l.get(0);
                        int i10 = c5189f3.f41739g + c5189f.f41738f;
                        int i11 = c5189f4.f41739g + c5189f2.f41738f;
                        c5189f.d(i10);
                        c5189f2.d(i11);
                        c5190g.d(i11 - i10);
                        return;
                    }
                }
                if (!c5190g.f41741j && this.f41760d == 3 && this.f41757a == 1 && c5189f.f41743l.size() > 0 && c5189f2.f41743l.size() > 0) {
                    C5189f c5189f5 = (C5189f) c5189f.f41743l.get(0);
                    int i12 = (((C5189f) c5189f2.f41743l.get(0)).f41739g + c5189f2.f41738f) - (c5189f5.f41739g + c5189f.f41738f);
                    int i13 = c5190g.f41744m;
                    if (i12 < i13) {
                        c5190g.d(i12);
                    } else {
                        c5190g.d(i13);
                    }
                }
                if (c5190g.f41741j && c5189f.f41743l.size() > 0 && c5189f2.f41743l.size() > 0) {
                    C5189f c5189f6 = (C5189f) c5189f.f41743l.get(0);
                    C5189f c5189f7 = (C5189f) c5189f2.f41743l.get(0);
                    int i14 = c5189f6.f41739g;
                    int i15 = c5189f.f41738f + i14;
                    int i16 = c5189f7.f41739g;
                    int i17 = c5189f2.f41738f + i16;
                    float f11 = this.f41758b.f41447e0;
                    if (c5189f6 == c5189f7) {
                        f11 = 0.5f;
                    } else {
                        i14 = i15;
                        i16 = i17;
                    }
                    c5189f.d((int) ((((i16 - i14) - c5190g.f41739g) * f11) + i14 + 0.5f));
                    c5189f2.d(c5189f.f41739g + c5190g.f41739g);
                }
            }
        }
    }

    @Override // x.AbstractC5199p
    public final void d() {
        C5144d c5144d;
        C5144d c5144d2;
        C5144d c5144d3;
        C5144d c5144d4;
        C5144d c5144d5 = this.f41758b;
        boolean z8 = c5144d5.f41438a;
        C5190g c5190g = this.f41761e;
        if (z8) {
            c5190g.d(c5144d5.k());
        }
        boolean z9 = c5190g.f41741j;
        C5189f c5189f = this.i;
        C5189f c5189f2 = this.f41764h;
        if (!z9) {
            C5144d c5144d6 = this.f41758b;
            this.f41760d = c5144d6.f41467p0[1];
            if (c5144d6.f41418E) {
                this.f41750l = new C5184a(this);
            }
            int i = this.f41760d;
            if (i != 3) {
                if (i == 4 && (c5144d4 = this.f41758b.f41432T) != null && c5144d4.f41467p0[1] == 1) {
                    int k6 = (c5144d4.k() - this.f41758b.J.e()) - this.f41758b.f41424L.e();
                    AbstractC5199p.b(c5189f2, c5144d4.f41446e.f41764h, this.f41758b.J.e());
                    AbstractC5199p.b(c5189f, c5144d4.f41446e.i, -this.f41758b.f41424L.e());
                    c5190g.d(k6);
                    return;
                }
                if (i == 1) {
                    c5190g.d(this.f41758b.k());
                }
            }
        } else if (this.f41760d == 4 && (c5144d2 = (c5144d = this.f41758b).f41432T) != null && c5144d2.f41467p0[1] == 1) {
            AbstractC5199p.b(c5189f2, c5144d2.f41446e.f41764h, c5144d.J.e());
            AbstractC5199p.b(c5189f, c5144d2.f41446e.i, -this.f41758b.f41424L.e());
            return;
        }
        boolean z10 = c5190g.f41741j;
        C5189f c5189f3 = this.f41749k;
        if (z10) {
            C5144d c5144d7 = this.f41758b;
            if (c5144d7.f41438a) {
                C5143c[] c5143cArr = c5144d7.f41429Q;
                C5143c c5143c = c5143cArr[2];
                C5143c c5143c2 = c5143c.f41411f;
                if (c5143c2 != null && c5143cArr[3].f41411f != null) {
                    if (c5144d7.y()) {
                        c5189f2.f41738f = this.f41758b.f41429Q[2].e();
                        c5189f.f41738f = -this.f41758b.f41429Q[3].e();
                    } else {
                        C5189f h9 = AbstractC5199p.h(this.f41758b.f41429Q[2]);
                        if (h9 != null) {
                            AbstractC5199p.b(c5189f2, h9, this.f41758b.f41429Q[2].e());
                        }
                        C5189f h10 = AbstractC5199p.h(this.f41758b.f41429Q[3]);
                        if (h10 != null) {
                            AbstractC5199p.b(c5189f, h10, -this.f41758b.f41429Q[3].e());
                        }
                        c5189f2.f41734b = true;
                        c5189f.f41734b = true;
                    }
                    C5144d c5144d8 = this.f41758b;
                    if (c5144d8.f41418E) {
                        AbstractC5199p.b(c5189f3, c5189f2, c5144d8.f41439a0);
                        return;
                    }
                    return;
                }
                if (c5143c2 != null) {
                    C5189f h11 = AbstractC5199p.h(c5143c);
                    if (h11 != null) {
                        AbstractC5199p.b(c5189f2, h11, this.f41758b.f41429Q[2].e());
                        AbstractC5199p.b(c5189f, c5189f2, c5190g.f41739g);
                        C5144d c5144d9 = this.f41758b;
                        if (c5144d9.f41418E) {
                            AbstractC5199p.b(c5189f3, c5189f2, c5144d9.f41439a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C5143c c5143c3 = c5143cArr[3];
                if (c5143c3.f41411f != null) {
                    C5189f h12 = AbstractC5199p.h(c5143c3);
                    if (h12 != null) {
                        AbstractC5199p.b(c5189f, h12, -this.f41758b.f41429Q[3].e());
                        AbstractC5199p.b(c5189f2, c5189f, -c5190g.f41739g);
                    }
                    C5144d c5144d10 = this.f41758b;
                    if (c5144d10.f41418E) {
                        AbstractC5199p.b(c5189f3, c5189f2, c5144d10.f41439a0);
                        return;
                    }
                    return;
                }
                C5143c c5143c4 = c5143cArr[4];
                if (c5143c4.f41411f != null) {
                    C5189f h13 = AbstractC5199p.h(c5143c4);
                    if (h13 != null) {
                        AbstractC5199p.b(c5189f3, h13, 0);
                        AbstractC5199p.b(c5189f2, c5189f3, -this.f41758b.f41439a0);
                        AbstractC5199p.b(c5189f, c5189f2, c5190g.f41739g);
                        return;
                    }
                    return;
                }
                if ((c5144d7 instanceof w.i) || c5144d7.f41432T == null || c5144d7.i(7).f41411f != null) {
                    return;
                }
                C5144d c5144d11 = this.f41758b;
                AbstractC5199p.b(c5189f2, c5144d11.f41432T.f41446e.f41764h, c5144d11.s());
                AbstractC5199p.b(c5189f, c5189f2, c5190g.f41739g);
                C5144d c5144d12 = this.f41758b;
                if (c5144d12.f41418E) {
                    AbstractC5199p.b(c5189f3, c5189f2, c5144d12.f41439a0);
                    return;
                }
                return;
            }
        }
        if (z10 || this.f41760d != 3) {
            c5190g.b(this);
        } else {
            C5144d c5144d13 = this.f41758b;
            int i4 = c5144d13.f41470s;
            if (i4 == 2) {
                C5144d c5144d14 = c5144d13.f41432T;
                if (c5144d14 != null) {
                    C5190g c5190g2 = c5144d14.f41446e.f41761e;
                    c5190g.f41743l.add(c5190g2);
                    c5190g2.f41742k.add(c5190g);
                    c5190g.f41734b = true;
                    c5190g.f41742k.add(c5189f2);
                    c5190g.f41742k.add(c5189f);
                }
            } else if (i4 == 3 && !c5144d13.y()) {
                C5144d c5144d15 = this.f41758b;
                if (c5144d15.f41469r != 3) {
                    C5190g c5190g3 = c5144d15.f41444d.f41761e;
                    c5190g.f41743l.add(c5190g3);
                    c5190g3.f41742k.add(c5190g);
                    c5190g.f41734b = true;
                    c5190g.f41742k.add(c5189f2);
                    c5190g.f41742k.add(c5189f);
                }
            }
        }
        C5144d c5144d16 = this.f41758b;
        C5143c[] c5143cArr2 = c5144d16.f41429Q;
        C5143c c5143c5 = c5143cArr2[2];
        C5143c c5143c6 = c5143c5.f41411f;
        if (c5143c6 != null && c5143cArr2[3].f41411f != null) {
            if (c5144d16.y()) {
                c5189f2.f41738f = this.f41758b.f41429Q[2].e();
                c5189f.f41738f = -this.f41758b.f41429Q[3].e();
            } else {
                C5189f h14 = AbstractC5199p.h(this.f41758b.f41429Q[2]);
                C5189f h15 = AbstractC5199p.h(this.f41758b.f41429Q[3]);
                if (h14 != null) {
                    h14.b(this);
                }
                if (h15 != null) {
                    h15.b(this);
                }
                this.f41765j = 4;
            }
            if (this.f41758b.f41418E) {
                c(c5189f3, c5189f2, 1, this.f41750l);
            }
        } else if (c5143c6 != null) {
            C5189f h16 = AbstractC5199p.h(c5143c5);
            if (h16 != null) {
                AbstractC5199p.b(c5189f2, h16, this.f41758b.f41429Q[2].e());
                c(c5189f, c5189f2, 1, c5190g);
                if (this.f41758b.f41418E) {
                    c(c5189f3, c5189f2, 1, this.f41750l);
                }
                if (this.f41760d == 3) {
                    C5144d c5144d17 = this.f41758b;
                    if (c5144d17.f41435W > 0.0f) {
                        C5194k c5194k = c5144d17.f41444d;
                        if (c5194k.f41760d == 3) {
                            c5194k.f41761e.f41742k.add(c5190g);
                            c5190g.f41743l.add(this.f41758b.f41444d.f41761e);
                            c5190g.f41733a = this;
                        }
                    }
                }
            }
        } else {
            C5143c c5143c7 = c5143cArr2[3];
            if (c5143c7.f41411f != null) {
                C5189f h17 = AbstractC5199p.h(c5143c7);
                if (h17 != null) {
                    AbstractC5199p.b(c5189f, h17, -this.f41758b.f41429Q[3].e());
                    c(c5189f2, c5189f, -1, c5190g);
                    if (this.f41758b.f41418E) {
                        c(c5189f3, c5189f2, 1, this.f41750l);
                    }
                }
            } else {
                C5143c c5143c8 = c5143cArr2[4];
                if (c5143c8.f41411f != null) {
                    C5189f h18 = AbstractC5199p.h(c5143c8);
                    if (h18 != null) {
                        AbstractC5199p.b(c5189f3, h18, 0);
                        c(c5189f2, c5189f3, -1, this.f41750l);
                        c(c5189f, c5189f2, 1, c5190g);
                    }
                } else if (!(c5144d16 instanceof w.i) && (c5144d3 = c5144d16.f41432T) != null) {
                    AbstractC5199p.b(c5189f2, c5144d3.f41446e.f41764h, c5144d16.s());
                    c(c5189f, c5189f2, 1, c5190g);
                    if (this.f41758b.f41418E) {
                        c(c5189f3, c5189f2, 1, this.f41750l);
                    }
                    if (this.f41760d == 3) {
                        C5144d c5144d18 = this.f41758b;
                        if (c5144d18.f41435W > 0.0f) {
                            C5194k c5194k2 = c5144d18.f41444d;
                            if (c5194k2.f41760d == 3) {
                                c5194k2.f41761e.f41742k.add(c5190g);
                                c5190g.f41743l.add(this.f41758b.f41444d.f41761e);
                                c5190g.f41733a = this;
                            }
                        }
                    }
                }
            }
        }
        if (c5190g.f41743l.size() == 0) {
            c5190g.f41735c = true;
        }
    }

    @Override // x.AbstractC5199p
    public final void e() {
        C5189f c5189f = this.f41764h;
        if (c5189f.f41741j) {
            this.f41758b.f41437Z = c5189f.f41739g;
        }
    }

    @Override // x.AbstractC5199p
    public final void f() {
        this.f41759c = null;
        this.f41764h.c();
        this.i.c();
        this.f41749k.c();
        this.f41761e.c();
        this.f41763g = false;
    }

    @Override // x.AbstractC5199p
    public final boolean k() {
        return this.f41760d != 3 || this.f41758b.f41470s == 0;
    }

    public final void m() {
        this.f41763g = false;
        C5189f c5189f = this.f41764h;
        c5189f.c();
        c5189f.f41741j = false;
        C5189f c5189f2 = this.i;
        c5189f2.c();
        c5189f2.f41741j = false;
        C5189f c5189f3 = this.f41749k;
        c5189f3.c();
        c5189f3.f41741j = false;
        this.f41761e.f41741j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f41758b.f41453h0;
    }
}
