package com.squareup.cash.offers.views.sup;

import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final /* synthetic */ class OffersNotificationKt$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AnchoredDraggableState f$0;

    public /* synthetic */ OffersNotificationKt$$ExternalSyntheticLambda3(AnchoredDraggableState anchoredDraggableState, int i) {
        this.$r8$classId = i;
        this.f$0 = anchoredDraggableState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:
    
        if (r4 > 0.999999f) goto L30;
     */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        float f;
        int i = this.$r8$classId;
        boolean z = false;
        AnchoredDraggableState anchoredDraggableState = this.f$0;
        switch (i) {
            case 0:
                if (!anchoredDraggableState.isAnimationRunning() && anchoredDraggableState.currentValue$delegate.getValue() == SwipeState.UP) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                Object value = anchoredDraggableState.dragTarget$delegate.getValue();
                if (value != null) {
                    return value;
                }
                float floatValue = anchoredDraggableState.offset$delegate.getFloatValue();
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = anchoredDraggableState.currentValue$delegate;
                if (Float.isNaN(floatValue)) {
                    return parcelableSnapshotMutableState.getValue();
                }
                float positionOf = anchoredDraggableState.getAnchors().positionOf(parcelableSnapshotMutableState.getValue());
                if (Float.isNaN(positionOf) || floatValue == positionOf) {
                    return parcelableSnapshotMutableState.getValue();
                }
                Object closestAnchor = anchoredDraggableState.getAnchors().closestAnchor(floatValue);
                return closestAnchor == null ? parcelableSnapshotMutableState.getValue() : closestAnchor;
            case 2:
                float positionOf2 = anchoredDraggableState.getAnchors().positionOf(anchoredDraggableState.settledValue$delegate.getValue());
                float positionOf3 = anchoredDraggableState.getAnchors().positionOf(anchoredDraggableState.targetValue$delegate.getValue()) - positionOf2;
                float abs = Math.abs(positionOf3);
                if (!Float.isNaN(abs) && abs > 1.0E-6f) {
                    f = (anchoredDraggableState.requireOffset() - positionOf2) / positionOf3;
                    if (f >= 1.0E-6f) {
                        break;
                    } else {
                        f = RecyclerView.DECELERATION_RATE;
                    }
                    return Float.valueOf(f);
                }
                f = 1.0f;
                return Float.valueOf(f);
            case 3:
                return anchoredDraggableState.getAnchors();
            case 4:
                return new Pair(anchoredDraggableState.getAnchors(), anchoredDraggableState.targetValue$delegate.getValue());
            case 5:
                if (!anchoredDraggableState.isAnimationRunning() && anchoredDraggableState.currentValue$delegate.getValue() == com.squareup.cash.afterpayapplet.views.SwipeState.UP) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                return Integer.valueOf(anchoredDraggableState.isAnimationRunning() ? ((Number) anchoredDraggableState.targetValue$delegate.getValue()).intValue() : ((Number) anchoredDraggableState.settledValue$delegate.getValue()).intValue());
        }
    }
}
