package com.yandex.plus.core.graphql;

import defpackage.fx6;
import defpackage.j8g;
import defpackage.k5r;
import defpackage.kwj;
import defpackage.q7g;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.s6n;
import defpackage.tj;
import defpackage.uj;
import defpackage.vgj;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t1 implements s6n {
    public final q7g a;
    public final String b;
    public final String c;
    public final q7g d;
    public final q7g e;
    public final q7g f;
    public final com.yandex.plus.core.graphql.type.s0 g;

    public t1(q7g q7gVar, String str, String str2, q7g q7gVar2, q7g q7gVar3, q7g q7gVar4, com.yandex.plus.core.graphql.type.s0 s0Var) {
        str.getClass();
        str2.getClass();
        this.a = q7gVar;
        this.b = str;
        this.c = str2;
        this.d = q7gVar2;
        this.e = q7gVar3;
        this.f = q7gVar4;
        this.g = s0Var;
    }

    @Override // defpackage.nuj
    public final qhj a() {
        com.yandex.plus.core.graphql.adapter.f1 f1Var = com.yandex.plus.core.graphql.adapter.f1.a;
        tj tjVar = uj.a;
        return new qhj(f1Var, false);
    }

    @Override // defpackage.nuj
    public final String b() {
        return "8da49499b4c6c88f8cf9fd23433766936c0944dac335eec91a8578832ab7d1f3";
    }

    @Override // defpackage.nuj
    public final String c() {
        return "query Offers($eventSessionId: String, $eventReason: String!, $target: String!, $features: [String!], $tariffName: String, $optionNames: [String!], $language: TRANSITION_LANGUAGE!) { externalCompositeOffers(input: { eventSessionId: $eventSessionId eventReason: $eventReason filter: { target: $target features: $features tariffOfferName: $tariffName serviceOfferNames: $optionNames }  language: $language silent: true } ) { batchPositionId eventSessionId offers { __typename ...compositeOffer } } }  fragment offerPrice on Price { currency amount }  fragment offerIntroPlan on IntroPlan { period price { __typename ...offerPrice } repetitionCount }  fragment offerIntroUntilPlan on IntroUntilPlan { price { __typename ...offerPrice } until }  fragment offerTrialPlan on TrialPlan { period }  fragment offerTrialUntilPlan on TrialUntilPlan { until }  fragment offerPlan on OfferPlanUnion { __typename ... on IntroPlan { __typename ...offerIntroPlan } ... on IntroUntilPlan { __typename ...offerIntroUntilPlan } ... on TrialPlan { __typename ...offerTrialPlan } ... on TrialUntilPlan { __typename ...offerTrialUntilPlan } }  fragment tariffOffer on TariffOffer { name title tariff { name } description text additionText commonPrice { __typename ...offerPrice } commonPeriod plans { __typename ...offerPlan } offerVendorType payload }  fragment optionOffer on OptionOffer { name title option { name } description text additionText commonPrice { __typename ...offerPrice } commonPeriod plans { __typename ...offerPlan } offerVendorType payload }  fragment legalInfo on LegalInfo { text items { type key data { text link } } }  fragment compositeOffer on CompositeOffer { positionId structureType forActiveTariff { name } tariffOffer { __typename ...tariffOffer } optionOffers { __typename ...optionOffer } legalInfo { __typename ...legalInfo } invoices { timestamp totalPrice { __typename ...offerPrice } } asset { buttonText buttonTextWithDetails subscriptionName } silentInvoiceAvailable }";
    }

    @Override // defpackage.nuj
    public final void d(r7f r7fVar, fx6 fx6Var) {
        fx6Var.getClass();
        r7fVar.getClass();
        fx6Var.getClass();
        q7g q7gVar = this.a;
        if (q7gVar instanceof kwj) {
            r7fVar.Z("eventSessionId");
            uj.b(uj.i).d(r7fVar, fx6Var, (kwj) q7gVar);
        }
        r7fVar.Z("eventReason");
        tj tjVar = uj.a;
        tjVar.a(r7fVar, fx6Var, this.b);
        r7fVar.Z("target");
        tjVar.a(r7fVar, fx6Var, this.c);
        q7g q7gVar2 = this.d;
        if (q7gVar2 instanceof kwj) {
            r7fVar.Z("features");
            new vgj(new j8g(tjVar, 0)).a(r7fVar, fx6Var, ((kwj) q7gVar2).f);
        }
        q7g q7gVar3 = this.e;
        if (q7gVar3 instanceof kwj) {
            r7fVar.Z("tariffName");
            uj.b(uj.i).d(r7fVar, fx6Var, (kwj) q7gVar3);
        }
        q7g q7gVar4 = this.f;
        if (q7gVar4 instanceof kwj) {
            r7fVar.Z("optionNames");
            new vgj(new j8g(tjVar, 0)).a(r7fVar, fx6Var, ((kwj) q7gVar4).f);
        }
        r7fVar.Z("language");
        r7fVar.m0(this.g.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return this.a.equals(t1Var.a) && Intrinsics.d(this.b, t1Var.b) && Intrinsics.d(this.c, t1Var.c) && this.d.equals(t1Var.d) && this.e.equals(t1Var.e) && this.f.equals(t1Var.f) && this.g == t1Var.g;
    }

    public final int hashCode() {
        return this.g.hashCode() + com.appsflyer.internal.k.a(this.f, com.appsflyer.internal.k.a(this.e, com.appsflyer.internal.k.a(this.d, k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31);
    }

    @Override // defpackage.nuj
    public final String name() {
        return "Offers";
    }

    public final String toString() {
        return "OffersQuery(eventSessionId=" + this.a + ", eventReason=" + this.b + ", target=" + this.c + ", features=" + this.d + ", tariffName=" + this.e + ", optionNames=" + this.f + ", language=" + this.g + ')';
    }
}
