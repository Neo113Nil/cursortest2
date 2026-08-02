package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class gw8 extends x97 {
    public final LinkedHashSet n = new LinkedHashSet();

    @Override // defpackage.x97
    public final Object I(cb8 cb8Var, xzb xzbVar) {
        cb8Var.getClass();
        xzbVar.getClass();
        s(cb8Var, xzbVar);
        jt8 jt8Var = cb8Var.c;
        List list = jt8Var.d;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                szb szbVar = ((bd8) it.next()).k;
                if (szbVar != null) {
                    W(szbVar);
                }
            }
        }
        List list2 = jt8Var.B;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                U((jc8) it2.next(), xzbVar);
            }
        }
        return Unit.a;
    }

    @Override // defpackage.x97
    public final Object J(db8 db8Var, xzb xzbVar) {
        db8Var.getClass();
        xzbVar.getClass();
        s(db8Var, xzbVar);
        List list = db8Var.c.q;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                U((jc8) it.next(), xzbVar);
            }
        }
        return Unit.a;
    }

    @Override // defpackage.x97
    public final Object K(eb8 eb8Var, xzb xzbVar) {
        eb8Var.getClass();
        xzbVar.getClass();
        s(eb8Var, xzbVar);
        List list = eb8Var.c.u;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                U((jc8) it.next(), xzbVar);
            }
        }
        return Unit.a;
    }

    @Override // defpackage.x97
    public final Object L(fb8 fb8Var, xzb xzbVar) {
        fb8Var.getClass();
        xzbVar.getClass();
        s(fb8Var, xzbVar);
        List list = fb8Var.c.d;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                szb szbVar = ((bd8) it.next()).k;
                if (szbVar != null) {
                    W(szbVar);
                }
            }
        }
        return Unit.a;
    }

    @Override // defpackage.x97
    public final Object M(gb8 gb8Var, xzb xzbVar) {
        gb8Var.getClass();
        xzbVar.getClass();
        s(gb8Var, xzbVar);
        w19 w19Var = gb8Var.c;
        List list = w19Var.d;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                szb szbVar = ((bd8) it.next()).k;
                if (szbVar != null) {
                    W(szbVar);
                }
            }
        }
        List list2 = w19Var.y;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                U((jc8) it2.next(), xzbVar);
            }
        }
        return Unit.a;
    }

    @Override // defpackage.x97
    public final Object N(hb8 hb8Var, xzb xzbVar) {
        hb8Var.getClass();
        xzbVar.getClass();
        s(hb8Var, xzbVar);
        List list = hb8Var.c.d;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                szb szbVar = ((bd8) it.next()).k;
                if (szbVar != null) {
                    W(szbVar);
                }
            }
        }
        return Unit.a;
    }

    @Override // defpackage.x97
    public final Object O(kb8 kb8Var, xzb xzbVar) {
        kb8Var.getClass();
        xzbVar.getClass();
        s(kb8Var, xzbVar);
        List list = kb8Var.c.t;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                U((jc8) it.next(), xzbVar);
            }
        }
        return Unit.a;
    }

    @Override // defpackage.x97
    public final Object P(mb8 mb8Var, xzb xzbVar) {
        mb8Var.getClass();
        xzbVar.getClass();
        s(mb8Var, xzbVar);
        List list = mb8Var.c.d;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                szb szbVar = ((bd8) it.next()).k;
                if (szbVar != null) {
                    W(szbVar);
                }
            }
        }
        return Unit.a;
    }

    @Override // defpackage.x97
    public final Object R(qb8 qb8Var, xzb xzbVar) {
        qb8Var.getClass();
        xzbVar.getClass();
        s(qb8Var, xzbVar);
        Iterator it = qb8Var.c.q.iterator();
        while (it.hasNext()) {
            U(((ro9) it.next()).a, xzbVar);
        }
        return Unit.a;
    }

    @Override // defpackage.x97
    public final Object S(rb8 rb8Var, xzb xzbVar) {
        rb8Var.getClass();
        xzbVar.getClass();
        s(rb8Var, xzbVar);
        List list = rb8Var.c.d;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                szb szbVar = ((bd8) it.next()).k;
                if (szbVar != null) {
                    W(szbVar);
                }
            }
        }
        return Unit.a;
    }

    public final void W(szb szbVar) {
        this.n.add(szbVar.b().toString());
    }

    @Override // defpackage.x97
    public final Object s(jc8 jc8Var, xzb xzbVar) {
        jc8Var.getClass();
        xzbVar.getClass();
        dp8 d = jc8Var.d();
        List g = d.g();
        if (g != null) {
            Iterator it = g.iterator();
            while (it.hasNext()) {
                szb szbVar = ((l1a) it.next()).i;
                if (szbVar != null) {
                    W(szbVar);
                }
            }
        }
        List e = d.e();
        if (e != null) {
            Iterator it2 = e.iterator();
            while (it2.hasNext()) {
                szb szbVar2 = ((tw8) it2.next()).j;
                if (szbVar2 != null) {
                    W(szbVar2);
                }
            }
        }
        List B = d.B();
        if (B != null) {
            Iterator it3 = B.iterator();
            while (it3.hasNext()) {
                cn8 c = ((bn8) it3.next()).c();
                List d2 = c.d();
                if (d2 != null) {
                    Iterator it4 = d2.iterator();
                    while (it4.hasNext()) {
                        szb szbVar3 = ((bd8) it4.next()).k;
                        if (szbVar3 != null) {
                            W(szbVar3);
                        }
                    }
                }
                List e2 = c.e();
                if (e2 != null) {
                    Iterator it5 = e2.iterator();
                    while (it5.hasNext()) {
                        szb szbVar4 = ((bd8) it5.next()).k;
                        if (szbVar4 != null) {
                            W(szbVar4);
                        }
                    }
                }
            }
        }
        List w = d.w();
        if (w != null) {
            Iterator it6 = w.iterator();
            while (it6.hasNext()) {
                Iterator it7 = ((ix9) it6.next()).a.iterator();
                while (it7.hasNext()) {
                    szb szbVar5 = ((bd8) it7.next()).k;
                    if (szbVar5 != null) {
                        W(szbVar5);
                    }
                }
            }
        }
        return Unit.a;
    }
}
