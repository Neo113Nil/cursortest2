package io.appmetrica.analytics;

import android.location.Location;
import defpackage.ny61;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.impl.A8;
import io.appmetrica.analytics.impl.C0260cr;
import io.appmetrica.analytics.impl.C0412i6;
import io.appmetrica.analytics.impl.C0550n0;
import io.appmetrica.analytics.impl.Or;
import io.appmetrica.analytics.impl.Vc;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.yandex.common.startup.StartupRequest;

/* loaded from: classes9.dex */
public class AppMetricaConfig {
    public final Map<String, Object> additionalConfig;
    public final Boolean advIdentifiersTracking;
    public final Boolean anrMonitoring;
    public final Integer anrMonitoringTimeout;
    public final String apiKey;
    public final Integer appBuildNumber;
    public final Map<String, String> appEnvironment;
    public final Boolean appOpenTrackingEnabled;
    public final String appVersion;
    public final Boolean crashReporting;
    public final ICrashTransformer crashTransformer;
    public final List<String> customHosts;
    public final Boolean dataSendingEnabled;
    public final String deviceType;
    public final Integer dispatchPeriodSeconds;
    public final Map<String, String> errorEnvironment;
    public final Boolean firstActivationAsUpdate;
    public final Location location;
    public final Boolean locationTracking;
    public final Boolean logs;
    public final Integer maxReportsCount;
    public final Integer maxReportsInDatabaseCount;
    public final Boolean nativeCrashReporting;
    public final PreloadInfo preloadInfo;
    public final Boolean revenueAutoTrackingEnabled;
    public final Integer sessionTimeout;
    public final Boolean sessionsAutoTrackingEnabled;
    public final String userProfileID;

    private AppMetricaConfig(Builder builder) {
        this.apiKey = builder.b;
        this.appVersion = builder.c;
        this.sessionTimeout = builder.d;
        this.crashReporting = builder.e;
        this.nativeCrashReporting = builder.f;
        this.location = builder.g;
        this.locationTracking = builder.h;
        this.advIdentifiersTracking = builder.i;
        this.logs = builder.j;
        this.preloadInfo = builder.k;
        this.firstActivationAsUpdate = builder.l;
        this.dataSendingEnabled = builder.m;
        this.maxReportsInDatabaseCount = builder.n;
        this.errorEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.o);
        this.userProfileID = builder.p;
        this.revenueAutoTrackingEnabled = builder.q;
        this.sessionsAutoTrackingEnabled = builder.r;
        this.appOpenTrackingEnabled = builder.s;
        this.deviceType = builder.t;
        this.appBuildNumber = builder.u;
        this.dispatchPeriodSeconds = builder.v;
        this.maxReportsCount = builder.w;
        this.appEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.x);
        this.crashTransformer = builder.y;
        this.anrMonitoring = builder.z;
        this.anrMonitoringTimeout = builder.A;
        this.customHosts = builder.B;
        this.additionalConfig = CollectionUtils.unmodifiableSameOrderMapCopy(builder.C);
    }

    public static AppMetricaConfig fromJson(String str) {
        Builder a = new A4().a(str);
        if (a == null) {
            return null;
        }
        return a.build();
    }

    public static Builder newConfigBuilder(String str) {
        return new Builder(str, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x00ee A[Catch: all -> 0x010f, TryCatch #1 {all -> 0x010f, blocks: (B:3:0x0005, B:7:0x0053, B:9:0x00ee, B:12:0x00fc, B:13:0x00f7, B:14:0x00ff), top: B:2:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toJson() {
        String jSONObject;
        List<String> list;
        A8 a8 = new A8();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("apikey", this.apiKey);
            jSONObject2.put(StartupRequest.PARAM_APP_VERSION, this.appVersion);
            jSONObject2.put("session_timeout", this.sessionTimeout);
            jSONObject2.put("location", A4.a(this.location));
            PreloadInfo preloadInfo = this.preloadInfo;
            JSONArray jSONArray = null;
            if (preloadInfo != null) {
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("trackid", preloadInfo.getTrackingId());
                    jSONObject3.put("params", Vc.b(preloadInfo.getAdditionalParams()));
                    jSONObject = jSONObject3.toString();
                } catch (Throwable unused) {
                }
                jSONObject2.put("preload_info", jSONObject);
                jSONObject2.put("logs", this.logs);
                jSONObject2.put("crash_enabled", this.crashReporting);
                jSONObject2.put("crash_native_enabled", this.nativeCrashReporting);
                jSONObject2.put("location_enabled", this.locationTracking);
                jSONObject2.put("adv_identifiers_tracking", this.advIdentifiersTracking);
                jSONObject2.put("max_reports_in_db_count", this.maxReportsInDatabaseCount);
                jSONObject2.put("error_environment", Vc.b(this.errorEnvironment));
                jSONObject2.put("first_activation_as_update", this.firstActivationAsUpdate);
                jSONObject2.put("data_sending_enabled", this.dataSendingEnabled);
                jSONObject2.put("user_profile_id", this.userProfileID);
                jSONObject2.put("revenue_auto_tracking_enabled", this.revenueAutoTrackingEnabled);
                jSONObject2.put("sessions_auto_tracking_enabled", this.sessionsAutoTrackingEnabled);
                jSONObject2.put("app_open_tracking_enabled", this.appOpenTrackingEnabled);
                jSONObject2.put(CommonUrlParts.DEVICE_TYPE, this.deviceType);
                jSONObject2.put(CommonUrlParts.APP_VERSION_CODE, this.appBuildNumber);
                jSONObject2.put("dispatch_period_seconds", this.dispatchPeriodSeconds);
                jSONObject2.put("max_reports_count", this.maxReportsCount);
                jSONObject2.put("app_environment", Vc.b(this.appEnvironment));
                jSONObject2.put("anr_monitoring", this.anrMonitoring);
                jSONObject2.put("anr_monitoring_timeout", this.anrMonitoringTimeout);
                list = this.customHosts;
                if (list != null) {
                    if (!Or.a((Collection) list)) {
                        jSONArray = new JSONArray((Collection) list);
                    }
                    jSONObject2.put("customHosts", jSONArray);
                }
                jSONObject2.put("additional_config", a8.a(this.additionalConfig));
                return jSONObject2.toString();
            }
            jSONObject = null;
            jSONObject2.put("preload_info", jSONObject);
            jSONObject2.put("logs", this.logs);
            jSONObject2.put("crash_enabled", this.crashReporting);
            jSONObject2.put("crash_native_enabled", this.nativeCrashReporting);
            jSONObject2.put("location_enabled", this.locationTracking);
            jSONObject2.put("adv_identifiers_tracking", this.advIdentifiersTracking);
            jSONObject2.put("max_reports_in_db_count", this.maxReportsInDatabaseCount);
            jSONObject2.put("error_environment", Vc.b(this.errorEnvironment));
            jSONObject2.put("first_activation_as_update", this.firstActivationAsUpdate);
            jSONObject2.put("data_sending_enabled", this.dataSendingEnabled);
            jSONObject2.put("user_profile_id", this.userProfileID);
            jSONObject2.put("revenue_auto_tracking_enabled", this.revenueAutoTrackingEnabled);
            jSONObject2.put("sessions_auto_tracking_enabled", this.sessionsAutoTrackingEnabled);
            jSONObject2.put("app_open_tracking_enabled", this.appOpenTrackingEnabled);
            jSONObject2.put(CommonUrlParts.DEVICE_TYPE, this.deviceType);
            jSONObject2.put(CommonUrlParts.APP_VERSION_CODE, this.appBuildNumber);
            jSONObject2.put("dispatch_period_seconds", this.dispatchPeriodSeconds);
            jSONObject2.put("max_reports_count", this.maxReportsCount);
            jSONObject2.put("app_environment", Vc.b(this.appEnvironment));
            jSONObject2.put("anr_monitoring", this.anrMonitoring);
            jSONObject2.put("anr_monitoring_timeout", this.anrMonitoringTimeout);
            list = this.customHosts;
            if (list != null) {
            }
            jSONObject2.put("additional_config", a8.a(this.additionalConfig));
            return jSONObject2.toString();
        } catch (Throwable unused2) {
            return "";
        }
    }

    public static class Builder {
        private static final C0260cr D = new C0260cr(new C0550n0());
        private Integer A;
        private List B;
        private final HashMap C;
        private final C0412i6 a;
        private final String b;
        private String c;
        private Integer d;
        private Boolean e;
        private Boolean f;
        private Location g;
        private Boolean h;
        private Boolean i;
        private Boolean j;
        private PreloadInfo k;
        private Boolean l;
        private Boolean m;
        private Integer n;
        private final LinkedHashMap o;
        private String p;
        private Boolean q;
        private Boolean r;
        private Boolean s;
        private String t;
        private Integer u;
        private Integer v;
        private Integer w;
        private final LinkedHashMap x;
        private ICrashTransformer y;
        private Boolean z;

        private Builder(String str) {
            this.o = new LinkedHashMap();
            this.x = new LinkedHashMap();
            this.C = new HashMap();
            D.a(str);
            this.a = new C0412i6(str);
            this.b = str;
        }

        public AppMetricaConfig build() {
            return new AppMetricaConfig(this, 0);
        }

        public Builder handleFirstActivationAsUpdate(boolean z) {
            this.l = Boolean.valueOf(z);
            return this;
        }

        public Builder withAdditionalConfig(String str, Object obj) {
            this.C.put(str, obj);
            return this;
        }

        public Builder withAdvIdentifiersTracking(boolean z) {
            this.i = Boolean.valueOf(z);
            return this;
        }

        public Builder withAnrMonitoring(boolean z) {
            this.z = Boolean.valueOf(z);
            return this;
        }

        public Builder withAnrMonitoringTimeout(int i) {
            this.A = Integer.valueOf(i);
            return this;
        }

        public Builder withAppBuildNumber(int i) {
            if (i >= 0) {
                this.u = Integer.valueOf(i);
                return this;
            }
            ny61.g(String.format(Locale.US, "Invalid %1$s. %1$s should be positive.", "App Build Number"));
            return null;
        }

        public Builder withAppEnvironmentValue(String str, String str2) {
            this.x.put(str, str2);
            return this;
        }

        public Builder withAppOpenTrackingEnabled(boolean z) {
            this.s = Boolean.valueOf(z);
            return this;
        }

        public Builder withAppVersion(String str) {
            this.c = str;
            return this;
        }

        public Builder withCrashReporting(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public Builder withCrashTransformer(ICrashTransformer iCrashTransformer) {
            this.y = iCrashTransformer;
            return this;
        }

        public Builder withCustomHosts(List<String> list) {
            this.B = CollectionUtils.unmodifiableListCopy(list);
            return this;
        }

        public Builder withDataSendingEnabled(boolean z) {
            this.m = Boolean.valueOf(z);
            return this;
        }

        public Builder withDeviceType(String str) {
            this.t = str;
            if (!PredefinedDeviceTypes.ALL_VALUES.contains(str)) {
                PublicLogger.getAnonymousInstance().info("PredefinedDeviceTypes does not contain value for `deviceType = %s`. It may cause events to not appear in AppMetrica reports.", str);
            }
            return this;
        }

        public Builder withDispatchPeriodSeconds(int i) {
            this.v = Integer.valueOf(i);
            return this;
        }

        public Builder withErrorEnvironmentValue(String str, String str2) {
            this.o.put(str, str2);
            return this;
        }

        public Builder withLocation(Location location) {
            this.g = location;
            return this;
        }

        public Builder withLocationTracking(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        public Builder withLogs() {
            this.j = Boolean.TRUE;
            return this;
        }

        public Builder withMaxReportsCount(int i) {
            this.w = Integer.valueOf(i);
            return this;
        }

        public Builder withMaxReportsInDatabaseCount(int i) {
            this.n = Integer.valueOf(this.a.a(i));
            return this;
        }

        public Builder withNativeCrashReporting(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public Builder withPreloadInfo(PreloadInfo preloadInfo) {
            this.k = preloadInfo;
            return this;
        }

        public Builder withRevenueAutoTrackingEnabled(boolean z) {
            this.q = Boolean.valueOf(z);
            return this;
        }

        public Builder withSessionTimeout(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }

        public Builder withSessionsAutoTrackingEnabled(boolean z) {
            this.r = Boolean.valueOf(z);
            return this;
        }

        public Builder withUserProfileID(String str) {
            this.p = str;
            return this;
        }

        public /* synthetic */ Builder(String str, int i) {
            this(str);
        }
    }

    public /* synthetic */ AppMetricaConfig(Builder builder, int i) {
        this(builder);
    }

    public AppMetricaConfig(AppMetricaConfig appMetricaConfig) {
        this.apiKey = appMetricaConfig.apiKey;
        this.appVersion = appMetricaConfig.appVersion;
        this.sessionTimeout = appMetricaConfig.sessionTimeout;
        this.crashReporting = appMetricaConfig.crashReporting;
        this.nativeCrashReporting = appMetricaConfig.nativeCrashReporting;
        this.location = appMetricaConfig.location;
        this.locationTracking = appMetricaConfig.locationTracking;
        this.advIdentifiersTracking = appMetricaConfig.advIdentifiersTracking;
        this.logs = appMetricaConfig.logs;
        this.preloadInfo = appMetricaConfig.preloadInfo;
        this.firstActivationAsUpdate = appMetricaConfig.firstActivationAsUpdate;
        this.dataSendingEnabled = appMetricaConfig.dataSendingEnabled;
        this.maxReportsInDatabaseCount = appMetricaConfig.maxReportsInDatabaseCount;
        this.errorEnvironment = appMetricaConfig.errorEnvironment;
        this.userProfileID = appMetricaConfig.userProfileID;
        this.revenueAutoTrackingEnabled = appMetricaConfig.revenueAutoTrackingEnabled;
        this.sessionsAutoTrackingEnabled = appMetricaConfig.sessionsAutoTrackingEnabled;
        this.appOpenTrackingEnabled = appMetricaConfig.appOpenTrackingEnabled;
        this.deviceType = appMetricaConfig.deviceType;
        this.appBuildNumber = appMetricaConfig.appBuildNumber;
        this.dispatchPeriodSeconds = appMetricaConfig.dispatchPeriodSeconds;
        this.maxReportsCount = appMetricaConfig.maxReportsCount;
        this.appEnvironment = appMetricaConfig.appEnvironment;
        this.crashTransformer = appMetricaConfig.crashTransformer;
        this.anrMonitoring = appMetricaConfig.anrMonitoring;
        this.anrMonitoringTimeout = appMetricaConfig.anrMonitoringTimeout;
        this.customHosts = appMetricaConfig.customHosts;
        this.additionalConfig = appMetricaConfig.additionalConfig;
    }
}
