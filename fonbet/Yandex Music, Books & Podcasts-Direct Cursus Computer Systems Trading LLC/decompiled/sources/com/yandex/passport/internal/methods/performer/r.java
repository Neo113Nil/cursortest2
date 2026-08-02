package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.m3;
import com.yandex.passport.internal.methods.v5;
import defpackage.j9w;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class r implements z0 {
    public final com.yandex.passport.internal.core.accounts.e a;

    public r(com.yandex.passport.internal.core.accounts.e eVar) {
        eVar.getClass();
        this.a = eVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        m3 m3Var = (m3) v5Var;
        Object z = com.yandex.passport.internal.ui.a.z(new j9w(m3Var, this, null, 18));
        com.yandex.passport.common.logger.b bVar = com.yandex.passport.common.logger.b.b;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            StringBuilder sb = new StringBuilder("Got an account with uid={");
            sb.append(m3Var);
            sb.append(".uid} and success=");
            r7o r7oVar = z7o.b;
            sb.append(!(z instanceof t7o));
            com.yandex.passport.common.logger.a.c(bVar, null, sb.toString(), 10);
        }
        return z;
    }
}
