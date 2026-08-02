package com.yandex.plus.pay.internal.feature.counter_offers;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.analytics.tarifficator.h;
import com.yandex.plus.pay.internal.analytics.tarifficator.i;
import com.yandex.plus.pay.internal.model.PlusPayCounterOffers;
import com.yandex.plus.pay.internal.model.PlusPayCounterOffersReason;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.onb;
import defpackage.pnb;
import defpackage.qgg;
import defpackage.su4;
import defpackage.tah;
import defpackage.uah;
import defpackage.v75;
import defpackage.xq0;
import defpackage.xqn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class d implements a {
    public final g a;
    public final List b;
    public final h c;

    public d(g gVar, List list, h hVar) {
        gVar.getClass();
        list.getClass();
        hVar.getClass();
        this.a = gVar;
        this.b = list;
        this.c = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00fe A[LOOP:0: B:18:0x00f8->B:20:0x00fe, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014f A[LOOP:1: B:34:0x0149->B:36:0x014f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusPayCompositeOffers.Offer offer, PlusPayCounterOffersReason plusPayCounterOffersReason, cg6 cg6Var) {
        b bVar;
        Object obj;
        int i;
        xqn xqnVar;
        PlusPayCounterOffers plusPayCounterOffers;
        Object b;
        PlusPayCompositeOffers.Offer offer2;
        PlusPayCounterOffers plusPayCounterOffers2;
        Iterator<T> it;
        PlusPayCompositeOffers.Offer offer3;
        Iterator it2;
        com.yandex.plus.pay.internal.analytics.tarifficator.c cVar;
        PlusPayCompositeOffers.Offer.Meta meta;
        String productTarget;
        PlusPayCompositeOffers.Offer.Meta meta2;
        PlusPayCompositeOffers.Offer.Meta meta3;
        if (cg6Var instanceof b) {
            bVar = (b) cg6Var;
            int i2 = bVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.o = i2 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                Object obj2 = bVar2.m;
                obj = nm6.a;
                i = bVar2.o;
                if (i != 0) {
                    ArrayList q = su4.q(obj2);
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
                    if (tariffOffer != null) {
                        q.add(tariffOffer.getId());
                    }
                    Iterator<T> it3 = offer.getOptionOffers().iterator();
                    while (it3.hasNext()) {
                        q.add(((PlusPayCompositeOffers.Offer.Option) it3.next()).getId());
                    }
                    xqn xqnVar2 = new xqn();
                    String productTarget2 = offer.getMeta().getProductTarget();
                    String sessionId = offer.getMeta().getSessionId();
                    String code = plusPayCounterOffersReason.getCode();
                    bVar2.j = offer;
                    bVar2.k = xqnVar2;
                    bVar2.o = 1;
                    Object a = this.a.a(bVar2, productTarget2, sessionId, code, q);
                    if (a != obj) {
                        obj2 = a;
                        xqnVar = xqnVar2;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    plusPayCounterOffers2 = bVar2.l;
                    xqnVar = bVar2.k;
                    offer2 = bVar2.j;
                    qgg.h0(obj2);
                    PlusPayCounterOffers plusPayCounterOffers3 = (PlusPayCounterOffers) obj2;
                    if (xqnVar.a == null && plusPayCounterOffers3.getOffers().isEmpty()) {
                        xqnVar.a = com.yandex.plus.pay.internal.analytics.tarifficator.b.b;
                    }
                    i iVar = (i) this.c;
                    iVar.getClass();
                    offer2.getClass();
                    plusPayCounterOffers2.getClass();
                    List<PlusPayCounterOffers.CounterOffer> offers = plusPayCounterOffers2.getOffers();
                    ArrayList arrayList = new ArrayList(v75.o(offers, 10));
                    it = offers.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((PlusPayCounterOffers.CounterOffer) it.next()).getOffer());
                    }
                    offer3 = (PlusPayCompositeOffers.Offer) CollectionsKt.firstOrNull(arrayList);
                    pnb pnbVar = iVar.a;
                    String sessionId2 = offer2.getMeta().getSessionId();
                    String str = "no_value";
                    if (offer3 != null || (meta3 = offer3.getMeta()) == null || (r7 = meta3.getProductTarget()) == null) {
                        String str2 = "no_value";
                    }
                    if (offer3 != null || (meta2 = offer3.getMeta()) == null || (r12 = meta2.getOffersBatchId()) == null) {
                        String str3 = "no_value";
                    }
                    ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                    it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((PlusPayCompositeOffers.Offer) it2.next()).getPositionId());
                    }
                    pnbVar.d(sessionId2, str2, str3, arrayList2);
                    cVar = (com.yandex.plus.pay.internal.analytics.tarifficator.c) xqnVar.a;
                    if (cVar != null) {
                        iVar.getClass();
                        plusPayCounterOffers3.getClass();
                        List<PlusPayCounterOffers.CounterOffer> offers2 = plusPayCounterOffers3.getOffers();
                        ArrayList arrayList3 = new ArrayList(v75.o(offers2, 10));
                        Iterator<T> it4 = offers2.iterator();
                        while (it4.hasNext()) {
                            arrayList3.add(((PlusPayCounterOffers.CounterOffer) it4.next()).getOffer());
                        }
                        PlusPayCompositeOffers.Offer offer4 = (PlusPayCompositeOffers.Offer) CollectionsKt.firstOrNull(arrayList3);
                        pnb pnbVar2 = iVar.a;
                        String sessionId3 = offer2.getMeta().getSessionId();
                        if (offer4 != null && (meta = offer4.getMeta()) != null && (productTarget = meta.getProductTarget()) != null) {
                            str = productTarget;
                        }
                        pnbVar2.c(sessionId3, onb.ContrOffer, str, cVar.a);
                    }
                    return plusPayCounterOffers3;
                }
                xqn xqnVar3 = bVar2.k;
                PlusPayCompositeOffers.Offer offer5 = bVar2.j;
                qgg.h0(obj2);
                xqnVar = xqnVar3;
                offer = offer5;
                plusPayCounterOffers = (PlusPayCounterOffers) obj2;
                if (plusPayCounterOffers.getOffers().isEmpty()) {
                    xqnVar.a = com.yandex.plus.pay.internal.analytics.tarifficator.a.b;
                }
                bVar2.j = offer;
                bVar2.k = xqnVar;
                bVar2.l = plusPayCounterOffers;
                bVar2.o = 2;
                b = b(offer, plusPayCounterOffers, bVar2);
                if (b != obj) {
                    offer2 = offer;
                    plusPayCounterOffers2 = plusPayCounterOffers;
                    obj2 = b;
                    PlusPayCounterOffers plusPayCounterOffers32 = (PlusPayCounterOffers) obj2;
                    if (xqnVar.a == null) {
                        xqnVar.a = com.yandex.plus.pay.internal.analytics.tarifficator.b.b;
                    }
                    i iVar2 = (i) this.c;
                    iVar2.getClass();
                    offer2.getClass();
                    plusPayCounterOffers2.getClass();
                    List<PlusPayCounterOffers.CounterOffer> offers3 = plusPayCounterOffers2.getOffers();
                    ArrayList arrayList4 = new ArrayList(v75.o(offers3, 10));
                    it = offers3.iterator();
                    while (it.hasNext()) {
                    }
                    offer3 = (PlusPayCompositeOffers.Offer) CollectionsKt.firstOrNull(arrayList4);
                    pnb pnbVar3 = iVar2.a;
                    String sessionId22 = offer2.getMeta().getSessionId();
                    String str4 = "no_value";
                    if (offer3 != null) {
                    }
                    String str22 = "no_value";
                    if (offer3 != null) {
                    }
                    String str32 = "no_value";
                    ArrayList arrayList22 = new ArrayList(v75.o(arrayList4, 10));
                    it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                    }
                    pnbVar3.d(sessionId22, str22, str32, arrayList22);
                    cVar = (com.yandex.plus.pay.internal.analytics.tarifficator.c) xqnVar.a;
                    if (cVar != null) {
                    }
                    return plusPayCounterOffers32;
                }
                return obj;
            }
        }
        bVar = new b(this, cg6Var);
        b bVar22 = bVar;
        Object obj22 = bVar22.m;
        obj = nm6.a;
        i = bVar22.o;
        if (i != 0) {
        }
        plusPayCounterOffers = (PlusPayCounterOffers) obj22;
        if (plusPayCounterOffers.getOffers().isEmpty()) {
        }
        bVar22.j = offer;
        bVar22.k = xqnVar;
        bVar22.l = plusPayCounterOffers;
        bVar22.o = 2;
        b = b(offer, plusPayCounterOffers, bVar22);
        if (b != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00b1 -> B:10:0x00b4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(PlusPayCompositeOffers.Offer offer, PlusPayCounterOffers plusPayCounterOffers, cg6 cg6Var) {
        c cVar;
        int i;
        int i2;
        Iterator it;
        PlusPayCompositeOffers plusPayCompositeOffers;
        PlusPayCounterOffers plusPayCounterOffers2;
        if (cg6Var instanceof c) {
            cVar = (c) cg6Var;
            int i3 = cVar.o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cVar.o = i3 - Integer.MIN_VALUE;
                Object obj = cVar.m;
                nm6 nm6Var = nm6.a;
                i = cVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    List<PlusPayCounterOffers.CounterOffer> offers = plusPayCounterOffers.getOffers();
                    ArrayList arrayList = new ArrayList(v75.o(offers, 10));
                    Iterator<T> it2 = offers.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((PlusPayCounterOffers.CounterOffer) it2.next()).getOffer());
                    }
                    PlusPayCompositeOffers.Offer offer2 = (PlusPayCompositeOffers.Offer) CollectionsKt.firstOrNull(arrayList);
                    if (offer2 == null) {
                        return plusPayCounterOffers;
                    }
                    PlusPayCompositeOffers plusPayCompositeOffers2 = new PlusPayCompositeOffers(offer.getMeta().getSessionId(), offer2.getMeta().getOffersBatchId(), arrayList, offer2.getMeta().getProductTarget());
                    i2 = 0;
                    it = this.b.iterator();
                    plusPayCompositeOffers = plusPayCompositeOffers2;
                    plusPayCounterOffers2 = plusPayCounterOffers;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = cVar.l;
                    it = cVar.k;
                    plusPayCounterOffers2 = cVar.j;
                    qgg.h0(obj);
                    plusPayCompositeOffers = (PlusPayCompositeOffers) obj;
                    if (it.hasNext()) {
                        com.yandex.plus.pay.internal.feature.offers.post.a aVar = (com.yandex.plus.pay.internal.feature.offers.post.a) it.next();
                        cVar.j = plusPayCounterOffers2;
                        cVar.k = it;
                        cVar.l = i2;
                        cVar.o = 1;
                        obj = aVar.a(plusPayCompositeOffers, cVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        plusPayCompositeOffers = (PlusPayCompositeOffers) obj;
                        if (it.hasNext()) {
                            List<PlusPayCompositeOffers.Offer> offers2 = plusPayCompositeOffers.getOffers();
                            int a = tah.a(v75.o(offers2, 10));
                            if (a < 16) {
                                a = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                            for (Object obj2 : offers2) {
                                linkedHashMap.put(com.yandex.plus.pay.internal.utils.b.b((PlusPayCompositeOffers.Offer) obj2), obj2);
                            }
                            List<PlusPayCounterOffers.CounterOffer> offers3 = plusPayCounterOffers2.getOffers();
                            ArrayList arrayList2 = new ArrayList();
                            for (PlusPayCounterOffers.CounterOffer counterOffer : offers3) {
                                String b = com.yandex.plus.pay.internal.utils.b.b(counterOffer.getOffer());
                                PlusPayCounterOffers.CounterOffer copy$default = linkedHashMap.containsKey(b) ? PlusPayCounterOffers.CounterOffer.copy$default(counterOffer, (PlusPayCompositeOffers.Offer) uah.c(b, linkedHashMap), null, null, null, null, null, 62, null) : null;
                                if (copy$default != null) {
                                    arrayList2.add(copy$default);
                                }
                            }
                            return PlusPayCounterOffers.copy$default(plusPayCounterOffers2, null, null, arrayList2, null, null, 27, null);
                        }
                    }
                }
            }
        }
        cVar = new c(this, cg6Var);
        Object obj3 = cVar.m;
        nm6 nm6Var2 = nm6.a;
        i = cVar.o;
        if (i != 0) {
        }
    }
}
