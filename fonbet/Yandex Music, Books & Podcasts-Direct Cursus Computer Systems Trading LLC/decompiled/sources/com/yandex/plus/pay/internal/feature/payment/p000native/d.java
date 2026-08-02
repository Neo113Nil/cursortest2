package com.yandex.plus.pay.internal.feature.payment.p000native;

import com.yandex.plus.core.benchmark.x;
import com.yandex.plus.experiments.impl.providers.h;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.analytics.j;
import com.yandex.plus.pay.internal.feature.payment.common.a;
import com.yandex.plus.pay.internal.feature.payment.common.e;
import com.yandex.plus.pay.internal.feature.payment.common.i;
import com.yandex.plus.pay.internal.feature.payment.common.k;
import com.yandex.plus.pay.internal.feature.payment.common.r;
import com.yandex.plus.pay.internal.feature.payment.common.u;
import com.yandex.plus.pay.internal.feature.payment.common.v;
import com.yandex.plus.pay.internal.model.PlusPayInvoice;
import com.yandex.plus.pay.log.impl.b;
import defpackage.pjc;
import defpackage.rjc;
import defpackage.ub7;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes5.dex */
public final class d extends v {
    public final PlusPayCompositeOffers.Offer j;
    public final String k;
    public final boolean l;
    public final com.yandex.plus.pay.api.analytics.d m;
    public final Map n;
    public final Object o;
    public final a p;
    public final e q;
    public final k r;
    public final b s;
    public final ub7 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PlusPayCompositeOffers.Offer offer, String str, UUID uuid, boolean z, com.yandex.plus.pay.api.analytics.d dVar, Map map, List list, a aVar, e eVar, k kVar, com.yandex.plus.pay.internal.feature.cache.b bVar, j jVar, h hVar, x xVar, b bVar2) {
        super(offer, uuid, dVar, bVar, jVar, hVar, xVar);
        offer.getClass();
        str.getClass();
        uuid.getClass();
        dVar.getClass();
        map.getClass();
        aVar.getClass();
        eVar.getClass();
        kVar.getClass();
        bVar.getClass();
        jVar.getClass();
        hVar.getClass();
        bVar2.getClass();
        this.j = offer;
        this.k = str;
        this.l = z;
        this.m = dVar;
        this.n = map;
        this.o = list;
        this.p = aVar;
        this.q = eVar;
        this.r = kVar;
        this.s = bVar2;
        this.t = new ub7(12, this.h, new a(this, null));
    }

    @Override // com.yandex.plus.pay.api.feature.tarifficator.payment.h
    public final pjc a() {
        return this.t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.List] */
    @Override // com.yandex.plus.pay.internal.feature.payment.common.v
    public final Object c(u uVar) {
        return ((com.yandex.plus.pay.internal.feature.payment.common.d) this.p).a(this.j, this.m, this.k, this.n, this.l, this.o, uVar);
    }

    @Override // com.yandex.plus.pay.internal.feature.payment.common.v
    public final Object d(PlusPayInvoice plusPayInvoice, u uVar) {
        return ((i) this.q).b(plusPayInvoice, uVar);
    }

    @Override // com.yandex.plus.pay.internal.feature.payment.common.v
    public final Object e(PlusPayInvoice plusPayInvoice, rjc rjcVar, u uVar) {
        return ((r) this.r).c(plusPayInvoice, new com.yandex.plus.pay.internal.feature.payment.common.x(new b(rjcVar, null, 0), new c(rjcVar, null, 0)), uVar);
    }
}
