package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.v2;
import com.yandex.passport.internal.methods.v5;
import com.yandex.passport.internal.methods.y4;
import defpackage.r7o;
import defpackage.z7o;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class c1 implements z0 {
    public final com.yandex.passport.internal.push.u0 a;

    public c1(com.yandex.passport.internal.push.u0 u0Var) {
        u0Var.getClass();
        this.a = u0Var;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        y4 y4Var = (y4) v5Var;
        v2 v2Var = (v2) y4Var.c.c;
        String str = (String) y4Var.d.c;
        com.yandex.passport.internal.push.u0 u0Var = this.a;
        u0Var.getClass();
        v2Var.getClass();
        if (u0Var.b.a()) {
            u0Var.e.a(u0Var.a(), new com.yandex.passport.internal.push.c1(u0Var.a, v2Var, str));
        }
        r7o r7oVar = z7o.b;
        return Unit.a;
    }
}
