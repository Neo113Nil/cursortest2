package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.v5;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class b0 implements z0 {
    public final com.yandex.passport.internal.account.a a;

    public b0(com.yandex.passport.internal.account.a aVar) {
        aVar.getClass();
        this.a = aVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        try {
            r7o r7oVar = z7o.b;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "getCurrentAccount", 8);
            }
            com.yandex.passport.internal.l a = this.a.a();
            if (a != null) {
                return com.yandex.plus.core.locale.b.B(a);
            }
            return null;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            return new t7o(th);
        }
    }
}
