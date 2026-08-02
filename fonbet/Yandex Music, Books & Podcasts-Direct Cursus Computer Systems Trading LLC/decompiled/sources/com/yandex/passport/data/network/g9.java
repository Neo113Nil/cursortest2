package com.yandex.passport.data.network;

import defpackage.itv;
import defpackage.rhw;

/* loaded from: classes4.dex */
public final class g9 extends com.yandex.passport.data.network.core.b {
    public final z8 f;
    public final com.yandex.passport.data.network.core.x g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.j0 j0Var, com.yandex.passport.internal.network.b bVar, d9 d9Var, com.yandex.passport.common.core.a aVar2, z8 z8Var, com.yandex.passport.data.network.core.x xVar) {
        super(aVar, bVar, j0Var, d9Var, aVar2);
        aVar.getClass();
        j0Var.getClass();
        bVar.getClass();
        d9Var.getClass();
        aVar2.getClass();
        z8Var.getClass();
        xVar.getClass();
        this.f = z8Var;
        this.g = xVar;
    }

    @Override // com.yandex.passport.data.network.core.b, androidx.core.app.n0
    /* renamed from: s */
    public final Object x(Object obj, rhw rhwVar) {
        x8 x8Var = (x8) obj;
        return this.g.g(new com.yandex.passport.data.network.core.v(x8Var, "GetUserInfoRequest", new itv(18, this, x8Var)), rhwVar);
    }

    @Override // com.yandex.passport.data.network.core.b
    public final com.yandex.passport.data.network.core.d u() {
        return this.f;
    }

    @Override // com.yandex.passport.data.network.core.b
    /* renamed from: v */
    public final Object x(Object obj, rhw rhwVar) {
        x8 x8Var = (x8) obj;
        return this.g.g(new com.yandex.passport.data.network.core.v(x8Var, "GetUserInfoRequest", new itv(18, this, x8Var)), rhwVar);
    }
}
