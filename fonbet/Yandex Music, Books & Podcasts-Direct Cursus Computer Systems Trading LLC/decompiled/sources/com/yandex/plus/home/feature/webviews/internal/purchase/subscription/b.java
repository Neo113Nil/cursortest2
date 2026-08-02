package com.yandex.plus.home.feature.webviews.internal.purchase.subscription;

import com.yandex.plus.core.analytics.logging.e;
import com.yandex.plus.home.graphql.subscription.d;
import defpackage.cg6;
import defpackage.jyr;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.x0q;
import defpackage.xq0;
import defpackage.y0q;
import defpackage.z7o;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class b {
    public final d a;
    public final x0q b;

    public b(d dVar) {
        dVar.getClass();
        this.a = dVar;
        this.b = y0q.b(0, 0, null, 7);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(2:17|18))(3:30|31|(2:33|28))|19|20|(1:22)|23|(1:25)|26))|41|6|7|(0)(0)|19|20|(0)|23|(0)|26|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00af, code lost:
    
        if (r8.b.emit((com.yandex.plus.home.repository.api.model.webconfig.b0) r11, r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0042, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0067, code lost:
    
        r2 = defpackage.z7o.b;
        r2 = new defpackage.t7o(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0064, code lost:
    
        r11 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0040, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0066, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x003e, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005d, code lost:
    
        r2 = defpackage.z7o.b;
        r2 = new defpackage.t7o(r11);
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, cg6 cg6Var) {
        a aVar;
        Object obj;
        int i;
        Throwable a;
        if (cg6Var instanceof a) {
            aVar = (a) cg6Var;
            int i2 = aVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.o = i2 - Integer.MIN_VALUE;
                obj = aVar.m;
                nm6 nm6Var = nm6.a;
                i = aVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    d dVar = this.a;
                    aVar.j = str;
                    aVar.k = str2;
                    aVar.l = null;
                    aVar.o = 1;
                    obj = dVar.a(str, str2, aVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = aVar.k;
                    str = aVar.j;
                    qgg.h0(obj);
                }
                r7o r7oVar2 = z7o.b;
                a = z7o.a(obj);
                if (a != null) {
                    com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.e;
                    String str3 = "updateHomeConfiguration(" + str + ", " + str2 + ')';
                    jyr jyrVar = e.a;
                    e.e(com.yandex.plus.core.analytics.logging.a.e, bVar, str3, a);
                }
                if (obj instanceof t7o) {
                    obj = null;
                }
                aVar.j = null;
                aVar.k = null;
                aVar.l = obj;
                aVar.o = 2;
            }
        }
        aVar = new a(this, cg6Var);
        obj = aVar.m;
        nm6 nm6Var2 = nm6.a;
        i = aVar.o;
        if (i != 0) {
        }
        r7o r7oVar22 = z7o.b;
        a = z7o.a(obj);
        if (a != null) {
        }
        if (obj instanceof t7o) {
        }
        aVar.j = null;
        aVar.k = null;
        aVar.l = obj;
        aVar.o = 2;
    }
}
