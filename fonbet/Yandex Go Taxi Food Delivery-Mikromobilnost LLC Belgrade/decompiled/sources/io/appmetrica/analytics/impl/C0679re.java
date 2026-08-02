package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.location.Location;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.PulseConfig;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.RtmClientEvent;
import io.appmetrica.analytics.RtmConfig;
import io.appmetrica.analytics.RtmErrorEvent;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.re, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0679re implements InterfaceC0651qe {
    @Override // io.appmetrica.analytics.impl.InterfaceC0651qe
    public final void a(Activity activity) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.Ce
    public final void a(Location location) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0651qe
    public final void b() {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0651qe
    public final void b(Activity activity) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0651qe
    public final List<String> c() {
        return new ArrayList();
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.InterfaceC0274dc
    public final boolean d() {
        return false;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final IPluginReporter getPluginExtension() {
        return new Ch();
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(AdRevenue adRevenue) {
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(AdRevenue adRevenue, boolean z) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(Map<Thread, StackTraceElement[]> map) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(ECommerceEvent eCommerceEvent) {
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(PluginErrorDetails pluginErrorDetails, String str) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(ModuleEvent moduleEvent) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(Revenue revenue) {
    }

    @Override // io.appmetrica.analytics.ReporterYandexExtension
    public final void reportRtmError(RtmErrorEvent rtmErrorEvent) {
    }

    @Override // io.appmetrica.analytics.ReporterYandexExtension
    public final void reportRtmEvent(RtmClientEvent rtmClientEvent) {
    }

    @Override // io.appmetrica.analytics.ReporterYandexExtension
    public final void reportRtmException(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.ReporterYandexExtension
    public final void reportRtmException(String str, Throwable th) {
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(Throwable th) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(UserProfile userProfile) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z) {
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(String str, byte[] bArr) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(String str) {
    }

    @Override // io.appmetrica.analytics.ReporterYandexExtension
    public final void updateRtmConfig(RtmConfig rtmConfig) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0651qe
    public final void a(AnrListener anrListener) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.InterfaceC0274dc
    public final void b(String str) {
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0651qe
    public final void a(ExternalAttribution externalAttribution) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.InterfaceC0274dc
    public final void b(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2, Throwable th) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, Map<String, Object> map) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0651qe
    public final void a(PulseConfig pulseConfig) {
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, Throwable th) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0620pc, io.appmetrica.analytics.impl.InterfaceC0521m0
    public final void a(C0204b0 c0204b0) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0651qe
    public final void a(ls lsVar) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0651qe
    public final void a(EnumC0578o enumC0578o) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0620pc, io.appmetrica.analytics.impl.InterfaceC0735tc
    public final void a(C0606or c0606or) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.Ce
    public final void a(String str) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.Ce
    public final void a(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0651qe
    public final void a(String str, boolean z) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.Ce
    public final void a(boolean z) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.Ce
    public final void a(boolean z, boolean z2) {
    }
}
