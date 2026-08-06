package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* renamed from: io.appmetrica.analytics.impl.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0807v0 implements Ba {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f7032a;

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f7033b;

    /* renamed from: c, reason: collision with root package name */
    public final C0371e4 f7034c;

    public C0807v0() {
        IHandlerExecutor a2 = C0294b4.l().g().a();
        this.f7033b = a2;
        this.f7032a = a2.getHandler();
        this.f7034c = new C0371e4();
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final void a(AppMetricaConfig appMetricaConfig, Ta ta) {
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final Handler b() {
        return this.f7032a;
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final S1 c() {
        return new S1();
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final C0533kb d() {
        return new C0533kb();
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final ICommonExecutor getDefaultExecutor() {
        return this.f7033b;
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final C0371e4 a() {
        return this.f7034c;
    }
}
