package com.yandex.passport.data.network;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;

/* loaded from: classes4.dex */
public final class v7 implements com.yandex.passport.data.network.core.d {
    public final com.yandex.passport.data.network.core.t a;
    public final com.yandex.passport.data.network.core.l b;

    public v7(com.yandex.passport.data.network.core.t tVar, com.yandex.passport.data.network.core.l lVar) {
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
    public final Object a(t7 t7Var, cg6 cg6Var) {
        u7 u7Var;
        int i;
        com.yandex.passport.common.network.n nVar;
        if (cg6Var instanceof u7) {
            u7Var = (u7) cg6Var;
            int i2 = u7Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u7Var.m = i2 - Integer.MIN_VALUE;
                Object obj = u7Var.k;
                nm6 nm6Var = nm6.a;
                i = u7Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.common.network.n nVar2 = new com.yandex.passport.common.network.n((String) this.a.a(t7Var.a, null).b, 0);
                    nVar2.J("/1/am/sso/config.json");
                    u7Var.j = nVar2;
                    u7Var.m = 1;
                    if (this.b.b(nVar2, u7Var) == nm6Var) {
                        return nm6Var;
                    }
                    nVar = nVar2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nVar = u7Var.j;
                    qgg.h0(obj);
                }
                return nVar.z();
            }
        }
        u7Var = new u7(this, cg6Var);
        Object obj2 = u7Var.k;
        nm6 nm6Var2 = nm6.a;
        i = u7Var.m;
        if (i != 0) {
        }
        return nVar.z();
    }
}
