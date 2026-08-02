package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.r5;
import com.yandex.passport.internal.methods.v5;
import com.yandex.passport.internal.usecase.v2;

/* loaded from: classes4.dex */
public final class q1 implements z0 {
    public final v2 a;
    public final com.yandex.passport.data.network.token.i b;

    public q1(v2 v2Var, com.yandex.passport.data.network.token.i iVar) {
        v2Var.getClass();
        this.a = v2Var;
        this.b = iVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        return com.yandex.passport.internal.ui.a.A(new b((r5) v5Var, this, null, 26));
    }
}
