package com.yandex.plus.pay.internal.feature.success;

import com.yandex.plus.pay.data.mb.ExternalMediaBillingApi;
import com.yandex.plus.pay.data.mb.dto.h2;
import com.yandex.plus.pay.data.mb.dto.i2;
import com.yandex.plus.pay.internal.model.PlusPayWebSuccessScreenConfiguration;
import com.yandex.plus.pay.internal.model.PlusPayWebSuccessScreenParams;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.x97;
import defpackage.xq0;

/* loaded from: classes5.dex */
public final class c implements e {
    public final ExternalMediaBillingApi a;
    public final com.yandex.plus.core.locale.a b;
    public final kotlinx.coroutines.a c;

    public c(ExternalMediaBillingApi externalMediaBillingApi, com.yandex.plus.core.locale.a aVar, kotlinx.coroutines.a aVar2) {
        externalMediaBillingApi.getClass();
        aVar.getClass();
        aVar2.getClass();
        this.a = externalMediaBillingApi;
        this.b = aVar;
        this.c = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusPayWebSuccessScreenParams plusPayWebSuccessScreenParams, cg6 cg6Var) {
        b bVar;
        int i;
        if (cg6Var instanceof b) {
            bVar = (b) cg6Var;
            int i2 = bVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.l = i2 - Integer.MIN_VALUE;
                Object obj = bVar.j;
                nm6 nm6Var = nm6.a;
                i = bVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.home.feature.webviews.internal.treasury.d dVar = new com.yandex.plus.home.feature.webviews.internal.treasury.d(this, plusPayWebSuccessScreenParams, null, 13);
                    bVar.l = 1;
                    obj = x97.V(this.c, dVar, bVar);
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
                h2 h2Var = ((i2) ((com.yandex.plus.pay.common.api.utils.b) obj).a).b;
                return new PlusPayWebSuccessScreenConfiguration(h2Var.b, h2Var.c, h2Var.d);
            }
        }
        bVar = new b(this, cg6Var);
        Object obj2 = bVar.j;
        nm6 nm6Var2 = nm6.a;
        i = bVar.l;
        if (i != 0) {
        }
        h2 h2Var2 = ((i2) ((com.yandex.plus.pay.common.api.utils.b) obj2).a).b;
        return new PlusPayWebSuccessScreenConfiguration(h2Var2.b, h2Var2.c, h2Var2.d);
    }
}
