package com.yandex.plus.pay.internal.feature.subscription;

import com.yandex.plus.home.api.prefetch.j;
import com.yandex.plus.pay.data.mb.ExternalMediaBillingApi;
import com.yandex.plus.pay.data.mb.dto.n3;
import com.yandex.plus.pay.data.mb.dto.q3;
import com.yandex.plus.pay.data.mb.dto.t3;
import com.yandex.plus.pay.data.mb.dto.u3;
import com.yandex.plus.pay.internal.model.PlusPaySubscriptionInfo;
import com.yandex.plus.pay.internal.model.mappers.m;
import defpackage.b6e;
import defpackage.bck;
import defpackage.btf;
import defpackage.cg6;
import defpackage.dfi;
import defpackage.hrg;
import defpackage.jyr;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.x97;
import defpackage.xq0;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class b {
    public final com.yandex.plus.pay.log.impl.b a;
    public final ExternalMediaBillingApi b;
    public final com.yandex.plus.pay.diagnostic.impl.d c;
    public final kotlinx.coroutines.a d;
    public final jyr e;

    public b(com.yandex.plus.pay.log.impl.b bVar, ExternalMediaBillingApi externalMediaBillingApi, com.yandex.plus.pay.diagnostic.impl.d dVar, kotlinx.coroutines.a aVar) {
        bVar.getClass();
        externalMediaBillingApi.getClass();
        dVar.getClass();
        aVar.getClass();
        this.a = bVar;
        this.b = externalMediaBillingApi;
        this.c = dVar;
        this.d = aVar;
        this.e = btf.b(new com.yandex.plus.pay.internal.di.g(14));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, cg6 cg6Var) {
        a aVar;
        int i;
        b bVar;
        String str3;
        n3 n3Var;
        String str4;
        String str5;
        int ordinal;
        PlusPaySubscriptionInfo.SubscriptionStatus subscriptionStatus;
        if (cg6Var instanceof a) {
            aVar = (a) cg6Var;
            int i2 = aVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.m = i2 - Integer.MIN_VALUE;
                Object obj = aVar.k;
                nm6 nm6Var = nm6.a;
                i = aVar.m;
                Object[] objArr = 0;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.pay.log.impl.b.d(this.a, com.yandex.plus.pay.api.log.b.a, hrg.r("Get subscription info. invoiceId = ", str, ", synchronizationTypes = ", str2));
                    bVar = this;
                    j jVar = new j(bVar, str, str2, objArr == true ? 1 : 0, 23);
                    aVar.j = str;
                    aVar.m = 1;
                    obj = x97.V(bVar.d, jVar, aVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    str3 = str;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str3 = aVar.j;
                    qgg.h0(obj);
                    bVar = this;
                }
                com.yandex.plus.pay.common.api.utils.b bVar2 = (com.yandex.plus.pay.common.api.utils.b) obj;
                Object obj2 = bVar2.a;
                n3Var = ((u3) obj2).a;
                if (n3Var != n3.b || n3Var == n3.c || n3Var == n3.d) {
                    str4 = bVar2.b;
                    String lowerCase = n3Var.name().toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    t3 t3Var = ((u3) obj2).d;
                    str5 = t3Var == null ? t3Var.c : null;
                    com.yandex.plus.pay.diagnostic.impl.d dVar = bVar.c;
                    dVar.getClass();
                    str3.getClass();
                    bck bckVar = dVar.a;
                    if (str4 == null) {
                        str4 = "no_value";
                    }
                    if (str5 == null) {
                        str5 = "no_value";
                    }
                    LinkedHashMap m = dfi.m("requestId", str4, "additionalData", "no_value");
                    m.put("orderId", str3);
                    m.put("status", lowerCase);
                    m.put("trust3dsUrl", str5);
                    m.put("_meta", bck.c(new HashMap()));
                    bckVar.d("Error.Api.SubscriptionStatus.InvalidStatus", m);
                }
                u3 u3Var = (u3) obj2;
                ((m) bVar.e.getValue()).getClass();
                u3Var.getClass();
                ordinal = u3Var.a.ordinal();
                if (ordinal != 0) {
                    subscriptionStatus = PlusPaySubscriptionInfo.SubscriptionStatus.FAIL_3DS;
                } else if (ordinal == 1) {
                    subscriptionStatus = PlusPaySubscriptionInfo.SubscriptionStatus.HOLD;
                } else if (ordinal == 2) {
                    subscriptionStatus = PlusPaySubscriptionInfo.SubscriptionStatus.PAYMENT_FAILED;
                } else if (ordinal == 3) {
                    subscriptionStatus = PlusPaySubscriptionInfo.SubscriptionStatus.REFUND;
                } else if (ordinal == 4) {
                    subscriptionStatus = PlusPaySubscriptionInfo.SubscriptionStatus.WAIT_FOR_PAYMENT;
                } else {
                    if (ordinal != 5) {
                        b6e.s();
                        return null;
                    }
                    subscriptionStatus = PlusPaySubscriptionInfo.SubscriptionStatus.UNKNOWN;
                }
                String str6 = u3Var.b;
                q3 q3Var = u3Var.c;
                PlusPaySubscriptionInfo.SynchronizationState synchronizationState = q3Var == null ? new PlusPaySubscriptionInfo.SynchronizationState(q3Var.a, q3Var.b, q3Var.c, q3Var.d) : null;
                t3 t3Var2 = u3Var.d;
                return new PlusPaySubscriptionInfo(subscriptionStatus, str6, synchronizationState, t3Var2 != null ? new PlusPaySubscriptionInfo.Trust3dsInfo(t3Var2.a, t3Var2.b, t3Var2.c) : null);
            }
        }
        aVar = new a(this, cg6Var);
        Object obj3 = aVar.k;
        nm6 nm6Var2 = nm6.a;
        i = aVar.m;
        Object[] objArr2 = 0;
        if (i != 0) {
        }
        com.yandex.plus.pay.common.api.utils.b bVar22 = (com.yandex.plus.pay.common.api.utils.b) obj3;
        Object obj22 = bVar22.a;
        n3Var = ((u3) obj22).a;
        if (n3Var != n3.b) {
        }
        str4 = bVar22.b;
        String lowerCase2 = n3Var.name().toLowerCase(Locale.ROOT);
        lowerCase2.getClass();
        t3 t3Var3 = ((u3) obj22).d;
        if (t3Var3 == null) {
        }
        com.yandex.plus.pay.diagnostic.impl.d dVar2 = bVar.c;
        dVar2.getClass();
        str3.getClass();
        bck bckVar2 = dVar2.a;
        if (str4 == null) {
        }
        if (str5 == null) {
        }
        LinkedHashMap m2 = dfi.m("requestId", str4, "additionalData", "no_value");
        m2.put("orderId", str3);
        m2.put("status", lowerCase2);
        m2.put("trust3dsUrl", str5);
        m2.put("_meta", bck.c(new HashMap()));
        bckVar2.d("Error.Api.SubscriptionStatus.InvalidStatus", m2);
        u3 u3Var2 = (u3) obj22;
        ((m) bVar.e.getValue()).getClass();
        u3Var2.getClass();
        ordinal = u3Var2.a.ordinal();
        if (ordinal != 0) {
        }
        String str62 = u3Var2.b;
        q3 q3Var2 = u3Var2.c;
        if (q3Var2 == null) {
        }
        t3 t3Var22 = u3Var2.d;
        return new PlusPaySubscriptionInfo(subscriptionStatus, str62, synchronizationState, t3Var22 != null ? new PlusPaySubscriptionInfo.Trust3dsInfo(t3Var22.a, t3Var22.b, t3Var22.c) : null);
    }
}
