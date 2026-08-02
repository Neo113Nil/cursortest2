package com.yandex.plus.pay.internal.feature.presale;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.analytics.tarifficator.l;
import com.yandex.plus.pay.internal.model.PlusPayPresale;
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
public final class c implements d {
    public final f a;
    public final List b;
    public final com.yandex.plus.pay.internal.analytics.tarifficator.k c;

    public c(f fVar, List list, com.yandex.plus.pay.internal.analytics.tarifficator.k kVar) {
        fVar.getClass();
        list.getClass();
        kVar.getClass();
        this.a = fVar;
        this.b = list;
        this.c = kVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008c, code lost:
    
        if (r8 != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
    
        if (r8 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.yandex.plus.pay.internal.feature.presale.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusPayCompositeOffers.Offer offer, cg6 cg6Var) {
        a aVar;
        int i;
        PlusPayPresale plusPayPresale;
        if (cg6Var instanceof a) {
            aVar = (a) cg6Var;
            int i2 = aVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.m = i2 - Integer.MIN_VALUE;
                Object obj = aVar.k;
                Object obj2 = nm6.a;
                i = aVar.m;
                if (i != 0) {
                    ArrayList q = su4.q(obj);
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
                    aVar.m = 1;
                    obj = this.a.a(q, productTarget, sessionId, aVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        plusPayPresale = aVar.j;
                        qgg.h0(obj);
                        PlusPayPresale plusPayPresale2 = (PlusPayPresale) obj;
                        com.yandex.plus.pay.internal.analytics.tarifficator.k kVar = this.c;
                        if (plusPayPresale2 == null) {
                            l lVar = (l) kVar;
                            lVar.getClass();
                            plusPayPresale.getClass();
                            lVar.a.c(plusPayPresale.getSuggestedOffer().getMeta().getSessionId(), onb.Presale, plusPayPresale.getSuggestedOffer().getMeta().getProductTarget(), "In-app store returned empty list of offers");
                        }
                        l lVar2 = (l) kVar;
                        lVar2.getClass();
                        plusPayPresale.getClass();
                        lVar2.a.d(plusPayPresale.getSuggestedOffer().getMeta().getSessionId(), plusPayPresale.getSuggestedOffer().getMeta().getProductTarget(), plusPayPresale.getSuggestedOffer().getMeta().getOffersBatchId(), t75.c(plusPayPresale.getSuggestedOffer().getPositionId()));
                        return plusPayPresale2;
                    }
                    qgg.h0(obj);
                }
                plusPayPresale = (PlusPayPresale) obj;
                aVar.j = plusPayPresale;
                aVar.m = 2;
                obj = b(plusPayPresale, aVar);
            }
        }
        aVar = new a(this, cg6Var);
        Object obj3 = aVar.k;
        Object obj22 = nm6.a;
        i = aVar.m;
        if (i != 0) {
        }
        plusPayPresale = (PlusPayPresale) obj3;
        aVar.j = plusPayPresale;
        aVar.m = 2;
        obj3 = b(plusPayPresale, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0088 -> B:10:0x008b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(PlusPayPresale plusPayPresale, cg6 cg6Var) {
        b bVar;
        int i;
        PlusPayCompositeOffers.Offer offer;
        PlusPayCompositeOffers plusPayCompositeOffers;
        Iterator it;
        PlusPayPresale plusPayPresale2;
        int i2;
        if (cg6Var instanceof b) {
            bVar = (b) cg6Var;
            int i3 = bVar.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar.p = i3 - Integer.MIN_VALUE;
                Object obj = bVar.n;
                nm6 nm6Var = nm6.a;
                i = bVar.p;
                if (i != 0) {
                    qgg.h0(obj);
                    PlusPayCompositeOffers.Offer suggestedOffer = plusPayPresale.getSuggestedOffer();
                    offer = suggestedOffer;
                    plusPayCompositeOffers = new PlusPayCompositeOffers(suggestedOffer.getMeta().getSessionId(), suggestedOffer.getMeta().getOffersBatchId(), t75.c(suggestedOffer), suggestedOffer.getMeta().getProductTarget());
                    it = this.b.iterator();
                    plusPayPresale2 = plusPayPresale;
                    i2 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = bVar.m;
                    it = bVar.l;
                    offer = bVar.k;
                    PlusPayPresale plusPayPresale3 = bVar.j;
                    qgg.h0(obj);
                    plusPayPresale2 = plusPayPresale3;
                    plusPayCompositeOffers = (PlusPayCompositeOffers) obj;
                    if (it.hasNext()) {
                        com.yandex.plus.pay.internal.feature.offers.post.a aVar = (com.yandex.plus.pay.internal.feature.offers.post.a) it.next();
                        bVar.j = plusPayPresale2;
                        bVar.k = offer;
                        bVar.l = it;
                        bVar.m = i2;
                        bVar.p = 1;
                        obj = aVar.a(plusPayCompositeOffers, bVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        plusPayCompositeOffers = (PlusPayCompositeOffers) obj;
                        if (it.hasNext()) {
                            List<PlusPayCompositeOffers.Offer> offers = plusPayCompositeOffers.getOffers();
                            int a = tah.a(v75.o(offers, 10));
                            if (a < 16) {
                                a = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                            for (Object obj2 : offers) {
                                linkedHashMap.put(com.yandex.plus.pay.internal.utils.b.b((PlusPayCompositeOffers.Offer) obj2), obj2);
                            }
                            String b = com.yandex.plus.pay.internal.utils.b.b(offer);
                            if (linkedHashMap.containsKey(b)) {
                                return PlusPayPresale.copy$default(plusPayPresale2, (PlusPayCompositeOffers.Offer) uah.c(b, linkedHashMap), 0L, null, 6, null);
                            }
                            return null;
                        }
                    }
                }
            }
        }
        bVar = new b(this, cg6Var);
        Object obj3 = bVar.n;
        nm6 nm6Var2 = nm6.a;
        i = bVar.p;
        if (i != 0) {
        }
    }
}
