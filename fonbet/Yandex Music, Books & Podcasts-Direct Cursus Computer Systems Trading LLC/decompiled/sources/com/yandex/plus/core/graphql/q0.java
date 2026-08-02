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
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q0 implements jqi {
    public final String a;
    public final q7g b;
    public final List c;
    public final q7g d;
    public final com.yandex.plus.core.graphql.type.s0 e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final q7g l;

    public q0(String str, q7g q7gVar, List list, q7g q7gVar2, com.yandex.plus.core.graphql.type.s0 s0Var, String str2, String str3, String str4, String str5, String str6, String str7, q7g q7gVar3) {
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
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = str6;
        this.k = str7;
        this.l = q7gVar3;
    }

    @Override // defpackage.nuj
    public final qhj a() {
        com.yandex.plus.core.graphql.adapter.j0 j0Var = com.yandex.plus.core.graphql.adapter.j0.a;
        tj tjVar = uj.a;
        return new qhj(j0Var, false);
    }

    @Override // defpackage.nuj
    public final String b() {
        return "0c92e20359e92ad941b68687edc36bbef8e0f4b24b1ef24b110841abe17e4fc1";
    }

    @Override // defpackage.nuj
    public final String c() {
        return "mutation CreateSilentInvoice($eventSessionId: String!, $tariffId: OfferNameScalar, $optionsIds: [OfferNameScalar!]!, $offerFor: OfferNameScalar, $language: TRANSITION_LANGUAGE!, $origin: String!, $returnPath: URLScalar!, $source: String!, $target: String!, $templateTag: TEMPLATE_TAG!, $developerPayload: String!, $offersPositionId: String!, $offersBatchId: String!, $externalCallerPayload: String!, $experimentFlags: [String!]) { invoice { externalCreate(eventSessionId: $eventSessionId, req: { offersPositionId: $offersPositionId offersBatchId: $offersBatchId compositeOffer: { tariffOffer: $tariffId serviceOffers: $optionsIds offerFor: $offerFor }  developerPayload: $developerPayload language: $language origin: $origin returnPath: $returnPath source: $source target: $target templateTag: $templateTag silent: true externalCallerPayload: $externalCallerPayload oneClickRequested: true experimentFlags: $experimentFlags } ) { __typename ...invoice } } }  fragment invoicePrice on Price { currency amount }  fragment invoicePayment on Payment { id respCode respDesc status }  fragment invoice on Invoice { id invoiceStatus form paymentMethodId paidAmount { __typename ...invoicePrice } payment { __typename ...invoicePayment } totalAmount { __typename ...invoicePrice } invoicePollingParams { retryDelayMillis timeoutMillis } widgetQrCodeParams { widgetUrl underlineText } }";
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
            new vgj(fx6Var.e(opVar)).a(r7fVar, fx6Var, ((kwj) q7gVar).f);
        }
        r7fVar.Z("optionsIds");
        pj e = fx6Var.e(opVar);
        List list = this.c;
        list.getClass();
        r7fVar.m();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e.a(r7fVar, fx6Var, it.next());
        }
        r7fVar.l();
        q7g q7gVar2 = this.d;
        if (q7gVar2 instanceof kwj) {
            r7fVar.Z("offerFor");
            new vgj(fx6Var.e(opVar)).a(r7fVar, fx6Var, ((kwj) q7gVar2).f);
        }
        r7fVar.Z("language");
        r7fVar.m0(this.e.a);
        r7fVar.Z("origin");
        tjVar.a(r7fVar, fx6Var, this.f);
        r7fVar.Z("returnPath");
        fx6Var.e(com.yandex.plus.core.graphql.type.z.g).a(r7fVar, fx6Var, "");
        r7fVar.Z("source");
        tjVar.a(r7fVar, fx6Var, this.g);
        r7fVar.Z("target");
        tjVar.a(r7fVar, fx6Var, this.h);
        r7fVar.Z("templateTag");
        com.yandex.plus.core.graphql.type.q0 q0Var = com.yandex.plus.core.graphql.type.q0.MOBILE;
        r7fVar.m0("MOBILE");
        r7fVar.Z("developerPayload");
        tjVar.a(r7fVar, fx6Var, "");
        r7fVar.Z("offersPositionId");
        tjVar.a(r7fVar, fx6Var, this.i);
        r7fVar.Z("offersBatchId");
        tjVar.a(r7fVar, fx6Var, this.j);
        r7fVar.Z("externalCallerPayload");
        tjVar.a(r7fVar, fx6Var, this.k);
        q7g q7gVar3 = this.l;
        if (q7gVar3 instanceof kwj) {
            r7fVar.Z("experimentFlags");
            new vgj(new j8g(tjVar, 0)).a(r7fVar, fx6Var, ((kwj) q7gVar3).f);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        if (!Intrinsics.d(this.a, q0Var.a) || !this.b.equals(q0Var.b) || !Intrinsics.d(this.c, q0Var.c) || !this.d.equals(q0Var.d) || this.e != q0Var.e || !Intrinsics.d(this.f, q0Var.f) || !Intrinsics.d(this.g, q0Var.g) || !Intrinsics.d(this.h, q0Var.h)) {
            return false;
        }
        com.yandex.plus.core.graphql.type.q0 q0Var2 = com.yandex.plus.core.graphql.type.q0.MOBILE;
        return Intrinsics.d(this.i, q0Var.i) && Intrinsics.d(this.j, q0Var.j) && this.k.equals(q0Var.k) && this.l.equals(q0Var.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + k5r.c(k5r.c(k5r.c((com.yandex.plus.core.graphql.type.q0.MOBILE.hashCode() + k5r.c(k5r.c(k5r.c((this.e.hashCode() + com.appsflyer.internal.k.a(this.d, k5r.d(com.appsflyer.internal.k.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31)) * 31, 961, this.f), 31, this.g), 31, this.h)) * 961, 31, this.i), 31, this.j), 31, this.k);
    }

    @Override // defpackage.nuj
    public final String name() {
        return "CreateSilentInvoice";
    }

    public final String toString() {
        return "CreateSilentInvoiceMutation(eventSessionId=" + this.a + ", tariffId=" + this.b + ", optionsIds=" + this.c + ", offerFor=" + this.d + ", language=" + this.e + ", origin=" + this.f + ", returnPath=, source=" + this.g + ", target=" + this.h + ", templateTag=" + com.yandex.plus.core.graphql.type.q0.MOBILE + ", developerPayload=, offersPositionId=" + this.i + ", offersBatchId=" + this.j + ", externalCallerPayload=" + this.k + ", experimentFlags=" + this.l + ')';
    }
}
