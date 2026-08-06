package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes.dex */
public final class Me implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f4758a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4759b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Oe f4760c;

    public Me(Oe oe, PluginErrorDetails pluginErrorDetails, String str) {
        this.f4760c = oe;
        this.f4758a = pluginErrorDetails;
        this.f4759b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Ra) this.f4760c.f4865d.get()).getPluginExtension().reportError(this.f4758a, this.f4759b);
    }
}
