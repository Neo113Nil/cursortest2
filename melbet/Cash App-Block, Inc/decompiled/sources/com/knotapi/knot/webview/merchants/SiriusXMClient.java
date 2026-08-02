package com.knotapi.knot.webview.merchants;

import android.graphics.Bitmap;
import android.webkit.WebView;
import com.knotapi.knot.utilities.CookiePredicate;
import com.knotapi.knot.webview.KnotView;
import com.knotapi.knot.webview.KnotViewClient;

/* loaded from: classes4.dex */
public class SiriusXMClient extends KnotViewClient {
    public SiriusXMClient(KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient
    public boolean isUserLoggedIn(String str) {
        boolean contains = str.contains("/accountcenter");
        KnotView knotView = this.knotView;
        if (contains) {
            if (knotView.isLoggedIn) {
                return true;
            }
            boolean equals = str.equals(this.bot.getAndroidLoggedInUrl());
            if (equals) {
                this.knotView.loginDone();
            }
            return equals;
        }
        if (knotView.isLoggedIn) {
            return true;
        }
        if (this.bot.loggedInUrlSameAs(str) && this.bot.hasLoggedInPredicate()) {
            return CookiePredicate.isUserLoggedIn(this.bot, this.knotView.getCookies()).booleanValue();
        }
        return false;
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        if (str.contains("/accountcenter") && this.knotView.isUserLoggedIn(str)) {
            this.knotView.showLoader();
            this.knotView.loginDone();
        }
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (str.equals(this.bot.getPaymentUrl())) {
            this.knotView.finalStep();
        }
    }
}
