package com.yandex.plus.core.graphql;

import defpackage.fx6;
import defpackage.j8g;
import defpackage.jqi;
import defpackage.k5r;
import defpackage.kwj;
import defpackage.op;
import defpackage.pj;
import defpackage.q7g;
import defpackage.qhj;
import defpackage.r7f;
import defpackage.tj;
import defpackage.uj;
import defpackage.vgj;
import defpackage.xq0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m0 implements jqi {
    public final String a;
    public final q7g b;
    public final List c;
    public final q7g d;
    public final com.yandex.plus.core.graphql.type.s0 e;
    public final String f;
    public final q7g g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final boolean m;
    public final q7g n;
    public final q7g o;

    public m0(String str, q7g q7gVar, List list, q7g q7gVar2, com.yandex.plus.core.graphql.type.s0 s0Var, String str2, q7g q7gVar3, String str3, String str4, String str5, String str6, String str7, boolean z, q7g q7gVar4, q7g q7gVar5) {
        com.yandex.plus.core.graphql.type.q0 q0Var = com.yandex.plus.core.graphql.type.q0.MOBILE;
        str.getClass();
        list.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        this.a = str;
        this.b = q7gVar;
        this.c = list;
        this.d = q7gVar2;
        this.e = s0Var;
        this.f = str2;
        this.g = q7gVar3;
        this.h = str3;
        this.i = str4;
        this.j = str5;
        this.k = str6;
        this.l = str7;
        this.m = z;
        this.n = q7gVar4;
        this.o = q7gVar5;
    }

    @Override // defpackage.nuj
    public final qhj a() {
        com.yandex.plus.core.graphql.adapter.g0 g0Var = com.yandex.plus.core.graphql.adapter.g0.a;
        tj tjVar = uj.a;
        return new qhj(g0Var, false);
    }

    @Override // defpackage.nuj
    public final String b() {
        return "b8337f4b87970509f24f587aef7b3ed80ba8a320031e0a940e46b25d8eafdbe1";
    }

    @Override // defpackage.nuj
    public final String c() {
        return "mutation CreateInvoice($eventSessionId: String!, $tariffId: OfferNameScalar, $optionsIds: [OfferNameScalar!]!, $offerFor: OfferNameScalar, $language: TRANSITION_LANGUAGE!, $origin: String!, $paymentMethodId: String, $returnPath: URLScalar!, $source: String!, $target: String!, $templateTag: TEMPLATE_TAG!, $developerPayload: String!, $offersPositionId: String!, $offersBatchId: String!, $externalCallerPayload: String!, $silentRequested: Boolean!, $experimentFlags: [String!], $additionalOffers: CheckoutInvoiceAdditionalOffersInput) { invoice { externalCreate(eventSessionId: $eventSessionId, req: { offersPositionId: $offersPositionId offersBatchId: $offersBatchId compositeOffer: { tariffOffer: $tariffId serviceOffers: $optionsIds offerFor: $offerFor }  developerPayload: $developerPayload language: $language origin: $origin paymentMethodId: $paymentMethodId returnPath: $returnPath source: $source target: $target templateTag: $templateTag externalCallerPayload: $externalCallerPayload oneClickRequested: $silentRequested experimentFlags: $experimentFlags additionalOffers: $additionalOffers } ) { __typename ...invoice } } }  fragment invoicePrice on Price { currency amount }  fragment invoicePayment on Payment { id respCode respDesc status }  fragment invoice on Invoice { id invoiceStatus form paymentMethodId paidAmount { __typename ...invoicePrice } payment { __typename ...invoicePayment } totalAmount { __typename ...invoicePrice } invoicePollingParams { retryDelayMillis timeoutMillis } widgetQrCodeParams { widgetUrl underlineText } }";
    }

    @Override // defpackage.nuj
    public final void d(r7f r7fVar, fx6 fx6Var) {
        fx6Var.getClass();
        op opVar = com.yandex.plus.core.graphql.type.z.d;
        r7fVar.getClass();
        fx6Var.getClass();
        r7fVar.Z("eventSessionId");
        tj tjVar = uj.a;
        tjVar.a(r7fVar, fx6Var, this.a);
        q7g q7gVar = this.b;
        if (q7gVar instanceof kwj) {
            r7fVar.Z("tariffId");
            pj e = fx6Var.e(opVar);
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
        List list = this.c;
        list.getClass();
        r7fVar.m();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e2.a(r7fVar, fx6Var, it.next());
        }
        r7fVar.l();
        q7g q7gVar2 = this.d;
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
        r7fVar.m0(this.e.a);
        r7fVar.Z("origin");
        tjVar.a(r7fVar, fx6Var, this.f);
        q7g q7gVar3 = this.g;
        if (q7gVar3 instanceof kwj) {
            r7fVar.Z("paymentMethodId");
            uj.b(uj.i).d(r7fVar, fx6Var, (kwj) q7gVar3);
        }
        r7fVar.Z("returnPath");
        fx6Var.e(com.yandex.plus.core.graphql.type.z.g).a(r7fVar, fx6Var, "");
        r7fVar.Z("source");
        tjVar.a(r7fVar, fx6Var, this.h);
        r7fVar.Z("target");
        tjVar.a(r7fVar, fx6Var, this.i);
        r7fVar.Z("templateTag");
        com.yandex.plus.core.graphql.type.q0 q0Var = com.yandex.plus.core.graphql.type.q0.MOBILE;
        r7fVar.m0("MOBILE");
        r7fVar.Z("developerPayload");
        tjVar.a(r7fVar, fx6Var, "");
        r7fVar.Z("offersPositionId");
        tjVar.a(r7fVar, fx6Var, this.j);
        r7fVar.Z("offersBatchId");
        tjVar.a(r7fVar, fx6Var, this.k);
        r7fVar.Z("externalCallerPayload");
        tjVar.a(r7fVar, fx6Var, this.l);
        r7fVar.Z("silentRequested");
        uj.f.a(r7fVar, fx6Var, Boolean.valueOf(this.m));
        q7g q7gVar4 = this.n;
        if (q7gVar4 instanceof kwj) {
            r7fVar.Z("experimentFlags");
            j8g j8gVar = new j8g(tjVar, 0);
            Object obj3 = ((kwj) q7gVar4).f;
            if (obj3 == null) {
                r7fVar.B0();
            } else {
                j8gVar.a(r7fVar, fx6Var, obj3);
            }
        }
        q7g q7gVar5 = this.o;
        if (q7gVar5 instanceof kwj) {
            r7fVar.Z("additionalOffers");
            qhj qhjVar = new qhj(com.yandex.plus.core.graphql.type.adapter.a.f, false);
            Object obj4 = ((kwj) q7gVar5).f;
            if (obj4 == null) {
                r7fVar.B0();
            } else {
                qhjVar.a(r7fVar, fx6Var, obj4);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        if (!Intrinsics.d(this.a, m0Var.a) || !this.b.equals(m0Var.b) || !Intrinsics.d(this.c, m0Var.c) || !this.d.equals(m0Var.d) || this.e != m0Var.e || !Intrinsics.d(this.f, m0Var.f) || !this.g.equals(m0Var.g) || !Intrinsics.d(this.h, m0Var.h) || !Intrinsics.d(this.i, m0Var.i)) {
            return false;
        }
        com.yandex.plus.core.graphql.type.q0 q0Var = com.yandex.plus.core.graphql.type.q0.MOBILE;
        return Intrinsics.d(this.j, m0Var.j) && Intrinsics.d(this.k, m0Var.k) && this.l.equals(m0Var.l) && this.m == m0Var.m && this.n.equals(m0Var.n) && this.o.equals(m0Var.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + com.appsflyer.internal.k.a(this.n, k5r.e(k5r.c(k5r.c(k5r.c((com.yandex.plus.core.graphql.type.q0.MOBILE.hashCode() + k5r.c(k5r.c(com.appsflyer.internal.k.a(this.g, k5r.c((this.e.hashCode() + com.appsflyer.internal.k.a(this.d, k5r.d(com.appsflyer.internal.k.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31)) * 31, 31, this.f), 961), 31, this.h), 31, this.i)) * 961, 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31);
    }

    @Override // defpackage.nuj
    public final String name() {
        return "CreateInvoice";
    }

    public final String toString() {
        return "CreateInvoiceMutation(eventSessionId=" + this.a + ", tariffId=" + this.b + ", optionsIds=" + this.c + ", offerFor=" + this.d + ", language=" + this.e + ", origin=" + this.f + ", paymentMethodId=" + this.g + ", returnPath=, source=" + this.h + ", target=" + this.i + ", templateTag=" + com.yandex.plus.core.graphql.type.q0.MOBILE + ", developerPayload=, offersPositionId=" + this.j + ", offersBatchId=" + this.k + ", externalCallerPayload=" + this.l + ", silentRequested=" + this.m + ", experimentFlags=" + this.n + ", additionalOffers=" + this.o + ')';
    }
}
