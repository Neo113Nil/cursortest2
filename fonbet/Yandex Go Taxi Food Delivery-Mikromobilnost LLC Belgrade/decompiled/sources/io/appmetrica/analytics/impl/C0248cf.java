package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.cf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0248cf extends SafeRunnable {
    public final /* synthetic */ Cif a;
    public final /* synthetic */ AdRevenue b;
    public final /* synthetic */ boolean c;

    public C0248cf(Cif cif, AdRevenue adRevenue, boolean z) {
        this.a = cif;
        this.b = adRevenue;
        this.c = z;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        Cif.a(this.a).reportAdRevenue(this.b, this.c);
    }
}
