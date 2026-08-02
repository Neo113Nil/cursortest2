package com.knotapi.knot.webview.merchants;

import android.graphics.Bitmap;
import android.webkit.WebView;
import com.knotapi.knot.webview.KnotView;
import com.knotapi.knot.webview.KnotViewClient;

/* loaded from: classes4.dex */
public class MaxClient extends KnotViewClient {
    public MaxClient(KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (this.knotView.isUserLoggedIn(str) || str.equals(this.bot.getAndroidLoggedInUrl())) {
            this.knotView.showLoader();
            this.knotView.loginDone();
        }
    }
}
