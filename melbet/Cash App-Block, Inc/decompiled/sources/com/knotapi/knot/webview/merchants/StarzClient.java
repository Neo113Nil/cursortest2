package com.knotapi.knot.webview.merchants;

import android.graphics.Bitmap;
import android.webkit.WebStorage;
import android.webkit.WebView;
import com.knotapi.knot.utilities.JsScripts;
import com.knotapi.knot.webview.KnotView;
import com.knotapi.knot.webview.KnotViewClient;

/* loaded from: classes4.dex */
public class StarzClient extends KnotViewClient {
    public StarzClient(KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (str.contains("login")) {
            this.knotView.evaluateJavascript(JsScripts.CLEAR_LOCAL_STORAGE, null);
            WebStorage.getInstance().deleteAllData();
        }
    }
}
