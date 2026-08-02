package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayLegalInfo;
import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffer;
import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffers;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.yandex.plus.pay.internal.model.PlusPayMailingAdsAgreement;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import defpackage.aur;
import defpackage.bca;
import defpackage.cdk;
import defpackage.dfi;
import defpackage.e5b;
import defpackage.mm6;
import defpackage.n8g;
import defpackage.nm6;
import defpackage.pnb;
import defpackage.qgg;
import defpackage.su4;
import defpackage.t75;
import defpackage.u75;
import defpackage.v75;
import defpackage.xck;
import defpackage.xq0;
import defpackage.yck;
import defpackage.zck;
import defpackage.zsd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class f0 extends aur implements Function2 {
    public int j;
    public final /* synthetic */ h0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(h0 h0Var, Continuation continuation) {
        super(2, continuation);
        this.k = h0Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new f0(this.k, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object g0;
        h0 h0Var;
        com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a aVar;
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.g gVar;
        Object obj2;
        PlusPayCompositeOfferDetails plusPayCompositeOfferDetails;
        com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.c cVar;
        List<PlusPayAdditionalOffer> offers;
        List<PlusPayCompositeOfferDetails.PaymentMethodsGroup> paymentMethodsGroups;
        int i;
        Iterator it;
        String str;
        PlusPayRichText subtitleText;
        PlusPayRichText badgeText;
        PlusPayRichText promoLegalInfo;
        PlusPayLegalInfo legalInfo;
        PlusPayRichText fromLegalInfo;
        h0 h0Var2 = this.k;
        com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a aVar2 = h0Var2.l;
        com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.a aVar3 = h0Var2.w;
        nm6 nm6Var = nm6.a;
        int i2 = this.j;
        if (i2 == 0) {
            qgg.h0(obj);
            bca bcaVar = new bca(new com.yandex.plus.home.graphql.plusstate.e(h0Var2.K, 6), 18);
            this.j = 1;
            g0 = zsd.g0(bcaVar, this);
            if (g0 == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i2 != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
            g0 = obj;
        }
        com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.g gVar2 = (com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.g) g0;
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a = aVar2.a.a();
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j jVar = a.b;
        PlusPayCompositeOffers.Offer offer = jVar.a;
        PlusPayMailingAdsAgreement plusPayMailingAdsAgreement = (PlusPayMailingAdsAgreement) h0Var2.E.getValue();
        PlusPayCompositeOfferDetails plusPayCompositeOfferDetails2 = (PlusPayCompositeOfferDetails) h0Var2.D.getValue();
        com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.c cVar2 = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.c) aVar3;
        cVar2.getClass();
        zck a2 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.a(offer);
        String str2 = jVar.c;
        n8g b = t75.b();
        PlusPayCompositeOfferDetails plusPayCompositeOfferDetails3 = jVar.b;
        if (plusPayCompositeOfferDetails3 != null && (legalInfo = plusPayCompositeOfferDetails3.getLegalInfo()) != null && (fromLegalInfo = PlusPayRichText.INSTANCE.fromLegalInfo(legalInfo)) != null) {
            b.add(com.yandex.plus.pay.ui.common.api.utils.b.b(fromLegalInfo));
        }
        if (plusPayCompositeOfferDetails3 != null && (promoLegalInfo = plusPayCompositeOfferDetails3.getPromoLegalInfo()) != null) {
            if (!((Boolean) cVar2.d.invoke()).booleanValue()) {
                promoLegalInfo = null;
            }
            if (promoLegalInfo != null) {
                b.add(com.yandex.plus.pay.ui.common.api.utils.b.b(promoLegalInfo));
            }
        }
        n8g a3 = t75.a(b);
        String str3 = "payment_option";
        if (a2 != null) {
            plusPayCompositeOfferDetails = plusPayCompositeOfferDetails2;
            cdk cdkVar = cVar2.a;
            String d = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(a.a);
            PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
            String id = tariffOffer != null ? tariffOffer.getId() : null;
            String str4 = id == null ? "no_value" : id;
            h0Var = h0Var2;
            List<PlusPayCompositeOffers.Offer.Option> optionOffers = offer.getOptionOffers();
            aVar = aVar2;
            gVar = gVar2;
            ArrayList arrayList = new ArrayList(v75.o(optionOffers, 10));
            Iterator<T> it2 = optionOffers.iterator();
            while (it2.hasNext()) {
                arrayList.add(((PlusPayCompositeOffers.Offer.Option) it2.next()).getId());
            }
            String str5 = str2 == null ? "no_value" : str2;
            PlusPayMailingAdsAgreement.Status defaultAgreementStatus = plusPayMailingAdsAgreement != null ? plusPayMailingAdsAgreement.getDefaultAgreementStatus() : null;
            int i3 = defaultAgreementStatus == null ? -1 : com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.b.a[defaultAgreementStatus.ordinal()];
            xck xckVar = i3 != 1 ? i3 != 2 ? xck.NotShown : xck.Refuse : xck.Allow;
            PlusPayMailingAdsAgreement.TextLogic textLogic = plusPayMailingAdsAgreement != null ? plusPayMailingAdsAgreement.getTextLogic() : null;
            int i4 = textLogic == null ? -1 : com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.b.b[textLogic.ordinal()];
            yck yckVar = i4 != 1 ? i4 != 2 ? yck.Unknown : yck.Inverted : yck.Direct;
            cdkVar.getClass();
            d.getClass();
            a3.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("purchase_session_id", d);
            linkedHashMap.put("product_id", str4);
            dfi.u(linkedHashMap, "options_id", arrayList, true, "is_tarifficator");
            linkedHashMap.put("payment_option", a2.a);
            linkedHashMap.put("payment_method_id", str5);
            linkedHashMap.put("mailing_ads_agreement_status", xckVar.a);
            linkedHashMap.put("mailing_ads_agreement_text_logic", yckVar.a);
            linkedHashMap.put("legal_text", a3);
            obj2 = "_meta";
            linkedHashMap.put(obj2, cdk.c(new HashMap()));
            cdkVar.f("Checkout.Shown", linkedHashMap);
            cVar = cVar2;
        } else {
            h0Var = h0Var2;
            aVar = aVar2;
            gVar = gVar2;
            obj2 = "_meta";
            plusPayCompositeOfferDetails = plusPayCompositeOfferDetails2;
            cVar = cVar2;
        }
        com.yandex.plus.pay.internal.analytics.tarifficator.q qVar = (com.yandex.plus.pay.internal.analytics.tarifficator.q) cVar.b;
        qVar.getClass();
        pnb pnbVar = qVar.a;
        String sessionId = offer.getMeta().getSessionId();
        pnbVar.getClass();
        sessionId.getClass();
        String str6 = "session_id";
        LinkedHashMap r = su4.r("session_id", sessionId);
        r.put(obj2, pnb.a(new HashMap()));
        pnbVar.e("PlusPayment.Step.Checkout.Start", r);
        if (!gVar.c.isEmpty() && plusPayCompositeOfferDetails != null && (paymentMethodsGroups = plusPayCompositeOfferDetails.getPaymentMethodsGroups()) != null) {
            Iterator it3 = paymentMethodsGroups.iterator();
            while (it3.hasNext()) {
                PlusPayCompositeOfferDetails.PaymentMethodsGroup paymentMethodsGroup = (PlusPayCompositeOfferDetails.PaymentMethodsGroup) it3.next();
                com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a aVar4 = aVar;
                com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a4 = aVar4.a.a();
                com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.c cVar3 = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.c) aVar3;
                cdk cdkVar2 = cVar3.a;
                paymentMethodsGroup.getClass();
                com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j jVar2 = a4.b;
                UUID uuid = a4.a;
                List<PlusPayCompositeOfferDetails.PaymentMethod> paymentMethods = paymentMethodsGroup.getPaymentMethods();
                Iterator it4 = it3;
                ArrayList arrayList2 = new ArrayList(v75.o(paymentMethods, 10));
                Iterator<T> it5 = paymentMethods.iterator();
                while (it5.hasNext()) {
                    arrayList2.add(((PlusPayCompositeOfferDetails.PaymentMethod) it5.next()).getId());
                }
                PlusPayCompositeOffers.Offer offer2 = jVar2.a;
                zck a5 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.a(offer2);
                cdk cdkVar3 = cVar3.a;
                String d2 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(uuid);
                PlusPayCompositeOffers.Offer.Tariff tariffOffer2 = offer2.getTariffOffer();
                String id2 = tariffOffer2 != null ? tariffOffer2.getId() : null;
                String str7 = id2 == null ? "no_value" : id2;
                List<PlusPayCompositeOffers.Offer.Option> optionOffers2 = offer2.getOptionOffers();
                ArrayList arrayList3 = new ArrayList(v75.o(optionOffers2, 10));
                Iterator<T> it6 = optionOffers2.iterator();
                while (it6.hasNext()) {
                    arrayList3.add(((PlusPayCompositeOffers.Offer.Option) it6.next()).getId());
                }
                String str8 = "new";
                if (arrayList2.isEmpty()) {
                    i = 0;
                } else {
                    Iterator it7 = arrayList2.iterator();
                    i = 0;
                    while (it7.hasNext()) {
                        ArrayList arrayList4 = arrayList3;
                        Iterator it8 = it7;
                        if (!kotlin.text.c.v((String) it7.next(), "new", false) && (i = i + 1) < 0) {
                            u75.m();
                            throw null;
                        }
                        it7 = it8;
                        arrayList3 = arrayList4;
                    }
                }
                cdkVar3.d(d2, str7, arrayList3, i > 0, arrayList2);
                ArrayList arrayList5 = arrayList2;
                Iterator it9 = paymentMethodsGroup.getPaymentMethods().iterator();
                while (it9.hasNext()) {
                    PlusPayCompositeOfferDetails.PaymentMethod paymentMethod = (PlusPayCompositeOfferDetails.PaymentMethod) it9.next();
                    PlusPayCompositeOfferDetails.PaymentMethod.ButtonAsset buttonAsset = paymentMethod.getButtonAsset();
                    Iterator it10 = it9;
                    String d3 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(uuid);
                    PlusPayCompositeOffers.Offer.Tariff tariffOffer3 = offer2.getTariffOffer();
                    String id3 = tariffOffer3 != null ? tariffOffer3.getId() : null;
                    UUID uuid2 = uuid;
                    String str9 = id3 == null ? "no_value" : id3;
                    List<PlusPayCompositeOffers.Offer.Option> optionOffers3 = offer2.getOptionOffers();
                    ArrayList arrayList6 = arrayList5;
                    String str10 = str6;
                    String str11 = str3;
                    ArrayList arrayList7 = new ArrayList(v75.o(optionOffers3, 10));
                    Iterator<T> it11 = optionOffers3.iterator();
                    while (it11.hasNext()) {
                        arrayList7.add(((PlusPayCompositeOffers.Offer.Option) it11.next()).getId());
                    }
                    boolean z = !kotlin.text.c.v(paymentMethod.getId(), str8, false);
                    String id4 = paymentMethod.getId();
                    String b2 = (buttonAsset == null || (badgeText = buttonAsset.getBadgeText()) == null) ? null : com.yandex.plus.pay.ui.common.api.utils.b.b(badgeText);
                    String str12 = b2 == null ? "no_value" : b2;
                    String b3 = (buttonAsset == null || (subtitleText = buttonAsset.getSubtitleText()) == null) ? null : com.yandex.plus.pay.ui.common.api.utils.b.b(subtitleText);
                    String str13 = b3 == null ? "no_value" : b3;
                    cdkVar2.getClass();
                    d3.getClass();
                    id4.getClass();
                    String str14 = str8;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("purchase_session_id", d3);
                    linkedHashMap2.put("product_id", str9);
                    dfi.u(linkedHashMap2, "options_id", arrayList7, true, "is_tarifficator");
                    linkedHashMap2.put("card_linked", String.valueOf(z));
                    linkedHashMap2.put("payment_method_id", id4);
                    linkedHashMap2.put("promo_text", str12);
                    linkedHashMap2.put("info_text", str13);
                    linkedHashMap2.put(obj2, cdk.c(new HashMap()));
                    cdkVar2.f("PaymentMethod.Shown", linkedHashMap2);
                    str8 = str14;
                    it9 = it10;
                    str6 = str10;
                    uuid = uuid2;
                    arrayList5 = arrayList6;
                    str3 = str11;
                }
                ArrayList arrayList8 = arrayList5;
                String str15 = str6;
                UUID uuid3 = uuid;
                String str16 = str3;
                List<PlusPayCompositeOfferDetails.PaymentPromo> paymentPromos = paymentMethodsGroup.getPaymentPromos();
                if (!((Boolean) cVar3.d.invoke()).booleanValue()) {
                    paymentPromos = null;
                }
                if (paymentPromos != null) {
                    Iterator it12 = paymentPromos.iterator();
                    while (it12.hasNext()) {
                        PlusPayCompositeOfferDetails.PaymentPromo paymentPromo = (PlusPayCompositeOfferDetails.PaymentPromo) it12.next();
                        if (a5 != null) {
                            String d4 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.analytics.b.d(uuid3);
                            PlusPayCompositeOffers.Offer.Tariff tariffOffer4 = offer2.getTariffOffer();
                            String id5 = tariffOffer4 != null ? tariffOffer4.getId() : null;
                            if (id5 == null) {
                                id5 = "no_value";
                            }
                            List<PlusPayCompositeOffers.Offer.Option> optionOffers4 = offer2.getOptionOffers();
                            it = it12;
                            ArrayList arrayList9 = new ArrayList(v75.o(optionOffers4, 10));
                            Iterator<T> it13 = optionOffers4.iterator();
                            while (it13.hasNext()) {
                                arrayList9.add(((PlusPayCompositeOffers.Offer.Option) it13.next()).getId());
                            }
                            String paymentMethodId = paymentPromo.getPaymentMethodId();
                            if (paymentMethodId == null) {
                                paymentMethodId = "no_value";
                            }
                            String b4 = com.yandex.plus.pay.ui.common.api.utils.b.b(paymentPromo.getBenefitTitle());
                            PlusPayRichText additionalTitle = paymentPromo.getAdditionalTitle();
                            String b5 = additionalTitle != null ? com.yandex.plus.pay.ui.common.api.utils.b.b(additionalTitle) : null;
                            if (b5 == null) {
                                b5 = "no_value";
                            }
                            LinkedHashMap t = com.appsflyer.internal.k.t(cdkVar2, d4, "purchase_session_id", d4);
                            t.put("product_id", id5);
                            dfi.u(t, "options_id", arrayList9, true, "is_tarifficator");
                            str = str16;
                            t.put(str, a5.a);
                            t.put("payment_method_id", paymentMethodId);
                            t.put("title_text", b4);
                            t.put("subtitle_text", b5);
                            t.put(obj2, cdk.c(new HashMap()));
                            cdkVar2.f("Checkout.PromoCard.Shown", t);
                        } else {
                            it = it12;
                            str = str16;
                        }
                        str16 = str;
                        it12 = it;
                    }
                }
                com.yandex.plus.pay.internal.analytics.tarifficator.q qVar2 = (com.yandex.plus.pay.internal.analytics.tarifficator.q) cVar3.b;
                qVar2.getClass();
                pnb pnbVar2 = qVar2.a;
                String sessionId2 = offer2.getMeta().getSessionId();
                pnbVar2.getClass();
                sessionId2.getClass();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                linkedHashMap3.put(str15, sessionId2);
                linkedHashMap3.put("payment_methods_id", arrayList8);
                linkedHashMap3.put(obj2, pnb.a(new HashMap()));
                pnbVar2.e("PlusPayment.PaymentMethods.Show", linkedHashMap3);
                str6 = str15;
                str3 = str16;
                it3 = it4;
                aVar = aVar4;
            }
        }
        PlusPayAdditionalOffers additionalOffers = plusPayCompositeOfferDetails != null ? plusPayCompositeOfferDetails.getAdditionalOffers() : null;
        if (additionalOffers != null && (offers = additionalOffers.getOffers()) != null) {
            int i5 = 0;
            for (Object obj3 : offers) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    u75.n();
                    throw null;
                }
                PlusPayAdditionalOffer plusPayAdditionalOffer = (PlusPayAdditionalOffer) obj3;
                h0 h0Var3 = h0Var;
                if (h0Var3.I.add(plusPayAdditionalOffer.getOffer().getOfferName())) {
                    com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.c cVar4 = (com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout.c) aVar3;
                    cVar4.getClass();
                    com.yandex.plus.pay.api.analytics.tarifficator.e eVar = cVar4.c;
                    String sessionId3 = offer.getMeta().getSessionId();
                    String offersBatchId = plusPayAdditionalOffer.getOffer().getOffersBatchId();
                    String positionId = plusPayAdditionalOffer.getOffer().getPositionId();
                    e5b e5bVar = e5b.a;
                    e5bVar.getClass();
                    ((com.yandex.plus.pay.internal.analytics.tarifficator.s) eVar).f(sessionId3, offersBatchId, positionId, i5, "onsale_offer", "checkout_onsale_page", null, e5bVar);
                }
                i5 = i6;
                h0Var = h0Var3;
            }
        }
        return Unit.a;
    }
}
