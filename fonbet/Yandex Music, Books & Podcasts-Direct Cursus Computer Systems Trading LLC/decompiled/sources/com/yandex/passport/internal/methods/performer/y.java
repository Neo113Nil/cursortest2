package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.v3;
import com.yandex.passport.internal.methods.v5;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class y implements z0 {
    public final com.yandex.passport.internal.usecase.n0 a;
    public final com.yandex.passport.data.network.token.i b;

    public y(com.yandex.passport.internal.usecase.n0 n0Var, com.yandex.passport.data.network.token.i iVar) {
        n0Var.getClass();
        this.a = n0Var;
        this.b = iVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        Object A = com.yandex.passport.internal.ui.a.A(new b((v3) v5Var, this, null, 10));
        Throwable a = z7o.a(A);
        if (a == null) {
            return A;
        }
        try {
            com.yandex.passport.data.network.token.i iVar = this.b;
            String localizedMessage = a.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = "";
            }
            throw com.yandex.passport.data.network.token.i.j(iVar, a, null, new com.yandex.passport.api.exception.k(localizedMessage), null, null, null, 58);
        } catch (Throwable th) {
            r7o r7oVar = z7o.b;
            return new t7o(th);
        }
    }
}
