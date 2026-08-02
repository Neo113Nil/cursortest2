package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.r94;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;

/* renamed from: io.appmetrica.analytics.impl.h0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0377h0 {
    public final F0 a;
    public final C0747to b;
    public final L4 c;
    public final long d = 10000;

    public C0377h0(F0 f0, C0747to c0747to, L4 l4) {
        this.a = f0;
        this.b = c0747to;
        this.c = l4;
    }

    public final synchronized void a(Context context, AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        this.a.getClass();
        if (F0.a()) {
            return;
        }
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Session autotracking enabled", new Object[0]);
        this.b.a();
        this.a.getClass();
        E0 a = E0.a(context);
        a.d.a(null, a);
        IHandlerExecutor a2 = this.c.a();
        ((Pa) a2).b.post(new r94(13, this, context, appMetricaLibraryAdapterConfig));
        this.a.getClass();
        F0.b();
    }

    public static final void a(C0377h0 c0377h0, Context context, AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        c0377h0.a.getClass();
        E0 a = E0.a(context);
        a.d().a(appMetricaLibraryAdapterConfig);
        V4.l().c.a().execute(new Q1(a.a));
    }
}
