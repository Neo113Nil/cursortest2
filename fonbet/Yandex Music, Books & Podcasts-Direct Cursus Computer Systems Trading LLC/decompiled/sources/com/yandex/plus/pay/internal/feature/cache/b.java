package com.yandex.plus.pay.internal.feature.cache;

import com.yandex.plus.pay.graphql.offers.j;
import com.yandex.plus.pay.internal.feature.user.f;
import com.yandex.plus.pay.internal.feature.user.h;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.xq0;
import defpackage.z7o;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class b {
    public final com.yandex.plus.pay.log.impl.b a;
    public final h b;
    public final f c;
    public final j d;

    public b(com.yandex.plus.pay.log.impl.b bVar, h hVar, f fVar, j jVar) {
        bVar.getClass();
        hVar.getClass();
        fVar.getClass();
        jVar.getClass();
        this.a = bVar;
        this.b = hVar;
        this.c = fVar;
        this.d = jVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(1:(1:(4:12|13|14|15)(2:18|19))(3:20|21|22))(1:26))(3:32|33|(2:35|24))|27|28|(2:30|24)|21|22))|48|6|7|(0)(0)|27|28|(0)|21|22|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (r9.a(r0) == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008d, code lost:
    
        r9 = defpackage.z7o.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0031, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008c, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0089, code lost:
    
        r9 = defpackage.z7o.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0065, code lost:
    
        r9 = defpackage.z7o.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0044, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0064, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0061, code lost:
    
        r9 = defpackage.z7o.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0079, code lost:
    
        r9 = defpackage.z7o.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x003e, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0078, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0075, code lost:
    
        r9 = defpackage.z7o.b;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        a aVar;
        nm6 nm6Var;
        int i;
        h hVar;
        if (cg6Var instanceof a) {
            aVar = (a) cg6Var;
            int i2 = aVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.l = i2 - Integer.MIN_VALUE;
                Object obj = aVar.j;
                nm6Var = nm6.a;
                i = aVar.l;
                com.yandex.plus.pay.log.impl.b bVar = this.a;
                com.yandex.plus.pay.api.log.a aVar2 = com.yandex.plus.pay.api.log.b.a;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.pay.log.impl.b.d(bVar, aVar2, "Start reset cache.");
                    r7o r7oVar = z7o.b;
                    j jVar = this.d;
                    aVar.l = 1;
                    jVar.e.evictAll();
                    if (Unit.a == nm6Var) {
                        return nm6Var;
                    }
                } else if (i == 1) {
                    qgg.h0(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        r7o r7oVar2 = z7o.b;
                        com.yandex.plus.pay.log.impl.b.d(bVar, aVar2, "Success reset cache.");
                        return Unit.a;
                    }
                    qgg.h0(obj);
                    r7o r7oVar3 = z7o.b;
                    f fVar = this.c;
                    aVar.l = 3;
                }
                r7o r7oVar4 = z7o.b;
                hVar = this.b;
                aVar.l = 2;
                if (hVar.a(aVar) == nm6Var) {
                    return nm6Var;
                }
                r7o r7oVar32 = z7o.b;
                f fVar2 = this.c;
                aVar.l = 3;
            }
        }
        aVar = new a(this, cg6Var);
        Object obj2 = aVar.j;
        nm6Var = nm6.a;
        i = aVar.l;
        com.yandex.plus.pay.log.impl.b bVar2 = this.a;
        com.yandex.plus.pay.api.log.a aVar22 = com.yandex.plus.pay.api.log.b.a;
        if (i != 0) {
        }
        r7o r7oVar42 = z7o.b;
        hVar = this.b;
        aVar.l = 2;
        if (hVar.a(aVar) == nm6Var) {
        }
        r7o r7oVar322 = z7o.b;
        f fVar22 = this.c;
        aVar.l = 3;
    }
}
