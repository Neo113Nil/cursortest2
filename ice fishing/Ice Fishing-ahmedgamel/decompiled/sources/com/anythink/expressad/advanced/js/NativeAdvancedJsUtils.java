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
    public static final String f17892a = "onViewDisappeared";

    /* renamed from: b, reason: collision with root package name */
    public static final String f17893b = "onViewAppeared";

    /* renamed from: c, reason: collision with root package name */
    public static final String f17894c = "onSystemDestory";

    /* renamed from: d, reason: collision with root package name */
    public static final String f17895d = "setStyleList";

    /* renamed from: e, reason: collision with root package name */
    public static final String f17896e = "params";

    /* renamed from: f, reason: collision with root package name */
    public static final String f17897f = "showCloseButton";

    /* renamed from: g, reason: collision with root package name */
    public static final String f17898g = "hideCloseButton";

    /* renamed from: h, reason: collision with root package name */
    public static final String f17899h = "setVolume";
    public static final String i = "mute";

    /* renamed from: j, reason: collision with root package name */
    public static final String f17900j = "setVideoPlayMode";

    /* renamed from: k, reason: collision with root package name */
    public static final String f17901k = "autoPlay";

    /* renamed from: l, reason: collision with root package name */
    public static final String f17902l = "onNetstatChanged";

    /* renamed from: m, reason: collision with root package name */
    public static final String f17903m = "netstat";

    /* renamed from: n, reason: collision with root package name */
    public static final String f17904n = "sq";

    /* renamed from: o, reason: collision with root package name */
    public static final String f17905o = "thirdPartyCalled";

    /* renamed from: p, reason: collision with root package name */
    public static final String f17906p = "action";

    /* renamed from: q, reason: collision with root package name */
    public static final String f17907q = "params";

    /* renamed from: r, reason: collision with root package name */
    private static String f17908r = "NativeAdvancedJsUtils";

    public static void callbackSuccess(Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", CommonJSBridgeImpUtils.f17949b);
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
        int i6;
        int i9;
        boolean z3;
        String str;
        File file;
        JSONObject jSONObject2 = new JSONObject();
        int i10 = 1;
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
                int i11 = 0;
                while (i11 < length) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i11);
                    String optString = jSONObject3.optString("ref", "");
                    int i12 = jSONObject3.getInt("type");
                    JSONObject jSONObject4 = new JSONObject();
                    if (i12 != i10 || TextUtils.isEmpty(optString)) {
                        i6 = length;
                        i9 = i11;
                        z3 = false;
                        if (i12 == 2 && !TextUtils.isEmpty(optString)) {
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put("type", 2);
                            jSONObject5.put(com.anythink.expressad.a.f17603K, i.a().b(optString) == null ? "" : i.a().b(optString));
                            jSONObject4.put(optString, jSONObject5);
                            jSONArray2.put(jSONObject4);
                        } else if (i12 == 3 && !TextUtils.isEmpty(optString)) {
                            try {
                                file = new File(optString);
                            } catch (Throwable th) {
                                if (com.anythink.expressad.a.f17618a) {
                                    th.printStackTrace();
                                }
                            }
                            if (file.exists() && file.isFile() && file.canRead()) {
                                str = "file:////".concat(String.valueOf(optString));
                                JSONObject jSONObject6 = new JSONObject();
                                jSONObject6.put("type", 3);
                                jSONObject6.put(com.anythink.expressad.a.f17603K, str);
                                jSONObject4.put(optString, jSONObject6);
                                jSONArray2.put(jSONObject4);
                            }
                            str = "";
                            JSONObject jSONObject62 = new JSONObject();
                            jSONObject62.put("type", 3);
                            jSONObject62.put(com.anythink.expressad.a.f17603K, str);
                            jSONObject4.put(optString, jSONObject62);
                            jSONArray2.put(jSONObject4);
                        } else if (i12 == 4 && !TextUtils.isEmpty(optString)) {
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("type", 4);
                            jSONObject7.put(com.anythink.expressad.a.f17603K, u.a(optString) == null ? "" : u.a(optString));
                            jSONObject4.put(optString, jSONObject7);
                            jSONArray2.put(jSONObject4);
                        }
                    } else {
                        JSONObject jSONObject8 = new JSONObject();
                        com.anythink.expressad.videocommon.b.a.a();
                        n b9 = com.anythink.expressad.videocommon.b.a.b(optString);
                        if (b9 != null) {
                            jSONObject8.put("type", i10);
                            i6 = length;
                            i9 = i11;
                            jSONObject8.put("videoDataLength", b9.d());
                            String b10 = b9.b();
                            if (TextUtils.isEmpty(b10)) {
                                jSONObject8.put(com.anythink.expressad.a.f17603K, "");
                                jSONObject8.put("path4Web", "");
                            } else {
                                jSONObject8.put(com.anythink.expressad.a.f17603K, b10);
                                jSONObject8.put("path4Web", b10);
                            }
                            if (b9.c() == 100) {
                                jSONObject8.put("downloaded", 1);
                                z3 = false;
                            } else {
                                z3 = false;
                                jSONObject8.put("downloaded", 0);
                            }
                            jSONObject4.put(optString, jSONObject8);
                            jSONArray2.put(jSONObject4);
                        } else {
                            i6 = length;
                            i9 = i11;
                            z3 = false;
                        }
                    }
                    i11 = i9 + 1;
                    length = i6;
                    i10 = 1;
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
            jSONObject.put(f17904n, 1);
            jSONObject.put(f17906p, str);
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
                    a.a(webView, NativeAdvancedJsUtils.f17905o, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                }
            });
        } catch (JSONException e9) {
            e9.printStackTrace();
        }
    }
}
