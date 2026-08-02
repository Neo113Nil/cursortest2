package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.v5;

/* loaded from: classes4.dex */
public final class k implements z0 {
    public final com.yandex.passport.internal.account.d a;
    public final com.yandex.passport.data.network.token.i b;

    public k(com.yandex.passport.internal.account.d dVar, com.yandex.passport.data.network.token.i iVar) {
        dVar.getClass();
        this.a = dVar;
        this.b = iVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        return com.yandex.passport.internal.ui.a.A(new b(this, (com.yandex.passport.internal.methods.h0) v5Var, null, 7));
    }
}
