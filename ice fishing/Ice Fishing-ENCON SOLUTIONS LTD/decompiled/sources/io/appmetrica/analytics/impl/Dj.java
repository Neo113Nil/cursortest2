package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes.dex */
public final class Dj implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4307a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4308b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f4309c;

    public Dj(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f4307a = str;
        this.f4308b = str2;
        this.f4309c = pluginErrorDetails;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra) {
        ra.getPluginExtension().reportError(this.f4307a, this.f4308b, this.f4309c);
    }
}
