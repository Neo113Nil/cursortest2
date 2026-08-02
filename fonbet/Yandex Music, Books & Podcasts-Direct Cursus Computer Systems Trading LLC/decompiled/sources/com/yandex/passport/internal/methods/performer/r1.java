package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.methods.t5;
import com.yandex.passport.internal.methods.v5;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class r1 implements z0 {
    public final com.yandex.passport.internal.properties.y a;
    public final com.yandex.passport.internal.usecase.k1 b;
    public final com.yandex.passport.internal.report.reporters.t0 c;

    public r1(com.yandex.passport.internal.properties.y yVar, com.yandex.passport.internal.usecase.k1 k1Var, com.yandex.passport.internal.report.reporters.t0 t0Var) {
        yVar.getClass();
        k1Var.getClass();
        t0Var.getClass();
        this.a = yVar;
        this.b = k1Var;
        this.c = t0Var;
    }

    @Override // com.yandex.passport.internal.methods.performer.z0
    public final Object u(v5 v5Var) {
        t5 t5Var = (t5) v5Var;
        Object z = com.yandex.passport.internal.ui.a.z(new b(this, t5Var, null, 27));
        Throwable a = z7o.a(z);
        if (a != null) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "onFailure " + a, 8);
            }
            this.c.D(a, (com.yandex.passport.internal.properties.i0) t5Var.c.c);
        }
        return z;
    }
}
