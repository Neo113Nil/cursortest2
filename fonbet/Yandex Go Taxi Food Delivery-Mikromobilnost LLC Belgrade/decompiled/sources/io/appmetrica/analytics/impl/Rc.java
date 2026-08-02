package io.appmetrica.analytics.impl;

import android.os.HandlerThread;
import io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread;

/* loaded from: classes9.dex */
public final class Rc extends HandlerThread implements IInterruptionSafeThread {
    public volatile boolean a;

    public Rc(String str) {
        super(str);
        this.a = true;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final synchronized boolean isRunning() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final synchronized void stopRunning() {
        this.a = false;
        interrupt();
    }
}
