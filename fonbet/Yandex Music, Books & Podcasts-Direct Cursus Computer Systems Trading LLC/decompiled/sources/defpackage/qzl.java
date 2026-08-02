package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final class qzl {
    public final n0m a;
    public final cxl b;
    public final kxi c;
    public final cvl d;
    public final ff e;
    public final List f;
    public final String g;
    public final tmb h;
    public final qf1 i;
    public final g0l j;
    public final j0q k;
    public final xdr l;
    public final xdr m;
    public final xdr n;
    public final xdr o;
    public final xdr p;
    public final vdr q;
    public final j0q r;
    public final j0q s;
    public final j0q t;
    public final j0q u;
    public final xdr v;
    public final xdr w;
    public final xdr x;
    public final boolean y;
    public final xdr z;

    public qzl(n0m n0mVar, cxl cxlVar, kxi kxiVar, cvl cvlVar, ff ffVar, List list, String str, tmb tmbVar, qf1 qf1Var, g0l g0lVar) {
        n0mVar.getClass();
        cvlVar.getClass();
        list.getClass();
        tmbVar.getClass();
        this.a = n0mVar;
        this.b = cxlVar;
        this.c = kxiVar;
        this.d = cvlVar;
        this.e = ffVar;
        this.f = list;
        this.g = str;
        this.h = tmbVar;
        this.i = qf1Var;
        this.j = g0lVar;
        this.k = n0mVar.y0;
        this.l = n0mVar.H;
        this.m = n0mVar.z0;
        this.n = n0mVar.A0;
        this.o = n0mVar.I;
        this.p = n0mVar.J;
        this.q = n0mVar.x0;
        this.r = n0mVar.G;
        this.s = n0mVar.K;
        this.t = n0mVar.F0;
        this.u = n0mVar.G0;
        this.v = n0mVar.E0;
        this.w = n0mVar.E;
        this.x = n0mVar.D;
        this.y = cvlVar.B != 0 || cvlVar.d();
        this.z = n0mVar.Z;
    }

    public final s3e a(ldc ldcVar, jab jabVar, u0s u0sVar) {
        Object obj = null;
        if (ldcVar != null) {
            Iterator it = ldcVar.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((hcc) next).d) {
                    obj = next;
                    break;
                }
            }
            obj = (hcc) obj;
        }
        return new s3e(ldcVar != null ? ldcVar.e : this.f, this, obj, this.h.a(jabVar, u0sVar), 1);
    }

    public final void b(jab jabVar) {
        n0m n0mVar = this.a;
        n0mVar.getClass();
        LinkedHashMap linkedHashMap = n0mVar.B0;
        Boolean bool = (Boolean) linkedHashMap.get(jabVar);
        if (bool != null ? bool.booleanValue() : false) {
            return;
        }
        linkedHashMap.put(jabVar, Boolean.TRUE);
        rmb.h(n0mVar.m.a(jabVar, null), 0, 3);
    }

    public final void c(nab nabVar, thj thjVar, u0s u0sVar, String str, boolean z) {
        nabVar.getClass();
        thjVar.getClass();
        str.getClass();
        rmb a = this.h.a(nabVar, u0sVar);
        if (z) {
            a.l(null, thjVar, str);
        } else {
            a.f(thjVar, null);
        }
    }

    public final void d(String str) {
        Object obj;
        str.getClass();
        Object value = this.v.getValue();
        ldc ldcVar = value instanceof ldc ? (ldc) value : null;
        if (ldcVar == null) {
            return;
        }
        Iterator it = ldcVar.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((hcc) obj).a.equals(str)) {
                    break;
                }
            }
        }
        hcc hccVar = (hcc) obj;
        if (hccVar == null) {
            return;
        }
        this.h.b().h(new u0s(hccVar.a, hccVar.c + 1, false));
        n0m n0mVar = this.a;
        n0mVar.getClass();
        n0mVar.H0 = false;
        xdr xdrVar = n0mVar.C0;
        xdrVar.getClass();
        xdrVar.m(null, str);
    }

    public final void e(nab nabVar, thj thjVar) {
        nabVar.getClass();
        thjVar.getClass();
        rmb.j(this.h.a(nabVar, null), wjb.BottomsheetScreen, thjVar, null, 12);
        this.b.a(this.d, this.f);
    }
}
