package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;

/* loaded from: classes.dex */
public final class L0 {

    /* renamed from: a, reason: collision with root package name */
    public final IHandlerExecutor f4658a = C0294b4.l().g().a();

    /* renamed from: b, reason: collision with root package name */
    public final C0911z0 f4659b;

    /* renamed from: c, reason: collision with root package name */
    public final Qe f4660c;

    /* renamed from: d, reason: collision with root package name */
    public final Te f4661d;

    public L0() {
        C0911z0 c0911z0 = new C0911z0();
        this.f4659b = c0911z0;
        this.f4660c = new Qe(c0911z0);
        this.f4661d = new Te();
    }

    public final void a(PluginErrorDetails pluginErrorDetails) {
        Qe qe = this.f4660c;
        qe.f4954a.a(null);
        qe.f4955b.a(pluginErrorDetails);
        Te te = this.f4661d;
        kotlin.jvm.internal.i.b(pluginErrorDetails);
        te.getClass();
        this.f4658a.execute(new F0.c(5, this, pluginErrorDetails));
    }

    public final void a(PluginErrorDetails pluginErrorDetails, String str) {
        Qe qe = this.f4660c;
        qe.f4954a.a(null);
        qe.f4955b.a(pluginErrorDetails);
        if (qe.f4957d.a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).f6792a) {
            Te te = this.f4661d;
            kotlin.jvm.internal.i.b(pluginErrorDetails);
            te.getClass();
            this.f4658a.execute(new F0.b(this, pluginErrorDetails, str));
        }
    }

    public final void a(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        Qe qe = this.f4660c;
        qe.f4954a.a(null);
        qe.f4956c.a(str);
        Te te = this.f4661d;
        kotlin.jvm.internal.i.b(str);
        te.getClass();
        this.f4658a.execute(new Ko(this, str, str2, pluginErrorDetails, 1));
    }

    public static final void a(L0 l02, PluginErrorDetails pluginErrorDetails, String str) {
        l02.f4659b.getClass();
        C0885y0 c0885y0 = C0885y0.f7216e;
        kotlin.jvm.internal.i.b(c0885y0);
        C0508jc i2 = c0885y0.f().i();
        kotlin.jvm.internal.i.b(i2);
        i2.f6277a.getPluginExtension().reportError(pluginErrorDetails, str);
    }

    public static final void a(L0 l02, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        l02.f4659b.getClass();
        C0885y0 c0885y0 = C0885y0.f7216e;
        kotlin.jvm.internal.i.b(c0885y0);
        C0508jc i2 = c0885y0.f().i();
        kotlin.jvm.internal.i.b(i2);
        i2.f6277a.getPluginExtension().reportError(str, str2, pluginErrorDetails);
    }

    public static final void a(L0 l02, PluginErrorDetails pluginErrorDetails) {
        l02.f4659b.getClass();
        C0885y0 c0885y0 = C0885y0.f7216e;
        kotlin.jvm.internal.i.b(c0885y0);
        C0508jc i2 = c0885y0.f().i();
        kotlin.jvm.internal.i.b(i2);
        i2.f6277a.getPluginExtension().reportUnhandledException(pluginErrorDetails);
    }
}
