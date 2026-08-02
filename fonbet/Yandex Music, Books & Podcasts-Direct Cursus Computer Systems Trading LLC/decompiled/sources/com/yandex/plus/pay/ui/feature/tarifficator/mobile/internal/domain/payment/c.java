package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.payment;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.analytics.tarifficator.n;
import defpackage.cq4;
import defpackage.l8j;
import defpackage.pnb;
import defpackage.rar;
import defpackage.su4;
import defpackage.x97;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class c {
    public final cq4 a;
    public final com.yandex.plus.pay.api.analytics.tarifficator.a b;
    public final com.yandex.plus.pay.ui.core.mobile.domain.a c;
    public final com.yandex.plus.pay.log.impl.b d;
    public PlusPayCompositeOffers.Offer e;
    public rar f;

    public c(cq4 cq4Var, com.yandex.plus.pay.api.analytics.tarifficator.a aVar, com.yandex.plus.pay.ui.core.mobile.domain.a aVar2, com.yandex.plus.pay.log.impl.b bVar) {
        aVar.getClass();
        aVar2.getClass();
        bVar.getClass();
        this.a = cq4Var;
        this.b = aVar;
        this.c = aVar2;
        this.d = bVar;
    }

    public final void a(PlusPayCompositeOffers.Offer offer, String str) {
        offer.getClass();
        str.getClass();
        this.e = offer;
        n nVar = (n) this.b;
        nVar.getClass();
        pnb pnbVar = nVar.a;
        String sessionId = offer.getMeta().getSessionId();
        pnbVar.getClass();
        sessionId.getClass();
        LinkedHashMap r = su4.r("session_id", sessionId);
        r.put("_meta", pnb.a(new HashMap()));
        pnbVar.e("PlusPayment.Step.Payment3DS.Start", r);
        this.f = x97.y(this.a, null, null, new a(this, str, null), 3);
    }

    public final void b() {
        PlusPayCompositeOffers.Offer offer = this.e;
        if (offer != null) {
            rar rarVar = this.f;
            if (rarVar != null) {
                rarVar.g(null);
            }
            x97.y(this.a, l8j.c, null, new b(this, offer, null), 2);
            this.e = null;
        }
    }
}
