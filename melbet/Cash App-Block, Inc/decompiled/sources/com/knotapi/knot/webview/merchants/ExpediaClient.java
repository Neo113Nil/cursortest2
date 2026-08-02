package com.knotapi.knot.webview.merchants;

import android.graphics.Bitmap;
import android.webkit.WebView;
import com.knotapi.knot.models.Bot;
import com.knotapi.knot.utilities.RunCustomScript;
import com.knotapi.knot.utilities.SsoLoginHelper;
import com.knotapi.knot.webview.KnotView;
import com.knotapi.knot.webview.KnotViewClient;

/* loaded from: classes4.dex */
public class ExpediaClient extends KnotViewClient {
    public ExpediaClient(KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        Bot bot = this.bot;
        KnotView knotView = this.knotView;
        RunCustomScript.runScriptInMerchantView(bot, knotView, knotView.activity, false);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        SsoLoginHelper.processSSO(str, this.bot, this.knotView, this.ssoCookieHelper, null, false);
        this.knotView.listenToDOMChanges();
        this.knotView.trackNativeMerchantEvents();
        this.knotView.getMerchantViewListener().sendPageUrl(str);
        if (this.bot.hasCheckLoginScript()) {
            this.knotView.evaluateJavascript(this.bot.getCheckLoginScript(), null);
        }
        if (!this.bot.isPaymentUrlSet()) {
            KnotView knotView = this.knotView;
            if (knotView.isUserLoggedIn(knotView.getUrl())) {
                this.knotView.getStorageDetails();
            }
        }
        if (str.equals(this.bot.getLoginUrl()) && this.bot.hasLoginScript()) {
            this.knotView.evaluateJavascript(this.bot.getLoginScript(), null);
        }
    }
}
