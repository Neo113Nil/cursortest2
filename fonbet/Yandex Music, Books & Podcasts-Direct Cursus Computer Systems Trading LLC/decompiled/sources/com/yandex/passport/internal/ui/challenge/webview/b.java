package com.yandex.passport.internal.ui.challenge.webview;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.yandex.passport.R;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.util.o;
import com.yandex.passport.internal.util.q;
import defpackage.b6e;
import defpackage.hrg;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b extends WebViewClient {
    public final Function1 a;
    public final o0 b;
    public final com.yandex.passport.internal.ui.common.web.d c;
    public String d;
    public final String e;
    public final String f;

    public b(i iVar, Function1 function1, o0 o0Var, com.yandex.passport.internal.ui.common.web.d dVar) {
        function1.getClass();
        o0Var.getClass();
        dVar.getClass();
        this.a = function1;
        this.b = o0Var;
        this.c = dVar;
        this.e = iVar.a;
        this.f = iVar.b;
    }

    public final void a(int i, WebView webView, String str) {
        boolean d = Intrinsics.d(str, this.d);
        o0 o0Var = this.b;
        if (!d) {
            o0Var.m(i, str);
            return;
        }
        Function1 function1 = this.a;
        if (-6 == i || -2 == i || -7 == i || -8 == i) {
            String string = webView.getContext().getString(R.string.passport_error_network);
            string.getClass();
            function1.invoke(new f(string));
            o0Var.l(i, str);
            return;
        }
        String string2 = webView.getContext().getString(R.string.passport_reg_error_unknown);
        string2.getClass();
        function1.invoke(new f(string2));
        o0Var.k(new Throwable(hrg.p("errorCode=", i, " url=", str)));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        super.onPageFinished(webView, str);
        this.a.invoke(d.a);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        webView.getClass();
        str.getClass();
        super.onPageStarted(webView, str, bitmap);
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Page started: ".concat(str), 8);
        }
        this.d = str;
        if (this.c.a(str, this.e) == com.yandex.passport.internal.ui.common.web.c.a) {
            return;
        }
        webView.stopLoading();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        webView.getClass();
        webResourceRequest.getClass();
        webResourceError.getClass();
        int errorCode = webResourceError.getErrorCode();
        String uri = webResourceRequest.getUrl().toString();
        uri.getClass();
        a(errorCode, webView, uri);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        webView.getClass();
        sslErrorHandler.getClass();
        sslError.getClass();
        sslErrorHandler.cancel();
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "onReceivedSslError: error=" + sslError, 8);
        }
        String string = webView.getContext().getString(R.string.passport_login_ssl_error);
        string.getClass();
        this.a.invoke(new f(string));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "shouldOverrideUrlLoading: ".concat(str), 8);
        }
        this.d = str;
        boolean a = o.a();
        Function1 function1 = this.a;
        if (a && !q.a(str)) {
            String string = webView.getContext().getString(R.string.passport_error_track_invalid);
            string.getClass();
            function1.invoke(new g(string));
            return true;
        }
        if (!URLUtil.isNetworkUrl(str)) {
            function1.invoke(new c(str));
            return true;
        }
        String str2 = this.f;
        if (com.yandex.passport.common.url.b.h(str2).equals(com.yandex.passport.common.url.b.h(str)) && Intrinsics.d(com.yandex.passport.common.url.b.i(str2), com.yandex.passport.common.url.b.i(str))) {
            function1.invoke(new e(str));
            return true;
        }
        int ordinal = this.c.a(str, this.e).ordinal();
        if (ordinal == 0) {
            return false;
        }
        if (ordinal != 1) {
            if (ordinal != 2 && ordinal != 3) {
                b6e.s();
                return false;
            }
            function1.invoke(new c(str));
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        webView.getClass();
        str.getClass();
        str2.getClass();
        a(i, webView, str2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        webView.getClass();
        webResourceRequest.getClass();
        String uri = webResourceRequest.getUrl().toString();
        uri.getClass();
        return shouldOverrideUrlLoading(webView, uri);
    }
}
