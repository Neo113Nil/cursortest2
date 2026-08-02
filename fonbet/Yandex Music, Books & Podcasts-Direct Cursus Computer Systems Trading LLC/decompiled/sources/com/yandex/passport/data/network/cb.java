package com.yandex.passport.data.network;

import defpackage.t9f;

/* loaded from: classes4.dex */
public final class cb extends com.yandex.passport.data.network.core.b {
    public final g f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cb(com.yandex.passport.common.core.a aVar, com.yandex.passport.common.coroutine.a aVar2, com.yandex.passport.common.network.j0 j0Var, g gVar, com.yandex.passport.internal.network.b bVar) {
        super(aVar2, bVar, j0Var, new com.yandex.passport.common.network.n(r0, com.yandex.passport.common.network.u.Companion.serializer()), aVar);
        aVar2.getClass();
        j0Var.getClass();
        bVar.getClass();
        aVar.getClass();
        gVar.getClass();
        t9f serializer = bb.Companion.serializer();
        serializer.getClass();
        this.f = gVar;
    }

    @Override // com.yandex.passport.data.network.core.b
    public final com.yandex.passport.data.network.core.d u() {
        return this.f;
    }
}
