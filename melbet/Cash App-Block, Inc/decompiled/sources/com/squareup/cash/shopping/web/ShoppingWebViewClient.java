package com.squareup.cash.shopping.web;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.squareup.cash.autofillweb.real.AggregateAutofillWebManager;
import com.squareup.cash.autofillweb.real.CashFillWebManager$$ExternalSyntheticLambda0;
import com.squareup.cash.common.web.UriSchemeKt;
import com.squareup.util.android.coroutines.ViewKt;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes7.dex */
public final class ShoppingWebViewClient extends WebViewClient {
    public static final List FillrIgnoredAfterPayDomains = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"afterpay.com", "clearpay.co.uk", "afterpay-beta.com", "clearpay-beta.co.uk", "clearpay.com", "clearpay-beta.com"});
    public final AggregateAutofillWebManager autofillWebManager;
    public final ShoppingWebBridge shoppingWebBridge;

    public ShoppingWebViewClient(ShoppingWebBridge shoppingWebBridge, AggregateAutofillWebManager aggregateAutofillWebManager) {
        this.shoppingWebBridge = shoppingWebBridge;
        this.autofillWebManager = aggregateAutofillWebManager;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        webView.getClass();
        super.doUpdateVisitedHistory(webView, str, z);
        ViewKt.whileEachAttached(webView, EmptyCoroutineContext.INSTANCE, new ShoppingWebViewClient$onPageFinished$1(this, webView, str, null, 1));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        webView.getClass();
        super.onPageFinished(webView, str);
        this.autofillWebManager.handleOnPageFinished(webView);
        webView.evaluateJavascript("window.canHandleAfterpayTokenRequest = true;", new CashFillWebManager$$ExternalSyntheticLambda0(0));
        ViewKt.whileEachAttached(webView, EmptyCoroutineContext.INSTANCE, new ShoppingWebViewClient$onPageFinished$1(this, webView, str, null, 0));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        webView.getClass();
        str.getClass();
        super.onPageStarted(webView, str, bitmap);
        ViewKt.whileEachAttached(webView, EmptyCoroutineContext.INSTANCE, new ShoppingWebBridge$loadUrl$1(this, str, null, 14));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        String valueOf = String.valueOf(webResourceError != null ? webResourceError.getDescription() : null);
        Integer valueOf2 = webResourceError != null ? Integer.valueOf(webResourceError.getErrorCode()) : null;
        if (webView != null) {
            ViewKt.whileEachAttached(webView, EmptyCoroutineContext.INSTANCE, new ShoppingWebViewClient$onReceivedError$1(webResourceRequest, this, valueOf, valueOf2, webView, null, 0));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        String reasonPhrase = webResourceResponse != null ? webResourceResponse.getReasonPhrase() : null;
        Integer valueOf = webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null;
        if (webView != null) {
            ViewKt.whileEachAttached(webView, EmptyCoroutineContext.INSTANCE, new ShoppingWebViewClient$onReceivedError$1(webResourceRequest, this, reasonPhrase, valueOf, webView, null, 1));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        webView.getClass();
        sslErrorHandler.getClass();
        sslError.getClass();
        if (this.autofillWebManager.onReceivedSslError(webView, sslErrorHandler, sslError)) {
            return;
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        WebResourceResponse handleShouldInterceptRequest;
        String host;
        if (webResourceRequest != null) {
            List<String> list = FillrIgnoredAfterPayDomains;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (String str : list) {
                    Uri url = webResourceRequest.getUrl();
                    boolean z = false;
                    if (url != null && (host = url.getHost()) != null) {
                        z = StringsKt__StringsJVMKt.endsWith(host, str, false);
                    }
                    if (z) {
                        handleShouldInterceptRequest = null;
                        break;
                    }
                }
            }
        }
        handleShouldInterceptRequest = this.autofillWebManager.handleShouldInterceptRequest(webView, webResourceRequest);
        return handleShouldInterceptRequest == null ? super.shouldInterceptRequest(webView, webResourceRequest) : handleShouldInterceptRequest;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        webView.getClass();
        webResourceRequest.getClass();
        Uri url = webResourceRequest.getUrl();
        url.getClass();
        if (!UriSchemeKt.isUrl(url)) {
            return true;
        }
        Uri https = UriSchemeKt.toHttps(url);
        if (url.equals(https)) {
            return false;
        }
        webView.loadUrl(https.toString());
        return true;
    }
}
