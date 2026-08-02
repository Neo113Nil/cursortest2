package com.yandex.passport.data.network;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;

/* loaded from: classes4.dex */
public final class ka implements com.yandex.passport.data.network.core.d {
    public final com.yandex.passport.data.network.core.t a;
    public final com.yandex.passport.data.network.core.l b;

    public ka(com.yandex.passport.data.network.core.t tVar, com.yandex.passport.data.network.core.l lVar) {
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
    public final Object a(ia iaVar, cg6 cg6Var) {
        ja jaVar;
        int i;
        com.yandex.passport.common.network.p pVar;
        if (cg6Var instanceof ja) {
            jaVar = (ja) cg6Var;
            int i2 = jaVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jaVar.m = i2 - Integer.MIN_VALUE;
                Object obj = jaVar.k;
                nm6 nm6Var = nm6.a;
                i = jaVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.p k = com.appsflyer.internal.k.k((String) com.appsflyer.internal.k.j(iaVar.b, this.a, iaVar.a).b, "/1/bundle/auth/x_token/prepare/");
                    k.F("Ya-Consumer-Authorization", "OAuth ".concat(iaVar.c.e()));
                    k.S("track_id", iaVar.d);
                    k.S(iaVar.f, iaVar.e);
                    jaVar.j = k;
                    jaVar.m = 1;
                    if (this.b.b(k, jaVar) == nm6Var) {
                        return nm6Var;
                    }
                    pVar = k;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar = jaVar.j;
                    qgg.h0(obj);
                }
                return pVar.z();
            }
        }
        jaVar = new ja(this, cg6Var);
        Object obj2 = jaVar.k;
        nm6 nm6Var2 = nm6.a;
        i = jaVar.m;
        if (i != 0) {
        }
        return pVar.z();
    }
}
