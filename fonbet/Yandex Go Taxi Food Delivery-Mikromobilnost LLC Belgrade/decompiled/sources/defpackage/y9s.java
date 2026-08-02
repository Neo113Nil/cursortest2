package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class y9s extends r1r {
    public final r1r c;

    public y9s(r1r r1rVar) {
        this.c = r1rVar;
    }

    @Override // defpackage.r1r
    public final gfx B(oq90 oq90Var) {
        return this.c.B(oq90Var);
    }

    @Override // defpackage.r1r
    public final y9t0 G(oq90 oq90Var) {
        return this.c.G(oq90Var);
    }

    @Override // defpackage.r1r
    public final uis0 a(oq90 oq90Var) {
        return this.c.a(oq90Var);
    }

    @Override // defpackage.r1r
    public final void c(oq90 oq90Var, oq90 oq90Var2) {
        this.c.c(oq90Var, oq90Var2);
    }

    @Override // defpackage.r1r, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
    }

    @Override // defpackage.r1r
    public final void e(oq90 oq90Var) {
        this.c.e(oq90Var);
    }

    @Override // defpackage.r1r
    public final void k(oq90 oq90Var) {
        this.c.k(oq90Var);
    }

    @Override // defpackage.r1r
    public final List o(oq90 oq90Var) {
        List o = this.c.o(oq90Var);
        ArrayList arrayList = new ArrayList();
        Iterator it = o.iterator();
        while (it.hasNext()) {
            arrayList.add((oq90) it.next());
        }
        xcc.p(arrayList);
        return arrayList;
    }

    public final String toString() {
        return qoi0.a(getClass()).d() + '(' + this.c + ')';
    }

    @Override // defpackage.r1r
    public final m0r w(oq90 oq90Var) {
        m0r w = this.c.w(oq90Var);
        if (w == null) {
            return null;
        }
        oq90 oq90Var2 = w.c;
        return oq90Var2 == null ? w : new m0r(w.a, w.b, oq90Var2, w.d, w.e, w.f, w.g, w.h);
    }
}
