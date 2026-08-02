package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.z1;
import com.yandex.passport.internal.methods.c4;
import com.yandex.passport.internal.methods.v5;
import com.yandex.passport.internal.report.e5;
import com.yandex.passport.internal.report.f5;
import com.yandex.passport.internal.report.ue;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.wzv;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class e0 implements z0 {
    public final com.yandex.passport.internal.database.auth_cookie.b a;
    public final com.yandex.passport.data.network.token.i b;
    public final com.yandex.passport.internal.report.reporters.p c;

    public e0(com.yandex.passport.internal.database.auth_cookie.b bVar, com.yandex.passport.data.network.token.i iVar, com.yandex.passport.internal.report.reporters.p pVar) {
        bVar.getClass();
        pVar.getClass();
        this.a = bVar;
        this.b = iVar;
        this.c = pVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        com.yandex.passport.common.core.f L = com.yandex.plus.pay.ui.core.b.L((z1) ((c4) v5Var).c.c);
        com.yandex.passport.internal.report.reporters.p pVar = this.c;
        pVar.getClass();
        f5 f5Var = f5.d;
        long j = L.b;
        pVar.n(f5Var, new com.yandex.passport.internal.report.c(Long.valueOf(j)));
        Object z = com.yandex.passport.internal.ui.a.z(new wzv(this, L, null, 23));
        Throwable a = z7o.a(z);
        if (a == null) {
            return z;
        }
        try {
            pVar.n(e5.d, new com.yandex.passport.internal.report.c(Long.valueOf(j)), new ue(a));
            throw com.yandex.passport.data.network.token.i.j(this.b, a, null, null, null, null, null, 62);
        } catch (Throwable th) {
            r7o r7oVar = z7o.b;
            return new t7o(th);
        }
    }
}
