package com.yandex.passport.data.network;

/* loaded from: classes4.dex */
public final class g2 extends com.yandex.passport.data.network.core.h {
    public final g i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.j0 j0Var, com.yandex.passport.internal.network.b bVar, g gVar, com.yandex.passport.data.network.core.s sVar) {
        super(aVar, bVar, j0Var, f2.Companion.serializer(), sVar, "DisablePhonishRequest");
        aVar.getClass();
        j0Var.getClass();
        bVar.getClass();
        gVar.getClass();
        sVar.getClass();
        this.i = gVar;
    }

    @Override // com.yandex.passport.data.network.core.b
    public final com.yandex.passport.data.network.core.d u() {
        return this.i;
    }
}
