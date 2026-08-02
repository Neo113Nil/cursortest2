package com.knotapi.knot.webview.merchants;

import android.webkit.WebView;
import com.knotapi.knot.ui.activities.KnotActivity;
import com.knotapi.knot.webview.KnotView;
import com.knotapi.knot.webview.KnotViewClient;

/* loaded from: classes4.dex */
public class LinkedInClient extends KnotViewClient {
    private static final String TAG = "Knot:LinkedInClient";

    public LinkedInClient(KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        try {
            this.knotView.addCookies(str);
            this.ssoCookieHelper.saveCookiesForDomain(KnotActivity.activity, str);
            if (!this.knotView.isUserLoggedIn(webView.getUrl())) {
                this.knotView.hideLoader();
            } else if (this.bot.isPaymentUrlSet() && (webView.getUrl().contains("payments/purchase") || webView.getUrl().startsWith(this.bot.getPaymentUrl()))) {
                this.knotView.finalStep();
            } else {
                this.knotView.loginDone();
            }
        } catch (Exception unused) {
        }
    }
}
