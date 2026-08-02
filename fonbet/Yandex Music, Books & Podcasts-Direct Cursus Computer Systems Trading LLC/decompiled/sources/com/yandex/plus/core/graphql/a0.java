package com.yandex.plus.core.graphql;

import defpackage.fx6;
import defpackage.j8g;
import defpackage.k5r;
import defpackage.kwj;
import defpackage.op;
import defpackage.pj;
import defpackage.q7g;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.s6n;
import defpackage.tj;
import defpackage.uj;
import defpackage.vgj;
import defpackage.xq0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a0 implements s6n {
    public final q7g a;
    public final List b;
    public final q7g c;
    public final Object d;
    public final q7g e;
    public final q7g f;
    public final q7g g;
    public final boolean h;
    public final boolean i;
    public final q7g j;

    public a0(q7g q7gVar, List list, q7g q7gVar2, String str, q7g q7gVar3, q7g q7gVar4, q7g q7gVar5, boolean z, boolean z2, q7g q7gVar6) {
        list.getClass();
        str.getClass();
        this.a = q7gVar;
        this.b = list;
        this.c = q7gVar2;
        this.d = str;
        this.e = q7gVar3;
        this.f = q7gVar4;
        this.g = q7gVar5;
        this.h = z;
        this.i = z2;
        this.j = q7gVar6;
    }

    @Override // defpackage.nuj
    public final qhj a() {
        com.yandex.plus.core.graphql.adapter.g gVar = com.yandex.plus.core.graphql.adapter.g.a;
        tj tjVar = uj.a;
        return new qhj(gVar, false);
    }

    @Override // defpackage.nuj
    public final String b() {
        return "89e9720bff9b7ec12b068a52a38024da280b95f1f5e9269fb64472c662890990";
    }

    @Override // defpackage.nuj
    public final String c() {
        return "query CompositeOfferDetails($tariffId: OfferNameScalar, $optionsIds: [OfferNameScalar!]!, $offerFor: OfferNameScalar, $language: LanguageISO639Scalar!, $target: String, $storeOffersData: StoreOffersDataV2Input, $experimentFlags: [String!], $checkSilentInvoiceAvailability: Boolean!, $skipPaymentMethodsGroups: Boolean!, $additionalOffers: CheckoutAdditionalOffersInput) { compositeOfferCheckoutInfo(input: { compositeOffer: { tariffOffer: $tariffId serviceOffers: $optionsIds offerFor: $offerFor }  language: $language target: $target storeOffersDataV2: $storeOffersData checkSilentInvoiceAvailability: $checkSilentInvoiceAvailability experimentFlags: $experimentFlags checkoutAdditionalOffers: $additionalOffers } ) { __typename ...compositeOfferDetails checkoutAdditionalOffers { eventSessionId offers { __typename ...additionalOffer } passedUpsaleSteps title offerSwitchToggle { text badgeText } } paymentMethods @skip(if: $skipPaymentMethodsGroups) { groups { groupTitle groupButtons } mainPaymentMethodId pos trustServiceToken paymentButtons { __typename ... on NewCardPaymentButton { __typename ...paymentMethod } ... on NewSbpPaymentButton { __typename ...paymentMethod } ... on CardPaymentButton { __typename ...paymentMethod bankName widgetUrls { lightTheme darkTheme widgetPollingParameters { initStartMessageTimeoutMillis loadMessageTimeoutMillis } } } ... on SbpPaymentButton { __typename ...paymentMethod } ... on NewYBPaymentButton { __typename ...paymentMethod widgetOpenCardUrls { lightTheme darkTheme widgetPollingParameters { initStartMessageTimeoutMillis loadMessageTimeoutMillis } } } } promoBadges { __typename ...paymentPromoBadge } promoLegalInfo { legalText { __typename ...richText } } } } }  fragment backgroundTv on BackgroundTv { backgroundColor backgroundGradientsTv { angle colors { a hex location } relativeCenter { x y } relativeRadius { x y } type } }  fragment storePurchaseInfo on StorePurchaseInfo { googleOfferReplaceParams { purchaseToken strategy } }  fragment tariffOfferDetails on TariffOfferPurchase { title text description additionText payload image offerName tariff { name } backgroundTv { __typename ...backgroundTv } storePurchaseInfo { __typename ...storePurchaseInfo } }  fragment optionOfferDetails on OptionOfferPurchase { title text description additionText payload image offerName option { name } backgroundTv { __typename ...backgroundTv } }  fragment legalInfo on LegalInfo { text items { type key data { text link } } }  fragment offerPrice on Price { currency amount }  fragment compositeOfferDetails on CompositeOfferPurchase { tariffOffer { __typename ...tariffOfferDetails } optionOffers { __typename ...optionOfferDetails } legalInfo { __typename ...legalInfo } paymentText { firstPaymentText nextPaymentsText } successScreen { title message } invoices { totalPrice { __typename ...offerPrice } timestamp maxPoints { __typename ...offerPrice } } silentInvoiceAvailable }  fragment additionalOffer on CheckoutAdditionalOffer { additionalText benefits { text } disclaimer iconImages isAvailable isSelected offerName offersBatchId offersToReplace positionId text title upsaleStep upsaleType offerSwitchToggle { text badgeText } }  fragment colorFields on CheckoutColor { __typename ... on CheckoutRgbaColor { rgba } ... on CheckoutDesignColor { name fallback { rgba } } ... on CheckoutLinearGradientColor { angle colors { color { rgba } location } } ... on CheckoutRadialGradientColor { angle relativeCenter { x y } relativeRadius { x y } colors { color { rgba } location } } }  fragment richTextItem on CheckoutTitleItem { __typename altText key ... on CheckoutTitleColorItem { text color { light { __typename ...colorFields } dark { __typename ...colorFields } } } ... on CheckoutTitleHighlightItem { text } ... on CheckoutTitleIconItem { image { light { url } dark { url } } } ... on CheckoutTitleLinkItem { text url } ... on CheckoutTitleStrikeItem { text } }  fragment richText on CheckoutTitle { text items { __typename ...richTextItem } }  fragment paymentButtonAsset on PaymentButtonAsset { badgeText { __typename ...richText } subtitleText { __typename ...richText } }  fragment paymentMethod on PaymentButton { id title lightTheme { backgroundColor iconUrl textColor } darkTheme { backgroundColor iconUrl textColor } asset { __typename ...paymentButtonAsset } }  fragment paymentPromoBadge on PaymentPromoBadge { benefitTitle { __typename ...richText } additionalTitle { __typename ...richText } iconImage { light { url } dark { url } } backgroundColor { light { __typename ...colorFields } dark { __typename ...colorFields } } paymentMethodId }";
    }

    @Override // defpackage.nuj
    public final void d(r7f r7fVar, fx6 fx6Var) {
        fx6Var.getClass();
        op opVar = com.yandex.plus.core.graphql.type.z.d;
        r7fVar.getClass();
        fx6Var.getClass();
        q7g q7gVar = this.a;
        if (q7gVar instanceof kwj) {
            r7fVar.Z("tariffId");
            pj e = fx6Var.e(opVar);
            tj tjVar = uj.a;
            if (e instanceof vgj) {
                xq0.q("The adapter is already nullable");
                return;
            }
            Object obj = ((kwj) q7gVar).f;
            if (obj == null) {
                r7fVar.B0();
            } else {
                e.a(r7fVar, fx6Var, obj);
            }
        }
        r7fVar.Z("optionsIds");
        pj e2 = fx6Var.e(opVar);
        tj tjVar2 = uj.a;
        List list = this.b;
        list.getClass();
        r7fVar.m();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e2.a(r7fVar, fx6Var, it.next());
        }
        r7fVar.l();
        q7g q7gVar2 = this.c;
        if (q7gVar2 instanceof kwj) {
            r7fVar.Z("offerFor");
            pj e3 = fx6Var.e(opVar);
            if (e3 instanceof vgj) {
                xq0.q("The adapter is already nullable");
                return;
            }
            Object obj2 = ((kwj) q7gVar2).f;
            if (obj2 == null) {
                r7fVar.B0();
            } else {
                e3.a(r7fVar, fx6Var, obj2);
            }
        }
        r7fVar.Z("language");
        uj.g.a(r7fVar, fx6Var, this.d);
        q7g q7gVar3 = this.e;
        if (q7gVar3 instanceof kwj) {
            r7fVar.Z("target");
            uj.b(uj.i).d(r7fVar, fx6Var, (kwj) q7gVar3);
        }
        q7g q7gVar4 = this.f;
        if (q7gVar4 instanceof kwj) {
            r7fVar.Z("storeOffersData");
            qhj qhjVar = new qhj(com.yandex.plus.core.graphql.type.adapter.a.u, false);
            Object obj3 = ((kwj) q7gVar4).f;
            if (obj3 == null) {
                r7fVar.B0();
            } else {
                qhjVar.a(r7fVar, fx6Var, obj3);
            }
        }
        q7g q7gVar5 = this.g;
        if (q7gVar5 instanceof kwj) {
            r7fVar.Z("experimentFlags");
            j8g j8gVar = new j8g(uj.a, 0);
            Object obj4 = ((kwj) q7gVar5).f;
            if (obj4 == null) {
                r7fVar.B0();
            } else {
                j8gVar.a(r7fVar, fx6Var, obj4);
            }
        }
        r7fVar.Z("checkSilentInvoiceAvailability");
        tj tjVar3 = uj.f;
        tjVar3.a(r7fVar, fx6Var, Boolean.valueOf(this.h));
        r7fVar.Z("skipPaymentMethodsGroups");
        tjVar3.a(r7fVar, fx6Var, Boolean.valueOf(this.i));
        q7g q7gVar6 = this.j;
        if (q7gVar6 instanceof kwj) {
            r7fVar.Z("additionalOffers");
            qhj qhjVar2 = new qhj(com.yandex.plus.core.graphql.type.adapter.a.d, false);
            Object obj5 = ((kwj) q7gVar6).f;
            if (obj5 == null) {
                r7fVar.B0();
            } else {
                qhjVar2.a(r7fVar, fx6Var, obj5);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.a.equals(a0Var.a) && Intrinsics.d(this.b, a0Var.b) && this.c.equals(a0Var.c) && Intrinsics.d(this.d, a0Var.d) && this.e.equals(a0Var.e) && this.f.equals(a0Var.f) && this.g.equals(a0Var.g) && this.h == a0Var.h && this.i == a0Var.i && this.j.equals(a0Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + k5r.e(k5r.e(com.appsflyer.internal.k.a(this.g, com.appsflyer.internal.k.a(this.f, com.appsflyer.internal.k.a(this.e, (this.d.hashCode() + com.appsflyer.internal.k.a(this.c, k5r.d(this.a.hashCode() * 31, 31, this.b), 31)) * 31, 31), 31), 31), 31, this.h), 31, this.i);
    }

    @Override // defpackage.nuj
    public final String name() {
        return "CompositeOfferDetails";
    }

    public final String toString() {
        return "CompositeOfferDetailsQuery(tariffId=" + this.a + ", optionsIds=" + this.b + ", offerFor=" + this.c + ", language=" + this.d + ", target=" + this.e + ", storeOffersData=" + this.f + ", experimentFlags=" + this.g + ", checkSilentInvoiceAvailability=" + this.h + ", skipPaymentMethodsGroups=" + this.i + ", additionalOffers=" + this.j + ')';
    }
}
