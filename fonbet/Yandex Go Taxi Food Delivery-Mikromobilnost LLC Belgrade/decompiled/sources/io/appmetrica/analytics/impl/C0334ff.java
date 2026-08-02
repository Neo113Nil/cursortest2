package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.ff, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0334ff extends SafeRunnable {
    public final /* synthetic */ Cif a;
    public final /* synthetic */ boolean b;

    public C0334ff(Cif cif, boolean z) {
        this.a = cif;
        this.b = z;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        Cif.a(this.a).a(this.b, false);
    }
}
