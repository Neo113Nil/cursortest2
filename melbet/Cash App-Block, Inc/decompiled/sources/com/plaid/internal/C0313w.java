package com.plaid.internal;

import android.net.http.SslError;
import android.webkit.CookieManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.plaid.internal.C0095a6;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import papa.SafeTrace;

/* renamed from: com.plaid.internal.w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C0313w extends WebViewClient {
    public final C0148d4 a;
    public String b;

    @DebugMetadata(c = "com.plaid.core.webview.BasePlaidWebViewClient$onPageFinished$1", f = "WebViewClients.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.plaid.internal.w$a */
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return new a((Continuation) obj2).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            SafeTrace.throwOnFailure(obj);
            CookieManager.getInstance().flush();
            return Unit.INSTANCE;
        }
    }

    public C0313w(C0148d4 c0148d4) {
        c0148d4.getClass();
        this.a = c0148d4;
        this.b = "";
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        String cookie = CookieManager.getInstance().getCookie(str);
        if (cookie == null) {
            cookie = "";
        }
        if (cookie.equals(this.b)) {
            return;
        }
        this.b = cookie;
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        JobKt.launch$default(GlobalScope.INSTANCE, DefaultIoScheduler.INSTANCE, null, new a(null), 2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        webView.getClass();
        webResourceRequest.getClass();
        webResourceResponse.getClass();
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        int statusCode = webResourceResponse.getStatusCode();
        if (400 > statusCode || statusCode >= 500 || statusCode == 408 || statusCode == 404) {
            C0095a6.a.b(C0095a6.a, new C0248o5(C7.a(webResourceResponse)), "onReceivedHttpError");
        } else {
            C0095a6.a.b(C0095a6.a, new C0248o5(C7.a(webResourceResponse)), "onReceivedHttpError");
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        webView.getClass();
        sslErrorHandler.getClass();
        sslError.getClass();
        C0095a6.a.e(C0095a6.a, "onReceivedSslError " + sslError);
    }
}
