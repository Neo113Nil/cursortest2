package x;

import u.AbstractC5050e;
import w.C5129d;
import w.C5130e;

/* renamed from: x.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5177p implements InterfaceC5165d {

    /* renamed from: a, reason: collision with root package name */
    public int f41796a;

    /* renamed from: b, reason: collision with root package name */
    public C5130e f41797b;

    /* renamed from: c, reason: collision with root package name */
    public C5173l f41798c;

    /* renamed from: d, reason: collision with root package name */
    public int f41799d;

    /* renamed from: e, reason: collision with root package name */
    public final C5168g f41800e = new C5168g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f41801f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f41802g = false;

    /* renamed from: h, reason: collision with root package name */
    public final C5167f f41803h = new C5167f(this);
    public final C5167f i = new C5167f(this);

    /* renamed from: j, reason: collision with root package name */
    public int f41804j = 1;

    public AbstractC5177p(C5130e c5130e) {
        this.f41797b = c5130e;
    }

    public static void b(C5167f c5167f, C5167f c5167f2, int i) {
        c5167f.f41782l.add(c5167f2);
        c5167f.f41777f = i;
        c5167f2.f41781k.add(c5167f);
    }

    public static C5167f h(C5129d c5129d) {
        C5129d c5129d2 = c5129d.f41255f;
        if (c5129d2 == null) {
            return null;
        }
        int d9 = AbstractC5050e.d(c5129d2.f41254e);
        C5130e c5130e = c5129d2.f41253d;
        if (d9 == 1) {
            return c5130e.f41288d.f41803h;
        }
        if (d9 == 2) {
            return c5130e.f41290e.f41803h;
        }
        if (d9 == 3) {
            return c5130e.f41288d.i;
        }
        if (d9 == 4) {
            return c5130e.f41290e.i;
        }
        if (d9 != 5) {
            return null;
        }
        return c5130e.f41290e.f41788k;
    }

    public static C5167f i(C5129d c5129d, int i) {
        C5129d c5129d2 = c5129d.f41255f;
        if (c5129d2 == null) {
            return null;
        }
        C5130e c5130e = c5129d2.f41253d;
        AbstractC5177p abstractC5177p = i == 0 ? c5130e.f41288d : c5130e.f41290e;
        int d9 = AbstractC5050e.d(c5129d2.f41254e);
        if (d9 == 1 || d9 == 2) {
            return abstractC5177p.f41803h;
        }
        if (d9 == 3 || d9 == 4) {
            return abstractC5177p.i;
        }
        return null;
    }

    public final void c(C5167f c5167f, C5167f c5167f2, int i, C5168g c5168g) {
        c5167f.f41782l.add(c5167f2);
        c5167f.f41782l.add(this.f41800e);
        c5167f.f41779h = i;
        c5167f.i = c5168g;
        c5167f2.f41781k.add(c5167f);
        c5168g.f41781k.add(c5167f);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i4) {
        if (i4 == 0) {
            C5130e c5130e = this.f41797b;
            int i6 = c5130e.f41317v;
            int max = Math.max(c5130e.f41316u, i);
            if (i6 > 0) {
                max = Math.min(i6, i);
            }
            if (max != i) {
                return max;
            }
        } else {
            C5130e c5130e2 = this.f41797b;
            int i9 = c5130e2.f41320y;
            int max2 = Math.max(c5130e2.f41319x, i);
            if (i9 > 0) {
                max2 = Math.min(i9, i);
            }
            if (max2 != i) {
                return max2;
            }
        }
        return i;
    }

    public long j() {
        if (this.f41800e.f41780j) {
            return r0.f41778g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f41796a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(C5129d c5129d, C5129d c5129d2, int i) {
        C5167f h3 = h(c5129d);
        C5167f h9 = h(c5129d2);
        if (h3.f41780j && h9.f41780j) {
            int e9 = c5129d.e() + h3.f41778g;
            int e10 = h9.f41778g - c5129d2.e();
            int i4 = e10 - e9;
            C5168g c5168g = this.f41800e;
            if (!c5168g.f41780j && this.f41799d == 3) {
                int i6 = this.f41796a;
                if (i6 == 0) {
                    c5168g.d(g(i4, i));
                } else if (i6 == 1) {
                    c5168g.d(Math.min(g(c5168g.f41783m, i), i4));
                } else if (i6 == 2) {
                    C5130e c5130e = this.f41797b;
                    C5130e c5130e2 = c5130e.f41276T;
                    if (c5130e2 != null) {
                        if ((i == 0 ? c5130e2.f41288d : c5130e2.f41290e).f41800e.f41780j) {
                            c5168g.d(g((int) ((r6.f41778g * (i == 0 ? c5130e.f41318w : c5130e.f41321z)) + 0.5f), i));
                        }
                    }
                } else if (i6 == 3) {
                    C5130e c5130e3 = this.f41797b;
                    AbstractC5177p abstractC5177p = c5130e3.f41288d;
                    if (abstractC5177p.f41799d == 3 && abstractC5177p.f41796a == 3) {
                        C5174m c5174m = c5130e3.f41290e;
                        if (c5174m.f41799d == 3) {
                        }
                    }
                    if (i == 0) {
                        abstractC5177p = c5130e3.f41290e;
                    }
                    if (abstractC5177p.f41800e.f41780j) {
                        float f2 = c5130e3.f41279W;
                        c5168g.d(i == 1 ? (int) ((r6.f41778g / f2) + 0.5f) : (int) ((f2 * r6.f41778g) + 0.5f));
                    }
                }
            }
            if (c5168g.f41780j) {
                int i9 = c5168g.f41778g;
                C5167f c5167f = this.i;
                C5167f c5167f2 = this.f41803h;
                if (i9 == i4) {
                    c5167f2.d(e9);
                    c5167f.d(e10);
                    return;
                }
                float f9 = i == 0 ? this.f41797b.f41289d0 : this.f41797b.f41291e0;
                if (h3 == h9) {
                    e9 = h3.f41778g;
                    e10 = h9.f41778g;
                    f9 = 0.5f;
                }
                c5167f2.d((int) ((((e10 - e9) - i9) * f9) + e9 + 0.5f));
                c5167f.d(c5167f2.f41778g + c5168g.f41778g);
            }
        }
    }
}
