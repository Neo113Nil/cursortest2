package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.material3.SliderState$dragScope$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$FloatRef;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class SliderKt$animateToTarget$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ float $current;
    public final /* synthetic */ float $target;
    public final /* synthetic */ float $velocity;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$animateToTarget$2(float f, float f2, float f3, Continuation continuation) {
        super(2, continuation);
        this.$current = f;
        this.$target = f2;
        this.$velocity = f3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SliderKt$animateToTarget$2 sliderKt$animateToTarget$2 = new SliderKt$animateToTarget$2(this.$current, this.$target, this.$velocity, continuation);
        sliderKt$animateToTarget$2.L$0 = obj;
        return sliderKt$animateToTarget$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SliderKt$animateToTarget$2) create((SliderState$dragScope$1) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            SliderState$dragScope$1 sliderState$dragScope$1 = (SliderState$dragScope$1) this.L$0;
            Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
            float f = this.$current;
            ref$FloatRef.element = f;
            Animatable Animatable = AnimatableKt.Animatable(f, 0.01f);
            Float f2 = new Float(this.$target);
            TweenSpec tweenSpec = SliderKt.SliderToTickAnimation;
            Float f3 = new Float(this.$velocity);
            SliderKt$animateToTarget$2$$ExternalSyntheticLambda0 sliderKt$animateToTarget$2$$ExternalSyntheticLambda0 = new SliderKt$animateToTarget$2$$ExternalSyntheticLambda0(sliderState$dragScope$1, ref$FloatRef, 0);
            this.label = 1;
            if (Animatable.animateTo(f2, tweenSpec, f3, sliderKt$animateToTarget$2$$ExternalSyntheticLambda0, this) == coroutineSingletons) {
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
