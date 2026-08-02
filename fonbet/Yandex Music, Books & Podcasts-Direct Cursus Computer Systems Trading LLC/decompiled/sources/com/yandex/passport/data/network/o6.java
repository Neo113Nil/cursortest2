package com.yandex.passport.data.network;

import defpackage.t9f;

/* loaded from: classes4.dex */
public final class o6 extends com.yandex.passport.data.network.core.o {
    public final g i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o6(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.j0 j0Var, com.yandex.passport.internal.network.b bVar, g gVar, com.yandex.passport.data.network.core.s sVar) {
        super(aVar, bVar, (com.yandex.passport.common.domain.a) j0Var, (com.yandex.passport.data.network.core.e) new com.yandex.passport.common.network.n(r0, com.yandex.passport.common.network.u.Companion.serializer()), (com.yandex.passport.data.network.core.f) new com.yandex.passport.common.core.a(27), sVar, "GetCookieByTokenRequest");
        aVar.getClass();
        j0Var.getClass();
        bVar.getClass();
        gVar.getClass();
        sVar.getClass();
        t9f serializer = n6.Companion.serializer();
        serializer.getClass();
        this.i = gVar;
    }

    @Override // com.yandex.passport.data.network.core.b
    public final com.yandex.passport.data.network.core.d u() {
        return this.i;
    }
}
