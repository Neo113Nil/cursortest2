package com.yandex.plus.pay.internal.feature.topup;

import com.yandex.plus.core.data.common.b0;
import com.yandex.plus.home.feature.webviews.internal.treasury.d;
import com.yandex.plus.pay.data.mb.ExternalMediaBillingApi;
import com.yandex.plus.pay.data.mb.dto.c4;
import com.yandex.plus.pay.data.mb.dto.d4;
import com.yandex.plus.pay.data.mb.dto.z3;
import com.yandex.plus.pay.internal.model.PlusPayTopupScreenConfiguration;
import com.yandex.plus.pay.internal.model.PlusPayWebPaymentWidgetTimeoutParams;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.x97;
import defpackage.xq0;

/* loaded from: classes5.dex */
public final class b {
    public final ExternalMediaBillingApi a;
    public final com.yandex.plus.core.locale.a b;
    public final kotlinx.coroutines.a c;

    public b(ExternalMediaBillingApi externalMediaBillingApi, com.yandex.plus.core.locale.a aVar, kotlinx.coroutines.a aVar2) {
        externalMediaBillingApi.getClass();
        aVar.getClass();
        aVar2.getClass();
        this.a = externalMediaBillingApi;
        this.b = aVar;
        this.c = aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, cg6 cg6Var) {
        a aVar;
        int i;
        Long l;
        c4 c4Var;
        z3 z3Var;
        z3 z3Var2;
        if (cg6Var instanceof a) {
            aVar = (a) cg6Var;
            int i2 = aVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.l = i2 - Integer.MIN_VALUE;
                Object obj = aVar.j;
                nm6 nm6Var = nm6.a;
                i = aVar.l;
                l = 0;
                l = 0;
                if (i != 0) {
                    qgg.h0(obj);
                    d dVar = new d(this, str, l, 14);
                    aVar.l = 1;
                    obj = x97.V(this.c, dVar, aVar);
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
                com.yandex.plus.pay.common.api.utils.b bVar = (com.yandex.plus.pay.common.api.utils.b) obj;
                d4 d4Var = (d4) bVar.a;
                String str2 = d4Var.a;
                c4 c4Var2 = d4Var.b;
                b0 b0Var = new b0(c4Var2 == null ? c4Var2.a : null, c4Var2 == null ? c4Var2.b : null);
                Long l2 = (c4Var2 != null || (z3Var2 = c4Var2.c) == null) ? null : new Long(z3Var2.a);
                c4Var = ((d4) bVar.a).b;
                if (c4Var != null && (z3Var = c4Var.c) != null) {
                    l = new Long(z3Var.b);
                }
                return new PlusPayTopupScreenConfiguration(str2, b0Var, new PlusPayWebPaymentWidgetTimeoutParams(l, l2));
            }
        }
        aVar = new a(this, cg6Var);
        Object obj2 = aVar.j;
        nm6 nm6Var2 = nm6.a;
        i = aVar.l;
        l = 0;
        l = 0;
        if (i != 0) {
        }
        com.yandex.plus.pay.common.api.utils.b bVar2 = (com.yandex.plus.pay.common.api.utils.b) obj2;
        d4 d4Var2 = (d4) bVar2.a;
        String str22 = d4Var2.a;
        c4 c4Var22 = d4Var2.b;
        b0 b0Var2 = new b0(c4Var22 == null ? c4Var22.a : null, c4Var22 == null ? c4Var22.b : null);
        if (c4Var22 != null) {
        }
        c4Var = ((d4) bVar2.a).b;
        if (c4Var != null) {
            l = new Long(z3Var.b);
        }
        return new PlusPayTopupScreenConfiguration(str22, b0Var2, new PlusPayWebPaymentWidgetTimeoutParams(l, l2));
    }
}
