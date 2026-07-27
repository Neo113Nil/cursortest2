package com.anythink.core.express.d;

import D.y;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.anythink.core.express.web.BaseWebView;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class a implements b {
    public static void a(WebView webView, String str, String str2) {
        String o6 = TextUtils.isEmpty(str2) ? y.o("javascript:window.WindVane.fireEvent('", str, "', '');") : y.p("javascript:window.WindVane.fireEvent('", str, "','", d.c(str2), "');");
        if (webView != null) {
            if ((webView instanceof BaseWebView) && ((BaseWebView) webView).isDestroyed()) {
                return;
            }
            try {
                webView.loadUrl(o6);
            } catch (Exception e9) {
                e9.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void a(WebView webView) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("api_version", "1.0.0");
            a(webView, com.anythink.core.express.a.c.f17523b, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception unused) {
            a(webView, com.anythink.core.express.a.c.f17523b, "");
        } catch (Throwable unused2) {
            a(webView, com.anythink.core.express.a.c.f17523b, "");
        }
    }
}
