package com.yandex.passport.data.network;

/* loaded from: classes4.dex */
public final class ha extends com.yandex.passport.data.network.core.o {
    public final g i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.j0 j0Var, com.yandex.passport.internal.network.b bVar, com.yandex.passport.common.core.a aVar2, com.yandex.passport.common.core.a aVar3, g gVar, com.yandex.passport.data.network.core.s sVar) {
        super(aVar, bVar, (com.yandex.passport.common.domain.a) j0Var, (com.yandex.passport.data.network.core.e) aVar2, (com.yandex.passport.data.network.core.f) aVar3, sVar, "RevokeMasterTokenRequest");
        aVar.getClass();
        j0Var.getClass();
        bVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        gVar.getClass();
        sVar.getClass();
        this.i = gVar;
    }

    @Override // com.yandex.passport.data.network.core.b
    public final com.yandex.passport.data.network.core.d u() {
        return this.i;
    }
}
