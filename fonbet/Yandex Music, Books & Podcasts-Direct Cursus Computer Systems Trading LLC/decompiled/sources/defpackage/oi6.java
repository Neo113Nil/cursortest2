package defpackage;

/* loaded from: classes4.dex */
public final class oi6 implements p7q {
    public static final oi6 a = new oi6();
    public static final h5l b;

    static {
        g5l g5lVar = g5l.b;
        f5l f5lVar = f5l.a;
        b = new h5l(g5lVar, f5lVar, f5lVar);
    }

    public static g5l a(mwk mwkVar) {
        mqs a2 = mwkVar.a();
        return (a2 == null || !a4g.D(gys.UseSeekButtons, a2)) ? g5l.a : g5l.b;
    }

    @Override // defpackage.p7q
    public final Object m(ioc iocVar) {
        iocVar.getClass();
        return b;
    }

    @Override // defpackage.p7q
    public final Object n(szu szuVar) {
        szuVar.getClass();
        return new h5l(a(szuVar.l), szuVar.n ? f5l.c : f5l.b, szuVar.n() ? f5l.c : f5l.b);
    }

    @Override // defpackage.p7q
    public final Object q(y4d y4dVar) {
        y4dVar.getClass();
        return b;
    }

    /* JADX WARN: Type inference failed for: r4v9, types: [arf, java.lang.Object] */
    @Override // defpackage.p7q
    public final Object q0(maq maqVar) {
        maqVar.getClass();
        if (maqVar instanceof jbq) {
            jbq jbqVar = (jbq) maqVar;
            g5l a2 = a(jbqVar.b());
            f5l f5lVar = f5l.c;
            return new h5l(a2, f5lVar, ((naq) jbqVar.m.getValue()) != null ? f5lVar : f5l.b);
        }
        if (maqVar instanceof vaq) {
            vaq vaqVar = (vaq) maqVar;
            return new h5l(a(vaqVar.b()), vaqVar.p() != null ? f5l.c : f5l.b, vaqVar.o() != null ? f5l.c : f5l.b);
        }
        boolean z = maqVar instanceof eaq;
        h5l h5lVar = b;
        if (z) {
            return h5lVar;
        }
        if (maqVar instanceof raq) {
            return h5lVar;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.p7q
    public final Object t(t1q t1qVar) {
        t1qVar.getClass();
        m1q m1qVar = t1qVar.c;
        if (m1qVar instanceof c2q) {
            return new h5l(a(m1qVar), t1qVar.b != null ? f5l.c : f5l.b, t1qVar.d != null ? f5l.c : f5l.b);
        }
        if ((m1qVar instanceof j1q) || (m1qVar instanceof e2q)) {
            return b;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.p7q
    public final Object u(u7u u7uVar) {
        u7uVar.getClass();
        return new h5l(a(u7uVar.c), u7uVar.j ? f5l.c : f5l.b, u7uVar.k ? f5l.c : f5l.b);
    }
}
