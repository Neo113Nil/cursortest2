package androidx.compose.foundation.gestures;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$FloatRef;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class AnchoredDraggableNode$fling$2 extends SuspendLambda implements Function3 {
    public final /* synthetic */ Ref$FloatRef $leftoverVelocity;
    public final /* synthetic */ float $velocity;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AnchoredDraggableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableNode$fling$2(AnchoredDraggableNode anchoredDraggableNode, Ref$FloatRef ref$FloatRef, float f, Continuation continuation) {
        super(3, continuation);
        this.this$0 = anchoredDraggableNode;
        this.$leftoverVelocity = ref$FloatRef;
        this.$velocity = f;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Ref$FloatRef ref$FloatRef = this.$leftoverVelocity;
        float f = this.$velocity;
        AnchoredDraggableNode$fling$2 anchoredDraggableNode$fling$2 = new AnchoredDraggableNode$fling$2(this.this$0, ref$FloatRef, f, (Continuation) obj3);
        anchoredDraggableNode$fling$2.L$0 = (AnchoredDraggableState$anchoredDragScope$1) obj;
        return anchoredDraggableNode$fling$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$FloatRef ref$FloatRef;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$1 = (AnchoredDraggableState$anchoredDragScope$1) this.L$0;
            AnchoredDraggableNode anchoredDraggableNode = this.this$0;
            AnchoredDraggableNode$fling$2$scrollScope$1 anchoredDraggableNode$fling$2$scrollScope$1 = new AnchoredDraggableNode$fling$2$scrollScope$1(0, anchoredDraggableNode, anchoredDraggableState$anchoredDragScope$1);
            FlingBehavior flingBehavior = anchoredDraggableNode.resolvedFlingBehavior;
            if (flingBehavior == null) {
                Intrinsics.throwUninitializedPropertyAccessException("resolvedFlingBehavior");
                throw null;
            }
            Ref$FloatRef ref$FloatRef2 = this.$leftoverVelocity;
            this.L$0 = ref$FloatRef2;
            this.label = 1;
            obj = flingBehavior.performFling(anchoredDraggableNode$fling$2$scrollScope$1, this.$velocity, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            ref$FloatRef = ref$FloatRef2;
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$FloatRef = (Ref$FloatRef) this.L$0;
            SafeTrace.throwOnFailure(obj);
        }
        ref$FloatRef.element = ((Number) obj).floatValue();
        return Unit.INSTANCE;
    }
}
