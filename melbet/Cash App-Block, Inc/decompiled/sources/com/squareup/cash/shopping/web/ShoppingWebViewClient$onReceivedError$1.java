package com.squareup.cash.shopping.web;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.shopping.viewmodels.ShoppingWebBridgeEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferedChannel;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class ShoppingWebViewClient$onReceivedError$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String $error;
    public final /* synthetic */ Integer $errorCode;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ WebResourceRequest $request;
    public final /* synthetic */ WebView $view;
    public int label;
    public final /* synthetic */ ShoppingWebViewClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShoppingWebViewClient$onReceivedError$1(WebResourceRequest webResourceRequest, ShoppingWebViewClient shoppingWebViewClient, String str, Integer num, WebView webView, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$request = webResourceRequest;
        this.this$0 = shoppingWebViewClient;
        this.$error = str;
        this.$errorCode = num;
        this.$view = webView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new ShoppingWebViewClient$onReceivedError$1(this.$request, this.this$0, this.$error, this.$errorCode, this.$view, continuation, 0);
            default:
                return new ShoppingWebViewClient$onReceivedError$1(this.$request, this.this$0, this.$error, this.$errorCode, this.$view, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((ShoppingWebViewClient$onReceivedError$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        WebView webView = this.$view;
        ShoppingWebViewClient shoppingWebViewClient = this.this$0;
        WebResourceRequest webResourceRequest = this.$request;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                        BufferedChannel bufferedChannel = shoppingWebViewClient.shoppingWebBridge.webEvents;
                        ShoppingWebBridgeEvent.NavigationFailed navigationFailed = new ShoppingWebBridgeEvent.NavigationFailed(this.$error, null, this.$errorCode, webView.getUrl(), webResourceRequest.isForMainFrame());
                        this.label = 1;
                        if (bufferedChannel.send(navigationFailed, this) == coroutineSingletons) {
                            break;
                        }
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                        BufferedChannel bufferedChannel2 = shoppingWebViewClient.shoppingWebBridge.webEvents;
                        ShoppingWebBridgeEvent.NavigationFailed navigationFailed2 = new ShoppingWebBridgeEvent.NavigationFailed(this.$error, this.$errorCode, null, webView.getUrl(), webResourceRequest.isForMainFrame());
                        this.label = 1;
                        if (bufferedChannel2.send(navigationFailed2, this) == coroutineSingletons2) {
                            break;
                        }
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
