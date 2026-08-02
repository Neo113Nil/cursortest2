package com.yandex.passport.data.network;

/* loaded from: classes4.dex */
public final class v extends com.yandex.passport.data.network.core.h {
    public final /* synthetic */ int i = 1;
    public final com.yandex.passport.data.network.core.d j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.j0 j0Var, com.yandex.passport.internal.network.b bVar, r rVar, com.yandex.passport.data.network.core.s sVar) {
        super(aVar, bVar, j0Var, u.Companion.serializer(), sVar, "AuthorizeByXTokenRequest");
        aVar.getClass();
        j0Var.getClass();
        bVar.getClass();
        rVar.getClass();
        sVar.getClass();
        this.j = rVar;
    }

    @Override // com.yandex.passport.data.network.core.b
    public final com.yandex.passport.data.network.core.d u() {
        switch (this.i) {
            case 0:
                return (r) this.j;
            default:
                return (ac) this.j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.network.j0 j0Var, com.yandex.passport.internal.network.b bVar, ac acVar, com.yandex.passport.data.network.core.s sVar) {
        super(aVar, bVar, j0Var, dc.Companion.serializer(), sVar, "UpdateAvatarRequest");
        aVar.getClass();
        j0Var.getClass();
        bVar.getClass();
        acVar.getClass();
        sVar.getClass();
        this.j = acVar;
    }
}
