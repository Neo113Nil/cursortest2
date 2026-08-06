package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.AppMetricaConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class D7 implements Hc {

    /* renamed from: a, reason: collision with root package name */
    public Location f4281a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f4282b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f4283c;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f4285e;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4288h;

    /* renamed from: i, reason: collision with root package name */
    public String f4289i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4291k;

    /* renamed from: l, reason: collision with root package name */
    public C0851wi f4292l;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f4284d = Boolean.FALSE;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f4286f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f4287g = new LinkedHashMap();

    /* renamed from: j, reason: collision with root package name */
    public List<String> f4290j = new ArrayList();

    @Override // io.appmetrica.analytics.impl.Hc
    public final void a(boolean z2) {
        Boolean valueOf = Boolean.valueOf(z2);
        this.f4282b = valueOf;
        C0851wi c0851wi = this.f4292l;
        if (c0851wi != null) {
            c0851wi.a(valueOf, this.f4285e, this.f4283c, this.f4284d);
        }
    }

    @Override // io.appmetrica.analytics.impl.Hc
    public final void clearAppEnvironment() {
        this.f4288h = true;
        this.f4286f.clear();
    }

    public final C0548l0 j() {
        return new C0548l0(this.f4290j, this.f4288h);
    }

    public final Location k() {
        return this.f4281a;
    }

    public final Boolean l() {
        return this.f4283c;
    }

    public final Boolean m() {
        return this.f4285e;
    }

    public final Boolean n() {
        return this.f4282b;
    }

    public final boolean o() {
        return this.f4288h;
    }

    @Override // io.appmetrica.analytics.impl.Hc
    public final void putAppEnvironmentValue(String str, String str2) {
        this.f4286f.put(str, str2);
    }

    @Override // io.appmetrica.analytics.impl.Hc
    public final void setDataSendingEnabled(boolean z2) {
        Boolean valueOf = Boolean.valueOf(z2);
        this.f4285e = valueOf;
        C0851wi c0851wi = this.f4292l;
        if (c0851wi != null) {
            c0851wi.a(this.f4282b, valueOf, this.f4283c, this.f4284d);
        }
    }

    @Override // io.appmetrica.analytics.impl.Hc
    public final void setUserProfileID(String str) {
        this.f4289i = str;
    }

    @Override // io.appmetrica.analytics.impl.Hc
    public final void a(boolean z2, boolean z3) {
        boolean z4 = this.f4283c == null;
        boolean booleanValue = this.f4284d.booleanValue();
        if (z3 || z4 || !booleanValue) {
            this.f4283c = Boolean.valueOf(z2);
            Boolean valueOf = Boolean.valueOf(z3);
            this.f4284d = valueOf;
            C0851wi c0851wi = this.f4292l;
            if (c0851wi != null) {
                c0851wi.a(this.f4282b, this.f4285e, this.f4283c, valueOf);
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Hc
    public final void a(Location location) {
        this.f4281a = location;
    }

    @Override // io.appmetrica.analytics.impl.Hc
    public final void a(String str, String str2) {
        this.f4287g.put(str, str2);
    }

    public final AppMetricaConfig a(AppMetricaConfig appMetricaConfig) {
        if (this.f4291k) {
            return appMetricaConfig;
        }
        AppMetricaConfig.Builder newConfigBuilder = AppMetricaConfig.newConfigBuilder(appMetricaConfig.apiKey);
        newConfigBuilder.withDeviceType(appMetricaConfig.deviceType);
        newConfigBuilder.withPreloadInfo(appMetricaConfig.preloadInfo);
        newConfigBuilder.withLocation(appMetricaConfig.location);
        if (AbstractC0572lo.a(appMetricaConfig.appVersion)) {
            newConfigBuilder.withAppVersion(appMetricaConfig.appVersion);
        }
        if (AbstractC0572lo.a(appMetricaConfig.dispatchPeriodSeconds)) {
            newConfigBuilder.withDispatchPeriodSeconds(appMetricaConfig.dispatchPeriodSeconds.intValue());
        }
        if (AbstractC0572lo.a(appMetricaConfig.appBuildNumber)) {
            newConfigBuilder.withAppBuildNumber(appMetricaConfig.appBuildNumber.intValue());
        }
        if (AbstractC0572lo.a(appMetricaConfig.maxReportsCount)) {
            newConfigBuilder.withMaxReportsCount(appMetricaConfig.maxReportsCount.intValue());
        }
        if (AbstractC0572lo.a(appMetricaConfig.logs) && appMetricaConfig.logs.booleanValue()) {
            newConfigBuilder.withLogs();
        }
        if (AbstractC0572lo.a(appMetricaConfig.sessionTimeout)) {
            newConfigBuilder.withSessionTimeout(appMetricaConfig.sessionTimeout.intValue());
        }
        if (AbstractC0572lo.a(appMetricaConfig.sessionsAutoTrackingEnabled)) {
            newConfigBuilder.withSessionsAutoTrackingEnabled(appMetricaConfig.sessionsAutoTrackingEnabled.booleanValue());
        }
        if (AbstractC0572lo.a(appMetricaConfig.crashReporting)) {
            newConfigBuilder.withCrashReporting(appMetricaConfig.crashReporting.booleanValue());
        }
        if (AbstractC0572lo.a(appMetricaConfig.nativeCrashReporting)) {
            newConfigBuilder.withNativeCrashReporting(appMetricaConfig.nativeCrashReporting.booleanValue());
        }
        if (AbstractC0572lo.a(appMetricaConfig.locationTracking)) {
            newConfigBuilder.withLocationTracking(appMetricaConfig.locationTracking.booleanValue());
        }
        if (AbstractC0572lo.a(appMetricaConfig.advIdentifiersTracking)) {
            newConfigBuilder.withAdvIdentifiersTracking(appMetricaConfig.advIdentifiersTracking.booleanValue());
        }
        if (AbstractC0572lo.a(appMetricaConfig.firstActivationAsUpdate)) {
            newConfigBuilder.handleFirstActivationAsUpdate(appMetricaConfig.firstActivationAsUpdate.booleanValue());
        }
        if (AbstractC0572lo.a(appMetricaConfig.dataSendingEnabled)) {
            newConfigBuilder.withDataSendingEnabled(appMetricaConfig.dataSendingEnabled.booleanValue());
        }
        if (AbstractC0572lo.a(appMetricaConfig.anrMonitoring)) {
            newConfigBuilder.withAnrMonitoring(appMetricaConfig.anrMonitoring.booleanValue());
        }
        if (AbstractC0572lo.a(appMetricaConfig.anrMonitoringTimeout)) {
            newConfigBuilder.withAnrMonitoringTimeout(appMetricaConfig.anrMonitoringTimeout.intValue());
        }
        if (AbstractC0572lo.a(appMetricaConfig.maxReportsInDatabaseCount)) {
            newConfigBuilder.withMaxReportsInDatabaseCount(appMetricaConfig.maxReportsInDatabaseCount.intValue());
        }
        if (AbstractC0572lo.a(appMetricaConfig.crashTransformer)) {
            newConfigBuilder.withCrashTransformer(appMetricaConfig.crashTransformer);
        }
        if (AbstractC0572lo.a(appMetricaConfig.userProfileID)) {
            newConfigBuilder.withUserProfileID(appMetricaConfig.userProfileID);
        }
        if (AbstractC0572lo.a(appMetricaConfig.revenueAutoTrackingEnabled)) {
            newConfigBuilder.withRevenueAutoTrackingEnabled(appMetricaConfig.revenueAutoTrackingEnabled.booleanValue());
        }
        if (AbstractC0572lo.a(appMetricaConfig.appOpenTrackingEnabled)) {
            newConfigBuilder.withAppOpenTrackingEnabled(appMetricaConfig.appOpenTrackingEnabled.booleanValue());
        }
        if (AbstractC0572lo.a((Object) appMetricaConfig.customHosts)) {
            newConfigBuilder.withCustomHosts(appMetricaConfig.customHosts);
        }
        LinkedHashMap linkedHashMap = this.f4286f;
        if (!AbstractC0572lo.a((Map) linkedHashMap)) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                newConfigBuilder.withAppEnvironmentValue((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Map<String, String> map = appMetricaConfig.appEnvironment;
        if (!AbstractC0572lo.a((Map) map)) {
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                newConfigBuilder.withAppEnvironmentValue(entry2.getKey(), entry2.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = this.f4287g;
        if (!AbstractC0572lo.a((Map) linkedHashMap2)) {
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                newConfigBuilder.withErrorEnvironmentValue((String) entry3.getKey(), (String) entry3.getValue());
            }
        }
        Map<String, String> map2 = appMetricaConfig.errorEnvironment;
        if (!AbstractC0572lo.a((Map) map2)) {
            for (Map.Entry<String, String> entry4 : map2.entrySet()) {
                newConfigBuilder.withErrorEnvironmentValue(entry4.getKey(), entry4.getValue());
            }
        }
        Map<String, Object> map3 = appMetricaConfig.additionalConfig;
        if (!AbstractC0572lo.a((Map) map3)) {
            for (Map.Entry<String, Object> entry5 : map3.entrySet()) {
                newConfigBuilder.withAdditionalConfig(entry5.getKey(), entry5.getValue());
            }
        }
        Boolean bool = this.f4282b;
        if (appMetricaConfig.locationTracking == null && AbstractC0572lo.a(bool)) {
            newConfigBuilder.withLocationTracking(bool.booleanValue());
        }
        Location location = this.f4281a;
        if (appMetricaConfig.location == null && AbstractC0572lo.a(location)) {
            newConfigBuilder.withLocation(location);
        }
        Boolean bool2 = this.f4285e;
        if (appMetricaConfig.dataSendingEnabled == null && AbstractC0572lo.a(bool2)) {
            newConfigBuilder.withDataSendingEnabled(bool2.booleanValue());
        }
        if (!AbstractC0572lo.a(appMetricaConfig.userProfileID) && AbstractC0572lo.a(this.f4289i)) {
            newConfigBuilder.withUserProfileID(this.f4289i);
        }
        Boolean bool3 = this.f4283c;
        if (appMetricaConfig.advIdentifiersTracking == null && AbstractC0572lo.a(bool3)) {
            newConfigBuilder.withAdvIdentifiersTracking(bool3.booleanValue());
        }
        this.f4291k = true;
        this.f4281a = null;
        this.f4282b = null;
        this.f4283c = null;
        this.f4284d = Boolean.FALSE;
        this.f4285e = null;
        this.f4286f.clear();
        this.f4287g.clear();
        this.f4288h = false;
        this.f4289i = null;
        return newConfigBuilder.build();
    }

    @Override // io.appmetrica.analytics.impl.Hc
    public final void a(String str) {
        this.f4290j.add(str);
    }

    public final void a(C0851wi c0851wi) {
        Boolean bool = this.f4282b;
        if (bool != null || this.f4285e != null || this.f4283c != null) {
            c0851wi.a(bool, this.f4285e, this.f4283c, this.f4284d);
        }
        this.f4292l = c0851wi;
    }
}
