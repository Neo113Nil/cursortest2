package com.anythink.expressad.advanced.js;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.anythink.core.common.a.n;
import com.anythink.core.common.d.t;
import com.anythink.core.express.d.a;
import com.anythink.expressad.atsignalcommon.bridge.CommonJSBridgeImpUtils;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.foundation.h.u;
import com.anythink.expressad.videocommon.b.i;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class NativeAdvancedJsUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final String f18679a = "onViewDisappeared";

    /* renamed from: b, reason: collision with root package name */
    public static final String f18680b = "onViewAppeared";

    /* renamed from: c, reason: collision with root package name */
    public static final String f18681c = "onSystemDestory";

    /* renamed from: d, reason: collision with root package name */
    public static final String f18682d = "setStyleList";

    /* renamed from: e, reason: collision with root package name */
    public static final String f18683e = "params";

    /* renamed from: f, reason: collision with root package name */
    public static final String f18684f = "showCloseButton";

    /* renamed from: g, reason: collision with root package name */
    public static final String f18685g = "hideCloseButton";

    /* renamed from: h, reason: collision with root package name */
    public static final String f18686h = "setVolume";
    public static final String i = "mute";

    /* renamed from: j, reason: collision with root package name */
    public static final String f18687j = "setVideoPlayMode";

    /* renamed from: k, reason: collision with root package name */
    public static final String f18688k = "autoPlay";

    /* renamed from: l, reason: collision with root package name */
    public static final String f18689l = "onNetstatChanged";

    /* renamed from: m, reason: collision with root package name */
    public static final String f18690m = "netstat";

    /* renamed from: n, reason: collision with root package name */
    public static final String f18691n = "sq";

    /* renamed from: o, reason: collision with root package name */
    public static final String f18692o = "thirdPartyCalled";

    /* renamed from: p, reason: collision with root package name */
    public static final String f18693p = "action";

    /* renamed from: q, reason: collision with root package name */
    public static final String f18694q = "params";

    /* renamed from: r, reason: collision with root package name */
    private static String f18695r = "NativeAdvancedJsUtils";

    public static void callbackSuccess(Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", CommonJSBridgeImpUtils.f18736b);
            h.a().a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    public static void fireOnJSBridgeConnected(WebView webView) {
        h.a();
        a.a(webView);
    }

    public static void getFileInfo(Object obj, JSONObject jSONObject) {
        int i4;
        int i6;
        boolean z6;
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
                int i10 = 0;
                while (i10 < length) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                    String optString = jSONObject3.optString("ref", "");
                    int i11 = jSONObject3.getInt("type");
                    JSONObject jSONObject4 = new JSONObject();
                    if (i11 != i9 || TextUtils.isEmpty(optString)) {
                        i4 = length;
                        i6 = i10;
                        z6 = false;
                        if (i11 == 2 && !TextUtils.isEmpty(optString)) {
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put("type", 2);
                            jSONObject5.put(com.anythink.expressad.a.f18390K, i.a().b(optString) == null ? "" : i.a().b(optString));
                            jSONObject4.put(optString, jSONObject5);
                            jSONArray2.put(jSONObject4);
                        } else if (i11 == 3 && !TextUtils.isEmpty(optString)) {
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
                        } else if (i11 == 4 && !TextUtils.isEmpty(optString)) {
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
                            jSONObject8.put("type", i9);
                            i4 = length;
                            i6 = i10;
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
                            i4 = length;
                            i6 = i10;
                            z6 = false;
                        }
                    }
                    i10 = i6 + 1;
                    length = i4;
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
        } catch (JSONException e11) {
            e11.getMessage();
            return;
        }
    }

    public static void sendEventToH5(WebView webView, String str, String str2) {
        h.a();
        a.a(webView, str, str2);
    }

    public static void sendThirdToH5(final WebView webView, String str, String str2, Object obj) {
        try {
            final JSONObject jSONObject = new JSONObject();
            jSONObject.put(f18691n, 1);
            jSONObject.put(f18693p, str);
            if (!TextUtils.isEmpty(str2)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(str2, obj);
                jSONObject.put("params", jSONObject2);
            }
            if (TextUtils.isEmpty(str2) && obj != null) {
                jSONObject.put("params", obj);
            }
            t.b().b(new Runnable() { // from class: com.anythink.expressad.advanced.js.NativeAdvancedJsUtils.1
                @Override // java.lang.Runnable
                public void run() {
                    h.a();
                    a.a(webView, NativeAdvancedJsUtils.f18692o, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                }
            });
        } catch (JSONException e9) {
            e9.printStackTrace();
        }
    }
}
