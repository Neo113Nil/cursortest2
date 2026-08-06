package C1;

import A1.C0015p;
import A1.n0;
import F.InterfaceC0033i;
import h1.C0239i;
import u0.AbstractC1050a;

/* loaded from: classes.dex */
public final class n extends c {

    /* renamed from: l, reason: collision with root package name */
    public final int f189l;

    public n(int i2, int i3, t1.l lVar) {
        super(i2, lVar);
        this.f189l = i3;
        if (i3 != 1) {
            if (i2 < 1) {
                throw new IllegalArgumentException(a.g(i2, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + kotlin.jvm.internal.q.a(c.class).b() + " instead").toString());
        }
    }

    public final Object D(Object obj, boolean z2) {
        k kVar;
        t1.l lVar;
        C0015p a2;
        C0239i c0239i = C0239i.f3393a;
        if (this.f189l == 3) {
            Object g2 = super.g(obj);
            if (!(g2 instanceof i) || (g2 instanceof h)) {
                return g2;
            }
            if (!z2 || (lVar = this.f160b) == null || (a2 = F1.a.a(lVar, obj, null)) == null) {
                return c0239i;
            }
            throw a2;
        }
        InterfaceC0033i interfaceC0033i = e.f165d;
        k kVar2 = (k) c.f154g.get(this);
        while (true) {
            long andIncrement = c.f150c.getAndIncrement(this);
            long j2 = andIncrement & 1152921504606846975L;
            boolean r2 = r(andIncrement, false);
            int i2 = e.f163b;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            if (kVar2.f631c != j4) {
                k b2 = c.b(this, j4, kVar2);
                if (b2 != null) {
                    kVar = b2;
                } else if (r2) {
                    return new h(o());
                }
            } else {
                kVar = kVar2;
            }
            int d2 = c.d(this, kVar, i3, obj, j2, interfaceC0033i, r2);
            if (d2 == 0) {
                kVar.a();
                return c0239i;
            }
            if (d2 == 1) {
                return c0239i;
            }
            if (d2 == 2) {
                if (r2) {
                    kVar.h();
                    return new h(o());
                }
                n0 n0Var = interfaceC0033i instanceof n0 ? (n0) interfaceC0033i : null;
                if (n0Var != null) {
                    n0Var.a(kVar, i3 + i2);
                }
                i((kVar.f631c * j3) + i3);
                return c0239i;
            }
            if (d2 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (d2 == 4) {
                if (j2 < c.f151d.get(this)) {
                    kVar.a();
                }
                return new h(o());
            }
            if (d2 == 5) {
                kVar.a();
            }
            kVar2 = kVar;
        }
    }

    @Override // C1.c, C1.t
    public final Object g(Object obj) {
        return D(obj, false);
    }

    @Override // C1.c, C1.t
    public final Object j(Object obj, l1.d dVar) {
        C0015p a2;
        if (!(D(obj, true) instanceof h)) {
            return C0239i.f3393a;
        }
        t1.l lVar = this.f160b;
        if (lVar == null || (a2 = F1.a.a(lVar, obj, null)) == null) {
            throw o();
        }
        AbstractC1050a.a(a2, o());
        throw a2;
    }

    @Override // C1.c
    public final boolean t() {
        return this.f189l == 2;
    }
}
