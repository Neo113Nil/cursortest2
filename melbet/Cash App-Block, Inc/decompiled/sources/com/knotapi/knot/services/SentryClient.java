package com.knotapi.knot.services;

import com.knotapi.knot.BuildConfig;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.knotapi.knot.utilities.Helper;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class SentryClient {
    private static final String SDK_NAME = "knot-android-sdk";
    private static final String SENTRY_DSN = "https://0a2c99751f2280c7ddab833074bc9dbf@o4506250551427072.ingest.us.sentry.io/4510472049262592";
    private static final String SENTRY_ENVELOPE_URL = "https://o4506250551427072.ingest.us.sentry.io/api/4510472049262592/envelope/";
    private static final String SENTRY_HOST = "o4506250551427072.ingest.us.sentry.io";
    private static final String SENTRY_KEY = "0a2c99751f2280c7ddab833074bc9dbf";
    private static final String SENTRY_PROJECT_ID = "4510472049262592";
    private static final String TAG = "SentryClient";

    private static void addAppContext(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        String str;
        String str2;
        String str3;
        String str4 = "baseActivity";
        String optString = jSONObject2.optString("hostAppInfo", null);
        if (optString == null || optString.isEmpty()) {
            return;
        }
        try {
            JSONObject jSONObject4 = new JSONObject(optString);
            addTagIfPresent(jSONObject3, "host_app", jSONObject4.optString("appName", ""));
            addTagIfPresent(jSONObject3, "host_package", jSONObject4.optString("packageName", ""));
            if (jSONObject4.has("callingActivity")) {
                String string2 = jSONObject4.getString("callingActivity");
                jSONObject3.put("entry_activity", string2.substring(string2.lastIndexOf(46) + 1));
            }
            if (jSONObject4.has("activityStackCount")) {
                jSONObject3.put("activity_depth", jSONObject4.getInt("activityStackCount"));
            }
            if (jSONObject4.has("fragmentCount")) {
                jSONObject3.put("screen_depth", jSONObject4.getInt("fragmentCount"));
            }
            StringBuilder sb = new StringBuilder();
            if (jSONObject4.has("baseActivity")) {
                String string3 = jSONObject4.getString("baseActivity");
                str = "activityStackCount";
                sb.append(string3.substring(string3.lastIndexOf(46) + 1));
            } else {
                str = "activityStackCount";
            }
            if (jSONObject4.has("visibleFragments")) {
                JSONArray jSONArray = jSONObject4.getJSONArray("visibleFragments");
                int i = 0;
                str3 = "callingActivity";
                while (true) {
                    str2 = str4;
                    if (i >= Math.min(2, jSONArray.length())) {
                        break;
                    }
                    sb.append(" → ");
                    sb.append(jSONArray.getString(i));
                    i++;
                    str4 = str2;
                }
            } else {
                str2 = "baseActivity";
                str3 = "callingActivity";
            }
            if (sb.length() > 0) {
                jSONObject3.put("nav_path", sb.toString());
            }
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("app_name", jSONObject4.optString("appName", ""));
            jSONObject5.put("app_version", jSONObject4.optString("versionName", ""));
            jSONObject5.put("app_build", jSONObject4.optString("versionCode", ""));
            jSONObject5.put("app_identifier", jSONObject4.optString("packageName", ""));
            if (jSONObject4.has("allFragments")) {
                jSONObject5.put("all_fragments", jSONObject4.getJSONArray("allFragments"));
            }
            if (jSONObject4.has("visibleFragments")) {
                jSONObject5.put("visible_fragments", jSONObject4.getJSONArray("visibleFragments"));
            }
            if (jSONObject4.has("fragmentBackStackNames")) {
                jSONObject5.put("fragment_navigation_stack", jSONObject4.getJSONArray("fragmentBackStackNames"));
            }
            if (jSONObject4.has("fragmentCount")) {
                jSONObject5.put("fragment_count", jSONObject4.getInt("fragmentCount"));
            }
            if (jSONObject4.has("fragmentBackStackCount")) {
                jSONObject5.put("fragment_backstack_count", jSONObject4.getInt("fragmentBackStackCount"));
            }
            if (jSONObject4.has("topActivity")) {
                jSONObject5.put("current_activity", jSONObject4.getString("topActivity"));
            }
            String str5 = str2;
            if (jSONObject4.has(str5)) {
                jSONObject5.put("root_activity", jSONObject4.getString(str5));
            }
            String str6 = str3;
            if (jSONObject4.has(str6)) {
                jSONObject5.put("calling_activity", jSONObject4.getString(str6));
            }
            if (jSONObject4.has("sdkActivity")) {
                jSONObject5.put("sdk_activity", jSONObject4.getString("sdkActivity"));
            }
            String str7 = str;
            if (jSONObject4.has(str7)) {
                jSONObject5.put("activity_stack_count", jSONObject4.getInt(str7));
            }
            jSONObject.put("app", jSONObject5);
        } catch (Exception unused) {
        }
    }

    private static void addBreadcrumbs(JSONObject jSONObject, JSONObject jSONObject2) {
        String optString = jSONObject2.optString("breadcrumbs", null);
        if (optString == null || optString.isEmpty()) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(optString);
            if (jSONArray.length() > 0) {
                jSONObject.put("breadcrumbs", jSONArray);
            }
        } catch (Exception unused) {
        }
    }

    private static void addDeviceContext(JSONObject jSONObject, JSONObject jSONObject2) {
        String optString = jSONObject2.optString("deviceInfo", null);
        if (optString == null || optString.isEmpty()) {
            return;
        }
        try {
            JSONObject jSONObject3 = new JSONObject(optString);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("name", jSONObject3.optString("deviceName", ""));
            jSONObject4.put("model", jSONObject3.optString("model", ""));
            jSONObject4.put("manufacturer", jSONObject3.optString("manufacturer", ""));
            jSONObject4.put("brand", jSONObject3.optString("manufacturer", ""));
            jSONObject4.put("family", jSONObject3.optString("hardware", ""));
            if (jSONObject3.has("totalMemory")) {
                jSONObject4.put("memory_size", jSONObject3.getLong("totalMemory"));
            }
            if (jSONObject3.has("availableMemory")) {
                jSONObject4.put("free_memory", jSONObject3.getLong("availableMemory"));
            }
            if (jSONObject3.has("totalSpace")) {
                jSONObject4.put("storage_size", jSONObject3.getLong("totalSpace"));
            }
            if (jSONObject3.has("freeSpace")) {
                jSONObject4.put("free_storage", jSONObject3.getLong("freeSpace"));
            }
            jSONObject.put("device", jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("name", "Android");
            jSONObject5.put("version", jSONObject3.optString("releaseVersion", ""));
            if (jSONObject3.has("sdkVersion")) {
                jSONObject5.put("build", String.valueOf(jSONObject3.getInt("sdkVersion")));
            }
            jSONObject.put("os", jSONObject5);
        } catch (Exception unused) {
        }
    }

    private static void addRuntimeContext(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        String optString = jSONObject2.optString("runtimeState", null);
        if (optString == null || optString.isEmpty()) {
            return;
        }
        try {
            JSONObject jSONObject4 = new JSONObject(optString);
            if (jSONObject4.has("batteryLevel")) {
                jSONObject3.put("battery_level", jSONObject4.getInt("batteryLevel"));
            }
            addTagIfPresent(jSONObject3, "network_type", jSONObject4.optString("networkType", ""));
            if (jSONObject4.has("isConnected")) {
                jSONObject3.put("is_connected", jSONObject4.getBoolean("isConnected"));
            }
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("battery_level", jSONObject4.optInt("batteryLevel", -1));
            jSONObject5.put("is_charging", jSONObject4.optBoolean("isCharging", false));
            jSONObject5.put("network_type", jSONObject4.optString("networkType", "unknown"));
            jSONObject5.put("is_connected", jSONObject4.optBoolean("isConnected", false));
            jSONObject5.put("has_internet", jSONObject4.optBoolean("hasInternet", false));
            jSONObject.put("runtime", jSONObject5);
        } catch (Exception unused) {
        }
    }

    private static void addTagIfPresent(JSONObject jSONObject, String str, String str2) {
        if (str2 == null || str2.isEmpty()) {
            return;
        }
        jSONObject.put(str, str2);
    }

    private static JSONObject buildContexts(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        addDeviceContext(jSONObject3, jSONObject);
        addAppContext(jSONObject3, jSONObject, jSONObject2);
        addRuntimeContext(jSONObject3, jSONObject, jSONObject2);
        return jSONObject3;
    }

    private static String buildEnvelopeFromPayload(String str, JSONObject jSONObject) {
        try {
            JSONObject buildSentryEvent = buildSentryEvent(str, jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("event_id", str);
            jSONObject2.put("dsn", SENTRY_DSN);
            jSONObject2.put("sent_at", getCurrentISOTimestamp());
            String jSONObject3 = buildSentryEvent.toString();
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("type", BreadcrumbHelper.Category.EVENT);
            jSONObject4.put("content_type", "application/json");
            jSONObject4.put("length", jSONObject3.getBytes(StandardCharsets.UTF_8).length);
            return jSONObject2.toString() + "\n" + jSONObject4.toString() + "\n" + jSONObject3 + "\n";
        } catch (Exception unused) {
            return null;
        }
    }

    private static JSONObject buildException(JSONObject jSONObject, boolean z) {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", jSONObject.optString("exceptionType", "Unknown"));
        jSONObject2.put("value", jSONObject.optString("exceptionMessage", ""));
        String optString = jSONObject.optString("stackTrace", "");
        if (!optString.isEmpty()) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("frames", parseStackTraceToFrames(optString));
            jSONObject2.put("stacktrace", jSONObject3);
        }
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("type", z ? "UncaughtExceptionHandler" : "generic");
        jSONObject4.put("handled", !z);
        jSONObject2.put("mechanism", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("values", new JSONArray().put(jSONObject2));
        return jSONObject5;
    }

    private static String buildLogEnvelope(String str, String str2, String str3, String str4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event_id", str);
            jSONObject.put("dsn", SENTRY_DSN);
            jSONObject.put("sent_at", getCurrentISOTimestamp());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("event_id", str);
            jSONObject2.put("timestamp", System.currentTimeMillis() / 1000.0d);
            jSONObject2.put("platform", "android");
            jSONObject2.put("level", mapLogLevel(str2));
            if (str3 == null) {
                str3 = "";
            }
            jSONObject2.put("message", str3);
            if (str4 != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("tag", str4);
                jSONObject2.put("tags", jSONObject3);
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("name", SDK_NAME);
            jSONObject4.put("version", BuildConfig.VERSION_NAME);
            jSONObject2.put("sdk", jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("type", BreadcrumbHelper.Category.EVENT);
            jSONObject5.put("content_type", "application/json");
            String jSONObject6 = jSONObject2.toString();
            jSONObject5.put("length", jSONObject6.getBytes(StandardCharsets.UTF_8).length);
            return jSONObject + "\n" + jSONObject5 + "\n" + jSONObject6 + "\n";
        } catch (Exception unused) {
            return null;
        }
    }

    private static JSONObject buildSDKInfo(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("name", SDK_NAME);
        jSONObject2.put("version", jSONObject.optString("sdkVersion", BuildConfig.VERSION_NAME));
        return jSONObject2;
    }

    private static JSONObject buildSentryEvent(String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("event_id", str);
        jSONObject2.put("timestamp", formatTimestampRFC3339(jSONObject.optLong("timestamp", System.currentTimeMillis())));
        jSONObject2.put("platform", "java");
        jSONObject2.put("level", jSONObject.optBoolean("isCrash", false) ? "fatal" : BreadcrumbHelper.Category.ERROR);
        jSONObject2.put("logger", SDK_NAME);
        String optString = jSONObject.optString("message", "");
        if (!optString.isEmpty()) {
            jSONObject2.put("message", optString);
        }
        jSONObject2.put("environment", jSONObject.optString("environment", "production"));
        jSONObject2.put("exception", buildException(jSONObject, jSONObject.optBoolean("isCrash", false)));
        jSONObject2.put("sdk", buildSDKInfo(jSONObject));
        JSONObject buildTags = buildTags(jSONObject);
        JSONObject buildContexts = buildContexts(jSONObject, buildTags);
        addBreadcrumbs(jSONObject2, jSONObject);
        if (buildContexts.length() > 0) {
            jSONObject2.put("contexts", buildContexts);
        }
        if (buildTags.length() > 0) {
            jSONObject2.put("tags", buildTags);
        }
        return jSONObject2;
    }

    private static JSONObject buildTags(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        addTagIfPresent(jSONObject2, "session_id", jSONObject.optString("sessionId", ""));
        addTagIfPresent(jSONObject2, "merchant_id", jSONObject.optString("merchantId", ""));
        addTagIfPresent(jSONObject2, "thread_name", jSONObject.optString("threadName", ""));
        int optInt = jSONObject.optInt("retryCount", 0);
        if (optInt > 0) {
            jSONObject2.put("retry_count", optInt);
        }
        return jSONObject2;
    }

    private static String formatTimestampRFC3339(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(new Date(j));
    }

    private static String getCurrentISOTimestamp() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(new Date());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendLog$0(String str, String str2, String str3) {
        try {
            sendEnvelope(buildLogEnvelope(UUID.randomUUID().toString().replace("-", ""), str, str2, str3));
        } catch (Exception unused) {
        }
    }

    private static String mapLogLevel(String str) {
        if (str == null) {
            return "info";
        }
        String upperCase = str.toUpperCase();
        upperCase.getClass();
        switch (upperCase) {
        }
        return "info";
    }

    private static JSONArray parseStackTraceToFrames(String str) {
        String trim;
        int indexOf;
        Integer num;
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        try {
            for (String str2 : str.split("\n")) {
                String trim2 = str2.trim();
                if (trim2.startsWith("at ") && (indexOf = (trim = trim2.substring(3).trim()).indexOf(40)) > 0) {
                    String substring = trim.substring(0, indexOf);
                    String substring2 = trim.substring(indexOf + 1, trim.length() - 1);
                    int lastIndexOf = substring.lastIndexOf(46);
                    if (lastIndexOf > 0) {
                        String substring3 = substring.substring(0, lastIndexOf);
                        String substring4 = substring.substring(lastIndexOf + 1);
                        int indexOf2 = substring2.indexOf(58);
                        String substring5 = indexOf2 > 0 ? substring2.substring(0, indexOf2) : substring2;
                        if (indexOf2 > 0) {
                            try {
                                num = Integer.valueOf(Integer.parseInt(substring2.substring(indexOf2 + 1)));
                            } catch (NumberFormatException unused) {
                            }
                            jSONObject = new JSONObject();
                            jSONObject.put("filename", substring5);
                            jSONObject.put("function", substring3 + "." + substring4);
                            if (num != null && num.intValue() >= 0) {
                                jSONObject.put("lineno", num);
                            }
                            jSONObject.put("in_app", substring3.startsWith("com.knotapi"));
                            jSONArray.put(jSONObject);
                        }
                        num = null;
                        jSONObject = new JSONObject();
                        jSONObject.put("filename", substring5);
                        jSONObject.put("function", substring3 + "." + substring4);
                        if (num != null) {
                            jSONObject.put("lineno", num);
                        }
                        jSONObject.put("in_app", substring3.startsWith("com.knotapi"));
                        jSONArray.put(jSONObject);
                    }
                }
            }
        } catch (Exception unused2) {
        }
        return jSONArray;
    }

    private static void sendEnvelope(String str) {
        HttpURLConnection httpURLConnection;
        if (str == null) {
            return;
        }
        HttpURLConnection httpURLConnection2 = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(SENTRY_ENVELOPE_URL).openConnection();
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/x-sentry-envelope");
            httpURLConnection.setRequestProperty("X-Sentry-Auth", String.format("Sentry sentry_version=7, sentry_key=%s, sentry_timestamp=%d", SENTRY_KEY, Long.valueOf(System.currentTimeMillis() / 1000)));
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setConnectTimeout(30000);
            httpURLConnection.setReadTimeout(30000);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8));
                try {
                    bufferedWriter.write(str);
                    bufferedWriter.flush();
                    bufferedWriter.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    httpURLConnection.getResponseCode();
                    httpURLConnection.disconnect();
                } finally {
                }
            } finally {
            }
        } catch (Exception unused2) {
            httpURLConnection2 = httpURLConnection;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection2 = httpURLConnection;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            throw th;
        }
    }

    private static boolean sendEnvelopeSync(String str) {
        if (str == null) {
            return false;
        }
        HttpURLConnection httpURLConnection = null;
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(SENTRY_ENVELOPE_URL).openConnection();
            try {
                httpURLConnection2.setRequestMethod("POST");
                httpURLConnection2.setRequestProperty("Content-Type", "application/x-sentry-envelope");
                httpURLConnection2.setRequestProperty("X-Sentry-Auth", String.format("Sentry sentry_version=7, sentry_key=%s, sentry_timestamp=%d", SENTRY_KEY, Long.valueOf(System.currentTimeMillis() / 1000)));
                httpURLConnection2.setDoOutput(true);
                httpURLConnection2.setConnectTimeout(5000);
                httpURLConnection2.setReadTimeout(5000);
                OutputStream outputStream = httpURLConnection2.getOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8));
                    try {
                        bufferedWriter.write(str);
                        bufferedWriter.flush();
                        bufferedWriter.close();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection2.getResponseCode() == 200) {
                            httpURLConnection2.disconnect();
                            return true;
                        }
                        httpURLConnection2.disconnect();
                        return false;
                    } finally {
                    }
                } catch (Throwable th) {
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Exception unused) {
                httpURLConnection = httpURLConnection2;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                return false;
            } catch (Throwable th3) {
                th = th3;
                httpURLConnection = httpURLConnection2;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static boolean sendErrorSync(JSONObject jSONObject) {
        if (Helper.isTestMode()) {
            return true;
        }
        try {
            String buildEnvelopeFromPayload = buildEnvelopeFromPayload(UUID.randomUUID().toString().replace("-", ""), jSONObject);
            if (buildEnvelopeFromPayload == null) {
                return false;
            }
            return sendEnvelopeSync(buildEnvelopeFromPayload);
        } catch (Exception unused) {
            return false;
        }
    }

    public static void sendLog(String str, String str2, String str3) {
        if (Helper.isTestMode()) {
            return;
        }
        new Thread(new SentryClient$$ExternalSyntheticLambda0(str, str2, str3, 0)).start();
    }
}
