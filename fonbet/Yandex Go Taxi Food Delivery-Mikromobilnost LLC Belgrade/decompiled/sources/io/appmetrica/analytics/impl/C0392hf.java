package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.hf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0392hf extends SafeRunnable {
    public final /* synthetic */ String a;

    public C0392hf(String str) {
        this.a = str;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        F0 f0 = V4.l().r;
        String str = this.a;
        f0.getClass();
        E0.c().a(str);
    }
}
