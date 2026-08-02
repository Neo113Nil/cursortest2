package com.knotapi.knot.webview.merchants;

import android.graphics.Bitmap;
import android.webkit.WebView;
import com.knotapi.knot.utilities.Cookie;
import com.knotapi.knot.webview.KnotView;
import com.knotapi.knot.webview.KnotViewClient;

/* loaded from: classes4.dex */
public class FigmaClient extends KnotViewClient {
    public FigmaClient(KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient
    public Cookie buildCookie(String str, String str2) {
        Cookie buildCookie = super.buildCookie(str, str2);
        buildCookie.setDomain("www.figma.com");
        buildCookie.setHttpOnly(true);
        buildCookie.setSecure(true);
        return buildCookie;
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (str.startsWith("https://www.figma.com/files/recents-and-sharing/recently-viewed")) {
            this.knotView.showLoader();
        }
    }
}
