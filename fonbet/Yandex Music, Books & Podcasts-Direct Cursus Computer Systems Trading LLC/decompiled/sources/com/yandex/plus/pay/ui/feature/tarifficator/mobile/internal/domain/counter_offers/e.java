package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayCounterOffers;
import defpackage.cdk;
import defpackage.v75;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class e implements d {
    public final cdk a;
    public final com.yandex.plus.pay.api.analytics.tarifficator.e b;

    public e(cdk cdkVar, com.yandex.plus.pay.api.analytics.tarifficator.e eVar) {
        cdkVar.getClass();
        eVar.getClass();
        this.a = cdkVar;
        this.b = eVar;
    }

    public static String a(PlusPayCounterOffers plusPayCounterOffers) {
        List<PlusPayCounterOffers.CounterOffer> offers = plusPayCounterOffers.getOffers();
        ArrayList arrayList = new ArrayList(v75.o(offers, 10));
        Iterator<T> it = offers.iterator();
        while (it.hasNext()) {
            arrayList.add(((PlusPayCounterOffers.CounterOffer) it.next()).getOffer());
        }
        return ((PlusPayCompositeOffers.Offer) CollectionsKt.Q(arrayList)).getMeta().getProductTarget();
    }
}
