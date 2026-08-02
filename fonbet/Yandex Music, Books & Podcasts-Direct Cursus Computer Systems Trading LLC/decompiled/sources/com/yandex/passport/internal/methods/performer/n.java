package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.h3;
import com.yandex.passport.internal.methods.v5;
import defpackage.j9w;
import defpackage.t7o;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class n implements z0 {
    public final com.yandex.passport.internal.core.tokens.b a;

    public n(com.yandex.passport.internal.core.tokens.b bVar) {
        bVar.getClass();
        this.a = bVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        Object z = com.yandex.passport.internal.ui.a.z(new j9w(this, (h3) v5Var, null, 17));
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
