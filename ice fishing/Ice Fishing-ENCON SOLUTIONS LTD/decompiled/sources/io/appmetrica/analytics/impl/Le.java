package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes.dex */
public final class Le implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f4704a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Oe f4705b;

    public Le(Oe oe, PluginErrorDetails pluginErrorDetails) {
        this.f4705b = oe;
        this.f4704a = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Ra) this.f4705b.f4865d.get()).getPluginExtension().reportUnhandledException(this.f4704a);
    }
}
