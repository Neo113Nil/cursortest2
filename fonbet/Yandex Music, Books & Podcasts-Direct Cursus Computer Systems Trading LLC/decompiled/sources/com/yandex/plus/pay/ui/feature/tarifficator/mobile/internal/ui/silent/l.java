package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import defpackage.bfu;
import defpackage.ot0;
import defpackage.x97;
import defpackage.xdr;
import defpackage.ydr;
import java.util.List;
import kotlin.collections.CollectionsKt;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class l extends bfu {
    public final com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a k;
    public final com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.d l;
    public final com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.d m;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success.a n;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.error.c o;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.k p;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a q;
    public final com.yandex.plus.pay.ui.core.api.common.a r;
    public final com.yandex.plus.pay.ui.core.tarifficator.api.domain.silent.a s;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.payment.c t;
    public final xdr u;
    public final xdr v;

    public l(com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a aVar, com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.offer.details.d dVar, com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.d dVar2, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success.a aVar2, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.error.c cVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.k kVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a aVar3, com.yandex.plus.pay.ui.core.api.common.a aVar4, com.yandex.plus.pay.ui.core.tarifficator.api.domain.silent.a aVar5, com.yandex.plus.pay.log.impl.b bVar, com.yandex.plus.pay.api.analytics.tarifficator.a aVar6, com.yandex.plus.pay.ui.core.mobile.domain.a aVar7) {
        aVar.getClass();
        dVar.getClass();
        dVar2.getClass();
        aVar2.getClass();
        cVar.getClass();
        kVar.getClass();
        aVar3.getClass();
        aVar4.getClass();
        aVar5.getClass();
        bVar.getClass();
        aVar6.getClass();
        aVar7.getClass();
        this.k = aVar;
        this.l = dVar;
        this.m = dVar2;
        this.n = aVar2;
        this.o = cVar;
        this.p = kVar;
        this.q = aVar3;
        this.r = aVar4;
        this.s = aVar5;
        this.t = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.payment.c(ot0.F(this), aVar6, aVar7, bVar);
        xdr a = ydr.a(g.a);
        this.u = a;
        this.v = a;
        x97.y(ot0.F(this), null, null, new j(this, null), 3);
    }

    public final void G(boolean z) {
        com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a aVar = this.k;
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a = aVar.a.a();
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j jVar = a.b;
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.i iVar = com.yandex.plus.pay.ui.core.tarifficator.api.data.common.i.a;
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j a2 = com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j.a(jVar, null, null, null, null, null, null, 95);
        List list = a.c;
        if (z) {
            list = CollectionsKt.h0(list, jVar);
        }
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a a3 = com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a.a(a, a2, list, 25);
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.b bVar = aVar.a;
        bVar.getClass();
        bVar.a = a3;
    }

    public final com.yandex.plus.pay.ui.core.internal.tarifficator.ui.loading.a a(com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j jVar) {
        PlusPayCompositeOfferDetails.PaymentText paymentText;
        PlusPayCompositeOfferDetails.PaymentText paymentText2;
        PlusPayCompositeOffers.Offer offer = jVar.a;
        PlusPayCompositeOfferDetails plusPayCompositeOfferDetails = jVar.b;
        boolean z = com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.a.b(offer) == PlusPayCompositeOffers.Offer.Vendor.NATIVE;
        com.yandex.plus.pay.ui.core.api.common.a aVar = this.r;
        String str = aVar.get(R.string.PlusPay_Payment_Loader_Processing_Title);
        String subscriptionName = offer.getAssets().getSubscriptionName();
        String firstPaymentText = (plusPayCompositeOfferDetails == null || (paymentText2 = plusPayCompositeOfferDetails.getPaymentText()) == null) ? null : paymentText2.getFirstPaymentText();
        if (firstPaymentText == null) {
            firstPaymentText = "";
        }
        String str2 = z ? firstPaymentText : null;
        String nextPaymentText = (plusPayCompositeOfferDetails == null || (paymentText = plusPayCompositeOfferDetails.getPaymentText()) == null) ? null : paymentText.getNextPaymentText();
        return new com.yandex.plus.pay.ui.core.internal.tarifficator.ui.loading.a(str, subscriptionName, str2, z ? nextPaymentText != null ? nextPaymentText : "" : null, z ? aVar.get(R.string.PlusPay_Payment_Loader_Footer) : null);
    }

    @Override // defpackage.bfu
    public final void onCleared() {
        this.t.b();
        super.onCleared();
    }
}
