package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.d3;
import com.yandex.passport.internal.methods.v5;
import defpackage.j9w;
import defpackage.t7o;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class l implements z0 {
    public final com.yandex.passport.internal.core.accounts.e a;
    public final com.yandex.passport.internal.core.accounts.i b;

    public l(com.yandex.passport.internal.core.accounts.e eVar, com.yandex.passport.internal.core.accounts.i iVar) {
        eVar.getClass();
        iVar.getClass();
        this.a = eVar;
        this.b = iVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        Object z = com.yandex.passport.internal.ui.a.z(new j9w((d3) v5Var, this, null, 16));
        Throwable a = z7o.a(z);
        if (a == null) {
            return z;
        }
        try {
            throw a;
        } catch (Throwable th) {
            return new t7o(th);
        }
    }
}
