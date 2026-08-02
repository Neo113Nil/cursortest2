package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class kf9 extends x97 {
    public final hf9 n;
    public final mu9 o;
    public final efo p = new efo(25);
    public final /* synthetic */ mf9 q;

    public kf9(mf9 mf9Var, hf9 hf9Var, mu9 mu9Var, xzb xzbVar) {
        this.q = mf9Var;
        this.n = hf9Var;
        this.o = mu9Var;
    }

    @Override // defpackage.x97
    public final Object I(cb8 cb8Var, xzb xzbVar) {
        jt8 jt8Var = cb8Var.c;
        for (k79 k79Var : qwp.x(jt8Var.B, jt8Var.z, xzbVar)) {
            U(k79Var.a, k79Var.b);
        }
        W(cb8Var, xzbVar);
        return Unit.a;
    }

    @Override // defpackage.x97
    public final Object J(db8 db8Var, xzb xzbVar) {
        List list = db8Var.c.q;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                U((jc8) it.next(), xzbVar);
            }
        }
        ((ArrayList) this.p.b).add(this.q.b.a(db8Var.c, this.o));
        W(db8Var, xzbVar);
        return Unit.a;
    }

    @Override // defpackage.x97
    public final Object K(eb8 eb8Var, xzb xzbVar) {
        s09 s09Var = eb8Var.c;
        for (k79 k79Var : qwp.x(s09Var.u, s09Var.s, xzbVar)) {
            U(k79Var.a, k79Var.b);
        }
        W(eb8Var, xzbVar);
        return Unit.a;
    }

    @Override // defpackage.x97
    public final Object M(gb8 gb8Var, xzb xzbVar) {
        Iterable iterable = gb8Var.c.y;
        if (iterable == null) {
            iterable = c5b.a;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            U((jc8) it.next(), xzbVar);
        }
        W(gb8Var, xzbVar);
        return Unit.a;
    }

    @Override // defpackage.x97
    public final Object O(kb8 kb8Var, xzb xzbVar) {
        eb9 eb9Var = kb8Var.c;
        for (k79 k79Var : qwp.x(eb9Var.t, eb9Var.r, xzbVar)) {
            U(k79Var.a, k79Var.b);
        }
        W(kb8Var, xzbVar);
        return Unit.a;
    }

    @Override // defpackage.x97
    public final Object Q(ob8 ob8Var, xzb xzbVar) {
        Iterator it = ob8Var.c.I.iterator();
        while (it.hasNext()) {
            jc8 jc8Var = ((cm9) it.next()).c;
            if (jc8Var != null) {
                U(jc8Var, xzbVar);
            }
        }
        W(ob8Var, xzbVar);
        return Unit.a;
    }

    @Override // defpackage.x97
    public final Object R(qb8 qb8Var, xzb xzbVar) {
        Iterator it = qb8Var.c.q.iterator();
        while (it.hasNext()) {
            U(((ro9) it.next()).a, xzbVar);
        }
        W(qb8Var, xzbVar);
        return Unit.a;
    }

    @Override // defpackage.x97
    public final Object T(sb8 sb8Var, xzb xzbVar) {
        W(sb8Var, xzbVar);
        if (e3s.c.W(sb8Var, xzbVar)) {
            dom k0 = this.n.k0("video");
            ArrayList arrayList = new ArrayList();
            List list = sb8Var.c.R;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((c0a) it.next()).d.a(xzbVar));
                }
            }
            ((ArrayList) this.p.b).add(this.q.d.b(arrayList, new t89(k0, 1)));
        }
        return Unit.a;
    }

    public final void W(jc8 jc8Var, xzb xzbVar) {
        mf9 mf9Var = this.q;
        f39 f39Var = mf9Var.a;
        hf9 hf9Var = this.n;
        if (f39Var != null) {
            e39 e39Var = new e39(f39Var, hf9Var, xzbVar);
            e39Var.U(jc8Var, xzbVar);
            ArrayList arrayList = e39Var.o;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ArrayList) this.p.b).add(new lf9((ffg) it.next()));
                }
            }
        }
        mf9Var.c.d(jc8Var.d(), xzbVar, hf9Var);
    }

    @Override // defpackage.x97
    public final /* bridge */ /* synthetic */ Object s(jc8 jc8Var, xzb xzbVar) {
        W(jc8Var, xzbVar);
        return Unit.a;
    }
}
