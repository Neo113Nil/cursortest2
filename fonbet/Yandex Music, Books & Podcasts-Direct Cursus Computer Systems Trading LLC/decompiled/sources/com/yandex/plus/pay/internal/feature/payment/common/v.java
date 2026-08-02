package com.yandex.plus.pay.internal.feature.payment.common;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayInvoice;
import defpackage.clc;
import defpackage.eno;
import defpackage.rjc;
import defpackage.ub7;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes5.dex */
public abstract class v implements com.yandex.plus.pay.api.feature.tarifficator.payment.h {
    public final PlusPayCompositeOffers.Offer a;
    public final com.yandex.plus.pay.api.analytics.d b;
    public final com.yandex.plus.pay.internal.feature.cache.b c;
    public final com.yandex.plus.pay.internal.analytics.j d;
    public final com.yandex.plus.experiments.impl.providers.h e;
    public final com.yandex.plus.core.benchmark.x f;
    public final com.yandex.plus.core.benchmark.l g;
    public final ub7 h;
    public final String i;

    public v(PlusPayCompositeOffers.Offer offer, UUID uuid, com.yandex.plus.pay.api.analytics.d dVar, com.yandex.plus.pay.internal.feature.cache.b bVar, com.yandex.plus.pay.internal.analytics.j jVar, com.yandex.plus.experiments.impl.providers.h hVar, com.yandex.plus.core.benchmark.x xVar) {
        offer.getClass();
        uuid.getClass();
        dVar.getClass();
        bVar.getClass();
        jVar.getClass();
        hVar.getClass();
        this.a = offer;
        this.b = dVar;
        this.c = bVar;
        this.d = jVar;
        this.e = hVar;
        this.f = xVar;
        this.g = ((com.yandex.plus.core.benchmark.c) xVar).b("Payment.Native.Success");
        this.h = new ub7(12, new clc(new eno(new u(this, null)), new s(this, null)), new t(this, null));
        String uuid2 = uuid.toString();
        uuid2.getClass();
        String upperCase = uuid2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        this.i = upperCase;
    }

    public static final void b(v vVar, PlusPayInvoice plusPayInvoice) {
        com.yandex.plus.pay.internal.analytics.j jVar = vVar.d;
        PlusPayCompositeOffers.Offer offer = vVar.a;
        com.yandex.plus.pay.internal.analytics.evgen.b bVar = (com.yandex.plus.pay.internal.analytics.evgen.b) jVar;
        bVar.c(vVar.b, offer);
        bVar.f(offer, plusPayInvoice.getId(), vVar.i);
    }

    public abstract Object c(u uVar);

    public abstract Object d(PlusPayInvoice plusPayInvoice, u uVar);

    public abstract Object e(PlusPayInvoice plusPayInvoice, rjc rjcVar, u uVar);
}
