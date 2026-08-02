package com.yandex.passport.data.network;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;

/* loaded from: classes4.dex */
public final class tb implements com.yandex.passport.data.network.core.d {
    public final com.yandex.passport.data.network.core.t a;
    public final com.yandex.passport.data.network.core.l b;

    public tb(com.yandex.passport.data.network.core.t tVar, com.yandex.passport.data.network.core.l lVar) {
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
    public final Object a(rb rbVar, cg6 cg6Var) {
        sb sbVar;
        int i;
        com.yandex.passport.common.network.p pVar;
        if (cg6Var instanceof sb) {
            sbVar = (sb) cg6Var;
            int i2 = sbVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sbVar.m = i2 - Integer.MIN_VALUE;
                Object obj = sbVar.k;
                nm6 nm6Var = nm6.a;
                i = sbVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.p k = com.appsflyer.internal.k.k((String) com.appsflyer.internal.k.j(rbVar.c, this.a, rbVar.b).b, "/1/bundle/device/bindings/check/");
                    k.F("Ya-Consumer-Authorization", "OAuth ".concat(rbVar.a.e()));
                    k.S("service", rbVar.d);
                    k.S("brand", rbVar.e);
                    sbVar.j = k;
                    sbVar.m = 1;
                    if (this.b.b(k, sbVar) == nm6Var) {
                        return nm6Var;
                    }
                    pVar = k;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pVar = sbVar.j;
                    qgg.h0(obj);
                }
                return pVar.z();
            }
        }
        sbVar = new sb(this, cg6Var);
        Object obj2 = sbVar.k;
        nm6 nm6Var2 = nm6.a;
        i = sbVar.m;
        if (i != 0) {
        }
        return pVar.z();
    }
}
