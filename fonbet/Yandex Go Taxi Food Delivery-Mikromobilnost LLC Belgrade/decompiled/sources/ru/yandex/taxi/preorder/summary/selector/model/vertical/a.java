package ru.yandex.taxi.preorder.summary.selector.model.vertical;

import defpackage.cvu0;
import defpackage.dk31;
import defpackage.dlx0;
import defpackage.elx0;
import defpackage.gwk0;
import defpackage.ik31;
import defpackage.jl40;
import defpackage.mi31;
import defpackage.mrx0;
import defpackage.oa31;
import defpackage.pbx0;
import defpackage.pex0;
import defpackage.qj31;
import defpackage.scc;
import defpackage.t0f0;
import defpackage.tcc;
import defpackage.ti31;
import defpackage.xc11;
import defpackage.za31;
import defpackage.zxs0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes6.dex */
public final class a {
    public final ti31 a;
    public final zxs0 b;
    public final mrx0 c;
    public final xc11 d;

    public a(ti31 ti31Var, zxs0 zxs0Var, mrx0 mrx0Var, xc11 xc11Var) {
        this.a = ti31Var;
        this.b = zxs0Var;
        this.c = mrx0Var;
        this.d = xc11Var;
    }

    public final ArrayList a(int i, List list) {
        zxs0 zxs0Var = this.b;
        zxs0Var.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        int i2 = 0;
        for (Object obj : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                scc.m();
                throw null;
            }
            elx0 elx0Var = (elx0) obj;
            boolean z = i2 == i;
            ((pbx0) zxs0Var.a).getClass();
            arrayList.add(new elx0(elx0Var.a, elx0Var.b, elx0Var.c, elx0Var.d, elx0Var.e, elx0Var.f, elx0Var.g, elx0Var.h, elx0Var.i, elx0Var.j, elx0Var.k, elx0Var.l, elx0Var.m, elx0Var.n, elx0Var.o, elx0Var.p, elx0Var.q, elx0Var.r, elx0Var.s, elx0Var.t, z, elx0Var.v, elx0Var.w, elx0Var.x, elx0Var.y, elx0Var.z, elx0Var.A, elx0Var.B, elx0Var.C, elx0Var.D, elx0Var.E, elx0Var.F, elx0Var.G, elx0Var.H, elx0Var.I, elx0Var.J, elx0Var.K, elx0Var.L, elx0Var.M));
            i2 = i3;
            zxs0Var = zxs0Var;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.List] */
    public final List b(ik31 ik31Var, boolean z) {
        boolean z2;
        Object obj;
        Object obj2;
        pex0 pex0Var;
        boolean z3 = ik31Var.d;
        dk31 dk31Var = ik31Var.a;
        zxs0 zxs0Var = this.b;
        int i = 10;
        if (!z3) {
            ik31 a = this.d.a(ik31Var);
            mi31 mi31Var = a.b;
            List<za31> list = a.a.a;
            if (!list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (za31 za31Var : list) {
                    oa31 oa31Var = za31Var.a;
                    String str = oa31Var.a;
                    boolean l = gwk0.l(oa31Var, mi31Var.b);
                    List list2 = za31Var.b;
                    ArrayList arrayList2 = new ArrayList(tcc.n(list2, i));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((mi31) it.next()).d(za31Var.d));
                    }
                    ?? q = zxs0Var.q(this.c.a(arrayList2, ik31Var.c, l ? mi31Var : null, z, dk31Var.d), str);
                    ti31 ti31Var = this.a;
                    ti31Var.getClass();
                    mi31 mi31Var2 = za31Var.c;
                    if (oa31Var.c() && q.size() >= 2) {
                        Iterator it2 = q.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            if (((elx0) obj).u) {
                                break;
                            }
                        }
                        elx0 elx0Var = (elx0) obj;
                        if (elx0Var == null) {
                            Iterator it3 = q.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it3.next();
                                if (jl40.l(((elx0) obj2).b, (mi31Var2 == null || (pex0Var = mi31Var2.a) == null) ? null : pex0Var.b)) {
                                    break;
                                }
                            }
                            elx0Var = (elx0) obj2;
                            if (elx0Var == null) {
                                elx0Var = (elx0) kotlin.collections.a.R(q);
                            }
                        }
                        if (elx0Var != null) {
                            pex0 pex0Var2 = mi31Var2 != null ? mi31Var2.a : null;
                            String a2 = ti31Var.x.a(oa31Var.i);
                            dlx0 dlx0Var = new dlx0();
                            dlx0Var.a = elx0Var.b;
                            dlx0Var.b = str;
                            dlx0Var.c = q;
                            qj31 qj31Var = ti31Var.y;
                            VerticalTariffPresentationModelFactory$create$1 verticalTariffPresentationModelFactory$create$1 = new VerticalTariffPresentationModelFactory$create$1(elx0Var, elx0.class, "title", "getTitle()Ljava/lang/String;", 0);
                            qj31Var.getClass();
                            String str2 = oa31Var.e;
                            String str3 = oa31Var.d;
                            if (str2 == null || str2.length() == 0) {
                                z2 = false;
                                if (str3 == null || str3.length() == 0) {
                                    str3 = (String) verticalTariffPresentationModelFactory$create$1.get();
                                }
                            } else {
                                z2 = false;
                                str3 = cvu0.v(str2, "$TARIFF$", (String) verticalTariffPresentationModelFactory$create$1.get(), false);
                            }
                            dlx0Var.d = str3;
                            dlx0Var.e = elx0Var.g;
                            if (a2 == null) {
                                a2 = elx0Var.h;
                            }
                            dlx0Var.f = a2;
                            dlx0Var.g = elx0Var.i;
                            dlx0Var.h = elx0Var.j;
                            t0f0 t0f0Var = elx0Var.n;
                            t0f0 t0f0Var2 = elx0Var.o;
                            dlx0Var.k = t0f0Var;
                            dlx0Var.l = t0f0Var2;
                            dlx0Var.m = elx0Var.p;
                            dlx0Var.n = elx0Var.B;
                            dlx0Var.o = elx0Var.C;
                            dlx0Var.t = elx0Var.u;
                            dlx0Var.u = elx0Var.v;
                            dlx0Var.v = elx0Var.w;
                            dlx0Var.x = elx0Var.y;
                            dlx0Var.I = elx0Var.L;
                            dlx0Var.w = elx0Var.x;
                            dlx0Var.p = elx0Var.q;
                            dlx0Var.q = elx0Var.r;
                            dlx0Var.J = pex0Var2 != null ? pex0Var2.O : null;
                            q = Collections.singletonList(dlx0Var.a(elx0Var.d));
                            arrayList.addAll((Collection) q);
                            i = 10;
                        }
                    }
                    z2 = false;
                    arrayList.addAll((Collection) q);
                    i = 10;
                }
                return arrayList;
            }
        } else if (!dk31Var.a.isEmpty()) {
            za31 za31Var2 = (za31) dk31Var.a.get(0);
            List list3 = za31Var2.b;
            ArrayList arrayList3 = new ArrayList(tcc.n(list3, 10));
            Iterator it4 = list3.iterator();
            while (it4.hasNext()) {
                arrayList3.add(((mi31) it4.next()).d(za31Var2.d));
            }
            return zxs0Var.q(this.c.a(arrayList3, ik31Var.c, ik31Var.b, z, dk31Var.d), za31Var2.a.a);
        }
        return EmptyList.a;
    }
}
