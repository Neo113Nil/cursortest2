package com.yandex.plus.pay.graphql.offers;

import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.core.data.common.y;
import com.yandex.plus.core.graphql.a0;
import com.yandex.plus.core.graphql.fragment.a2;
import com.yandex.plus.core.graphql.fragment.ac;
import com.yandex.plus.core.graphql.fragment.b2;
import com.yandex.plus.core.graphql.fragment.bc;
import com.yandex.plus.core.graphql.fragment.c2;
import com.yandex.plus.core.graphql.fragment.e2;
import com.yandex.plus.core.graphql.fragment.fc;
import com.yandex.plus.core.graphql.fragment.ic;
import com.yandex.plus.core.graphql.fragment.ka;
import com.yandex.plus.core.graphql.fragment.o9;
import com.yandex.plus.core.graphql.fragment.ro;
import com.yandex.plus.core.graphql.fragment.w1;
import com.yandex.plus.core.graphql.fragment.x1;
import com.yandex.plus.core.graphql.fragment.y1;
import com.yandex.plus.core.graphql.q1;
import com.yandex.plus.core.graphql.s;
import com.yandex.plus.core.graphql.s1;
import com.yandex.plus.core.graphql.t1;
import com.yandex.plus.core.graphql.type.f0;
import com.yandex.plus.core.graphql.type.g0;
import com.yandex.plus.core.graphql.type.k0;
import com.yandex.plus.core.graphql.type.l0;
import com.yandex.plus.core.graphql.type.s0;
import com.yandex.plus.core.graphql.type.v0;
import com.yandex.plus.core.graphql.type.x;
import com.yandex.plus.core.graphql.v;
import com.yandex.plus.pay.data.mb.dto.c1;
import com.yandex.plus.pay.repository.api.model.offers.i1;
import com.yandex.plus.pay.repository.api.model.offers.j1;
import com.yandex.plus.pay.repository.api.model.offers.k1;
import com.yandex.plus.pay.repository.api.model.offers.l1;
import com.yandex.plus.pay.repository.api.model.offers.n0;
import com.yandex.plus.pay.repository.api.model.offers.q;
import com.yandex.plus.pay.repository.api.model.offers.r;
import com.yandex.plus.pay.repository.api.model.offers.t;
import com.yandex.plus.pay.repository.api.model.offers.z;
import defpackage.b6e;
import defpackage.bqi;
import defpackage.btf;
import defpackage.c5b;
import defpackage.cg6;
import defpackage.dp0;
import defpackage.e0h;
import defpackage.f1d;
import defpackage.jwj;
import defpackage.jyr;
import defpackage.kp0;
import defpackage.n8g;
import defpackage.nm6;
import defpackage.q7g;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.su4;
import defpackage.t7o;
import defpackage.v75;
import defpackage.vdr;
import defpackage.xq0;
import defpackage.z7o;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class j {
    public final dp0 a;
    public final com.yandex.plus.core.locale.a b;
    public final vdr c;
    public final com.yandex.plus.experiments.impl.providers.h d;
    public final e0h e;
    public final jyr f;
    public final jyr g;
    public final jyr h;
    public final jyr i;
    public final jyr j;
    public final jyr k;
    public final jyr l;

    public j(dp0 dp0Var, com.yandex.plus.core.locale.a aVar, bqi bqiVar, com.yandex.plus.experiments.impl.providers.h hVar) {
        dp0Var.getClass();
        aVar.getClass();
        bqiVar.getClass();
        hVar.getClass();
        this.a = dp0Var;
        this.b = aVar;
        this.c = bqiVar;
        this.d = hVar;
        this.e = new e0h(5);
        this.f = btf.b(new c1(21));
        this.g = btf.b(new c1(22));
        this.h = btf.b(new c1(23));
        this.i = btf.b(new c1(24));
        final int i = 0;
        this.j = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.graphql.offers.e
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        j jVar = this.b;
                        return new d((n) jVar.g.getValue(), (com.yandex.plus.pay.graphql.utils.b) jVar.f.getValue());
                    default:
                        j jVar2 = this.b;
                        return new b((n) jVar2.g.getValue(), (a) jVar2.h.getValue(), (o) jVar2.i.getValue(), (p) jVar2.k.getValue());
                }
            }
        });
        this.k = btf.b(new c1(25));
        final int i2 = 1;
        this.l = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.graphql.offers.e
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        j jVar = this.b;
                        return new d((n) jVar.g.getValue(), (com.yandex.plus.pay.graphql.utils.b) jVar.f.getValue());
                    default:
                        j jVar2 = this.b;
                        return new b((n) jVar2.g.getValue(), (a) jVar2.h.getValue(), (o) jVar2.i.getValue(), (p) jVar2.k.getValue());
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v7, types: [c5b] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v39, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ArrayList arrayList, String str3, n8g n8gVar, ArrayList arrayList2, boolean z, boolean z2, com.yandex.plus.pay.repository.api.model.offers.d dVar, cg6 cg6Var) {
        g gVar;
        int i;
        List list;
        Object obj;
        v0 v0Var;
        v0 v0Var2;
        Set set;
        com.yandex.plus.core.graphql.i iVar;
        ?? r14;
        o9 o9Var;
        ArrayList<w1> arrayList3;
        c5b c5bVar;
        Object t7oVar;
        com.yandex.plus.core.graphql.g gVar2;
        com.yandex.plus.pay.repository.api.model.offers.l lVar;
        com.yandex.plus.pay.repository.api.model.offers.e eVar;
        n0 n0Var;
        List list2;
        Iterator it;
        o9 o9Var2;
        ArrayList arrayList4;
        com.yandex.plus.pay.repository.api.model.offers.k kVar;
        y yVar;
        if (cg6Var instanceof g) {
            gVar = (g) cg6Var;
            int i2 = gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.l = i2 - Integer.MIN_VALUE;
                Object obj2 = gVar.j;
                nm6 nm6Var = nm6.a;
                i = gVar.l;
                int i3 = 10;
                int i4 = 1;
                List list3 = null;
                if (i != 0) {
                    qgg.h0(obj2);
                    com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.a;
                    StringBuilder m = f1d.m("getCompositeOfferDetails() tariffId=", str, ", activeTariffId=", str2, ", optionsIds=");
                    su4.v(m, CollectionsKt.X(arrayList, null, null, null, null, 63), ", target=", str3, ", arguments=");
                    m.append(CollectionsKt.X(n8gVar, null, null, null, null, 63));
                    m.append(", requestSilentInvoiceAvailability=");
                    m.append(z);
                    m.append(", requestPaymentMethodsGroups=");
                    m.append(z2);
                    m.append(", additionalOffersInput=");
                    m.append(dVar);
                    String sb = m.toString();
                    jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                    com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, sb, null);
                    String language = this.b.a().getLanguage();
                    language.getClass();
                    String upperCase = language.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    q7g K = r1.K(str);
                    q7g K2 = r1.K(str2);
                    q7g K3 = r1.K(str3);
                    n8gVar.getClass();
                    arrayList2.getClass();
                    ArrayList arrayList5 = new ArrayList(v75.o(n8gVar, 10));
                    Iterator it2 = n8gVar.iterator();
                    while (it2.hasNext()) {
                        k1 k1Var = (k1) it2.next();
                        String str4 = k1Var.a;
                        ArrayList arrayList6 = k1Var.b;
                        List list4 = list3;
                        int i5 = i4;
                        ArrayList arrayList7 = new ArrayList(v75.o(arrayList6, i3));
                        Iterator it3 = arrayList6.iterator();
                        while (it3.hasNext()) {
                            j1 j1Var = (j1) it3.next();
                            String str5 = j1Var.a;
                            String str6 = upperCase;
                            n0 n0Var2 = j1Var.b;
                            arrayList7.add(new g0(str5, new f0(n0Var2.a, n0Var2.b), r1.K(Integer.valueOf(j1Var.c))));
                            it3 = it3;
                            upperCase = str6;
                        }
                        arrayList5.add(new k0(str4, arrayList7));
                        list3 = list4;
                        i4 = i5;
                        i3 = 10;
                    }
                    String str7 = upperCase;
                    int i6 = i4;
                    list = list3;
                    ArrayList arrayList8 = new ArrayList(v75.o(arrayList2, 10));
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        t tVar = (t) it4.next();
                        arrayList8.add(new x(tVar.b, tVar.c, tVar.a));
                    }
                    q7g K4 = r1.K(new l0(r1.K(arrayList8), arrayList5));
                    Object f = this.d.f();
                    r7o r7oVar = z7o.b;
                    if (f instanceof t7o) {
                        f = list;
                    }
                    com.yandex.plus.experiments.api.a aVar = (com.yandex.plus.experiments.api.a) f;
                    q7g K5 = r1.K((aVar == null || (set = aVar.d) == null) ? list : CollectionsKt.w0(set));
                    boolean z3 = !z2;
                    if (dVar != null) {
                        ArrayList<com.yandex.plus.pay.repository.api.model.offers.c> arrayList9 = dVar.b;
                        ArrayList arrayList10 = new ArrayList(v75.o(arrayList9, 10));
                        for (com.yandex.plus.pay.repository.api.model.offers.c cVar : arrayList9) {
                            boolean z4 = cVar.e;
                            String str8 = cVar.a;
                            String str9 = cVar.b;
                            String str10 = cVar.c;
                            int ordinal = cVar.d.ordinal();
                            if (ordinal == 0) {
                                v0Var2 = v0.CHECKOUT;
                            } else if (ordinal == i6) {
                                v0Var2 = v0.UPSALE;
                            } else {
                                if (ordinal != 2) {
                                    b6e.s();
                                    return list;
                                }
                                v0Var2 = v0.PRESALE;
                            }
                            arrayList10.add(new com.yandex.plus.core.graphql.type.l(z4, str8, str9, str10, v0Var2));
                            i6 = 1;
                        }
                        q7g K6 = r1.K(arrayList10);
                        ArrayList arrayList11 = dVar.a;
                        ArrayList arrayList12 = new ArrayList(v75.o(arrayList11, 10));
                        Iterator it5 = arrayList11.iterator();
                        while (it5.hasNext()) {
                            int ordinal2 = ((l1) it5.next()).ordinal();
                            if (ordinal2 == 0) {
                                v0Var = v0.CHECKOUT;
                            } else if (ordinal2 == 1) {
                                v0Var = v0.UPSALE;
                            } else {
                                if (ordinal2 != 2) {
                                    b6e.s();
                                    return list;
                                }
                                v0Var = v0.PRESALE;
                            }
                            arrayList12.add(v0Var);
                        }
                        obj = new com.yandex.plus.core.graphql.type.m(K6, r1.K(arrayList12));
                    } else {
                        obj = list;
                    }
                    a0 a0Var = new a0(K, arrayList, K2, str7, K3, K4, K5, z, z3, r1.K(obj));
                    gVar.l = 1;
                    obj2 = com.yandex.plus.bdui.flex.ui.a.f(this.a, a0Var, gVar);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                    list = null;
                }
                kp0 kp0Var = (kp0) obj2;
                u.f(kp0Var);
                jyr jyrVar2 = com.yandex.plus.core.analytics.logging.e.a;
                com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.a, "loadOfferDetails() response=" + kp0Var, list);
                iVar = (com.yandex.plus.core.graphql.i) kp0Var.c;
                if (iVar != null) {
                    throw new com.yandex.plus.core.graphql.exception.d("composite offer details data is null", null);
                }
                b bVar2 = (b) this.l.getValue();
                bVar2.getClass();
                com.yandex.plus.core.graphql.h hVar = iVar.a;
                com.yandex.plus.core.graphql.t tVar2 = hVar.c;
                e2 e2Var = hVar.d;
                c2 c2Var = e2Var.a;
                ro roVar = c2Var != null ? c2Var.b : null;
                List list5 = e2Var.b;
                x1 x1Var = e2Var.c;
                o9 o9Var3 = x1Var != null ? x1Var.b : null;
                v vVar = tVar2 != null ? tVar2.g : null;
                a2 a2Var = e2Var.d;
                b2 b2Var = e2Var.e;
                ArrayList arrayList13 = e2Var.f;
                Iterable iterable = tVar2 != null ? tVar2.e : null;
                if (iterable == null) {
                    iterable = c5b.a;
                }
                String str11 = tVar2 != null ? tVar2.b : null;
                String str12 = tVar2 != null ? tVar2.c : null;
                String str13 = tVar2 != null ? tVar2.d : null;
                if (tVar2 != null) {
                    ArrayList arrayList14 = tVar2.a;
                    r14 = new ArrayList();
                    for (Object obj3 : arrayList14) {
                        if (!((com.yandex.plus.core.graphql.j) obj3).b.isEmpty()) {
                            r14.add(obj3);
                        }
                    }
                } else {
                    r14 = 0;
                }
                if (r14 == 0) {
                    r14 = c5b.a;
                }
                if (tVar2 == null || (list2 = tVar2.f) == null) {
                    o9Var = o9Var3;
                    arrayList3 = arrayList13;
                    c5bVar = null;
                } else {
                    ?? arrayList15 = new ArrayList();
                    Iterator it6 = list2.iterator();
                    while (it6.hasNext()) {
                        com.yandex.plus.core.graphql.u uVar = (com.yandex.plus.core.graphql.u) it6.next();
                        if (uVar != null) {
                            ic icVar = uVar.b;
                            it = it6;
                            i1 g = bVar2.g(icVar.a.b);
                            ac acVar = icVar.b;
                            i1 g2 = acVar != null ? bVar2.g(acVar.b) : null;
                            fc fcVar = icVar.c;
                            o9Var2 = o9Var3;
                            if (fcVar != null) {
                                arrayList4 = arrayList13;
                                yVar = new y(fcVar.a.a, fcVar.b.a);
                            } else {
                                arrayList4 = arrayList13;
                                yVar = null;
                            }
                            o oVar = bVar2.c;
                            bc bcVar = icVar.d;
                            oVar.getClass();
                            kVar = new com.yandex.plus.pay.repository.api.model.offers.k(g, g2, yVar, new com.yandex.plus.core.data.common.v(o.b(bcVar.a.b), o.b(bcVar.b.b)), icVar.e);
                        } else {
                            it = it6;
                            o9Var2 = o9Var3;
                            arrayList4 = arrayList13;
                            kVar = null;
                        }
                        if (kVar != null) {
                            arrayList15.add(kVar);
                        }
                        it6 = it;
                        o9Var3 = o9Var2;
                        arrayList13 = arrayList4;
                    }
                    o9Var = o9Var3;
                    arrayList3 = arrayList13;
                    c5bVar = arrayList15;
                }
                if (c5bVar == null) {
                    c5bVar = c5b.a;
                }
                com.yandex.plus.core.graphql.g gVar3 = hVar.b;
                try {
                    r7o r7oVar2 = z7o.b;
                    com.yandex.plus.pay.repository.api.model.offers.n d = roVar != null ? bVar2.d(roVar) : null;
                    List e = bVar2.e(list5);
                    bVar2.a.getClass();
                    z a = n.a(o9Var);
                    i1 g3 = vVar != null ? bVar2.g(vVar.a.b) : null;
                    com.yandex.plus.pay.repository.api.model.offers.l lVar2 = new com.yandex.plus.pay.repository.api.model.offers.l(a2Var.a, a2Var.b);
                    com.yandex.plus.pay.repository.api.model.offers.m mVar = new com.yandex.plus.pay.repository.api.model.offers.m(b2Var.a, b2Var.b);
                    ArrayList arrayList16 = new ArrayList();
                    for (w1 w1Var : arrayList3) {
                        if (w1Var != null) {
                            long j = w1Var.b;
                            ka kaVar = w1Var.a.b;
                            gVar2 = gVar3;
                            String bigDecimal = kaVar.b.toString();
                            bigDecimal.getClass();
                            lVar = lVar2;
                            n0 n0Var3 = new n0(new BigDecimal(bigDecimal), kaVar.a.a);
                            y1 y1Var = w1Var.c;
                            if (y1Var != null) {
                                ka kaVar2 = y1Var.b;
                                String bigDecimal2 = kaVar2.b.toString();
                                bigDecimal2.getClass();
                                n0Var = new n0(new BigDecimal(bigDecimal2), kaVar2.a.a);
                            } else {
                                n0Var = null;
                            }
                            eVar = new com.yandex.plus.pay.repository.api.model.offers.e(j, n0Var3, n0Var);
                        } else {
                            gVar2 = gVar3;
                            lVar = lVar2;
                            eVar = null;
                        }
                        if (eVar != null) {
                            arrayList16.add(eVar);
                        }
                        gVar3 = gVar2;
                        lVar2 = lVar;
                    }
                    com.yandex.plus.core.graphql.g gVar4 = gVar3;
                    com.yandex.plus.pay.repository.api.model.offers.l lVar3 = lVar2;
                    Boolean bool = e2Var.g;
                    ArrayList arrayList17 = new ArrayList();
                    Iterator it7 = iterable.iterator();
                    while (it7.hasNext()) {
                        com.yandex.plus.pay.repository.api.model.offers.i b = bVar2.b((s) it7.next());
                        if (b != null) {
                            arrayList17.add(b);
                        }
                    }
                    Iterable<com.yandex.plus.core.graphql.j> iterable2 = (Iterable) r14;
                    ArrayList arrayList18 = new ArrayList(v75.o(iterable2, 10));
                    for (com.yandex.plus.core.graphql.j jVar : iterable2) {
                        arrayList18.add(new com.yandex.plus.pay.repository.api.model.offers.j(jVar.a, CollectionsKt.O(jVar.b), c5bVar));
                    }
                    t7oVar = new com.yandex.plus.pay.repository.api.model.offers.o(d, e, a, g3, lVar3, mVar, arrayList16, bool, arrayList17, str11, str12, str13, arrayList18, b.a(gVar4));
                } catch (Throwable th) {
                    r7o r7oVar3 = z7o.b;
                    t7oVar = new t7o(th);
                }
                Throwable a2 = z7o.a(t7oVar);
                if (a2 == null) {
                    return (com.yandex.plus.pay.repository.api.model.offers.o) t7oVar;
                }
                throw new com.yandex.plus.core.graphql.exception.d(null, a2);
            }
        }
        gVar = new g(this, cg6Var);
        Object obj22 = gVar.j;
        nm6 nm6Var2 = nm6.a;
        i = gVar.l;
        int i32 = 10;
        int i42 = 1;
        List list32 = null;
        if (i != 0) {
        }
        kp0 kp0Var2 = (kp0) obj22;
        u.f(kp0Var2);
        jyr jyrVar22 = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.a, "loadOfferDetails() response=" + kp0Var2, list);
        iVar = (com.yandex.plus.core.graphql.i) kp0Var2.c;
        if (iVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, String str3, Set set, boolean z, cg6 cg6Var) {
        h hVar;
        int i;
        Object obj;
        com.yandex.plus.pay.repository.api.model.offers.p pVar;
        f fVar;
        if (cg6Var instanceof h) {
            hVar = (h) cg6Var;
            int i2 = hVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.m = i2 - Integer.MIN_VALUE;
                Object obj2 = hVar.k;
                Object obj3 = nm6.a;
                i = hVar.m;
                e0h e0hVar = this.e;
                if (i != 0) {
                    qgg.h0(obj2);
                    Long id = ((com.yandex.plus.domain.auth.api.e) this.c.getValue()).getId();
                    String l = id != null ? id.toString() : null;
                    com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.a;
                    StringBuilder m = f1d.m("getCompositeOffers() puid = ", l, ", sessionId=", str, "reason=");
                    su4.v(m, str2, ", target=", str3, ", tariffId=null, optionIds=null, features=");
                    m.append(set);
                    m.append(", forceUpdate=");
                    m.append(z);
                    String sb = m.toString();
                    jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                    com.yandex.plus.core.analytics.logging.a aVar = com.yandex.plus.core.analytics.logging.a.a;
                    com.yandex.plus.core.analytics.logging.e.e(aVar, bVar, sb, null);
                    String language = this.b.a().getLanguage();
                    language.getClass();
                    Locale locale = Locale.ROOT;
                    String upperCase = language.toUpperCase(locale);
                    upperCase.getClass();
                    String upperCase2 = str2.toUpperCase(locale);
                    upperCase2.getClass();
                    f fVar2 = new f(l, str, upperCase2, str3, set, upperCase);
                    if (z) {
                        pVar = null;
                    } else {
                        e0hVar.getClass();
                        com.yandex.plus.home.common.cache.lru.a aVar2 = (com.yandex.plus.home.common.cache.lru.a) e0hVar.get(fVar2);
                        if (aVar2 != null) {
                            if (System.currentTimeMillis() - aVar2.a < 3600000) {
                                obj = aVar2.b;
                                pVar = (com.yandex.plus.pay.repository.api.model.offers.p) obj;
                            } else {
                                e0hVar.remove(fVar2);
                            }
                        }
                        obj = null;
                        pVar = (com.yandex.plus.pay.repository.api.model.offers.p) obj;
                    }
                    if (pVar != null) {
                        com.yandex.plus.core.analytics.logging.e.e(aVar, bVar, "Got composite offers from cache", null);
                        return new q(pVar);
                    }
                    hVar.j = fVar2;
                    hVar.m = 1;
                    obj2 = c(fVar2, hVar);
                    if (obj2 == obj3) {
                        return obj3;
                    }
                    fVar = fVar2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fVar = hVar.j;
                    qgg.h0(obj2);
                }
                com.yandex.plus.pay.repository.api.model.offers.p pVar2 = (com.yandex.plus.pay.repository.api.model.offers.p) obj2;
                e0hVar.getClass();
                fVar.getClass();
                return new r(pVar2);
            }
        }
        hVar = new h(this, cg6Var);
        Object obj22 = hVar.k;
        Object obj32 = nm6.a;
        i = hVar.m;
        e0h e0hVar2 = this.e;
        if (i != 0) {
        }
        com.yandex.plus.pay.repository.api.model.offers.p pVar22 = (com.yandex.plus.pay.repository.api.model.offers.p) obj22;
        e0hVar2.getClass();
        fVar.getClass();
        return new r(pVar22);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(f fVar, cg6 cg6Var) {
        i iVar;
        int i;
        q1 q1Var;
        Object t7oVar;
        if (cg6Var instanceof i) {
            iVar = (i) cg6Var;
            int i2 = iVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.l = i2 - Integer.MIN_VALUE;
                Object obj = iVar.j;
                nm6 nm6Var = nm6.a;
                i = iVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.a;
                    StringBuilder sb = new StringBuilder("loadOffers() reason=");
                    String str = fVar.c;
                    String str2 = fVar.f;
                    Set set = fVar.e;
                    sb.append(str);
                    sb.append(", target=");
                    sb.append(fVar.d);
                    sb.append(", tariffId=null, optionIds=null, features=");
                    sb.append(set);
                    sb.append(", language=");
                    sb.append(str2);
                    com.yandex.plus.core.analytics.logging.e.f(sb.toString());
                    q7g K = r1.K(fVar.b);
                    String str3 = fVar.c;
                    String str4 = fVar.d;
                    q7g K2 = r1.K(set != null ? CollectionsKt.w0(set) : null);
                    q7g K3 = r1.K(null);
                    s0.b.getClass();
                    t1 t1Var = new t1(K, str3, str4, K2, jwj.f, K3, com.yandex.plus.core.graphql.type.j.a(str2));
                    iVar.l = 1;
                    obj = com.yandex.plus.bdui.flex.ui.a.f(this.a, t1Var, iVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                kp0 kp0Var = (kp0) obj;
                u.f(kp0Var);
                com.yandex.plus.core.analytics.logging.b bVar2 = com.yandex.plus.core.analytics.logging.b.a;
                com.yandex.plus.core.analytics.logging.e.f("loadOffers() response=" + kp0Var);
                q1Var = (q1) kp0Var.c;
                if (q1Var != null) {
                    throw new com.yandex.plus.core.graphql.exception.d("composite offers response data is null", null);
                }
                d dVar = (d) this.j.getValue();
                dVar.getClass();
                try {
                    r7o r7oVar = z7o.b;
                    com.yandex.plus.core.graphql.r1 r1Var = q1Var.a;
                    String str5 = r1Var.b;
                    String str6 = r1Var.a;
                    ArrayList arrayList = r1Var.c;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        com.yandex.plus.pay.repository.api.model.offers.l0 c = dVar.c(((s1) it.next()).b);
                        if (c != null) {
                            arrayList2.add(c);
                        }
                    }
                    t7oVar = new com.yandex.plus.pay.repository.api.model.offers.p(str5, str6, arrayList2);
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(th);
                }
                Throwable a = z7o.a(t7oVar);
                if (a == null) {
                    return (com.yandex.plus.pay.repository.api.model.offers.p) t7oVar;
                }
                throw new com.yandex.plus.core.graphql.exception.d(null, a);
            }
        }
        iVar = new i(this, cg6Var);
        Object obj2 = iVar.j;
        nm6 nm6Var2 = nm6.a;
        i = iVar.l;
        if (i != 0) {
        }
        kp0 kp0Var2 = (kp0) obj2;
        u.f(kp0Var2);
        com.yandex.plus.core.analytics.logging.b bVar22 = com.yandex.plus.core.analytics.logging.b.a;
        com.yandex.plus.core.analytics.logging.e.f("loadOffers() response=" + kp0Var2);
        q1Var = (q1) kp0Var2.c;
        if (q1Var != null) {
        }
    }
}
