package io.appmetrica.analytics.impl;

import defpackage.gtm;
import defpackage.xlr;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;

/* renamed from: io.appmetrica.analytics.impl.a1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0102a1 {
    public final IHandlerExecutor a = R4.l().g().a();
    public final D0 b;
    public final C0493nh c;
    public final C0580qh d;

    public C0102a1() {
        D0 d0 = new D0();
        this.b = d0;
        this.c = new C0493nh(d0);
        this.d = new C0580qh();
    }

    public final void a(PluginErrorDetails pluginErrorDetails, String str) {
        C0493nh c0493nh = this.c;
        c0493nh.a.a(null);
        c0493nh.b.a(pluginErrorDetails);
        if (c0493nh.d.a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).a) {
            C0580qh c0580qh = this.d;
            pluginErrorDetails.getClass();
            c0580qh.getClass();
            this.a.execute(new gtm(11, this, pluginErrorDetails, str));
        }
    }

    public final void a(PluginErrorDetails pluginErrorDetails) {
        C0493nh c0493nh = this.c;
        c0493nh.a.a(null);
        c0493nh.b.a(pluginErrorDetails);
        C0580qh c0580qh = this.d;
        pluginErrorDetails.getClass();
        c0580qh.getClass();
        this.a.execute(new xlr(28, this, pluginErrorDetails));
    }

    public final void a(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        C0493nh c0493nh = this.c;
        c0493nh.a.a(null);
        c0493nh.c.a(str);
        C0580qh c0580qh = this.d;
        str.getClass();
        c0580qh.getClass();
        this.a.execute(new defpackage.r8(this, str, str2, pluginErrorDetails, 17));
    }

    public static final void a(C0102a1 c0102a1, PluginErrorDetails pluginErrorDetails, String str) {
        c0102a1.b.getClass();
        C0 c0 = C0.e;
        c0.getClass();
        Kd i = c0.d().i();
        i.getClass();
        i.a.getPluginExtension().reportError(pluginErrorDetails, str);
    }

    public static final void a(C0102a1 c0102a1, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        c0102a1.b.getClass();
        C0 c0 = C0.e;
        c0.getClass();
        Kd i = c0.d().i();
        i.getClass();
        i.a.getPluginExtension().reportError(str, str2, pluginErrorDetails);
    }

    public static final void a(C0102a1 c0102a1, PluginErrorDetails pluginErrorDetails) {
        c0102a1.b.getClass();
        C0 c0 = C0.e;
        c0.getClass();
        Kd i = c0.d().i();
        i.getClass();
        i.a.getPluginExtension().reportUnhandledException(pluginErrorDetails);
    }
}
