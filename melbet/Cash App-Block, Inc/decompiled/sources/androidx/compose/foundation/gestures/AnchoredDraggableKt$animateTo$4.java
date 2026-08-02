package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class AnchoredDraggableKt$animateTo$4 extends SuspendLambda implements Function4 {
    public final /* synthetic */ AnimationSpec $animationSpec;
    public final /* synthetic */ AnchoredDraggableState $this_animateTo;
    public /* synthetic */ AnchoredDraggableState$anchoredDragScope$1 L$0;
    public /* synthetic */ DefaultDraggableAnchors L$1;
    public /* synthetic */ Object L$2;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$animateTo$4(AnchoredDraggableState anchoredDraggableState, AnimationSpec animationSpec, Continuation continuation) {
        super(4, continuation);
        this.$this_animateTo = anchoredDraggableState;
        this.$animationSpec = animationSpec;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        AnchoredDraggableKt$animateTo$4 anchoredDraggableKt$animateTo$4 = new AnchoredDraggableKt$animateTo$4(this.$this_animateTo, this.$animationSpec, (Continuation) obj4);
        anchoredDraggableKt$animateTo$4.L$0 = (AnchoredDraggableState$anchoredDragScope$1) obj;
        anchoredDraggableKt$animateTo$4.L$1 = (DefaultDraggableAnchors) obj2;
        anchoredDraggableKt$animateTo$4.L$2 = obj3;
        return anchoredDraggableKt$animateTo$4.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$1 = this.L$0;
            DefaultDraggableAnchors defaultDraggableAnchors = this.L$1;
            Object obj2 = this.L$2;
            AnchoredDraggableState anchoredDraggableState = this.$this_animateTo;
            float floatValue = anchoredDraggableState.lastVelocity$delegate.getFloatValue();
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (Draggable2DKt.access$animateTo(anchoredDraggableState, floatValue, anchoredDraggableState$anchoredDragScope$1, defaultDraggableAnchors, obj2, this.$animationSpec, this) == coroutineSingletons) {
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
