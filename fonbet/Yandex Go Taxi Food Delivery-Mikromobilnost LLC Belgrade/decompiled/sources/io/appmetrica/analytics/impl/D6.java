package io.appmetrica.analytics.impl;

import defpackage.s59;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public final class D6 implements Runnable {
    public final List a;
    public final IHandlerExecutor b = Jb.k().w().b();
    public final WaitForActivationDelayBarrier c = Jb.k().a();

    public D6(List list) {
        this.a = list;
    }

    public static final void a(D6 d6) {
        Iterator it = d6.a.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.subscribe(10000L, this.b, new s59(this));
    }
}
