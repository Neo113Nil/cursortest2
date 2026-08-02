package defpackage;

import androidx.compose.foundation.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class gds {
    public final x6k a = szf.g0(null);
    public mn0 b;
    public final s2r c;

    public gds(mn0 mn0Var) {
        rvr rvrVar = rvr.K;
        mn0Var.getClass();
        kn0 kn0Var = new kn0(mn0Var);
        ArrayList arrayList = kn0Var.c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            List list = (List) rvrVar.invoke(((jn0) arrayList.get(i)).a(Integer.MIN_VALUE));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ln0 ln0Var = (ln0) list.get(i2);
                arrayList3.add(new jn0(ln0Var.b, ln0Var.c, ln0Var.a, ln0Var.d));
            }
            z75.t(arrayList2, arrayList3);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.b = kn0Var.h();
        this.c = new s2r();
    }

    public static ln0 c(ln0 ln0Var, cds cdsVar) {
        int d = cdsVar.b.d(r3.f - 1, false);
        if (ln0Var.b < d) {
            return ln0.a(ln0Var, null, Math.min(ln0Var.c, d), 11);
        }
        return null;
    }

    public final void a(int i, hq5 hq5Var) {
        char c;
        boolean z;
        yci g;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1154651354);
        char c2 = 2;
        int i2 = (oq5Var.h(this) ? 4 : 2) | i;
        boolean z2 = false;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            ej0 ej0Var = (ej0) oq5Var.j(es5.r);
            mn0 mn0Var = this.b;
            List a = mn0Var.a(mn0Var.b.length());
            int size = a.size();
            int i3 = 0;
            while (i3 < size) {
                ln0 ln0Var = (ln0) a.get(i3);
                int i4 = ln0Var.b;
                Object obj = ln0Var.a;
                if (i4 != ln0Var.c) {
                    oq5Var.Z(1386075176);
                    Object K = oq5Var.K();
                    kjn kjnVar = gq5.a;
                    Object obj2 = K;
                    if (K == kjnVar) {
                        obj2 = vz1.h(oq5Var);
                    }
                    uoi uoiVar = (uoi) obj2;
                    c = c2;
                    yci l = a.l(nfp.b(androidx.compose.ui.graphics.a.a(vci.a, new gcp(15, this, ln0Var)), z2, rvr.L).f(new sds(new suh(24, this, ln0Var))), uoiVar);
                    jfm.a.getClass();
                    yci x = uwf.x(l, qld.n);
                    boolean h = oq5Var.h(this) | oq5Var.f(ln0Var) | oq5Var.h(ej0Var);
                    Object K2 = oq5Var.K();
                    Object obj3 = K2;
                    if (h || K2 == kjnVar) {
                        j5n j5nVar = new j5n(this, ln0Var, ej0Var);
                        oq5Var.k0(j5nVar);
                        obj3 = j5nVar;
                    }
                    g = a.g(x, uoiVar, null, true, null, (r17 & 16) != 0 ? null : null, null, (r17 & 64) != 0 ? null : null, null, (Function0) obj3);
                    ug3.a(g, oq5Var, 0);
                    p7g p7gVar = (p7g) obj;
                    hds a2 = p7gVar.a();
                    if (a2 == null || (a2.a == null && a2.b == null && a2.c == null && a2.d == null)) {
                        z = false;
                        oq5Var.Z(1388926990);
                        oq5Var.p(false);
                    } else {
                        oq5Var.Z(1386898319);
                        Object K3 = oq5Var.K();
                        Object obj4 = K3;
                        if (K3 == kjnVar) {
                            z7g z7gVar = new z7g(uoiVar);
                            oq5Var.k0(z7gVar);
                            obj4 = z7gVar;
                        }
                        z7g z7gVar2 = (z7g) obj4;
                        Unit unit = Unit.a;
                        Object K4 = oq5Var.K();
                        boolean z3 = false;
                        Object obj5 = K4;
                        if (K4 == kjnVar) {
                            glp glpVar = new glp(z7gVar2, z3 ? 1 : 0, 25);
                            oq5Var.k0(glpVar);
                            obj5 = glpVar;
                        }
                        gld.w(oq5Var, unit, (Function2) obj5);
                        u6k u6kVar = z7gVar2.b;
                        u6k u6kVar2 = z7gVar2.b;
                        Boolean valueOf = Boolean.valueOf((u6kVar.h() & 2) != 0);
                        Boolean valueOf2 = Boolean.valueOf((u6kVar2.h() & 1) != 0);
                        Boolean valueOf3 = Boolean.valueOf((u6kVar2.h() & 4) != 0);
                        hds a3 = p7gVar.a();
                        c4r c4rVar = a3 != null ? a3.a : null;
                        hds a4 = p7gVar.a();
                        c4r c4rVar2 = a4 != null ? a4.b : null;
                        hds a5 = p7gVar.a();
                        c4r c4rVar3 = a5 != null ? a5.c : null;
                        hds a6 = p7gVar.a();
                        Object[] objArr = {valueOf, valueOf2, valueOf3, c4rVar, c4rVar2, c4rVar3, a6 != null ? a6.d : null};
                        boolean h2 = oq5Var.h(this) | oq5Var.f(ln0Var);
                        Object K5 = oq5Var.K();
                        Object obj6 = K5;
                        if (h2 || K5 == kjnVar) {
                            gcp gcpVar = new gcp(this, ln0Var, z7gVar2);
                            oq5Var.k0(gcpVar);
                            obj6 = gcpVar;
                        }
                        b(objArr, (Function1) obj6, oq5Var, (i2 << 6) & 896);
                        z = false;
                        oq5Var.p(false);
                    }
                    oq5Var.p(z);
                } else {
                    c = c2;
                    z = z2;
                    oq5Var.Z(1388940878);
                    oq5Var.p(z);
                }
                i3++;
                z2 = z;
                c2 = c;
            }
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new q2r(this, i, 3);
        }
    }

    public final void b(Object[] objArr, Function1 function1, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2083052099);
        int i2 = (i & 48) == 0 ? (oq5Var.h(function1) ? 32 : 16) | i : i;
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(this) ? 256 : 128;
        }
        oq5Var.W(-416604407, Integer.valueOf(objArr.length));
        for (Object obj : objArr) {
            i2 |= oq5Var.h(obj) ? 4 : 0;
        }
        oq5Var.p(false);
        if ((i2 & 14) == 0) {
            i2 |= 2;
        }
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            pz0 pz0Var = new pz0(2);
            pz0Var.b(function1);
            pz0Var.c(objArr);
            ArrayList arrayList = pz0Var.a;
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean h = oq5Var.h(this) | ((i2 & 112) == 32);
            Object K = oq5Var.K();
            if (h || K == gq5.a) {
                K = new sv2(this, function1, 1);
                oq5Var.k0(K);
            }
            gld.l(array, (Function1) K, oq5Var);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ig0(this, objArr, function1, i, 8);
        }
    }
}
