package com.yandex.passport.sloth.ui;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.MimeTypeMap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.connectsdk.service.command.ServiceCommand;
import defpackage.agv;
import defpackage.b6e;
import defpackage.dfi;
import defpackage.tah;
import defpackage.uah;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class c2 extends WebViewClient {
    public final com.yandex.passport.sloth.data.o0 a;
    public final g b;
    public final agv c;
    public final f d;
    public final f e;
    public final Function1 f;
    public final Function0 g;
    public final Function1 h;
    public final Function0 i;
    public final Function0 j;
    public final Function0 k;
    public final Function0 l;
    public final Function1 m;
    public final z1 n;
    public final Object o;

    public c2(com.yandex.passport.sloth.data.o0 o0Var, g gVar, agv agvVar, f fVar, f fVar2, Function1 function1, Function0 function0, Function1 function12, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function1 function13, z1 z1Var) {
        function1.getClass();
        function0.getClass();
        function12.getClass();
        function02.getClass();
        function03.getClass();
        function04.getClass();
        function05.getClass();
        function13.getClass();
        this.a = o0Var;
        this.b = gVar;
        this.c = agvVar;
        this.d = fVar;
        this.e = fVar2;
        this.f = function1;
        this.g = function0;
        this.h = function12;
        this.i = function02;
        this.j = function03;
        this.k = function04;
        this.l = function05;
        this.m = function13;
        this.n = z1Var;
        this.o = uah.e(new Pair("js", "application/javascript"), new Pair("woff", "font/woff"), new Pair("woff2", "font/woff2"));
    }

    public final boolean a(String str) {
        str.getClass();
        f fVar = this.d;
        fVar.getClass();
        com.yandex.passport.sloth.url.y a = ((com.yandex.passport.sloth.c1) fVar.a).a(str);
        if (a instanceof com.yandex.passport.sloth.url.d0) {
            com.yandex.passport.sloth.r0 r0Var = com.yandex.passport.sloth.r0.BLOCKER_URL;
            Map n = dfi.n("blocked_url", String.valueOf(Uri.parse(str).buildUpon().clearQuery().build()));
            com.yandex.passport.internal.sloth.o oVar = (com.yandex.passport.internal.sloth.o) ((com.yandex.passport.internal.ui.sloth.c) this.b).a;
            oVar.getClass();
            if (oVar.a()) {
                r0Var.getClass();
                oVar.a.a("sloth.reportWebAmEvent.".concat("blocked_url"), n);
            }
        }
        if (a.equals(com.yandex.passport.sloth.url.c0.b)) {
            return false;
        }
        if (a.equals(com.yandex.passport.sloth.url.d0.b)) {
            this.m.invoke(com.yandex.passport.sloth.ui.webview.a.a);
            return true;
        }
        if (a instanceof com.yandex.passport.sloth.url.f0) {
            this.k.invoke();
            return true;
        }
        boolean z = a instanceof com.yandex.passport.sloth.url.e0;
        Function0 function0 = this.g;
        if (z) {
            com.yandex.passport.sloth.url.e0 e0Var = (com.yandex.passport.sloth.url.e0) a;
            this.f.invoke(new com.yandex.passport.common.url.b(e0Var.b));
            if (e0Var.c) {
                function0.invoke();
            }
            return true;
        }
        if (a.equals(com.yandex.passport.sloth.url.c0.c)) {
            function0.invoke();
            return true;
        }
        if (a instanceof com.yandex.passport.sloth.url.g0) {
            this.h.invoke(((com.yandex.passport.sloth.url.g0) a).b);
            return true;
        }
        if (a.equals(com.yandex.passport.sloth.url.c0.e)) {
            this.i.invoke();
            return true;
        }
        if (a.equals(com.yandex.passport.sloth.url.c0.d)) {
            this.j.invoke();
            return true;
        }
        b6e.s();
        return false;
    }

    public final void b(int i, String str) {
        Function1 function1 = this.m;
        if (-6 == i || -2 == i || -7 == i) {
            function1.invoke(com.yandex.passport.sloth.ui.webview.b.a);
        } else {
            str.getClass();
            function1.invoke(new com.yandex.passport.sloth.ui.webview.d(i, str));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        if (StringsKt.M(str, "https://passport.yandex-team.ru/auth", false) || StringsKt.M(str, "https://passport.yandex-team.ru/pwl/auth", false) || StringsKt.M(str, "https://oauth.yandex.ru/authorize", false) || StringsKt.M(str, "https://oauth-test.yandex.ru/authorize", false) || StringsKt.M(str, "https://passport.yango-team.com/auth", false) || StringsKt.M(str, "https://passport.yango-team.com/pwl/auth", false) || (this.a instanceof com.yandex.passport.sloth.data.k0)) {
            this.l.invoke();
        }
        this.n.invoke(Boolean.valueOf(webView.canGoBack()));
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        webView.getClass();
        str.getClass();
        if (a(str)) {
            webView.stopLoading();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        webView.getClass();
        webResourceRequest.getClass();
        webResourceError.getClass();
        if (webResourceRequest.isForMainFrame()) {
            int errorCode = webResourceError.getErrorCode();
            String uri = webResourceRequest.getUrl().toString();
            uri.getClass();
            b(errorCode, uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Object dVar;
        webView.getClass();
        webResourceRequest.getClass();
        webResourceResponse.getClass();
        if (webResourceRequest.isForMainFrame()) {
            int statusCode = webResourceResponse.getStatusCode();
            if (400 <= statusCode && statusCode < 500) {
                dVar = com.yandex.passport.sloth.ui.webview.c.a;
            } else if (500 > statusCode || statusCode >= 600) {
                int statusCode2 = webResourceResponse.getStatusCode();
                Uri url = webResourceRequest.getUrl();
                com.yandex.passport.common.url.b.Companion.getClass();
                dVar = new com.yandex.passport.sloth.ui.webview.d(statusCode2, com.yandex.passport.common.url.a.a(url));
            } else {
                dVar = com.yandex.passport.sloth.ui.webview.c.b;
            }
            this.m.invoke(dVar);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        webView.getClass();
        sslErrorHandler.getClass();
        sslError.getClass();
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "onReceivedSslError, error=" + sslError, 8);
        }
        this.c.b(sslError, new com.yandex.passport.internal.core.accounts.h(sslErrorHandler, webView, sslError, this, 4));
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        webView.getClass();
        renderProcessGoneDetail.getClass();
        this.m.invoke(com.yandex.passport.sloth.ui.webview.c.c);
        return true;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.Map] */
    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String str;
        String str2;
        webView.getClass();
        webResourceRequest.getClass();
        WebResourceResponse webResourceResponse = null;
        if (Intrinsics.d(webResourceRequest.getMethod(), ServiceCommand.TYPE_GET)) {
            String uri = webResourceRequest.getUrl().toString();
            uri.getClass();
            f fVar = this.e;
            fVar.getClass();
            str = ((com.yandex.passport.sloth.c1) fVar.a).c(uri);
        } else {
            str = null;
        }
        if (str != null) {
            AssetManager assets = webView.getContext().getAssets();
            assets.getClass();
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Found cache in bundle: ".concat(str), 8);
            }
            try {
                String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
                if (fileExtensionFromUrl != null) {
                    String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
                    if (mimeTypeFromExtension == null) {
                        mimeTypeFromExtension = (String) this.o.get(fileExtensionFromUrl);
                    }
                    str2 = mimeTypeFromExtension;
                } else {
                    str2 = null;
                }
                webResourceResponse = new WebResourceResponse(str2, "utf-8", 200, "OK", tah.b(new Pair("Access-Control-Allow-Origin", "*")), assets.open(str));
            } catch (Exception unused) {
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.e, null, "Error while loading cache from bundle: ".concat(str), 8);
                }
            }
            if (webResourceResponse != null) {
                return webResourceResponse;
            }
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        webView.getClass();
        webResourceRequest.getClass();
        if (!webResourceRequest.isForMainFrame()) {
            return false;
        }
        String uri = webResourceRequest.getUrl().toString();
        uri.getClass();
        return a(uri);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        webView.getClass();
        str.getClass();
        str2.getClass();
        b(i, str2);
    }
}
