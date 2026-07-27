package N0;

import L0.C0058p;
import L0.m0;
import Q0.AbstractC0068a;
import t0.C0252g;

/* loaded from: classes.dex */
public final class m extends b {

    /* renamed from: p, reason: collision with root package name */
    public final int f744p;

    public m(int i2, int i3, D0.l lVar) {
        super(i2, lVar);
        this.f744p = i3;
        if (i3 == 1) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + E0.q.a(b.class).b() + " instead").toString());
        }
        if (i2 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i2 + " was specified").toString());
    }

    public final Object D(Object obj, boolean z2) {
        j jVar;
        D0.l lVar;
        C0058p b2;
        C0252g c0252g = C0252g.f2994a;
        if (this.f744p == 3) {
            Object n2 = super.n(obj);
            if (!(n2 instanceof h) || (n2 instanceof g)) {
                return n2;
            }
            if (!z2 || (lVar = this.f717f) == null || (b2 = AbstractC0068a.b(lVar, obj, null)) == null) {
                return c0252g;
            }
            throw b2;
        }
        J.e eVar = d.f722d;
        j jVar2 = (j) b.f711k.get(this);
        while (true) {
            long andIncrement = b.f707g.getAndIncrement(this);
            long j2 = andIncrement & 1152921504606846975L;
            boolean r = r(andIncrement, false);
            int i2 = d.f720b;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            if (jVar2.f914g != j4) {
                j b3 = b.b(this, j4, jVar2);
                if (b3 != null) {
                    jVar = b3;
                } else if (r) {
                    return new g(o());
                }
            } else {
                jVar = jVar2;
            }
            int d2 = b.d(this, jVar, i3, obj, j2, eVar, r);
            if (d2 == 0) {
                jVar.a();
                return c0252g;
            }
            if (d2 == 1) {
                return c0252g;
            }
            if (d2 == 2) {
                if (r) {
                    jVar.h();
                    return new g(o());
                }
                m0 m0Var = eVar instanceof m0 ? (m0) eVar : null;
                if (m0Var != null) {
                    m0Var.a(jVar, i3 + i2);
                }
                h((jVar.f914g * j3) + i3);
                return c0252g;
            }
            if (d2 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (d2 == 4) {
                if (j2 < b.f708h.get(this)) {
                    jVar.a();
                }
                return new g(o());
            }
            if (d2 == 5) {
                jVar.a();
            }
            jVar2 = jVar;
        }
    }

    @Override // N0.b, N0.r
    public final Object l(Object obj, v0.d dVar) {
        C0058p b2;
        if (!(D(obj, true) instanceof g)) {
            return C0252g.f2994a;
        }
        D0.l lVar = this.f717f;
        if (lVar == null || (b2 = AbstractC0068a.b(lVar, obj, null)) == null) {
            throw o();
        }
        o.g.a(b2, o());
        throw b2;
    }

    @Override // N0.b, N0.r
    public final Object n(Object obj) {
        return D(obj, false);
    }

    @Override // N0.b
    public final boolean t() {
        return this.f744p == 2;
    }
}
