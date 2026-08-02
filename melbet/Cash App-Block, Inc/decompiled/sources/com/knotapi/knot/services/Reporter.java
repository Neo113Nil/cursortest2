package com.knotapi.knot.services;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.BackStackRecord;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.knotapi.knot.BuildConfig;
import com.knotapi.knot.Knot;
import com.knotapi.knot.models.DeviceInfo;
import com.knotapi.knot.models.LogLevel;
import com.knotapi.knot.services.Reporter;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.knotapi.knot.utilities.Helper;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import com.plaid.internal.r6$$ExternalSyntheticLambda0;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.function.Function;
import java.util.function.Predicate;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Reporter {
    private static final int MAX_BREADCRUMBS = 100;
    private static final int MAX_QUEUE_SIZE = 50;
    private static final int MAX_RETRY_COUNT = 3;
    private static final String PREF_KEY_CRASH_COUNT = "crash_count";
    private static final String PREF_KEY_ERROR_QUEUE = "error_queue";
    private static final String PREF_KEY_LAST_CRASH = "last_crash_data";
    private static final String PREF_NAME = "knot_error_reporter";
    private static final String TAG = "Reporter";
    private static volatile Context applicationContext = null;
    private static final Map<String, List<JSONObject>> breadcrumbStorage = new ConcurrentHashMap();
    private static volatile String currentEnvironment = null;
    private static volatile String currentSessionId = null;
    private static volatile ExecutorService executorService = null;
    private static volatile boolean initialized = false;

    @FunctionalInterface
    /* loaded from: classes4.dex */
    public interface BreadcrumbRetriever<T> {
        T retrieve(String str);
    }

    @FunctionalInterface
    /* loaded from: classes4.dex */
    public interface BreadcrumbValidator<T> {
        boolean isValid(T t);
    }

    @FunctionalInterface
    public interface ContextConsumer {
        void accept(Context context);
    }

    @FunctionalInterface
    /* loaded from: classes4.dex */
    public interface DataCaptureFunction {
        String capture();
    }

    /* loaded from: classes4.dex */
    public static class ErrorContext {
        private final Context context;
        private final Exception exception;
        private final boolean isCrash;
        private final String message;
        private final String threadName;

        public static class Builder {
            private Exception exception;
            private String message = "";
            private Context context = null;
            private String threadName = null;
            private boolean isCrash = false;

            public ErrorContext build() {
                return new ErrorContext(this);
            }

            public Builder context(Context context) {
                this.context = context != null ? context.getApplicationContext() : null;
                return this;
            }

            public Builder exception(Exception exc) {
                this.exception = exc;
                return this;
            }

            public Builder isCrash(boolean z) {
                this.isCrash = z;
                return this;
            }

            public Builder message(String str) {
                this.message = str;
                return this;
            }

            public Builder threadName(String str) {
                this.threadName = str;
                return this;
            }
        }

        private ErrorContext(Builder builder) {
            this.exception = builder.exception;
            this.message = builder.message;
            this.context = builder.context;
            this.threadName = builder.threadName;
            this.isCrash = builder.isCrash;
        }

        public Context getContext() {
            return this.context;
        }

        public Exception getException() {
            return this.exception;
        }

        public String getMessage() {
            return this.message;
        }

        public String getThreadName() {
            return this.threadName;
        }

        public boolean isCrash() {
            return this.isCrash;
        }
    }

    @FunctionalInterface
    /* loaded from: classes4.dex */
    public interface QueueModifier {
        void modify(List<Report> list);
    }

    /* loaded from: classes4.dex */
    public static class Report {
        String breadcrumbs;
        String deviceInfo;
        String environment;
        String exceptionMessage;
        String exceptionType;
        String hostAppInfo;
        boolean isCrash;
        String message;
        int retryCount;
        String runtimeState;
        String sdkVersion;
        boolean sending;
        String sessionId;
        String stackTrace;
        String threadName;
        long timestamp;

        private Report() {
            this.sending = false;
            this.retryCount = 0;
            this.isCrash = false;
        }
    }

    private static void addActivityInfo(JSONObject jSONObject, Activity activity, Context context) {
        try {
            ComponentName callingActivity = activity.getCallingActivity();
            if (callingActivity != null) {
                jSONObject.put("callingActivity", callingActivity.getClassName());
                jSONObject.put("callingPackage", callingActivity.getPackageName());
            }
            jSONObject.put("sdkActivity", activity.getClass().getSimpleName());
            addActivityStackInfo(jSONObject, context);
        } catch (Exception unused) {
        }
    }

    private static void addActivityStackInfo(JSONObject jSONObject, Context context) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty()) {
                ActivityManager.RunningTaskInfo runningTaskInfo = runningTasks.get(0);
                ComponentName componentName = runningTaskInfo.topActivity;
                if (componentName != null) {
                    jSONObject.put("topActivity", componentName.getClassName());
                }
                ComponentName componentName2 = runningTaskInfo.baseActivity;
                if (componentName2 != null) {
                    jSONObject.put("baseActivity", componentName2.getClassName());
                }
                jSONObject.put("activityStackCount", runningTaskInfo.numActivities);
            }
        } catch (Exception unused) {
        }
    }

    private static void addAppMetadata(JSONObject jSONObject, Context context, String str) {
        try {
            jSONObject.put("appName", context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString());
        } catch (Exception unused) {
            jSONObject.put("appName", "unknown");
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            jSONObject.put("versionName", packageInfo.versionName);
            jSONObject.put("versionCode", packageInfo.versionCode);
        } catch (Exception unused2) {
            jSONObject.put("versionName", "unknown");
        }
    }

    private static void addBackStackNames(JSONObject jSONObject, FragmentManager fragmentManager, int i) {
        Object obj;
        JSONArray jSONArray = new JSONArray();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == fragmentManager.mBackStack.size()) {
                obj = fragmentManager.mTransitioningOp;
                if (obj == null) {
                    JWK$$ExternalSyntheticBUOutline0.m2173m();
                    return;
                }
            } else {
                obj = (FragmentManager.BackStackEntry) fragmentManager.mBackStack.get(i2);
            }
            if (((BackStackRecord) obj).mName != null) {
                jSONArray.put(((BackStackRecord) obj).mName);
            }
        }
        if (jSONArray.length() > 0) {
            jSONObject.put("fragmentBackStackNames", jSONArray);
        }
    }

    public static void addBreadcrumb(String str, String str2) {
        try {
            storeBreadcrumb(BreadcrumbHelper.Identifier.SESSION, str, str2);
        } catch (Exception unused) {
        }
    }

    private static void addFragmentInfo(JSONObject jSONObject, Activity activity) {
        if (activity instanceof FragmentActivity) {
            try {
                FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
                if (supportFragmentManager == null) {
                    return;
                }
                int size = supportFragmentManager.mFragmentStore.getFragments().size();
                int backStackEntryCount = supportFragmentManager.getBackStackEntryCount();
                jSONObject.put("fragmentCount", size);
                jSONObject.put("fragmentBackStackCount", backStackEntryCount);
                addFragmentNames(jSONObject, supportFragmentManager);
                addBackStackNames(jSONObject, supportFragmentManager, backStackEntryCount);
            } catch (Exception unused) {
            }
        }
    }

    private static void addFragmentNames(JSONObject jSONObject, FragmentManager fragmentManager) {
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        for (Fragment fragment : fragmentManager.mFragmentStore.getFragments()) {
            if (fragment != null) {
                String simpleName = fragment.getClass().getSimpleName();
                jSONArray.put(simpleName);
                if (fragment.isVisible()) {
                    jSONArray2.put(simpleName);
                }
            }
        }
        if (jSONArray.length() > 0) {
            jSONObject.put("allFragments", jSONArray);
        }
        if (jSONArray2.length() > 0) {
            jSONObject.put("visibleFragments", jSONArray2);
        }
    }

    private static void addReportToQueue(Report report, Context context, boolean z) {
        modifyReportQueue(new Reporter$$ExternalSyntheticLambda3(report, 0), context, z, "add report to queue");
    }

    private static void appendIfNotNull(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(": ");
        if (str2 == null) {
            str2 = str3;
        }
        sb.append(str2);
        sb.append("\n");
    }

    private static void appendIfPresent(StringBuilder sb, String str, String str2) {
        if (str2 == null || str2.isEmpty()) {
            return;
        }
        Boxes$$ExternalSyntheticOutline1.m(sb, str, ": ", str2, "\n");
    }

    private static void attachBreadcrumbs(Report report) {
        if (!initialized || applicationContext == null) {
            return;
        }
        try {
            JSONArray andClearBreadcrumbsAsJson = getAndClearBreadcrumbsAsJson(BreadcrumbHelper.Identifier.SESSION);
            if (andClearBreadcrumbsAsJson == null || andClearBreadcrumbsAsJson.length() <= 0) {
                return;
            }
            report.breadcrumbs = andClearBreadcrumbsAsJson.toString();
        } catch (Exception unused) {
        }
    }

    private static boolean attemptSend(Report report) {
        if (Helper.isTestMode()) {
            return false;
        }
        try {
            return SentryClient.sendErrorSync(reportToJson(report));
        } catch (Exception unused) {
            return false;
        }
    }

    private static String buildCrashDataString(Report report) {
        StringBuilder sb = new StringBuilder();
        appendIfNotNull(sb, "Thread", report.threadName, "unknown");
        sb.append("Time: ");
        sb.append(report.timestamp);
        sb.append("\n");
        appendIfNotNull(sb, "SDK Version", report.sdkVersion, "unknown");
        appendIfPresent(sb, "Session ID", report.sessionId);
        appendIfPresent(sb, "Environment", report.environment);
        appendIfNotNull(sb, "Message", report.message, "");
        appendIfNotNull(sb, "Throwable Type", report.exceptionType, "unknown");
        appendIfNotNull(sb, "Throwable Message", report.exceptionMessage, "");
        sb.append("Stack Trace:\n");
        String str = report.stackTrace;
        sb.append(str != null ? str : "");
        return sb.toString();
    }

    private static void captureBatteryInfo(Context context, JSONObject jSONObject) {
        boolean z;
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver == null) {
                return;
            }
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra >= 0 && intExtra2 > 0) {
                jSONObject.put("batteryLevel", Recorder$$ExternalSyntheticOutline2.m(intExtra, intExtra2, 100.0f));
            }
            int intExtra3 = registerReceiver.getIntExtra("status", -1);
            if (intExtra3 != 2 && intExtra3 != 5) {
                z = false;
                jSONObject.put("isCharging", z);
            }
            z = true;
            jSONObject.put("isCharging", z);
        } catch (Exception unused) {
        }
    }

    private static String captureDataSafely(String str, DataCaptureFunction dataCaptureFunction) {
        try {
            return dataCaptureFunction.capture();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String captureHostAppInfo(Context context) {
        if (context == null) {
            return "{}";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            String packageName = context.getPackageName();
            jSONObject.put("packageName", packageName);
            addAppMetadata(jSONObject, context, packageName);
            Activity openedActivity = Knot.getInstance().getOpenedActivity();
            if (openedActivity != null) {
                addActivityInfo(jSONObject, openedActivity, context);
                addFragmentInfo(jSONObject, openedActivity);
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return "{}";
        }
    }

    private static void captureNetworkInfo(Context context, JSONObject jSONObject) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return;
            }
            captureNetworkInfoModern(connectivityManager, jSONObject);
        } catch (Exception unused) {
        }
    }

    private static void captureNetworkInfoLegacy(ConnectivityManager connectivityManager, JSONObject jSONObject) {
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            jSONObject.put("networkType", "None");
            jSONObject.put("isConnected", false);
            return;
        }
        int type2 = activeNetworkInfo.getType();
        if (type2 == 1) {
            jSONObject.put("networkType", "WiFi");
        } else if (type2 == 0) {
            jSONObject.put("networkType", "Cellular");
        } else {
            jSONObject.put("networkType", "Other");
        }
        jSONObject.put("isConnected", true);
    }

    private static void captureNetworkInfoModern(ConnectivityManager connectivityManager, JSONObject jSONObject) {
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            jSONObject.put("networkType", "None");
            jSONObject.put("isConnected", false);
            return;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null) {
            jSONObject.put("networkType", "Unknown");
            jSONObject.put("isConnected", false);
            return;
        }
        if (networkCapabilities.hasTransport(1)) {
            jSONObject.put("networkType", "WiFi");
        } else if (networkCapabilities.hasTransport(0)) {
            jSONObject.put("networkType", "Cellular");
        } else if (networkCapabilities.hasTransport(3)) {
            jSONObject.put("networkType", "Ethernet");
        } else {
            jSONObject.put("networkType", "Other");
        }
        jSONObject.put("hasInternet", networkCapabilities.hasCapability(12));
        jSONObject.put("isConnected", networkCapabilities.hasCapability(16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String captureRuntimeState(Context context) {
        if (context == null) {
            return "{}";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            captureBatteryInfo(context, jSONObject);
            captureNetworkInfo(context, jSONObject);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "{}";
        }
    }

    @Deprecated
    public static void clearBreadcrumbs(String str) {
        clearStoredBreadcrumbs(str);
    }

    @Deprecated
    public static void clearCrashData(Context context) {
        if (context == null) {
            return;
        }
        try {
            context.getSharedPreferences(PREF_NAME, 0).edit().remove(PREF_KEY_LAST_CRASH).putInt(PREF_KEY_CRASH_COUNT, 0).apply();
        } catch (Exception unused) {
        }
    }

    private static void clearStoredBreadcrumbs(String str) {
        breadcrumbStorage.remove(str);
    }

    public static void crash(Context context, Exception exc, String str, String str2) {
        try {
            reportInternal(new ErrorContext.Builder().exception(exc).message(str).context(context).threadName(str2).isCrash(true).build());
        } catch (Exception unused) {
        }
    }

    private static JSONObject createBreadcrumb(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("timestamp", System.currentTimeMillis() / 1000.0d);
        if (str2 == null) {
            str2 = "default";
        }
        jSONObject.put("category", str2);
        if (str == null) {
            str = "";
        }
        jSONObject.put("message", str);
        jSONObject.put("level", "info");
        return jSONObject;
    }

    private static Report createErrorReport(ErrorContext errorContext) {
        Exception exception = errorContext.getException();
        if (exception == null) {
            return null;
        }
        try {
            Report report = new Report();
            report.timestamp = System.currentTimeMillis();
            report.exceptionType = exception.getClass().getName();
            report.isCrash = errorContext.isCrash();
            report.threadName = errorContext.getThreadName() != null ? errorContext.getThreadName() : Thread.currentThread().getName();
            report.sessionId = currentSessionId;
            report.environment = currentEnvironment;
            report.sdkVersion = BuildConfig.VERSION_NAME;
            report.message = errorContext.getMessage() != null ? errorContext.getMessage() : "";
            report.exceptionMessage = safeGetExceptionMessage(exception);
            report.stackTrace = getStackTraceString(exception);
            Context contextOrDefault = getContextOrDefault(errorContext);
            if (contextOrDefault != null) {
                enrichReportWithContext(report, contextOrDefault);
            }
            attachBreadcrumbs(report);
            return report;
        } catch (Exception unused) {
            return null;
        }
    }

    private static void enrichReportWithContext(Report report, final Context context) {
        final int i = 0;
        report.deviceInfo = captureDataSafely("device info", new DataCaptureFunction() { // from class: com.knotapi.knot.services.Reporter$$ExternalSyntheticLambda0
            @Override // com.knotapi.knot.services.Reporter.DataCaptureFunction
            public final String capture() {
                String lambda$enrichReportWithContext$2;
                String captureHostAppInfo;
                String captureRuntimeState;
                int i2 = i;
                Context context2 = context;
                switch (i2) {
                    case 0:
                        lambda$enrichReportWithContext$2 = Reporter.lambda$enrichReportWithContext$2(context2);
                        return lambda$enrichReportWithContext$2;
                    case 1:
                        captureHostAppInfo = Reporter.captureHostAppInfo(context2);
                        return captureHostAppInfo;
                    default:
                        captureRuntimeState = Reporter.captureRuntimeState(context2);
                        return captureRuntimeState;
                }
            }
        });
        final int i2 = 1;
        report.hostAppInfo = captureDataSafely("host app info", new DataCaptureFunction() { // from class: com.knotapi.knot.services.Reporter$$ExternalSyntheticLambda0
            @Override // com.knotapi.knot.services.Reporter.DataCaptureFunction
            public final String capture() {
                String lambda$enrichReportWithContext$2;
                String captureHostAppInfo;
                String captureRuntimeState;
                int i22 = i2;
                Context context2 = context;
                switch (i22) {
                    case 0:
                        lambda$enrichReportWithContext$2 = Reporter.lambda$enrichReportWithContext$2(context2);
                        return lambda$enrichReportWithContext$2;
                    case 1:
                        captureHostAppInfo = Reporter.captureHostAppInfo(context2);
                        return captureHostAppInfo;
                    default:
                        captureRuntimeState = Reporter.captureRuntimeState(context2);
                        return captureRuntimeState;
                }
            }
        });
        final int i3 = 2;
        report.runtimeState = captureDataSafely("runtime state", new DataCaptureFunction() { // from class: com.knotapi.knot.services.Reporter$$ExternalSyntheticLambda0
            @Override // com.knotapi.knot.services.Reporter.DataCaptureFunction
            public final String capture() {
                String lambda$enrichReportWithContext$2;
                String captureHostAppInfo;
                String captureRuntimeState;
                int i22 = i3;
                Context context2 = context;
                switch (i22) {
                    case 0:
                        lambda$enrichReportWithContext$2 = Reporter.lambda$enrichReportWithContext$2(context2);
                        return lambda$enrichReportWithContext$2;
                    case 1:
                        captureHostAppInfo = Reporter.captureHostAppInfo(context2);
                        return captureHostAppInfo;
                    default:
                        captureRuntimeState = Reporter.captureRuntimeState(context2);
                        return captureRuntimeState;
                }
            }
        });
    }

    public static void error(Exception exc, String str) {
        try {
            reportInternal(new ErrorContext.Builder().exception(exc).message(str).build());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void flushPendingReports() {
        withContext(new Reporter$$ExternalSyntheticLambda11());
    }

    private static <T> T getAndClearBreadcrumbs(String str, BreadcrumbRetriever<T> breadcrumbRetriever, BreadcrumbValidator<T> breadcrumbValidator) {
        T retrieve;
        synchronized (breadcrumbStorage) {
            try {
                retrieve = breadcrumbRetriever.retrieve(str);
                if (breadcrumbValidator.isValid(retrieve)) {
                    clearStoredBreadcrumbs(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return retrieve;
    }

    private static JSONArray getAndClearBreadcrumbsAsJson(String str) {
        return (JSONArray) getAndClearBreadcrumbs(str, new Reporter$$ExternalSyntheticLambda4(0), new Reporter$$ExternalSyntheticLambda4(2));
    }

    private static Context getContextOrDefault(ErrorContext errorContext) {
        return errorContext.getContext() != null ? errorContext.getContext() : applicationContext;
    }

    @Deprecated
    public static int getCrashCount(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getSharedPreferences(PREF_NAME, 0).getInt(PREF_KEY_CRASH_COUNT, 0);
        } catch (Exception unused) {
            return 0;
        }
    }

    private static String getFromPrefs(Context context, String str, String str2) {
        if (context != null) {
            try {
                return context.getSharedPreferences(PREF_NAME, 0).getString(str, str2);
            } catch (Exception unused) {
            }
        }
        return str2;
    }

    @Deprecated
    public static String getLastCrashData(Context context) {
        return getFromPrefs(context, PREF_KEY_LAST_CRASH, null);
    }

    private static String getOptStringOrNull(JSONObject jSONObject, String str) {
        String optString = jSONObject.optString(str, null);
        if (optString == null || optString.isEmpty()) {
            return null;
        }
        return optString;
    }

    private static String getStackTraceString(Exception exc) {
        if (exc == null) {
            return "";
        }
        try {
            StringWriter stringWriter = new StringWriter();
            new PrintWriter(stringWriter);
            return stringWriter.toString();
        } catch (Exception e) {
            return Fragment$5$$ExternalSyntheticOutline0.m(e, new StringBuilder("Error getting stack trace: "));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getStoredBreadcrumbs(String str) {
        List<JSONObject> list = breadcrumbStorage.get(str);
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder("\n\nBreadcrumbs:\n");
        for (JSONObject jSONObject : list) {
            sb.append("- ");
            sb.append(jSONObject.optString("message"));
            sb.append(" [");
            sb.append(jSONObject.optString("category"));
            sb.append("]\n");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONArray getStoredBreadcrumbsAsJson(String str) {
        List<JSONObject> list = breadcrumbStorage.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<JSONObject> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        return jSONArray;
    }

    private static void handleCrash(ErrorContext errorContext, Report report) {
        boolean z;
        try {
            Context context = errorContext.getContext();
            updateCrashData(context, report);
            addReportToQueue(report, context, true);
            try {
                z = SentryClient.sendErrorSync(reportToJson(report));
            } catch (Throwable unused) {
                z = false;
            }
            if (z) {
                removeReportFromQueue(report);
            }
        } catch (Exception unused2) {
        }
    }

    private static void handleRegularError(Report report, Context context) {
        try {
            addReportToQueue(report, context, false);
            safeExecute(new Reporter$$ExternalSyntheticLambda12(), "error report flush");
        } catch (Exception unused) {
        }
    }

    public static void initialize(Context context) {
        if (context == null) {
            return;
        }
        try {
            synchronized (Reporter.class) {
                try {
                    if (!initialized) {
                        applicationContext = context.getApplicationContext();
                        executorService = Executors.newSingleThreadExecutor(new Reporter$$ExternalSyntheticLambda13());
                        initialized = true;
                        executorService.execute(new Reporter$$ExternalSyntheticLambda12());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception unused) {
        }
    }

    private static Report jsonToReport(JSONObject jSONObject) {
        Report report = new Report();
        report.timestamp = jSONObject.getLong("timestamp");
        report.exceptionType = jSONObject.getString("exceptionType");
        report.exceptionMessage = jSONObject.optString("exceptionMessage", null);
        report.message = jSONObject.getString("message");
        report.stackTrace = jSONObject.getString("stackTrace");
        report.retryCount = jSONObject.optInt("retryCount", 0);
        report.isCrash = jSONObject.optBoolean("isCrash", false);
        report.sessionId = getOptStringOrNull(jSONObject, "sessionId");
        report.environment = getOptStringOrNull(jSONObject, "environment");
        report.threadName = getOptStringOrNull(jSONObject, "threadName");
        report.sdkVersion = getOptStringOrNull(jSONObject, "sdkVersion");
        report.deviceInfo = getOptStringOrNull(jSONObject, "deviceInfo");
        report.breadcrumbs = getOptStringOrNull(jSONObject, "breadcrumbs");
        report.hostAppInfo = getOptStringOrNull(jSONObject, "hostAppInfo");
        report.runtimeState = getOptStringOrNull(jSONObject, "runtimeState");
        return report;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$addReportToQueue$7(Report report, List list) {
        if (list.size() >= 50) {
            list.remove(0);
        }
        list.add(report);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$enrichReportWithContext$2(Context context) {
        return new DeviceInfo(context).toJson();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$flushPendingReports$10(Context context) {
        List<Report> loadPendingReports = loadPendingReports(context);
        if (loadPendingReports.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Report report : loadPendingReports) {
            if (!shouldKeepInQueue(report, arrayList)) {
                report.sending = true;
                if (attemptSend(report)) {
                    report.retryCount++;
                } else {
                    report.sending = false;
                    report.retryCount++;
                    arrayList.add(report);
                }
            }
        }
        saveReportsSync(arrayList, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getAndClearBreadcrumbs$5(String str) {
        return (str == null || str.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getAndClearBreadcrumbsAsJson$6(JSONArray jSONArray) {
        return jSONArray != null && jSONArray.length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread lambda$initialize$0(Runnable runnable) {
        Thread thread = new Thread(runnable, "Reporter-worker");
        thread.setDaemon(true);
        return thread;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$removeReportFromQueue$8(Report report, Report report2) {
        String str;
        return report2.timestamp == report.timestamp && (str = report2.exceptionType) != null && str.equals(report.exceptionType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$removeReportFromQueue$9(final Report report, List list) {
        list.removeIf(new Predicate() { // from class: com.knotapi.knot.services.Reporter$$ExternalSyntheticLambda6
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$removeReportFromQueue$8;
                lambda$removeReportFromQueue$8 = Reporter.lambda$removeReportFromQueue$8(Reporter.Report.this, (Reporter.Report) obj);
                return lambda$removeReportFromQueue$8;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$storeBreadcrumb$1(String str) {
        return new ArrayList();
    }

    private static List<Report> loadPendingReports(Context context) {
        ArrayList arrayList = new ArrayList();
        if (context != null) {
            try {
                JSONArray jSONArray = new JSONArray(context.getSharedPreferences(PREF_NAME, 0).getString(PREF_KEY_ERROR_QUEUE, "[]"));
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jsonToReport(jSONArray.getJSONObject(i)));
                }
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public static void log(LogLevel logLevel, String str, String str2) {
        String name;
        if (logLevel != null) {
            try {
                name = logLevel.name();
            } catch (Exception unused) {
                return;
            }
        } else {
            name = "INFO";
        }
        SentryClient.sendLog(name, str, str2);
    }

    private static void modifyReportQueue(QueueModifier queueModifier, Context context, boolean z, String str) {
        try {
            synchronized (Reporter.class) {
                try {
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    if (context == null) {
                        return;
                    }
                    List<Report> loadPendingReports = loadPendingReports(context);
                    queueModifier.modify(loadPendingReports);
                    if (z) {
                        saveReportsSync(loadPendingReports, context);
                    } else {
                        saveReportsAsync(loadPendingReports, context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception unused) {
        }
    }

    private static void putStringOrEmpty(JSONObject jSONObject, String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put(str, str2);
    }

    private static void removeReportFromQueue(Report report) {
        modifyReportQueue(new Reporter$$ExternalSyntheticLambda3(report, 1), null, true, "remove report from queue");
    }

    private static void reportInternal(ErrorContext errorContext) {
        if (errorContext == null || errorContext.getException() == null) {
            return;
        }
        try {
            Report createErrorReport = createErrorReport(errorContext);
            if (createErrorReport == null) {
                return;
            }
            if (errorContext.isCrash()) {
                handleCrash(errorContext, createErrorReport);
            } else {
                handleRegularError(createErrorReport, errorContext.getContext());
            }
        } catch (Exception unused) {
        }
    }

    private static JSONObject reportToJson(Report report) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("timestamp", report.timestamp);
            jSONObject.put("exceptionType", report.exceptionType);
            jSONObject.put("exceptionMessage", report.exceptionMessage);
            jSONObject.put("message", report.message);
            jSONObject.put("stackTrace", report.stackTrace);
            jSONObject.put("retryCount", report.retryCount);
            jSONObject.put("isCrash", report.isCrash);
            putStringOrEmpty(jSONObject, "sessionId", report.sessionId);
            putStringOrEmpty(jSONObject, "environment", report.environment);
            putStringOrEmpty(jSONObject, "threadName", report.threadName);
            putStringOrEmpty(jSONObject, "sdkVersion", report.sdkVersion);
            putStringOrEmpty(jSONObject, "deviceInfo", report.deviceInfo);
            putStringOrEmpty(jSONObject, "breadcrumbs", report.breadcrumbs);
            putStringOrEmpty(jSONObject, "hostAppInfo", report.hostAppInfo);
            putStringOrEmpty(jSONObject, "runtimeState", report.runtimeState);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static void reportWithBreadcrumbs(Exception exc, String str, String str2) {
        try {
            String andClearBreadcrumbs = getAndClearBreadcrumbs(str2);
            StringBuilder sb = new StringBuilder();
            if (str == null) {
                str = "";
            }
            sb.append(str);
            sb.append(andClearBreadcrumbs);
            error(exc, sb.toString());
        } catch (Exception unused) {
        }
    }

    private static JSONArray reportsToJson(List<Report> list) {
        JSONArray jSONArray = new JSONArray();
        Iterator<Report> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(reportToJson(it.next()));
        }
        return jSONArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void runSafe(Runnable runnable, String str) {
        if (runnable == null) {
            return;
        }
        try {
            runnable.run();
        } catch (Exception unused) {
        }
    }

    private static void safeExecute(Runnable runnable, String str) {
        if (!initialized || executorService == null) {
            return;
        }
        synchronized (Reporter.class) {
            try {
                executorService.execute(new r6$$ExternalSyntheticLambda0(5, runnable, str));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    private static String safeGetExceptionMessage(Exception exc) {
        try {
            return exc.getMessage();
        } catch (Exception e) {
            return Fragment$5$$ExternalSyntheticOutline0.m(e, new StringBuilder("Error getting exception message: "));
        }
    }

    private static void saveReports(List<Report> list, Context context, boolean z) {
        saveToPrefs(context, PREF_KEY_ERROR_QUEUE, reportsToJson(list), z);
    }

    private static void saveReportsAsync(List<Report> list, Context context) {
        saveReports(list, context, false);
    }

    private static void saveReportsSync(List<Report> list, Context context) {
        saveReports(list, context, true);
    }

    private static void saveToPrefs(Context context, String str, JSONArray jSONArray, boolean z) {
        if (context == null) {
            return;
        }
        try {
            SharedPreferences.Editor putString = context.getSharedPreferences(PREF_NAME, 0).edit().putString(str, jSONArray.toString());
            if (z) {
                putString.commit();
            } else {
                putString.apply();
            }
        } catch (Exception unused) {
        }
    }

    public static void setSessionInfo(String str, String str2) {
        try {
            currentSessionId = str;
            currentEnvironment = str2;
        } catch (Exception unused) {
        }
    }

    private static boolean shouldKeepInQueue(Report report, List<Report> list) {
        if (!report.sending) {
            return report.retryCount >= 3;
        }
        list.add(report);
        return true;
    }

    public static void storeBreadcrumb(String str, String str2, String str3) {
        if (str == null) {
            return;
        }
        try {
            JSONObject createBreadcrumb = createBreadcrumb(str2, str3);
            Map<String, List<JSONObject>> map = breadcrumbStorage;
            synchronized (map) {
                try {
                    List<JSONObject> computeIfAbsent = map.computeIfAbsent(str, new Function() { // from class: com.knotapi.knot.services.Reporter$$ExternalSyntheticLambda8
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            List lambda$storeBreadcrumb$1;
                            lambda$storeBreadcrumb$1 = Reporter.lambda$storeBreadcrumb$1((String) obj);
                            return lambda$storeBreadcrumb$1;
                        }
                    });
                    computeIfAbsent.add(createBreadcrumb);
                    if (computeIfAbsent.size() > 100) {
                        computeIfAbsent.remove(0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception unused) {
        }
    }

    private static void updateCrashData(Context context, Report report) {
        if (report == null) {
            return;
        }
        if (context == null) {
            context = applicationContext;
        }
        if (context == null) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_NAME, 0);
            sharedPreferences.edit().putString(PREF_KEY_LAST_CRASH, buildCrashDataString(report)).putInt(PREF_KEY_CRASH_COUNT, sharedPreferences.getInt(PREF_KEY_CRASH_COUNT, 0) + 1).commit();
        } catch (Exception unused) {
        }
    }

    private static void withContext(ContextConsumer contextConsumer) {
        try {
            synchronized (Reporter.class) {
                try {
                    if (applicationContext != null) {
                        contextConsumer.accept(applicationContext);
                    }
                } finally {
                }
            }
        } catch (Exception unused) {
        }
    }

    private static String getAndClearBreadcrumbs(String str) {
        return (String) getAndClearBreadcrumbs(str, new Reporter$$ExternalSyntheticLambda4(3), new Reporter$$ExternalSyntheticLambda4(1));
    }
}
