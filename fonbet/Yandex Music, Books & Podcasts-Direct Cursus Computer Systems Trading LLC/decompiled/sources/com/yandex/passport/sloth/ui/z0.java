package com.yandex.passport.sloth.ui;

import defpackage.cg6;
import defpackage.nm6;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class z0 {
    public final com.yandex.passport.sloth.a1 a;
    public final com.yandex.passport.sloth.v b;
    public final com.yandex.passport.sloth.data.m c;

    public z0(com.yandex.passport.sloth.a1 a1Var, com.yandex.passport.sloth.v vVar, com.yandex.passport.sloth.data.m mVar) {
        a1Var.getClass();
        vVar.getClass();
        mVar.getClass();
        this.a = a1Var;
        this.b = vVar;
        this.c = mVar;
    }

    public final Object a(boolean z, cg6 cg6Var) {
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "onFail " + z, 8);
        }
        com.yandex.passport.sloth.v vVar = this.b;
        if (z) {
            Object d = vVar.d(com.yandex.passport.sloth.c.a, cg6Var);
            return d == nm6.a ? d : Unit.a;
        }
        Object b = vVar.b(new com.yandex.passport.sloth.o(true, z), cg6Var);
        return b == nm6.a ? b : Unit.a;
    }
}
