package com.yandex.plus.pay.graphql.invoice;

import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.core.graphql.g1;
import com.yandex.plus.core.graphql.i1;
import com.yandex.plus.core.graphql.j0;
import com.yandex.plus.core.graphql.m0;
import com.yandex.plus.core.graphql.n0;
import com.yandex.plus.core.graphql.n2;
import com.yandex.plus.core.graphql.q2;
import com.yandex.plus.core.graphql.type.j;
import com.yandex.plus.core.graphql.type.n;
import com.yandex.plus.core.graphql.type.o;
import com.yandex.plus.core.graphql.type.q0;
import com.yandex.plus.core.graphql.type.s0;
import com.yandex.plus.experiments.impl.providers.h;
import com.yandex.plus.pay.data.mb.dto.c1;
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
import defpackage.su4;
import defpackage.t7o;
import defpackage.tkr;
import defpackage.v75;
import defpackage.wsd;
import defpackage.x3f;
import defpackage.xq0;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class e {
    public final dp0 a;
    public final com.yandex.plus.core.locale.a b;
    public final h c;
    public final x3f d;
    public final jyr e;

    public e(dp0 dp0Var, com.yandex.plus.core.locale.a aVar, h hVar, x3f x3fVar) {
        dp0Var.getClass();
        aVar.getClass();
        hVar.getClass();
        x3fVar.getClass();
        this.a = dp0Var;
        this.b = aVar;
        this.c = hVar;
        this.d = x3fVar;
        this.e = btf.b(new c1(20));
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x01fd, code lost:
    
        if (r13 != r0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ae A[LOOP:0: B:41:0x01a8->B:43:0x01ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, ArrayList arrayList, String str4, String str5, String str6, String str7, String str8, String str9, Map map, boolean z, com.yandex.plus.pay.repository.api.model.invoice.h hVar, cg6 cg6Var) {
        a aVar;
        int i;
        com.yandex.plus.pay.repository.api.model.invoice.h hVar2;
        String str10;
        e eVar;
        Object e;
        nm6 nm6Var;
        String str11;
        ArrayList arrayList2;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        boolean z2;
        Map map2;
        Object d;
        Set set;
        Object t7oVar;
        String str17 = str2;
        String str18 = str3;
        String str19 = str4;
        if (cg6Var instanceof a) {
            aVar = (a) cg6Var;
            int i2 = aVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.z = i2 - Integer.MIN_VALUE;
                Object obj = aVar.x;
                nm6 nm6Var2 = nm6.a;
                i = aVar.z;
                if (i != 0) {
                    qgg.h0(obj);
                    String language = this.b.a().getLanguage();
                    language.getClass();
                    String upperCase = language.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.a;
                    StringBuilder m = f1d.m("createInvoice() sessionId=", str, "tariffId=", str17, ", activeTariffId=");
                    m.append(str18);
                    m.append(", optionsIds=");
                    m.append(arrayList);
                    m.append(", paymentMethodId=");
                    su4.v(m, str19, ", target=", str5, ", origin=");
                    su4.v(m, str6, ", source=", str7, ", offersBatchId=");
                    su4.v(m, str8, ", offerPositionId=", str9, ", externalCallerPayload=");
                    m.append(map);
                    m.append(", silentRequested=");
                    m.append(z);
                    m.append(", additionalOffers=");
                    hVar2 = hVar;
                    m.append(hVar2);
                    String sb = m.toString();
                    jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                    com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, sb, null);
                    aVar.j = str;
                    aVar.k = str17;
                    aVar.l = str18;
                    aVar.m = arrayList;
                    aVar.n = str19;
                    aVar.o = str5;
                    aVar.p = str6;
                    aVar.q = str7;
                    aVar.r = str8;
                    aVar.s = str9;
                    aVar.t = map;
                    aVar.u = hVar2;
                    str10 = upperCase;
                    aVar.v = str10;
                    aVar.w = z;
                    aVar.z = 1;
                    eVar = this;
                    e = eVar.c.e(aVar);
                    nm6Var = nm6Var2;
                    if (e != nm6Var) {
                        str11 = str;
                        arrayList2 = arrayList;
                        str12 = str5;
                        str13 = str6;
                        str14 = str7;
                        str15 = str8;
                        str16 = str9;
                        z2 = z;
                        map2 = map;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Map map3 = aVar.t;
                    qgg.h0(obj);
                    eVar = this;
                    d = obj;
                    kp0 kp0Var = (kp0) d;
                    u.f(kp0Var);
                    com.yandex.plus.core.analytics.logging.b bVar2 = com.yandex.plus.core.analytics.logging.b.a;
                    com.yandex.plus.core.analytics.logging.e.f("createInvoice() response=" + kp0Var);
                    j0 j0Var = (j0) kp0Var.c;
                    if (j0Var == null) {
                        throw new com.yandex.plus.core.graphql.exception.d("invoice response data is null", null);
                    }
                    ((g) eVar.e.getValue()).getClass();
                    try {
                        r7o r7oVar = z7o.b;
                        t7oVar = g.a(j0Var.a.a.b);
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        t7oVar = new t7o(th);
                    }
                    Throwable a = z7o.a(t7oVar);
                    if (a == null) {
                        return (com.yandex.plus.pay.repository.api.model.invoice.f) t7oVar;
                    }
                    throw new com.yandex.plus.core.graphql.exception.d(null, a);
                }
                boolean z3 = aVar.w;
                String str20 = aVar.v;
                com.yandex.plus.pay.repository.api.model.invoice.h hVar3 = aVar.u;
                map2 = aVar.t;
                String str21 = aVar.s;
                String str22 = aVar.r;
                String str23 = aVar.q;
                String str24 = aVar.p;
                String str25 = aVar.o;
                String str26 = aVar.n;
                ArrayList arrayList3 = aVar.m;
                String str27 = aVar.l;
                String str28 = aVar.k;
                String str29 = aVar.j;
                qgg.h0(obj);
                z2 = z3;
                str16 = str21;
                str15 = str22;
                str14 = str23;
                str13 = str24;
                str12 = str25;
                str19 = str26;
                arrayList2 = arrayList3;
                str11 = str29;
                eVar = this;
                str10 = str20;
                str17 = str28;
                hVar2 = hVar3;
                str18 = str27;
                e = ((z7o) obj).a;
                nm6Var = nm6Var2;
                r7o r7oVar3 = z7o.b;
                if (e instanceof t7o) {
                    e = null;
                }
                com.yandex.plus.experiments.api.a aVar2 = (com.yandex.plus.experiments.api.a) e;
                q7g K = r1.K(str17);
                q7g K2 = r1.K(str18);
                s0.b.getClass();
                s0 a2 = j.a(str10);
                q7g K3 = r1.K(str19);
                q0 q0Var = q0.MOBILE;
                x3f x3fVar = eVar.d;
                x3fVar.getClass();
                tkr tkrVar = tkr.a;
                String c = x3fVar.c(new wsd(tkrVar, tkrVar, 1), map2);
                q7g K4 = r1.K((aVar2 != null || (set = aVar2.d) == null) ? null : CollectionsKt.w0(set));
                ArrayList<com.yandex.plus.pay.repository.api.model.invoice.g> arrayList4 = hVar2.a;
                ArrayList arrayList5 = new ArrayList(v75.o(arrayList4, 10));
                for (com.yandex.plus.pay.repository.api.model.invoice.g gVar : arrayList4) {
                    arrayList5.add(new n(gVar.a, gVar.b, gVar.c));
                }
                m0 m0Var = new m0(str11, K, arrayList2, K2, a2, str13, K3, str14, str12, str16, str15, c, z2, K4, r1.K(new o(r1.K(arrayList5))));
                aVar.j = null;
                aVar.k = null;
                aVar.l = null;
                aVar.m = null;
                aVar.n = null;
                aVar.o = null;
                aVar.p = null;
                aVar.q = null;
                aVar.r = null;
                aVar.s = null;
                aVar.t = null;
                aVar.u = null;
                aVar.v = null;
                aVar.w = z2;
                aVar.z = 2;
                d = com.yandex.plus.bdui.flex.ui.a.d(eVar.a, m0Var, aVar);
            }
        }
        aVar = new a(this, cg6Var);
        Object obj2 = aVar.x;
        nm6 nm6Var22 = nm6.a;
        i = aVar.z;
        if (i != 0) {
        }
        r7o r7oVar32 = z7o.b;
        if (e instanceof t7o) {
        }
        com.yandex.plus.experiments.api.a aVar22 = (com.yandex.plus.experiments.api.a) e;
        q7g K5 = r1.K(str17);
        q7g K22 = r1.K(str18);
        s0.b.getClass();
        s0 a22 = j.a(str10);
        q7g K32 = r1.K(str19);
        q0 q0Var2 = q0.MOBILE;
        x3f x3fVar2 = eVar.d;
        x3fVar2.getClass();
        tkr tkrVar2 = tkr.a;
        String c2 = x3fVar2.c(new wsd(tkrVar2, tkrVar2, 1), map2);
        q7g K42 = r1.K((aVar22 != null || (set = aVar22.d) == null) ? null : CollectionsKt.w0(set));
        ArrayList<com.yandex.plus.pay.repository.api.model.invoice.g> arrayList42 = hVar2.a;
        ArrayList arrayList52 = new ArrayList(v75.o(arrayList42, 10));
        while (r1.hasNext()) {
        }
        m0 m0Var2 = new m0(str11, K5, arrayList2, K22, a22, str13, K32, str14, str12, str16, str15, c2, z2, K42, r1.K(new o(r1.K(arrayList52))));
        aVar.j = null;
        aVar.k = null;
        aVar.l = null;
        aVar.m = null;
        aVar.n = null;
        aVar.o = null;
        aVar.p = null;
        aVar.q = null;
        aVar.r = null;
        aVar.s = null;
        aVar.t = null;
        aVar.u = null;
        aVar.v = null;
        aVar.w = z2;
        aVar.z = 2;
        d = com.yandex.plus.bdui.flex.ui.a.d(eVar.a, m0Var2, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, String str3, ArrayList arrayList, String str4, String str5, String str6, String str7, String str8, Map map, cg6 cg6Var) {
        b bVar;
        int i;
        Object e;
        nm6 nm6Var;
        String str9;
        Map map2;
        String str10;
        ArrayList arrayList2;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        Object d;
        Object obj;
        Set set;
        n0 n0Var;
        Object t7oVar;
        e eVar = this;
        String str17 = str5;
        if (cg6Var instanceof b) {
            bVar = (b) cg6Var;
            int i2 = bVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.w = i2 - Integer.MIN_VALUE;
                Object obj2 = bVar.u;
                nm6 nm6Var2 = nm6.a;
                i = bVar.w;
                if (i != 0) {
                    qgg.h0(obj2);
                    String language = eVar.b.a().getLanguage();
                    language.getClass();
                    String upperCase = language.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    com.yandex.plus.core.analytics.logging.b bVar2 = com.yandex.plus.core.analytics.logging.b.a;
                    StringBuilder m = f1d.m("createSilentInvoice() sessionId=", str, "tariffId=", str2, ", activeTariffId=");
                    m.append(str3);
                    m.append(", optionsIds=");
                    m.append(arrayList);
                    m.append(", target=");
                    su4.v(m, str4, ", origin=", str17, ", source=");
                    su4.v(m, str6, ", offersBatchId=", str7, ", offerPositionId=");
                    m.append(str8);
                    m.append(", externalCallerPayload=");
                    m.append(map);
                    String sb = m.toString();
                    jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                    com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar2, sb, null);
                    bVar.j = str;
                    bVar.k = str2;
                    bVar.l = str3;
                    bVar.m = arrayList;
                    bVar.n = str4;
                    bVar.o = str17;
                    bVar.p = str6;
                    bVar.q = str7;
                    bVar.r = str8;
                    bVar.s = map;
                    bVar.t = upperCase;
                    bVar.w = 1;
                    eVar = this;
                    e = eVar.c.e(bVar);
                    nm6Var = nm6Var2;
                    if (e != nm6Var) {
                        str9 = str2;
                        map2 = map;
                        str10 = str;
                        arrayList2 = arrayList;
                        str11 = str4;
                        str12 = str6;
                        str13 = str7;
                        str14 = str8;
                        str15 = upperCase;
                        str16 = str3;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Map map3 = bVar.s;
                    qgg.h0(obj2);
                    obj = obj2;
                    kp0 kp0Var = (kp0) obj;
                    u.f(kp0Var);
                    com.yandex.plus.core.analytics.logging.b bVar3 = com.yandex.plus.core.analytics.logging.b.a;
                    com.yandex.plus.core.analytics.logging.e.f("createSilentInvoice() response=" + kp0Var);
                    n0Var = (n0) kp0Var.c;
                    if (n0Var != null) {
                        throw new com.yandex.plus.core.graphql.exception.d("invoice response data is null", null);
                    }
                    ((g) eVar.e.getValue()).getClass();
                    try {
                        r7o r7oVar = z7o.b;
                        t7oVar = g.a(n0Var.a.a.b);
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        t7oVar = new t7o(th);
                    }
                    Throwable a = z7o.a(t7oVar);
                    if (a == null) {
                        return (com.yandex.plus.pay.repository.api.model.invoice.f) t7oVar;
                    }
                    throw new com.yandex.plus.core.graphql.exception.d(null, a);
                }
                str15 = bVar.t;
                map2 = bVar.s;
                String str18 = bVar.r;
                String str19 = bVar.q;
                String str20 = bVar.p;
                str17 = bVar.o;
                String str21 = bVar.n;
                ArrayList arrayList3 = bVar.m;
                str16 = bVar.l;
                str9 = bVar.k;
                String str22 = bVar.j;
                qgg.h0(obj2);
                e = ((z7o) obj2).a;
                str14 = str18;
                str13 = str19;
                str12 = str20;
                str11 = str21;
                arrayList2 = arrayList3;
                nm6Var = nm6Var2;
                str10 = str22;
                String str23 = str17;
                r7o r7oVar3 = z7o.b;
                if (e instanceof t7o) {
                    e = null;
                }
                com.yandex.plus.experiments.api.a aVar = (com.yandex.plus.experiments.api.a) e;
                q7g K = r1.K(str9);
                q7g K2 = r1.K(str16);
                s0.b.getClass();
                s0 a2 = j.a(str15);
                q0 q0Var = q0.MOBILE;
                x3f x3fVar = eVar.d;
                x3fVar.getClass();
                tkr tkrVar = tkr.a;
                com.yandex.plus.core.graphql.q0 q0Var2 = new com.yandex.plus.core.graphql.q0(str10, K, arrayList2, K2, a2, str23, str12, str11, str14, str13, x3fVar.c(new wsd(tkrVar, tkrVar, 1), map2), r1.K((aVar != null || (set = aVar.d) == null) ? null : CollectionsKt.w0(set)));
                bVar.j = null;
                bVar.k = null;
                bVar.l = null;
                bVar.m = null;
                bVar.n = null;
                bVar.o = null;
                bVar.p = null;
                bVar.q = null;
                bVar.r = null;
                bVar.s = null;
                bVar.t = null;
                bVar.w = 2;
                d = com.yandex.plus.bdui.flex.ui.a.d(eVar.a, q0Var2, bVar);
                if (d != nm6Var) {
                    obj = d;
                    kp0 kp0Var2 = (kp0) obj;
                    u.f(kp0Var2);
                    com.yandex.plus.core.analytics.logging.b bVar32 = com.yandex.plus.core.analytics.logging.b.a;
                    com.yandex.plus.core.analytics.logging.e.f("createSilentInvoice() response=" + kp0Var2);
                    n0Var = (n0) kp0Var2.c;
                    if (n0Var != null) {
                    }
                }
                return nm6Var;
            }
        }
        bVar = new b(eVar, cg6Var);
        Object obj22 = bVar.u;
        nm6 nm6Var22 = nm6.a;
        i = bVar.w;
        if (i != 0) {
        }
        String str232 = str17;
        r7o r7oVar32 = z7o.b;
        if (e instanceof t7o) {
        }
        com.yandex.plus.experiments.api.a aVar2 = (com.yandex.plus.experiments.api.a) e;
        q7g K3 = r1.K(str9);
        q7g K22 = r1.K(str16);
        s0.b.getClass();
        s0 a22 = j.a(str15);
        q0 q0Var3 = q0.MOBILE;
        x3f x3fVar2 = eVar.d;
        x3fVar2.getClass();
        tkr tkrVar2 = tkr.a;
        com.yandex.plus.core.graphql.q0 q0Var22 = new com.yandex.plus.core.graphql.q0(str10, K3, arrayList2, K22, a22, str232, str12, str11, str14, str13, x3fVar2.c(new wsd(tkrVar2, tkrVar2, 1), map2), r1.K((aVar2 != null || (set = aVar2.d) == null) ? null : CollectionsKt.w0(set)));
        bVar.j = null;
        bVar.k = null;
        bVar.l = null;
        bVar.m = null;
        bVar.n = null;
        bVar.o = null;
        bVar.p = null;
        bVar.q = null;
        bVar.r = null;
        bVar.s = null;
        bVar.t = null;
        bVar.w = 2;
        d = com.yandex.plus.bdui.flex.ui.a.d(eVar.a, q0Var22, bVar);
        if (d != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, cg6 cg6Var) {
        c cVar;
        int i;
        g1 g1Var;
        Object t7oVar;
        if (cg6Var instanceof c) {
            cVar = (c) cg6Var;
            int i2 = cVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.l = i2 - Integer.MIN_VALUE;
                Object obj = cVar.j;
                nm6 nm6Var = nm6.a;
                i = cVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.a;
                    String g = f1d.g("getInvoice() invoiceId = ", str);
                    jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                    com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, g, null);
                    i1 i1Var = new i1(str);
                    cVar.l = 1;
                    obj = com.yandex.plus.bdui.flex.ui.a.f(this.a, i1Var, cVar);
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
                com.yandex.plus.core.analytics.logging.e.f("getInvoice() response=" + kp0Var);
                g1Var = (g1) kp0Var.c;
                if (g1Var != null) {
                    throw new com.yandex.plus.core.graphql.exception.d("invoice response data is null", null);
                }
                ((g) this.e.getValue()).getClass();
                try {
                    r7o r7oVar = z7o.b;
                    t7oVar = g.a(g1Var.a.b);
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(th);
                }
                Throwable a = z7o.a(t7oVar);
                if (a == null) {
                    return (com.yandex.plus.pay.repository.api.model.invoice.f) t7oVar;
                }
                throw new com.yandex.plus.core.graphql.exception.d(null, a);
            }
        }
        cVar = new c(this, cg6Var);
        Object obj2 = cVar.j;
        nm6 nm6Var2 = nm6.a;
        i = cVar.l;
        if (i != 0) {
        }
        kp0 kp0Var2 = (kp0) obj2;
        u.f(kp0Var2);
        com.yandex.plus.core.analytics.logging.b bVar22 = com.yandex.plus.core.analytics.logging.b.a;
        com.yandex.plus.core.analytics.logging.e.f("getInvoice() response=" + kp0Var2);
        g1Var = (g1) kp0Var2.c;
        if (g1Var != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, cg6 cg6Var) {
        d dVar;
        int i;
        n2 n2Var;
        Object t7oVar;
        if (cg6Var instanceof d) {
            dVar = (d) cg6Var;
            int i2 = dVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.l = i2 - Integer.MIN_VALUE;
                Object obj = dVar.j;
                nm6 nm6Var = nm6.a;
                i = dVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.a;
                    String g = f1d.g("startInvoice() invoiceId=", str);
                    jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                    com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, g, null);
                    q2 q2Var = new q2(str);
                    dVar.l = 1;
                    obj = com.yandex.plus.bdui.flex.ui.a.d(this.a, q2Var, dVar);
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
                com.yandex.plus.core.analytics.logging.e.f("startInvoice() response=" + kp0Var);
                n2Var = (n2) kp0Var.c;
                if (n2Var != null) {
                    throw new com.yandex.plus.core.graphql.exception.d("invoice response data is null", null);
                }
                ((g) this.e.getValue()).getClass();
                try {
                    r7o r7oVar = z7o.b;
                    t7oVar = g.a(n2Var.a.a.b);
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(th);
                }
                Throwable a = z7o.a(t7oVar);
                if (a == null) {
                    return (com.yandex.plus.pay.repository.api.model.invoice.f) t7oVar;
                }
                throw new com.yandex.plus.core.graphql.exception.d(null, a);
            }
        }
        dVar = new d(this, cg6Var);
        Object obj2 = dVar.j;
        nm6 nm6Var2 = nm6.a;
        i = dVar.l;
        if (i != 0) {
        }
        kp0 kp0Var2 = (kp0) obj2;
        u.f(kp0Var2);
        com.yandex.plus.core.analytics.logging.b bVar22 = com.yandex.plus.core.analytics.logging.b.a;
        com.yandex.plus.core.analytics.logging.e.f("startInvoice() response=" + kp0Var2);
        n2Var = (n2) kp0Var2.c;
        if (n2Var != null) {
        }
    }
}
