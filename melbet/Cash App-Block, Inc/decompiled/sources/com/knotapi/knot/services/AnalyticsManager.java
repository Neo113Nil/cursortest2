package com.knotapi.knot.services;

import android.content.Intent;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.knotapi.knot.BuildConfig;
import com.knotapi.knot.models.Environment;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class AnalyticsManager {
    private static final String TAG = "AnalyticsManager";
    private static AnalyticsManager instance;
    private final Environment environment;

    /* renamed from: com.knotapi.knot.services.AnalyticsManager$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$knotapi$knot$models$Environment;

        static {
            int[] iArr = new int[Environment.values().length];
            $SwitchMap$com$knotapi$knot$models$Environment = iArr;
            try {
                iArr[Environment.development.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$knotapi$knot$models$Environment[Environment.sandbox.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$knotapi$knot$models$Environment[Environment.production.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum AnalyticsEventType {
        IDENTIFY,
        TRACK
    }

    private AnalyticsManager(Environment environment) {
        this.environment = environment;
    }

    public static JSONObject buildIdentifyPayload(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", AnalyticsEventType.IDENTIFY.name().toLowerCase(Locale.ROOT));
        jSONObject.put("session_id", str);
        return jSONObject;
    }

    public static JSONObject buildTrackPayload(String str, String str2, Map<String, Object> map, Map<String, Object> map2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(BreadcrumbHelper.Category.EVENT, str);
        jSONObject2.put("properties", new JSONObject(map));
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("traits", new JSONObject(map2));
        jSONObject2.put("context", jSONObject3);
        jSONObject.put("type", AnalyticsEventType.TRACK.name().toLowerCase(Locale.ROOT));
        jSONObject.put("session_id", str2);
        jSONObject.put(BreadcrumbHelper.Category.EVENT, jSONObject2);
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getBaseUrl(Environment environment) {
        int i = AnonymousClass2.$SwitchMap$com$knotapi$knot$models$Environment[environment.ordinal()];
        if (i == 1) {
            return "https://development.knotapi.com";
        }
        if (i == 2) {
            return "https://staging.knotapi.com";
        }
        if (i == 3) {
            return "https://production.knotapi.com";
        }
        OptionalProvider$$ExternalSyntheticLambda0.m((Object) environment, "Unknown environment: ");
        return null;
    }

    public static AnalyticsManager getInstance(Environment environment) {
        if (instance == null) {
            synchronized (AnalyticsManager.class) {
                try {
                    if (instance == null) {
                        instance = new AnalyticsManager(environment);
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    private void sendPayload(final JSONObject jSONObject) {
        new Thread(new Runnable() { // from class: com.knotapi.knot.services.AnalyticsManager.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    StringBuilder sb = new StringBuilder();
                    AnalyticsManager analyticsManager = AnalyticsManager.this;
                    sb.append(analyticsManager.getBaseUrl(analyticsManager.environment));
                    sb.append("/events");
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(sb.toString()).openConnection();
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("Content-Type", "application/json");
                    httpURLConnection.setDoOutput(true);
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(bufferedOutputStream, "UTF-8"));
                    bufferedWriter.write(jSONObject.toString());
                    bufferedWriter.flush();
                    bufferedWriter.close();
                    bufferedOutputStream.close();
                    httpURLConnection.getResponseCode();
                    httpURLConnection.disconnect();
                } catch (IOException unused) {
                }
            }
        }).start();
    }

    public void identifyAndTrackOpen(String str) {
        try {
            identifyUser(str);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public void identifyUser(String str) {
        try {
            JSONObject buildIdentifyPayload = buildIdentifyPayload(str);
            buildIdentifyPayload.toString();
            sendPayload(buildIdentifyPayload);
        } catch (JSONException unused) {
        }
    }

    public void trackEvent(String str, String str2, Map<String, Object> map, Map<String, Object> map2) {
        try {
            sendPayload(buildTrackPayload(str, str2, map, map2));
        } catch (JSONException unused) {
        }
    }

    public void trackSDKOpened(String str, Intent intent, boolean z, boolean z2, int[] iArr) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("entry_point", intent.getStringExtra("entryPoint"));
            hashMap.put("search_enabled", Boolean.valueOf(z));
            hashMap.put("categories_enabled", Boolean.valueOf(z2));
            if (iArr != null && iArr.length > 0) {
                hashMap.put("merchant_id", Integer.valueOf(iArr[0]));
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("platform", "android");
            hashMap2.put("sdk_version", BuildConfig.VERSION_NAME);
            trackEvent("SDK Opened", str, hashMap, hashMap2);
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
