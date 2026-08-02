package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.z1;
import com.yandex.passport.internal.methods.v4;
import com.yandex.passport.internal.methods.v5;

/* loaded from: classes4.dex */
public final class u0 implements z0 {
    public final com.yandex.passport.internal.usecase.k0 a;
    public final com.yandex.passport.internal.usecase.m1 b;

    public u0(com.yandex.passport.internal.usecase.k0 k0Var, com.yandex.passport.internal.usecase.m1 m1Var) {
        k0Var.getClass();
        m1Var.getClass();
        this.a = k0Var;
        this.b = m1Var;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        return com.yandex.passport.internal.ui.a.A(new b(this, com.yandex.plus.pay.ui.core.b.L((z1) ((v4) v5Var).c.c), null, 19));
    }
}
