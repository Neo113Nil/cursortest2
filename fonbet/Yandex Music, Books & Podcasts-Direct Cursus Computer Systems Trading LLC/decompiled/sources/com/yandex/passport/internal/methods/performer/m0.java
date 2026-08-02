package com.yandex.passport.internal.methods.performer;

import android.os.Bundle;
import com.yandex.passport.internal.methods.v5;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.hb;
import com.yandex.passport.internal.report.ve;
import defpackage.r7o;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class m0 implements z0 {
    public final com.yandex.passport.internal.flags.i a;
    public final com.yandex.passport.internal.push.i0 b;
    public final com.yandex.passport.internal.push.l0 c;
    public final com.yandex.passport.internal.report.reporters.z0 d;

    public m0(com.yandex.passport.internal.flags.i iVar, com.yandex.passport.internal.push.i0 i0Var, com.yandex.passport.internal.push.l0 l0Var, com.yandex.passport.internal.report.reporters.z0 z0Var) {
        iVar.getClass();
        i0Var.getClass();
        l0Var.getClass();
        z0Var.getClass();
        this.a = iVar;
        this.b = i0Var;
        this.c = l0Var;
        this.d = z0Var;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        com.yandex.passport.internal.push.h0 h0Var = null;
        if (!((Boolean) this.a.b(com.yandex.passport.internal.flags.o.j0)).booleanValue()) {
            r7o r7oVar = z7o.b;
            return null;
        }
        Bundle a = this.c.a();
        if (a != null) {
            com.yandex.passport.internal.push.h0 a2 = this.b.a(a);
            long j = a2.f;
            String str = a2.g;
            String str2 = a2.p;
            boolean b = com.yandex.passport.internal.push.m0.b(a2);
            com.yandex.passport.internal.report.reporters.z0 z0Var = this.d;
            z0Var.getClass();
            z0Var.n(hb.d, new com.yandex.passport.internal.report.c(Long.valueOf(j)), new ve(str, 11), new ff(str2, 14), new com.yandex.passport.internal.report.f(15, b));
            if (com.yandex.passport.internal.push.m0.b(a2)) {
                h0Var = a2;
            }
        }
        r7o r7oVar2 = z7o.b;
        return h0Var;
    }
}
