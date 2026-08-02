package defpackage;

import com.yandex.plus.pay.api.analytics.PlusPayAnalyticsParams;
import com.yandex.plus.pay.api.analytics.PlusPayPaymentAnalyticsParams;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* loaded from: classes2.dex */
public final class zio implements qqx0 {
    public final dit a;
    public final zs90 b;

    public zio(dit ditVar, zs90 zs90Var) {
        this.a = ditVar;
        this.b = zs90Var;
    }

    public static ArrayList a(PlusPayCompositeOffers.Offer offer) {
        List<PlusPayCompositeOffers.Offer.Option> optionOffers = offer.getOptionOffers();
        ArrayList arrayList = new ArrayList(tcc.n(optionOffers, 10));
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

    public final void c(PlusPayPaymentAnalyticsParams plusPayPaymentAnalyticsParams, PlusPayCompositeOffers.Offer offer) {
        String offersBatchId = offer.getMeta().getOffersBatchId();
        List singletonList = Collections.singletonList(offer.getPositionId());
        dit ditVar = this.a;
        String str = ditVar.a;
        String str2 = ditVar.b;
        PayEvgenAnalytics$OffersSource payEvgenAnalytics$OffersSource = PayEvgenAnalytics$OffersSource.PaySdk;
        boolean z = ditVar.c;
        String productTarget = offer.getMeta().getProductTarget();
        Map<String, String> clientParams = plusPayPaymentAnalyticsParams.getClientParams();
        zs90 zs90Var = this.b;
        zs90Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("offersBatchId", offersBatchId);
        linkedHashMap.put("offersPositionIds", singletonList);
        linkedHashMap.put("offersBatchIdCheck", "");
        linkedHashMap.put("offerPositionIdsCheck", EmptyList.a);
        linkedHashMap.put("clientSource", str);
        linkedHashMap.put("clientSubSource", str2);
        linkedHashMap.put("offersSource", payEvgenAnalytics$OffersSource.getEventValue());
        linkedHashMap.put("isPlusHome", String.valueOf(z));
        linkedHashMap.put("paymentIntegration", "PaymentSDK");
        linkedHashMap.put("target", productTarget);
        linkedHashMap.put("origin", clientParams);
        linkedHashMap.put("is_tarifficator", String.valueOf(true));
        linkedHashMap.put("_meta", zs90.a(new HashMap()));
        zs90Var.b("SubscriptionOfferEvent.Success", linkedHashMap);
    }

    public final void d(PlusPayCompositeOffers plusPayCompositeOffers, PlusPayAnalyticsParams plusPayAnalyticsParams) {
        String offersBatchId = plusPayCompositeOffers.getOffersBatchId();
        List<PlusPayCompositeOffers.Offer> offers = plusPayCompositeOffers.getOffers();
        ArrayList arrayList = new ArrayList(tcc.n(offers, 10));
        Iterator<T> it = offers.iterator();
        while (it.hasNext()) {
            arrayList.add(((PlusPayCompositeOffers.Offer) it.next()).getPositionId());
        }
        dit ditVar = this.a;
        String str = ditVar.a;
        String str2 = ditVar.b;
        PayEvgenAnalytics$OffersSource payEvgenAnalytics$OffersSource = PayEvgenAnalytics$OffersSource.PaySdk;
        boolean z = ditVar.c;
        String target = plusPayCompositeOffers.getTarget();
        Map<String, String> clientParams = plusPayAnalyticsParams.getClientParams();
        zs90 zs90Var = this.b;
        zs90Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("offersBatchId", offersBatchId);
        linkedHashMap.put("offersPositionIds", arrayList);
        linkedHashMap.put("offersBatchIdCheck", "");
        linkedHashMap.put("offerPositionIdsCheck", EmptyList.a);
        linkedHashMap.put("clientSource", str);
        linkedHashMap.put("clientSubSource", str2);
        linkedHashMap.put("offersSource", payEvgenAnalytics$OffersSource.getEventValue());
        linkedHashMap.put("isPlusHome", String.valueOf(z));
        linkedHashMap.put("paymentIntegration", "PaymentSDK");
        linkedHashMap.put("target", target);
        linkedHashMap.put("origin", clientParams);
        linkedHashMap.put("is_tarifficator", String.valueOf(true));
        linkedHashMap.put("_meta", zs90.a(new HashMap()));
        zs90Var.b("SubscriptionOfferEvent.Load", linkedHashMap);
    }

    public final void e(PlusPayCompositeOffers.Offer offer, String str, String str2, String str3) {
        String b = b(offer);
        if (b != null) {
            ArrayList a = a(offer);
            if (str == null) {
                str = "no_value";
            }
            zs90 zs90Var = this.b;
            zs90Var.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("purchase_session_id", str2);
            linkedHashMap.put("product_id", b);
            xvz.A(linkedHashMap, "options_id", a, true, "is_tarifficator");
            linkedHashMap.put("order_id", str);
            linkedHashMap.put("error_code", str3);
            linkedHashMap.put("_meta", zs90.a(new HashMap()));
            zs90Var.b("Pay.Error", linkedHashMap);
        }
    }

    public final void f(PlusPayCompositeOffers.Offer offer, String str, String str2) {
        String b = b(offer);
        if (b != null) {
            ArrayList a = a(offer);
            zs90 zs90Var = this.b;
            zs90Var.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("purchase_session_id", str2);
            linkedHashMap.put("product_id", b);
            xvz.A(linkedHashMap, "options_id", a, true, "is_tarifficator");
            linkedHashMap.put("order_id", str);
            linkedHashMap.put("_meta", zs90.a(new HashMap()));
            zs90Var.b("Pay.Finish", linkedHashMap);
        }
    }

    public final void g(PlusPayCompositeOffers.Offer offer, String str) {
        String b = b(offer);
        if (b != null) {
            ArrayList a = a(offer);
            zs90 zs90Var = this.b;
            zs90Var.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("purchase_session_id", str);
            linkedHashMap.put("product_id", b);
            linkedHashMap.put("options_id", a);
            linkedHashMap.put("is_tarifficator", String.valueOf(true));
            linkedHashMap.put("_meta", zs90.a(new HashMap()));
            zs90Var.b("Pay.Start", linkedHashMap);
        }
    }
}
