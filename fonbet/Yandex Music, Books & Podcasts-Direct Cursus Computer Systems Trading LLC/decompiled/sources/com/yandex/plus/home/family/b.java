package com.yandex.plus.home.family;

import com.yandex.plus.home.graphql.user.e;
import defpackage.cg6;
import defpackage.jyr;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;

/* loaded from: classes5.dex */
public final class b {
    public final e a;

    public b(e eVar) {
        eVar.getClass();
        this.a = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        a aVar;
        int i;
        Object b;
        Throwable a;
        if (cg6Var instanceof a) {
            aVar = (a) cg6Var;
            int i2 = aVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.l = i2 - Integer.MIN_VALUE;
                Object obj = aVar.j;
                nm6 nm6Var = nm6.a;
                i = aVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    aVar.l = 1;
                    b = this.a.b(aVar);
                    if (b == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    b = ((z7o) obj).a;
                }
                r7o r7oVar = z7o.b;
                if (!(b instanceof t7o)) {
                    com.yandex.plus.home.repository.api.model.user.a aVar2 = (com.yandex.plus.home.repository.api.model.user.a) b;
                    b = new com.yandex.plus.core.data.family.b(aVar2.a, aVar2.b);
                }
                a = z7o.a(b);
                if (a != null) {
                    return b;
                }
                com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.a;
                jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.e, bVar, "Error while inviting to family", a);
                throw new com.yandex.plus.home.api.exception.a(a.getMessage(), a);
            }
        }
        aVar = new a(this, cg6Var);
        Object obj2 = aVar.j;
        nm6 nm6Var2 = nm6.a;
        i = aVar.l;
        if (i != 0) {
        }
        r7o r7oVar2 = z7o.b;
        if (!(b instanceof t7o)) {
        }
        a = z7o.a(b);
        if (a != null) {
        }
    }
}
