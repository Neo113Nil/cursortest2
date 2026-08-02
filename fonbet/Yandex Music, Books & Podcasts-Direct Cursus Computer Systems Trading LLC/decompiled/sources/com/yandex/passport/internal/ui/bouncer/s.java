package com.yandex.passport.internal.ui.bouncer;

import com.yandex.passport.internal.ui.bouncer.model.g2;
import defpackage.hn5;
import defpackage.tf6;
import defpackage.wyf;
import defpackage.x0q;
import defpackage.x97;
import defpackage.y0q;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class s {
    public final x0q a;
    public final tf6 b;

    public s(hn5 hn5Var) {
        hn5Var.getClass();
        this.a = y0q.b(0, 0, null, 7);
        this.b = com.yandex.passport.common.coroutine.c.a(wyf.F(hn5Var.getLifecycle()));
    }

    public final void a(g2 g2Var) {
        Continuation continuation = null;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "new wish " + g2Var, 8);
        }
        if (this.a.a(g2Var)) {
            return;
        }
        x97.y(this.b, null, null, new com.yandex.passport.internal.provider.communication.c(this, g2Var, continuation, 12), 3);
    }
}
