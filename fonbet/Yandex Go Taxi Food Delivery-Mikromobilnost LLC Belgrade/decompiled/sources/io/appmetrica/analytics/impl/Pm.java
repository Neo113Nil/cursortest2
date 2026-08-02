package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes4.dex */
public final class Pm implements InterfaceC0591oc {
    public final /* synthetic */ PluginErrorDetails a;

    public Pm(PluginErrorDetails pluginErrorDetails) {
        this.a = pluginErrorDetails;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0591oc
    public final void a(InterfaceC0620pc interfaceC0620pc) {
        interfaceC0620pc.getPluginExtension().reportUnhandledException(this.a);
    }
}
