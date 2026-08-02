package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.DecayAnimationSpecImpl;
import androidx.compose.material.SliderKt$$ExternalSyntheticLambda8;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Ref$FloatRef;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class AnchoredDraggableKt$animateToWithDecay$2 extends SuspendLambda implements Function4 {
    public final /* synthetic */ DecayAnimationSpecImpl $decayAnimationSpec;
    public final /* synthetic */ Ref$FloatRef $remainingVelocity;
    public final /* synthetic */ AnimationSpec $snapAnimationSpec;
    public final /* synthetic */ AnchoredDraggableState $this_animateToWithDecay;
    public final /* synthetic */ float $velocity;
    public /* synthetic */ AnchoredDraggableState$anchoredDragScope$1 L$0;
    public /* synthetic */ DefaultDraggableAnchors L$1;
    public /* synthetic */ Object L$2;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$animateToWithDecay$2(AnchoredDraggableState anchoredDraggableState, float f, AnimationSpec animationSpec, Ref$FloatRef ref$FloatRef, DecayAnimationSpecImpl decayAnimationSpecImpl, Continuation continuation) {
        super(4, continuation);
        this.$this_animateToWithDecay = anchoredDraggableState;
        this.$velocity = f;
        this.$snapAnimationSpec = animationSpec;
        this.$remainingVelocity = ref$FloatRef;
        this.$decayAnimationSpec = decayAnimationSpecImpl;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Ref$FloatRef ref$FloatRef = this.$remainingVelocity;
        DecayAnimationSpecImpl decayAnimationSpecImpl = this.$decayAnimationSpec;
        AnchoredDraggableKt$animateToWithDecay$2 anchoredDraggableKt$animateToWithDecay$2 = new AnchoredDraggableKt$animateToWithDecay$2(this.$this_animateToWithDecay, this.$velocity, this.$snapAnimationSpec, ref$FloatRef, decayAnimationSpecImpl, (Continuation) obj4);
        anchoredDraggableKt$animateToWithDecay$2.L$0 = (AnchoredDraggableState$anchoredDragScope$1) obj;
        anchoredDraggableKt$animateToWithDecay$2.L$1 = (DefaultDraggableAnchors) obj2;
        anchoredDraggableKt$animateToWithDecay$2.L$2 = obj3;
        return anchoredDraggableKt$animateToWithDecay$2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b4, code lost:
    
        if (androidx.compose.foundation.gestures.Draggable2DKt.access$animateTo(r16.$this_animateToWithDecay, r14, r11, r3, r5, r16.$snapAnimationSpec, r16) == r7) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a1, code lost:
    
        if (androidx.compose.animation.core.AnimatableKt.animateDecay(r1, r0, false, r8, r16) == r7) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ca, code lost:
    
        if (androidx.compose.foundation.gestures.Draggable2DKt.access$animateTo(r16.$this_animateToWithDecay, r15, r11, r3, r5, r16.$snapAnimationSpec, r16) == r7) goto L43;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Ref$FloatRef ref$FloatRef = this.$remainingVelocity;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$1 = this.L$0;
            DefaultDraggableAnchors defaultDraggableAnchors = this.L$1;
            Object obj2 = this.L$2;
            float positionOf = defaultDraggableAnchors.positionOf(obj2);
            if (!Float.isNaN(positionOf)) {
                Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                AnchoredDraggableState anchoredDraggableState = this.$this_animateToWithDecay;
                float floatValue = Float.isNaN(anchoredDraggableState.offset$delegate.getFloatValue()) ? 0.0f : anchoredDraggableState.offset$delegate.getFloatValue();
                ref$FloatRef2.element = floatValue;
                if (floatValue != positionOf) {
                    float f = this.$velocity;
                    if ((positionOf - floatValue) * f < RecyclerView.DECELERATION_RATE || f == RecyclerView.DECELERATION_RATE) {
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 1;
                    } else {
                        DecayAnimationSpecImpl decayAnimationSpecImpl = this.$decayAnimationSpec;
                        float calculateTargetValue = AnimatableKt.calculateTargetValue(decayAnimationSpecImpl, floatValue, f);
                        float f2 = this.$velocity;
                        if (f2 <= RecyclerView.DECELERATION_RATE ? calculateTargetValue > positionOf : calculateTargetValue < positionOf) {
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 3;
                        } else {
                            AnimationState AnimationState$default = AnimatableKt.AnimationState$default(ref$FloatRef2.element, f2, 28);
                            SliderKt$$ExternalSyntheticLambda8 sliderKt$$ExternalSyntheticLambda8 = new SliderKt$$ExternalSyntheticLambda8(positionOf, ref$FloatRef2, anchoredDraggableState$anchoredDragScope$1, ref$FloatRef, 1);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 2;
                        }
                    }
                    return coroutineSingletons;
                }
            }
        } else if (i == 1) {
            SafeTrace.throwOnFailure(obj);
            ref$FloatRef.element = RecyclerView.DECELERATION_RATE;
        } else if (i == 2) {
            SafeTrace.throwOnFailure(obj);
        } else {
            if (i != 3) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
            ref$FloatRef.element = RecyclerView.DECELERATION_RATE;
        }
        return Unit.INSTANCE;
    }
}
