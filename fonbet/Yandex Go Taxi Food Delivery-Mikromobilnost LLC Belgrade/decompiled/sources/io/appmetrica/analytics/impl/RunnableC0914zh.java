package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.zh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC0914zh implements Runnable {
    public final /* synthetic */ PluginErrorDetails a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Bh c;

    public RunnableC0914zh(Bh bh, PluginErrorDetails pluginErrorDetails, String str) {
        this.c = bh;
        this.a = pluginErrorDetails;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC0620pc) this.c.d.get()).getPluginExtension().reportError(this.a, this.b);
    }
}
