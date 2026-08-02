package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.f;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.i;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.d;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.common.di.k;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.e;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.common.g;
import defpackage.bfu;
import defpackage.c5b;
import defpackage.noo;
import defpackage.tao;
import defpackage.ym5;
import java.util.LinkedHashMap;
import java.util.UUID;

/* loaded from: classes5.dex */
public final class c extends bfu {
    public final com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a k;
    public final e l;
    public final g m;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a n;
    public final k o;
    public final noo p;
    public final com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.performance.c q;
    public boolean r;

    public c(d dVar, com.yandex.plus.pay.ui.core.tarifficator.api.domain.common.a aVar, e eVar, g gVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation.a aVar2, k kVar, k kVar2, noo nooVar, com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.performance.c cVar) {
        aVar.getClass();
        eVar.getClass();
        gVar.getClass();
        aVar2.getClass();
        cVar.getClass();
        this.k = aVar;
        this.l = eVar;
        this.m = gVar;
        this.n = aVar2;
        this.o = kVar;
        this.p = nooVar;
        this.q = cVar;
        UUID uuid = dVar.a;
        PlusPayCompositeOffers.Offer offer = dVar.b;
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.d dVar2 = com.yandex.plus.pay.ui.core.tarifficator.api.data.common.d.a;
        boolean z = false;
        boolean z2 = dVar.f == com.yandex.plus.pay.ui.feature.tarifficator.mobile.api.b.a;
        boolean z3 = com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.a.b(offer) == PlusPayCompositeOffers.Offer.Vendor.NATIVE;
        if (com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.a.b(offer) == PlusPayCompositeOffers.Offer.Vendor.GOOGLE_PLAY && ((Boolean) kVar2.invoke()).booleanValue()) {
            z = true;
        }
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar3 = new com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a(uuid, new j(offer, null, null, f.a, dVar2, (z2 && (z3 || z)) ? i.b : i.a, null), c5b.a, dVar.c, dVar.d);
        com.yandex.plus.pay.ui.core.tarifficator.api.data.common.b bVar = aVar.a;
        bVar.getClass();
        bVar.a = aVar3;
        ym5 ym5Var = new ym5(4, this);
        tao taoVar = nooVar.b;
        taoVar.getClass();
        ((LinkedHashMap) taoVar.b).put("SAVED_BUNDLE", ym5Var);
    }
}
