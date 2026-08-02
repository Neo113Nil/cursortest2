package com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.session;

import com.yandex.plus.core.benchmark.x;
import com.yandex.plus.pay.api.feature.tarifficator.payment.g;
import com.yandex.plus.pay.api.feature.tarifficator.payment.h;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.api.model.PlusPayInAppReplacementParams;
import com.yandex.plus.pay.api.model.SyncType;
import com.yandex.plus.pay.internal.di.e;
import com.yandex.plus.pay.internal.di.i;
import com.yandex.plus.pay.internal.di.l;
import com.yandex.plus.pay.internal.di.n;
import com.yandex.plus.pay.internal.di.s;
import com.yandex.plus.pay.internal.di.u;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j;
import defpackage.b6e;
import defpackage.xq0;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class a implements c {
    public final com.yandex.plus.pay.a a;

    public a(com.yandex.plus.pay.a aVar) {
        aVar.getClass();
        this.a = aVar;
    }

    @Override // com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.session.c
    public final h a(com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar) {
        PlusPayCompositeOffers.Offer.Vendor vendor;
        aVar.getClass();
        j jVar = aVar.b;
        PlusPayCompositeOffers.Offer offer = jVar.a;
        PlusPayInAppReplacementParams plusPayInAppReplacementParams = jVar.g;
        g gVar = new g(offer, plusPayInAppReplacementParams);
        com.yandex.plus.pay.api.feature.tarifficator.a aVar2 = (com.yandex.plus.pay.api.feature.tarifficator.a) ((com.yandex.plus.pay.internal.g) this.a).g.getValue();
        com.yandex.plus.pay.api.analytics.d dVar = aVar.d;
        UUID uuid = aVar.a;
        Map map = aVar.e;
        com.yandex.plus.pay.internal.feature.payment.a aVar3 = (com.yandex.plus.pay.internal.feature.payment.a) aVar2;
        aVar3.getClass();
        dVar.getClass();
        uuid.getClass();
        map.getClass();
        PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
        if (tariffOffer == null || (vendor = tariffOffer.getVendor()) == null) {
            PlusPayCompositeOffers.Offer.Option option = (PlusPayCompositeOffers.Offer.Option) CollectionsKt.firstOrNull(offer.getOptionOffers());
            if (option == null) {
                xq0.q("Offer must not be empty!");
                return null;
            }
            vendor = option.getVendor();
        }
        PlusPayCompositeOffers.Offer.Vendor vendor2 = PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY;
        if (vendor != vendor2) {
            b6e.l(vendor2, "Invalid vendor for payment request! Must be ");
            return null;
        }
        s sVar = aVar3.a;
        Set<SyncType> all = SyncType.INSTANCE.all();
        u uVar = (u) sVar;
        uVar.getClass();
        all.getClass();
        l lVar = uVar.d;
        com.yandex.plus.pay.inapp.api.b d = lVar.d();
        n nVar = uVar.e;
        com.yandex.plus.pay.internal.feature.payment.inapp.google.domain.c cVar = (com.yandex.plus.pay.internal.feature.payment.inapp.google.domain.c) nVar.l.getValue();
        com.yandex.plus.pay.internal.feature.subscription.g gVar2 = (com.yandex.plus.pay.internal.feature.subscription.g) nVar.i.getValue();
        com.yandex.plus.pay.internal.feature.cache.b c = nVar.c();
        e eVar = uVar.b;
        com.yandex.plus.pay.internal.analytics.h hVar = (com.yandex.plus.pay.internal.analytics.h) eVar.k.getValue();
        com.yandex.plus.pay.internal.analytics.j jVar2 = (com.yandex.plus.pay.internal.analytics.j) eVar.m.getValue();
        com.yandex.plus.experiments.impl.providers.h b = lVar.b();
        com.yandex.plus.pay.log.impl.b bVar = eVar.e;
        i iVar = uVar.a;
        x xVar = iVar.z;
        ((com.yandex.plus.core.dispatcher.a) iVar.q).getClass();
        com.yandex.plus.pay.internal.feature.payment.inapp.google.n nVar2 = new com.yandex.plus.pay.internal.feature.payment.inapp.google.n(offer, plusPayInAppReplacementParams, dVar, uuid, map, d, cVar, gVar2, c, hVar, jVar2, b, bVar, xVar, all, com.yandex.plus.core.dispatcher.a.e);
        com.yandex.plus.pay.log.impl.b.d(aVar3.b, com.yandex.plus.pay.api.log.b.b, aVar3 + ".startPayment(" + gVar + ", " + dVar.d() + ", " + uuid + ") = " + nVar2);
        return nVar2;
    }

    @Override // com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.session.c
    public final boolean b(com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar) {
        aVar.getClass();
        return com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.a.b(aVar.b.a) == PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY;
    }
}
