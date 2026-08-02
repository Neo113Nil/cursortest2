package com.yandex.plus.pay.internal.feature.upsale;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayCompositeUpsale;
import com.yandex.plus.pay.internal.analytics.tarifficator.m;
import com.yandex.plus.pay.internal.analytics.tarifficator.w;
import com.yandex.plus.pay.internal.di.g;
import com.yandex.plus.pay.repository.api.model.offers.l0;
import com.yandex.plus.pay.repository.api.model.offers.t;
import com.yandex.plus.pay.repository.api.model.offers.v;
import defpackage.btf;
import defpackage.c5b;
import defpackage.cg6;
import defpackage.jyr;
import defpackage.nm6;
import defpackage.onb;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t75;
import defpackage.t7o;
import defpackage.v75;
import defpackage.wis;
import defpackage.xq0;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class d implements a {
    public final com.yandex.plus.pay.graphql.upsale.c a;
    public final m b;
    public final com.yandex.plus.pay.inapp.api.b c;
    public final com.yandex.plus.pay.log.impl.b d;
    public final jyr e;

    public d(com.yandex.plus.pay.graphql.upsale.c cVar, m mVar, com.yandex.plus.pay.inapp.api.b bVar, com.yandex.plus.pay.log.impl.b bVar2) {
        cVar.getClass();
        mVar.getClass();
        bVar.getClass();
        bVar2.getClass();
        this.a = cVar;
        this.b = mVar;
        this.c = bVar;
        this.d = bVar2;
        this.e = btf.b(new g(15));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:0|1|(2:3|(15:5|6|7|8|(1:(1:(8:12|13|14|(1:16)|17|(1:19)|20|(2:22|23)(2:25|26))(2:28|29))(4:30|31|32|33))(17:67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|(1:83)|53)|34|35|36|37|38|(1:40)|41|(4:44|(2:46|47)(1:49)|48|42)|50|51))|116|6|7|8|(0)(0)|34|35|36|37|38|(0)|41|(1:42)|50|51|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x003a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x013c, code lost:
    
        r2 = defpackage.z7o.b;
        r2 = new defpackage.t7o(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0139, code lost:
    
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0037, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x013b, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0034, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0132, code lost:
    
        r2 = defpackage.z7o.b;
        r2 = new defpackage.t7o(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012c, code lost:
    
        if (r0 == r2) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0098, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var, String str, String str2, String str3, ArrayList arrayList) {
        b bVar;
        Object obj;
        int i;
        String str4;
        String str5;
        String str6;
        ArrayList arrayList2;
        ArrayList arrayList3;
        t7o t7oVar;
        String str7;
        String str8;
        ArrayList arrayList4;
        try {
            if (cg6Var instanceof b) {
                bVar = (b) cg6Var;
                int i2 = bVar.p;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bVar.p = i2 - Integer.MIN_VALUE;
                    b bVar2 = bVar;
                    obj = bVar2.n;
                    nm6 nm6Var = nm6.a;
                    i = bVar2.p;
                    com.yandex.plus.pay.log.impl.b bVar3 = this.d;
                    if (i != 0) {
                        qgg.h0(obj);
                        com.yandex.plus.pay.log.impl.b.d(bVar3, com.yandex.plus.pay.common.internal.log.a.e, "Start fetching composite upsales");
                        try {
                            r7o r7oVar = z7o.b;
                            com.yandex.plus.pay.inapp.api.b bVar4 = this.c;
                            com.yandex.plus.pay.inapp.api.e eVar = com.yandex.plus.pay.inapp.api.e.a;
                            str4 = str;
                            try {
                                bVar2.j = str4;
                                str5 = str2;
                                try {
                                    bVar2.k = str5;
                                    arrayList2 = arrayList;
                                    try {
                                        bVar2.l = arrayList2;
                                        str6 = str3;
                                    } catch (wis e) {
                                        e = e;
                                        str6 = str3;
                                    } catch (Throwable th) {
                                        th = th;
                                        str6 = str3;
                                    }
                                    try {
                                        bVar2.m = str6;
                                        bVar2.p = 1;
                                        obj = bVar4.b(eVar, bVar2);
                                        if (obj != nm6Var) {
                                            arrayList3 = arrayList2;
                                        }
                                    } catch (wis e2) {
                                        e = e2;
                                        r7o r7oVar2 = z7o.b;
                                        t7oVar = new t7o(e);
                                        obj = t7oVar;
                                        str7 = str4;
                                        str8 = str5;
                                        arrayList4 = arrayList2;
                                        String str9 = str6;
                                        if (z7o.a(obj) != null) {
                                        }
                                        Iterable<com.yandex.plus.pay.inapp.api.f> iterable = (Iterable) obj;
                                        ArrayList arrayList5 = new ArrayList(v75.o(iterable, 10));
                                        while (r0.hasNext()) {
                                        }
                                        r7o r7oVar3 = z7o.b;
                                        String str10 = str7;
                                        com.yandex.plus.pay.graphql.upsale.c cVar = this.a;
                                        bVar2.j = null;
                                        bVar2.k = null;
                                        bVar2.l = null;
                                        bVar2.m = null;
                                        bVar2.p = 2;
                                        obj = cVar.a(str10, str8, arrayList4, str9, arrayList5, bVar2);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        r7o r7oVar4 = z7o.b;
                                        t7oVar = new t7o(th);
                                        obj = t7oVar;
                                        str7 = str4;
                                        str8 = str5;
                                        arrayList4 = arrayList2;
                                        String str92 = str6;
                                        if (z7o.a(obj) != null) {
                                        }
                                        Iterable<com.yandex.plus.pay.inapp.api.f> iterable2 = (Iterable) obj;
                                        ArrayList arrayList52 = new ArrayList(v75.o(iterable2, 10));
                                        while (r0.hasNext()) {
                                        }
                                        r7o r7oVar32 = z7o.b;
                                        String str102 = str7;
                                        com.yandex.plus.pay.graphql.upsale.c cVar2 = this.a;
                                        bVar2.j = null;
                                        bVar2.k = null;
                                        bVar2.l = null;
                                        bVar2.m = null;
                                        bVar2.p = 2;
                                        obj = cVar2.a(str102, str8, arrayList4, str92, arrayList52, bVar2);
                                    }
                                } catch (wis e3) {
                                    e = e3;
                                    str6 = str3;
                                    arrayList2 = arrayList;
                                    r7o r7oVar22 = z7o.b;
                                    t7oVar = new t7o(e);
                                    obj = t7oVar;
                                    str7 = str4;
                                    str8 = str5;
                                    arrayList4 = arrayList2;
                                    String str922 = str6;
                                    if (z7o.a(obj) != null) {
                                    }
                                    Iterable<com.yandex.plus.pay.inapp.api.f> iterable22 = (Iterable) obj;
                                    ArrayList arrayList522 = new ArrayList(v75.o(iterable22, 10));
                                    while (r0.hasNext()) {
                                    }
                                    r7o r7oVar322 = z7o.b;
                                    String str1022 = str7;
                                    com.yandex.plus.pay.graphql.upsale.c cVar22 = this.a;
                                    bVar2.j = null;
                                    bVar2.k = null;
                                    bVar2.l = null;
                                    bVar2.m = null;
                                    bVar2.p = 2;
                                    obj = cVar22.a(str1022, str8, arrayList4, str922, arrayList522, bVar2);
                                } catch (Throwable th3) {
                                    th = th3;
                                    str6 = str3;
                                    arrayList2 = arrayList;
                                    r7o r7oVar42 = z7o.b;
                                    t7oVar = new t7o(th);
                                    obj = t7oVar;
                                    str7 = str4;
                                    str8 = str5;
                                    arrayList4 = arrayList2;
                                    String str9222 = str6;
                                    if (z7o.a(obj) != null) {
                                    }
                                    Iterable<com.yandex.plus.pay.inapp.api.f> iterable222 = (Iterable) obj;
                                    ArrayList arrayList5222 = new ArrayList(v75.o(iterable222, 10));
                                    while (r0.hasNext()) {
                                    }
                                    r7o r7oVar3222 = z7o.b;
                                    String str10222 = str7;
                                    com.yandex.plus.pay.graphql.upsale.c cVar222 = this.a;
                                    bVar2.j = null;
                                    bVar2.k = null;
                                    bVar2.l = null;
                                    bVar2.m = null;
                                    bVar2.p = 2;
                                    obj = cVar222.a(str10222, str8, arrayList4, str9222, arrayList5222, bVar2);
                                }
                            } catch (wis e4) {
                                e = e4;
                                str5 = str2;
                                str6 = str3;
                                arrayList2 = arrayList;
                                r7o r7oVar222 = z7o.b;
                                t7oVar = new t7o(e);
                                obj = t7oVar;
                                str7 = str4;
                                str8 = str5;
                                arrayList4 = arrayList2;
                                String str92222 = str6;
                                if (z7o.a(obj) != null) {
                                }
                                Iterable<com.yandex.plus.pay.inapp.api.f> iterable2222 = (Iterable) obj;
                                ArrayList arrayList52222 = new ArrayList(v75.o(iterable2222, 10));
                                while (r0.hasNext()) {
                                }
                                r7o r7oVar32222 = z7o.b;
                                String str102222 = str7;
                                com.yandex.plus.pay.graphql.upsale.c cVar2222 = this.a;
                                bVar2.j = null;
                                bVar2.k = null;
                                bVar2.l = null;
                                bVar2.m = null;
                                bVar2.p = 2;
                                obj = cVar2222.a(str102222, str8, arrayList4, str92222, arrayList52222, bVar2);
                            } catch (Throwable th4) {
                                th = th4;
                                str5 = str2;
                                str6 = str3;
                                arrayList2 = arrayList;
                                r7o r7oVar422 = z7o.b;
                                t7oVar = new t7o(th);
                                obj = t7oVar;
                                str7 = str4;
                                str8 = str5;
                                arrayList4 = arrayList2;
                                String str922222 = str6;
                                if (z7o.a(obj) != null) {
                                }
                                Iterable<com.yandex.plus.pay.inapp.api.f> iterable22222 = (Iterable) obj;
                                ArrayList arrayList522222 = new ArrayList(v75.o(iterable22222, 10));
                                while (r0.hasNext()) {
                                }
                                r7o r7oVar322222 = z7o.b;
                                String str1022222 = str7;
                                com.yandex.plus.pay.graphql.upsale.c cVar22222 = this.a;
                                bVar2.j = null;
                                bVar2.k = null;
                                bVar2.l = null;
                                bVar2.m = null;
                                bVar2.p = 2;
                                obj = cVar22222.a(str1022222, str8, arrayList4, str922222, arrayList522222, bVar2);
                            }
                        } catch (wis e5) {
                            e = e5;
                            str4 = str;
                        } catch (Throwable th5) {
                            th = th5;
                            str4 = str;
                        }
                        return nm6Var;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        r7o r7oVar5 = z7o.b;
                        Throwable a = z7o.a(obj);
                        if (a != null) {
                            com.yandex.plus.pay.log.impl.b.f(bVar3, com.yandex.plus.pay.common.internal.log.a.e, "Error when fetching upsales: " + a, null, 12);
                        }
                        if (obj instanceof t7o) {
                            obj = null;
                        }
                        com.yandex.plus.pay.repository.api.model.upsale.d dVar = (com.yandex.plus.pay.repository.api.model.upsale.d) obj;
                        if (dVar == null) {
                            com.yandex.plus.pay.log.impl.b.d(bVar3, com.yandex.plus.pay.common.internal.log.a.e, "Composite upsales is null");
                            return null;
                        }
                        com.yandex.plus.pay.log.impl.b.d(bVar3, com.yandex.plus.pay.common.internal.log.a.e, "Composite upsales is loaded: " + dVar);
                        return dVar;
                    }
                    String str11 = bVar2.m;
                    arrayList3 = bVar2.l;
                    String str12 = bVar2.k;
                    String str13 = bVar2.j;
                    try {
                        qgg.h0(obj);
                        str5 = str12;
                        str4 = str13;
                        str6 = str11;
                    } catch (wis e6) {
                        e = e6;
                        str5 = str12;
                        str4 = str13;
                        str6 = str11;
                        arrayList2 = arrayList3;
                        r7o r7oVar2222 = z7o.b;
                        t7oVar = new t7o(e);
                        obj = t7oVar;
                        str7 = str4;
                        str8 = str5;
                        arrayList4 = arrayList2;
                        String str9222222 = str6;
                        if (z7o.a(obj) != null) {
                        }
                        Iterable<com.yandex.plus.pay.inapp.api.f> iterable222222 = (Iterable) obj;
                        ArrayList arrayList5222222 = new ArrayList(v75.o(iterable222222, 10));
                        while (r0.hasNext()) {
                        }
                        r7o r7oVar3222222 = z7o.b;
                        String str10222222 = str7;
                        com.yandex.plus.pay.graphql.upsale.c cVar222222 = this.a;
                        bVar2.j = null;
                        bVar2.k = null;
                        bVar2.l = null;
                        bVar2.m = null;
                        bVar2.p = 2;
                        obj = cVar222222.a(str10222222, str8, arrayList4, str9222222, arrayList5222222, bVar2);
                    } catch (Throwable th6) {
                        th = th6;
                        str5 = str12;
                        str4 = str13;
                        str6 = str11;
                        arrayList2 = arrayList3;
                        r7o r7oVar4222 = z7o.b;
                        t7oVar = new t7o(th);
                        obj = t7oVar;
                        str7 = str4;
                        str8 = str5;
                        arrayList4 = arrayList2;
                        String str92222222 = str6;
                        if (z7o.a(obj) != null) {
                        }
                        Iterable<com.yandex.plus.pay.inapp.api.f> iterable2222222 = (Iterable) obj;
                        ArrayList arrayList52222222 = new ArrayList(v75.o(iterable2222222, 10));
                        while (r0.hasNext()) {
                        }
                        r7o r7oVar32222222 = z7o.b;
                        String str102222222 = str7;
                        com.yandex.plus.pay.graphql.upsale.c cVar2222222 = this.a;
                        bVar2.j = null;
                        bVar2.k = null;
                        bVar2.l = null;
                        bVar2.m = null;
                        bVar2.p = 2;
                        obj = cVar2222222.a(str102222222, str8, arrayList4, str92222222, arrayList52222222, bVar2);
                    }
                    r7o r7oVar6 = z7o.b;
                    str7 = str4;
                    arrayList4 = arrayList3;
                    str8 = str5;
                    String str922222222 = str6;
                    if (z7o.a(obj) != null) {
                        obj = c5b.a;
                    }
                    Iterable<com.yandex.plus.pay.inapp.api.f> iterable22222222 = (Iterable) obj;
                    ArrayList arrayList522222222 = new ArrayList(v75.o(iterable22222222, 10));
                    for (com.yandex.plus.pay.inapp.api.f fVar : iterable22222222) {
                        String str14 = fVar.e;
                        String str15 = fVar.a;
                        if (str15 == null) {
                            str15 = "";
                        }
                        arrayList522222222.add(new t(str14, str15, (String) CollectionsKt.Q(fVar.b)));
                    }
                    r7o r7oVar322222222 = z7o.b;
                    String str1022222222 = str7;
                    com.yandex.plus.pay.graphql.upsale.c cVar22222222 = this.a;
                    bVar2.j = null;
                    bVar2.k = null;
                    bVar2.l = null;
                    bVar2.m = null;
                    bVar2.p = 2;
                    obj = cVar22222222.a(str1022222222, str8, arrayList4, str922222222, arrayList522222222, bVar2);
                }
            }
            if (i != 0) {
            }
            r7o r7oVar62 = z7o.b;
            str7 = str4;
            arrayList4 = arrayList3;
            str8 = str5;
            String str9222222222 = str6;
            if (z7o.a(obj) != null) {
            }
            Iterable<com.yandex.plus.pay.inapp.api.f> iterable222222222 = (Iterable) obj;
            ArrayList arrayList5222222222 = new ArrayList(v75.o(iterable222222222, 10));
            while (r0.hasNext()) {
            }
            r7o r7oVar3222222222 = z7o.b;
            String str10222222222 = str7;
            com.yandex.plus.pay.graphql.upsale.c cVar222222222 = this.a;
            bVar2.j = null;
            bVar2.k = null;
            bVar2.l = null;
            bVar2.m = null;
            bVar2.p = 2;
            obj = cVar222222222.a(str10222222222, str8, arrayList4, str9222222222, arrayList5222222222, bVar2);
        } catch (CancellationException e7) {
            throw e7;
        }
        bVar = new b(this, cg6Var);
        b bVar22 = bVar;
        obj = bVar22.n;
        nm6 nm6Var2 = nm6.a;
        i = bVar22.p;
        com.yandex.plus.pay.log.impl.b bVar32 = this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(PlusPayCompositeOffers.Offer offer, cg6 cg6Var) {
        c cVar;
        int i;
        PlusPayCompositeOffers.Offer offer2;
        com.yandex.plus.pay.repository.api.model.upsale.d dVar;
        PlusPayCompositeUpsale plusPayCompositeUpsale;
        if (cg6Var instanceof c) {
            cVar = (c) cg6Var;
            int i2 = cVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.m = i2 - Integer.MIN_VALUE;
                c cVar2 = cVar;
                Object obj = cVar2.k;
                Object obj2 = nm6.a;
                i = cVar2.m;
                if (i != 0) {
                    qgg.h0(obj);
                    String sessionId = offer.getMeta().getSessionId();
                    String productTarget = offer.getMeta().getProductTarget();
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers = offer.getOptionOffers();
                    ArrayList arrayList = new ArrayList(v75.o(optionOffers, 10));
                    Iterator<T> it = optionOffers.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
                    }
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
                    String id = tariffOffer != null ? tariffOffer.getId() : null;
                    cVar2.j = offer;
                    cVar2.m = 1;
                    obj = a(cVar2, sessionId, productTarget, id, arrayList);
                    if (obj == obj2) {
                        return obj2;
                    }
                    offer2 = offer;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    offer2 = cVar2.j;
                    qgg.h0(obj);
                }
                dVar = (com.yandex.plus.pay.repository.api.model.upsale.d) obj;
                if (dVar != null) {
                    return null;
                }
                com.yandex.plus.pay.repository.api.model.upsale.c cVar3 = (com.yandex.plus.pay.repository.api.model.upsale.c) CollectionsKt.firstOrNull(dVar.c);
                if (cVar3 != null) {
                    com.yandex.plus.pay.internal.model.mappers.c cVar4 = (com.yandex.plus.pay.internal.model.mappers.c) this.e.getValue();
                    cVar4.getClass();
                    offer2.getClass();
                    l0 l0Var = cVar3.a;
                    com.yandex.plus.pay.repository.api.model.upsale.a aVar = cVar3.d;
                    PlusPayCompositeOffers.Offer c = cVar4.c(l0Var, aVar.a, offer2.getMeta().getProductTarget(), aVar.b, true);
                    com.yandex.plus.pay.repository.api.model.upsale.b bVar = cVar3.b;
                    PlusPayCompositeUpsale.Template template = new PlusPayCompositeUpsale.Template(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e, bVar.f, bVar.g, new PlusPayCompositeUpsale.Template.MainImage(bVar.h, bVar.i));
                    v vVar = cVar3.c;
                    plusPayCompositeUpsale = new PlusPayCompositeUpsale(c, template, vVar != null ? com.yandex.plus.pay.internal.model.mappers.e.a(vVar) : null);
                } else {
                    plusPayCompositeUpsale = null;
                }
                m mVar = this.b;
                if (plusPayCompositeUpsale == null) {
                    w wVar = (w) mVar;
                    wVar.getClass();
                    offer2.getClass();
                    wVar.a.c(offer2.getMeta().getSessionId(), onb.Upsale, offer2.getMeta().getProductTarget(), "Backend returned empty list of offers");
                    return plusPayCompositeUpsale;
                }
                PlusPayCompositeOffers.Offer offer3 = plusPayCompositeUpsale.getOffer();
                w wVar2 = (w) mVar;
                wVar2.getClass();
                offer3.getClass();
                wVar2.a.d(offer3.getMeta().getSessionId(), offer3.getMeta().getProductTarget(), offer3.getMeta().getOffersBatchId(), t75.c(offer3.getPositionId()));
                return plusPayCompositeUpsale;
            }
        }
        cVar = new c(this, cg6Var);
        c cVar22 = cVar;
        Object obj3 = cVar22.k;
        Object obj22 = nm6.a;
        i = cVar22.m;
        if (i != 0) {
        }
        dVar = (com.yandex.plus.pay.repository.api.model.upsale.d) obj3;
        if (dVar != null) {
        }
    }
}
