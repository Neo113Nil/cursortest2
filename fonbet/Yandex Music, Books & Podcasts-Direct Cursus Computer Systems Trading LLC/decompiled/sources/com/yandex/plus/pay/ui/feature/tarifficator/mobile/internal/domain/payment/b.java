package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.payment;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.analytics.tarifficator.n;
import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.pnb;
import defpackage.qgg;
import defpackage.su4;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class b extends aur implements Function2 {
    public final /* synthetic */ c j;
    public final /* synthetic */ PlusPayCompositeOffers.Offer k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, PlusPayCompositeOffers.Offer offer, Continuation continuation) {
        super(2, continuation);
        this.j = cVar;
        this.k = offer;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.j, this.k, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        n nVar = (n) this.j.b;
        nVar.getClass();
        PlusPayCompositeOffers.Offer offer = this.k;
        offer.getClass();
        pnb pnbVar = nVar.a;
        String sessionId = offer.getMeta().getSessionId();
        pnbVar.getClass();
        sessionId.getClass();
        LinkedHashMap r = su4.r("session_id", sessionId);
        r.put("_meta", pnb.a(new HashMap()));
        pnbVar.e("PlusPayment.Step.Payment3DS.Stop", r);
        return Unit.a;
    }
}
