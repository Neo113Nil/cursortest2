package com.plaid.internal;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.plaid.internal.C0095a6;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes5.dex */
public final class K5 extends C0313w {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K5(C0148d4 c0148d4) {
        super(c0148d4);
        c0148d4.getClass();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        webView.getClass();
        webResourceRequest.getClass();
        webResourceError.getClass();
        int errorCode = webResourceError.getErrorCode();
        if (400 > errorCode || errorCode >= 500 || errorCode == 408 || errorCode == 404) {
            C0095a6.a.b(C0095a6.a, new C0248o5(B7.a(webResourceError)), "onReceivedError");
        } else {
            C0095a6.a.a(C0095a6.a, new C0248o5(B7.a(webResourceError)), "onReceivedError");
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String path;
        webView.getClass();
        webResourceRequest.getClass();
        if (!webResourceRequest.isForMainFrame() && (path = webResourceRequest.getUrl().getPath()) != null && StringsKt__StringsJVMKt.endsWith(path, "/favicon.ico", false)) {
            try {
                return new WebResourceResponse("image/png", null, null);
            } catch (Exception e) {
                C0095a6.a.a(C0095a6.a, e, "shouldInterceptRequest");
            }
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        webView.getClass();
        webResourceRequest.getClass();
        try {
            C0148d4 c0148d4 = this.a;
            String uri = webResourceRequest.getUrl().toString();
            uri.getClass();
            return c0148d4.a(uri);
        } catch (Exception e) {
            C0095a6.a.a(C0095a6.a, e);
            return true;
        }
    }
}
