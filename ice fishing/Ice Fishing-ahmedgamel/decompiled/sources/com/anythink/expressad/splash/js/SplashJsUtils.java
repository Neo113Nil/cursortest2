package com.anythink.expressad.splash.js;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.anythink.core.common.a.n;
import com.anythink.core.express.d.a;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.g.a.f;
import com.anythink.expressad.foundation.h.u;
import com.anythink.expressad.videocommon.b.i;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class SplashJsUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final String f21472a = "onSystemPause";

    /* renamed from: b, reason: collision with root package name */
    public static final String f21473b = "onSystemResume";

    /* renamed from: c, reason: collision with root package name */
    public static final String f21474c = "onSystemDestory";

    /* renamed from: d, reason: collision with root package name */
    private static String f21475d = "SplashJsUtils";

    /* renamed from: e, reason: collision with root package name */
    private static int f21476e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static int f21477f = 1;

    private static void b(String str, d dVar) {
        if (f.f19919o == null || TextUtils.isEmpty(dVar.bh())) {
            return;
        }
        f.a(str, dVar, f.f19911f);
    }

    public static void callbackExcep(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f21477f);
            jSONObject.put("message", str);
            jSONObject.put("data", new JSONObject());
            h.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    public static void callbackSuccess(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f21476e);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str);
            jSONObject.put("data", jSONObject2);
            h.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e9) {
            callbackExcep(obj, e9.getMessage());
            e9.getMessage();
        }
    }

    public static String codeToJsonString(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            String jSONObject2 = jSONObject.toString();
            return !TextUtils.isEmpty(jSONObject2) ? Base64.encodeToString(jSONObject2.getBytes(), 2) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void fireOnJSBridgeConnected(WebView webView) {
        h.a();
        a.a(webView);
    }

    public static void getFileInfo(Object obj, JSONObject jSONObject) {
        int i;
        int i4;
        boolean z6;
        String str;
        File file;
        JSONObject jSONObject2 = new JSONObject();
        int i6 = 1;
        if (jSONObject == null) {
            try {
                jSONObject2.put("code", 1);
                jSONObject2.put("message", "params is null");
                h.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            } catch (JSONException e9) {
                e9.getMessage();
                return;
            }
        }
        try {
            try {
                jSONObject2.put("code", 0);
                jSONObject2.put("message", "");
                JSONArray jSONArray = jSONObject.getJSONArray("resource");
                if (jSONArray == null || jSONArray.length() <= 0) {
                    try {
                        jSONObject2.put("code", 1);
                        jSONObject2.put("message", "resource is null");
                        h.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                        return;
                    } catch (JSONException e10) {
                        e10.getMessage();
                        return;
                    }
                }
                JSONArray jSONArray2 = new JSONArray();
                int length = jSONArray.length();
                int i9 = 0;
                while (i9 < length) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i9);
                    String optString = jSONObject3.optString("ref", "");
                    int i10 = jSONObject3.getInt("type");
                    JSONObject jSONObject4 = new JSONObject();
                    if (i10 != i6 || TextUtils.isEmpty(optString)) {
                        i = length;
                        i4 = i9;
                        z6 = false;
                        if (i10 == 2 && !TextUtils.isEmpty(optString)) {
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put("type", 2);
                            jSONObject5.put(com.anythink.expressad.a.f18390K, i.a().b(optString) == null ? "" : i.a().b(optString));
                            jSONObject4.put(optString, jSONObject5);
                            jSONArray2.put(jSONObject4);
                        } else if (i10 == 3 && !TextUtils.isEmpty(optString)) {
                            try {
                                file = new File(optString);
                            } catch (Throwable th) {
                                if (com.anythink.expressad.a.f18405a) {
                                    th.printStackTrace();
                                }
                            }
                            if (file.exists() && file.isFile() && file.canRead()) {
                                str = "file:////".concat(String.valueOf(optString));
                                JSONObject jSONObject6 = new JSONObject();
                                jSONObject6.put("type", 3);
                                jSONObject6.put(com.anythink.expressad.a.f18390K, str);
                                jSONObject4.put(optString, jSONObject6);
                                jSONArray2.put(jSONObject4);
                            }
                            str = "";
                            JSONObject jSONObject62 = new JSONObject();
                            jSONObject62.put("type", 3);
                            jSONObject62.put(com.anythink.expressad.a.f18390K, str);
                            jSONObject4.put(optString, jSONObject62);
                            jSONArray2.put(jSONObject4);
                        } else if (i10 == 4 && !TextUtils.isEmpty(optString)) {
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("type", 4);
                            jSONObject7.put(com.anythink.expressad.a.f18390K, u.a(optString) == null ? "" : u.a(optString));
                            jSONObject4.put(optString, jSONObject7);
                            jSONArray2.put(jSONObject4);
                        }
                    } else {
                        JSONObject jSONObject8 = new JSONObject();
                        com.anythink.expressad.videocommon.b.a.a();
                        n b9 = com.anythink.expressad.videocommon.b.a.b(optString);
                        if (b9 != null) {
                            jSONObject8.put("type", i6);
                            i = length;
                            i4 = i9;
                            jSONObject8.put("videoDataLength", b9.d());
                            String b10 = b9.b();
                            if (TextUtils.isEmpty(b10)) {
                                jSONObject8.put(com.anythink.expressad.a.f18390K, "");
                                jSONObject8.put("path4Web", "");
                            } else {
                                jSONObject8.put(com.anythink.expressad.a.f18390K, b10);
                                jSONObject8.put("path4Web", b10);
                            }
                            if (b9.c() == 100) {
                                jSONObject8.put("downloaded", 1);
                                z6 = false;
                            } else {
                                z6 = false;
                                jSONObject8.put("downloaded", 0);
                            }
                            jSONObject4.put(optString, jSONObject8);
                            jSONArray2.put(jSONObject4);
                        } else {
                            i = length;
                            i4 = i9;
                            z6 = false;
                        }
                    }
                    i9 = i4 + 1;
                    length = i;
                    i6 = 1;
                }
                jSONObject2.put("resource", jSONArray2);
                h.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            } catch (Throwable th2) {
                jSONObject2.put("code", 1);
                jSONObject2.put("message", th2.getLocalizedMessage());
                h.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            }
            jSONObject2.put("code", 1);
            jSONObject2.put("message", th2.getLocalizedMessage());
            h.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
            return;
        } catch (JSONException e11) {
            e11.getMessage();
            return;
        }
    }

    public static void increaseOfferFrequence(Object obj, JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                callbackExcep(obj, "data is empty");
                return;
            }
            d b9 = d.b(optJSONObject);
            if (b9 == null) {
                callbackExcep(obj, "data camapign is empty");
            } else {
                updateFrequence(b9);
                callbackSuccess(obj, "");
            }
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
        }
    }

    public static void sendEventToH5(WebView webView, String str, String str2) {
        h.a();
        a.a(webView, str, str2);
    }

    public static void updateFrequence(final d dVar) {
        new Thread(new Runnable() { // from class: com.anythink.expressad.splash.js.SplashJsUtils.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SplashJsUtils.a(d.this.L(), d.this);
                } catch (Throwable th) {
                    String unused = SplashJsUtils.f21475d;
                    th.getMessage();
                }
            }
        }).start();
    }

    public static /* synthetic */ void a(String str, d dVar) {
        if (f.f19919o == null || TextUtils.isEmpty(dVar.bh())) {
            return;
        }
        f.a(str, dVar, f.f19911f);
    }
}
