package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.z1;
import com.yandex.passport.internal.methods.u4;
import com.yandex.passport.internal.methods.v5;

/* loaded from: classes4.dex */
public final class t0 implements z0 {
    public final com.yandex.passport.internal.core.accounts.e a;
    public final com.yandex.passport.data.network.core.s b;

    public t0(com.yandex.passport.internal.core.accounts.e eVar, com.yandex.passport.data.network.core.s sVar) {
        eVar.getClass();
        sVar.getClass();
        this.a = eVar;
        this.b = sVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        return com.yandex.passport.internal.ui.a.A(new b(this, com.yandex.plus.pay.ui.core.b.L((z1) ((u4) v5Var).c.c), null, 18));
    }
}
