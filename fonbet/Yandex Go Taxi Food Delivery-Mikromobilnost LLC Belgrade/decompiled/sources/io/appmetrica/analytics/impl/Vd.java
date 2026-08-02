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
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class Vd implements InterfaceC0446jc, InterfaceC0651qe {
    public final InterfaceC0446jc a;
    public final Ol b;
    public final L1 c;

    public Vd(InterfaceC0446jc interfaceC0446jc, Ol ol, L1 l1) {
        this.a = interfaceC0446jc;
        this.b = ol;
        this.c = l1;
        l1.a(null);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.Ce
    public final void a(String str) {
        this.a.a(str);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.InterfaceC0651qe
    public final void b() {
        this.a.b();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.InterfaceC0651qe
    public final List<String> c() {
        return this.a.c();
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        this.a.clearAppEnvironment();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.InterfaceC0274dc
    public final boolean d() {
        return this.a.d();
    }

    @Override // io.appmetrica.analytics.IReporter
    public final IPluginReporter getPluginExtension() {
        return this.a.getPluginExtension();
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.a.pauseSession();
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(String str, String str2) {
        this.a.putAppEnvironmentValue(str, str2);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(AdRevenue adRevenue) {
        this.a.reportAdRevenue(adRevenue);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(Map<Thread, StackTraceElement[]> map) {
        this.a.reportAnr(map);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(ECommerceEvent eCommerceEvent) {
        this.a.reportECommerce(eCommerceEvent);
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        this.a.reportError(pluginErrorDetails, str);
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(ModuleEvent moduleEvent) {
        this.a.reportEvent(moduleEvent);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(Revenue revenue) {
        this.a.reportRevenue(revenue);
    }

    @Override // io.appmetrica.analytics.ReporterYandexExtension
    public final void reportRtmError(RtmErrorEvent rtmErrorEvent) {
        this.b.reportRtmError(rtmErrorEvent);
    }

    @Override // io.appmetrica.analytics.ReporterYandexExtension
    public final void reportRtmEvent(RtmClientEvent rtmClientEvent) {
        this.b.reportRtmEvent(rtmClientEvent);
    }

    @Override // io.appmetrica.analytics.ReporterYandexExtension
    public final void reportRtmException(String str, Throwable th) {
        this.b.reportRtmException(str, th);
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        this.a.reportUnhandledException(pluginErrorDetails);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(UserProfile userProfile) {
        this.a.reportUserProfile(userProfile);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        this.a.resumeSession();
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
        this.a.sendEventsBuffer();
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z) {
        this.a.setDataSendingEnabled(z);
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(String str, byte[] bArr) {
        this.a.setSessionExtra(str, bArr);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(String str) {
        this.a.setUserProfileID(str);
    }

    @Override // io.appmetrica.analytics.ReporterYandexExtension
    public final void updateRtmConfig(RtmConfig rtmConfig) {
        this.b.updateRtmConfig(rtmConfig);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.InterfaceC0651qe
    public final void a(EnumC0578o enumC0578o) {
        this.a.a(enumC0578o);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.InterfaceC0274dc
    public final void b(String str, String str2) {
        this.a.b(str, str2);
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(AdRevenue adRevenue, boolean z) {
        this.a.reportAdRevenue(adRevenue, z);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2) {
        this.a.reportError(str, str2);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str) {
        this.a.reportEvent(str);
    }

    @Override // io.appmetrica.analytics.ReporterYandexExtension
    public final void reportRtmException(String str, String str2) {
        this.b.reportRtmException(str, str2);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(Throwable th) {
        this.a.reportUnhandledException(th);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.InterfaceC0651qe
    public final void a(ls lsVar) {
        this.a.a(lsVar);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.InterfaceC0274dc
    public final void b(String str) {
        this.a.b(str);
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.a.reportError(str, str2, pluginErrorDetails);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, String str2) {
        this.a.reportEvent(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.InterfaceC0651qe
    public final void a(Activity activity) {
        this.a.a(activity);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.InterfaceC0651qe
    public final void b(Activity activity) {
        this.a.b(activity);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2, Throwable th) {
        this.a.reportError(str, str2, th);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, Map<String, Object> map) {
        this.a.reportEvent(str, map);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.Ce
    public final void a(String str, String str2) {
        this.a.a(str, str2);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, Throwable th) {
        this.a.reportError(str, th);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.InterfaceC0651qe
    public final void a(AnrListener anrListener) {
        this.a.a(anrListener);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0620pc, io.appmetrica.analytics.impl.InterfaceC0521m0
    public final void a(C0204b0 c0204b0) {
        this.a.a(c0204b0);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.InterfaceC0651qe
    public final void a(String str, boolean z) {
        this.a.a(str, z);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.InterfaceC0651qe
    public final void a(ExternalAttribution externalAttribution) {
        this.a.a(externalAttribution);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0620pc, io.appmetrica.analytics.impl.InterfaceC0735tc
    public final void a(C0606or c0606or) {
        this.a.a(c0606or);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.Ce
    public final void a(boolean z, boolean z2) {
        this.a.a(z, z2);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.Ce
    public final void a(Location location) {
        this.a.a(location);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0446jc, io.appmetrica.analytics.impl.Ce
    public final void a(boolean z) {
        this.a.a(z);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0651qe
    public final void a(PulseConfig pulseConfig) {
        this.c.a(pulseConfig);
    }
}
