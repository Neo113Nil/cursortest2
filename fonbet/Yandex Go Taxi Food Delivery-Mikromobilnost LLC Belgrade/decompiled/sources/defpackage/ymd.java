package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class ymd implements ejg0 {
    public final yf70 a;
    public final List b;
    public final yf70 c;
    public final String d;
    public final yf70 e;
    public final yf70 f;
    public final yf70 g;
    public final boolean h;
    public final boolean i;
    public final yf70 j;

    public ymd(yf70 yf70Var, List list, yf70 yf70Var2, String str, yf70 yf70Var3, yf70 yf70Var4, yf70 yf70Var5, boolean z, boolean z2, yf70 yf70Var6) {
        this.a = yf70Var;
        this.b = list;
        this.c = yf70Var2;
        this.d = str;
        this.e = yf70Var3;
        this.f = yf70Var4;
        this.g = yf70Var5;
        this.h = z;
        this.i = z2;
        this.j = yf70Var6;
    }

    @Override // defpackage.fc70
    public final void a(bfx bfxVar, c cVar) {
        yf70 yf70Var = this.a;
        boolean z = yf70Var instanceof xf70;
        wkf wkfVar = rs60.a;
        if (z) {
            bfxVar.A1("tariffId");
            b70 d = cVar.d(wkfVar);
            foe foeVar = l80.a;
            if (d instanceof om60) {
                ny61.r("The adapter is already nullable");
                return;
            }
            Object obj = ((xf70) yf70Var).a;
            if (obj == null) {
                bfxVar.k2();
            } else {
                d.a(bfxVar, cVar, obj);
            }
        }
        bfxVar.A1("optionsIds");
        b70 d2 = cVar.d(wkfVar);
        foe foeVar2 = l80.a;
        bfxVar.l();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            d2.a(bfxVar, cVar, it.next());
        }
        bfxVar.j();
        yf70 yf70Var2 = this.c;
        if (yf70Var2 instanceof xf70) {
            bfxVar.A1("offerFor");
            b70 d3 = cVar.d(wkfVar);
            if (d3 instanceof om60) {
                ny61.r("The adapter is already nullable");
                return;
            }
            Object obj2 = ((xf70) yf70Var2).a;
            if (obj2 == null) {
                bfxVar.k2();
            } else {
                d3.a(bfxVar, cVar, obj2);
            }
        }
        bfxVar.A1("language");
        foe foeVar3 = l80.a;
        uga1.f(bfxVar, this.d);
        yf70 yf70Var3 = this.e;
        if (yf70Var3 instanceof xf70) {
            bfxVar.A1("target");
            l80.i.a(bfxVar, cVar, ((xf70) yf70Var3).a);
        }
        yf70 yf70Var4 = this.f;
        if (yf70Var4 instanceof xf70) {
            bfxVar.A1("storeOffersData");
            ep60 a = l80.a(g97.r);
            Object obj3 = ((xf70) yf70Var4).a;
            if (obj3 == null) {
                bfxVar.k2();
            } else {
                a.a(bfxVar, cVar, obj3);
            }
        }
        yf70 yf70Var5 = this.g;
        if (yf70Var5 instanceof xf70) {
            bfxVar.A1("experimentFlags");
            lqy lqyVar = new lqy(l80.a);
            Object obj4 = ((xf70) yf70Var5).a;
            if (obj4 == null) {
                bfxVar.k2();
            } else {
                lqyVar.a(bfxVar, cVar, obj4);
            }
        }
        bfxVar.A1("checkSilentInvoiceAvailability");
        foe foeVar4 = l80.f;
        foeVar4.a(bfxVar, cVar, Boolean.valueOf(this.h));
        bfxVar.A1("skipPaymentMethodsGroups");
        foeVar4.a(bfxVar, cVar, Boolean.valueOf(this.i));
        yf70 yf70Var6 = this.j;
        if (yf70Var6 instanceof xf70) {
            bfxVar.A1("additionalOffers");
            ep60 a2 = l80.a(g97.d);
            Object obj5 = ((xf70) yf70Var6).a;
            if (obj5 == null) {
                bfxVar.k2();
            } else {
                a2.a(bfxVar, cVar, obj5);
            }
        }
    }

    @Override // defpackage.fc70
    public final ep60 adapter() {
        return l80.a(bnd.a);
    }

    @Override // defpackage.fc70
    public final String b() {
        return "query CompositeOfferDetails($tariffId: OfferNameScalar, $optionsIds: [OfferNameScalar!]!, $offerFor: OfferNameScalar, $language: LanguageISO639Scalar!, $target: String, $storeOffersData: StoreOffersDataV2Input, $experimentFlags: [String!], $checkSilentInvoiceAvailability: Boolean!, $skipPaymentMethodsGroups: Boolean!, $additionalOffers: CheckoutAdditionalOffersInput) { compositeOfferCheckoutInfo(input: { compositeOffer: { tariffOffer: $tariffId serviceOffers: $optionsIds offerFor: $offerFor }  language: $language target: $target storeOffersDataV2: $storeOffersData checkSilentInvoiceAvailability: $checkSilentInvoiceAvailability experimentFlags: $experimentFlags checkoutAdditionalOffers: $additionalOffers } ) { __typename ...compositeOfferDetails checkoutAdditionalOffers { eventSessionId offers { __typename ...additionalOffer } passedUpsaleSteps title offerSwitchToggle { text badgeText } } paymentMethods @skip(if: $skipPaymentMethodsGroups) { groups { groupTitle groupButtons } mainPaymentMethodId pos trustServiceToken paymentButtons { __typename ... on NewCardPaymentButton { __typename ...paymentMethod } ... on NewSbpPaymentButton { __typename ...paymentMethod } ... on CardPaymentButton { __typename ...paymentMethod bankName widgetUrls { lightTheme darkTheme widgetPollingParameters { initStartMessageTimeoutMillis loadMessageTimeoutMillis } } } ... on SbpPaymentButton { __typename ...paymentMethod } ... on NewYBPaymentButton { __typename ...paymentMethod widgetOpenCardUrls { lightTheme darkTheme widgetPollingParameters { initStartMessageTimeoutMillis loadMessageTimeoutMillis } } } } promoBadges { __typename ...paymentPromoBadge } promoLegalInfo { legalText { __typename ...richText } } } } }  fragment backgroundTv on BackgroundTv { backgroundColor backgroundGradientsTv { angle colors { a hex location } relativeCenter { x y } relativeRadius { x y } type } }  fragment storePurchaseInfo on StorePurchaseInfo { googleOfferReplaceParams { purchaseToken strategy } }  fragment tariffOfferDetails on TariffOfferPurchase { title text description additionText payload image offerName tariff { name } backgroundTv { __typename ...backgroundTv } storePurchaseInfo { __typename ...storePurchaseInfo } }  fragment optionOfferDetails on OptionOfferPurchase { title text description additionText payload image offerName option { name } backgroundTv { __typename ...backgroundTv } }  fragment legalInfo on LegalInfo { text items { type key data { text link } } }  fragment offerPrice on Price { currency amount }  fragment compositeOfferDetails on CompositeOfferPurchase { tariffOffer { __typename ...tariffOfferDetails } optionOffers { __typename ...optionOfferDetails } legalInfo { __typename ...legalInfo } paymentText { firstPaymentText nextPaymentsText } successScreen { title message } invoices { totalPrice { __typename ...offerPrice } timestamp maxPoints { __typename ...offerPrice } } silentInvoiceAvailable }  fragment additionalOffer on CheckoutAdditionalOffer { additionalText benefits { text } disclaimer iconImages isAvailable isSelected offerName offersBatchId offersToReplace positionId text title upsaleStep upsaleType offerSwitchToggle { text badgeText } }  fragment colorFields on CheckoutColor { __typename ... on CheckoutRgbaColor { rgba } ... on CheckoutDesignColor { name fallback { rgba } } ... on CheckoutLinearGradientColor { angle colors { color { rgba } location } } ... on CheckoutRadialGradientColor { angle relativeCenter { x y } relativeRadius { x y } colors { color { rgba } location } } }  fragment richTextItem on CheckoutTitleItem { __typename altText key ... on CheckoutTitleColorItem { text color { light { __typename ...colorFields } dark { __typename ...colorFields } } } ... on CheckoutTitleHighlightItem { text } ... on CheckoutTitleIconItem { image { light { url } dark { url } } } ... on CheckoutTitleLinkItem { text url } ... on CheckoutTitleStrikeItem { text } }  fragment richText on CheckoutTitle { text items { __typename ...richTextItem } }  fragment paymentButtonAsset on PaymentButtonAsset { badgeText { __typename ...richText } subtitleText { __typename ...richText } }  fragment paymentMethod on PaymentButton { id title lightTheme { backgroundColor iconUrl textColor } darkTheme { backgroundColor iconUrl textColor } asset { __typename ...paymentButtonAsset } }  fragment paymentPromoBadge on PaymentPromoBadge { benefitTitle { __typename ...richText } additionalTitle { __typename ...richText } iconImage { light { url } dark { url } } backgroundColor { light { __typename ...colorFields } dark { __typename ...colorFields } } paymentMethodId }";
    }

    public final boolean c() {
        return this.h;
    }

    public final boolean d() {
        return this.i;
    }

    public final yf70 e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ymd)) {
            return false;
        }
        ymd ymdVar = (ymd) obj;
        return this.a.equals(ymdVar.a) && jl40.l(this.b, ymdVar.b) && this.c.equals(ymdVar.c) && this.d.equals(ymdVar.d) && this.e.equals(ymdVar.e) && this.f.equals(ymdVar.f) && this.g.equals(ymdVar.g) && this.h == ymdVar.h && this.i == ymdVar.i && this.j.equals(ymdVar.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + unr0.e(unr0.e(vfc.b(this.g, vfc.b(this.f, vfc.b(this.e, (this.d.hashCode() + vfc.b(this.c, unr0.c(this.a.hashCode() * 31, 31, this.b), 31)) * 31, 31), 31), 31), 31, this.h), 31, this.i);
    }

    @Override // defpackage.fc70
    public final String id() {
        return "89e9720bff9b7ec12b068a52a38024da280b95f1f5e9269fb64472c662890990";
    }

    @Override // defpackage.fc70
    public final String name() {
        return "CompositeOfferDetails";
    }

    public final String toString() {
        return "CompositeOfferDetailsQuery(tariffId=" + this.a + ", optionsIds=" + this.b + ", offerFor=" + this.c + ", language=" + ((Object) this.d) + ", target=" + this.e + ", storeOffersData=" + this.f + ", experimentFlags=" + this.g + ", checkSilentInvoiceAvailability=" + this.h + ", skipPaymentMethodsGroups=" + this.i + ", additionalOffers=" + this.j + ')';
    }
}
