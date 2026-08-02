package com.knotapi.knot.webview.merchants;

import android.graphics.Bitmap;
import android.webkit.WebView;
import com.knotapi.knot.webview.KnotView;
import com.knotapi.knot.webview.KnotViewClient;

/* loaded from: classes4.dex */
public class EVCSClient extends KnotViewClient {
    public EVCSClient(KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        if (str.equals(this.bot.getLoggedInUrl())) {
            this.knotView.showLoader();
            this.knotView.loginDone();
        }
        if (str.equals(this.bot.getPaymentUrl())) {
            this.knotView.hideLoader();
            this.knotView.finalStep();
        }
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (str.equals(this.bot.getLoggedInUrl())) {
            this.knotView.showLoader();
            this.knotView.loginDone();
        }
    }
}
