package androidx.compose.material;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.ui.Modifier;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class SliderKt$Slider$2$gestureEndAction$1$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ float $current;
    public final /* synthetic */ SliderDraggableState $draggableState;
    public final /* synthetic */ Function0 $onValueChangeFinished;
    public final /* synthetic */ float $target;
    public final /* synthetic */ float $velocity;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$Slider$2$gestureEndAction$1$1$1(SliderDraggableState sliderDraggableState, float f, float f2, float f3, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.$draggableState = sliderDraggableState;
        this.$current = f;
        this.$target = f2;
        this.$velocity = f3;
        this.$onValueChangeFinished = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SliderKt$Slider$2$gestureEndAction$1$1$1(this.$draggableState, this.$current, this.$target, this.$velocity, this.$onValueChangeFinished, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SliderKt$Slider$2$gestureEndAction$1$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            this.label = 1;
            Modifier modifier = SliderKt.DefaultSliderConstraints;
            SliderKt$animateToTarget$2 sliderKt$animateToTarget$2 = new SliderKt$animateToTarget$2(this.$current, this.$target, this.$velocity, null);
            Object drag = this.$draggableState.drag(MutatePriority.Default, sliderKt$animateToTarget$2, this);
            if (drag != coroutineSingletons) {
                drag = Unit.INSTANCE;
            }
            if (drag == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        Function0 function0 = this.$onValueChangeFinished;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
