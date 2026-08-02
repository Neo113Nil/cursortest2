package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* loaded from: classes9.dex */
public final class W1 extends SafeRunnable {
    public final /* synthetic */ C0321f2 a;

    public W1(C0321f2 c0321f2) {
        this.a = c0321f2;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        synchronized (this.a) {
            try {
                C0321f2 c0321f2 = this.a;
                if (c0321f2.c) {
                    c0321f2.b.onCreate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
