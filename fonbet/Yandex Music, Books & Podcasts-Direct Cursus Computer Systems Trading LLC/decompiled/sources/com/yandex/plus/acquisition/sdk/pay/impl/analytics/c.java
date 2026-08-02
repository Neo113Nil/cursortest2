package com.yandex.plus.acquisition.sdk.pay.impl.analytics;

import com.yandex.plus.acquisition.sdk.pay.common.api.k;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.g;
import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class c extends aur implements Function2 {
    public final /* synthetic */ e j;
    public final /* synthetic */ PlusPayCompositeOffers.Offer k;
    public final /* synthetic */ k l;
    public final /* synthetic */ com.yandex.plus.acquisition.sdk.pay.common.api.a m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, PlusPayCompositeOffers.Offer offer, k kVar, com.yandex.plus.acquisition.sdk.pay.common.api.a aVar, Continuation continuation) {
        super(2, continuation);
        this.j = eVar;
        this.k = offer;
        this.l = kVar;
        this.m = aVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.j, this.k, this.l, this.m, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        e eVar = this.j;
        com.yandex.plus.pay.a aVar = eVar.a;
        com.yandex.plus.pay.api.analytics.a b = ((g) aVar).b();
        b bVar = eVar.c;
        k kVar = this.l;
        String str = kVar.c;
        com.yandex.plus.acquisition.sdk.pay.common.api.a aVar2 = this.m;
        String str2 = aVar2.b;
        Map map = aVar2.c;
        bVar.getClass();
        com.yandex.plus.pay.api.analytics.d a = b.a(str2, map);
        PlusPayCompositeOffers.Offer offer = this.k;
        ((com.yandex.plus.pay.internal.analytics.evgen.e) b).a(a, offer);
        ((g) aVar).g().c(offer, kVar.a, kVar.c, kVar.b, aVar2.b, aVar2.c);
        return Unit.a;
    }
}
