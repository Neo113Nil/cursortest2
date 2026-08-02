package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.v5;

/* loaded from: classes4.dex */
public final class d implements z0 {
    public final com.yandex.passport.internal.usecase.b a;
    public final com.yandex.passport.data.network.token.i b;

    public d(com.yandex.passport.internal.usecase.b bVar, com.yandex.passport.data.network.token.i iVar) {
        bVar.getClass();
        this.a = bVar;
        this.b = iVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        return com.yandex.passport.internal.ui.a.A(new b((com.yandex.passport.internal.methods.a0) v5Var, this, null, 1));
    }
}
