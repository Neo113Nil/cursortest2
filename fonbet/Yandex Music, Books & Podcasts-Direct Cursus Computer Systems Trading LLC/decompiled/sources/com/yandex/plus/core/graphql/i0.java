package com.yandex.plus.core.graphql;

import defpackage.f1d;
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
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i0 implements s6n {
    public final String a;
    public final List b;
    public final q7g c;
    public final q7g d;
    public final q7g e;
    public final String f;
    public final q7g g;
    public final Object h;

    public i0(String str, List list, q7g q7gVar, q7g q7gVar2, q7g q7gVar3, String str2, q7g q7gVar4, Object obj) {
        str.getClass();
        list.getClass();
        str2.getClass();
        obj.getClass();
        this.a = str;
        this.b = list;
        this.c = q7gVar;
        this.d = q7gVar2;
        this.e = q7gVar3;
        this.f = str2;
        this.g = q7gVar4;
        this.h = obj;
    }

    @Override // defpackage.nuj
    public final qhj a() {
        com.yandex.plus.core.graphql.adapter.b0 b0Var = com.yandex.plus.core.graphql.adapter.b0.a;
        tj tjVar = uj.a;
        return new qhj(b0Var, false);
    }

    @Override // defpackage.nuj
    public final String b() {
        return "9dd18bce805df290d254f82b54f35d5ac341f26fb3eeff4f317a0ce57dd14b0b";
    }

    @Override // defpackage.nuj
    public final String c() {
        return "query CompositeUpsale($eventSessionId: String!, $purchasedOptionOffers: [OfferNameScalar]!, $purchasedTariffOffers: OfferNameScalar, $flags: Map_String_BooleanScalar, $testIds: [String!], $target: String!, $inAppPurchases: [InAppPurchaseInput!], $language: LanguageISO639Scalar!) { upsaleComposites(input: { eventSessionId: $eventSessionId purchasedOffers: { optionOffers: $purchasedOptionOffers tariffOffer: $purchasedTariffOffers }  experiments: { flags: $flags testIds: $testIds }  target: $target language: $language inAppPurchases: $inAppPurchases } ) { offersBatchIdUpsale eventSessionId upsales { offer { __typename ...compositeOffer } asset { titleText subtitleText benefits { text } acceptButtonText buttonText buttonAdditionalText rejectButtonText mainImageMobile mainImageTV } storePurchaseInfo { __typename ...storePurchaseInfo } } } }  fragment offerPrice on Price { currency amount }  fragment offerIntroPlan on IntroPlan { period price { __typename ...offerPrice } repetitionCount }  fragment offerIntroUntilPlan on IntroUntilPlan { price { __typename ...offerPrice } until }  fragment offerTrialPlan on TrialPlan { period }  fragment offerTrialUntilPlan on TrialUntilPlan { until }  fragment offerPlan on OfferPlanUnion { __typename ... on IntroPlan { __typename ...offerIntroPlan } ... on IntroUntilPlan { __typename ...offerIntroUntilPlan } ... on TrialPlan { __typename ...offerTrialPlan } ... on TrialUntilPlan { __typename ...offerTrialUntilPlan } }  fragment tariffOffer on TariffOffer { name title tariff { name } description text additionText commonPrice { __typename ...offerPrice } commonPeriod plans { __typename ...offerPlan } offerVendorType payload }  fragment optionOffer on OptionOffer { name title option { name } description text additionText commonPrice { __typename ...offerPrice } commonPeriod plans { __typename ...offerPlan } offerVendorType payload }  fragment legalInfo on LegalInfo { text items { type key data { text link } } }  fragment compositeOffer on CompositeOffer { positionId structureType forActiveTariff { name } tariffOffer { __typename ...tariffOffer } optionOffers { __typename ...optionOffer } legalInfo { __typename ...legalInfo } invoices { timestamp totalPrice { __typename ...offerPrice } } asset { buttonText buttonTextWithDetails subscriptionName } silentInvoiceAvailable }  fragment storePurchaseInfo on StorePurchaseInfo { googleOfferReplaceParams { purchaseToken strategy } }";
    }

    @Override // defpackage.nuj
    public final void d(r7f r7fVar, fx6 fx6Var) {
        fx6Var.getClass();
        r7fVar.getClass();
        fx6Var.getClass();
        r7fVar.Z("eventSessionId");
        tj tjVar = uj.a;
        tjVar.a(r7fVar, fx6Var, this.a);
        r7fVar.Z("purchasedOptionOffers");
        op opVar = com.yandex.plus.core.graphql.type.z.d;
        pj e = fx6Var.e(opVar);
        if (e instanceof vgj) {
            xq0.q("The adapter is already nullable");
            return;
        }
        List list = this.b;
        list.getClass();
        r7fVar.m();
        for (Object obj : list) {
            if (obj == null) {
                r7fVar.B0();
            } else {
                e.a(r7fVar, fx6Var, obj);
            }
        }
        r7fVar.l();
        q7g q7gVar = this.c;
        if (q7gVar instanceof kwj) {
            r7fVar.Z("purchasedTariffOffers");
            pj e2 = fx6Var.e(opVar);
            if (e2 instanceof vgj) {
                xq0.q("The adapter is already nullable");
                return;
            }
            Object obj2 = ((kwj) q7gVar).f;
            if (obj2 == null) {
                r7fVar.B0();
            } else {
                e2.a(r7fVar, fx6Var, obj2);
            }
        }
        q7g q7gVar2 = this.d;
        if (q7gVar2 instanceof kwj) {
            r7fVar.Z("flags");
            uj.b(uj.m).d(r7fVar, fx6Var, (kwj) q7gVar2);
        }
        q7g q7gVar3 = this.e;
        if (q7gVar3 instanceof kwj) {
            r7fVar.Z("testIds");
            j8g j8gVar = new j8g(tjVar, 0);
            Object obj3 = ((kwj) q7gVar3).f;
            if (obj3 == null) {
                r7fVar.B0();
            } else {
                j8gVar.a(r7fVar, fx6Var, obj3);
            }
        }
        r7fVar.Z("target");
        tjVar.a(r7fVar, fx6Var, this.f);
        q7g q7gVar4 = this.g;
        if (q7gVar4 instanceof kwj) {
            r7fVar.Z("inAppPurchases");
            j8g j8gVar2 = new j8g(new qhj(com.yandex.plus.core.graphql.type.adapter.a.k, false), 0);
            Object obj4 = ((kwj) q7gVar4).f;
            if (obj4 == null) {
                r7fVar.B0();
            } else {
                j8gVar2.a(r7fVar, fx6Var, obj4);
            }
        }
        r7fVar.Z("language");
        uj.g.a(r7fVar, fx6Var, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return Intrinsics.d(this.a, i0Var.a) && Intrinsics.d(this.b, i0Var.b) && this.c.equals(i0Var.c) && this.d.equals(i0Var.d) && this.e.equals(i0Var.e) && Intrinsics.d(this.f, i0Var.f) && this.g.equals(i0Var.g) && Intrinsics.d(this.h, i0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + com.appsflyer.internal.k.a(this.g, k5r.c(com.appsflyer.internal.k.a(this.e, com.appsflyer.internal.k.a(this.d, com.appsflyer.internal.k.a(this.c, k5r.d(this.a.hashCode() * 31, 31, this.b), 31), 31), 31), 31, this.f), 31);
    }

    @Override // defpackage.nuj
    public final String name() {
        return "CompositeUpsale";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompositeUpsaleQuery(eventSessionId=");
        sb.append(this.a);
        sb.append(", purchasedOptionOffers=");
        sb.append(this.b);
        sb.append(", purchasedTariffOffers=");
        sb.append(this.c);
        sb.append(", flags=");
        sb.append(this.d);
        sb.append(", testIds=");
        sb.append(this.e);
        sb.append(", target=");
        sb.append(this.f);
        sb.append(", inAppPurchases=");
        sb.append(this.g);
        sb.append(", language=");
        return f1d.j(sb, this.h, ')');
    }
}
