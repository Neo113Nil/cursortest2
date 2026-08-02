package io.appmetrica.analytics.impl;

import android.location.Location;
import android.os.Bundle;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.StartupParamsCallback;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.cc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC0245cc extends Ce, InterfaceC0875y7, InterfaceC0677rc {
    /* synthetic */ InterfaceC0649qc a();

    /* synthetic */ void a(int i, Bundle bundle);

    @Override // io.appmetrica.analytics.impl.Ce
    /* synthetic */ void a(Location location);

    void a(AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig);

    void a(DeferredDeeplinkListener deferredDeeplinkListener);

    void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener);

    void a(ReporterConfig reporterConfig);

    void a(StartupParamsCallback startupParamsCallback, List<String> list);

    @Override // io.appmetrica.analytics.impl.Ce
    /* synthetic */ void a(String str);

    @Override // io.appmetrica.analytics.impl.Ce
    /* synthetic */ void a(String str, String str2);

    @Override // io.appmetrica.analytics.impl.Ce
    /* synthetic */ void a(boolean z);

    @Override // io.appmetrica.analytics.impl.Ce
    /* synthetic */ void a(boolean z, boolean z2);

    void b(AppMetricaConfig appMetricaConfig);

    InterfaceC0620pc c(ReporterConfig reporterConfig);

    @Override // io.appmetrica.analytics.impl.Ce
    /* synthetic */ void clearAppEnvironment();

    String e();

    AdvIdentifiersResult f();

    C0189ae g();

    C0561nb h();

    Map<String, String> i();

    @Override // io.appmetrica.analytics.impl.Ce
    /* synthetic */ void putAppEnvironmentValue(String str, String str2);

    @Override // io.appmetrica.analytics.impl.Ce
    /* synthetic */ void setDataSendingEnabled(boolean z);

    @Override // io.appmetrica.analytics.impl.Ce
    /* synthetic */ void setUserProfileID(String str);
}
