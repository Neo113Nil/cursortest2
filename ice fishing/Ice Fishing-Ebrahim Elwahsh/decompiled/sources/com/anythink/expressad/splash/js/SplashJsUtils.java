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
    public static final String f20843a = "onSystemPause";

    /* renamed from: b, reason: collision with root package name */
    public static final String f20844b = "onSystemResume";

    /* renamed from: c, reason: collision with root package name */
    public static final String f20845c = "onSystemDestory";

    /* renamed from: d, reason: collision with root package name */
    private static String f20846d = "SplashJsUtils";

    /* renamed from: e, reason: collision with root package name */
    private static int f20847e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static int f20848f = 1;

    private static void b(String str, d dVar) {
        if (f.f19290o == null || TextUtils.isEmpty(dVar.bh())) {
            return;
        }
        f.a(str, dVar, f.f19282f);
    }

    public static void callbackExcep(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f20848f);
            jSONObject.put("message", str);
            jSONObject.put("data", new JSONObject());
            h.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e6) {
            e6.getMessage();
        }
    }

    public static void callbackSuccess(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", f20847e);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", str);
            jSONObject.put("data", jSONObject2);
            h.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e6) {
            callbackExcep(obj, e6.getMessage());
            e6.getMessage();
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
        boolean z8;
        String str;
        File file;
        JSONObject jSONObject2 = new JSONObject();
        int i9 = 1;
        if (jSONObject == null) {
            try {
                jSONObject2.put("code", 1);
                jSONObject2.put("message", "params is null");
                h.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
                return;
            } catch (JSONException e6) {
                e6.getMessage();
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
                    } catch (JSONException e9) {
                        e9.getMessage();
                        return;
                    }
                }
                JSONArray jSONArray2 = new JSONArray();
                int length = jSONArray.length();
                int i10 = 0;
                while (i10 < length) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                    String optString = jSONObject3.optString("ref", "");
                    int i11 = jSONObject3.getInt("type");
                    JSONObject jSONObject4 = new JSONObject();
                    if (i11 != i9 || TextUtils.isEmpty(optString)) {
                        i = length;
                        i4 = i10;
                        z8 = false;
                        if (i11 == 2 && !TextUtils.isEmpty(optString)) {
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put("type", 2);
                            jSONObject5.put(com.anythink.expressad.a.f17761K, i.a().b(optString) == null ? "" : i.a().b(optString));
                            jSONObject4.put(optString, jSONObject5);
                            jSONArray2.put(jSONObject4);
                        } else if (i11 == 3 && !TextUtils.isEmpty(optString)) {
                            try {
                                file = new File(optString);
                            } catch (Throwable th) {
                                if (com.anythink.expressad.a.f17776a) {
                                    th.printStackTrace();
                                }
                            }
                            if (file.exists() && file.isFile() && file.canRead()) {
                                str = "file:////".concat(String.valueOf(optString));
                                JSONObject jSONObject6 = new JSONObject();
                                jSONObject6.put("type", 3);
                                jSONObject6.put(com.anythink.expressad.a.f17761K, str);
                                jSONObject4.put(optString, jSONObject6);
                                jSONArray2.put(jSONObject4);
                            }
                            str = "";
                            JSONObject jSONObject62 = new JSONObject();
                            jSONObject62.put("type", 3);
                            jSONObject62.put(com.anythink.expressad.a.f17761K, str);
                            jSONObject4.put(optString, jSONObject62);
                            jSONArray2.put(jSONObject4);
                        } else if (i11 == 4 && !TextUtils.isEmpty(optString)) {
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("type", 4);
                            jSONObject7.put(com.anythink.expressad.a.f17761K, u.a(optString) == null ? "" : u.a(optString));
                            jSONObject4.put(optString, jSONObject7);
                            jSONArray2.put(jSONObject4);
                        }
                    } else {
                        JSONObject jSONObject8 = new JSONObject();
                        com.anythink.expressad.videocommon.b.a.a();
                        n b9 = com.anythink.expressad.videocommon.b.a.b(optString);
                        if (b9 != null) {
                            jSONObject8.put("type", i9);
                            i = length;
                            i4 = i10;
                            jSONObject8.put("videoDataLength", b9.d());
                            String b10 = b9.b();
                            if (TextUtils.isEmpty(b10)) {
                                jSONObject8.put(com.anythink.expressad.a.f17761K, "");
                                jSONObject8.put("path4Web", "");
                            } else {
                                jSONObject8.put(com.anythink.expressad.a.f17761K, b10);
                                jSONObject8.put("path4Web", b10);
                            }
                            if (b9.c() == 100) {
                                jSONObject8.put("downloaded", 1);
                                z8 = false;
                            } else {
                                z8 = false;
                                jSONObject8.put("downloaded", 0);
                            }
                            jSONObject4.put(optString, jSONObject8);
                            jSONArray2.put(jSONObject4);
                        } else {
                            i = length;
                            i4 = i10;
                            z8 = false;
                        }
                    }
                    i10 = i4 + 1;
                    length = i;
                    i9 = 1;
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
        } catch (JSONException e10) {
            e10.getMessage();
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
                    String unused = SplashJsUtils.f20846d;
                    th.getMessage();
                }
            }
        }).start();
    }

    public static /* synthetic */ void a(String str, d dVar) {
        if (f.f19290o == null || TextUtils.isEmpty(dVar.bh())) {
            return;
        }
        f.a(str, dVar, f.f19282f);
    }
}
