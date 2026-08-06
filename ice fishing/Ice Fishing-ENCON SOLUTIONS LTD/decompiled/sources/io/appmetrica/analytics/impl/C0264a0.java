package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0264a0 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0290b0 f5534a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f5535b;

    public C0264a0(C0290b0 c0290b0, Context context) {
        this.f5534a = c0290b0;
        this.f5535b = context;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C0290b0 c0290b0 = this.f5534a;
        Context context = this.f5535b;
        c0290b0.getClass();
        c0290b0.a(context, AppMetricaLibraryAdapterConfig.newConfigBuilder().build());
    }
}
