package com.yandex.passport.data.network;

import defpackage.t9f;

/* loaded from: classes4.dex */
public final class n8 extends com.yandex.passport.data.network.core.b {
    public final n7 f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n8(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.j0 j0Var, com.yandex.passport.internal.network.b bVar, com.yandex.passport.common.core.a aVar2, n7 n7Var) {
        super(aVar, bVar, j0Var, new com.yandex.passport.common.network.n(r0, com.yandex.passport.common.network.u.Companion.serializer()), aVar2);
        aVar.getClass();
        j0Var.getClass();
        bVar.getClass();
        aVar2.getClass();
        n7Var.getClass();
        t9f serializer = h8.Companion.serializer();
        serializer.getClass();
        this.f = n7Var;
    }

    @Override // com.yandex.passport.data.network.core.b
    public final com.yandex.passport.data.network.core.d u() {
        return this.f;
    }
}
