package com.yandex.passport.internal.ui.common.web;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.yandex.passport.R;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.ui.challenge.c0;
import com.yandex.passport.internal.util.o;
import com.yandex.passport.internal.util.q;
import defpackage.b6e;
import defpackage.hrg;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e extends WebViewClient {
    public final Activity a;
    public final c0 b;
    public final f c;
    public final o0 d;
    public final d e;
    public String f;
    public boolean g;

    public e(Activity activity, c0 c0Var, f fVar, o0 o0Var, d dVar) {
        activity.getClass();
        c0Var.getClass();
        fVar.getClass();
        o0Var.getClass();
        dVar.getClass();
        this.a = activity;
        this.b = c0Var;
        this.c = fVar;
        this.d = o0Var;
        this.e = dVar;
    }

    public final void a(int i, String str) {
        boolean d = Intrinsics.d(str, this.f);
        o0 o0Var = this.d;
        if (!d) {
            o0Var.m(i, str);
            return;
        }
        f fVar = this.c;
        c0 c0Var = this.b;
        if (-6 == i || -2 == i || -7 == i || -8 == i) {
            b[] bVarArr = b.a;
            c0Var.getClass();
            fVar.a(R.string.passport_error_network);
            o0Var.l(i, str);
        } else {
            b[] bVarArr2 = b.a;
            c0Var.getClass();
            fVar.a(R.string.passport_reg_error_unknown);
            o0Var.k(new Throwable(hrg.p("errorCode=", i, " url=", str)));
        }
        this.g = true;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        if (!this.g) {
            j jVar = this.c.a;
            jVar.h.setVisibility(8);
            jVar.e.setVisibility(8);
            WebView webView2 = jVar.g;
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
        this.f = str;
        c0 c0Var = this.b;
        c0Var.getClass();
        this.g = false;
        if (this.e.a(str, c0Var.c) == c.a) {
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
        a(errorCode, uri);
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
        b[] bVarArr = b.a;
        this.b.getClass();
        this.c.a(R.string.passport_login_ssl_error);
        this.g = true;
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
        this.f = uri;
        boolean a = o.a();
        Activity activity = this.a;
        if (a && !q.a(uri)) {
            Toast.makeText(activity, R.string.passport_error_track_invalid, 0).show();
            return true;
        }
        if (!URLUtil.isNetworkUrl(uri)) {
            com.yandex.passport.internal.util.a.a(activity, new Intent("android.intent.action.VIEW", Uri.parse(uri)));
            return true;
        }
        c0 c0Var = this.b;
        c0Var.getClass();
        String str = c0Var.d;
        if (com.yandex.passport.common.url.b.h(str).equals(com.yandex.passport.common.url.b.h(uri)) && Intrinsics.d(com.yandex.passport.common.url.b.i(str), com.yandex.passport.common.url.b.i(uri))) {
            c0Var.a(uri);
            return true;
        }
        int ordinal = this.e.a(uri, c0Var.c).ordinal();
        if (ordinal == 0) {
            return false;
        }
        if (ordinal != 1) {
            if (ordinal != 2 && ordinal != 3) {
                b6e.s();
                return false;
            }
            try {
                activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(uri)));
            } catch (ActivityNotFoundException unused) {
            }
        }
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
