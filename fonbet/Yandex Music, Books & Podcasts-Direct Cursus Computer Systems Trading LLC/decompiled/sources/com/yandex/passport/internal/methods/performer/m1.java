package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.data.network.n8;
import com.yandex.passport.internal.methods.n4;
import com.yandex.passport.internal.methods.v5;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.wzv;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class m1 implements z0 {
    public final n8 a;
    public final com.yandex.passport.data.network.token.i b;
    public final com.yandex.passport.internal.link_auth.d c;
    public final com.yandex.passport.internal.report.reporters.e0 d;
    public final com.yandex.passport.internal.network.mappers.b e;

    public m1(n8 n8Var, com.yandex.passport.data.network.token.i iVar, com.yandex.passport.internal.link_auth.d dVar, com.yandex.passport.internal.report.reporters.e0 e0Var, com.yandex.passport.internal.network.mappers.b bVar) {
        n8Var.getClass();
        dVar.getClass();
        e0Var.getClass();
        bVar.getClass();
        this.a = n8Var;
        this.b = iVar;
        this.c = dVar;
        this.d = e0Var;
        this.e = bVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        Object A = com.yandex.passport.internal.ui.a.A(new wzv((n4) v5Var, this, null, 26));
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
