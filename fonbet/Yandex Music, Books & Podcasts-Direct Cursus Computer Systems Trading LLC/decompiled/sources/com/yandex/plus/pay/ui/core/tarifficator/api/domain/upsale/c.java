package com.yandex.plus.pay.ui.core.tarifficator.api.domain.upsale;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.g;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;

/* loaded from: classes5.dex */
public final class c implements a {
    public final com.yandex.plus.pay.a a;
    public final com.yandex.plus.log.api.b b;

    public c(com.yandex.plus.pay.a aVar, com.yandex.plus.log.api.b bVar) {
        aVar.getClass();
        bVar.getClass();
        this.a = aVar;
        this.b = bVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:25|26))(3:27|28|(1:30))|12|13|(2:15|(1:17))|18|(1:23)(2:20|21)))|38|6|7|(0)(0)|12|13|(0)|18|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002e, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0061, code lost:
    
        r0 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005e, code lost:
    
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x002c, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0060, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x002a, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0057, code lost:
    
        r0 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusPayCompositeOffers.Offer offer, cg6 cg6Var) {
        b bVar;
        Object obj;
        int i;
        Throwable a;
        if (cg6Var instanceof b) {
            bVar = (b) cg6Var;
            int i2 = bVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.m = i2 - Integer.MIN_VALUE;
                obj = bVar.k;
                nm6 nm6Var = nm6.a;
                i = bVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    com.yandex.plus.pay.api.feature.upsale.a aVar = (com.yandex.plus.pay.api.feature.upsale.a) ((g) this.a).c.getValue();
                    bVar.j = offer;
                    bVar.m = 1;
                    obj = ((com.yandex.plus.pay.internal.feature.upsale.f) aVar).a(offer, bVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    offer = bVar.j;
                    qgg.h0(obj);
                }
                r7o r7oVar2 = z7o.b;
                a = z7o.a(obj);
                if (a != null) {
                    com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.e;
                    com.yandex.plus.log.api.b bVar2 = this.b;
                    if (bVar2.b(aVar2)) {
                        bVar2.a(aVar2, "PlusTarifficatorGetUpsaleInteractor", "Could not get upsale for offer: " + offer, a);
                    }
                }
                if (obj instanceof t7o) {
                    return obj;
                }
                return null;
            }
        }
        bVar = new b(this, cg6Var);
        obj = bVar.k;
        nm6 nm6Var2 = nm6.a;
        i = bVar.m;
        if (i != 0) {
        }
        r7o r7oVar22 = z7o.b;
        a = z7o.a(obj);
        if (a != null) {
        }
        if (obj instanceof t7o) {
        }
    }
}
