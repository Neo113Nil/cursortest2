package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.f5;
import com.yandex.passport.internal.methods.v5;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class g1 implements z0 {
    public final com.yandex.passport.internal.core.accounts.y a;
    public final com.yandex.passport.internal.core.accounts.p b;

    public g1(com.yandex.passport.internal.core.accounts.y yVar, com.yandex.passport.internal.core.accounts.p pVar) {
        yVar.getClass();
        pVar.getClass();
        this.a = yVar;
        this.b = pVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        Object z = com.yandex.passport.internal.ui.a.z(new b((f5) v5Var, this, null, 21));
        Throwable a = z7o.a(z);
        if (a != null && com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.c, null, "removeAccountUseCase executing failed: " + a.getMessage(), 8);
        }
        return z;
    }
}
