package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes5.dex */
public final class W1 extends SafeRunnable {
    public final /* synthetic */ C0247f2 a;

    public W1(C0247f2 c0247f2) {
        this.a = c0247f2;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        synchronized (this.a) {
            try {
                C0247f2 c0247f2 = this.a;
                if (c0247f2.c) {
                    c0247f2.b.onCreate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
