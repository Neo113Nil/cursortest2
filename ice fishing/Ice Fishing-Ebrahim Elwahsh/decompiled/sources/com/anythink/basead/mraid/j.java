package com.anythink.basead.mraid;

import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* loaded from: classes.dex */
public class j extends WebChromeClient {

    /* renamed from: b, reason: collision with root package name */
    private static final String f9812b = "H5_ENTRY";

    /* renamed from: a, reason: collision with root package name */
    MraidBaseWebView f9813a;

    /* renamed from: c, reason: collision with root package name */
    private com.anythink.core.express.web.c f9814c;

    public j(MraidBaseWebView mraidBaseWebView) {
        this.f9813a = mraidBaseWebView;
    }

    public final void a(com.anythink.core.express.web.c cVar) {
        this.f9814c = cVar;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        a signalCommunication = this.f9813a.getSignalCommunication();
        if (signalCommunication == null || str3 == null || !signalCommunication.a(str3)) {
            return false;
        }
        signalCommunication.b(str2);
        jsPromptResult.confirm("");
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        com.anythink.core.express.web.c cVar = this.f9814c;
        if (cVar != null) {
            cVar.onProgressChanged(webView, i);
        }
    }
}
