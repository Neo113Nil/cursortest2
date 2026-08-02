package com.yandex.plus.pay.internal.feature.presale;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.data.mb.ExternalMediaBillingApi;
import com.yandex.plus.pay.data.mb.dto.j3;
import com.yandex.plus.pay.data.mb.dto.y2;
import com.yandex.plus.pay.internal.model.PlusPayPresale;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.x97;
import defpackage.xq0;
import java.util.ArrayList;
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
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
                    com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.b bVar = new com.yandex.plus.home.feature.webviews.internal.purchase.button.delegates.sdk.home.b(8, this, arrayList, str, str2, (Continuation) null);
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
                y2 y2Var = (y2) ((com.yandex.plus.pay.common.api.utils.b) obj).a;
                y2Var.getClass();
                PlusPayCompositeOffers.Offer a = com.yandex.plus.pay.internal.model.mappers.b.a(y2Var.m, y2Var.k, y2Var.l, y2Var.j);
                long j = y2Var.f;
                PlusPayRichText a2 = com.yandex.plus.pay.internal.model.mappers.j.a(y2Var.a);
                j3 j3Var = y2Var.b;
                return new PlusPayPresale(a, j, new PlusPayPresale.Assets(a2, j3Var == null ? com.yandex.plus.pay.internal.model.mappers.j.a(j3Var) : null, com.yandex.plus.pay.internal.model.mappers.j.a(y2Var.c), com.yandex.plus.pay.internal.model.mappers.j.a(y2Var.d), com.yandex.plus.pay.internal.model.mappers.j.a(y2Var.e), com.yandex.plus.pay.internal.model.mappers.j.a(y2Var.h), com.yandex.plus.pay.internal.model.mappers.j.a(y2Var.g), com.yandex.plus.pay.internal.model.mappers.j.a(y2Var.i)));
            }
        }
        eVar = new e(this, cg6Var);
        e eVar22 = eVar;
        Object obj2 = eVar22.j;
        nm6 nm6Var2 = nm6.a;
        i = eVar22.l;
        if (i != 0) {
        }
        y2 y2Var2 = (y2) ((com.yandex.plus.pay.common.api.utils.b) obj2).a;
        y2Var2.getClass();
        PlusPayCompositeOffers.Offer a3 = com.yandex.plus.pay.internal.model.mappers.b.a(y2Var2.m, y2Var2.k, y2Var2.l, y2Var2.j);
        long j2 = y2Var2.f;
        PlusPayRichText a22 = com.yandex.plus.pay.internal.model.mappers.j.a(y2Var2.a);
        j3 j3Var2 = y2Var2.b;
        return new PlusPayPresale(a3, j2, new PlusPayPresale.Assets(a22, j3Var2 == null ? com.yandex.plus.pay.internal.model.mappers.j.a(j3Var2) : null, com.yandex.plus.pay.internal.model.mappers.j.a(y2Var2.c), com.yandex.plus.pay.internal.model.mappers.j.a(y2Var2.d), com.yandex.plus.pay.internal.model.mappers.j.a(y2Var2.e), com.yandex.plus.pay.internal.model.mappers.j.a(y2Var2.h), com.yandex.plus.pay.internal.model.mappers.j.a(y2Var2.g), com.yandex.plus.pay.internal.model.mappers.j.a(y2Var2.i)));
    }
}
