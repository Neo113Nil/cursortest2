package com.yandex.passport.data.network;

import defpackage.t9f;

/* loaded from: classes4.dex */
public final class c0 extends com.yandex.passport.data.network.core.b {
    public final g f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c0(com.yandex.passport.common.core.a aVar, com.yandex.passport.common.coroutine.a aVar2, com.yandex.passport.common.network.j0 j0Var, g gVar, com.yandex.passport.internal.network.b bVar) {
        super(aVar2, bVar, j0Var, new com.yandex.passport.common.network.n(r0, r1), aVar);
        aVar2.getClass();
        j0Var.getClass();
        bVar.getClass();
        gVar.getClass();
        aVar.getClass();
        t9f serializer = b0.Companion.serializer();
        t9f serializer2 = com.yandex.passport.common.network.g0.Companion.serializer();
        serializer.getClass();
        serializer2.getClass();
        this.f = gVar;
    }

    @Override // com.yandex.passport.data.network.core.b
    public final com.yandex.passport.data.network.core.d u() {
        return this.f;
    }
}
