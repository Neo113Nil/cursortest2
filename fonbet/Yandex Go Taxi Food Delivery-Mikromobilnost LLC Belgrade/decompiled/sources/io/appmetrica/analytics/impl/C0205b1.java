package io.appmetrica.analytics.impl;

import defpackage.bo31;
import defpackage.hek0;
import defpackage.nk61;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;

/* renamed from: io.appmetrica.analytics.impl.b1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0205b1 {
    public final IHandlerExecutor a = V4.l().g().a();
    public final F0 b;
    public final Dh c;
    public final Gh d;

    public C0205b1() {
        F0 f0 = new F0();
        this.b = f0;
        this.c = new Dh(f0);
        this.d = new Gh();
    }

    public final void a(PluginErrorDetails pluginErrorDetails, String str) {
        Dh dh = this.c;
        dh.a.a(null);
        dh.b.a(pluginErrorDetails);
        if (dh.d.a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).a) {
            this.d.getClass();
            this.a.execute(new nk61(0, (Object) this, (Object) pluginErrorDetails, (Object) str));
        }
    }

    public final void a(PluginErrorDetails pluginErrorDetails) {
        Dh dh = this.c;
        dh.a.a(null);
        dh.b.a(pluginErrorDetails);
        this.d.getClass();
        this.a.execute(new bo31(19, this, pluginErrorDetails));
    }

    public final void a(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        Dh dh = this.c;
        dh.a.a(null);
        dh.c.a(str);
        this.d.getClass();
        this.a.execute(new hek0(this, str, str2, pluginErrorDetails, 15));
    }

    public static final void a(C0205b1 c0205b1, PluginErrorDetails pluginErrorDetails, String str) {
        c0205b1.b.getClass();
        E0.e.d().g().a.getPluginExtension().reportError(pluginErrorDetails, str);
    }

    public static final void a(C0205b1 c0205b1, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        c0205b1.b.getClass();
        E0.e.d().g().a.getPluginExtension().reportError(str, str2, pluginErrorDetails);
    }

    public static final void a(C0205b1 c0205b1, PluginErrorDetails pluginErrorDetails) {
        c0205b1.b.getClass();
        E0.e.d().g().a.getPluginExtension().reportUnhandledException(pluginErrorDetails);
    }
}
