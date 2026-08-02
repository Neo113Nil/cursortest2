package com.yandex.plus.pay.internal.feature.closing;

import com.yandex.plus.core.data.common.y;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.data.mb.ExternalMediaBillingApi;
import com.yandex.plus.pay.data.mb.dto.c2;
import com.yandex.plus.pay.data.mb.dto.j3;
import com.yandex.plus.pay.internal.model.PlusPayClosingOffer;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import com.yandex.plus.pay.internal.model.mappers.j;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.v75;
import defpackage.x97;
import defpackage.xq0;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class f {
    public final ExternalMediaBillingApi a;
    public final com.yandex.plus.core.locale.a b;
    public final kotlinx.coroutines.a c;
    public final com.yandex.plus.pay.log.impl.b d;

    public f(ExternalMediaBillingApi externalMediaBillingApi, com.yandex.plus.core.locale.a aVar, kotlinx.coroutines.a aVar2, com.yandex.plus.pay.log.impl.b bVar) {
        externalMediaBillingApi.getClass();
        aVar.getClass();
        aVar2.getClass();
        bVar.getClass();
        this.a = externalMediaBillingApi;
        this.b = aVar;
        this.c = aVar2;
        this.d = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ArrayList arrayList, String str, String str2, cg6 cg6Var) {
        e eVar;
        int i;
        if (cg6Var instanceof e) {
            eVar = (e) cg6Var;
            int i2 = eVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.l = i2 - Integer.MIN_VALUE;
                e eVar2 = eVar;
                Object obj = eVar2.j;
                nm6 nm6Var = nm6.a;
                i = eVar2.l;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.b bVar = new com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.b(7, this, arrayList, str, str2, (Continuation) null);
                    eVar2.l = 1;
                    obj = x97.V(this.c, bVar, eVar2);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                com.yandex.plus.pay.data.mb.dto.f fVar = (com.yandex.plus.pay.data.mb.dto.f) ((com.yandex.plus.pay.common.api.utils.b) obj).a;
                fVar.getClass();
                c2 c2Var = fVar.d;
                y yVar = new y(c2Var.a, c2Var.b);
                PlusPayRichText a = j.a(fVar.e);
                j3 j3Var = fVar.f;
                PlusPayRichText a2 = j3Var == null ? j.a(j3Var) : null;
                PlusPayCompositeOffers.Offer a3 = com.yandex.plus.pay.internal.model.mappers.b.a(fVar.g, fVar.a, fVar.c, fVar.b);
                List<com.yandex.plus.pay.data.mb.dto.d> list = fVar.h;
                ArrayList arrayList2 = new ArrayList(v75.o(list, 10));
                for (com.yandex.plus.pay.data.mb.dto.d dVar : list) {
                    PlusPayRichText a4 = j.a(dVar.a);
                    PlusPayRichText a5 = j.a(dVar.b);
                    c2 c2Var2 = dVar.c;
                    y yVar2 = new y(c2Var2.a, c2Var2.b);
                    j3 j3Var2 = dVar.d;
                    arrayList2.add(new PlusPayClosingOffer.ClosingOfferAsset(a4, yVar2, a5, j3Var2 != null ? j.a(j3Var2) : null));
                }
                String str3 = fVar.i;
                String str4 = fVar.j;
                j3 j3Var3 = fVar.k;
                return new PlusPayClosingOffer(yVar, a, a2, a3, arrayList2, str3, str4, j3Var3 != null ? j.a(j3Var3) : null);
            }
        }
        eVar = new e(this, cg6Var);
        e eVar22 = eVar;
        Object obj2 = eVar22.j;
        nm6 nm6Var2 = nm6.a;
        i = eVar22.l;
        if (i != 0) {
        }
        com.yandex.plus.pay.data.mb.dto.f fVar2 = (com.yandex.plus.pay.data.mb.dto.f) ((com.yandex.plus.pay.common.api.utils.b) obj2).a;
        fVar2.getClass();
        c2 c2Var3 = fVar2.d;
        y yVar3 = new y(c2Var3.a, c2Var3.b);
        PlusPayRichText a6 = j.a(fVar2.e);
        j3 j3Var4 = fVar2.f;
        if (j3Var4 == null) {
        }
        PlusPayCompositeOffers.Offer a32 = com.yandex.plus.pay.internal.model.mappers.b.a(fVar2.g, fVar2.a, fVar2.c, fVar2.b);
        List<com.yandex.plus.pay.data.mb.dto.d> list2 = fVar2.h;
        ArrayList arrayList22 = new ArrayList(v75.o(list2, 10));
        while (r1.hasNext()) {
        }
        String str32 = fVar2.i;
        String str42 = fVar2.j;
        j3 j3Var32 = fVar2.k;
        return new PlusPayClosingOffer(yVar3, a6, a2, a32, arrayList22, str32, str42, j3Var32 != null ? j.a(j3Var32) : null);
    }
}
