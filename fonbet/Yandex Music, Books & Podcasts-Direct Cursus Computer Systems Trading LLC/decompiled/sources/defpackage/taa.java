package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class taa implements raa {
    public static final String k = "Downloading:".concat("DownloadControl");
    public final wka a;
    public final jur b;
    public final cca c;
    public final e6q d;
    public final kij e;
    public final cur f;
    public final xaa g;
    public final mm6 h;
    public final x0q i;
    public final es6 j;

    public taa(wka wkaVar, jur jurVar, cca ccaVar, e6q e6qVar, kij kijVar, cur curVar, xaa xaaVar) {
        dq7 dq7Var = ca8.a;
        tf6 e = gld.e(mn7.d.I0(1).plus(a4g.n()));
        ccaVar.getClass();
        e6qVar.getClass();
        kijVar.getClass();
        xaaVar.getClass();
        this.a = wkaVar;
        this.b = jurVar;
        this.c = ccaVar;
        this.d = e6qVar;
        this.e = kijVar;
        this.f = curVar;
        this.g = xaaVar;
        this.h = e;
        this.i = y0q.b(0, 1, null, 5);
        this.j = new es6(wkaVar, e6qVar, (mm6) e);
    }

    public final void a() {
        Collection c = this.e.c();
        mqs a = ((yka) this.a).a();
        d(c, null, a != null ? a.a : null);
    }

    public final Object b(eca ecaVar, bmj bmjVar) {
        Object J;
        Set A0 = CollectionsKt.A0(ecaVar.a);
        ArrayList arrayList = new ArrayList(v75.o(A0, 10));
        Iterator it = A0.iterator();
        while (it.hasNext()) {
            arrayList.add(((mqs) it.next()).a);
        }
        mqs a = ((yka) this.a).a();
        hca hcaVar = ecaVar.b;
        String str = a != null ? a.a : null;
        if (arrayList.isEmpty()) {
            J = Unit.a;
        } else {
            Pair g = g(arrayList, hcaVar, str);
            J = this.j.J(arrayList, (str == null || !arrayList.contains(str)) ? null : str, (cvl) g.a, (oq) g.b, bmjVar);
            if (J != nm6.a) {
                J = Unit.a;
            }
        }
        return J == nm6.a ? J : Unit.a;
    }

    public final void c(eca ecaVar) {
        ecaVar.getClass();
        Set A0 = CollectionsKt.A0(ecaVar.a);
        ArrayList arrayList = new ArrayList(v75.o(A0, 10));
        Iterator it = A0.iterator();
        while (it.hasNext()) {
            arrayList.add(((mqs) it.next()).a);
        }
        mqs a = ((yka) this.a).a();
        d(arrayList, ecaVar.b, a != null ? a.a : null);
    }

    public final void d(Collection collection, hca hcaVar, String str) {
        if (collection.isEmpty()) {
            return;
        }
        Pair g = g(collection, hcaVar, str);
        cvl cvlVar = (cvl) g.a;
        oq oqVar = (oq) g.b;
        String str2 = (str == null || !collection.contains(str)) ? null : str;
        es6 es6Var = this.j;
        es6Var.getClass();
        ((zi3) es6Var.c).c(new vx4(es6Var, collection, str2, cvlVar, oqVar, (Continuation) null));
    }

    public final void e(eca ecaVar) {
        paa paaVar;
        paa paaVar2;
        List list;
        boolean z;
        boolean z2;
        ecaVar.getClass();
        Continuation continuation = null;
        if (((lwc) ((yka) this.a).i.getValue()).a()) {
            su4.s(2, null, "Developer error! User can't download in Freemium", null);
            return;
        }
        ArrayList a = ecaVar.a();
        hca hcaVar = ecaVar.b;
        if (hcaVar == null) {
            fvs fvsVar = ecaVar.c;
            if (fvsVar == null || (list = fvsVar.a()) == null) {
                list = c5b.a;
            }
            List list2 = list;
            boolean z3 = list2 instanceof Collection;
            boolean z4 = false;
            if (!z3 || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (!wyf.P((mqs) it.next())) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (!z3 || !list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (!wyf.L((mqs) it2.next())) {
                        z2 = false;
                        break;
                    }
                }
            }
            z2 = true;
            oaa oaaVar = z ? oaa.b : z2 ? oaa.c : oaa.a;
            if (!z3 || !list2.isEmpty()) {
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    if (!((mqs) it3.next()).A) {
                        break;
                    }
                }
            }
            z4 = true;
            paaVar2 = new paa(oaaVar, z4);
        } else {
            if (hcaVar instanceof gca) {
                paaVar = new paa(oaa.g, ((gca) hcaVar).a.v);
            } else if (!(hcaVar instanceof fca)) {
                b6e.s();
                return;
            } else {
                oq oqVar = ((fca) hcaVar).a;
                paaVar = new paa(u2x.J(oqVar) ? oaa.e : u2x.H(oqVar) ? oaa.f : oaa.d, oqVar.r);
            }
            paaVar2 = paaVar;
        }
        this.i.a(paaVar2);
        x97.y(this.h, null, null, new j57(this, a, ecaVar, continuation, 16), 3);
    }

    public final Object f(mqs mqsVar, jss jssVar, aur aurVar) {
        eca ecaVar = eca.d;
        eca i = d51.i(mqsVar, null);
        es6 es6Var = this.j;
        es6Var.getClass();
        ((zi3) es6Var.c).c(new w90(es6Var, i, null, 4));
        xdr xdrVar = saa.a;
        Object b = this.c.b(new gba(mqsVar, (nss) jssVar, System.currentTimeMillis(), 0), aurVar);
        return b == nm6.a ? b : Unit.a;
    }

    public final Pair g(Collection collection, hca hcaVar, String str) {
        ssg.a(3, k, "delete() - moveToTemp = " + str + ", tracks = " + collection + ", entity = " + hcaVar, null);
        this.e.b(collection);
        if (hcaVar instanceof fca) {
            return new Pair(null, ((fca) hcaVar).a);
        }
        if (hcaVar instanceof gca) {
            return new Pair(((gca) hcaVar).a, null);
        }
        if (hcaVar == null) {
            return new Pair(null, null);
        }
        b6e.s();
        return null;
    }

    public final Object h(zvs zvsVar, nss nssVar, nss nssVar2, Continuation continuation) {
        Object V = x97.V(dm6.b, new d57(nssVar2, zvsVar, this, nssVar, (Continuation) null, 5), continuation);
        return V == nm6.a ? V : Unit.a;
    }
}
