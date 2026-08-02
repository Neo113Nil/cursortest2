package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.l3;
import com.yandex.passport.internal.methods.v5;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class q implements z0 {
    public final com.yandex.passport.internal.core.accounts.e a;

    public q(com.yandex.passport.internal.core.accounts.e eVar) {
        eVar.getClass();
        this.a = eVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        com.yandex.passport.internal.methods.b bVar = ((l3) v5Var).c;
        String str = (String) bVar.c;
        com.yandex.passport.common.logger.b bVar2 = com.yandex.passport.common.logger.b.b;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(bVar2, null, "getAccount: accountName=" + str, 10);
        }
        com.yandex.passport.internal.l f = this.a.a().f(str);
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(bVar2, null, "getAccount: account=" + f, 10);
        }
        try {
            r7o r7oVar = z7o.b;
            if (f != null) {
                return com.yandex.plus.core.locale.b.B(f);
            }
            throw new com.yandex.passport.api.exception.b("name", (String) bVar.c);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            return new t7o(th);
        }
    }
}
