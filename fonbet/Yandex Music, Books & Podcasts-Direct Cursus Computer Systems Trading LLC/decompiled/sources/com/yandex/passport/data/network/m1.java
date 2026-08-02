package com.yandex.passport.data.network;

/* loaded from: classes4.dex */
public final class m1 extends com.yandex.passport.data.network.core.g {
    public final g f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.j0 j0Var, com.yandex.passport.internal.network.b bVar, g gVar) {
        super(aVar, bVar, j0Var, l1.Companion.serializer());
        aVar.getClass();
        j0Var.getClass();
        bVar.getClass();
        gVar.getClass();
        this.f = gVar;
    }

    @Override // com.yandex.passport.data.network.core.b
    public final com.yandex.passport.data.network.core.d u() {
        return this.f;
    }
}
