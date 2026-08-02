package com.yandex.passport.data.network;

import defpackage.t9f;

/* loaded from: classes4.dex */
public final class m extends com.yandex.passport.data.network.core.b {
    public final g f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.j0 j0Var, com.yandex.passport.internal.network.b bVar, l lVar, g gVar) {
        super(aVar, bVar, j0Var, new com.yandex.passport.common.network.n(r0, r1), lVar);
        aVar.getClass();
        j0Var.getClass();
        bVar.getClass();
        lVar.getClass();
        gVar.getClass();
        k kVar = new k(j.Companion.serializer());
        t9f serializer = d.Companion.serializer();
        serializer.getClass();
        this.f = gVar;
    }

    @Override // com.yandex.passport.data.network.core.b
    public final com.yandex.passport.data.network.core.d u() {
        return this.f;
    }
}
