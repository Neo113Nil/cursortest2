package com.knotapi.knot.webview.merchants;

import android.graphics.Bitmap;
import android.webkit.WebView;
import com.knotapi.knot.webview.KnotView;
import com.knotapi.knot.webview.KnotViewClient;

/* loaded from: classes4.dex */
public class ClassPassClient extends KnotViewClient {
    public ClassPassClient(KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (str.equals(this.bot.getAndroidLoggedInUrl())) {
            this.knotView.finalStep();
        }
    }
}
