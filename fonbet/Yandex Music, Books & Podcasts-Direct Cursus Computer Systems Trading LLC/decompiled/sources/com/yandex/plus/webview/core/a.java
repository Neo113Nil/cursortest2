package com.yandex.plus.webview.core;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import defpackage.agv;
import defpackage.f1d;
import defpackage.jyr;
import defpackage.pyc;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class a extends WebViewClient {
    public final com.yandex.plus.log.api.b a;
    public final i b;
    public final Function1 c;
    public final Function1 d;
    public final Function1 e;
    public final Function1 f;
    public final pyc g;
    public final com.yandex.plus.core.network.ssl.a h;
    public final boolean i;

    public a(com.yandex.plus.log.api.b bVar, i iVar, Function1 function1, Function1 function12, Function1 function13, Function1 function14, pyc pycVar, com.yandex.plus.core.network.ssl.a aVar, boolean z) {
        bVar.getClass();
        iVar.getClass();
        function1.getClass();
        function12.getClass();
        function13.getClass();
        pycVar.getClass();
        aVar.getClass();
        this.a = bVar;
        this.b = iVar;
        this.c = function1;
        this.d = function12;
        this.e = function13;
        this.f = function14;
        this.g = pycVar;
        this.h = aVar;
        this.i = z;
    }

    public final boolean a(com.yandex.plus.webview.core.resource.a aVar) {
        if (((Boolean) this.c.invoke(aVar)).booleanValue()) {
            return true;
        }
        com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar = this.a;
        if (!bVar.b(aVar2)) {
            return false;
        }
        bVar.c(aVar2, "PlusWebViewClient", "shouldOverrideUrlLoading() just let webview load uri=" + aVar.a);
        return false;
    }

    public final void b(WebView webView) {
        if (!this.i) {
            webView.clearHistory();
            return;
        }
        WebBackForwardList copyBackForwardList = webView.copyBackForwardList();
        copyBackForwardList.getClass();
        WebHistoryItem currentItem = copyBackForwardList.getCurrentItem();
        String url = currentItem != null ? currentItem.getUrl() : null;
        if (url == null) {
            url = "";
        }
        boolean z = copyBackForwardList.getCurrentIndex() > 0;
        WebHistoryItem currentItem2 = copyBackForwardList.getCurrentItem();
        this.g.invoke(url, currentItem2 != null ? currentItem2.getTitle() : null, Boolean.valueOf(z));
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        webView.getClass();
        str.getClass();
        b(webView);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar = this.a;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "PlusWebViewClient", "onPageFinished() url=".concat(str));
        }
        this.e.invoke(str);
        b(webView);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        webView.getClass();
        str.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar = this.a;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "PlusWebViewClient", "onPageStarted() url=".concat(str));
        }
        this.d.invoke(str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        String str;
        webView.getClass();
        webResourceRequest.getClass();
        webResourceError.getClass();
        String url = webView.getUrl();
        String uri = webResourceRequest.isForMainFrame() ? null : webResourceRequest.getUrl().toString();
        StringBuilder sb = new StringBuilder("error=");
        StringBuilder sb2 = new StringBuilder("WebResourceError[errorCode=");
        sb2.append(webResourceError.getErrorCode());
        sb2.append(", error=");
        switch (webResourceError.getErrorCode()) {
            case -16:
                str = "ERROR_UNSAFE_RESOURCE";
                break;
            case -15:
                str = "ERROR_TOO_MANY_REQUESTS";
                break;
            case -14:
                str = "ERROR_FILE_NOT_FOUND";
                break;
            case -13:
                str = "ERROR_FILE";
                break;
            case -12:
                str = "ERROR_BAD_URL";
                break;
            case -11:
                str = "ERROR_FAILED_SSL_HANDSHAKE";
                break;
            case -10:
                str = "ERROR_UNSUPPORTED_SCHEME";
                break;
            case -9:
                str = "ERROR_REDIRECT_LOOP";
                break;
            case -8:
                str = "ERROR_TIMEOUT";
                break;
            case -7:
                str = "ERROR_IO";
                break;
            case -6:
                str = "ERROR_CONNECT";
                break;
            case -5:
                str = "ERROR_PROXY_AUTHENTICATION";
                break;
            case -4:
                str = "ERROR_AUTHENTICATION";
                break;
            case -3:
                str = "ERROR_UNSUPPORTED_AUTH_SCHEME";
                break;
            case -2:
                str = "ERROR_HOST_LOOKUP";
                break;
            default:
                str = "ERROR_UNKNOWN";
                break;
        }
        sb2.append(str);
        sb2.append(']');
        sb.append(sb2.toString());
        sb.append(" original description=");
        sb.append((Object) webResourceError.getDescription());
        String sb3 = sb.toString();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
        com.yandex.plus.log.api.b bVar = this.a;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "PlusWebViewClient", "onReceivedError() isMainFrame=" + webResourceRequest.isForMainFrame() + ", mainFrameUrl=" + url + ", resourceUrl=" + uri + ", errorCode=" + webResourceError.getErrorCode() + ", description=" + sb3);
        }
        this.b.k(webResourceError.getErrorCode(), url, uri, sb3, webResourceRequest.isForMainFrame());
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        webView.getClass();
        webResourceRequest.getClass();
        webResourceResponse.getClass();
        String url = webView.getUrl();
        String uri = webResourceRequest.isForMainFrame() ? null : webResourceRequest.getUrl().toString();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
        com.yandex.plus.log.api.b bVar = this.a;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "PlusWebViewClient", "onReceivedHttpError() isMainFrame=" + webResourceRequest.isForMainFrame() + ", mainFrameUrl=" + url + ", resourceUrl=" + uri + ", errorCode=" + webResourceResponse.getStatusCode() + ", description=" + webResourceResponse.getReasonPhrase());
        }
        boolean isForMainFrame = webResourceRequest.isForMainFrame();
        int statusCode = webResourceResponse.getStatusCode();
        String reasonPhrase = webResourceResponse.getReasonPhrase();
        reasonPhrase.getClass();
        this.b.u(statusCode, url, uri, reasonPhrase, isForMainFrame);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        webView.getClass();
        sslErrorHandler.getClass();
        sslError.getClass();
        com.yandex.passport.internal.ui.sloth.ebs.i iVar = new com.yandex.passport.internal.ui.sloth.ebs.i(12, webView, sslError, this);
        com.yandex.plus.core.network.ssl.a aVar = this.h;
        aVar.getClass();
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.a;
        String str = aVar.a + ".resolveSslError() error=" + sslError + "...";
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, str, null);
        ((agv) aVar.c.getValue()).b(sslError, new com.yandex.passport.internal.core.accounts.h(aVar, sslError, sslErrorHandler, iVar, 12));
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        WebResourceResponse webResourceResponse;
        webView.getClass();
        webResourceRequest.getClass();
        Function1 function1 = this.f;
        return (function1 == null || (webResourceResponse = (WebResourceResponse) function1.invoke(webResourceRequest)) == null) ? super.shouldInterceptRequest(webView, webResourceRequest) : webResourceResponse;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        com.yandex.plus.webview.core.resource.c bVar;
        webView.getClass();
        webResourceRequest.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar2 = this.a;
        if (bVar2.b(aVar)) {
            StringBuilder sb = new StringBuilder("WebResourceRequest[url=");
            sb.append(webResourceRequest.getUrl());
            sb.append(", isForMainFrame=");
            sb.append(webResourceRequest.isForMainFrame());
            sb.append(", ");
            sb.append("isRedirect=" + webResourceRequest.isRedirect() + ", ");
            sb.append("hasGesture=");
            sb.append(webResourceRequest.hasGesture());
            sb.append(", Method=");
            sb.append(webResourceRequest.getMethod());
            sb.append(']');
            bVar2.c(aVar, "PlusWebViewClient", "shouldOverrideUrlLoading() request=".concat(sb.toString()));
        }
        com.yandex.plus.webview.core.resource.d dVar = webResourceRequest.isRedirect() ? com.yandex.plus.webview.core.resource.d.b : webResourceRequest.hasGesture() ? com.yandex.plus.webview.core.resource.d.a : com.yandex.plus.webview.core.resource.d.c;
        if (webResourceRequest.isForMainFrame()) {
            Uri url = webResourceRequest.getUrl();
            url.getClass();
            bVar = new com.yandex.plus.webview.core.resource.a(url, webResourceRequest.getRequestHeaders(), dVar);
        } else {
            String url2 = webView.getUrl();
            if (url2 == null) {
                url2 = "";
            }
            Uri parse = Uri.parse(url2);
            Uri url3 = webResourceRequest.getUrl();
            url3.getClass();
            bVar = new com.yandex.plus.webview.core.resource.b(parse, url3, webResourceRequest.getRequestHeaders(), dVar);
        }
        com.yandex.plus.webview.core.resource.a aVar2 = bVar instanceof com.yandex.plus.webview.core.resource.a ? (com.yandex.plus.webview.core.resource.a) bVar : null;
        if (aVar2 != null) {
            return a(aVar2);
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.getClass();
        str.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar = this.a;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "PlusWebViewClient", "shouldOverrideUrlLoading() (Deprecated) url=".concat(str));
        }
        return a(new com.yandex.plus.webview.core.resource.a(Uri.parse(str), null, com.yandex.plus.webview.core.resource.d.c));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        webView.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
        com.yandex.plus.log.api.b bVar = this.a;
        if (bVar.b(aVar)) {
            StringBuilder l = f1d.l(i, "onReceivedError() (Deprecated) mainFrameUrl=", str2, ", errorCode=", ", description=");
            l.append(str);
            bVar.c(aVar, "PlusWebViewClient", l.toString());
        }
        if (str == null) {
            str = "";
        }
        this.b.k(i, str2, null, str, true);
    }
}
