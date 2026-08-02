package com.yandex.passport.internal.ui.webview;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.yandex.passport.R;
import com.yandex.passport.common.network.n;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.flags.experiments.p;
import com.yandex.passport.internal.ui.webview.webcases.l;
import com.yandex.passport.internal.util.o;
import com.yandex.passport.internal.util.q;
import defpackage.hrg;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a extends WebViewClient {
    public final WebViewActivity a;
    public final l b;
    public final p c;
    public final o0 d;
    public String e;
    public boolean f;

    public a(WebViewActivity webViewActivity, l lVar, p pVar, o0 o0Var) {
        lVar.getClass();
        pVar.getClass();
        o0Var.getClass();
        this.a = webViewActivity;
        this.b = lVar;
        this.c = pVar;
        this.d = o0Var;
    }

    public final void a(int i, String str) {
        boolean d = Intrinsics.d(str, this.e);
        o0 o0Var = this.d;
        if (!d) {
            o0Var.m(i, str);
            return;
        }
        p pVar = this.c;
        WebViewActivity webViewActivity = this.a;
        l lVar = this.b;
        if (-6 == i || -2 == i || -7 == i || -8 == i) {
            if (!lVar.i(webViewActivity, R.string.passport_error_network)) {
                pVar.J(R.string.passport_error_network);
            }
            o0Var.l(i, str);
        } else {
            if (!lVar.i(webViewActivity, R.string.passport_reg_error_unknown)) {
                pVar.J(R.string.passport_reg_error_unknown);
            }
            o0Var.k(new Throwable(hrg.p("errorCode=", i, " url=", str)));
        }
        this.f = true;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        if (!this.f) {
            p pVar = this.c;
            WebView webView2 = (WebView) pVar.d;
            ((View) ((n) pVar.c).b).setVisibility(8);
            ((View) pVar.b).setVisibility(8);
            webView2.setVisibility(0);
            webView2.requestFocus();
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        webView.getClass();
        str.getClass();
        super.onPageStarted(webView, str, bitmap);
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Page started: ".concat(str), 8);
        }
        this.e = str;
        this.b.j(this.a, Uri.parse(str));
        this.f = false;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        webView.getClass();
        webResourceRequest.getClass();
        webResourceError.getClass();
        int errorCode = webResourceError.getErrorCode();
        String uri = webResourceRequest.getUrl().toString();
        uri.getClass();
        a(errorCode, uri);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        webView.getClass();
        webResourceRequest.getClass();
        webResourceResponse.getClass();
        if (webResourceRequest.isForMainFrame()) {
            int statusCode = webResourceResponse.getStatusCode();
            String uri = webResourceRequest.getUrl().toString();
            uri.getClass();
            if (200 > statusCode || statusCode >= 300) {
                this.f = true;
                this.d.l(statusCode, uri);
                int i = (400 > statusCode || statusCode >= 500) ? (500 > statusCode || statusCode >= 600) ? R.string.passport_webview_unexpected_error_text : R.string.passport_error_unknown_server_response : R.string.passport_webview_404_error_text;
                if (this.b.i(this.a, i)) {
                    return;
                }
                this.c.J(i);
            }
        }
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
        if (!this.b.i(this.a, R.string.passport_login_ssl_error)) {
            this.c.J(R.string.passport_login_ssl_error);
        }
        this.f = true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        webView.getClass();
        webResourceRequest.getClass();
        String uri = webResourceRequest.getUrl().toString();
        uri.getClass();
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "shouldOverrideUrlLoading: ".concat(uri), 8);
        }
        this.e = uri;
        boolean a = o.a();
        WebViewActivity webViewActivity = this.a;
        if (a && !q.a(uri)) {
            Toast.makeText(webViewActivity, R.string.passport_error_track_invalid, 0).show();
            return true;
        }
        if (URLUtil.isNetworkUrl(uri)) {
            return this.b.k(webViewActivity, Uri.parse(uri));
        }
        com.yandex.passport.internal.util.a.a(webViewActivity, new Intent("android.intent.action.VIEW", Uri.parse(uri)));
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        webView.getClass();
        str.getClass();
        str2.getClass();
        a(i, str2);
    }
}
