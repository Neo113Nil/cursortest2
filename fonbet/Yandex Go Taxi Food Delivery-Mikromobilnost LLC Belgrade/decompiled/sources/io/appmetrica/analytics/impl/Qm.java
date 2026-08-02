package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes4.dex */
public final class Qm implements InterfaceC0591oc {
    public final /* synthetic */ PluginErrorDetails a;
    public final /* synthetic */ String b;

    public Qm(PluginErrorDetails pluginErrorDetails, String str) {
        this.a = pluginErrorDetails;
        this.b = str;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0591oc
    public final void a(InterfaceC0620pc interfaceC0620pc) {
        interfaceC0620pc.getPluginExtension().reportError(this.a, this.b);
    }
}
