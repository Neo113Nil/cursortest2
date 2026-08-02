package com.airbnb.lottie.compose;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import papa.SafeTrace;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$1", f = "rememberLottieComposition.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class RememberLottieCompositionKt$rememberLottieComposition$1 extends SuspendLambda implements Function3 {
    int label;

    public RememberLottieCompositionKt$rememberLottieComposition$1(Continuation<? super RememberLottieCompositionKt$rememberLottieComposition$1> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke(((Number) obj).intValue(), (Throwable) obj2, (Continuation<? super Boolean>) obj3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            SafeTrace.throwOnFailure(obj);
            return Boolean.FALSE;
        }
        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    public final Object invoke(int i, Throwable th, Continuation<? super Boolean> continuation) {
        return new RememberLottieCompositionKt$rememberLottieComposition$1(continuation).invokeSuspend(Unit.INSTANCE);
    }
}
