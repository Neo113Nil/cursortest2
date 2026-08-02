package io.appmetrica.analytics.impl;

import android.os.Looper;
import java.util.Map;

/* loaded from: classes9.dex */
public final class Yq implements InterfaceC0202ar {
    @Override // io.appmetrica.analytics.impl.InterfaceC0202ar
    public final Thread a() {
        return Looper.getMainLooper().getThread();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0202ar
    public final StackTraceElement[] b() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0202ar
    public final Map c() {
        return Thread.getAllStackTraces();
    }
}
