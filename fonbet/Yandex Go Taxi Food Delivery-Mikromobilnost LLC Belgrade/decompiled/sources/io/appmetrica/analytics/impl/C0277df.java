package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.df, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0277df extends SafeRunnable {
    public final /* synthetic */ Cif a;
    public final /* synthetic */ ModuleEvent b;

    public C0277df(Cif cif, ModuleEvent moduleEvent) {
        this.a = cif;
        this.b = moduleEvent;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        Cif.a(this.a).reportEvent(this.b);
    }
}
