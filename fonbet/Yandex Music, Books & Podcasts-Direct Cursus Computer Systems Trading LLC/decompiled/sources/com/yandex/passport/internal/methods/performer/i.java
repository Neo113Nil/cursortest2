package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.v5;

/* loaded from: classes4.dex */
public final class i implements z0 {
    public final com.yandex.passport.internal.usecase.authorize.l a;
    public final com.yandex.passport.data.network.token.i b;

    public i(com.yandex.passport.internal.usecase.authorize.l lVar, com.yandex.passport.data.network.token.i iVar) {
        lVar.getClass();
        this.a = lVar;
        this.b = iVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        return com.yandex.passport.internal.ui.a.A(new b(this, (com.yandex.passport.internal.methods.g0) v5Var, null, 6));
    }
}
