package com.squareup.cash.blockers.web.delegates;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$$ExternalSyntheticLambda0;
import com.squareup.cash.autofillweb.real.AggregateAutofillWebManager;
import com.squareup.cash.blockers.views.PlaidLinkView;
import com.squareup.cash.common.web.UriSchemeKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Result;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferedChannel;

/* loaded from: classes4.dex */
public final class WebBlockerWebViewClient extends WebViewClient {
    public static final Set X_DOMAINS = ArraysKt___ArraysKt.toSet(new String[]{"x.com", "twitter.com"});
    public static final List X_WEB_COMPATIBILITY_DELAYS_MS = CollectionsKt__CollectionsKt.listOf((Object[]) new Long[]{250L, 1000L});
    public static final String X_WEB_COMPATIBILITY_SCRIPT = "(function() {\n  var height = Math.max(\n    1,\n    Math.round(\n      window.innerHeight ||\n        (window.visualViewport && window.visualViewport.height) ||\n        document.documentElement.clientHeight ||\n        0\n    )\n  );\n  var px = height + 'px';\n  var setHeight = function(element) {\n    if (!element || !element.style) return;\n    element.style.setProperty('height', px, 'important');\n    element.style.setProperty('min-height', px, 'important');\n    element.style.setProperty('max-height', 'none', 'important');\n  };\n  setHeight(document.documentElement);\n  setHeight(document.body);\n  setHeight(document.querySelector('#react-root'));\n  document.querySelectorAll('.jf-vscroller').forEach(function(scroller) {\n    for (var element = scroller; element && element !== document.body; element = element.parentElement) {\n      setHeight(element);\n    }\n    scroller.style.setProperty('overflow-x', 'hidden', 'important');\n    scroller.scrollTop = 0;\n    scroller.scrollLeft = 0;\n  });\n  window.dispatchEvent(new Event('resize'));\n})();";
    public final AggregateAutofillWebManager autofillWebManager;
    public final CoroutineScope scope;
    public final BufferedChannel webEvents;
    public final boolean xWebCompatibilityEnabled;

    public WebBlockerWebViewClient(BufferedChannel bufferedChannel, CoroutineScope coroutineScope, AggregateAutofillWebManager aggregateAutofillWebManager, boolean z) {
        this.webEvents = bufferedChannel;
        this.scope = coroutineScope;
        this.autofillWebManager = aggregateAutofillWebManager;
        this.xWebCompatibilityEnabled = z;
    }

    public static boolean isXUrl(String str) {
        Object failure;
        if (str == null) {
            return false;
        }
        try {
            Result.Companion companion = Result.Companion;
            String host = Uri.parse(str).getHost();
            if (host != null) {
                Locale locale = Locale.US;
                locale.getClass();
                failure = host.toLowerCase(locale);
                failure.getClass();
            } else {
                failure = null;
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        String str2 = (String) (failure instanceof Result.Failure ? null : failure);
        if (str2 == null) {
            return false;
        }
        String removePrefix = StringsKt.removePrefix("www.", str2);
        Set<String> set = X_DOMAINS;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        for (String str3 : set) {
            if (!removePrefix.equals(str3)) {
                if (StringsKt__StringsJVMKt.endsWith(removePrefix, "." + str3, false)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        webView.getClass();
        super.doUpdateVisitedHistory(webView, str, z);
        JobKt.launch$default(this.scope, null, null, new WebBlockerWebViewClient$onPageFinished$1(this, webView, null, 1), 3);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        webView.getClass();
        super.onPageFinished(webView, str);
        this.autofillWebManager.handleOnPageFinished(webView);
        if (this.xWebCompatibilityEnabled && isXUrl(str)) {
            webView.evaluateJavascript(X_WEB_COMPATIBILITY_SCRIPT, null);
            Iterator it = X_WEB_COMPATIBILITY_DELAYS_MS.iterator();
            while (it.hasNext()) {
                webView.postDelayed(new InAppMessageHtmlBaseView$$ExternalSyntheticLambda0(this, webView), ((Number) it.next()).longValue());
            }
        }
        JobKt.launch$default(this.scope, null, null, new WebBlockerWebViewClient$onPageFinished$1(this, webView, null, 0), 3);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        webView.getClass();
        str.getClass();
        super.onPageStarted(webView, str, bitmap);
        this.autofillWebManager.handleOnPageStarted(webView, str);
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
        WebResourceResponse handleShouldInterceptRequest = this.autofillWebManager.handleShouldInterceptRequest(webView, webResourceRequest);
        return handleShouldInterceptRequest == null ? super.shouldInterceptRequest(webView, webResourceRequest) : handleShouldInterceptRequest;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        webView.getClass();
        webResourceRequest.getClass();
        Uri url = webResourceRequest.getUrl();
        JobKt.launch$default(this.scope, null, null, new PlaidLinkView.AnonymousClass2(this, url, (Continuation) null, 11), 3);
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
