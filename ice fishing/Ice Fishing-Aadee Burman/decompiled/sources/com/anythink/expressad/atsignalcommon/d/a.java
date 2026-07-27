package com.anythink.expressad.atsignalcommon.d;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.foundation.g.g.a.b;
import com.icefishing.icefishinglive2.AbstractC4404f;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    private static int f18025b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static int f18026c = 1;

    /* renamed from: a, reason: collision with root package name */
    private String f18027a;

    /* renamed from: d, reason: collision with root package name */
    private String f18028d;

    /* renamed from: e, reason: collision with root package name */
    private String f18029e;

    /* renamed from: f, reason: collision with root package name */
    private WindVaneWebView f18030f;

    /* renamed from: com.anythink.expressad.atsignalcommon.d.a$a, reason: collision with other inner class name */
    public static class C0114a {

        /* renamed from: a, reason: collision with root package name */
        static a f18031a = new a(0);

        private C0114a() {
        }
    }

    public /* synthetic */ a(byte b9) {
        this();
    }

    private void a(Object obj, WindVaneWebView windVaneWebView, String str, String str2, String str3) {
        if (AbstractC4404f.g(str, str2, str3).equals(this.f18028d)) {
            a(obj, windVaneWebView);
        }
    }

    private static void b(Object obj) {
        a(obj, new JSONObject());
    }

    private a() {
        this.f18027a = "ShakeCacheManager";
    }

    public static a a() {
        return C0114a.f18031a;
    }

    public final void a(Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(b.f19421O, this.f18029e);
            a(obj, jSONObject);
        } catch (JSONException e9) {
            a(obj, e9.getMessage(), new JSONObject());
        }
    }

    public final void a(Object obj, WindVaneWebView windVaneWebView, String str, String str2) {
        if ((!TextUtils.isEmpty(this.f18029e) && this.f18029e.equals(str)) || (TextUtils.isEmpty(this.f18029e) && TextUtils.isEmpty(str))) {
            this.f18029e = str2;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    this.f18028d = new JSONObject(str2).optString("sid");
                } catch (JSONException e9) {
                    e9.printStackTrace();
                }
            }
            this.f18030f = windVaneWebView;
            a(obj, new JSONObject());
            return;
        }
        String str3 = this.f18029e;
        if (windVaneWebView != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("currentCache", str3);
                a(obj, "cache had changed", jSONObject);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
    }

    public final void a(Object obj, WindVaneWebView windVaneWebView, String str) {
        if (!TextUtils.isEmpty(this.f18029e) && this.f18029e.equals(str)) {
            this.f18029e = "";
            this.f18030f = null;
            a(obj, windVaneWebView);
            a(obj, new JSONObject());
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("currentCache", this.f18029e);
            a(obj, "cache is exception", jSONObject);
        } catch (JSONException e9) {
            e9.printStackTrace();
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
            } catch (JSONException e9) {
                e9.printStackTrace();
            }
        }
    }

    private static void a(Object obj, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", f18025b);
            jSONObject2.put("message", "");
            jSONObject2.put("data", jSONObject);
            h.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Exception e9) {
            a(obj, e9.getMessage(), new JSONObject());
            e9.getMessage();
        }
    }

    private static void a(Object obj, String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", f18026c);
            jSONObject2.put("message", str);
            jSONObject2.put("data", jSONObject);
            h.a().a(obj, Base64.encodeToString(jSONObject2.toString().getBytes(), 2));
        } catch (Exception e9) {
            e9.getMessage();
        }
    }
}
