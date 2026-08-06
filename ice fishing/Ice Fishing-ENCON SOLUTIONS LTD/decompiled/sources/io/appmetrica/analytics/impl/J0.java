package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.AppMetricaPlugins;
import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes.dex */
public final class J0 implements AppMetricaPlugins {

    /* renamed from: a, reason: collision with root package name */
    public final L0 f4564a;

    public J0(L0 l02) {
        this.f4564a = l02;
    }

    @Override // io.appmetrica.analytics.plugins.AppMetricaPlugins
    public final void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        this.f4564a.a(pluginErrorDetails, str);
    }

    @Override // io.appmetrica.analytics.plugins.AppMetricaPlugins
    public final void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        this.f4564a.a(pluginErrorDetails);
    }

    public J0() {
        this(new L0());
    }

    @Override // io.appmetrica.analytics.plugins.AppMetricaPlugins
    public final void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f4564a.a(str, str2, pluginErrorDetails);
    }
}
