package com.anythink.expressad.atsignalcommon.windvane;

import D.y;
import android.text.TextUtils;
import android.webkit.WebView;

/* loaded from: classes.dex */
public abstract class a implements com.anythink.core.express.d.b {
    @Override // com.anythink.core.express.d.b
    public final void a(Object obj, String str, String str2) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            String o6 = TextUtils.isEmpty(str2) ? y.o("javascript:window.MvBridge.fireEvent('", str, "', '');") : y.p("javascript:window.MvBridge.fireEvent('", str, "','", com.anythink.core.express.d.d.c(str2), "');");
            WindVaneWebView windVaneWebView = bVar.f18062a;
            if (windVaneWebView != null) {
                try {
                    windVaneWebView.loadUrl(o6);
                } catch (Exception e9) {
                    e9.printStackTrace();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    @Override // com.anythink.core.express.d.b
    public final void b(Object obj, String str) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (TextUtils.isEmpty(str)) {
                String str2 = bVar.f18068g;
            } else {
                str = com.anythink.core.express.d.d.c(str);
            }
            String p9 = y.p("javascript:window.MvBridge.onFailure(", bVar.f18068g, ",'", str, "');");
            WindVaneWebView windVaneWebView = bVar.f18062a;
            if (windVaneWebView != null) {
                try {
                    windVaneWebView.loadUrl(p9);
                } catch (Exception e9) {
                    e9.printStackTrace();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    private static void a(WebView webView, String str, String str2) {
        String p9;
        if (TextUtils.isEmpty(str2)) {
            p9 = y.o("javascript:window.MvBridge.fireEvent('", str, "', '');");
        } else {
            p9 = y.p("javascript:window.MvBridge.fireEvent('", str, "','", com.anythink.core.express.d.d.c(str2), "');");
        }
        if (webView != null) {
            try {
                webView.loadUrl(p9);
            } catch (Exception e9) {
                e9.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
