package com.knotapi.knot.webview.merchants;

import android.webkit.WebView;
import com.knotapi.knot.models.Bot;
import com.knotapi.knot.utilities.RunCustomScript;
import com.knotapi.knot.webview.KnotView;
import com.knotapi.knot.webview.KnotViewClient;

/* loaded from: classes4.dex */
public class CashAppClient extends KnotViewClient {
    public CashAppClient(KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        Bot bot = this.bot;
        KnotView knotView = this.knotView;
        RunCustomScript.runScriptInMerchantView(bot, knotView, knotView.activity, false);
    }
}
