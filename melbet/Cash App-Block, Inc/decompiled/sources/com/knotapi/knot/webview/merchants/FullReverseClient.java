package com.knotapi.knot.webview.merchants;

import android.webkit.WebView;
import com.knotapi.knot.webview.KnotView;
import com.knotapi.knot.webview.KnotViewClient;

/* loaded from: classes4.dex */
public class FullReverseClient extends KnotViewClient {
    public static final String TAG = "Knot:FullReverseClient";
    private boolean isFullReverseFormLoaded;

    public FullReverseClient(KnotView knotView) {
        super(knotView);
        this.isFullReverseFormLoaded = false;
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        if (this.isFullReverseFormLoaded) {
            return;
        }
        this.isFullReverseFormLoaded = true;
        this.knotView.loadDataWithBaseURL("file:///android_asset/", String.valueOf(this.bot.getAllSettings().get("frTemplate")).replace("\\n", "\n").replace("\\\"", "\"").replaceAll("^\"|\"$", ""), "text/html", "UTF-8", null);
    }
}
