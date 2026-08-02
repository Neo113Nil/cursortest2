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

/* loaded from: classes4.dex */
public final class K0 implements InterfaceC0245cc {
    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc
    public final void a(StartupParamsCallback startupParamsCallback, List<String> list) {
        startupParamsCallback.onRequestError(StartupParamsCallback.Reason.UNKNOWN, null);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc
    public final void b(AppMetricaConfig appMetricaConfig) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc
    public final InterfaceC0620pc c(ReporterConfig reporterConfig) {
        return new Uk();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc, io.appmetrica.analytics.impl.Ce
    public final void clearAppEnvironment() {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc
    public final String e() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc
    public final AdvIdentifiersResult f() {
        AdvIdentifiersResult.Details details = AdvIdentifiersResult.Details.INTERNAL_ERROR;
        return new AdvIdentifiersResult(new AdvIdentifiersResult.AdvId(null, details, "Device user is in locked state"), new AdvIdentifiersResult.AdvId(null, details, "Device user is in locked state"), new AdvIdentifiersResult.AdvId(null, details, "Device user is in locked state"));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc
    public final C0189ae g() {
        C0622pe c0622pe = new C0622pe();
        return new C0189ae(c0622pe, new C0818w8(c0622pe));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc
    public final C0561nb h() {
        return new C0561nb(null);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc
    public final Map<String, String> i() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc, io.appmetrica.analytics.impl.Ce
    public final void putAppEnvironmentValue(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc, io.appmetrica.analytics.impl.Ce
    public final void setDataSendingEnabled(boolean z) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc, io.appmetrica.analytics.impl.Ce
    public final void setUserProfileID(String str) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc, io.appmetrica.analytics.impl.Ce
    public final void a(Location location) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc
    public final void a(AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc
    public final void a(DeferredDeeplinkListener deferredDeeplinkListener) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc
    public final void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc
    public final void a(ReporterConfig reporterConfig) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc, io.appmetrica.analytics.impl.Ce
    public final void a(String str) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc, io.appmetrica.analytics.impl.Ce
    public final void a(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc, io.appmetrica.analytics.impl.Ce
    public final void a(boolean z) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc, io.appmetrica.analytics.impl.Ce
    public final void a(boolean z, boolean z2) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc, io.appmetrica.analytics.impl.InterfaceC0875y7
    public final void a(int i, Bundle bundle) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0245cc, io.appmetrica.analytics.impl.InterfaceC0677rc
    public final InterfaceC0649qc a() {
        return new Xk();
    }
}
