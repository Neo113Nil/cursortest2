package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* renamed from: io.appmetrica.analytics.impl.bc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC0216bc {
    E2 a();

    void a(AppMetricaConfig appMetricaConfig, InterfaceC0677rc interfaceC0677rc);

    Zc b();

    Y4 c();

    Handler d();

    ICommonExecutor getDefaultExecutor();
}
