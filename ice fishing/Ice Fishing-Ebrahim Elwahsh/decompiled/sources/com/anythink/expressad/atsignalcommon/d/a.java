package com.anythink.expressad.atsignalcommon.d;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.foundation.g.g.a.b;
import com.google.android.gms.internal.ads.CL;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    private static int f18183b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static int f18184c = 1;

    /* renamed from: a, reason: collision with root package name */
    private String f18185a;

    /* renamed from: d, reason: collision with root package name */
    private String f18186d;

    /* renamed from: e, reason: collision with root package name */
    private String f18187e;

    /* renamed from: f, reason: collision with root package name */
    private WindVaneWebView f18188f;

    /* renamed from: com.anythink.expressad.atsignalcommon.d.a$a, reason: collision with other inner class name */
    public static class C0113a {

        /* renamed from: a, reason: collision with root package name */
        static a f18189a = new a(0);

        private C0113a() {
        }
    }

    public /* synthetic */ a(byte b9) {
        this();
    }

    private void a(Object obj, WindVaneWebView windVaneWebView, String str, String str2, String str3) {
        if (CL.k(str, str2, str3).equals(this.f18186d)) {
            a(obj, windVaneWebView);
        }
    }

    private static void b(Object obj) {
        a(obj, new JSONObject());
    }

    private a() {
        this.f18185a = "ShakeCacheManager";
    }

    public static a a() {
        return C0113a.f18189a;
    }

    public final void a(Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(b.f19579O, this.f18187e);
            a(obj, jSONObject);
        } catch (JSONException e6) {
            a(obj, e6.getMessage(), new JSONObject());
        }
    }

    public final void a(Object obj, WindVaneWebView windVaneWebView, String str, String str2) {
        if ((!TextUtils.isEmpty(this.f18187e) && this.f18187e.equals(str)) || (TextUtils.isEmpty(this.f18187e) && TextUtils.isEmpty(str))) {
            this.f18187e = str2;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    this.f18186d = new JSONObject(str2).optString("sid");
                } catch (JSONException e6) {
                    e6.printStackTrace();
                }
            }
            this.f18188f = windVaneWebView;
            a(obj, new JSONObject());
            return;
        }
        String str3 = this.f18187e;
        if (windVaneWebView != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("currentCache", str3);
                a(obj, "cache had changed", jSONObject);
            } catch (JSONException e9) {
                e9.printStackTrace();
            }
        }
    }

    public final void a(Object obj, WindVaneWebView windVaneWebView, String str) {
        if (!TextUtils.isEmpty(this.f18187e) && this.f18187e.equals(str)) {
            this.f18187e = "";
            this.f18188f = null;
            a(obj, windVaneWebView);
            a(obj, new JSONObject());
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("currentCache", this.f18187e);
            a(obj, "cache is exception", jSONObject);
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
    }

    private static void a(Object obj, WindVaneWebView windVaneWebView) {
        if (windVaneWebView != null) {
            h.a().a(obj, "releaseShake", "");
        }
    }

    private static void a(Object obj, WebView webView, String str, String str2) {
        if (webView != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("currentCache", str);
                a(obj, str2, jSONObject);
            } catch (JSONException e6) {
                e6.printStackTrace();
            }
        }
    }

    private static void a(Object obj, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", f18183b);
            jSONObject2.put("message", "");
            jSONObject2.put("data", jSONObject);
            h.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Exception e6) {
            a(obj, e6.getMessage(), new JSONObject());
            e6.getMessage();
        }
    }

    private static void a(Object obj, String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", f18184c);
            jSONObject2.put("message", str);
            jSONObject2.put("data", jSONObject);
            h.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Exception e6) {
            e6.getMessage();
        }
    }
}
