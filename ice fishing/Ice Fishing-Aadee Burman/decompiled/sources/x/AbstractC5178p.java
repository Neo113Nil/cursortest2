package x;

import u.AbstractC5049e;
import w.C5138c;
import w.C5139d;

/* renamed from: x.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5178p implements InterfaceC5166d {

    /* renamed from: a, reason: collision with root package name */
    public int f41738a;

    /* renamed from: b, reason: collision with root package name */
    public C5139d f41739b;

    /* renamed from: c, reason: collision with root package name */
    public C5174l f41740c;

    /* renamed from: d, reason: collision with root package name */
    public int f41741d;

    /* renamed from: e, reason: collision with root package name */
    public final C5169g f41742e = new C5169g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f41743f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f41744g = false;

    /* renamed from: h, reason: collision with root package name */
    public final C5168f f41745h = new C5168f(this);
    public final C5168f i = new C5168f(this);

    /* renamed from: j, reason: collision with root package name */
    public int f41746j = 1;

    public AbstractC5178p(C5139d c5139d) {
        this.f41739b = c5139d;
    }

    public static void b(C5168f c5168f, C5168f c5168f2, int i) {
        c5168f.f41724l.add(c5168f2);
        c5168f.f41719f = i;
        c5168f2.f41723k.add(c5168f);
    }

    public static C5168f h(C5138c c5138c) {
        C5138c c5138c2 = c5138c.f41473f;
        if (c5138c2 == null) {
            return null;
        }
        int d2 = AbstractC5049e.d(c5138c2.f41472e);
        C5139d c5139d = c5138c2.f41471d;
        if (d2 == 1) {
            return c5139d.f41506d.f41745h;
        }
        if (d2 == 2) {
            return c5139d.f41508e.f41745h;
        }
        if (d2 == 3) {
            return c5139d.f41506d.i;
        }
        if (d2 == 4) {
            return c5139d.f41508e.i;
        }
        if (d2 != 5) {
            return null;
        }
        return c5139d.f41508e.f41730k;
    }

    public static C5168f i(C5138c c5138c, int i) {
        C5138c c5138c2 = c5138c.f41473f;
        if (c5138c2 == null) {
            return null;
        }
        C5139d c5139d = c5138c2.f41471d;
        AbstractC5178p abstractC5178p = i == 0 ? c5139d.f41506d : c5139d.f41508e;
        int d2 = AbstractC5049e.d(c5138c2.f41472e);
        if (d2 == 1 || d2 == 2) {
            return abstractC5178p.f41745h;
        }
        if (d2 == 3 || d2 == 4) {
            return abstractC5178p.i;
        }
        return null;
    }

    public final void c(C5168f c5168f, C5168f c5168f2, int i, C5169g c5169g) {
        c5168f.f41724l.add(c5168f2);
        c5168f.f41724l.add(this.f41742e);
        c5168f.f41721h = i;
        c5168f.i = c5169g;
        c5168f2.f41723k.add(c5168f);
        c5169g.f41723k.add(c5168f);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i6) {
        if (i6 == 0) {
            C5139d c5139d = this.f41739b;
            int i9 = c5139d.f41535v;
            int max = Math.max(c5139d.f41534u, i);
            if (i9 > 0) {
                max = Math.min(i9, i);
            }
            if (max != i) {
                return max;
            }
        } else {
            C5139d c5139d2 = this.f41739b;
            int i10 = c5139d2.f41538y;
            int max2 = Math.max(c5139d2.f41537x, i);
            if (i10 > 0) {
                max2 = Math.min(i10, i);
            }
            if (max2 != i) {
                return max2;
            }
        }
        return i;
    }

    public long j() {
        if (this.f41742e.f41722j) {
            return r0.f41720g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f41738a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(C5138c c5138c, C5138c c5138c2, int i) {
        C5168f h9 = h(c5138c);
        C5168f h10 = h(c5138c2);
        if (h9.f41722j && h10.f41722j) {
            int e9 = c5138c.e() + h9.f41720g;
            int e10 = h10.f41720g - c5138c2.e();
            int i6 = e10 - e9;
            C5169g c5169g = this.f41742e;
            if (!c5169g.f41722j && this.f41741d == 3) {
                int i9 = this.f41738a;
                if (i9 == 0) {
                    c5169g.d(g(i6, i));
                } else if (i9 == 1) {
                    c5169g.d(Math.min(g(c5169g.f41725m, i), i6));
                } else if (i9 == 2) {
                    C5139d c5139d = this.f41739b;
                    C5139d c5139d2 = c5139d.f41494T;
                    if (c5139d2 != null) {
                        if ((i == 0 ? c5139d2.f41506d : c5139d2.f41508e).f41742e.f41722j) {
                            c5169g.d(g((int) ((r6.f41720g * (i == 0 ? c5139d.f41536w : c5139d.f41539z)) + 0.5f), i));
                        }
                    }
                } else if (i9 == 3) {
                    C5139d c5139d3 = this.f41739b;
                    AbstractC5178p abstractC5178p = c5139d3.f41506d;
                    if (abstractC5178p.f41741d == 3 && abstractC5178p.f41738a == 3) {
                        C5175m c5175m = c5139d3.f41508e;
                        if (c5175m.f41741d == 3) {
                        }
                    }
                    if (i == 0) {
                        abstractC5178p = c5139d3.f41508e;
                    }
                    if (abstractC5178p.f41742e.f41722j) {
                        float f3 = c5139d3.f41497W;
                        c5169g.d(i == 1 ? (int) ((r6.f41720g / f3) + 0.5f) : (int) ((f3 * r6.f41720g) + 0.5f));
                    }
                }
            }
            if (c5169g.f41722j) {
                int i10 = c5169g.f41720g;
                C5168f c5168f = this.i;
                C5168f c5168f2 = this.f41745h;
                if (i10 == i6) {
                    c5168f2.d(e9);
                    c5168f.d(e10);
                    return;
                }
                float f9 = i == 0 ? this.f41739b.f41507d0 : this.f41739b.f41509e0;
                if (h9 == h10) {
                    e9 = h9.f41720g;
                    e10 = h10.f41720g;
                    f9 = 0.5f;
                }
                c5168f2.d((int) ((((e10 - e9) - i10) * f9) + e9 + 0.5f));
                c5168f.d(c5168f2.f41720g + c5169g.f41720g);
            }
        }
    }
}
