package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0290b0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0911z0 f5574a;

    /* renamed from: b, reason: collision with root package name */
    public final Wk f5575b;

    /* renamed from: c, reason: collision with root package name */
    public final R3 f5576c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5577d = TimeUnit.SECONDS.toMillis(10);

    public C0290b0(C0911z0 c0911z0, Wk wk, R3 r3) {
        this.f5574a = c0911z0;
        this.f5575b = wk;
        this.f5576c = r3;
    }

    public final synchronized void a(Context context, AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        this.f5574a.getClass();
        if (C0911z0.a()) {
            return;
        }
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Session autotracking enabled", new Object[0]);
        this.f5575b.a();
        this.f5574a.getClass();
        C0885y0 a2 = C0885y0.a(context);
        a2.f7222d.a(null, a2);
        IHandlerExecutor a3 = this.f5576c.a();
        ((C0920z9) a3).f7271b.post(new F0.b(this, context, appMetricaLibraryAdapterConfig, 3));
        this.f5574a.getClass();
        C0911z0.b();
    }

    public static final void a(C0290b0 c0290b0, Context context, AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        c0290b0.f5574a.getClass();
        C0885y0 a2 = C0885y0.a(context);
        a2.f().a(appMetricaLibraryAdapterConfig);
        C0294b4.l().f5584c.a().execute(new RunnableC0834w1(a2.f7219a));
    }
}
