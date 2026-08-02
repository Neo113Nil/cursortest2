package com.squareup.cash.autofillweb.api;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public interface AutofillWebManager {
    Flow getAddress1FieldDetected();

    Flow getCardFieldDetected();

    Flow getCurrentFocusedField();

    Flow getInfoFieldsDetected();

    Flow getLastCapturedValueInfo();

    Flow getLoggingFieldsDetected();

    void handleOnPageFinished(WebView webView);

    void handleOnPageStarted(WebView webView, String str);

    WebResourceResponse handleShouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest);

    boolean onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError);

    void registerWebView(WebView webView);

    void setAutofillInfo(AutofillWebInfo autofillWebInfo);

    void triggerAutofill();

    void unregisterWebView(WebView webView);
}
