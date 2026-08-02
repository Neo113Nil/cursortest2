package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.k3;
import com.yandex.passport.internal.methods.v5;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class p implements z0 {
    public final com.yandex.passport.internal.core.accounts.e a;

    public p(com.yandex.passport.internal.core.accounts.e eVar) {
        eVar.getClass();
        this.a = eVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        com.yandex.passport.internal.methods.b bVar = ((k3) v5Var).c;
        String str = (String) bVar.c;
        com.yandex.passport.common.logger.b bVar2 = com.yandex.passport.common.logger.b.b;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(bVar2, null, "getAccount: machineReadableLogin=" + str, 10);
        }
        com.yandex.passport.internal.l c = this.a.a().c(str);
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(bVar2, null, "getAccount: account=" + c, 10);
        }
        try {
            r7o r7oVar = z7o.b;
            if (c != null) {
                return com.yandex.plus.core.locale.b.B(c);
            }
            throw new com.yandex.passport.api.exception.b("machineReadableLogin", (String) bVar.c);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            return new t7o(th);
        }
    }
}
