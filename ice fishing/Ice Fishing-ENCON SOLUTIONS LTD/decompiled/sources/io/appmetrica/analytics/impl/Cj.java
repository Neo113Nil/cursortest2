package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes.dex */
public final class Cj implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f4270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4271b;

    public Cj(PluginErrorDetails pluginErrorDetails, String str) {
        this.f4270a = pluginErrorDetails;
        this.f4271b = str;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra) {
        ra.getPluginExtension().reportError(this.f4270a, this.f4271b);
    }
}
