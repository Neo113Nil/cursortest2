package com.squareup.cash.payments.views.coreflowsheet;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.DefaultDraggableAnchors;
import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.moneybot.views.plugins.SlottedCardKt$$ExternalSyntheticLambda4;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowRealSheetState;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final /* synthetic */ class CoreFlowRealSheetState$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CoreFlowRealSheetState f$0;

    public /* synthetic */ CoreFlowRealSheetState$$ExternalSyntheticLambda1(CoreFlowRealSheetState coreFlowRealSheetState, int i) {
        this.$r8$classId = i;
        this.f$0 = coreFlowRealSheetState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Integer num;
        int i = this.$r8$classId;
        CoreFlowRealSheetState coreFlowRealSheetState = this.f$0;
        switch (i) {
            case 0:
                Density density = coreFlowRealSheetState.density;
                if (density != null) {
                    return Float.valueOf(density.mo236toPx0680j_4(100.0f));
                }
                Intrinsics.throwUninitializedPropertyAccessException("density");
                throw null;
            case 1:
                Boolean bool = (Boolean) coreFlowRealSheetState.dismissedWhenDraggingDisabled$delegate.getValue();
                bool.getClass();
                return bool;
            case 2:
                return coreFlowRealSheetState.draggableState.getAnchors();
            case 3:
                return Float.valueOf(coreFlowRealSheetState.draggableState.offset$delegate.getFloatValue());
            case 4:
                Integer num2 = (Integer) coreFlowRealSheetState.contentHeightPx$delegate.getValue();
                if (num2 == null || num2.intValue() <= 0) {
                    return null;
                }
                float intValue = num2.intValue();
                Float f = (Float) coreFlowRealSheetState.peekHeightPx$delegate.getValue();
                return Draggable2DKt.DraggableAnchors(new SlottedCardKt$$ExternalSyntheticLambda4(r2, f != null ? Float.valueOf(intValue - f.floatValue()) : null, intValue, coreFlowRealSheetState));
            case 5:
                if (CoreFlowRealSheetState.WhenMappings.$EnumSwitchMapping$0[((CoreFlowSheetPosition) coreFlowRealSheetState.draggableState.targetValue$delegate.getValue()).ordinal()] != 1) {
                    return coreFlowRealSheetState.enterAnimationSpec$views();
                }
                SpringSpec springSpec = coreFlowRealSheetState.exitAnimationSpec;
                if (springSpec != null) {
                    return springSpec;
                }
                Intrinsics.throwUninitializedPropertyAccessException("exitAnimationSpec");
                throw null;
            case 6:
                return Boolean.valueOf(((Number) coreFlowRealSheetState.imeHeightPx$delegate.getValue()).intValue() > ((Number) coreFlowRealSheetState.imeStableHeightPx$delegate.getValue()).intValue());
            case 7:
                CoreFlowSheetPeekPosition$FixedHeight coreFlowSheetPeekPosition$FixedHeight = (CoreFlowSheetPeekPosition$FixedHeight) coreFlowRealSheetState.peekPosition$delegate.getValue();
                if (coreFlowSheetPeekPosition$FixedHeight == null) {
                    return null;
                }
                Density density2 = coreFlowRealSheetState.density;
                if (density2 != null) {
                    return Float.valueOf(density2.mo236toPx0680j_4(coreFlowSheetPeekPosition$FixedHeight.value));
                }
                Intrinsics.throwUninitializedPropertyAccessException("density");
                throw null;
            case 8:
                AnchoredDraggableState anchoredDraggableState = coreFlowRealSheetState.draggableState;
                anchoredDraggableState.getClass();
                float floatValue = anchoredDraggableState.offset$delegate.getFloatValue();
                if ((Math.abs(floatValue) <= Float.MAX_VALUE ? Float.valueOf(floatValue) : null) != null && ((Offset) coreFlowRealSheetState.contentPositionInWindow$delegate.getValue()) != null && (num = (Integer) coreFlowRealSheetState.contentHeightPx$delegate.getValue()) != null && num.intValue() > 0) {
                    r2 = true;
                }
                return Boolean.valueOf(r2);
            case 9:
                AnchoredDraggableState anchoredDraggableState2 = coreFlowRealSheetState.draggableState;
                DefaultDraggableAnchors anchors = anchoredDraggableState2.getAnchors();
                CoreFlowSheetPosition coreFlowSheetPosition = CoreFlowSheetPosition.Peeking;
                if (!anchors.hasPositionFor(coreFlowSheetPosition)) {
                    coreFlowSheetPosition = CoreFlowSheetPosition.Hidden;
                }
                return Float.valueOf(coreFlowRealSheetState.isReadyToBeDisplayed() ? anchoredDraggableState2.progress(coreFlowSheetPosition, CoreFlowSheetPosition.Expanded) : RecyclerView.DECELERATION_RATE);
            case 10:
                return Boolean.valueOf(coreFlowRealSheetState.isReadyToBeDisplayed());
            case 11:
                Integer valueOf = Integer.valueOf(((Number) coreFlowRealSheetState.imeHeightPx$delegate.getValue()).intValue());
                Boolean bool2 = (Boolean) coreFlowRealSheetState.suppressAutoImeExpansion$delegate.getValue();
                bool2.getClass();
                return new Pair(valueOf, bool2);
            default:
                return Integer.valueOf(((Number) coreFlowRealSheetState.imeHeightPx$delegate.getValue()).intValue());
        }
    }
}
