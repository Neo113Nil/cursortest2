package com.airbnb.lottie.compose;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.airbnb.lottie.LottieComposition;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3", f = "animateLottieCompositionAsState.kt", l = {73, 78}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ float $actualSpeed;
    final /* synthetic */ LottieAnimatable $animatable;
    final /* synthetic */ LottieCancellationBehavior $cancellationBehavior;
    final /* synthetic */ LottieClipSpec $clipSpec;
    final /* synthetic */ LottieComposition $composition;
    final /* synthetic */ boolean $isPlaying;
    final /* synthetic */ int $iterations;
    final /* synthetic */ boolean $restartOnPlay;
    final /* synthetic */ boolean $reverseOnRepeat;
    final /* synthetic */ boolean $useCompositionFrameRate;
    final /* synthetic */ MutableState $wasPlaying$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3(boolean z, boolean z2, LottieAnimatable lottieAnimatable, LottieComposition lottieComposition, int i, boolean z3, float f, LottieClipSpec lottieClipSpec, LottieCancellationBehavior lottieCancellationBehavior, boolean z4, MutableState mutableState, Continuation<? super AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3> continuation) {
        super(2, continuation);
        this.$isPlaying = z;
        this.$restartOnPlay = z2;
        this.$animatable = lottieAnimatable;
        this.$composition = lottieComposition;
        this.$iterations = i;
        this.$reverseOnRepeat = z3;
        this.$actualSpeed = f;
        this.$clipSpec = lottieClipSpec;
        this.$cancellationBehavior = lottieCancellationBehavior;
        this.$useCompositionFrameRate = z4;
        this.$wasPlaying$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3(this.$isPlaying, this.$restartOnPlay, this.$animatable, this.$composition, this.$iterations, this.$reverseOnRepeat, this.$actualSpeed, this.$clipSpec, this.$cancellationBehavior, this.$useCompositionFrameRate, this.$wasPlaying$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        if (com.airbnb.lottie.compose.LottieAnimatable.DefaultImpls.animate$default(r0, r2, 0, r3, r4, r5, r6, r7, false, r9, false, r11, r16, 514, null) == r15) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0038, code lost:
    
        if (com.airbnb.lottie.compose.LottieAnimatableKt.resetToBeginning(r0, r16) == r15) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean animateLottieCompositionAsState$lambda$3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            if (this.$isPlaying) {
                animateLottieCompositionAsState$lambda$3 = AnimateLottieCompositionAsStateKt.animateLottieCompositionAsState$lambda$3(this.$wasPlaying$delegate);
                if (!animateLottieCompositionAsState$lambda$3 && this.$restartOnPlay) {
                    LottieAnimatable lottieAnimatable = this.$animatable;
                    this.label = 1;
                }
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    SafeTrace.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        AnimateLottieCompositionAsStateKt.animateLottieCompositionAsState$lambda$4(this.$wasPlaying$delegate, this.$isPlaying);
        if (!this.$isPlaying) {
            return Unit.INSTANCE;
        }
        LottieAnimatable lottieAnimatable2 = this.$animatable;
        LottieComposition lottieComposition = this.$composition;
        int i2 = this.$iterations;
        boolean z = this.$reverseOnRepeat;
        float f = this.$actualSpeed;
        LottieClipSpec lottieClipSpec = this.$clipSpec;
        float progress = lottieAnimatable2.getProgress();
        LottieCancellationBehavior lottieCancellationBehavior = this.$cancellationBehavior;
        boolean z2 = this.$useCompositionFrameRate;
        this.label = 2;
    }
}
