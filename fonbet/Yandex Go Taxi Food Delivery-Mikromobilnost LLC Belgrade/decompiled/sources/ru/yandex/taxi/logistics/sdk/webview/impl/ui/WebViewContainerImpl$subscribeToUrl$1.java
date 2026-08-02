package ru.yandex.taxi.logistics.sdk.webview.impl.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.rl41;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrl41;", "it", "Lzy11;", "<anonymous>", "(Lrl41;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.webview.impl.ui.WebViewContainerImpl$subscribeToUrl$1", f = "WebViewContainer.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class WebViewContainerImpl$subscribeToUrl$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewContainerImpl$subscribeToUrl$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WebViewContainerImpl$subscribeToUrl$1 webViewContainerImpl$subscribeToUrl$1 = new WebViewContainerImpl$subscribeToUrl$1(this.this$0, continuation);
        webViewContainerImpl$subscribeToUrl$1.L$0 = obj;
        return webViewContainerImpl$subscribeToUrl$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        WebViewContainerImpl$subscribeToUrl$1 webViewContainerImpl$subscribeToUrl$1 = (WebViewContainerImpl$subscribeToUrl$1) create((rl41) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        webViewContainerImpl$subscribeToUrl$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        rl41 rl41Var = (rl41) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        if (rl41Var != null) {
            a aVar = this.this$0;
            aVar.b.loadUrl(rl41Var.a, rl41Var.b);
        }
        return zy11.a;
    }
}
