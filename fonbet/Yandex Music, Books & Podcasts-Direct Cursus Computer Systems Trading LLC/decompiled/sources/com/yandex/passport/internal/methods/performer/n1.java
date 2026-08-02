package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.o5;
import com.yandex.passport.internal.methods.v5;
import com.yandex.passport.internal.usecase.o2;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class n1 implements z0 {
    public final o2 a;
    public final com.yandex.passport.data.network.token.i b;

    public n1(o2 o2Var, com.yandex.passport.data.network.token.i iVar) {
        o2Var.getClass();
        this.a = o2Var;
        this.b = iVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        Object A = com.yandex.passport.internal.ui.a.A(new b((o5) v5Var, this, null, 25));
        Throwable a = z7o.a(A);
        if (a == null) {
            return A;
        }
        try {
            throw com.yandex.passport.data.network.token.i.j(this.b, a, null, null, null, null, null, 62);
        } catch (Throwable th) {
            r7o r7oVar = z7o.b;
            return new t7o(th);
        }
    }
}
