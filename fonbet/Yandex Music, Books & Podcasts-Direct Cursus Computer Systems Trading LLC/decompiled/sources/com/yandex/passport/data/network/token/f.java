package com.yandex.passport.data.network.token;

import com.yandex.passport.data.network.ac;

/* loaded from: classes4.dex */
public final class f extends com.yandex.passport.data.network.core.o {
    public final ac i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.j0 j0Var, com.yandex.passport.internal.network.b bVar, com.yandex.passport.common.core.a aVar2, com.yandex.passport.common.core.a aVar3, ac acVar, com.yandex.passport.data.network.core.s sVar) {
        super(aVar, bVar, j0Var, (com.yandex.passport.data.network.core.e) aVar2, (com.yandex.passport.data.network.core.f) aVar3, sVar, "GetMasterTokenByCodeRequest");
        aVar.getClass();
        j0Var.getClass();
        bVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        acVar.getClass();
        sVar.getClass();
        this.i = acVar;
    }

    @Override // com.yandex.passport.data.network.core.b
    public final com.yandex.passport.data.network.core.d u() {
        return this.i;
    }
}
