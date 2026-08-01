package com.anythink.basead.webtemplet;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.anythink.core.common.d.t;
import com.anythink.core.common.v.al;
import java.io.File;
import java.io.FileInputStream;

/* loaded from: classes.dex */
public class k extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    g f11521a;

    /* renamed from: b, reason: collision with root package name */
    private final String f11522b = "k";

    /* renamed from: c, reason: collision with root package name */
    private c f11523c;

    /* renamed from: d, reason: collision with root package name */
    private String f11524d;

    private void a(WTWebView wTWebView) {
        this.f11521a = new g(wTWebView);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f11524d = str;
        c cVar = this.f11523c;
        if (cVar != null) {
            cVar.a(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        c cVar = this.f11523c;
        if (cVar != null) {
            cVar.a(webView, i, str, str2);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        sslError.toString();
        c cVar = this.f11523c;
        if (cVar != null) {
            cVar.a(webView, sslErrorHandler, sslError);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        "onRenderProcessGone:".concat(String.valueOf(renderProcessGoneDetail));
        if (webView != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) webView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(webView);
                }
                if (webView instanceof WTWebView) {
                    ((WTWebView) webView).release();
                } else {
                    webView.destroy();
                }
            } catch (Throwable unused) {
            }
        }
        c cVar = this.f11523c;
        if (cVar != null) {
            cVar.a(webView);
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (str.startsWith("file:")) {
            String str2 = "";
            String replace = str.replace("file://", "");
            if (!al.a(replace, com.anythink.core.common.res.d.a(t.b().g()).a(6))) {
                return null;
            }
            if (str.endsWith(".js")) {
                str2 = "application/javascript";
            } else if (str.endsWith(".html")) {
                str2 = "text/html";
            } else if (str.endsWith(".css")) {
                str2 = "text/css";
            }
            if (!TextUtils.isEmpty(str2)) {
                try {
                    File file = new File(replace);
                    if (file.exists()) {
                        return new WebResourceResponse(str2, "UTF-8", new FileInputStream(file));
                    }
                } catch (Throwable unused) {
                }
            }
        }
        WebResourceResponse a9 = a(str);
        return a9 != null ? a9 : super.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith(h.f11510a)) {
            c cVar = this.f11523c;
            if (cVar != null) {
                cVar.a(webView, str);
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
        if (!TextUtils.isEmpty(str) && str.startsWith(h.f11510a) && this.f11521a.a(h.f11510a)) {
            this.f11521a.c(str);
        }
        return true;
    }

    private static WebResourceResponse a(String str) {
        Bitmap b9;
        try {
            if (TextUtils.isEmpty(str) || !h.c(str) || (b9 = com.anythink.core.common.res.b.a(t.b().g()).b(new com.anythink.core.common.res.e(1, str), 0, 0)) == null || b9.isRecycled()) {
                return null;
            }
            return new WebResourceResponse(h.d(str), com.anythink.expressad.foundation.g.a.bR, com.anythink.core.common.v.h.a(b9));
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    public final void a(c cVar) {
        this.f11523c = cVar;
    }
}
