package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout;

import android.net.Uri;
import android.webkit.ValueCallback;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffer;
import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffers;
import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffersKt;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.yandex.plus.pay.internal.model.PlusPayCounterOffers;
import com.yandex.plus.pay.internal.model.PlusPayCounterOffersReason;
import com.yandex.plus.pay.internal.model.PlusPayMailingAdsAgreement;
import defpackage.bqi;
import defpackage.cdk;
import defpackage.ezc;
import defpackage.f84;
import defpackage.mlr;
import defpackage.ot0;
import defpackage.ouj;
import defpackage.r2f;
import defpackage.r7o;
import defpackage.saf;
import defpackage.t7o;
import defpackage.tf6;
import defpackage.v75;
import defpackage.x97;
import defpackage.xdr;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.kinopoisk.sdk.easylogin.internal.C1020e3;
import ru.kinopoisk.sdk.easylogin.internal.C1090j3;
import ru.kinopoisk.sdk.easylogin.internal.C1104k3;
import ru.kinopoisk.sdk.easylogin.internal.Nc;

/* loaded from: classes5.dex */
public final /* synthetic */ class l extends ezc implements Function1 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x03a1, code lost:
    
        if (com.yandex.plus.home.plaque.animator.internal.utils.a.j(r0) != null) goto L109;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        PlusPayAdditionalOffers additionalOffers;
        PlusPayAdditionalOffer switchOffer;
        PlusPayCounterOffers plusPayCounterOffers;
        Object t7oVar;
        xdr xdrVar;
        Object value;
        xdr xdrVar2;
        Object value2;
        Continuation continuation = null;
        switch (this.a) {
            case 0:
                ((h0) this.receiver).getClass();
                break;
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                h0 h0Var = (h0) this.receiver;
                xdr xdrVar3 = h0Var.E;
                PlusPayMailingAdsAgreement plusPayMailingAdsAgreement = (PlusPayMailingAdsAgreement) xdrVar3.getValue();
                if (plusPayMailingAdsAgreement != null) {
                    h0Var.z.g(com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.log.a.a, "Mailing ads agreement status changed: isChecked=" + booleanValue + ", logic=" + plusPayMailingAdsAgreement.getTextLogic(), null);
                    xdrVar3.l(PlusPayMailingAdsAgreement.copy$default(plusPayMailingAdsAgreement, null, booleanValue, null, null, 13, null));
                }
                break;
            case 2:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                h0 h0Var2 = (h0) this.receiver;
                xdr xdrVar4 = h0Var2.D;
                PlusPayCompositeOfferDetails plusPayCompositeOfferDetails = (PlusPayCompositeOfferDetails) xdrVar4.getValue();
                if (plusPayCompositeOfferDetails != null && (switchOffer = PlusPayAdditionalOffersKt.getSwitchOffer((additionalOffers = plusPayCompositeOfferDetails.getAdditionalOffers()))) != null && switchOffer.isSelected() != booleanValue2) {
                    List<PlusPayAdditionalOffer> offers = additionalOffers.getOffers();
                    ArrayList arrayList = new ArrayList(v75.o(offers, 10));
                    for (PlusPayAdditionalOffer plusPayAdditionalOffer : offers) {
                        if (Intrinsics.d(plusPayAdditionalOffer.getOffer().getOfferName(), switchOffer.getOffer().getOfferName())) {
                            plusPayAdditionalOffer = PlusPayAdditionalOffer.copy$default(plusPayAdditionalOffer, null, null, false, booleanValue2, null, null, null, null, 247, null);
                        }
                        arrayList.add(plusPayAdditionalOffer);
                    }
                    PlusPayAdditionalOffers copy$default = PlusPayAdditionalOffers.copy$default(additionalOffers, null, null, arrayList, null, null, 27, null);
                    xdrVar4.l(PlusPayCompositeOfferDetails.copy$default(plusPayCompositeOfferDetails, null, null, null, null, null, null, null, null, null, null, null, null, copy$default, 4095, null));
                    h0Var2.J(h0Var2.l.a.a(), plusPayCompositeOfferDetails, PlusPayAdditionalOffersKt.toOfferDetailsConfiguration(copy$default));
                }
                break;
            case 3:
                int intValue = ((Number) obj).intValue();
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.k kVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.k) this.receiver;
                LinkedHashSet linkedHashSet = kVar.t;
                if (!linkedHashSet.contains(Integer.valueOf(intValue)) && (plusPayCounterOffers = kVar.v) != null) {
                    PlusPayCompositeOffers.Offer offer = plusPayCounterOffers.getOffers().get(intValue).getOffer();
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.d dVar = kVar.s;
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a = kVar.l.a.a();
                    PlusPayCounterOffersReason plusPayCounterOffersReason = kVar.u;
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e eVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e) dVar;
                    eVar.getClass();
                    offer.getClass();
                    plusPayCounterOffersReason.getClass();
                    cdk cdkVar = eVar.a;
                    String d = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(a.a);
                    PlusPayCompositeOffers.Offer offer2 = a.b.a;
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer2.getTariffOffer();
                    String id = tariffOffer != null ? tariffOffer.getId() : null;
                    String str = id == null ? "no_value" : id;
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers = offer2.getOptionOffers();
                    ArrayList arrayList2 = new ArrayList(v75.o(optionOffers, 10));
                    Iterator<T> it = optionOffers.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((PlusPayCompositeOffers.Offer.Option) it.next()).getId());
                    }
                    String productTarget = offer.getMeta().getProductTarget();
                    String code = plusPayCounterOffersReason.getCode();
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer2 = offer.getTariffOffer();
                    String id2 = tariffOffer2 != null ? tariffOffer2.getId() : null;
                    if (id2 == null) {
                        id2 = "no_value";
                    }
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers2 = offer.getOptionOffers();
                    ArrayList arrayList3 = new ArrayList(v75.o(optionOffers2, 10));
                    Iterator<T> it2 = optionOffers2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((PlusPayCompositeOffers.Offer.Option) it2.next()).getId());
                    }
                    cdkVar.getClass();
                    d.getClass();
                    productTarget.getClass();
                    code.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("purchase_session_id", d);
                    linkedHashMap.put("product_id", str);
                    linkedHashMap.put("options_id", arrayList2);
                    linkedHashMap.put("target", productTarget);
                    linkedHashMap.put("reason", code);
                    linkedHashMap.put("counter_offer_product_id", id2);
                    linkedHashMap.put("counter_offer_options_id", arrayList3);
                    linkedHashMap.put("counter_offer_position", String.valueOf(intValue));
                    linkedHashMap.put("_meta", cdk.c(new HashMap()));
                    cdkVar.f("CounterOffers.Offer.Shown", linkedHashMap);
                    com.yandex.plus.pay.api.analytics.tarifficator.e.d(eVar.b, offer, intValue, "counter_offer", "checkout_counter_offers_page", null);
                    linkedHashSet.add(Integer.valueOf(intValue));
                }
                break;
            case 4:
                int intValue2 = ((Number) obj).intValue();
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.k kVar2 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.k) this.receiver;
                com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a aVar = kVar2.l;
                PlusPayCounterOffers plusPayCounterOffers2 = kVar2.v;
                if (plusPayCounterOffers2 != null) {
                    PlusPayCompositeOffers.Offer offer3 = plusPayCounterOffers2.getOffers().get(intValue2).getOffer();
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.d dVar2 = kVar2.s;
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.b bVar = aVar.a;
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a2 = bVar.a();
                    PlusPayCounterOffersReason plusPayCounterOffersReason2 = kVar2.u;
                    com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e eVar2 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.e) dVar2;
                    eVar2.getClass();
                    offer3.getClass();
                    plusPayCounterOffersReason2.getClass();
                    cdk cdkVar2 = eVar2.a;
                    String d2 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(a2.a);
                    PlusPayCompositeOffers.Offer offer4 = a2.b.a;
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer3 = offer4.getTariffOffer();
                    String id3 = tariffOffer3 != null ? tariffOffer3.getId() : null;
                    String str2 = id3 == null ? "no_value" : id3;
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers3 = offer4.getOptionOffers();
                    ArrayList arrayList4 = new ArrayList(v75.o(optionOffers3, 10));
                    Iterator<T> it3 = optionOffers3.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(((PlusPayCompositeOffers.Offer.Option) it3.next()).getId());
                    }
                    String productTarget2 = offer3.getMeta().getProductTarget();
                    String code2 = plusPayCounterOffersReason2.getCode();
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer4 = offer3.getTariffOffer();
                    String id4 = tariffOffer4 != null ? tariffOffer4.getId() : null;
                    if (id4 == null) {
                        id4 = "no_value";
                    }
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers4 = offer3.getOptionOffers();
                    ArrayList arrayList5 = new ArrayList(v75.o(optionOffers4, 10));
                    Iterator<T> it4 = optionOffers4.iterator();
                    while (it4.hasNext()) {
                        arrayList5.add(((PlusPayCompositeOffers.Offer.Option) it4.next()).getId());
                    }
                    cdkVar2.getClass();
                    d2.getClass();
                    productTarget2.getClass();
                    code2.getClass();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("purchase_session_id", d2);
                    linkedHashMap2.put("product_id", str2);
                    linkedHashMap2.put("options_id", arrayList4);
                    linkedHashMap2.put("target", productTarget2);
                    linkedHashMap2.put("reason", code2);
                    linkedHashMap2.put("counter_offer_product_id", id4);
                    linkedHashMap2.put("counter_offer_options_id", arrayList5);
                    linkedHashMap2.put("counter_offer_position", String.valueOf(intValue2));
                    linkedHashMap2.put("_meta", cdk.c(new HashMap()));
                    cdkVar2.f("CounterOffers.Offer.Clicked", linkedHashMap2);
                    com.yandex.plus.pay.api.analytics.tarifficator.e.a(eVar2.b, offer3, intValue2, "counter_offer", "checkout_counter_offers_page", null);
                    com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a3 = bVar.a();
                    bVar.a = com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a.a(a3, com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j.a(a3.b, offer3, null, null, null, com.yandex.plus.pay.ui.core.tarifficator.api.data.common.d.d, null, 108), null, 29);
                    kVar2.k.b();
                }
                break;
            case 5:
                String str3 = (String) obj;
                str3.getClass();
                ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.c) this.receiver).getClass();
                try {
                    r7o r7oVar = z7o.b;
                    t7oVar = Uri.parse(str3);
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(th);
                }
                boolean z = false;
                if (z7o.a(t7oVar) == null) {
                    Uri uri = (Uri) t7oVar;
                    if (!Intrinsics.d(uri.getScheme(), "https")) {
                        com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers.a.b.getClass();
                        break;
                    }
                    z = true;
                }
                break;
            case 6:
                com.yandex.plus.pay.ui.webview.family.domain.c cVar = (com.yandex.plus.pay.ui.webview.family.domain.c) obj;
                cVar.getClass();
                com.yandex.plus.pay.ui.webview.family.ui.d dVar3 = (com.yandex.plus.pay.ui.webview.family.ui.d) this.receiver;
                com.yandex.plus.log.api.b bVar2 = dVar3.f;
                com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.b;
                if (bVar2.b(aVar2)) {
                    bVar2.c(aVar2, "FamilyContractImpl", "Handle ready message: " + cVar);
                }
                dVar3.e.c();
                break;
            case 7:
                com.yandex.plus.pay.ui.webview.family.domain.d dVar4 = (com.yandex.plus.pay.ui.webview.family.domain.d) obj;
                dVar4.getClass();
                com.yandex.plus.log.api.b bVar3 = ((com.yandex.plus.pay.ui.webview.family.ui.d) this.receiver).f;
                com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.b;
                if (bVar3.b(aVar3)) {
                    bVar3.c(aVar3, "FamilyContractImpl", "Handle ready for messaging message: " + dVar4);
                }
                break;
            case 8:
                com.yandex.plus.pay.ui.webview.family.domain.e eVar3 = (com.yandex.plus.pay.ui.webview.family.domain.e) obj;
                eVar3.getClass();
                com.yandex.plus.pay.ui.webview.family.ui.d dVar5 = (com.yandex.plus.pay.ui.webview.family.ui.d) this.receiver;
                com.yandex.plus.log.api.b bVar4 = dVar5.f;
                com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.b;
                if (bVar4.b(aVar4)) {
                    bVar4.c(aVar4, "FamilyContractImpl", "Handle send metrics message: " + eVar3);
                }
                dVar5.g.n(eVar3.a, eVar3.b);
                break;
            case 9:
                com.yandex.plus.pay.ui.webview.family.domain.b bVar5 = (com.yandex.plus.pay.ui.webview.family.domain.b) obj;
                bVar5.getClass();
                com.yandex.plus.pay.ui.webview.family.ui.d dVar6 = (com.yandex.plus.pay.ui.webview.family.ui.d) this.receiver;
                com.yandex.plus.log.api.b bVar6 = dVar6.f;
                com.yandex.plus.log.api.a aVar5 = com.yandex.plus.log.api.a.b;
                if (bVar6.b(aVar5)) {
                    bVar6.c(aVar5, "FamilyContractImpl", "Handle open sharing message: " + bVar5);
                }
                dVar6.g.i(bVar5.a, bVar5.b, bVar5.c);
                break;
            case 10:
                com.yandex.plus.pay.ui.webview.family.domain.f fVar = (com.yandex.plus.pay.ui.webview.family.domain.f) obj;
                fVar.getClass();
                com.yandex.plus.pay.ui.webview.family.ui.d dVar7 = (com.yandex.plus.pay.ui.webview.family.ui.d) this.receiver;
                com.yandex.plus.log.api.b bVar7 = dVar7.f;
                com.yandex.plus.log.api.a aVar6 = com.yandex.plus.log.api.a.b;
                if (bVar7.b(aVar6)) {
                    bVar7.c(aVar6, "FamilyContractImpl", "Handle unknown message: " + fVar);
                }
                dVar7.g.g(fVar.a);
                break;
            case 11:
                com.yandex.plus.pay.ui.webview.paymentwidget.domain.f fVar2 = (com.yandex.plus.pay.ui.webview.paymentwidget.domain.f) obj;
                fVar2.getClass();
                com.yandex.plus.pay.ui.webview.paymentwidget.ui.d dVar8 = (com.yandex.plus.pay.ui.webview.paymentwidget.ui.d) this.receiver;
                com.yandex.plus.log.api.b bVar8 = dVar8.i;
                com.yandex.plus.log.api.a aVar7 = com.yandex.plus.log.api.a.b;
                if (bVar8.b(aVar7)) {
                    bVar8.c(aVar7, "WebPaymentWidgetContractImpl", "Handle started message: " + fVar2);
                }
                saf.E(dVar8.p);
                tf6 tf6Var = dVar8.q;
                long j = dVar8.h;
                com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.d dVar9 = new com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.d(dVar8, continuation, 3);
                tf6Var.getClass();
                x97.y(tf6Var, null, null, new f84(j, dVar9, (Continuation) null), 3);
                break;
            case 12:
                com.yandex.plus.pay.ui.webview.paymentwidget.domain.c cVar2 = (com.yandex.plus.pay.ui.webview.paymentwidget.domain.c) obj;
                cVar2.getClass();
                com.yandex.plus.pay.ui.webview.paymentwidget.ui.d dVar10 = (com.yandex.plus.pay.ui.webview.paymentwidget.ui.d) this.receiver;
                com.yandex.plus.log.api.b bVar9 = dVar10.i;
                com.yandex.plus.log.api.a aVar8 = com.yandex.plus.log.api.a.b;
                if (bVar9.b(aVar8)) {
                    bVar9.c(aVar8, "WebPaymentWidgetContractImpl", "Handle loaded message: " + cVar2);
                }
                saf.E(dVar10.p);
                dVar10.e.c();
                break;
            case 13:
                com.yandex.plus.pay.ui.webview.paymentwidget.domain.g gVar = (com.yandex.plus.pay.ui.webview.paymentwidget.domain.g) obj;
                gVar.getClass();
                com.yandex.plus.pay.ui.webview.paymentwidget.ui.d dVar11 = (com.yandex.plus.pay.ui.webview.paymentwidget.ui.d) this.receiver;
                com.yandex.plus.log.api.b bVar10 = dVar11.i;
                com.yandex.plus.log.api.a aVar9 = com.yandex.plus.log.api.a.b;
                if (bVar10.b(aVar9)) {
                    bVar10.c(aVar9, "WebPaymentWidgetContractImpl", "Handle success message: " + gVar);
                }
                dVar11.j.v();
                break;
            case 14:
                com.yandex.plus.pay.ui.webview.paymentwidget.domain.i iVar = (com.yandex.plus.pay.ui.webview.paymentwidget.domain.i) obj;
                iVar.getClass();
                com.yandex.plus.pay.ui.webview.paymentwidget.ui.d dVar12 = (com.yandex.plus.pay.ui.webview.paymentwidget.ui.d) this.receiver;
                com.yandex.plus.log.api.b bVar11 = dVar12.i;
                com.yandex.plus.log.api.a aVar10 = com.yandex.plus.log.api.a.b;
                if (bVar11.b(aVar10)) {
                    bVar11.c(aVar10, "WebPaymentWidgetContractImpl", "Handle yb open card success message: " + iVar);
                }
                dVar12.j.t(iVar.a);
                break;
            case 15:
                com.yandex.plus.pay.ui.webview.paymentwidget.domain.a aVar11 = (com.yandex.plus.pay.ui.webview.paymentwidget.domain.a) obj;
                aVar11.getClass();
                com.yandex.plus.pay.ui.webview.paymentwidget.ui.d dVar13 = (com.yandex.plus.pay.ui.webview.paymentwidget.ui.d) this.receiver;
                com.yandex.plus.log.api.b bVar12 = dVar13.i;
                com.yandex.plus.log.api.a aVar12 = com.yandex.plus.log.api.a.b;
                if (bVar12.b(aVar12)) {
                    bVar12.c(aVar12, "WebPaymentWidgetContractImpl", "Handle close message: " + aVar11);
                }
                dVar13.j.e();
                break;
            case 16:
                com.yandex.plus.pay.ui.webview.paymentwidget.domain.b bVar13 = (com.yandex.plus.pay.ui.webview.paymentwidget.domain.b) obj;
                bVar13.getClass();
                String str4 = bVar13.a;
                com.yandex.plus.pay.ui.webview.paymentwidget.ui.d dVar14 = (com.yandex.plus.pay.ui.webview.paymentwidget.ui.d) this.receiver;
                com.yandex.plus.log.api.b bVar14 = dVar14.i;
                com.yandex.plus.log.api.a aVar13 = com.yandex.plus.log.api.a.e;
                if (bVar14.b(aVar13)) {
                    bVar14.c(aVar13, "WebPaymentWidgetContractImpl", ouj.k('!', "Unexpected error on web side: code=", str4));
                }
                dVar14.j.y("Unexpected error on web side: code=" + str4 + '!');
                break;
            case 17:
                com.yandex.plus.pay.ui.webview.paymentwidget.domain.d dVar15 = (com.yandex.plus.pay.ui.webview.paymentwidget.domain.d) obj;
                dVar15.getClass();
                com.yandex.plus.pay.ui.webview.paymentwidget.ui.d dVar16 = (com.yandex.plus.pay.ui.webview.paymentwidget.ui.d) this.receiver;
                com.yandex.plus.log.api.b bVar15 = dVar16.i;
                com.yandex.plus.log.api.a aVar14 = com.yandex.plus.log.api.a.b;
                if (bVar15.b(aVar14)) {
                    bVar15.c(aVar14, "WebPaymentWidgetContractImpl", "Handle need auth message: " + dVar15);
                }
                dVar16.j.h();
                break;
            case 18:
                com.yandex.plus.pay.ui.webview.paymentwidget.domain.e eVar4 = (com.yandex.plus.pay.ui.webview.paymentwidget.domain.e) obj;
                eVar4.getClass();
                com.yandex.plus.pay.ui.webview.paymentwidget.ui.d dVar17 = (com.yandex.plus.pay.ui.webview.paymentwidget.ui.d) this.receiver;
                com.yandex.plus.log.api.b bVar16 = dVar17.i;
                com.yandex.plus.log.api.a aVar15 = com.yandex.plus.log.api.a.b;
                if (bVar16.b(aVar15)) {
                    bVar16.c(aVar15, "WebPaymentWidgetContractImpl", "Handle open uri message: " + eVar4);
                }
                dVar17.j.m(eVar4.a, eVar4.b);
                break;
            case 19:
                com.yandex.plus.pay.ui.webview.paymentwidget.domain.h hVar = (com.yandex.plus.pay.ui.webview.paymentwidget.domain.h) obj;
                hVar.getClass();
                com.yandex.plus.pay.ui.webview.paymentwidget.ui.d dVar18 = (com.yandex.plus.pay.ui.webview.paymentwidget.ui.d) this.receiver;
                com.yandex.plus.log.api.b bVar17 = dVar18.i;
                com.yandex.plus.log.api.a aVar16 = com.yandex.plus.log.api.a.b;
                if (bVar17.b(aVar16)) {
                    bVar17.c(aVar16, "WebPaymentWidgetContractImpl", "Handle unknown message: " + hVar);
                }
                String str5 = dVar18.o;
                if (str5 != null) {
                    dVar18.k.b(str5, hVar.a);
                }
                break;
            case 20:
                ((ValueCallback) this.receiver).onReceiveValue((Uri[]) obj);
                break;
            default:
                String str6 = (String) obj;
                str6.getClass();
                C1090j3 c1090j3 = (C1090j3) this.receiver;
                c1090j3.getClass();
                r2f r2fVar = c1090j3.h;
                if (r2fVar == null || r2fVar.X()) {
                    String K = mlr.K(((C1020e3) ((xdr) c1090j3.f).getValue()).d, str6);
                    int length = K.length();
                    bqi bqiVar = c1090j3.f;
                    if (length >= 2) {
                        do {
                            xdrVar2 = (xdr) bqiVar;
                            value2 = xdrVar2.getValue();
                        } while (!xdrVar2.k(value2, C1020e3.a((C1020e3) value2, K, null, 6)));
                        r2f r2fVar2 = c1090j3.h;
                        if (r2fVar2 == null || r2fVar2.X()) {
                            c1090j3.h = x97.y(ot0.F(c1090j3), null, null, new C1104k3(c1090j3, K, null), 3);
                        }
                    } else {
                        do {
                            xdrVar = (xdr) bqiVar;
                            value = xdrVar.getValue();
                        } while (!xdrVar.k(value, C1020e3.a((C1020e3) value, K, Nc.None, 4)));
                    }
                }
                break;
        }
        return Unit.a;
    }
}
