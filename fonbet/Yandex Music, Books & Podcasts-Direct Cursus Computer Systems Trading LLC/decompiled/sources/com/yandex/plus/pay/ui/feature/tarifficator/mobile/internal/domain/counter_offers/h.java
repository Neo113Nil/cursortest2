package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.counter_offers;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.model.PlusPayCounterOffers;
import com.yandex.plus.pay.internal.model.PlusPayCounterOffersReason;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.xq0;
import defpackage.z7o;

/* loaded from: classes5.dex */
public final class h implements f {
    public final com.yandex.plus.pay.internal.g a;
    public final com.yandex.plus.log.api.b b;

    public h(com.yandex.plus.pay.internal.g gVar, com.yandex.plus.log.api.b bVar) {
        bVar.getClass();
        this.a = gVar;
        this.b = bVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:10)(2:27|28))(3:29|30|(1:32))|11|(1:13)(1:26)|14|15|(2:17|18)(2:20|(2:22|23)(1:24))))|39|6|7|(0)(0)|11|(0)(0)|14|15|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x002c, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006d, code lost:
    
        r7 = defpackage.z7o.b;
        r8 = new defpackage.t7o(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x002a, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006c, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0028, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0064, code lost:
    
        r7 = defpackage.z7o.b;
        r8 = new defpackage.t7o(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar, PlusPayCounterOffersReason plusPayCounterOffersReason, cg6 cg6Var) {
        g gVar;
        Object obj;
        int i;
        Throwable a;
        if (cg6Var instanceof g) {
            gVar = (g) cg6Var;
            int i2 = gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.l = i2 - Integer.MIN_VALUE;
                obj = gVar.j;
                nm6 nm6Var = nm6.a;
                i = gVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    j b = aVar.b();
                    r7o r7oVar = z7o.b;
                    com.yandex.plus.pay.internal.feature.payment.b h = this.a.h();
                    PlusPayCompositeOffers.Offer offer = b.a;
                    gVar.l = 1;
                    obj = ((com.yandex.plus.pay.internal.feature.payment.i) h).c(offer, plusPayCounterOffersReason, gVar);
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
                if (!((PlusPayCounterOffers) obj).getOffers().isEmpty()) {
                    obj = null;
                }
                r7o r7oVar2 = z7o.b;
                a = z7o.a(obj);
                if (a != null) {
                    return obj;
                }
                com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.e;
                com.yandex.plus.log.api.b bVar = this.b;
                if (!bVar.b(aVar2)) {
                    return null;
                }
                bVar.a(aVar2, "GetCounterOffersInteractorImpl", "Failed to get counter offers", a);
                return null;
            }
        }
        gVar = new g(this, cg6Var);
        obj = gVar.j;
        nm6 nm6Var2 = nm6.a;
        i = gVar.l;
        if (i != 0) {
        }
        if (!((PlusPayCounterOffers) obj).getOffers().isEmpty()) {
        }
        r7o r7oVar22 = z7o.b;
        a = z7o.a(obj);
        if (a != null) {
        }
    }
}
