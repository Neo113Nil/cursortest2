package com.squareup.cash.sheet;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.DefaultDraggableAnchors;
import androidx.compose.foundation.gestures.Draggable2DKt;
import androidx.compose.material.SliderKt$$ExternalSyntheticLambda5;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.sheet.RealSheetState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes7.dex */
public final /* synthetic */ class RealSheetState$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealSheetState f$0;

    public /* synthetic */ RealSheetState$$ExternalSyntheticLambda1(RealSheetState realSheetState, int i) {
        this.$r8$classId = i;
        this.f$0 = realSheetState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Float f;
        float f2;
        SpringSpec springSpec;
        Integer num;
        float floatValue;
        int i = this.$r8$classId;
        boolean z = false;
        float f3 = RecyclerView.DECELERATION_RATE;
        RealSheetState realSheetState = this.f$0;
        switch (i) {
            case 0:
                Density density = realSheetState.density;
                if (density != null) {
                    return Float.valueOf(density.mo236toPx0680j_4(100.0f));
                }
                Intrinsics.throwUninitializedPropertyAccessException("density");
                throw null;
            case 1:
                return realSheetState.getSettledPosition();
            case 2:
                return realSheetState.getSettledPosition();
            case 3:
                return realSheetState.getSettledPosition();
            case 4:
                return realSheetState.getSettledPosition();
            case 5:
                return realSheetState.getSettledPosition();
            case 6:
                Boolean bool = (Boolean) realSheetState.dismissedWhenDraggingDisabled$delegate.getValue();
                bool.getClass();
                return bool;
            case 7:
                return realSheetState.draggableState.getAnchors();
            case 8:
                return Float.valueOf(realSheetState.draggableState.offset$delegate.getFloatValue());
            case 9:
                RealSheetState realSheetState2 = this.f$0;
                Integer num2 = (Integer) realSheetState2.contentHeightPx$delegate.getValue();
                if (num2 == null || num2.intValue() <= 0) {
                    return null;
                }
                float intValue = num2.intValue();
                Float f4 = (Float) realSheetState2.peekHeightPx$delegate.getValue();
                if (f4 != null) {
                    float floatValue2 = f4.floatValue();
                    if (realSheetState2.getPeekPosition() != null) {
                        SheetPeekPosition$FixedHeight peekPosition = realSheetState2.getPeekPosition();
                        peekPosition.getClass();
                        if (peekPosition.enableExperimentalImePeekHeight) {
                            if (realSheetState2.getPeekPosition() != null) {
                                SheetPeekPosition$FixedHeight peekPosition2 = realSheetState2.getPeekPosition();
                                peekPosition2.getClass();
                                if (peekPosition2.allowContentExpansion && num2.intValue() > floatValue2) {
                                    floatValue2 = num2.intValue();
                                }
                            }
                            f2 = (intValue - floatValue2) - ((Number) realSheetState2.imeHeightPx$delegate.getValue()).intValue();
                            f = Float.valueOf(f2);
                        }
                    }
                    f2 = intValue - floatValue2;
                    f = Float.valueOf(f2);
                } else {
                    f = null;
                }
                return Draggable2DKt.DraggableAnchors(new SliderKt$$ExternalSyntheticLambda5(realSheetState2.disallowPeekingAfterExpanding && realSheetState2.draggableState.settledValue$delegate.getValue() == SheetPosition.Expanded, f, intValue, ((Integer) realSheetState2.collapsedHeightPx$delegate.getValue()) != null ? Float.valueOf(intValue - r14.intValue()) : null, realSheetState2, 1));
            case 10:
                if (RealSheetState.WhenMappings.$EnumSwitchMapping$0[((SheetPosition) realSheetState.draggableState.targetValue$delegate.getValue()).ordinal()] == 1) {
                    springSpec = realSheetState.exitAnimationSpec;
                    if (springSpec == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("exitAnimationSpec");
                        throw null;
                    }
                } else {
                    springSpec = realSheetState.enterAnimationSpec;
                    if (springSpec == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("enterAnimationSpec");
                        throw null;
                    }
                }
                return springSpec;
            case 11:
                SheetPeekPosition$FixedHeight peekPosition3 = realSheetState.getPeekPosition();
                if (peekPosition3 == null) {
                    return null;
                }
                Density density2 = realSheetState.density;
                if (density2 != null) {
                    return Float.valueOf(density2.mo236toPx0680j_4(peekPosition3.value));
                }
                Intrinsics.throwUninitializedPropertyAccessException("density");
                throw null;
            case 12:
                if (RealSheetStateKt.getOffsetOrNull(realSheetState.draggableState) != null && ((Offset) realSheetState.contentPositionInWindow$delegate.getValue()) != null && (num = (Integer) realSheetState.contentHeightPx$delegate.getValue()) != null && num.intValue() > 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 13:
                AnchoredDraggableState anchoredDraggableState = realSheetState.draggableState;
                DefaultDraggableAnchors anchors = anchoredDraggableState.getAnchors();
                SheetPosition sheetPosition = SheetPosition.Peeking;
                if (!anchors.hasPositionFor(sheetPosition)) {
                    sheetPosition = SheetPosition.Hidden;
                    if (!anchors.hasPositionFor(sheetPosition)) {
                        sheetPosition = SheetPosition.Collapsed;
                        if (!anchors.hasPositionFor(sheetPosition)) {
                            sheetPosition = SheetPosition.Expanded;
                        }
                    }
                }
                SheetPosition sheetPosition2 = SheetPosition.Expanded;
                if (realSheetState.isReadyToBeDisplayed()) {
                    f3 = anchoredDraggableState.progress(sheetPosition, sheetPosition2);
                }
                return Float.valueOf(f3);
            case 14:
                return Float.valueOf(1.0f - realSheetState.getCollapsedContentProgress());
            case 15:
                AnchoredDraggableState anchoredDraggableState2 = realSheetState.draggableState;
                DefaultDraggableAnchors anchors2 = anchoredDraggableState2.getAnchors();
                Float positionOfOrNull = RealSheetState.positionOfOrNull(anchors2, SheetPosition.Collapsed);
                if (positionOfOrNull != null) {
                    float floatValue3 = positionOfOrNull.floatValue();
                    Float positionOfOrNull2 = RealSheetState.positionOfOrNull(anchors2, SheetPosition.Peeking);
                    if (positionOfOrNull2 != null) {
                        floatValue = positionOfOrNull2.floatValue();
                    } else {
                        Float positionOfOrNull3 = RealSheetState.positionOfOrNull(anchors2, SheetPosition.Expanded);
                        if (positionOfOrNull3 != null) {
                            floatValue = positionOfOrNull3.floatValue();
                        }
                    }
                    Float offsetOrNull = RealSheetStateKt.getOffsetOrNull(anchoredDraggableState2);
                    if (offsetOrNull != null) {
                        f3 = RangesKt___RangesKt.coerceIn((offsetOrNull.floatValue() - floatValue) / (floatValue3 - floatValue), RecyclerView.DECELERATION_RATE, 1.0f);
                    }
                }
                return Float.valueOf(f3);
            case 16:
                return Boolean.valueOf(realSheetState.isReadyToBeDisplayed());
            case 17:
                return (Float) realSheetState.peekHeightPx$delegate.getValue();
            default:
                return realSheetState.draggableState.getAnchors();
        }
    }
}
