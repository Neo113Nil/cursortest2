package com.yandex.passport.internal.autologin;

import com.yandex.passport.api.x;
import com.yandex.passport.internal.methods.p5;
import com.yandex.passport.internal.methods.performer.z0;
import com.yandex.passport.internal.methods.v5;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.n1;
import com.yandex.passport.internal.report.x1;
import defpackage.jk6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.rhw;
import defpackage.t7o;
import defpackage.z7o;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class d implements z0 {
    public final k a;
    public final com.yandex.passport.internal.core.accounts.e b;
    public final com.yandex.passport.internal.report.reporters.i c;
    public final com.yandex.passport.data.network.token.i d;
    public final com.yandex.passport.internal.filter.l e;

    public d(k kVar, com.yandex.passport.internal.core.accounts.e eVar, com.yandex.passport.internal.report.reporters.i iVar, com.yandex.passport.data.network.token.i iVar2, com.yandex.passport.internal.filter.l lVar) {
        kVar.getClass();
        eVar.getClass();
        iVar.getClass();
        lVar.getClass();
        this.a = kVar;
        this.b = eVar;
        this.c = iVar;
        this.d = iVar2;
        this.e = lVar;
    }

    public final com.yandex.passport.internal.account.f a(com.yandex.passport.internal.properties.g gVar) {
        gVar.getClass();
        x xVar = gVar.c;
        Object A = com.yandex.passport.internal.ui.a.A(new rhw(this, gVar, (Continuation) null, 18));
        r7o r7oVar = z7o.b;
        boolean z = A instanceof t7o;
        com.yandex.passport.internal.report.reporters.i iVar = this.c;
        if (!z) {
            com.yandex.passport.internal.l lVar = (com.yandex.passport.internal.l) A;
            if (lVar == null) {
                com.yandex.passport.api.exception.d dVar = new com.yandex.passport.api.exception.d("Failed perform autologin: autologin in founded accounts is disabled or can't get token");
                iVar.getClass();
                xVar.getClass();
                iVar.n(n1.d, new com.yandex.passport.internal.report.a(xVar), new ff(dVar));
                throw dVar;
            }
            long j = lVar.b.b;
            iVar.getClass();
            xVar.getClass();
            iVar.n(x1.d, new com.yandex.passport.internal.report.a(xVar), new com.yandex.passport.internal.report.c(String.valueOf(j), 3));
            A = com.yandex.plus.core.locale.b.B(lVar);
        }
        Throwable a = z7o.a(A);
        if (a != null) {
            try {
                Throwable j2 = com.yandex.passport.data.network.token.i.j(this.d, a, null, null, null, null, null, 62);
                iVar.getClass();
                xVar.getClass();
                iVar.n(n1.d, new com.yandex.passport.internal.report.a(xVar), new ff(a));
                throw j2;
            } catch (Throwable th) {
                r7o r7oVar2 = z7o.b;
                A = new t7o(th);
            }
        }
        qgg.h0(A);
        return (com.yandex.passport.internal.account.f) A;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        p5 p5Var = (p5) v5Var;
        try {
            r7o r7oVar = z7o.b;
            return a((com.yandex.passport.internal.properties.g) new jk6(0, 6, p5.class, p5Var, "properties", "getProperties()Lcom/yandex/passport/internal/properties/AutoLoginProperties;").get());
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            return new t7o(th);
        }
    }
}
