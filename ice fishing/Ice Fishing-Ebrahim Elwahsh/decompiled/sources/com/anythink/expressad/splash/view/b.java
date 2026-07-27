package com.anythink.expressad.splash.view;

import android.graphics.Bitmap;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.anythink.core.common.v.z;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.splash.js.SplashJSBridgeImpl;

/* loaded from: classes.dex */
public final class b extends com.anythink.core.express.web.b {

    /* renamed from: a, reason: collision with root package name */
    com.anythink.expressad.splash.d.a f20989a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20990b = "SplashWebViewClient";

    private void a(com.anythink.expressad.splash.d.a aVar) {
        if (aVar != null) {
            this.f20989a = aVar;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        try {
            webView.evaluateJavascript("javascript:" + z.a().b(), new ValueCallback<String>() { // from class: com.anythink.expressad.splash.view.b.1
                private static void a() {
                }

                @Override // android.webkit.ValueCallback
                public final /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                }
            });
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.core.express.web.b, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            WindVaneWebView windVaneWebView = (WindVaneWebView) webView;
            if (System.currentTimeMillis() - windVaneWebView.lastTouchTime > com.anythink.expressad.b.c.a.f18356c) {
                d dVar = ((SplashJSBridgeImpl) windVaneWebView.getObject()).getmCampaignList().get(0);
                windVaneWebView.getUrl();
                com.anythink.expressad.b.c.a.a(dVar);
                return false;
            }
            com.anythink.expressad.splash.d.a aVar = this.f20989a;
            if (aVar == null) {
                return true;
            }
            aVar.b(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
