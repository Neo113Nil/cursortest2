package androidx.compose.material3;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;

/* compiled from: SheetDefaults.kt */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/compose/material3/SheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1", "Landroidx/compose/foundation/gestures/FlingBehavior;", "performFling", "", "Landroidx/compose/foundation/gestures/ScrollScope;", "initialVelocity", "(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "material3"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class SheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1 implements FlingBehavior {
    final /* synthetic */ TargetedFlingBehavior $anchoredDraggableFlingBehavior;
    final /* synthetic */ Density $density;
    final /* synthetic */ Function0<Unit> $onDismissRequest;
    final /* synthetic */ SheetState $state;
    final /* synthetic */ ViewConfiguration $viewConfiguration;

    SheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1(ViewConfiguration viewConfiguration, SheetState sheetState, Density density, TargetedFlingBehavior targetedFlingBehavior, Function0<Unit> function0) {
        this.$viewConfiguration = viewConfiguration;
        this.$state = sheetState;
        this.$density = density;
        this.$anchoredDraggableFlingBehavior = targetedFlingBehavior;
        this.$onDismissRequest = function0;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c8 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // androidx.compose.foundation.gestures.FlingBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object performFling(ScrollScope scrollScope, float f, Continuation<? super Float> continuation) {
        SheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1$performFling$1 sheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1$performFling$1;
        int i;
        try {
            if (continuation instanceof SheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1$performFling$1) {
                sheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1$performFling$1 = (SheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1$performFling$1) continuation;
                if ((sheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1$performFling$1.label & Integer.MIN_VALUE) != 0) {
                    sheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1$performFling$1.label -= Integer.MIN_VALUE;
                    Object obj = sheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1$performFling$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = sheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1$performFling$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        float maximumFlingVelocity = this.$viewConfiguration.getMaximumFlingVelocity();
                        Ref.FloatRef floatRef = new Ref.FloatRef();
                        floatRef.element = RangesKt.coerceIn(f, -maximumFlingVelocity, maximumFlingVelocity);
                        if (floatRef.element > 0.0f && this.$state.getAnchoredDraggableState$material3().getAnchors().hasPositionFor(SheetValue.Hidden)) {
                            float max = Math.max(0.0f, this.$state.getAnchoredDraggableState$material3().getAnchors().positionOf(SheetValue.Hidden) - this.$state.requireOffset());
                            float mo528toPx0680j_4 = this.$density.mo528toPx0680j_4(BottomSheetDefaults.INSTANCE.m2551getBoundaryDampeningZoneD9Ej5fM$material3());
                            if (max < mo528toPx0680j_4) {
                                floatRef.element *= max / mo528toPx0680j_4;
                                float mo528toPx0680j_42 = this.$density.mo528toPx0680j_4(BottomSheetDefaults.INSTANCE.m2556getVelocityThresholdD9Ej5fM$material3());
                                if (f >= mo528toPx0680j_42) {
                                    floatRef.element = Math.max(floatRef.element, mo528toPx0680j_42);
                                }
                            }
                        }
                        TargetedFlingBehavior targetedFlingBehavior = this.$anchoredDraggableFlingBehavior;
                        float f2 = floatRef.element;
                        sheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1$performFling$1.label = 1;
                        obj = targetedFlingBehavior.performFling(scrollScope, f2, sheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1$performFling$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Boxing.boxFloat(((Number) obj).floatValue());
                }
            }
            if (i != 0) {
            }
            return Boxing.boxFloat(((Number) obj).floatValue());
        } finally {
            if (!this.$state.isVisible()) {
                this.$onDismissRequest.invoke();
            }
        }
        sheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1$performFling$1 = new SheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1$performFling$1(this, continuation);
        Object obj2 = sheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1$performFling$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sheetDefaultsKt$BottomSheetImpl$modalBottomSheetFlingBehavior$1$1$performFling$1.label;
    }
}
