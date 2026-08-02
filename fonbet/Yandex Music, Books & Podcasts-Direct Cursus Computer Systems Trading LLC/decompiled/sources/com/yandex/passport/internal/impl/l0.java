package com.yandex.passport.internal.impl;

import defpackage.rh;
import defpackage.wkc;
import defpackage.x0q;
import defpackage.x97;
import defpackage.z7o;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class l0 implements rh {
    public final /* synthetic */ x0q a;
    public final /* synthetic */ q0 b;

    public l0(x0q x0qVar, q0 q0Var) {
        this.a = x0qVar;
        this.b = q0Var;
    }

    @Override // defpackage.rh
    public final void a(Object obj) {
        com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
        z7o z7oVar = (z7o) obj;
        Object obj2 = z7oVar.a;
        Continuation continuation = null;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Activity result " + ((Object) z7o.b(obj2)), 8);
        }
        x97.y(this.b.a, null, null, new wkc(this.a, continuation, z7oVar.a, 2), 3);
    }
}
