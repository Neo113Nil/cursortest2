package com.yandex.plus.pay.graphql.offers;

import com.yandex.plus.core.graphql.fragment.aa;
import com.yandex.plus.core.graphql.fragment.ba;
import com.yandex.plus.core.graphql.fragment.ca;
import com.yandex.plus.core.graphql.fragment.da;
import com.yandex.plus.core.graphql.fragment.ea;
import com.yandex.plus.core.graphql.fragment.ka;
import com.yandex.plus.core.graphql.fragment.lo;
import com.yandex.plus.core.graphql.fragment.no;
import com.yandex.plus.core.graphql.fragment.o1;
import com.yandex.plus.core.graphql.fragment.o9;
import com.yandex.plus.core.graphql.fragment.p1;
import com.yandex.plus.core.graphql.fragment.q1;
import com.yandex.plus.core.graphql.fragment.r1;
import com.yandex.plus.core.graphql.fragment.s1;
import com.yandex.plus.core.graphql.fragment.sa;
import com.yandex.plus.core.graphql.fragment.t1;
import com.yandex.plus.core.graphql.fragment.t9;
import com.yandex.plus.core.graphql.fragment.ta;
import com.yandex.plus.core.graphql.fragment.v1;
import com.yandex.plus.core.graphql.fragment.x9;
import com.yandex.plus.core.graphql.type.a0;
import com.yandex.plus.pay.repository.api.model.offers.b0;
import com.yandex.plus.pay.repository.api.model.offers.c0;
import com.yandex.plus.pay.repository.api.model.offers.d0;
import com.yandex.plus.pay.repository.api.model.offers.e0;
import com.yandex.plus.pay.repository.api.model.offers.f0;
import com.yandex.plus.pay.repository.api.model.offers.g0;
import com.yandex.plus.pay.repository.api.model.offers.h0;
import com.yandex.plus.pay.repository.api.model.offers.i0;
import com.yandex.plus.pay.repository.api.model.offers.j0;
import com.yandex.plus.pay.repository.api.model.offers.k0;
import com.yandex.plus.pay.repository.api.model.offers.l0;
import com.yandex.plus.pay.repository.api.model.offers.n0;
import com.yandex.plus.pay.repository.api.model.offers.z;
import defpackage.b6e;
import defpackage.v75;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class d {
    public final n a;
    public final com.yandex.plus.pay.graphql.utils.b b;

    public d(n nVar, com.yandex.plus.pay.graphql.utils.b bVar) {
        nVar.getClass();
        bVar.getClass();
        this.a = nVar;
        this.b = bVar;
    }

    public static k0 b(a0 a0Var) {
        switch (c.a[a0Var.ordinal()]) {
            case -1:
            case 5:
            case 6:
            case 7:
                return k0.e;
            case 0:
            default:
                b6e.s();
                return null;
            case 1:
                return k0.a;
            case 2:
                return k0.b;
            case 3:
                return k0.c;
            case 4:
                return k0.d;
        }
    }

    public static n0 d(ka kaVar) {
        String bigDecimal = kaVar.b.toString();
        bigDecimal.getClass();
        return new n0(new BigDecimal(bigDecimal), kaVar.a.a);
    }

    public final h0 a(ea eaVar) {
        aa aaVar = eaVar.b;
        if (aaVar != null) {
            t9 t9Var = aaVar.b;
            return new d0(t9Var.a.toString(), d(t9Var.b.b), t9Var.c);
        }
        ba baVar = eaVar.c;
        com.yandex.plus.pay.graphql.utils.b bVar = this.b;
        if (baVar != null) {
            x9 x9Var = baVar.b;
            return new e0(bVar.a(x9Var.b.toString()).getTime(), d(x9Var.a.b));
        }
        ca caVar = eaVar.d;
        if (caVar != null) {
            return new f0(caVar.b.a.toString());
        }
        da daVar = eaVar.e;
        if (daVar != null) {
            return new g0(bVar.a(daVar.b.a.toString()).getTime());
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l0 c(v1 v1Var) {
        i0 i0Var;
        i0 i0Var2;
        j0 j0Var;
        int ordinal = v1Var.b.ordinal();
        if (ordinal == 0) {
            i0Var = i0.c;
        } else if (ordinal == 1) {
            i0Var = i0.b;
        } else {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    b6e.s();
                    return null;
                }
                i0Var2 = null;
                if (i0Var2 != null) {
                    return null;
                }
                String str = v1Var.a;
                p1 p1Var = v1Var.c;
                String str2 = p1Var != null ? p1Var.a : null;
                t1 t1Var = v1Var.d;
                if (t1Var != null) {
                    no noVar = t1Var.b;
                    String str3 = noVar.a;
                    String str4 = noVar.c.a;
                    String str5 = noVar.b;
                    String str6 = noVar.d;
                    String str7 = noVar.e;
                    String str8 = noVar.f;
                    n0 d = d(noVar.g.b);
                    String obj = noVar.h.toString();
                    ArrayList arrayList = noVar.i;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        h0 a = a(((lo) it.next()).b);
                        if (a != null) {
                            arrayList2.add(a);
                        }
                    }
                    j0Var = new j0(str3, str4, str5, str6, str7, str8, d, obj, arrayList2, b(noVar.j), noVar.k);
                } else {
                    j0Var = null;
                }
                ArrayList arrayList3 = v1Var.e;
                ArrayList arrayList4 = new ArrayList(v75.o(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    ta taVar = ((s1) it2.next()).b;
                    String str9 = taVar.a;
                    String str10 = taVar.c.a;
                    String str11 = taVar.b;
                    String str12 = taVar.d;
                    String str13 = taVar.e;
                    String str14 = taVar.f;
                    n0 d2 = d(taVar.g.b);
                    String obj2 = taVar.h.toString();
                    ArrayList arrayList5 = taVar.i;
                    Iterator it3 = it2;
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it4 = arrayList5.iterator();
                    while (it4.hasNext()) {
                        Iterator it5 = it4;
                        h0 a2 = a(((sa) it4.next()).b);
                        if (a2 != null) {
                            arrayList6.add(a2);
                        }
                        it4 = it5;
                    }
                    arrayList4.add(new c0(str9, str10, str11, str12, str13, str14, d2, obj2, arrayList6, b(taVar.j), taVar.k));
                    it2 = it3;
                }
                r1 r1Var = v1Var.f;
                o9 o9Var = r1Var != null ? r1Var.b : null;
                this.a.getClass();
                z a3 = n.a(o9Var);
                ArrayList<q1> arrayList7 = v1Var.g;
                ArrayList arrayList8 = new ArrayList(v75.o(arrayList7, 10));
                for (q1 q1Var : arrayList7) {
                    arrayList8.add(new b0(q1Var.a, d(q1Var.b.b)));
                }
                o1 o1Var = v1Var.h;
                return new l0(str, i0Var2, str2, j0Var, arrayList4, a3, arrayList8, new com.yandex.plus.pay.repository.api.model.offers.a0(o1Var.a, o1Var.b, o1Var.c), v1Var.i);
            }
            i0Var = i0.a;
        }
        i0Var2 = i0Var;
        if (i0Var2 != null) {
        }
    }
}
