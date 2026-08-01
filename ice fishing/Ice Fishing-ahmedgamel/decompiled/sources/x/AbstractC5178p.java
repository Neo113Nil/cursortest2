package x;

import u.AbstractC5049e;
import w.C5138c;
import w.C5139d;

/* renamed from: x.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5178p implements InterfaceC5166d {

    /* renamed from: a, reason: collision with root package name */
    public int f41741a;

    /* renamed from: b, reason: collision with root package name */
    public C5139d f41742b;

    /* renamed from: c, reason: collision with root package name */
    public C5174l f41743c;

    /* renamed from: d, reason: collision with root package name */
    public int f41744d;

    /* renamed from: e, reason: collision with root package name */
    public final C5169g f41745e = new C5169g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f41746f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f41747g = false;

    /* renamed from: h, reason: collision with root package name */
    public final C5168f f41748h = new C5168f(this);
    public final C5168f i = new C5168f(this);

    /* renamed from: j, reason: collision with root package name */
    public int f41749j = 1;

    public AbstractC5178p(C5139d c5139d) {
        this.f41742b = c5139d;
    }

    public static void b(C5168f c5168f, C5168f c5168f2, int i) {
        c5168f.f41727l.add(c5168f2);
        c5168f.f41722f = i;
        c5168f2.f41726k.add(c5168f);
    }

    public static C5168f h(C5138c c5138c) {
        C5138c c5138c2 = c5138c.f41476f;
        if (c5138c2 == null) {
            return null;
        }
        int d2 = AbstractC5049e.d(c5138c2.f41475e);
        C5139d c5139d = c5138c2.f41474d;
        if (d2 == 1) {
            return c5139d.f41509d.f41748h;
        }
        if (d2 == 2) {
            return c5139d.f41511e.f41748h;
        }
        if (d2 == 3) {
            return c5139d.f41509d.i;
        }
        if (d2 == 4) {
            return c5139d.f41511e.i;
        }
        if (d2 != 5) {
            return null;
        }
        return c5139d.f41511e.f41733k;
    }

    public static C5168f i(C5138c c5138c, int i) {
        C5138c c5138c2 = c5138c.f41476f;
        if (c5138c2 == null) {
            return null;
        }
        C5139d c5139d = c5138c2.f41474d;
        AbstractC5178p abstractC5178p = i == 0 ? c5139d.f41509d : c5139d.f41511e;
        int d2 = AbstractC5049e.d(c5138c2.f41475e);
        if (d2 == 1 || d2 == 2) {
            return abstractC5178p.f41748h;
        }
        if (d2 == 3 || d2 == 4) {
            return abstractC5178p.i;
        }
        return null;
    }

    public final void c(C5168f c5168f, C5168f c5168f2, int i, C5169g c5169g) {
        c5168f.f41727l.add(c5168f2);
        c5168f.f41727l.add(this.f41745e);
        c5168f.f41724h = i;
        c5168f.i = c5169g;
        c5168f2.f41726k.add(c5168f);
        c5169g.f41726k.add(c5168f);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i6) {
        if (i6 == 0) {
            C5139d c5139d = this.f41742b;
            int i9 = c5139d.f41538v;
            int max = Math.max(c5139d.f41537u, i);
            if (i9 > 0) {
                max = Math.min(i9, i);
            }
            if (max != i) {
                return max;
            }
        } else {
            C5139d c5139d2 = this.f41742b;
            int i10 = c5139d2.f41541y;
            int max2 = Math.max(c5139d2.f41540x, i);
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
        if (this.f41745e.f41725j) {
            return r0.f41723g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f41741a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(C5138c c5138c, C5138c c5138c2, int i) {
        C5168f h9 = h(c5138c);
        C5168f h10 = h(c5138c2);
        if (h9.f41725j && h10.f41725j) {
            int e9 = c5138c.e() + h9.f41723g;
            int e10 = h10.f41723g - c5138c2.e();
            int i6 = e10 - e9;
            C5169g c5169g = this.f41745e;
            if (!c5169g.f41725j && this.f41744d == 3) {
                int i9 = this.f41741a;
                if (i9 == 0) {
                    c5169g.d(g(i6, i));
                } else if (i9 == 1) {
                    c5169g.d(Math.min(g(c5169g.f41728m, i), i6));
                } else if (i9 == 2) {
                    C5139d c5139d = this.f41742b;
                    C5139d c5139d2 = c5139d.f41497T;
                    if (c5139d2 != null) {
                        if ((i == 0 ? c5139d2.f41509d : c5139d2.f41511e).f41745e.f41725j) {
                            c5169g.d(g((int) ((r6.f41723g * (i == 0 ? c5139d.f41539w : c5139d.f41542z)) + 0.5f), i));
                        }
                    }
                } else if (i9 == 3) {
                    C5139d c5139d3 = this.f41742b;
                    AbstractC5178p abstractC5178p = c5139d3.f41509d;
                    if (abstractC5178p.f41744d == 3 && abstractC5178p.f41741a == 3) {
                        C5175m c5175m = c5139d3.f41511e;
                        if (c5175m.f41744d == 3) {
                        }
                    }
                    if (i == 0) {
                        abstractC5178p = c5139d3.f41511e;
                    }
                    if (abstractC5178p.f41745e.f41725j) {
                        float f3 = c5139d3.f41500W;
                        c5169g.d(i == 1 ? (int) ((r6.f41723g / f3) + 0.5f) : (int) ((f3 * r6.f41723g) + 0.5f));
                    }
                }
            }
            if (c5169g.f41725j) {
                int i10 = c5169g.f41723g;
                C5168f c5168f = this.i;
                C5168f c5168f2 = this.f41748h;
                if (i10 == i6) {
                    c5168f2.d(e9);
                    c5168f.d(e10);
                    return;
                }
                float f9 = i == 0 ? this.f41742b.f41510d0 : this.f41742b.f41512e0;
                if (h9 == h10) {
                    e9 = h9.f41723g;
                    e10 = h10.f41723g;
                    f9 = 0.5f;
                }
                c5168f2.d((int) ((((e10 - e9) - i10) * f9) + e9 + 0.5f));
                c5168f.d(c5168f2.f41723g + c5169g.f41723g);
            }
        }
    }
}
