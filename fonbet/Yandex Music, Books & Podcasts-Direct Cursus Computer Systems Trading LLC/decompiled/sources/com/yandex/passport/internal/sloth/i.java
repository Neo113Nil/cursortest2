package com.yandex.passport.internal.sloth;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class i {
    public final com.yandex.passport.internal.usecase.authorize.c a;

    public i(com.yandex.passport.internal.usecase.authorize.c cVar) {
        cVar.getClass();
        this.a = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.yandex.passport.sloth.data.i iVar, String str, Long l, cg6 cg6Var) {
        h hVar;
        int i;
        if (cg6Var instanceof h) {
            hVar = (h) cg6Var;
            int i2 = hVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.l = i2 - Integer.MIN_VALUE;
                Object obj = hVar.j;
                nm6 nm6Var = nm6.a;
                i = hVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    iVar.getClass();
                    com.yandex.passport.internal.usecase.authorize.a aVar = new com.yandex.passport.internal.usecase.authorize.a(new com.yandex.passport.internal.entities.h(com.yandex.plus.core.network.api.utils.a.P(iVar.a), iVar.b, iVar.c, 6), com.yandex.passport.internal.analytics.a.x, str, l != null ? l.longValue() : 0L);
                    hVar.l = 1;
                    obj = this.a.g(aVar, hVar);
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
                return ((z7o) obj).a;
            }
        }
        hVar = new h(this, cg6Var);
        Object obj2 = hVar.j;
        nm6 nm6Var2 = nm6.a;
        i = hVar.l;
        if (i != 0) {
        }
        return ((z7o) obj2).a;
    }
}
