package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.ef, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0305ef extends SafeRunnable {
    public final /* synthetic */ Cif a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public C0305ef(Cif cif, int i, String str) {
        this.a = cif;
        this.b = i;
        this.c = str;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        Cif.a(this.a).a(new Va(this.b, this.c));
    }
}
