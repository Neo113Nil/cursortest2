package io.appmetrica.analytics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.impl.AbstractC0782u1;
import io.appmetrica.analytics.impl.C0756t1;
import io.appmetrica.analytics.impl.K0;
import io.appmetrica.analytics.plugins.AppMetricaPlugins;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class AppMetrica {
    public static void activate(Context context, AppMetricaConfig appMetricaConfig) {
        AbstractC0782u1.f6961a.a(context, appMetricaConfig);
    }

    public static void activateReporter(Context context, ReporterConfig reporterConfig) {
        AbstractC0782u1.f6961a.a(context, reporterConfig);
    }

    public static void clearAppEnvironment() {
        AbstractC0782u1.f6961a.a();
    }

    public static void enableActivityAutoTracking(Application application) {
        AbstractC0782u1.f6961a.a(application);
    }

    public static String getDeviceId(Context context) {
        return AbstractC0782u1.f6961a.b();
    }

    public static int getLibraryApiLevel() {
        return BuildConfig.API_LEVEL;
    }

    public static String getLibraryVersion() {
        return "8.0.0";
    }

    public static AppMetricaPlugins getPluginExtension() {
        return K0.f4614a;
    }

    public static IReporter getReporter(Context context, String str) {
        return AbstractC0782u1.f6961a.a(context, str);
    }

    public static String getUuid(Context context) {
        return AbstractC0782u1.f6961a.a(context).id;
    }

    public static void initWebViewReporting(WebView webView) {
        AbstractC0782u1.f6961a.a(webView);
    }

    public static void pauseSession(Activity activity) {
        AbstractC0782u1.f6961a.a(activity);
    }

    public static void putAppEnvironmentValue(String str, String str2) {
        AbstractC0782u1.f6961a.a(str, str2);
    }

    public static void putErrorEnvironmentValue(String str, String str2) {
        AbstractC0782u1.f6961a.b(str, str2);
    }

    public static void registerAnrListener(AnrListener anrListener) {
        AbstractC0782u1.f6961a.a(anrListener);
    }

    public static void reportAdRevenue(AdRevenue adRevenue) {
        AbstractC0782u1.f6961a.a(adRevenue);
    }

    public static void reportAnr(Map<Thread, StackTraceElement[]> map) {
        AbstractC0782u1.f6961a.a(map);
    }

    public static void reportAppOpen(Activity activity) {
        AbstractC0782u1.f6961a.b(activity);
    }

    public static void reportECommerce(ECommerceEvent eCommerceEvent) {
        AbstractC0782u1.f6961a.a(eCommerceEvent);
    }

    public static void reportError(String str, String str2) {
        AbstractC0782u1.f6961a.a(str, str2, (Throwable) null);
    }

    public static void reportEvent(String str) {
        AbstractC0782u1.f6961a.b(str);
    }

    public static void reportExternalAdRevenue(Object... objArr) {
        AbstractC0782u1.f6961a.b(objArr);
    }

    public static void reportExternalAttribution(ExternalAttribution externalAttribution) {
        AbstractC0782u1.f6961a.a(externalAttribution);
    }

    public static void reportRevenue(Revenue revenue) {
        AbstractC0782u1.f6961a.a(revenue);
    }

    public static void reportUnhandledException(Throwable th) {
        AbstractC0782u1.f6961a.a(th);
    }

    public static void reportUserProfile(UserProfile userProfile) {
        AbstractC0782u1.f6961a.a(userProfile);
    }

    public static void requestDeferredDeeplink(DeferredDeeplinkListener deferredDeeplinkListener) {
        AbstractC0782u1.f6961a.a(deferredDeeplinkListener);
    }

    public static void requestDeferredDeeplinkParameters(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        AbstractC0782u1.f6961a.a(deferredDeeplinkParametersListener);
    }

    public static void requestStartupParams(Context context, StartupParamsCallback startupParamsCallback, List<String> list) {
        C0756t1 c0756t1 = AbstractC0782u1.f6961a;
        if (list.isEmpty()) {
            list = Arrays.asList(StartupParamsCallback.APPMETRICA_UUID, StartupParamsCallback.APPMETRICA_DEVICE_ID, StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH);
        }
        c0756t1.a(context, startupParamsCallback, list);
    }

    public static void resumeSession(Activity activity) {
        AbstractC0782u1.f6961a.c(activity);
    }

    public static void sendEventsBuffer() {
        AbstractC0782u1.f6961a.f();
    }

    public static void setAdvIdentifiersTracking(boolean z2) {
        AbstractC0782u1.f6961a.a(z2);
    }

    public static void setDataSendingEnabled(boolean z2) {
        AbstractC0782u1.f6961a.b(z2);
    }

    public static void setLocation(Location location) {
        AbstractC0782u1.f6961a.a(location);
    }

    public static void setLocationTracking(boolean z2) {
        AbstractC0782u1.f6961a.c(z2);
    }

    public static void setUserProfileID(String str) {
        AbstractC0782u1.f6961a.d(str);
    }

    public static void reportAppOpen(Intent intent) {
        AbstractC0782u1.f6961a.a(intent);
    }

    public static void reportError(String str, String str2, Throwable th) {
        AbstractC0782u1.f6961a.a(str, str2, th);
    }

    public static void reportEvent(String str, String str2) {
        AbstractC0782u1.f6961a.c(str, str2);
    }

    public static void reportAppOpen(String str) {
        AbstractC0782u1.f6961a.a(str);
    }

    public static void reportError(String str, Throwable th) {
        AbstractC0782u1.f6961a.a(str, th);
    }

    public static void reportEvent(String str, Map<String, Object> map) {
        AbstractC0782u1.f6961a.a(str, map);
    }
}
