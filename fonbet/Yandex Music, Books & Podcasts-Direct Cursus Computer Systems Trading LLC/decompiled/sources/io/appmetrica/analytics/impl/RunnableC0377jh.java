package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.jh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC0377jh implements Runnable {
    public final /* synthetic */ PluginErrorDetails a;
    public final /* synthetic */ String b;
    public final /* synthetic */ C0435lh c;

    public RunnableC0377jh(C0435lh c0435lh, PluginErrorDetails pluginErrorDetails, String str) {
        this.c = c0435lh;
        this.a = pluginErrorDetails;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC0228ec) this.c.d.get()).getPluginExtension().reportError(this.a, this.b);
    }
}
