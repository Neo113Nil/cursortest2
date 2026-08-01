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
    private static final String f9621a = "FormatViewCallJS";

    private static void a(WebView webView) {
        f.a();
        com.anythink.core.express.d.a.a(webView);
    }

    private static void a(WebView webView, float f3, float f9) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("startX", f3);
            jSONObject.put("startY", f9);
            jSONObject.put("scale", q.h(t.b().g()));
            String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
            f.a();
            com.anythink.core.express.d.a.a(webView, "webviewshow", encodeToString);
        } catch (Throwable unused) {
        }
    }

    private static void a(WebView webView, int i, int i6) {
        try {
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(webView, i, i6);
        } catch (Throwable unused) {
        }
    }

    public static void a(BaseWebView baseWebView, boolean z3) {
        try {
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(baseWebView, z3 ? "true" : "false");
        } catch (Throwable unused) {
        }
    }

    private static void a(WebView webView, int i, int i6, int i9, int i10) {
        String str;
        try {
            int i11 = t.b().g().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            if (i11 == 2) {
                str = "landscape";
            } else {
                str = i11 == 1 ? "portrait" : "undefined";
            }
            jSONObject.put("orientation", str);
            jSONObject.put("locked", "true");
            float e9 = q.e(t.b().g());
            float f3 = q.f(t.b().g());
            HashMap g4 = q.g(t.b().g());
            int intValue = ((Integer) g4.get("width")).intValue();
            int intValue2 = ((Integer) g4.get("height")).intValue();
            HashMap hashMap = new HashMap();
            hashMap.put(com.anythink.core.express.b.a.f17525a, com.anythink.core.express.b.a.f17534k);
            hashMap.put(com.anythink.core.express.b.a.f17526b, com.anythink.core.express.b.a.f17530f);
            hashMap.put(com.anythink.core.express.b.a.f17527c, "true");
            hashMap.put(com.anythink.core.express.b.a.f17528d, jSONObject);
            com.anythink.core.express.b.a.a();
            float f9 = i;
            float f10 = i6;
            float f11 = i9;
            float f12 = i10;
            com.anythink.core.express.b.a.a(webView, f9, f10, f11, f12);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(webView, f9, f10, f11, f12);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(webView, e9, f3);
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
