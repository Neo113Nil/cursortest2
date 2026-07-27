package M0;

import K0.C0040p;
import K0.m0;
import P0.AbstractC0068a;

/* loaded from: classes.dex */
public final class m extends b {

    /* renamed from: q, reason: collision with root package name */
    public final int f736q;

    public m(int i2, int i3, D0.l lVar) {
        super(i2, lVar);
        this.f736q = i3;
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
        C0040p b2;
        t0.g gVar = t0.g.f2989a;
        if (this.f736q == 3) {
            Object n2 = super.n(obj);
            if (!(n2 instanceof h) || (n2 instanceof g)) {
                return n2;
            }
            if (!z2 || (lVar = this.f709g) == null || (b2 = AbstractC0068a.b(lVar, obj, null)) == null) {
                return gVar;
            }
            throw b2;
        }
        J.e eVar = d.f714d;
        j jVar2 = (j) b.f703l.get(this);
        while (true) {
            long andIncrement = b.f699h.getAndIncrement(this);
            long j2 = andIncrement & 1152921504606846975L;
            boolean r = r(andIncrement, false);
            int i2 = d.f712b;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            if (jVar2.f905h != j4) {
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
                return gVar;
            }
            if (d2 == 1) {
                return gVar;
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
                h((jVar.f905h * j3) + i3);
                return gVar;
            }
            if (d2 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (d2 == 4) {
                if (j2 < b.f700i.get(this)) {
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

    @Override // M0.b, M0.r
    public final Object l(Object obj, v0.d dVar) {
        C0040p b2;
        if (!(D(obj, true) instanceof g)) {
            return t0.g.f2989a;
        }
        D0.l lVar = this.f709g;
        if (lVar == null || (b2 = AbstractC0068a.b(lVar, obj, null)) == null) {
            throw o();
        }
        o.g.a(b2, o());
        throw b2;
    }

    @Override // M0.b, M0.r
    public final Object n(Object obj) {
        return D(obj, false);
    }

    @Override // M0.b
    public final boolean t() {
        return this.f736q == 2;
    }
}
