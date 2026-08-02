package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;

/* renamed from: io.appmetrica.analytics.impl.yk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC0813yk implements Runnable {
    public final /* synthetic */ ModuleEvent a;
    public final /* synthetic */ Jk b;

    public RunnableC0813yk(Jk jk, ModuleEvent moduleEvent) {
        this.b = jk;
        this.a = moduleEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Jk jk = this.b;
        Jk.a(jk.a, jk.d, jk.e).reportEvent(this.a);
    }
}
