package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.ih, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC0348ih implements Runnable {
    public final /* synthetic */ PluginErrorDetails a;
    public final /* synthetic */ C0435lh b;

    public RunnableC0348ih(C0435lh c0435lh, PluginErrorDetails pluginErrorDetails) {
        this.b = c0435lh;
        this.a = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC0228ec) this.b.d.get()).getPluginExtension().reportUnhandledException(this.a);
    }
}
