package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.v5;

/* loaded from: classes4.dex */
public final class g implements z0 {
    public final com.yandex.passport.internal.usecase.authorize.c a;
    public final com.yandex.passport.data.network.token.i b;

    public g(com.yandex.passport.internal.usecase.authorize.c cVar, com.yandex.passport.data.network.token.i iVar) {
        cVar.getClass();
        this.a = cVar;
        this.b = iVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        return com.yandex.passport.internal.ui.a.A(new b(this, (com.yandex.passport.internal.methods.d0) v5Var, null, 4));
    }
}
