package com.yandex.plus.pay.graphql.upsale;

import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.core.analytics.logging.e;
import com.yandex.plus.core.graphql.d0;
import com.yandex.plus.core.graphql.exception.d;
import com.yandex.plus.core.graphql.g0;
import com.yandex.plus.core.graphql.h0;
import com.yandex.plus.core.graphql.i0;
import com.yandex.plus.core.graphql.type.x;
import com.yandex.plus.experiments.impl.providers.h;
import com.yandex.plus.metrica.utils.n;
import com.yandex.plus.pay.data.mb.dto.c1;
import com.yandex.plus.pay.repository.api.model.offers.t;
import defpackage.btf;
import defpackage.cg6;
import defpackage.dp0;
import defpackage.f1d;
import defpackage.jyr;
import defpackage.kp0;
import defpackage.nm6;
import defpackage.q7g;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.tah;
import defpackage.v75;
import defpackage.xq0;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public final class c {
    public final dp0 a;
    public final n b;
    public final h c;
    public final jyr d;

    public c(dp0 dp0Var, n nVar, h hVar) {
        dp0Var.getClass();
        hVar.getClass();
        this.a = dp0Var;
        this.b = nVar;
        this.c = hVar;
        this.d = btf.b(new c1(26));
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0168, code lost:
    
        if (r6 != r8) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0132 A[LOOP:3: B:72:0x012c->B:74:0x0132, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, List list, String str3, ArrayList arrayList, cg6 cg6Var) {
        b bVar;
        int i;
        Object e;
        String str4;
        String str5;
        String str6;
        ArrayList<t> arrayList2;
        com.yandex.plus.experiments.api.a aVar;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList3;
        List list2;
        Set set;
        Object t7oVar;
        List list3 = list;
        if (cg6Var instanceof b) {
            bVar = (b) cg6Var;
            int i2 = bVar.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.q = i2 - Integer.MIN_VALUE;
                Object obj = bVar.o;
                nm6 nm6Var = nm6.a;
                i = bVar.q;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.core.analytics.logging.b bVar2 = com.yandex.plus.core.analytics.logging.b.a;
                    StringBuilder m = f1d.m("getCompositeUpsale() sessionId=", str, ", target=", str2, ", optionOffers=");
                    m.append(list3);
                    m.append(", tariffOffers=");
                    m.append(str3);
                    m.append(", inAppPurchases=");
                    m.append(arrayList);
                    String sb = m.toString();
                    jyr jyrVar = e.a;
                    e.e(com.yandex.plus.core.analytics.logging.a.a, bVar2, sb, null);
                    bVar.j = str;
                    bVar.k = str2;
                    bVar.l = list3;
                    bVar.m = str3;
                    bVar.n = arrayList;
                    bVar.q = 1;
                    e = this.c.e(bVar);
                    if (e != nm6Var) {
                        str4 = str;
                        str5 = str2;
                        str6 = str3;
                        arrayList2 = arrayList;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    List list4 = bVar.l;
                    qgg.h0(obj);
                    kp0 kp0Var = (kp0) obj;
                    u.f(kp0Var);
                    com.yandex.plus.core.analytics.logging.b bVar3 = com.yandex.plus.core.analytics.logging.b.a;
                    e.f("getCompositeUpsale() response=" + kp0Var);
                    d0 d0Var = (d0) kp0Var.c;
                    if (d0Var == null) {
                        throw new d("Composite upsale response data is null", null);
                    }
                    a aVar2 = (a) this.d.getValue();
                    aVar2.getClass();
                    try {
                        r7o r7oVar = z7o.b;
                        h0 h0Var = d0Var.a;
                        String str7 = h0Var.b;
                        String str8 = h0Var.a;
                        ArrayList<g0> arrayList4 = h0Var.c;
                        ArrayList arrayList5 = new ArrayList();
                        for (g0 g0Var : arrayList4) {
                            com.yandex.plus.pay.repository.api.model.upsale.c a = g0Var != null ? aVar2.a(g0Var, str7, str8) : null;
                            if (a != null) {
                                arrayList5.add(a);
                            }
                        }
                        t7oVar = new com.yandex.plus.pay.repository.api.model.upsale.d(str7, str8, arrayList5);
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        t7oVar = new t7o(th);
                    }
                    Throwable a2 = z7o.a(t7oVar);
                    if (a2 == null) {
                        return (com.yandex.plus.pay.repository.api.model.upsale.d) t7oVar;
                    }
                    throw new d(null, a2);
                }
                arrayList2 = bVar.n;
                str6 = bVar.m;
                list3 = bVar.l;
                String str9 = bVar.k;
                String str10 = bVar.j;
                qgg.h0(obj);
                e = ((z7o) obj).a;
                str5 = str9;
                str4 = str10;
                List list5 = list3;
                r7o r7oVar3 = z7o.b;
                if (e instanceof t7o) {
                    e = null;
                }
                aVar = (com.yandex.plus.experiments.api.a) e;
                q7g K = r1.K(str6);
                if (aVar != null || (set = aVar.d) == null) {
                    linkedHashMap = null;
                } else {
                    Set set2 = set;
                    int a3 = tah.a(v75.o(set2, 10));
                    if (a3 < 16) {
                        a3 = 16;
                    }
                    linkedHashMap = new LinkedHashMap(a3);
                    for (Object obj2 : set2) {
                        linkedHashMap.put(obj2, Boolean.TRUE);
                    }
                }
                q7g K2 = r1.K(linkedHashMap);
                if (aVar != null || (list2 = aVar.c) == null) {
                    arrayList3 = null;
                } else {
                    List list6 = list2;
                    arrayList3 = new ArrayList(v75.o(list6, 10));
                    Iterator it = list6.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(String.valueOf(((Number) it.next()).longValue()));
                    }
                }
                q7g K3 = r1.K(arrayList3);
                ArrayList arrayList6 = new ArrayList(v75.o(arrayList2, 10));
                for (t tVar : arrayList2) {
                    arrayList6.add(new x(tVar.b, tVar.c, tVar.a));
                }
                i0 i0Var = new i0(str4, list5, K, K2, K3, str5, r1.K(arrayList6), this.b.invoke());
                bVar.j = null;
                bVar.k = null;
                bVar.l = null;
                bVar.m = null;
                bVar.n = null;
                bVar.q = 2;
                obj = com.yandex.plus.bdui.flex.ui.a.f(this.a, i0Var, bVar);
            }
        }
        bVar = new b(this, cg6Var);
        Object obj3 = bVar.o;
        nm6 nm6Var2 = nm6.a;
        i = bVar.q;
        if (i != 0) {
        }
        List list52 = list3;
        r7o r7oVar32 = z7o.b;
        if (e instanceof t7o) {
        }
        aVar = (com.yandex.plus.experiments.api.a) e;
        q7g K4 = r1.K(str6);
        if (aVar != null) {
        }
        linkedHashMap = null;
        q7g K22 = r1.K(linkedHashMap);
        if (aVar != null) {
        }
        arrayList3 = null;
        q7g K32 = r1.K(arrayList3);
        ArrayList arrayList62 = new ArrayList(v75.o(arrayList2, 10));
        while (r0.hasNext()) {
        }
        i0 i0Var2 = new i0(str4, list52, K4, K22, K32, str5, r1.K(arrayList62), this.b.invoke());
        bVar.j = null;
        bVar.k = null;
        bVar.l = null;
        bVar.m = null;
        bVar.n = null;
        bVar.q = 2;
        obj3 = com.yandex.plus.bdui.flex.ui.a.f(this.a, i0Var2, bVar);
    }
}
