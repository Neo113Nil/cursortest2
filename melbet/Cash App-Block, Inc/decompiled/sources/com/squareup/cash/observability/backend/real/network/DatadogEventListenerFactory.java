package com.squareup.cash.observability.backend.real.network;

import com.datadog.android.okhttp.DatadogEventListener;
import okhttp3.EventListener;
import okhttp3.internal.connection.RealCall;

/* loaded from: classes.dex */
public final class DatadogEventListenerFactory implements EventListener.Factory {
    public final DatadogEventListener.Factory factory;

    public DatadogEventListenerFactory(DatadogEventListener.Factory factory) {
        this.factory = factory;
    }

    @Override // okhttp3.EventListener.Factory
    public final EventListener create(RealCall realCall) {
        return this.factory.create(realCall);
    }
}
