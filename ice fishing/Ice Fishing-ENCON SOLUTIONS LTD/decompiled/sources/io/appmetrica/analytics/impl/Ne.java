package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes.dex */
public final class Ne implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4822a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4823b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f4824c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Oe f4825d;

    public Ne(Oe oe, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f4825d = oe;
        this.f4822a = str;
        this.f4823b = str2;
        this.f4824c = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Ra) this.f4825d.f4865d.get()).getPluginExtension().reportError(this.f4822a, this.f4823b, this.f4824c);
    }
}
