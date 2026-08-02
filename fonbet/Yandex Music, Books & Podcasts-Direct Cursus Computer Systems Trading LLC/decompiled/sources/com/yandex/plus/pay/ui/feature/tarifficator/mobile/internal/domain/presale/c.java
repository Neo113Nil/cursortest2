package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.presale;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.feature.payment.i;
import com.yandex.plus.pay.internal.g;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.xq0;
import defpackage.z7o;

/* loaded from: classes5.dex */
public final class c implements a {
    public final g a;
    public final com.yandex.plus.log.api.b b;

    public c(g gVar, com.yandex.plus.log.api.b bVar) {
        bVar.getClass();
        this.a = gVar;
        this.b = bVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:23|24))(3:25|26|(1:28))|11|12|(2:14|15)(2:17|(2:19|20)(1:21))))|35|6|7|(0)(0)|11|12|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x002c, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        r7 = defpackage.z7o.b;
        r7 = new defpackage.t7o(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002a, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0059, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0028, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0051, code lost:
    
        r7 = defpackage.z7o.b;
        r7 = new defpackage.t7o(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a aVar, cg6 cg6Var) {
        b bVar;
        int i;
        Throwable a;
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
                    PlusPayCompositeOffers.Offer offer = aVar.b.a;
                    r7o r7oVar = z7o.b;
                    com.yandex.plus.pay.internal.feature.payment.b h = this.a.h();
                    bVar.l = 1;
                    obj = ((i) h).d(offer, bVar);
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
                r7o r7oVar2 = z7o.b;
                a = z7o.a(obj);
                if (a != null) {
                    return obj;
                }
                com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.e;
                com.yandex.plus.log.api.b bVar2 = this.b;
                if (!bVar2.b(aVar2)) {
                    return null;
                }
                bVar2.a(aVar2, "GetPresaleInteractorImpl", "Failed to get presale", a);
                return null;
            }
        }
        bVar = new b(this, cg6Var);
        Object obj2 = bVar.j;
        nm6 nm6Var2 = nm6.a;
        i = bVar.l;
        if (i != 0) {
        }
        r7o r7oVar22 = z7o.b;
        a = z7o.a(obj2);
        if (a != null) {
        }
    }
}
