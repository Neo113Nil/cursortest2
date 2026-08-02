package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.h4;
import com.yandex.passport.internal.methods.v5;
import defpackage.j9w;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class j0 implements z0 {
    public final com.yandex.passport.internal.helper.j a;
    public final com.yandex.passport.data.network.token.i b;

    public j0(com.yandex.passport.internal.helper.j jVar, com.yandex.passport.data.network.token.i iVar) {
        jVar.getClass();
        this.a = jVar;
        this.b = iVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        Object z = com.yandex.passport.internal.ui.a.z(new j9w((h4) v5Var, this, null, 19));
        Throwable a = z7o.a(z);
        if (a == null) {
            return z;
        }
        try {
            com.yandex.passport.data.network.token.i iVar = this.b;
            String message = a.getMessage();
            if (message == null) {
                message = "";
            }
            throw com.yandex.passport.data.network.token.i.j(iVar, a, null, null, null, null, new com.yandex.passport.api.exception.k(message), 30);
        } catch (Throwable th) {
            r7o r7oVar = z7o.b;
            return new t7o(th);
        }
    }
}
