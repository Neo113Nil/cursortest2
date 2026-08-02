package io.appmetrica.analytics.push.impl;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* loaded from: classes4.dex */
public final class F0 {
    public final HandlerThread a;
    public final Handler b;

    public F0(HandlerThread handlerThread, Handler handler) {
        this.a = handlerThread;
        this.b = handler;
    }

    public final Looper a() {
        return this.a.getLooper();
    }
}
