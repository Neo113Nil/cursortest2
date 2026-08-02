package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.s3;
import com.yandex.passport.internal.methods.v5;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.wzv;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class u implements z0 {
    public final com.yandex.passport.internal.usecase.e0 a;
    public final com.yandex.passport.data.network.token.i b;
    public final com.yandex.passport.common.ui.lang.b c;
    public final com.yandex.passport.internal.report.reporters.d0 d;

    public u(com.yandex.passport.internal.usecase.e0 e0Var, com.yandex.passport.data.network.token.i iVar, com.yandex.passport.common.ui.lang.b bVar, com.yandex.passport.internal.report.reporters.d0 d0Var) {
        e0Var.getClass();
        bVar.getClass();
        d0Var.getClass();
        this.a = e0Var;
        this.b = iVar;
        this.c = bVar;
        this.d = d0Var;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        s3 s3Var = (s3) v5Var;
        Object A = com.yandex.passport.internal.ui.a.A(new wzv(s3Var, this, null, 22));
        Throwable a = z7o.a(A);
        if (a == null) {
            return A;
        }
        try {
            this.d.v(String.valueOf(a.getMessage()), String.valueOf(s3Var.d().a.b), s3Var.d().d);
            throw com.yandex.passport.data.network.token.i.j(this.b, a, null, null, null, null, null, 62);
        } catch (Throwable th) {
            r7o r7oVar = z7o.b;
            return new t7o(th);
        }
    }
}
