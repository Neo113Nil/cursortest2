package androidx.compose.material;

import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
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
public final class AnchoredDraggableKt$animateTo$2 extends SuspendLambda implements Function4 {
    public final /* synthetic */ AnchoredDraggableState $this_animateTo;
    public final /* synthetic */ float $velocity;
    public /* synthetic */ AnchoredDraggableState$anchoredDragScope$1 L$0;
    public /* synthetic */ MapDraggableAnchors L$1;
    public /* synthetic */ Object L$2;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$animateTo$2(AnchoredDraggableState anchoredDraggableState, float f, Continuation continuation) {
        super(4, continuation);
        this.$this_animateTo = anchoredDraggableState;
        this.$velocity = f;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        AnchoredDraggableKt$animateTo$2 anchoredDraggableKt$animateTo$2 = new AnchoredDraggableKt$animateTo$2(this.$this_animateTo, this.$velocity, (Continuation) obj4);
        anchoredDraggableKt$animateTo$2.L$0 = (AnchoredDraggableState$anchoredDragScope$1) obj;
        anchoredDraggableKt$animateTo$2.L$1 = (MapDraggableAnchors) obj2;
        anchoredDraggableKt$animateTo$2.L$2 = obj3;
        return anchoredDraggableKt$animateTo$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$1 = this.L$0;
            float positionOf = this.L$1.positionOf(this.L$2);
            if (!Float.isNaN(positionOf)) {
                Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                AnchoredDraggableState anchoredDraggableState = this.$this_animateTo;
                float floatValue = Float.isNaN(((ParcelableSnapshotMutableFloatState) anchoredDraggableState.offset$delegate).getFloatValue()) ? RecyclerView.DECELERATION_RATE : ((ParcelableSnapshotMutableFloatState) anchoredDraggableState.offset$delegate).getFloatValue();
                ref$FloatRef.element = floatValue;
                AnimationSpec animationSpec = (AnimationSpec) anchoredDraggableState.animationSpec;
                androidx.compose.material3.TextKt$$ExternalSyntheticLambda0 textKt$$ExternalSyntheticLambda0 = new androidx.compose.material3.TextKt$$ExternalSyntheticLambda0(16, anchoredDraggableState$anchoredDragScope$1, ref$FloatRef);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (AnimatableKt.animate(floatValue, positionOf, this.$velocity, animationSpec, textKt$$ExternalSyntheticLambda0, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
