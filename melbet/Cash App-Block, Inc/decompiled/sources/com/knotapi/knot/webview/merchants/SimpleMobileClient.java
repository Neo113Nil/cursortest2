package com.knotapi.knot.webview.merchants;

import android.graphics.Bitmap;
import android.webkit.WebView;
import com.knotapi.knot.webview.KnotView;
import com.knotapi.knot.webview.KnotViewClient;

/* loaded from: classes4.dex */
public class SimpleMobileClient extends KnotViewClient {
    public SimpleMobileClient(KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onPageCommitVisible(WebView webView, String str) {
        super.onPageCommitVisible(webView, str);
        this.knotView.hideLoader();
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (str.equals(this.bot.getPaymentUrl())) {
            this.knotView.addCookies(str);
            this.knotView.finalStep();
        }
    }
}
