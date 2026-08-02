package com.yandex.plus.pay.internal.analytics.tarifficator;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import defpackage.pnb;
import defpackage.v75;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class t implements j {
    public final pnb a;
    public final com.yandex.plus.pay.internal.di.o b;
    public final String c;
    public final String d;

    public t(pnb pnbVar, com.yandex.plus.pay.internal.di.o oVar, String str, String str2) {
        pnbVar.getClass();
        str.getClass();
        this.a = pnbVar;
        this.b = oVar;
        this.c = str;
        this.d = str2;
    }

    public final void a(PlusPayCompositeOffers plusPayCompositeOffers) {
        String sessionId = plusPayCompositeOffers.getSessionId();
        String target = plusPayCompositeOffers.getTarget();
        String offersBatchId = plusPayCompositeOffers.getOffersBatchId();
        List<PlusPayCompositeOffers.Offer> offers = plusPayCompositeOffers.getOffers();
        ArrayList arrayList = new ArrayList(v75.o(offers, 10));
        Iterator<T> it = offers.iterator();
        while (it.hasNext()) {
            arrayList.add(((PlusPayCompositeOffers.Offer) it.next()).getPositionId());
        }
        this.a.d(sessionId, target, offersBatchId, arrayList);
    }
}
