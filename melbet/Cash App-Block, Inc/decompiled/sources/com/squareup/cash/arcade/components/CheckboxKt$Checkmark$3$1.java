package com.squareup.cash.arcade.components;

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
public final class CheckboxKt$Checkmark$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ LottieAnimatable $anim;
    public final /* synthetic */ boolean $checked;
    public final /* synthetic */ LottieCompositionResult $composition$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckboxKt$Checkmark$3$1(boolean z, LottieAnimatable lottieAnimatable, LottieCompositionResult lottieCompositionResult, Continuation continuation) {
        super(2, continuation);
        this.$checked = z;
        this.$anim = lottieAnimatable;
        this.$composition$delegate = lottieCompositionResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckboxKt$Checkmark$3$1(this.$checked, this.$anim, this.$composition$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckboxKt$Checkmark$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        if (com.airbnb.lottie.compose.LottieAnimatable.DefaultImpls.animate$default(r16.$anim, r1, 0, 0, false, androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE, null, androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE, false, null, false, false, r16, 2046, null) == r15) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        if (com.airbnb.lottie.compose.LottieAnimatable.DefaultImpls.snapTo$default(r0, null, androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE, 0, false, r16, 13, null) == r15) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        if (com.airbnb.lottie.compose.LottieAnimatable.DefaultImpls.snapTo$default(r0, null, 1.0f, 0, false, r16, 13, null) == r15) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        LottieCompositionResult lottieCompositionResult = this.$composition$delegate;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            if (((LottieComposition) lottieCompositionResult.getValue()) == null) {
                return Unit.INSTANCE;
            }
            boolean z = this.$checked;
            LottieAnimatable lottieAnimatable = this.$anim;
            if (z) {
                this.label = 1;
            } else {
                this.label = 3;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2 || i == 3) {
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        LottieComposition lottieComposition = (LottieComposition) lottieCompositionResult.getValue();
        this.label = 2;
    }
}
