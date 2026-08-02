package io.appmetrica.analytics.impl;

import android.os.Handler;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* renamed from: io.appmetrica.analytics.impl.z0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0821z0 implements Mb {
    public final Handler a;
    public final IHandlerExecutor b;
    public final U4 c;

    public C0821z0() {
        IHandlerExecutor a = R4.l().g().a();
        this.b = a;
        this.a = a.getHandler();
        this.c = new U4();
    }

    @Override // io.appmetrica.analytics.impl.Mb
    @NonNull
    public final U4 a() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.impl.Mb
    @NonNull
    public final Handler b() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.impl.Mb
    @NonNull
    public final E2 c() {
        return new E2();
    }

    @Override // io.appmetrica.analytics.impl.Mb
    @NonNull
    public final Jc d() {
        return new Jc();
    }

    @Override // io.appmetrica.analytics.impl.Mb
    @NonNull
    public final ICommonExecutor getDefaultExecutor() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.impl.Mb
    public final void a(AppMetricaConfig appMetricaConfig, @NonNull InterfaceC0286gc interfaceC0286gc) {
    }
}
