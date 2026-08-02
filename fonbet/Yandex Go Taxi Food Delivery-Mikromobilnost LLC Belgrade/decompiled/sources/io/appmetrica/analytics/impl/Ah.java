package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes4.dex */
public final class Ah implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ PluginErrorDetails c;
    public final /* synthetic */ Bh d;

    public Ah(Bh bh, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.d = bh;
        this.a = str;
        this.b = str2;
        this.c = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((InterfaceC0620pc) this.d.d.get()).getPluginExtension().reportError(this.a, this.b, this.c);
    }
}
