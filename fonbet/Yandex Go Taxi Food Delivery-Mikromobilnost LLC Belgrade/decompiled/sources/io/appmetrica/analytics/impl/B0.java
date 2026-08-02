package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* loaded from: classes4.dex */
public final class B0 implements InterfaceC0216bc {
    public final Handler a;
    public final IHandlerExecutor b;
    public final Y4 c;

    public B0() {
        IHandlerExecutor a = V4.l().g().a();
        this.b = a;
        this.a = a.getHandler();
        this.c = new Y4();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0216bc
    public final E2 a() {
        return new E2();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0216bc
    public final Zc b() {
        return new Zc();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0216bc
    public final Y4 c() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0216bc
    public final Handler d() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0216bc
    public final ICommonExecutor getDefaultExecutor() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0216bc
    public final void a(AppMetricaConfig appMetricaConfig, InterfaceC0677rc interfaceC0677rc) {
    }
}
