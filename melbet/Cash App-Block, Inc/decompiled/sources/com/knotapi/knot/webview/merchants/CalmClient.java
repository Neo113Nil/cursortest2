package com.knotapi.knot.webview.merchants;

import android.graphics.Bitmap;
import android.webkit.WebView;
import com.knotapi.knot.models.Bot;
import com.knotapi.knot.utilities.RunCustomScript;
import com.knotapi.knot.webview.KnotView;
import com.knotapi.knot.webview.KnotViewClient;

/* loaded from: classes4.dex */
public class CalmClient extends KnotViewClient {
    public static final String TAG = "Knot:CalmClient";

    public CalmClient(KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        try {
            if (str.startsWith(this.bot.getAndroidLoggedInUrl())) {
                Bot bot = this.bot;
                KnotView knotView = this.knotView;
                RunCustomScript.runScriptInMerchantView(bot, knotView, knotView.activity, true);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (!str.equals(this.bot.getLoginUrl()) || this.knotView.isLoggedIn) {
            this.knotView.showLoader();
        }
    }
}
