package defpackage;

import com.yandex.plus.pay.api.analytics.PlusPayAnalyticsParams;
import com.yandex.plus.pay.api.analytics.PlusPayPaymentAnalyticsParams;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* loaded from: classes2.dex */
public final class ubd0 implements dad0 {
    public final dit a;
    public final zs90 b;

    public ubd0(dit ditVar, zs90 zs90Var) {
        this.a = ditVar;
        this.b = zs90Var;
    }

    public final void a(PlusPayPaymentAnalyticsParams plusPayPaymentAnalyticsParams, PlusPayCompositeOffers.Offer offer) {
        String offersBatchId = offer.getMeta().getOffersBatchId();
        List singletonList = Collections.singletonList(offer.getPositionId());
        dit ditVar = this.a;
        String str = ditVar.a;
        String str2 = ditVar.b;
        PayEvgenAnalytics$OffersSource payEvgenAnalytics$OffersSource = PayEvgenAnalytics$OffersSource.PaySdk;
        boolean z = ditVar.c;
        String productTarget = offer.getMeta().getProductTarget();
        Map<String, String> clientParams = plusPayPaymentAnalyticsParams.getClientParams();
        String clientPlace = plusPayPaymentAnalyticsParams.getClientPlace();
        if (clientPlace == null) {
            clientPlace = "no_value";
        }
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
        linkedHashMap.put("clientPlace", clientPlace);
        linkedHashMap.put("is_tarifficator", String.valueOf(true));
        linkedHashMap.put("_meta", zs90.a(new HashMap()));
        zs90Var.b("SubscriptionOfferEvent.Click", linkedHashMap);
    }

    public final void b(PlusPayCompositeOffers.Offer offer, PlusPayAnalyticsParams plusPayAnalyticsParams) {
        String offersBatchId = offer.getMeta().getOffersBatchId();
        List singletonList = Collections.singletonList(offer.getPositionId());
        dit ditVar = this.a;
        String str = ditVar.a;
        String str2 = ditVar.b;
        PayEvgenAnalytics$OffersSource payEvgenAnalytics$OffersSource = PayEvgenAnalytics$OffersSource.PaySdk;
        boolean z = ditVar.c;
        String productTarget = offer.getMeta().getProductTarget();
        Map<String, String> clientParams = plusPayAnalyticsParams.getClientParams();
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
        zs90Var.b("SubscriptionOfferEvent.Show", linkedHashMap);
    }
}
