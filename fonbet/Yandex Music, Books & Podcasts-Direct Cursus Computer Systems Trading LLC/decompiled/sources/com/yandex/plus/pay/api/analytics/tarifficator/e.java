package com.yandex.plus.pay.api.analytics.tarifficator;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.analytics.tarifficator.s;
import defpackage.e5b;
import java.util.Map;

/* loaded from: classes5.dex */
public interface e {
    static void a(e eVar, PlusPayCompositeOffers.Offer offer, int i, String str, String str2, String str3) {
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        eVar.c(offer, i, str, str2, str3, e5bVar);
    }

    static void d(e eVar, PlusPayCompositeOffers.Offer offer, int i, String str, String str2, String str3) {
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        eVar.b(offer, i, str, str2, str3, e5bVar);
    }

    default void b(PlusPayCompositeOffers.Offer offer, int i, String str, String str2, String str3, Map map) {
        offer.getClass();
        map.getClass();
        ((s) this).f(offer.getMeta().getSessionId(), offer.getMeta().getOffersBatchId(), offer.getPositionId(), i, str, str2, str3, map);
    }

    default void c(PlusPayCompositeOffers.Offer offer, int i, String str, String str2, String str3, Map map) {
        offer.getClass();
        map.getClass();
        ((s) this).e(offer.getMeta().getSessionId(), offer.getMeta().getOffersBatchId(), offer.getPositionId(), i, str, str2, str3, map);
    }
}
