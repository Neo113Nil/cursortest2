package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.z1;
import com.yandex.passport.internal.methods.m4;
import com.yandex.passport.internal.methods.v5;
import defpackage.jk6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.wzv;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class o0 implements z0 {
    public final com.yandex.passport.internal.core.accounts.e a;
    public final com.yandex.passport.internal.usecase.s0 b;
    public final com.yandex.passport.data.network.token.i c;

    public o0(com.yandex.passport.internal.core.accounts.e eVar, com.yandex.passport.internal.usecase.s0 s0Var, com.yandex.passport.data.network.token.i iVar) {
        eVar.getClass();
        s0Var.getClass();
        this.a = eVar;
        this.b = s0Var;
        this.c = iVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        m4 m4Var = (m4) v5Var;
        try {
            r7o r7oVar = z7o.b;
            Object A = com.yandex.passport.internal.ui.a.A(new wzv(this, com.yandex.plus.pay.ui.core.b.L((z1) m4Var.c.c), (com.yandex.passport.internal.credentials.f) new jk6(0, 7, m4.class, m4Var, "clientCredentials", "getClientCredentials()Lcom/yandex/passport/internal/credentials/ClientCredentials;").get(), null, 24));
            Throwable a = z7o.a(A);
            if (a != null) {
                try {
                    throw com.yandex.passport.data.network.token.i.j(this.c, a, null, null, null, null, new com.yandex.passport.api.exception.c(), 30);
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    A = new t7o(th);
                }
            }
            qgg.h0(A);
            return (com.yandex.passport.internal.entities.e) A;
        } catch (Throwable th2) {
            r7o r7oVar3 = z7o.b;
            return new t7o(th2);
        }
    }
}
