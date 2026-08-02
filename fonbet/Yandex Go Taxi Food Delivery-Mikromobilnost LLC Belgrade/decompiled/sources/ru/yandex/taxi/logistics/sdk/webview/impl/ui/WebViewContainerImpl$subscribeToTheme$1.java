package ru.yandex.taxi.logistics.sdk.webview.impl.ui;

import android.webkit.WebSettings;
import defpackage.hm91;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vj41;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isDark", "Lzy11;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.webview.impl.ui.WebViewContainerImpl$subscribeToTheme$1", f = "WebViewContainer.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class WebViewContainerImpl$subscribeToTheme$1 extends SuspendLambda implements wls {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewContainerImpl$subscribeToTheme$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WebViewContainerImpl$subscribeToTheme$1 webViewContainerImpl$subscribeToTheme$1 = new WebViewContainerImpl$subscribeToTheme$1(this.this$0, continuation);
        webViewContainerImpl$subscribeToTheme$1.Z$0 = ((Boolean) obj).booleanValue();
        return webViewContainerImpl$subscribeToTheme$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        WebViewContainerImpl$subscribeToTheme$1 webViewContainerImpl$subscribeToTheme$1 = (WebViewContainerImpl$subscribeToTheme$1) create(bool, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        webViewContainerImpl$subscribeToTheme$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        WebSettings settings = aVar.b.getSettings();
        if (hm91.d("ALGORITHMIC_DARKENING")) {
            vj41.b(settings, z && aVar.a.a.c);
        }
        return zy11.a;
    }
}
