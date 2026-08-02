package com.braze.ui.inappmessage.views;

import android.webkit.WebView;
import com.squareup.cash.blockers.web.delegates.WebBlockerWebViewClient;

/* loaded from: classes4.dex */
public final /* synthetic */ class InAppMessageHtmlBaseView$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ WebView f$0;

    public /* synthetic */ InAppMessageHtmlBaseView$$ExternalSyntheticLambda0(WebView webView) {
        this.f$0 = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        WebView webView = this.f$0;
        switch (i) {
            case 0:
                webView.requestFocus();
                break;
            default:
                if (WebBlockerWebViewClient.isXUrl(webView.getUrl())) {
                    webView.evaluateJavascript(WebBlockerWebViewClient.X_WEB_COMPATIBILITY_SCRIPT, null);
                    break;
                }
                break;
        }
    }
}
