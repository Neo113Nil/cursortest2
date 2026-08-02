package io.appmetrica.analytics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.impl.AbstractC0176a1;
import io.appmetrica.analytics.impl.J1;
import io.appmetrica.analytics.impl.K1;
import io.appmetrica.analytics.plugins.AppMetricaPlugins;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class AppMetrica {
    public static void activate(Context context, AppMetricaConfig appMetricaConfig) {
        K1.a.a(context, appMetricaConfig);
    }

    public static void activateReporter(Context context, ReporterConfig reporterConfig) {
        K1.a.a(context, reporterConfig);
    }

    public static void clearAppEnvironment() {
        K1.a.b();
    }

    public static void enableActivityAutoTracking(Application application) {
        K1.a.a(application);
    }

    public static String getDeviceId(Context context) {
        return K1.a.a(context);
    }

    public static int getLibraryApiLevel() {
        return BuildConfig.API_LEVEL;
    }

    public static String getLibraryVersion() {
        return "8.2.0";
    }

    public static AppMetricaPlugins getPluginExtension() {
        return AbstractC0176a1.a;
    }

    public static IReporter getReporter(Context context, String str) {
        return K1.a.a(context, str);
    }

    public static String getUuid(Context context) {
        return K1.a.b(context).id;
    }

    public static void initWebViewReporting(WebView webView) {
        K1.a.a(webView);
    }

    public static void pauseSession(Activity activity) {
        K1.a.a(activity);
    }

    public static void putAppEnvironmentValue(String str, String str2) {
        K1.a.a(str, str2);
    }

    public static void putErrorEnvironmentValue(String str, String str2) {
        K1.a.b(str, str2);
    }

    public static void registerAnrListener(AnrListener anrListener) {
        K1.a.a(anrListener);
    }

    public static void reportAdRevenue(AdRevenue adRevenue) {
        K1.a.a(adRevenue);
    }

    public static void reportAnr(Map<Thread, StackTraceElement[]> map) {
        K1.a.a(map);
    }

    public static void reportAppOpen(Activity activity) {
        K1.a.b(activity);
    }

    public static void reportECommerce(ECommerceEvent eCommerceEvent) {
        K1.a.a(eCommerceEvent);
    }

    public static void reportError(String str, String str2) {
        K1.a.a(str, str2, (Throwable) null);
    }

    public static void reportEvent(String str) {
        K1.a.b(str);
    }

    public static void reportExternalAdRevenue(Object... objArr) {
        K1.a.b(objArr);
    }

    public static void reportExternalAttribution(ExternalAttribution externalAttribution) {
        K1.a.a(externalAttribution);
    }

    public static void reportRevenue(Revenue revenue) {
        K1.a.a(revenue);
    }

    public static void reportUnhandledException(Throwable th) {
        K1.a.a(th);
    }

    public static void reportUserProfile(UserProfile userProfile) {
        K1.a.a(userProfile);
    }

    public static void requestDeferredDeeplink(DeferredDeeplinkListener deferredDeeplinkListener) {
        K1.a.a(deferredDeeplinkListener);
    }

    public static void requestDeferredDeeplinkParameters(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        K1.a.a(deferredDeeplinkParametersListener);
    }

    public static void requestStartupParams(Context context, StartupParamsCallback startupParamsCallback, List<String> list) {
        J1 j1 = K1.a;
        if (list.isEmpty()) {
            list = Arrays.asList("appmetrica_uuid", "appmetrica_device_id", "appmetrica_device_id_hash");
        }
        j1.a(context, startupParamsCallback, list);
    }

    public static void resumeSession(Activity activity) {
        K1.a.c(activity);
    }

    public static void sendEventsBuffer() {
        K1.a.e();
    }

    public static void setAdvIdentifiersTracking(boolean z) {
        K1.a.a(z);
    }

    public static void setDataSendingEnabled(boolean z) {
        K1.a.b(z);
    }

    public static void setLocation(Location location) {
        K1.a.a(location);
    }

    public static void setLocationTracking(boolean z) {
        K1.a.c(z);
    }

    public static void setUserProfileID(String str) {
        K1.a.d(str);
    }

    public static void reportAppOpen(Intent intent) {
        K1.a.a(intent);
    }

    public static void reportEvent(String str, String str2) {
        K1.a.c(str, str2);
    }

    public static void reportError(String str, String str2, Throwable th) {
        K1.a.a(str, str2, th);
    }

    public static void reportAppOpen(String str) {
        K1.a.a(str);
    }

    public static void reportEvent(String str, Map<String, Object> map) {
        K1.a.a(str, map);
    }

    public static void reportError(String str, Throwable th) {
        K1.a.a(str, th);
    }
}
