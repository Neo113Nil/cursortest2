package com.squareup.cash.arcade.components;

import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimatable;
import com.airbnb.lottie.compose.LottieCompositionResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class CopyCodeKt$CopyCodeAnimation$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ LottieAnimatable $anim;
    public final /* synthetic */ LottieCompositionResult $composition$delegate;
    public final /* synthetic */ CopyCodeState $state;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyCodeKt$CopyCodeAnimation$1$1(CopyCodeState copyCodeState, LottieAnimatable lottieAnimatable, LottieCompositionResult lottieCompositionResult, Continuation continuation) {
        super(2, continuation);
        this.$state = copyCodeState;
        this.$anim = lottieAnimatable;
        this.$composition$delegate = lottieCompositionResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CopyCodeKt$CopyCodeAnimation$1$1(this.$state, this.$anim, this.$composition$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CopyCodeKt$CopyCodeAnimation$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (com.airbnb.lottie.compose.LottieAnimatable.DefaultImpls.snapTo$default(r17.$anim, null, androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE, 0, false, r17, 13, null) == r15) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CopyCodeState copyCodeState;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        LottieCompositionResult lottieCompositionResult = this.$composition$delegate;
        CopyCodeState copyCodeState2 = this.$state;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            if (!((Boolean) copyCodeState2.isAnimating$delegate.getValue()).booleanValue() || ((LottieComposition) lottieCompositionResult.getValue()) == null) {
                return Unit.INSTANCE;
            }
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                copyCodeState = copyCodeState2;
                copyCodeState.isAnimating$delegate.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            }
            SafeTrace.throwOnFailure(obj);
        }
        LottieComposition lottieComposition = (LottieComposition) lottieCompositionResult.getValue();
        this.label = 2;
        if (LottieAnimatable.DefaultImpls.animate$default(this.$anim, lottieComposition, 0, 0, false, RecyclerView.DECELERATION_RATE, null, RecyclerView.DECELERATION_RATE, false, null, false, false, this, 2046, null) != coroutineSingletons) {
            copyCodeState = copyCodeState2;
            copyCodeState.isAnimating$delegate.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
        return coroutineSingletons;
    }
}
