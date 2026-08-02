package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.v5;

/* loaded from: classes4.dex */
public final class h implements z0 {
    public final com.yandex.passport.internal.usecase.authorize.i a;
    public final com.yandex.passport.data.network.token.i b;

    public h(com.yandex.passport.internal.usecase.authorize.i iVar, com.yandex.passport.data.network.token.i iVar2) {
        iVar.getClass();
        this.a = iVar;
        this.b = iVar2;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        return com.yandex.passport.internal.ui.a.A(new b((com.yandex.passport.internal.methods.e0) v5Var, this, null, 5));
    }
}
