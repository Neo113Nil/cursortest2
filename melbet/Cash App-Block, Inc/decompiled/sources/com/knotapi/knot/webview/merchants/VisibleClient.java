package com.knotapi.knot.webview.merchants;

import android.webkit.WebView;
import com.knotapi.knot.webview.KnotView;
import com.knotapi.knot.webview.KnotViewClient;

/* loaded from: classes4.dex */
public class VisibleClient extends KnotViewClient {
    public VisibleClient(KnotView knotView) {
        super(knotView);
    }

    public String getAdditionalUrl() {
        try {
            return this.bot.getAllSettings().get("additionalUrl").getAsString();
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        if (this.knotView.isUserLoggedIn(str) || str.equals(getAdditionalUrl()) || str.contains("/payment/getPaymentMethod")) {
            this.knotView.finalStep();
        }
    }
}
