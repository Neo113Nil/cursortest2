package com.yandex.plus.pay.internal.analytics.evgen;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.analytics.g;
import defpackage.c5b;
import defpackage.eta;
import defpackage.t75;
import defpackage.xbk;
import defpackage.ybk;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class e implements com.yandex.plus.pay.api.analytics.a {
    public final g a;
    public final ybk b;

    public e(g gVar, ybk ybkVar) {
        gVar.getClass();
        ybkVar.getClass();
        this.a = gVar;
        this.b = ybkVar;
    }

    public final void a(com.yandex.plus.pay.api.analytics.d dVar, PlusPayCompositeOffers.Offer offer) {
        offer.getClass();
        String offersBatchId = offer.getMeta().getOffersBatchId();
        List c = t75.c(offer.getPositionId());
        c5b c5bVar = c5b.a;
        g gVar = this.a;
        String str = gVar.a;
        String str2 = gVar.b;
        xbk[] xbkVarArr = xbk.a;
        boolean z = gVar.c;
        String productTarget = offer.getMeta().getProductTarget();
        Map map = dVar.d;
        String str3 = dVar.a;
        if (str3 == null) {
            str3 = "no_value";
        }
        ybk ybkVar = this.b;
        ybkVar.getClass();
        offersBatchId.getClass();
        c.getClass();
        c5bVar.getClass();
        str.getClass();
        str2.getClass();
        productTarget.getClass();
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("offersBatchId", offersBatchId);
        linkedHashMap.put("offersPositionIds", c);
        linkedHashMap.put("offersBatchIdCheck", "");
        linkedHashMap.put("offerPositionIdsCheck", c5bVar);
        linkedHashMap.put("clientSource", str);
        linkedHashMap.put("clientSubSource", str2);
        eta.u(linkedHashMap, "offersSource", "pay_sdk", z, "isPlusHome");
        linkedHashMap.put("paymentIntegration", "PaymentSDK");
        linkedHashMap.put("target", productTarget);
        linkedHashMap.put("origin", map);
        linkedHashMap.put("clientPlace", str3);
        linkedHashMap.put("is_tarifficator", String.valueOf(true));
        linkedHashMap.put("_meta", ybk.a(new HashMap()));
        ybkVar.b("SubscriptionOfferEvent.Click", linkedHashMap);
    }

    public final void b(PlusPayCompositeOffers.Offer offer, com.yandex.plus.pay.api.analytics.c cVar) {
        offer.getClass();
        String offersBatchId = offer.getMeta().getOffersBatchId();
        List c = t75.c(offer.getPositionId());
        c5b c5bVar = c5b.a;
        g gVar = this.a;
        String str = gVar.a;
        String str2 = gVar.b;
        xbk[] xbkVarArr = xbk.a;
        boolean z = gVar.c;
        String productTarget = offer.getMeta().getProductTarget();
        Map map = cVar.f;
        ybk ybkVar = this.b;
        ybkVar.getClass();
        offersBatchId.getClass();
        c.getClass();
        c5bVar.getClass();
        str.getClass();
        str2.getClass();
        productTarget.getClass();
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("offersBatchId", offersBatchId);
        linkedHashMap.put("offersPositionIds", c);
        linkedHashMap.put("offersBatchIdCheck", "");
        linkedHashMap.put("offerPositionIdsCheck", c5bVar);
        linkedHashMap.put("clientSource", str);
        linkedHashMap.put("clientSubSource", str2);
        eta.u(linkedHashMap, "offersSource", "pay_sdk", z, "isPlusHome");
        linkedHashMap.put("paymentIntegration", "PaymentSDK");
        linkedHashMap.put("target", productTarget);
        linkedHashMap.put("origin", map);
        linkedHashMap.put("is_tarifficator", String.valueOf(true));
        linkedHashMap.put("_meta", ybk.a(new HashMap()));
        ybkVar.b("SubscriptionOfferEvent.Show", linkedHashMap);
    }
}
