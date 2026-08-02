package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* loaded from: classes5.dex */
public interface Mb {
    U4 a();

    void a(AppMetricaConfig appMetricaConfig, InterfaceC0286gc interfaceC0286gc);

    Handler b();

    E2 c();

    Jc d();

    ICommonExecutor getDefaultExecutor();
}
