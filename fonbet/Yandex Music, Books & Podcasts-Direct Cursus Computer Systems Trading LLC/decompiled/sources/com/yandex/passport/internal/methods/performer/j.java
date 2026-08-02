package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.v5;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class j implements z0 {
    public final com.yandex.passport.internal.account.d a;

    public j(com.yandex.passport.internal.account.d dVar) {
        dVar.getClass();
        this.a = dVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        com.yandex.passport.internal.methods.f0 f0Var = (com.yandex.passport.internal.methods.f0) v5Var;
        try {
            r7o r7oVar = z7o.b;
            return com.yandex.plus.core.locale.b.B(this.a.c(com.yandex.plus.core.network.api.utils.a.L((com.yandex.passport.api.impl.b) f0Var.c.c), (String) f0Var.d.c, com.yandex.passport.internal.analytics.a.w));
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            return new t7o(th);
        }
    }
}
