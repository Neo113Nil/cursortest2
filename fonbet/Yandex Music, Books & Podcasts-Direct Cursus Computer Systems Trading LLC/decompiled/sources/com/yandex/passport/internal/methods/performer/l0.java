package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.data.network.r7;
import com.yandex.passport.internal.methods.j4;
import com.yandex.passport.internal.methods.v5;
import com.yandex.passport.internal.report.d8;
import com.yandex.passport.internal.report.ff;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class l0 implements z0 {
    public final r7 a;
    public final com.yandex.passport.data.network.token.i b;
    public final com.yandex.passport.internal.report.reporters.e0 c;
    public final com.yandex.passport.internal.network.mappers.b d;

    public l0(r7 r7Var, com.yandex.passport.data.network.token.i iVar, com.yandex.passport.internal.report.reporters.e0 e0Var, com.yandex.passport.internal.network.mappers.b bVar) {
        r7Var.getClass();
        e0Var.getClass();
        bVar.getClass();
        this.a = r7Var;
        this.b = iVar;
        this.c = e0Var;
        this.d = bVar;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        Object z = com.yandex.passport.internal.ui.a.z(new b((j4) v5Var, this, null, 17));
        Throwable a = z7o.a(z);
        if (a == null) {
            return z;
        }
        try {
            com.yandex.passport.internal.report.reporters.e0 e0Var = this.c;
            e0Var.getClass();
            e0Var.n(d8.d, new ff(a));
            throw com.yandex.passport.data.network.token.i.j(this.b, a, null, null, null, null, null, 62);
        } catch (Throwable th) {
            r7o r7oVar = z7o.b;
            return new t7o(th);
        }
    }
}
