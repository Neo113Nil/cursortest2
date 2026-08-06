package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Provider;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;

/* loaded from: classes.dex */
public final class Oe implements IPluginReporter {

    /* renamed from: a, reason: collision with root package name */
    public final Re f4862a = new Re();

    /* renamed from: b, reason: collision with root package name */
    public final Se f4863b = new Se();

    /* renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f4864c = C0294b4.l().g().a();

    /* renamed from: d, reason: collision with root package name */
    public final Provider f4865d;

    public Oe(Provider<Ra> provider) {
        this.f4865d = provider;
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        Re re = this.f4862a;
        re.f4995a.a(pluginErrorDetails);
        if (re.f4997c.a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).f6792a) {
            this.f4863b.getClass();
            this.f4864c.execute(new Me(this, pluginErrorDetails, str));
        }
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        this.f4862a.f4995a.a(pluginErrorDetails);
        this.f4863b.getClass();
        this.f4864c.execute(new Le(this, pluginErrorDetails));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f4862a.f4996b.a(str);
        this.f4863b.getClass();
        this.f4864c.execute(new Ne(this, str, str2, pluginErrorDetails));
    }
}
