package com.yandex.passport.sloth.ui;

import defpackage.b6;

/* loaded from: classes4.dex */
public final class b1 {
    public a1 a;

    public final void a(b6 b6Var) {
        a1 a1Var = this.a;
        if (a1Var != null) {
            ((com.yandex.passport.sloth.c1) a1Var).b.i.a(b6Var);
        } else if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.e, null, "interactor is not ready", 8);
        }
    }
}
