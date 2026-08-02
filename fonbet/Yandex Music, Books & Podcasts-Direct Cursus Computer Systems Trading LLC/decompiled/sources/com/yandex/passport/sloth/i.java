package com.yandex.passport.sloth;

import defpackage.a4g;
import defpackage.bsd;
import defpackage.mm6;
import defpackage.wqr;
import java.io.Closeable;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes4.dex */
public final class i implements mm6, Closeable {
    public final com.yandex.passport.common.coroutine.a a;
    public final a1 b;
    public wqr c;

    public i(com.yandex.passport.common.coroutine.a aVar, a1 a1Var) {
        aVar.getClass();
        a1Var.getClass();
        this.a = aVar;
        this.b = a1Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        wqr wqrVar = this.c;
        if (wqrVar == null) {
            wqrVar = a4g.n();
            this.c = wqrVar;
            wqrVar.R(new com.yandex.passport.internal.ui.bouncer.roundabout.k(11, this));
        }
        wqrVar.g(null);
    }

    @Override // defpackage.mm6
    public final CoroutineContext getCoroutineContext() {
        bsd bsdVar = ((com.yandex.passport.common.coroutine.b) this.a).b;
        wqr wqrVar = this.c;
        if (wqrVar == null) {
            wqrVar = a4g.n();
            this.c = wqrVar;
            wqrVar.R(new com.yandex.passport.internal.ui.bouncer.roundabout.k(11, this));
        }
        return bsdVar.plus(wqrVar);
    }
}
