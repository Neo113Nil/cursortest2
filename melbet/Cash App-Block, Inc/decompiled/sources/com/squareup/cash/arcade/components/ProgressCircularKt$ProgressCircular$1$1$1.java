package com.squareup.cash.arcade.components;

import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimatable;
import com.airbnb.lottie.compose.LottieCancellationBehavior;
import com.airbnb.lottie.compose.LottieCompositionResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class ProgressCircularKt$ProgressCircular$1$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ LottieAnimatable $anim;
    public final /* synthetic */ LottieCompositionResult $composition$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressCircularKt$ProgressCircular$1$1$1(LottieAnimatable lottieAnimatable, LottieCompositionResult lottieCompositionResult, Continuation continuation) {
        super(2, continuation);
        this.$anim = lottieAnimatable;
        this.$composition$delegate = lottieCompositionResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProgressCircularKt$ProgressCircular$1$1$1(this.$anim, this.$composition$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProgressCircularKt$ProgressCircular$1$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            String[] strArr = ProgressCircularKt.AllKeyPaths;
            LottieComposition lottieComposition = (LottieComposition) this.$composition$delegate.getValue();
            LottieCancellationBehavior lottieCancellationBehavior = LottieCancellationBehavior.OnIterationFinish;
            this.label = 1;
            if (LottieAnimatable.DefaultImpls.animate$default(this.$anim, lottieComposition, 0, Integer.MAX_VALUE, false, 1.0f, null, RecyclerView.DECELERATION_RATE, false, lottieCancellationBehavior, false, false, this, 1738, null) == coroutineSingletons) {
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
