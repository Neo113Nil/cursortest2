package com.plaid.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

@DebugMetadata(c = "com.plaid.internal.workflow.webview.WebviewViewModel$trackWebviewFallbackOpen$1", f = "WebviewViewModel.kt", l = {EnumC0170g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class W7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ U7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W7(U7 u7, Continuation<? super W7> continuation) {
        super(2, continuation);
        this.b = u7;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new W7(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new W7(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            I7 i7 = this.b.g;
            if (i7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webviewFallbackAnalytics");
                throw null;
            }
            this.a = 1;
            if (i7.c(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
