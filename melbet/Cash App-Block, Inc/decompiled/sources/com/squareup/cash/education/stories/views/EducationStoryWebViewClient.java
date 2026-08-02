package com.squareup.cash.education.stories.views;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.squareup.cash.education.stories.viewmodels.EducationStoryViewEvent;
import com.squareup.cash.education.stories.viewmodels.EducationStoryViewEvent$WebViewEvents$GenericError;
import com.squareup.cash.education.stories.viewmodels.EducationStoryViewEvent$WebViewEvents$HttpError;
import com.squareup.cash.education.stories.viewmodels.EducationStoryViewEvent$WebViewEvents$OnAttemptToLoadUrl;
import com.squareup.cash.education.stories.viewmodels.EducationStoryViewEvent$WebViewEvents$OnUpdateVisitedHistory;
import com.squareup.cash.education.stories.viewmodels.EducationStoryViewEvent$WebViewEvents$SSLError;
import com.squareup.cash.support.viewmodels.ArticleViewEvent;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class EducationStoryWebViewClient extends WebViewClient {
    public final /* synthetic */ int $r8$classId;
    public final Function1 onEvent;

    public EducationStoryWebViewClient(int i, Function1 function1) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.onEvent = function1;
                break;
            default:
                function1.getClass();
                this.onEvent = function1;
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        switch (this.$r8$classId) {
            case 0:
                super.doUpdateVisitedHistory(webView, str, z);
                this.onEvent.invoke(new EducationStoryViewEvent$WebViewEvents$OnUpdateVisitedHistory(str));
                break;
            default:
                super.doUpdateVisitedHistory(webView, str, z);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, final String str) {
        switch (this.$r8$classId) {
            case 0:
                super.onPageFinished(webView, str);
                this.onEvent.invoke(new EducationStoryViewEvent(str) { // from class: com.squareup.cash.education.stories.viewmodels.EducationStoryViewEvent$WebViewEvents$OnPageFinished
                    public final String url;

                    {
                        this.url = str;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof EducationStoryViewEvent$WebViewEvents$OnPageFinished) && Intrinsics.areEqual(this.url, ((EducationStoryViewEvent$WebViewEvents$OnPageFinished) obj).url);
                    }

                    public final int hashCode() {
                        String str2 = this.url;
                        if (str2 == null) {
                            return 0;
                        }
                        return str2.hashCode();
                    }

                    public final String toString() {
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OnPageFinished(url=", this.url, ")");
                    }
                });
                break;
            default:
                super.onPageFinished(webView, str);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, final String str, Bitmap bitmap) {
        switch (this.$r8$classId) {
            case 0:
                super.onPageStarted(webView, str, bitmap);
                this.onEvent.invoke(new EducationStoryViewEvent(str) { // from class: com.squareup.cash.education.stories.viewmodels.EducationStoryViewEvent$WebViewEvents$OnPageStarted
                    public final String url;

                    {
                        this.url = str;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof EducationStoryViewEvent$WebViewEvents$OnPageStarted) && Intrinsics.areEqual(this.url, ((EducationStoryViewEvent$WebViewEvents$OnPageStarted) obj).url);
                    }

                    public final int hashCode() {
                        String str2 = this.url;
                        if (str2 == null) {
                            return 0;
                        }
                        return str2.hashCode();
                    }

                    public final String toString() {
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OnPageStarted(url=", this.url, ")");
                    }
                });
                break;
            default:
                super.onPageStarted(webView, str, bitmap);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        CharSequence description;
        switch (this.$r8$classId) {
            case 0:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                this.onEvent.invoke(new EducationStoryViewEvent$WebViewEvents$GenericError(webResourceRequest, (webResourceError == null || (description = webResourceError.getDescription()) == null) ? null : description.toString(), webResourceError != null ? Integer.valueOf(webResourceError.getErrorCode()) : null));
                break;
            default:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        switch (this.$r8$classId) {
            case 0:
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                this.onEvent.invoke(new EducationStoryViewEvent$WebViewEvents$HttpError(webResourceRequest, webResourceResponse));
                break;
            default:
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        switch (this.$r8$classId) {
            case 0:
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                this.onEvent.invoke(new EducationStoryViewEvent$WebViewEvents$SSLError(sslError != null ? sslError.getUrl() : null));
                break;
            default:
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        int i = this.$r8$classId;
        Function1 function1 = this.onEvent;
        switch (i) {
            case 0:
                boolean z = (webResourceRequest == null || !webResourceRequest.isForMainFrame() || webResourceRequest.isRedirect()) ? false : true;
                if (z) {
                    function1.invoke(new EducationStoryViewEvent$WebViewEvents$OnAttemptToLoadUrl((webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) ? null : url.toString()));
                }
                return z;
            default:
                webView.getClass();
                webResourceRequest.getClass();
                String uri = webResourceRequest.getUrl().toString();
                uri.getClass();
                function1.invoke(new ArticleViewEvent.OpenUrl(uri));
                return true;
        }
    }
}
