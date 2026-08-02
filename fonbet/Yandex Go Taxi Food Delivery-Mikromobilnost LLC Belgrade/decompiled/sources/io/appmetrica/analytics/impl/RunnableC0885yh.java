package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.yh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC0885yh implements Runnable {
    public final /* synthetic */ PluginErrorDetails a;
    public final /* synthetic */ Bh b;

    public RunnableC0885yh(Bh bh, PluginErrorDetails pluginErrorDetails) {
        this.b = bh;
        this.a = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC0620pc) this.b.d.get()).getPluginExtension().reportUnhandledException(this.a);
    }
}
