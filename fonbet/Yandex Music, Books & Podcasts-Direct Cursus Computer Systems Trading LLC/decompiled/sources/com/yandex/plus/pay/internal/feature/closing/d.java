package com.yandex.plus.pay.internal.feature.closing;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.analytics.tarifficator.g;
import com.yandex.plus.pay.internal.model.PlusPayClosingOffer;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.onb;
import defpackage.qgg;
import defpackage.su4;
import defpackage.t75;
import defpackage.tah;
import defpackage.uah;
import defpackage.v75;
import defpackage.xq0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes5.dex */
public final class d implements a {
    public final f a;
    public final List b;
    public final com.yandex.plus.pay.internal.analytics.tarifficator.f c;

    public d(f fVar, List list, com.yandex.plus.pay.internal.analytics.tarifficator.f fVar2) {
        fVar.getClass();
        list.getClass();
        fVar2.getClass();
        this.a = fVar;
        this.b = list;
        this.c = fVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        if (r10 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusPayCompositeOffers.Offer offer, cg6 cg6Var) {
        b bVar;
        Object obj;
        int i;
        Object b;
        PlusPayCompositeOffers.Offer offer2;
        PlusPayClosingOffer plusPayClosingOffer;
        PlusPayClosingOffer plusPayClosingOffer2;
        if (cg6Var instanceof b) {
            bVar = (b) cg6Var;
            int i2 = bVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.n = i2 - Integer.MIN_VALUE;
                Object obj2 = bVar.l;
                obj = nm6.a;
                i = bVar.n;
                if (i != 0) {
                    ArrayList q = su4.q(obj2);
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
                    if (tariffOffer != null) {
                        q.add(tariffOffer.getId());
                    }
                    Iterator<T> it = offer.getOptionOffers().iterator();
                    while (it.hasNext()) {
                        q.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
                    }
                    String productTarget = offer.getMeta().getProductTarget();
                    String sessionId = offer.getMeta().getSessionId();
                    bVar.j = offer;
                    bVar.n = 1;
                    obj2 = this.a.a(q, productTarget, sessionId, bVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        plusPayClosingOffer = bVar.k;
                        offer2 = bVar.j;
                        qgg.h0(obj2);
                        plusPayClosingOffer2 = (PlusPayClosingOffer) obj2;
                        com.yandex.plus.pay.internal.analytics.tarifficator.f fVar = this.c;
                        if (plusPayClosingOffer2 == null) {
                            g gVar = (g) fVar;
                            gVar.getClass();
                            offer2.getClass();
                            plusPayClosingOffer.getClass();
                            gVar.a.c(offer2.getMeta().getSessionId(), onb.ClosingOffer, plusPayClosingOffer.getOffer().getMeta().getProductTarget(), "In-app store returned empty list of offers");
                        }
                        g gVar2 = (g) fVar;
                        gVar2.getClass();
                        offer2.getClass();
                        plusPayClosingOffer.getClass();
                        gVar2.a.d(offer2.getMeta().getSessionId(), plusPayClosingOffer.getOffer().getMeta().getProductTarget(), plusPayClosingOffer.getOffer().getMeta().getOffersBatchId(), t75.c(plusPayClosingOffer.getOffer().getPositionId()));
                        return plusPayClosingOffer2;
                    }
                    offer = bVar.j;
                    qgg.h0(obj2);
                }
                PlusPayClosingOffer plusPayClosingOffer3 = (PlusPayClosingOffer) obj2;
                bVar.j = offer;
                bVar.k = plusPayClosingOffer3;
                bVar.n = 2;
                b = b(offer, plusPayClosingOffer3, bVar);
                if (b != obj) {
                    offer2 = offer;
                    plusPayClosingOffer = plusPayClosingOffer3;
                    obj2 = b;
                    plusPayClosingOffer2 = (PlusPayClosingOffer) obj2;
                    com.yandex.plus.pay.internal.analytics.tarifficator.f fVar2 = this.c;
                    if (plusPayClosingOffer2 == null) {
                    }
                    g gVar22 = (g) fVar2;
                    gVar22.getClass();
                    offer2.getClass();
                    plusPayClosingOffer.getClass();
                    gVar22.a.d(offer2.getMeta().getSessionId(), plusPayClosingOffer.getOffer().getMeta().getProductTarget(), plusPayClosingOffer.getOffer().getMeta().getOffersBatchId(), t75.c(plusPayClosingOffer.getOffer().getPositionId()));
                    return plusPayClosingOffer2;
                }
                return obj;
            }
        }
        bVar = new b(this, cg6Var);
        Object obj22 = bVar.l;
        obj = nm6.a;
        i = bVar.n;
        if (i != 0) {
        }
        PlusPayClosingOffer plusPayClosingOffer32 = (PlusPayClosingOffer) obj22;
        bVar.j = offer;
        bVar.k = plusPayClosingOffer32;
        bVar.n = 2;
        b = b(offer, plusPayClosingOffer32, bVar);
        if (b != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x008a -> B:10:0x0090). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(PlusPayCompositeOffers.Offer offer, PlusPayClosingOffer plusPayClosingOffer, cg6 cg6Var) {
        c cVar;
        int i;
        PlusPayCompositeOffers.Offer offer2;
        PlusPayCompositeOffers plusPayCompositeOffers;
        Iterator it;
        int i2;
        PlusPayClosingOffer plusPayClosingOffer2;
        if (cg6Var instanceof c) {
            cVar = (c) cg6Var;
            int i3 = cVar.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cVar.p = i3 - Integer.MIN_VALUE;
                Object obj = cVar.n;
                nm6 nm6Var = nm6.a;
                i = cVar.p;
                if (i != 0) {
                    qgg.h0(obj);
                    offer2 = plusPayClosingOffer.getOffer();
                    plusPayCompositeOffers = new PlusPayCompositeOffers(offer.getMeta().getSessionId(), offer2.getMeta().getOffersBatchId(), t75.c(offer2), offer2.getMeta().getProductTarget());
                    it = this.b.iterator();
                    i2 = 0;
                    plusPayClosingOffer2 = plusPayClosingOffer;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = cVar.m;
                    it = cVar.l;
                    PlusPayCompositeOffers.Offer offer3 = cVar.k;
                    plusPayClosingOffer2 = cVar.j;
                    qgg.h0(obj);
                    int i5 = i4;
                    plusPayCompositeOffers = (PlusPayCompositeOffers) obj;
                    offer2 = offer3;
                    i2 = i5;
                    if (it.hasNext()) {
                        com.yandex.plus.pay.internal.feature.offers.post.a aVar = (com.yandex.plus.pay.internal.feature.offers.post.a) it.next();
                        cVar.j = plusPayClosingOffer2;
                        cVar.k = offer2;
                        cVar.l = it;
                        cVar.m = i2;
                        cVar.p = 1;
                        Object a = aVar.a(plusPayCompositeOffers, cVar);
                        if (a == nm6Var) {
                            return nm6Var;
                        }
                        int i6 = i2;
                        offer3 = offer2;
                        obj = a;
                        i4 = i6;
                        int i52 = i4;
                        plusPayCompositeOffers = (PlusPayCompositeOffers) obj;
                        offer2 = offer3;
                        i2 = i52;
                        if (it.hasNext()) {
                            List<PlusPayCompositeOffers.Offer> offers = plusPayCompositeOffers.getOffers();
                            int a2 = tah.a(v75.o(offers, 10));
                            if (a2 < 16) {
                                a2 = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(a2);
                            for (Object obj2 : offers) {
                                linkedHashMap.put(com.yandex.plus.pay.internal.utils.b.b((PlusPayCompositeOffers.Offer) obj2), obj2);
                            }
                            String b = com.yandex.plus.pay.internal.utils.b.b(offer2);
                            if (linkedHashMap.containsKey(b)) {
                                return PlusPayClosingOffer.copy$default(plusPayClosingOffer2, null, null, null, (PlusPayCompositeOffers.Offer) uah.c(b, linkedHashMap), null, null, null, null, 247, null);
                            }
                            return null;
                        }
                    }
                }
            }
        }
        cVar = new c(this, cg6Var);
        Object obj3 = cVar.n;
        nm6 nm6Var2 = nm6.a;
        i = cVar.p;
        if (i != 0) {
        }
    }
}
