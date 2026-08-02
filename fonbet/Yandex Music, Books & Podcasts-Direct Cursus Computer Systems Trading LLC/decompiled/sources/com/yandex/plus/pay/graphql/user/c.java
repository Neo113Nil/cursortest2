package com.yandex.plus.pay.graphql.user;

import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.core.analytics.logging.e;
import com.yandex.plus.core.graphql.c3;
import com.yandex.plus.core.graphql.e3;
import com.yandex.plus.core.graphql.type.y0;
import defpackage.cg6;
import defpackage.dp0;
import defpackage.jyr;
import defpackage.kp0;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;

/* loaded from: classes5.dex */
public final class c {
    public final dp0 a;

    public c(dp0 dp0Var) {
        dp0Var.getClass();
        this.a = dp0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum a(cg6 cg6Var) {
        b bVar;
        int i;
        int i2;
        if (cg6Var instanceof b) {
            bVar = (b) cg6Var;
            int i3 = bVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar.l = i3 - Integer.MIN_VALUE;
                Object obj = bVar.j;
                nm6 nm6Var = nm6.a;
                i = bVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.core.analytics.logging.b bVar2 = com.yandex.plus.core.analytics.logging.b.a;
                    jyr jyrVar = e.a;
                    e.e(com.yandex.plus.core.analytics.logging.a.a, bVar2, "userSyncStatus()", null);
                    e3 e3Var = new e3();
                    bVar.l = 1;
                    obj = com.yandex.plus.bdui.flex.ui.a.f(this.a, e3Var, bVar);
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
                com.yandex.plus.core.analytics.logging.b bVar3 = com.yandex.plus.core.analytics.logging.b.a;
                e.f("userSyncStatus() response=" + kp0Var);
                c3 c3Var = (c3) kp0Var.c;
                y0 y0Var = c3Var == null ? c3Var.a.a : null;
                i2 = y0Var != null ? -1 : a.a[y0Var.ordinal()];
                if (i2 != 1) {
                    return com.yandex.plus.pay.repository.api.model.sync.a.a;
                }
                if (i2 != 2) {
                    return null;
                }
                return com.yandex.plus.pay.repository.api.model.sync.a.b;
            }
        }
        bVar = new b(this, cg6Var);
        Object obj2 = bVar.j;
        nm6 nm6Var2 = nm6.a;
        i = bVar.l;
        if (i != 0) {
        }
        kp0 kp0Var2 = (kp0) obj2;
        u.f(kp0Var2);
        com.yandex.plus.core.analytics.logging.b bVar32 = com.yandex.plus.core.analytics.logging.b.a;
        e.f("userSyncStatus() response=" + kp0Var2);
        c3 c3Var2 = (c3) kp0Var2.c;
        if (c3Var2 == null) {
        }
        if (y0Var != null) {
        }
        if (i2 != 1) {
        }
    }
}
