package com.yandex.plus.home.user;

import com.yandex.plus.home.graphql.user.e;
import com.yandex.plus.home.repository.api.model.user.f;
import defpackage.cg6;
import defpackage.jyr;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.x7j;
import defpackage.xq0;
import defpackage.z7o;

/* loaded from: classes5.dex */
public final class b {
    public final e a;

    public b(e eVar) {
        eVar.getClass();
        this.a = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        a aVar;
        int i;
        Object d;
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
                    d = this.a.d(aVar);
                    if (d == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    d = ((z7o) obj).a;
                }
                r7o r7oVar = z7o.b;
                if (!(d instanceof t7o)) {
                    try {
                        f fVar = (f) d;
                        if (!(fVar instanceof com.yandex.plus.home.repository.api.model.user.b)) {
                            if (fVar instanceof com.yandex.plus.home.repository.api.model.user.e) {
                                throw new com.yandex.plus.home.api.exception.a("User is unauthorized!", null);
                            }
                            throw new x7j();
                        }
                        d = com.yandex.plus.home.plaque.animator.internal.utils.a.p((com.yandex.plus.home.repository.api.model.user.b) fVar);
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        d = new t7o(th);
                    }
                }
                a = z7o.a(d);
                if (a != null) {
                    return d;
                }
                com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.a;
                jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.e, bVar, "Error while getting user", a);
                throw new com.yandex.plus.home.api.exception.a(a.getMessage(), a);
            }
        }
        aVar = new a(this, cg6Var);
        Object obj2 = aVar.j;
        nm6 nm6Var2 = nm6.a;
        i = aVar.l;
        if (i != 0) {
        }
        r7o r7oVar3 = z7o.b;
        if (!(d instanceof t7o)) {
        }
        a = z7o.a(d);
        if (a != null) {
        }
    }
}
