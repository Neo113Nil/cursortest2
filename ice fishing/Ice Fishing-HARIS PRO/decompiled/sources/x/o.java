package x;

import u.AbstractC0357e;

/* loaded from: classes.dex */
public abstract class o implements InterfaceC0369d {

    /* renamed from: a, reason: collision with root package name */
    public int f4706a;

    /* renamed from: b, reason: collision with root package name */
    public w.d f4707b;

    /* renamed from: c, reason: collision with root package name */
    public l f4708c;

    /* renamed from: d, reason: collision with root package name */
    public int f4709d;
    public final C0372g e = new C0372g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f4710f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4711g = false;

    /* renamed from: h, reason: collision with root package name */
    public final C0371f f4712h = new C0371f(this);
    public final C0371f i = new C0371f(this);
    public int j = 1;

    public o(w.d dVar) {
        this.f4707b = dVar;
    }

    public static void b(C0371f c0371f, C0371f c0371f2, int i) {
        c0371f.f4693l.add(c0371f2);
        c0371f.f4689f = i;
        c0371f2.f4692k.add(c0371f);
    }

    public static C0371f h(w.c cVar) {
        w.c cVar2 = cVar.f4519f;
        if (cVar2 == null) {
            return null;
        }
        int a2 = AbstractC0357e.a(cVar2.e);
        w.d dVar = cVar2.f4518d;
        if (a2 == 1) {
            return dVar.f4553d.f4712h;
        }
        if (a2 == 2) {
            return dVar.e.f4712h;
        }
        if (a2 == 3) {
            return dVar.f4553d.i;
        }
        if (a2 == 4) {
            return dVar.e.i;
        }
        if (a2 != 5) {
            return null;
        }
        return dVar.e.f4699k;
    }

    public static C0371f i(w.c cVar, int i) {
        w.c cVar2 = cVar.f4519f;
        if (cVar2 == null) {
            return null;
        }
        w.d dVar = cVar2.f4518d;
        o oVar = i == 0 ? dVar.f4553d : dVar.e;
        int a2 = AbstractC0357e.a(cVar2.e);
        if (a2 == 1 || a2 == 2) {
            return oVar.f4712h;
        }
        if (a2 == 3 || a2 == 4) {
            return oVar.i;
        }
        return null;
    }

    public final void c(C0371f c0371f, C0371f c0371f2, int i, C0372g c0372g) {
        c0371f.f4693l.add(c0371f2);
        c0371f.f4693l.add(this.e);
        c0371f.f4691h = i;
        c0371f.i = c0372g;
        c0371f2.f4692k.add(c0371f);
        c0372g.f4692k.add(c0371f);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        int max;
        if (i2 == 0) {
            w.d dVar = this.f4707b;
            int i3 = dVar.f4581v;
            max = Math.max(dVar.f4580u, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            w.d dVar2 = this.f4707b;
            int i4 = dVar2.f4584y;
            max = Math.max(dVar2.f4583x, i);
            if (i4 > 0) {
                max = Math.min(i4, i);
            }
            if (max == i) {
                return i;
            }
        }
        return max;
    }

    public long j() {
        if (this.e.j) {
            return r0.f4690g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f4706a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(w.c cVar, w.c cVar2, int i) {
        C0371f h2 = h(cVar);
        C0371f h3 = h(cVar2);
        if (h2.j && h3.j) {
            int e = cVar.e() + h2.f4690g;
            int e2 = h3.f4690g - cVar2.e();
            int i2 = e2 - e;
            C0372g c0372g = this.e;
            if (!c0372g.j && this.f4709d == 3) {
                int i3 = this.f4706a;
                if (i3 == 0) {
                    c0372g.d(g(i2, i));
                } else if (i3 == 1) {
                    c0372g.d(Math.min(g(c0372g.f4694m, i), i2));
                } else if (i3 == 2) {
                    w.d dVar = this.f4707b;
                    w.d dVar2 = dVar.f4540T;
                    if (dVar2 != null) {
                        if ((i == 0 ? dVar2.f4553d : dVar2.e).e.j) {
                            c0372g.d(g((int) ((r6.f4690g * (i == 0 ? dVar.f4582w : dVar.f4585z)) + 0.5f), i));
                        }
                    }
                } else if (i3 == 3) {
                    w.d dVar3 = this.f4707b;
                    o oVar = dVar3.f4553d;
                    if (oVar.f4709d == 3 && oVar.f4706a == 3) {
                        m mVar = dVar3.e;
                        if (mVar.f4709d == 3) {
                        }
                    }
                    if (i == 0) {
                        oVar = dVar3.e;
                    }
                    if (oVar.e.j) {
                        float f2 = dVar3.f4543W;
                        c0372g.d(i == 1 ? (int) ((r6.f4690g / f2) + 0.5f) : (int) ((f2 * r6.f4690g) + 0.5f));
                    }
                }
            }
            if (c0372g.j) {
                int i4 = c0372g.f4690g;
                C0371f c0371f = this.i;
                C0371f c0371f2 = this.f4712h;
                if (i4 == i2) {
                    c0371f2.d(e);
                    c0371f.d(e2);
                    return;
                }
                float f3 = i == 0 ? this.f4707b.f4554d0 : this.f4707b.f4555e0;
                if (h2 == h3) {
                    e = h2.f4690g;
                    e2 = h3.f4690g;
                    f3 = 0.5f;
                }
                c0371f2.d((int) ((((e2 - e) - i4) * f3) + e + 0.5f));
                c0371f.d(c0371f2.f4690g + c0372g.f4690g);
            }
        }
    }
}
