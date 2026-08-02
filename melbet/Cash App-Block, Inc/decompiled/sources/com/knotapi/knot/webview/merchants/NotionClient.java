package com.knotapi.knot.webview.merchants;

import android.webkit.WebStorage;
import android.webkit.WebView;
import com.knotapi.knot.utilities.JsScripts;
import com.knotapi.knot.webview.KnotView;
import com.knotapi.knot.webview.KnotViewClient;

/* loaded from: classes4.dex */
public class NotionClient extends KnotViewClient {
    public NotionClient(KnotView knotView) {
        super(knotView);
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        if (str.equals("https://www.notion.so/login")) {
            this.knotView.evaluateJavascript(JsScripts.CLEAR_LOCAL_STORAGE, null);
            WebStorage.getInstance().deleteAllData();
        }
    }

    @Override // com.knotapi.knot.webview.KnotViewClient
    public void onStorageDetails(String str, String str2) {
        this.knotView.getMerchantViewListener().sendRunningEvent("{}", "{}");
    }
}
