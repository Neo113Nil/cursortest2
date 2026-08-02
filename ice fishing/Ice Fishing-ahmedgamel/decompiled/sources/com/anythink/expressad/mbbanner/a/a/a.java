package com.anythink.expressad.mbbanner.a.a;

import android.util.Base64;
import android.webkit.WebView;
import com.anythink.core.common.d.t;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.v;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20611a = "BannerCallJS";

    private static void a(WebView webView) {
        h.a();
        com.anythink.core.express.d.a.a(webView);
    }

    private static void b(WebView webView) {
        h.a();
        com.anythink.core.express.d.a.a(webView);
    }

    private static void a(WebView webView, float f2, float f9) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("startX", f2);
            jSONObject.put("startY", f9);
            jSONObject.put("scale", v.c(t.b().g()));
            String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
            h.a();
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

    private static void a(WindVaneWebView windVaneWebView, boolean z6) {
        try {
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.b(windVaneWebView, z6 ? "true" : "false");
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
            float f2 = n.f(t.b().g());
            float g9 = n.g(t.b().g());
            HashMap h3 = n.h(t.b().g());
            int intValue = ((Integer) h3.get("width")).intValue();
            int intValue2 = ((Integer) h3.get("height")).intValue();
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
            com.anythink.core.express.b.a.b(webView, f2, g9);
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
