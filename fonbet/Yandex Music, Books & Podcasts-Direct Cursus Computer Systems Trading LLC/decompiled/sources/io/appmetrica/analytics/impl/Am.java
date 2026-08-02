package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes5.dex */
public final class Am implements InterfaceC0200dc {
    public final /* synthetic */ PluginErrorDetails a;
    public final /* synthetic */ String b;

    public Am(PluginErrorDetails pluginErrorDetails, String str) {
        this.a = pluginErrorDetails;
        this.b = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0200dc
    public final void a(InterfaceC0228ec interfaceC0228ec) {
        interfaceC0228ec.getPluginExtension().reportError(this.a, this.b);
    }
}
