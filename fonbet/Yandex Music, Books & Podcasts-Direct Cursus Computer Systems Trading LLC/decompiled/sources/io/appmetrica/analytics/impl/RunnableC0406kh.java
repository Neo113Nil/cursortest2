package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* renamed from: io.appmetrica.analytics.impl.kh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC0406kh implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ PluginErrorDetails c;
    public final /* synthetic */ C0435lh d;

    public RunnableC0406kh(C0435lh c0435lh, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.d = c0435lh;
        this.a = str;
        this.b = str2;
        this.c = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC0228ec) this.d.d.get()).getPluginExtension().reportError(this.a, this.b, this.c);
    }
}
