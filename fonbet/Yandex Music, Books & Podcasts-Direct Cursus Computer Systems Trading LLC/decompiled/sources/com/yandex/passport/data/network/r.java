package com.yandex.passport.data.network;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;

/* loaded from: classes4.dex */
public final class r implements com.yandex.passport.data.network.core.d {
    public final com.yandex.passport.data.network.core.t a;
    public final com.yandex.passport.data.network.core.l b;

    public r(com.yandex.passport.data.network.core.t tVar, com.yandex.passport.data.network.core.l lVar) {
        tVar.getClass();
        lVar.getClass();
        this.a = tVar;
        this.b = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.yandex.passport.data.network.core.d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(p pVar, cg6 cg6Var) {
        q qVar;
        int i;
        com.yandex.passport.common.network.p pVar2;
        if (cg6Var instanceof q) {
            qVar = (q) cg6Var;
            int i2 = qVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qVar.m = i2 - Integer.MIN_VALUE;
                Object obj = qVar.k;
                nm6 nm6Var = nm6.a;
                i = qVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.p k = com.appsflyer.internal.k.k((String) com.appsflyer.internal.k.j(pVar.b, this.a, pVar.a).b, "/1/bundle/auth/x_token/");
                    k.F("Ya-Consumer-Authorization", "OAuth ".concat(pVar.c.e()));
                    k.S("type", "x-token");
                    k.S("retpath", pVar.d);
                    k.S("yandexuid", pVar.e);
                    qVar.j = k;
                    qVar.m = 1;
                    if (this.b.b(k, qVar) == nm6Var) {
                        return nm6Var;
                    }
                    pVar2 = k;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar2 = qVar.j;
                    qgg.h0(obj);
                }
                return pVar2.z();
            }
        }
        qVar = new q(this, cg6Var);
        Object obj2 = qVar.k;
        nm6 nm6Var2 = nm6.a;
        i = qVar.m;
        if (i != 0) {
        }
        return pVar2.z();
    }
}
