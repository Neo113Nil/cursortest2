package io.appmetrica.analytics.impl;

import android.os.HandlerThread;
import io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread;

/* renamed from: io.appmetrica.analytics.impl.cb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerThreadC0327cb extends HandlerThread implements IInterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f5735a;

    public HandlerThreadC0327cb(String str) {
        super(str);
        this.f5735a = true;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final synchronized boolean isRunning() {
        return this.f5735a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final synchronized void stopRunning() {
        this.f5735a = false;
        interrupt();
    }
}
