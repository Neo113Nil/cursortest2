package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.v5;

/* loaded from: classes4.dex */
public final class f implements z0 {
    public final com.yandex.passport.internal.usecase.authorize.f a;
    public final com.yandex.passport.data.network.token.i b;

    public f(com.yandex.passport.internal.usecase.authorize.f fVar, com.yandex.passport.data.network.token.i iVar) {
        fVar.getClass();
        this.a = fVar;
        this.b = iVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        return com.yandex.passport.internal.ui.a.A(new b(this, (com.yandex.passport.internal.methods.c0) v5Var, null, 3));
    }
}
