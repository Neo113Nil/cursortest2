package com.yandex.plus.core.network.okhttp.client;

import com.yandex.plus.core.network.error.l;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import kotlin.ranges.IntRange;

/* loaded from: classes4.dex */
public final class e implements com.yandex.plus.core.network.interceptor.a {
    public static final e a = new e();

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.plus.core.network.interceptor.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.yandex.plus.core.network.interceptor.e eVar, cg6 cg6Var) {
        d dVar;
        int i;
        com.yandex.plus.core.network.call.c cVar;
        Object obj;
        com.yandex.plus.core.network.response.b bVar;
        if (cg6Var instanceof d) {
            dVar = (d) cg6Var;
            int i2 = dVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.l = i2 - Integer.MIN_VALUE;
                Object obj2 = dVar.j;
                Object obj3 = nm6.a;
                i = dVar.l;
                if (i != 0) {
                    qgg.h0(obj2);
                    Object obj4 = eVar.b;
                    dVar.l = 1;
                    obj2 = eVar.b(obj4, dVar);
                    if (obj2 == obj3) {
                        return obj3;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj2);
                }
                cVar = (com.yandex.plus.core.network.call.c) obj2;
                cVar.getClass();
                if (!(cVar instanceof com.yandex.plus.core.network.call.b)) {
                    obj = ((com.yandex.plus.core.network.call.b) cVar).a;
                } else {
                    if (!(cVar instanceof com.yandex.plus.core.network.call.a)) {
                        b6e.s();
                        return null;
                    }
                    obj = null;
                }
                bVar = (com.yandex.plus.core.network.response.b) obj;
                if (bVar != null) {
                    return cVar;
                }
                IntRange intRange = com.yandex.plus.core.network.response.b.g;
                int i3 = intRange.a;
                int i4 = intRange.b;
                int i5 = bVar.c;
                if (i3 > i5 || i5 > i4) {
                    bVar = null;
                }
                if (bVar == null) {
                    return cVar;
                }
                int i6 = bVar.c;
                return new com.yandex.plus.core.network.call.a(new l((i6 == 401 || i6 == 403) ? new com.yandex.plus.core.network.error.c(bVar) : new com.yandex.plus.core.network.error.g(bVar), null));
            }
        }
        dVar = new d(this, cg6Var);
        Object obj22 = dVar.j;
        Object obj32 = nm6.a;
        i = dVar.l;
        if (i != 0) {
        }
        cVar = (com.yandex.plus.core.network.call.c) obj22;
        cVar.getClass();
        if (!(cVar instanceof com.yandex.plus.core.network.call.b)) {
        }
        bVar = (com.yandex.plus.core.network.response.b) obj;
        if (bVar != null) {
        }
    }
}
