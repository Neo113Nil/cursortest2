package com.yandex.plus.acquisition.sdk.pay.impl.providers;

import com.yandex.plus.acquisition.sdk.api.offers.g;
import com.yandex.plus.acquisition.sdk.api.offers.h;
import com.yandex.plus.acquisition.sdk.api.offers.i;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import defpackage.b6e;

/* loaded from: classes4.dex */
public final class d {
    public final a a;

    public d(com.yandex.plus.pay.a aVar, com.yandex.plus.acquisition.sdk.pay.impl.analytics.a aVar2, a aVar3) {
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        this.a = aVar3;
    }

    public static i a(PlusPayCompositeOffers.Offer.Vendor vendor) {
        int i = c.a[vendor.ordinal()];
        if (i == 1) {
            return com.yandex.plus.acquisition.sdk.api.offers.f.a;
        }
        if (i == 2) {
            return h.a;
        }
        if (i == 3) {
            return g.a;
        }
        b6e.s();
        return null;
    }
}
