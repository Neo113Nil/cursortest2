package com.plaid.internal;

import com.plaid.internal.F6;
import com.plaid.internal.Y6;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

@DebugMetadata(c = "com.plaid.core.webview.PlaidWebview$submit$1$2$1", f = "PlaidWebview.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class W5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ P5 a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W5(P5 p5, String str, Continuation<? super W5> continuation) {
        super(2, continuation);
        this.a = p5;
        this.b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new W5(this.a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new W5(this.a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        if (this.a.a().get()) {
            Y6.a.a("Webview is destroyed, cannot submit data");
            return Unit.INSTANCE;
        }
        this.a.loadUrl("javascript:window.SdkJsBridge.send('" + this.b + "')");
        F6.a.a("JSBridge - sent submit");
        return Unit.INSTANCE;
    }
}
