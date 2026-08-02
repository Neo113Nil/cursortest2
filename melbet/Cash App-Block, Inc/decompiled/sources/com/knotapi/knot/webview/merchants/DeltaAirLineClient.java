package com.knotapi.knot.webview.merchants;

import android.graphics.Bitmap;
import android.webkit.WebStorage;
import android.webkit.WebView;
import com.knotapi.knot.ui.activities.KnotActivity;
import com.knotapi.knot.utilities.JsScripts;
import com.knotapi.knot.webview.KnotView;
import com.knotapi.knot.webview.KnotViewClient;

/* loaded from: classes4.dex */
public class DeltaAirLineClient extends KnotViewClient {
    public DeltaAirLineClient(KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.knotView.addCookies(str);
        this.ssoCookieHelper.saveCookiesForDomain(KnotActivity.activity, str);
        boolean isUserLoggedIn = this.knotView.isUserLoggedIn(str);
        KnotView knotView = this.knotView;
        if (!isUserLoggedIn) {
            knotView.hideLoader();
            return;
        }
        knotView.loginDone();
        if (this.bot.isPaymentUrlSet()) {
            if (this.bot.paymentUrlSameAs(str) || str.equals(this.bot.getLoggedInUrl())) {
                this.knotView.finalStep();
            }
        }
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (str.equals(this.bot.getLoginUrl())) {
            this.knotView.evaluateJavascript(JsScripts.CLEAR_LOCAL_STORAGE, null);
            WebStorage.getInstance().deleteAllData();
        }
    }
}
