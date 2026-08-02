package com.squareup.cash.blockers.web.delegates;

import android.webkit.WebView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.web.viewmodels.WebBlockerBridgeEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferedChannel;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class WebBlockerWebViewClient$onPageFinished$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ WebView $view;
    public int label;
    public final /* synthetic */ WebBlockerWebViewClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WebBlockerWebViewClient$onPageFinished$1(WebBlockerWebViewClient webBlockerWebViewClient, WebView webView, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = webBlockerWebViewClient;
        this.$view = webView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        WebView webView = this.$view;
        WebBlockerWebViewClient webBlockerWebViewClient = this.this$0;
        switch (i) {
            case 0:
                return new WebBlockerWebViewClient$onPageFinished$1(webBlockerWebViewClient, webView, continuation, 0);
            default:
                return new WebBlockerWebViewClient$onPageFinished$1(webBlockerWebViewClient, webView, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((WebBlockerWebViewClient$onPageFinished$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        WebBlockerWebViewClient webBlockerWebViewClient = this.this$0;
        WebView webView = this.$view;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BufferedChannel bufferedChannel = webBlockerWebViewClient.webEvents;
                    WebBlockerBridgeEvent.NavigationStateUpdated navigationStateUpdated = new WebBlockerBridgeEvent.NavigationStateUpdated(webView.canGoBack(), webView.canGoForward());
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
                    BufferedChannel bufferedChannel2 = webBlockerWebViewClient.webEvents;
                    WebBlockerBridgeEvent.NavigationStateUpdated navigationStateUpdated2 = new WebBlockerBridgeEvent.NavigationStateUpdated(webView.canGoBack(), webView.canGoForward());
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
