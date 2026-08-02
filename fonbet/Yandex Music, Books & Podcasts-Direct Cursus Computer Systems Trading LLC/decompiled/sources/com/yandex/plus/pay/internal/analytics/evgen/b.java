package com.yandex.plus.pay.internal.analytics.evgen;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.analytics.g;
import com.yandex.plus.pay.internal.analytics.j;
import defpackage.c5b;
import defpackage.dfi;
import defpackage.eta;
import defpackage.t75;
import defpackage.v75;
import defpackage.xbk;
import defpackage.ybk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class b implements j {
    public final g a;
    public final ybk b;

    public b(g gVar, ybk ybkVar) {
        gVar.getClass();
        ybkVar.getClass();
        this.a = gVar;
        this.b = ybkVar;
    }

    public static ArrayList a(PlusPayCompositeOffers.Offer offer) {
        List<PlusPayCompositeOffers.Offer.Option> optionOffers = offer.getOptionOffers();
        ArrayList arrayList = new ArrayList(v75.o(optionOffers, 10));
        Iterator<T> it = optionOffers.iterator();
        while (it.hasNext()) {
            arrayList.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
        }
        return arrayList;
    }

    public static String b(PlusPayCompositeOffers.Offer offer) {
        String id;
        PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
        return (tariffOffer == null || (id = tariffOffer.getId()) == null) ? offer.getActiveTariffId() : id;
    }

    public final void c(com.yandex.plus.pay.api.analytics.d dVar, PlusPayCompositeOffers.Offer offer) {
        offer.getClass();
        dVar.getClass();
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
        ybkVar.b("SubscriptionOfferEvent.Success", linkedHashMap);
    }

    public final void d(PlusPayCompositeOffers plusPayCompositeOffers, com.yandex.plus.pay.api.analytics.c cVar) {
        plusPayCompositeOffers.getClass();
        cVar.getClass();
        String offersBatchId = plusPayCompositeOffers.getOffersBatchId();
        List<PlusPayCompositeOffers.Offer> offers = plusPayCompositeOffers.getOffers();
        ArrayList arrayList = new ArrayList(v75.o(offers, 10));
        Iterator<T> it = offers.iterator();
        while (it.hasNext()) {
            arrayList.add(((PlusPayCompositeOffers.Offer) it.next()).getPositionId());
        }
        c5b c5bVar = c5b.a;
        g gVar = this.a;
        String str = gVar.a;
        String str2 = gVar.b;
        xbk[] xbkVarArr = xbk.a;
        boolean z = gVar.c;
        String target = plusPayCompositeOffers.getTarget();
        Map map = cVar.f;
        ybk ybkVar = this.b;
        ybkVar.getClass();
        offersBatchId.getClass();
        c5bVar.getClass();
        str.getClass();
        str2.getClass();
        target.getClass();
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("offersBatchId", offersBatchId);
        linkedHashMap.put("offersPositionIds", arrayList);
        linkedHashMap.put("offersBatchIdCheck", "");
        linkedHashMap.put("offerPositionIdsCheck", c5bVar);
        linkedHashMap.put("clientSource", str);
        linkedHashMap.put("clientSubSource", str2);
        eta.u(linkedHashMap, "offersSource", "pay_sdk", z, "isPlusHome");
        linkedHashMap.put("paymentIntegration", "PaymentSDK");
        linkedHashMap.put("target", target);
        linkedHashMap.put("origin", map);
        linkedHashMap.put("is_tarifficator", String.valueOf(true));
        linkedHashMap.put("_meta", ybk.a(new HashMap()));
        ybkVar.b("SubscriptionOfferEvent.Load", linkedHashMap);
    }

    public final void e(PlusPayCompositeOffers.Offer offer, String str, String str2, String str3) {
        offer.getClass();
        str2.getClass();
        str3.getClass();
        String b = b(offer);
        if (b != null) {
            ArrayList a = a(offer);
            if (str == null) {
                str = "no_value";
            }
            ybk ybkVar = this.b;
            ybkVar.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("purchase_session_id", str2);
            linkedHashMap.put("product_id", b);
            dfi.u(linkedHashMap, "options_id", a, true, "is_tarifficator");
            linkedHashMap.put("order_id", str);
            linkedHashMap.put("error_code", str3);
            linkedHashMap.put("_meta", ybk.a(new HashMap()));
            ybkVar.b("Pay.Error", linkedHashMap);
        }
    }

    public final void f(PlusPayCompositeOffers.Offer offer, String str, String str2) {
        offer.getClass();
        str.getClass();
        str2.getClass();
        String b = b(offer);
        if (b != null) {
            ArrayList a = a(offer);
            ybk ybkVar = this.b;
            ybkVar.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("purchase_session_id", str2);
            linkedHashMap.put("product_id", b);
            dfi.u(linkedHashMap, "options_id", a, true, "is_tarifficator");
            linkedHashMap.put("order_id", str);
            linkedHashMap.put("_meta", ybk.a(new HashMap()));
            ybkVar.b("Pay.Finish", linkedHashMap);
        }
    }

    public final void g(PlusPayCompositeOffers.Offer offer, String str) {
        offer.getClass();
        str.getClass();
        String b = b(offer);
        if (b != null) {
            ArrayList a = a(offer);
            ybk ybkVar = this.b;
            ybkVar.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("purchase_session_id", str);
            linkedHashMap.put("product_id", b);
            linkedHashMap.put("options_id", a);
            linkedHashMap.put("is_tarifficator", String.valueOf(true));
            linkedHashMap.put("_meta", ybk.a(new HashMap()));
            ybkVar.b("Pay.Start", linkedHashMap);
        }
    }
}
