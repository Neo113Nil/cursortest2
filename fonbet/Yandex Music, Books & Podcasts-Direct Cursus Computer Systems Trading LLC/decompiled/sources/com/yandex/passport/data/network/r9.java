package com.yandex.passport.data.network;

/* loaded from: classes4.dex */
public final class r9 extends com.yandex.passport.data.network.core.h {
    public final q9 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.j0 j0Var, com.yandex.passport.internal.network.b bVar, q9 q9Var, com.yandex.passport.data.network.core.s sVar) {
        super(aVar, bVar, j0Var, com.yandex.passport.data.models.q.Companion.serializer(), sVar, "PhonishToNeophonishRequest");
        aVar.getClass();
        j0Var.getClass();
        bVar.getClass();
        q9Var.getClass();
        sVar.getClass();
        this.i = q9Var;
    }

    @Override // com.yandex.passport.data.network.core.b
    public final com.yandex.passport.data.network.core.d u() {
        return this.i;
    }
}
