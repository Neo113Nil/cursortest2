package androidx.compose.material3.internal;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.material3.WavyProgressIndicatorKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LinearWavyProgressModifiers.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(c = "androidx.compose.material3.internal.BaseLinearWavyProgressNode$updateAmplitudeAnimation$1", f = "LinearWavyProgressModifiers.kt", i = {}, l = {347}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class BaseLinearWavyProgressNode$updateAmplitudeAnimation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $currentAmplitudeAnimatable;
    final /* synthetic */ float $targetAmplitudePx;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseLinearWavyProgressNode$updateAmplitudeAnimation$1(Animatable<Float, AnimationVector1D> animatable, float f, Continuation<? super BaseLinearWavyProgressNode$updateAmplitudeAnimation$1> continuation) {
        super(2, continuation);
        this.$currentAmplitudeAnimatable = animatable;
        this.$targetAmplitudePx = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseLinearWavyProgressNode$updateAmplitudeAnimation$1(this.$currentAmplitudeAnimatable, this.$targetAmplitudePx, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseLinearWavyProgressNode$updateAmplitudeAnimation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AnimationSpec<Float> decreasingAmplitudeAnimationSpec;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Animatable<Float, AnimationVector1D> animatable = this.$currentAmplitudeAnimatable;
            Float boxFloat = Boxing.boxFloat(this.$targetAmplitudePx);
            if (this.$currentAmplitudeAnimatable.getValue().floatValue() < this.$targetAmplitudePx) {
                decreasingAmplitudeAnimationSpec = WavyProgressIndicatorKt.getIncreasingAmplitudeAnimationSpec();
            } else {
                decreasingAmplitudeAnimationSpec = WavyProgressIndicatorKt.getDecreasingAmplitudeAnimationSpec();
            }
            this.label = 1;
            if (Animatable.animateTo$default(animatable, boxFloat, decreasingAmplitudeAnimationSpec, null, null, this, 12, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
