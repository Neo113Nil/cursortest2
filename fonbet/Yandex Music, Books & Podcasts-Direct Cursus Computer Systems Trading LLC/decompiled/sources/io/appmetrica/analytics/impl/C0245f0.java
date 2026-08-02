package io.appmetrica.analytics.impl;

import android.content.Context;
import defpackage.gtm;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;

/* renamed from: io.appmetrica.analytics.impl.f0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0245f0 {
    public final D0 a;
    public final Yn b;
    public final H4 c;
    public final long d = 10000;

    public C0245f0(D0 d0, Yn yn, H4 h4) {
        this.a = d0;
        this.b = yn;
        this.c = h4;
    }

    public final synchronized void a(Context context, AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        this.a.getClass();
        if (D0.a()) {
            return;
        }
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Session autotracking enabled", new Object[0]);
        this.b.a();
        this.a.getClass();
        C0 a = C0.a(context);
        a.d.a(null, a);
        IHandlerExecutor a2 = this.c.a();
        ((Ha) a2).b.post(new gtm(19, this, context, appMetricaLibraryAdapterConfig));
        this.a.getClass();
        D0.b();
    }

    public static final void a(C0245f0 c0245f0, Context context, AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        c0245f0.a.getClass();
        C0 a = C0.a(context);
        a.d().a(appMetricaLibraryAdapterConfig);
        R4.l().c.a().execute(new Q1(a.a));
    }
}
