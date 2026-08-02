package io.appmetrica.analytics;

import android.content.Context;
import io.appmetrica.analytics.impl.U0;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class AppMetricaYandex {
    public static void activatePulse(PulseConfig pulseConfig) {
        U0.a.a(pulseConfig);
    }

    public static void activateReporter(Context context, ReporterYandexConfig reporterYandexConfig) {
        U0.a.a(context, reporterYandexConfig);
    }

    public static void clearAppEnvironment() {
        U0.a.b();
    }

    public static void enableAnrMonitoring() {
        U0.a.c();
    }

    public static String getBuildNumber() {
        return BuildConfig.BUILD_NUMBER;
    }

    public static AdvIdentifiersResult getCachedAdvIdentifiers() {
        return U0.a.d();
    }

    public static Map<String, String> getClids() {
        return U0.a.e();
    }

    public static String getDeviceId(Context context) {
        return U0.a.a(context);
    }

    public static FeaturesResult getFeatures(Context context) {
        return U0.a.b(context);
    }

    public static MviEventsReporter getMviEventsReporter() {
        return U0.a.f();
    }

    public static IReporterYandex getReporter(Context context, String str) {
        return U0.a.a(context, str);
    }

    public static String getUuid(Context context) {
        return U0.a.c(context);
    }

    public static void initialize(Context context, AppMetricaYandexConfig appMetricaYandexConfig) {
        U0.a.a(context, appMetricaYandexConfig);
    }

    public static void putAppEnvironmentValue(String str, String str2) {
        U0.a.a(str, str2);
    }

    public static void putErrorEnvironmentValue(String str, String str2) {
        U0.a.b(str, str2);
    }

    public static void registerAnrListener(AnrListener anrListener) {
        U0.a.a(anrListener);
    }

    public static void reportDiagnosticEvent(String str, String str2) {
        U0.a.c(str, str2);
    }

    public static void reportDiagnosticStatboxEvent(String str, String str2) {
        U0.a.d(str, str2);
    }

    public static void reportRtmError(RtmErrorEvent rtmErrorEvent) {
        U0.a.a(rtmErrorEvent);
    }

    public static void reportRtmEvent(RtmClientEvent rtmClientEvent) {
        U0.a.a(rtmClientEvent);
    }

    public static void reportRtmException(String str, String str2) {
        U0.a.e(str, str2);
    }

    public static void reportStatboxEvent(String str, String str2) {
        U0.a.f(str, str2);
    }

    public static void reportUserInfoEvent(UserInfo userInfo) {
        U0.a.a(userInfo);
    }

    public static void requestAdvIdentifiers(Context context, IAdvIdentifiersCallback iAdvIdentifiersCallback) {
        U0.a.a(context, iAdvIdentifiersCallback);
    }

    public static void requestStartupParams(Context context, IParamsCallback iParamsCallback, String... strArr) {
        if (strArr == null || strArr.length == 0) {
            requestStartupParams(context, iParamsCallback, (List<String>) Arrays.asList("appmetrica_device_id", "appmetrica_uuid", "appmetrica_device_id_hash", IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS, IParamsCallback.YANDEX_MOBILE_METRICA_REPORT_AD_URL, IParamsCallback.YANDEX_MOBILE_METRICA_GET_AD_URL));
        } else {
            requestStartupParams(context, iParamsCallback, (List<String>) Arrays.asList(strArr));
        }
    }

    public static void sendEventsBuffer() {
        U0.a.g();
    }

    public static void setUserInfo(UserInfo userInfo) {
        U0.a.b(userInfo);
    }

    public static void updateRtmConfig(RtmConfig rtmConfig) {
        U0.a.a(rtmConfig);
    }

    public static void reportDiagnosticEvent(String str, Map<String, Object> map) {
        U0.a.a(str, map);
    }

    public static void reportRtmException(String str, Throwable th) {
        U0.a.a(str, th);
    }

    public static void reportStatboxEvent(String str, Map<String, Object> map) {
        U0.a.b(str, map);
    }

    public static void requestStartupParams(Context context, IParamsCallback iParamsCallback, List<String> list) {
        U0.a.a(context, iParamsCallback, list);
    }
}
