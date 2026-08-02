package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.v5;

/* loaded from: classes4.dex */
public final class e implements z0 {
    public final com.yandex.passport.internal.usecase.authorize.r a;
    public final com.yandex.passport.data.network.token.i b;
    public final com.yandex.passport.internal.report.reporters.e0 c;

    public e(com.yandex.passport.internal.usecase.authorize.r rVar, com.yandex.passport.data.network.token.i iVar, com.yandex.passport.internal.report.reporters.e0 e0Var) {
        rVar.getClass();
        e0Var.getClass();
        this.a = rVar;
        this.b = iVar;
        this.c = e0Var;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        return com.yandex.passport.internal.ui.a.A(new b((com.yandex.passport.internal.methods.b0) v5Var, this, null, 2));
    }
}
