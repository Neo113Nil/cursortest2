package com.yandex.plus.pay.internal.feature.payment.inapp.google;

import com.connectsdk.service.airplay.PListParser;
import com.yandex.passport.sloth.ui.q;
import com.yandex.plus.pay.internal.model.PlusPaySubmitResult;
import com.yandex.plus.pay.internal.model.PlusPaySubscriptionInfo;
import defpackage.a4g;
import defpackage.alc;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.e5b;
import defpackage.eno;
import defpackage.eta;
import defpackage.f1d;
import defpackage.fkn;
import defpackage.gld;
import defpackage.lbq;
import defpackage.nm6;
import defpackage.ow1;
import defpackage.qgg;
import defpackage.tf6;
import defpackage.ub7;
import defpackage.xq0;
import defpackage.zsd;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class d implements com.yandex.plus.pay.api.feature.inapp.restore.a {
    public final com.yandex.plus.pay.inapp.api.b a;
    public final com.yandex.plus.pay.internal.feature.payment.inapp.google.domain.c b;
    public final com.yandex.plus.pay.internal.feature.subscription.g c;
    public final com.yandex.plus.pay.internal.feature.cache.b d;
    public final com.yandex.plus.pay.internal.analytics.h e;
    public final com.yandex.plus.pay.log.impl.b f;
    public final Set g;
    public final tf6 h;
    public final fkn i;

    public d(com.yandex.plus.pay.inapp.api.b bVar, com.yandex.plus.pay.internal.feature.payment.inapp.google.domain.c cVar, com.yandex.plus.pay.internal.feature.subscription.g gVar, com.yandex.plus.pay.internal.feature.cache.b bVar2, com.yandex.plus.pay.internal.analytics.h hVar, com.yandex.plus.pay.log.impl.b bVar3, Set set, kotlinx.coroutines.a aVar) {
        bVar.getClass();
        cVar.getClass();
        gVar.getClass();
        bVar2.getClass();
        hVar.getClass();
        bVar3.getClass();
        set.getClass();
        aVar.getClass();
        this.a = bVar;
        this.b = cVar;
        this.c = gVar;
        this.d = bVar2;
        this.e = hVar;
        this.f = bVar3;
        this.g = set;
        tf6 e = gld.e(aVar.plus(a4g.n()));
        this.h = e;
        Continuation continuation = null;
        this.i = zsd.F0(new alc(new ub7(12, new eno(new com.yandex.plus.home.api.prefetch.j(this, continuation, 22)), new q(this, continuation, 14)), new ow1(this, continuation, 16)), e, lbq.b, com.yandex.plus.pay.api.feature.inapp.restore.d.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f9, code lost:
    
        if (r11.e(r12, r8) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c7, code lost:
    
        if (r13 != r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, com.yandex.plus.pay.inapp.api.f fVar, cg6 cg6Var) {
        b bVar;
        int i;
        com.yandex.plus.pay.inapp.api.f fVar2;
        if (cg6Var instanceof b) {
            bVar = (b) cg6Var;
            int i2 = bVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.m = i2 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                Object obj = bVar2.k;
                nm6 nm6Var = nm6.a;
                i = bVar2.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.pay.internal.analytics.i iVar = (com.yandex.plus.pay.internal.analytics.i) dVar.e;
                    iVar.getClass();
                    com.yandex.plus.core.insets.d dVar2 = new com.yandex.plus.core.insets.d(3);
                    com.yandex.plus.pay.internal.analytics.g gVar = iVar.a;
                    String str = gVar.a;
                    str.getClass();
                    LinkedHashMap linkedHashMap = dVar2.b;
                    linkedHashMap.put("clientSource", str);
                    String str2 = gVar.b;
                    str2.getClass();
                    linkedHashMap.put("clientSubSource", str2);
                    linkedHashMap.put("isPlusHome", String.valueOf(gVar.c));
                    linkedHashMap.put("isRestoration", PListParser.TAG_TRUE);
                    linkedHashMap.put("paymentIntegration", "PaymentSDK");
                    linkedHashMap.put("os", ConstantDeviceInfo.APP_PLATFORM);
                    String a = dVar2.a();
                    com.yandex.plus.pay.internal.feature.payment.inapp.google.domain.c cVar = dVar.b;
                    String e = eta.e();
                    e5b e5bVar = e5b.a;
                    e5bVar.getClass();
                    bVar2.j = fVar;
                    bVar2.m = 1;
                    obj = ((com.yandex.plus.pay.internal.feature.payment.inapp.google.data.d) cVar.a).a(fVar, a, e, "", "", e5bVar, bVar2);
                    if (obj != nm6Var) {
                        fVar2 = fVar;
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    fVar2 = bVar2.j;
                    qgg.h0(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fVar2 = bVar2.j;
                    qgg.h0(obj);
                    switch (a.a[((PlusPaySubscriptionInfo) obj).getStatus().ordinal()]) {
                        case 1:
                            com.yandex.plus.pay.inapp.api.b bVar3 = dVar.a;
                            bVar2.j = null;
                            bVar2.m = 3;
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            throw new com.yandex.plus.pay.api.exception.a(f1d.g("In app purchase was not completed successfully; orderId = ", fVar2.a), null);
                        default:
                            b6e.s();
                            return null;
                    }
                }
                com.yandex.plus.pay.internal.feature.subscription.g gVar2 = dVar.c;
                String invoiceId = ((PlusPaySubmitResult) obj).getInvoiceId();
                Set set = dVar.g;
                bVar2.j = fVar2;
                bVar2.m = 2;
                obj = ((com.yandex.plus.pay.internal.feature.subscription.e) gVar2).a(invoiceId, set, com.yandex.plus.pay.internal.feature.subscription.f.a, bVar2);
            }
        }
        bVar = new b(dVar, cg6Var);
        b bVar22 = bVar;
        Object obj2 = bVar22.k;
        nm6 nm6Var2 = nm6.a;
        i = bVar22.m;
        if (i != 0) {
        }
        com.yandex.plus.pay.internal.feature.subscription.g gVar22 = dVar.c;
        String invoiceId2 = ((PlusPaySubmitResult) obj2).getInvoiceId();
        Set set2 = dVar.g;
        bVar22.j = fVar2;
        bVar22.m = 2;
        obj2 = ((com.yandex.plus.pay.internal.feature.subscription.e) gVar22).a(invoiceId2, set2, com.yandex.plus.pay.internal.feature.subscription.f.a, bVar22);
    }
}
