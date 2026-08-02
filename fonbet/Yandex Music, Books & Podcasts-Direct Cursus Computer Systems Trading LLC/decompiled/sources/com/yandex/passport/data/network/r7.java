package com.yandex.passport.data.network;

/* loaded from: classes4.dex */
public final class r7 extends com.yandex.passport.data.network.core.g {
    public final n7 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.j0 j0Var, com.yandex.passport.internal.network.b bVar, n7 n7Var) {
        super(aVar, bVar, j0Var, q7.Companion.serializer());
        aVar.getClass();
        j0Var.getClass();
        bVar.getClass();
        n7Var.getClass();
        this.f = n7Var;
    }

    @Override // com.yandex.passport.data.network.core.b
    public final com.yandex.passport.data.network.core.d u() {
        return this.f;
    }
}
