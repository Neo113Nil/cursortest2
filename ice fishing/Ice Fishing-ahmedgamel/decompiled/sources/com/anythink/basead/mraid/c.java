package com.anythink.basead.mraid;

import android.util.Base64;
import android.webkit.WebView;
import com.anythink.core.common.d.t;
import com.anythink.core.common.v.q;
import com.anythink.core.express.web.BaseWebView;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10407a = "FormatViewCallJS";

    private static void a(WebView webView) {
        f.a();
        com.anythink.core.express.d.a.a(webView);
    }

    private static void a(WebView webView, float f2, float f9) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("startX", f2);
            jSONObject.put("startY", f9);
            jSONObject.put("scale", q.h(t.b().g()));
            String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
            f.a();
            com.anythink.core.express.d.a.a(webView, "webviewshow", encodeToString);
        } catch (Throwable unused) {
        }
    }

    private static void a(WebView webView, int i, int i4) {
        try {
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(webView, i, i4);
        } catch (Throwable unused) {
        }
    }

    public static void a(BaseWebView baseWebView, boolean z6) {
        try {
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(baseWebView, z6 ? "true" : "false");
        } catch (Throwable unused) {
        }
    }

    private static void a(WebView webView, int i, int i4, int i6, int i9) {
        String str;
        try {
            int i10 = t.b().g().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            if (i10 == 2) {
                str = "landscape";
            } else {
                str = i10 == 1 ? "portrait" : "undefined";
            }
            jSONObject.put("orientation", str);
            jSONObject.put("locked", "true");
            float e9 = q.e(t.b().g());
            float f2 = q.f(t.b().g());
            HashMap g9 = q.g(t.b().g());
            int intValue = ((Integer) g9.get("width")).intValue();
            int intValue2 = ((Integer) g9.get("height")).intValue();
            HashMap hashMap = new HashMap();
            hashMap.put(com.anythink.core.express.b.a.f18312a, com.anythink.core.express.b.a.f18321k);
            hashMap.put(com.anythink.core.express.b.a.f18313b, com.anythink.core.express.b.a.f18317f);
            hashMap.put(com.anythink.core.express.b.a.f18314c, "true");
            hashMap.put(com.anythink.core.express.b.a.f18315d, jSONObject);
            com.anythink.core.express.b.a.a();
            float f9 = i;
            float f10 = i4;
            float f11 = i6;
            float f12 = i9;
            com.anythink.core.express.b.a.a(webView, f9, f10, f11, f12);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(webView, f9, f10, f11, f12);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(webView, e9, f2);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.c(webView, intValue, intValue2);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(webView, hashMap);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(webView);
        } catch (Throwable unused) {
        }
    }
}
