package com.knotapi.knot.webview.merchants;

import android.graphics.Bitmap;
import android.webkit.WebView;
import com.knotapi.knot.webview.KnotView;
import com.knotapi.knot.webview.KnotViewClient;

/* loaded from: classes4.dex */
public class RokuClient extends KnotViewClient {
    public static final String LOGO_CLICK = "(async () => {             var interval = setInterval(() => {\n              var anchorElement = document.querySelector('.mobile-nav-brand a');\n              if (anchorElement) {                   anchorElement.setAttribute('href', 'javascript:void(0)');\n              }\n            }, 50);\n })()";
    private static final String TAG = "Knot:RokuClient";

    public RokuClient(KnotView knotView) {
        super(knotView);
    }

    public String getCheckEmailLink() {
        try {
            return this.bot.getAllSettings().get("checkEmailLink").getAsString();
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.knotapi.knot.webview.KnotViewClient, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        try {
            this.knotView.evaluateJavascript(LOGO_CLICK, null);
            if (str.startsWith(getCheckEmailLink())) {
                this.knotView.openLinkDialog(false);
            }
        } catch (Exception unused) {
        }
    }
}
