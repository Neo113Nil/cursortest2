package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class lev extends WebViewClient {
    public cgv a;
    public idv b;
    public final String c = "ComposeWebViewClient";
    public final pv9 d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ aqi f;
    public final /* synthetic */ cev g;
    public final /* synthetic */ aqi h;

    public lev(Context context, aqi aqiVar, cev cevVar, aqi aqiVar2) {
        this.e = context;
        this.f = aqiVar;
        this.g = cevVar;
        this.h = aqiVar2;
        this.d = new pv9(context);
    }

    public final cgv a() {
        cgv cgvVar = this.a;
        if (cgvVar != null) {
            return cgvVar;
        }
        Intrinsics.j("state");
        throw null;
    }

    public final void b(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        super.onPageFinished(webView, str);
        cgv a = a();
        a.b.setValue(ehg.a);
    }

    public final void c(WebView webView, String str, Bitmap bitmap) {
        webView.getClass();
        str.getClass();
        super.onPageStarted(webView, str, bitmap);
        cgv a = a();
        a.b.setValue(new ihg(0.0f));
        a().e.clear();
        a().c.setValue(null);
        a().d.setValue(null);
        a().a.setValue(str);
    }

    public final void d(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        webView.getClass();
        webResourceRequest.getClass();
        webResourceError.getClass();
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        a().e.add(new rdv(webResourceRequest, webResourceError));
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        webView.getClass();
        str.getClass();
        super.doUpdateVisitedHistory(webView, str, z);
        idv idvVar = this.b;
        if (idvVar == null) {
            Intrinsics.j("navigator");
            throw null;
        }
        idvVar.c.setValue(Boolean.valueOf(webView.canGoBack()));
        idv idvVar2 = this.b;
        if (idvVar2 == null) {
            Intrinsics.j("navigator");
            throw null;
        }
        idvVar2.d.setValue(Boolean.valueOf(webView.canGoForward()));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        b(webView, str);
        tdv tdvVar = (tdv) this.h.getValue();
        if (tdvVar != null) {
            tdvVar.b(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        webView.getClass();
        str.getClass();
        c(webView, str, bitmap);
        cev cevVar = this.g;
        if (cevVar != null) {
            webView.loadUrl(cevVar.b);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        webView.getClass();
        webResourceRequest.getClass();
        webResourceError.getClass();
        d(webView, webResourceRequest, webResourceError);
        ssg.a(6, this.c, "error loading " + webResourceRequest.getUrl() + ", reasonPhrase = " + Integer.valueOf(webResourceError.getErrorCode()), null);
        tdv tdvVar = (tdv) this.h.getValue();
        if (tdvVar != null) {
            tdvVar.d(webResourceRequest, webResourceError);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        webView.getClass();
        webResourceRequest.getClass();
        webResourceResponse.getClass();
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        ssg.a(6, this.c, "error while loading " + webResourceRequest.getUrl() + ", reasonPhrase = " + webResourceResponse.getReasonPhrase(), null);
        tdv tdvVar = (tdv) this.h.getValue();
        if (tdvVar != null) {
            tdvVar.l(webResourceRequest, webResourceResponse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        webView.getClass();
        sslErrorHandler.getClass();
        sslError.getClass();
        ftr ftrVar = new ftr(14, this, sslError, this.h);
        pv9 pv9Var = this.d;
        pv9Var.getClass();
        if (((bgv) pv9Var.b).b(sslError, new nnd(13, sslErrorHandler, ftrVar))) {
            return;
        }
        sslError.getPrimaryError();
        sslErrorHandler.cancel();
        ftrVar.invoke();
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String scheme;
        String scheme2;
        String scheme3;
        webView.getClass();
        webResourceRequest.getClass();
        Uri url = webResourceRequest.getUrl();
        Context context = this.e;
        if (url != null && (scheme3 = url.getScheme()) != null && c.v(scheme3, "bank", false)) {
            try {
                context.startActivity(new Intent("android.intent.action.VIEW", webResourceRequest.getUrl()));
                return true;
            } catch (ActivityNotFoundException unused) {
                y5g.n0(context, R.string.error_open_bank_application, 0);
                return true;
            }
        }
        Uri url2 = webResourceRequest.getUrl();
        String str = this.c;
        if (url2 != null && (scheme2 = url2.getScheme()) != null && c.v(scheme2, "market", false)) {
            try {
                context.startActivity(new Intent("android.intent.action.VIEW", webResourceRequest.getUrl()));
                return true;
            } catch (ActivityNotFoundException e) {
                ssg.a(6, str, "Failed to open market URL: no app found to handle the request", e);
                return true;
            }
        }
        Uri url3 = webResourceRequest.getUrl();
        if (url3 != null && (scheme = url3.getScheme()) != null && c.v(scheme, "intent", false)) {
            try {
                context.startActivity(Intent.parseUri(webResourceRequest.getUrl().toString(), 1));
                return true;
            } catch (ActivityNotFoundException e2) {
                ssg.a(6, str, "Not found an activity for WebView's intent", e2);
                return true;
            }
        }
        zev zevVar = (zev) this.f.getValue();
        if (zevVar != null) {
            context.getClass();
            mfv mfvVar = zevVar.a;
            mfvVar.getClass();
            tfv tfvVar = mfvVar.a;
            Uri url4 = webResourceRequest.getUrl();
            url4.getClass();
            if (tfvVar.K(context, url4)) {
                return true;
            }
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }
}
