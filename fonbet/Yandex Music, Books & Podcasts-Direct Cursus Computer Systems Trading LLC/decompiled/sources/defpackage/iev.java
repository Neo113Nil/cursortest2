package defpackage;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class iev extends WebViewClient {
    public dgv a;
    public rev b;
    public final String c = "ComplaintWebViewClient";
    public final /* synthetic */ yfv d;
    public final /* synthetic */ udv e;

    public iev(yfv yfvVar, udv udvVar) {
        this.d = yfvVar;
        this.e = udvVar;
    }

    public final dgv a() {
        dgv dgvVar = this.a;
        if (dgvVar != null) {
            return dgvVar;
        }
        Intrinsics.j("state");
        throw null;
    }

    public final void b(WebView webView, String str) {
        super.onPageFinished(webView, str);
        dgv a = a();
        a.c.setValue(fhg.a);
    }

    public final void c(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        dgv a = a();
        a.c.setValue(new jhg(0.0f));
        a().f.clear();
        a().d.setValue(null);
        a().e.setValue(null);
        a().a.setValue(str);
    }

    public final void d(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceError != null) {
            a().f.add(new sdv(webResourceRequest, webResourceError));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        super.doUpdateVisitedHistory(webView, str, z);
        rev revVar = this.b;
        if (revVar == null) {
            Intrinsics.j("navigator");
            throw null;
        }
        revVar.b.setValue(Boolean.valueOf(webView != null ? webView.canGoBack() : false));
        rev revVar2 = this.b;
        if (revVar2 != null) {
            revVar2.c.setValue(Boolean.valueOf(webView != null ? webView.canGoForward() : false));
        } else {
            Intrinsics.j("navigator");
            throw null;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        b(webView, str);
        this.e.b(str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        c(webView, str, bitmap);
        if (webView != null) {
            webView.loadUrl(this.d.b);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        d(webView, webResourceRequest, webResourceError);
        ssg.a(6, this.c, "error loading " + (webResourceRequest != null ? webResourceRequest.getUrl() : null) + ", reasonPhrase = " + (webResourceError != null ? Integer.valueOf(webResourceError.getErrorCode()) : null), null);
        this.e.d(webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        webResourceRequest.getClass();
        webResourceResponse.getClass();
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        ssg.a(6, this.c, "error while loading " + webResourceRequest.getUrl() + ", reasonPhrase = " + webResourceResponse.getReasonPhrase(), null);
        this.e.l(webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        sslErrorHandler.getClass();
        sslError.getClass();
        this.e.u(sslError, sslErrorHandler, new hav(2, this, sslError));
    }
}
