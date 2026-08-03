package androidx.compose.material3;

import androidx.compose.foundation.gestures.AnchoredDragScope;
import androidx.compose.foundation.gestures.DraggableAnchors;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;

/* compiled from: SheetDefaults.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/AnchoredDragScope;", "it", "Landroidx/compose/foundation/gestures/DraggableAnchors;", "Landroidx/compose/material3/SheetValue;"}, k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(c = "androidx.compose.material3.SheetState$anchoredDrag$2", f = "SheetDefaults.kt", i = {}, l = {673}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class SheetState$anchoredDrag$2 extends SuspendLambda implements Function3<AnchoredDragScope, DraggableAnchors<SheetValue>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.FloatRef $consumedVelocity;
    final /* synthetic */ FlingBehavior $flingBehavior;
    final /* synthetic */ float $initialVelocity;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SheetState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SheetState$anchoredDrag$2(Ref.FloatRef floatRef, FlingBehavior flingBehavior, SheetState sheetState, float f, Continuation<? super SheetState$anchoredDrag$2> continuation) {
        super(3, continuation);
        this.$consumedVelocity = floatRef;
        this.$flingBehavior = flingBehavior;
        this.this$0 = sheetState;
        this.$initialVelocity = f;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<SheetValue> draggableAnchors, Continuation<? super Unit> continuation) {
        SheetState$anchoredDrag$2 sheetState$anchoredDrag$2 = new SheetState$anchoredDrag$2(this.$consumedVelocity, this.$flingBehavior, this.this$0, this.$initialVelocity, continuation);
        sheetState$anchoredDrag$2.L$0 = anchoredDragScope;
        return sheetState$anchoredDrag$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref.FloatRef floatRef;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final AnchoredDragScope anchoredDragScope = (AnchoredDragScope) this.L$0;
            final SheetState sheetState = this.this$0;
            ScrollScope scrollScope = new ScrollScope() { // from class: androidx.compose.material3.SheetState$anchoredDrag$2$scrollScope$1
                @Override // androidx.compose.foundation.gestures.ScrollScope
                public float scrollBy(float pixels) {
                    float newOffsetForDelta$material3 = SheetState.this.newOffsetForDelta$material3(pixels);
                    float offset$material3 = newOffsetForDelta$material3 - SheetState.this.getOffset$material3();
                    AnchoredDragScope.CC.dragTo$default(anchoredDragScope, newOffsetForDelta$material3, 0.0f, 2, null);
                    return offset$material3;
                }
            };
            Ref.FloatRef floatRef2 = this.$consumedVelocity;
            FlingBehavior flingBehavior = this.$flingBehavior;
            float f = this.$initialVelocity;
            this.L$0 = floatRef2;
            this.label = 1;
            Object performFling = flingBehavior.performFling(scrollScope, f, this);
            if (performFling == coroutine_suspended) {
                return coroutine_suspended;
            }
            floatRef = floatRef2;
            obj = performFling;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floatRef = (Ref.FloatRef) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        floatRef.element = ((Number) obj).floatValue();
        return Unit.INSTANCE;
    }
}
