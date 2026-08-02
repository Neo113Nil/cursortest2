package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class SliderKt$Slider$2$drag$1$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ MutableState $gestureEndAction;
    public /* synthetic */ float F$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$Slider$2$drag$1$1(MutableState mutableState, Continuation continuation) {
        super(3, continuation);
        this.$gestureEndAction = mutableState;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float floatValue = ((Number) obj2).floatValue();
        SliderKt$Slider$2$drag$1$1 sliderKt$Slider$2$drag$1$1 = new SliderKt$Slider$2$drag$1$1(this.$gestureEndAction, (Continuation) obj3);
        sliderKt$Slider$2$drag$1$1.F$0 = floatValue;
        return sliderKt$Slider$2$drag$1$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        ((Function1) this.$gestureEndAction.getValue()).invoke(new Float(this.F$0));
        return Unit.INSTANCE;
    }
}
