package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class e39 extends x97 {
    public final /* synthetic */ int n = 0;
    public final ArrayList o = new ArrayList();
    public final Object p;
    public final Object q;

    public e39(gs4 gs4Var, jyr jyrVar) {
        this.p = gs4Var;
        this.q = jyrVar;
    }

    @Override // defpackage.x97
    public final Object I(cb8 cb8Var, xzb xzbVar) {
        switch (this.n) {
            case 0:
                W(cb8Var, xzbVar);
                break;
            default:
                cb8Var.getClass();
                xzbVar.getClass();
                W(cb8Var, xzbVar);
                List list = cb8Var.c.B;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        U((jc8) it.next(), xzbVar);
                    }
                }
                break;
        }
        return Unit.a;
    }

    @Override // defpackage.x97
    public final Object K(eb8 eb8Var, xzb xzbVar) {
        switch (this.n) {
            case 0:
                W(eb8Var, xzbVar);
                break;
            default:
                eb8Var.getClass();
                xzbVar.getClass();
                W(eb8Var, xzbVar);
                List list = eb8Var.c.u;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        U((jc8) it.next(), xzbVar);
                    }
                }
                break;
        }
        return Unit.a;
    }

    @Override // defpackage.x97
    public final Object L(fb8 fb8Var, xzb xzbVar) {
        switch (this.n) {
            case 0:
                W(fb8Var, xzbVar);
                if (e3s.c.W(fb8Var, xzbVar)) {
                    f39 f39Var = (f39) this.q;
                    String uri = ((Uri) fb8Var.c.u.a(xzbVar)).toString();
                    hf9 hf9Var = (hf9) this.p;
                    ArrayList arrayList = this.o;
                    synchronized (d51.l) {
                    }
                    qht qhtVar = qht.a;
                    if (qhtVar.a()) {
                        hf9Var.k.b++;
                    } else {
                        qhtVar.b(new gf9(hf9Var, 2));
                    }
                    arrayList.add(f39Var.a.a(uri, hf9Var));
                }
                break;
            default:
                fb8Var.getClass();
                xzbVar.getClass();
                W(fb8Var, xzbVar);
                i19 i19Var = fb8Var.c;
                if (((Boolean) i19Var.E.a(xzbVar)).booleanValue()) {
                    Object it = ocg.D(i19Var.u).iterator();
                    while (((e9h) it).hasNext()) {
                        X((String) ((c9h) it).next());
                    }
                }
                break;
        }
        return Unit.a;
    }

    @Override // defpackage.x97
    public final Object M(gb8 gb8Var, xzb xzbVar) {
        switch (this.n) {
            case 0:
                W(gb8Var, xzbVar);
                break;
            default:
                gb8Var.getClass();
                xzbVar.getClass();
                W(gb8Var, xzbVar);
                List list = gb8Var.c.y;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        U((jc8) it.next(), xzbVar);
                    }
                }
                break;
        }
        return Unit.a;
    }

    @Override // defpackage.x97
    public final Object N(hb8 hb8Var, xzb xzbVar) {
        switch (this.n) {
            case 0:
                W(hb8Var, xzbVar);
                if (e3s.c.W(hb8Var, xzbVar)) {
                    f39 f39Var = (f39) this.q;
                    String uri = ((Uri) hb8Var.c.B.a(xzbVar)).toString();
                    hf9 hf9Var = (hf9) this.p;
                    ArrayList arrayList = this.o;
                    synchronized (d51.l) {
                    }
                    qht qhtVar = qht.a;
                    if (qhtVar.a()) {
                        hf9Var.k.b++;
                    } else {
                        qhtVar.b(new gf9(hf9Var, 2));
                    }
                    arrayList.add(f39Var.a.b(uri, hf9Var));
                }
                break;
            default:
                hb8Var.getClass();
                xzbVar.getClass();
                W(hb8Var, xzbVar);
                i29 i29Var = hb8Var.c;
                if (((Boolean) i29Var.H.a(xzbVar)).booleanValue()) {
                    Object it = ocg.D(i29Var.B).iterator();
                    while (((e9h) it).hasNext()) {
                        X((String) ((c9h) it).next());
                    }
                }
                break;
        }
        return Unit.a;
    }

    @Override // defpackage.x97
    public final Object O(kb8 kb8Var, xzb xzbVar) {
        switch (this.n) {
            case 0:
                W(kb8Var, xzbVar);
                break;
            default:
                kb8Var.getClass();
                xzbVar.getClass();
                W(kb8Var, xzbVar);
                List list = kb8Var.c.t;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        U((jc8) it.next(), xzbVar);
                    }
                }
                break;
        }
        return Unit.a;
    }

    @Override // defpackage.x97
    public final Object Q(ob8 ob8Var, xzb xzbVar) {
        switch (this.n) {
            case 0:
                W(ob8Var, xzbVar);
                break;
            default:
                ob8Var.getClass();
                xzbVar.getClass();
                W(ob8Var, xzbVar);
                Iterator it = ob8Var.c.I.iterator();
                while (it.hasNext()) {
                    jc8 jc8Var = ((cm9) it.next()).c;
                    if (jc8Var != null) {
                        U(jc8Var, xzbVar);
                    }
                }
                break;
        }
        return Unit.a;
    }

    @Override // defpackage.x97
    public final Object R(qb8 qb8Var, xzb xzbVar) {
        switch (this.n) {
            case 0:
                W(qb8Var, xzbVar);
                break;
            default:
                qb8Var.getClass();
                xzbVar.getClass();
                W(qb8Var, xzbVar);
                Iterator it = qb8Var.c.q.iterator();
                while (it.hasNext()) {
                    U(((ro9) it.next()).a, xzbVar);
                }
                break;
        }
        return Unit.a;
    }

    @Override // defpackage.x97
    public final Object S(rb8 rb8Var, xzb xzbVar) {
        List list;
        switch (this.n) {
            case 0:
                W(rb8Var, xzbVar);
                if (e3s.c.W(rb8Var, xzbVar) && (list = rb8Var.c.F) != null) {
                    f39 f39Var = (f39) this.q;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String uri = ((Uri) ((tq9) it.next()).i.a(xzbVar)).toString();
                        hf9 hf9Var = (hf9) this.p;
                        ArrayList arrayList = this.o;
                        synchronized (d51.l) {
                        }
                        qht qhtVar = qht.a;
                        if (qhtVar.a()) {
                            hf9Var.k.b++;
                        } else {
                            qhtVar.b(new gf9(hf9Var, 2));
                        }
                        arrayList.add(f39Var.a.b(uri, hf9Var));
                    }
                }
                break;
            default:
                rb8Var.getClass();
                xzbVar.getClass();
                W(rb8Var, xzbVar);
                List list2 = rb8Var.c.F;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        Object it3 = ocg.D(((tq9) it2.next()).i).iterator();
                        while (((e9h) it3).hasNext()) {
                            X((String) ((c9h) it3).next());
                        }
                    }
                }
                break;
        }
        return Unit.a;
    }

    @Override // defpackage.x97
    public Object T(sb8 sb8Var, xzb xzbVar) {
        List list;
        switch (this.n) {
            case 1:
                sb8Var.getClass();
                xzbVar.getClass();
                W(sb8Var, xzbVar);
                pz9 pz9Var = sb8Var.c;
                if (((Boolean) pz9Var.A.a(xzbVar)).booleanValue() && (list = pz9Var.R) != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        z75.t(arrayList, ocg.D(((c0a) it.next()).d));
                    }
                    this.o.add(((gs4) this.p).M(CollectionsKt.A0(arrayList)));
                }
                return Unit.a;
            default:
                return super.T(sb8Var, xzbVar);
        }
    }

    public final void W(jc8 jc8Var, xzb xzbVar) {
        switch (this.n) {
            case 0:
                List<mo8> d = jc8Var.d().d();
                if (d != null) {
                    f39 f39Var = (f39) this.q;
                    for (mo8 mo8Var : d) {
                        if (mo8Var instanceof ho8) {
                            ho8 ho8Var = (ho8) mo8Var;
                            if (((Boolean) ho8Var.b.f.a(xzbVar)).booleanValue()) {
                                String uri = ((Uri) ho8Var.b.e.a(xzbVar)).toString();
                                hf9 hf9Var = (hf9) this.p;
                                ArrayList arrayList = this.o;
                                synchronized (d51.l) {
                                }
                                qht qhtVar = qht.a;
                                if (qhtVar.a()) {
                                    hf9Var.k.b++;
                                } else {
                                    qhtVar.b(new gf9(hf9Var, 2));
                                }
                                arrayList.add(f39Var.a.b(uri, hf9Var));
                            }
                        }
                    }
                    break;
                }
                break;
            default:
                jc8Var.getClass();
                xzbVar.getClass();
                List<mo8> d2 = jc8Var.d().d();
                if (d2 != null) {
                    for (mo8 mo8Var2 : d2) {
                        if (mo8Var2 instanceof ho8) {
                            k29 k29Var = ((ho8) mo8Var2).b;
                            if (((Boolean) k29Var.f.a(xzbVar)).booleanValue()) {
                                Object it = ocg.D(k29Var.e).iterator();
                                while (((e9h) it).hasNext()) {
                                    X((String) ((c9h) it).next());
                                }
                            }
                        }
                    }
                }
                ArrayList arrayList2 = this.o;
                xx8 xx8Var = (xx8) ((jyr) this.q).getValue();
                xx8Var.getClass();
                xx8Var.U(jc8Var, xzb.a);
                arrayList2.addAll(xx8Var.o);
                break;
        }
    }

    public void X(String str) {
        this.o.add(((gs4) this.p).H(str));
    }

    @Override // defpackage.x97
    public final /* bridge */ /* synthetic */ Object s(jc8 jc8Var, xzb xzbVar) {
        switch (this.n) {
            case 0:
                W(jc8Var, xzbVar);
                break;
            default:
                W(jc8Var, xzbVar);
                break;
        }
        return Unit.a;
    }

    public e39(f39 f39Var, hf9 hf9Var, xzb xzbVar) {
        this.q = f39Var;
        this.p = hf9Var;
    }
}
