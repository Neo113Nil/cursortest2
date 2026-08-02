package com.yandex.plus.pay.graphql.avatar;

import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.core.analytics.logging.e;
import com.yandex.plus.core.graphql.exception.d;
import com.yandex.plus.core.graphql.s2;
import com.yandex.plus.core.graphql.t2;
import com.yandex.plus.core.graphql.u2;
import defpackage.cg6;
import defpackage.dp0;
import defpackage.f1d;
import defpackage.jyr;
import defpackage.kp0;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;

/* loaded from: classes5.dex */
public final class b {
    public final dp0 a;
    public final com.yandex.plus.core.network.utils.a b;

    public b(dp0 dp0Var, com.yandex.plus.core.network.urls.b bVar) {
        dp0Var.getClass();
        bVar.getClass();
        this.a = dp0Var;
        this.b = new com.yandex.plus.core.network.utils.a(bVar, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, cg6 cg6Var) {
        a aVar;
        int i;
        s2 s2Var;
        Object t7oVar;
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
                    com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.a;
                    String g = f1d.g("getUserAvatarInfo() puid=", str);
                    jyr jyrVar = e.a;
                    e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, g, null);
                    u2 u2Var = new u2(str);
                    aVar.l = 1;
                    obj = com.yandex.plus.bdui.flex.ui.a.f(this.a, u2Var, aVar);
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
                kp0 kp0Var = (kp0) obj;
                u.f(kp0Var);
                jyr jyrVar2 = e.a;
                e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.a, "getUserAvatarInfo() response=" + kp0Var, null);
                s2Var = (s2) kp0Var.c;
                if (s2Var != null) {
                    throw new d("user avatar response data is null", null);
                }
                com.yandex.plus.core.network.utils.a aVar2 = this.b;
                aVar2.getClass();
                t2 t2Var = s2Var.a;
                if (t2Var == null) {
                    throw new d("user is null", null);
                }
                try {
                    r7o r7oVar = z7o.b;
                    t7oVar = new com.yandex.plus.pay.repository.api.model.user.a(aVar2.a.getUrl() + t2Var.b.b.b + "/islands-150");
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(th);
                }
                Throwable a = z7o.a(t7oVar);
                if (a == null) {
                    return (com.yandex.plus.pay.repository.api.model.user.a) t7oVar;
                }
                throw new d(null, a);
            }
        }
        aVar = new a(this, cg6Var);
        Object obj2 = aVar.j;
        nm6 nm6Var2 = nm6.a;
        i = aVar.l;
        if (i != 0) {
        }
        kp0 kp0Var2 = (kp0) obj2;
        u.f(kp0Var2);
        jyr jyrVar22 = e.a;
        e.e(com.yandex.plus.core.analytics.logging.a.a, com.yandex.plus.core.analytics.logging.b.a, "getUserAvatarInfo() response=" + kp0Var2, null);
        s2Var = (s2) kp0Var2.c;
        if (s2Var != null) {
        }
    }
}
