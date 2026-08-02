package com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.session;

import com.yandex.plus.pay.api.feature.tarifficator.payment.h;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.di.n;
import com.yandex.plus.pay.internal.di.u;
import com.yandex.plus.pay.internal.feature.payment.common.e;
import com.yandex.plus.pay.internal.feature.payment.common.k;
import com.yandex.plus.pay.internal.g;
import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffer;
import com.yandex.plus.pay.internal.model.PlusPayAdditionalOffers;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.f;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.i;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j;
import defpackage.c5b;
import defpackage.xq0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements c {
    public final g a;

    public b(g gVar) {
        this.a = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v15, types: [c5b] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.session.c
    public final h a(com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar) {
        PlusPayCompositeOffers.Offer.Vendor vendor;
        Object obj;
        ?? r3;
        PlusPayCompositeOffers.Offer.Vendor vendor2;
        PlusPayAdditionalOffers additionalOffers;
        List<PlusPayAdditionalOffer> offers;
        aVar.getClass();
        j jVar = aVar.b;
        Iterator it = aVar.c.iterator();
        while (true) {
            vendor = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((j) obj).f == i.b) {
                break;
            }
        }
        j jVar2 = (j) obj;
        boolean d = Intrinsics.d(jVar2 != null ? jVar2.d : null, f.a);
        PlusPayCompositeOfferDetails plusPayCompositeOfferDetails = jVar.b;
        if (plusPayCompositeOfferDetails == null || (additionalOffers = plusPayCompositeOfferDetails.getAdditionalOffers()) == null || (offers = additionalOffers.getOffers()) == null) {
            r3 = 0;
        } else {
            r3 = new ArrayList();
            for (Object obj2 : offers) {
                if (((PlusPayAdditionalOffer) obj2).isSelected()) {
                    r3.add(obj2);
                }
            }
        }
        if (r3 == 0) {
            r3 = c5b.a;
        }
        List list = r3;
        com.yandex.plus.pay.internal.feature.payment.b h = this.a.h();
        PlusPayCompositeOffers.Offer offer = jVar.a;
        String str = jVar.c;
        if (str == null) {
            xq0.x("paymentMethodId must not be null because of check in isAvailable");
            return null;
        }
        com.yandex.plus.pay.api.analytics.d dVar = aVar.d;
        UUID uuid = aVar.a;
        Map map = aVar.e;
        com.yandex.plus.pay.internal.feature.payment.i iVar = (com.yandex.plus.pay.internal.feature.payment.i) h;
        iVar.getClass();
        offer.getClass();
        dVar.getClass();
        list.getClass();
        uuid.getClass();
        map.getClass();
        PlusPayCompositeOffers.Offer.Tariff tariffOffer = offer.getTariffOffer();
        if (tariffOffer == null || (vendor2 = tariffOffer.getVendor()) == null) {
            PlusPayCompositeOffers.Offer.Option option = (PlusPayCompositeOffers.Offer.Option) CollectionsKt.firstOrNull(offer.getOptionOffers());
            if (option != null) {
                vendor = option.getVendor();
            }
        } else {
            vendor = vendor2;
        }
        if (vendor != PlusPayCompositeOffers.Offer.Vendor.NATIVE) {
            xq0.x("Extended native payment is only for native offers");
            return null;
        }
        u uVar = (u) iVar.a;
        uVar.getClass();
        n nVar = uVar.e;
        com.yandex.plus.pay.internal.feature.payment.common.a aVar2 = (com.yandex.plus.pay.internal.feature.payment.common.a) nVar.r.getValue();
        e eVar = (e) nVar.s.getValue();
        k kVar = (k) nVar.t.getValue();
        com.yandex.plus.pay.internal.feature.cache.b c = nVar.c();
        com.yandex.plus.pay.internal.di.e eVar2 = uVar.b;
        com.yandex.plus.pay.internal.feature.payment.p000native.d dVar2 = new com.yandex.plus.pay.internal.feature.payment.p000native.d(offer, str, uuid, d, dVar, map, list, aVar2, eVar, kVar, c, (com.yandex.plus.pay.internal.analytics.j) eVar2.m.getValue(), uVar.d.b(), uVar.a.z, eVar2.e);
        com.yandex.plus.pay.log.impl.b.d(iVar.b, com.yandex.plus.pay.api.log.b.b, iVar + ".startExtendedNativePayment(" + offer + ", " + str + ", " + dVar.d() + ", " + list + ", " + uuid + ")=" + dVar2);
        return dVar2;
    }

    @Override // com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.session.c
    public final boolean b(com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar) {
        aVar.getClass();
        j jVar = aVar.b;
        return (com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.a.b(jVar.a) == PlusPayCompositeOffers.Offer.Vendor.NATIVE) && (jVar.c != null);
    }
}
