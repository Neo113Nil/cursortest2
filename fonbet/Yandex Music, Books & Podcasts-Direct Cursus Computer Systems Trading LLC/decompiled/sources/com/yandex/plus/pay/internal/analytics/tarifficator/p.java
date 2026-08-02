package com.yandex.plus.pay.internal.analytics.tarifficator;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import defpackage.pnb;
import defpackage.su4;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class p implements com.yandex.plus.pay.api.analytics.tarifficator.b {
    public final pnb a;

    public p(pnb pnbVar) {
        pnbVar.getClass();
        this.a = pnbVar;
    }

    public final void a(PlusPayCompositeOffers.Offer offer) {
        offer.getClass();
        String sessionId = offer.getMeta().getSessionId();
        pnb pnbVar = this.a;
        pnbVar.getClass();
        sessionId.getClass();
        LinkedHashMap r = su4.r("session_id", sessionId);
        r.put("_meta", pnb.a(new HashMap()));
        pnbVar.e("PlusPayment.Step.CardSelecting.Stop", r);
    }
}
