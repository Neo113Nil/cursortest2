package com.squareup.cash.shopping.web;

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
public final class ShoppingWebViewClient$onPageFinished$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String $url;
    public final /* synthetic */ WebView $view;
    public int label;
    public final /* synthetic */ ShoppingWebViewClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShoppingWebViewClient$onPageFinished$1(ShoppingWebViewClient shoppingWebViewClient, WebView webView, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = shoppingWebViewClient;
        this.$view = webView;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new ShoppingWebViewClient$onPageFinished$1(this.this$0, this.$view, this.$url, continuation, 0);
            default:
                return new ShoppingWebViewClient$onPageFinished$1(this.this$0, this.$view, this.$url, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((ShoppingWebViewClient$onPageFinished$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        String str = this.$url;
        ShoppingWebViewClient shoppingWebViewClient = this.this$0;
        WebView webView = this.$view;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BufferedChannel bufferedChannel = shoppingWebViewClient.shoppingWebBridge.webEvents;
                    ShoppingWebBridgeEvent.NavigationStateUpdated navigationStateUpdated = new ShoppingWebBridgeEvent.NavigationStateUpdated(webView.canGoBack(), webView.canGoForward(), true, str);
                    this.label = 1;
                    if (bufferedChannel.send(navigationStateUpdated, this) == coroutineSingletons) {
                        break;
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
                    BufferedChannel bufferedChannel2 = shoppingWebViewClient.shoppingWebBridge.webEvents;
                    ShoppingWebBridgeEvent.NavigationStateUpdated navigationStateUpdated2 = new ShoppingWebBridgeEvent.NavigationStateUpdated(webView.canGoBack(), webView.canGoForward(), false, str);
                    this.label = 1;
                    if (bufferedChannel2.send(navigationStateUpdated2, this) == coroutineSingletons2) {
                        break;
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
