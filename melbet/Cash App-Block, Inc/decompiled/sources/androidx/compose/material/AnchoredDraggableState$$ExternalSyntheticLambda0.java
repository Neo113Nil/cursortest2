package androidx.compose.material;

import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class AnchoredDraggableState$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AnchoredDraggableState f$0;

    public /* synthetic */ AnchoredDraggableState$$ExternalSyntheticLambda0(AnchoredDraggableState anchoredDraggableState, int i) {
        this.$r8$classId = i;
        this.f$0 = anchoredDraggableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        float f = RecyclerView.DECELERATION_RATE;
        AnchoredDraggableState anchoredDraggableState = this.f$0;
        switch (i) {
            case 0:
                Object value = ((ParcelableSnapshotMutableState) anchoredDraggableState.dragTarget$delegate).getValue();
                if (value != null) {
                    return value;
                }
                float floatValue = ((ParcelableSnapshotMutableFloatState) anchoredDraggableState.offset$delegate).getFloatValue();
                boolean isNaN = Float.isNaN(floatValue);
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = (ParcelableSnapshotMutableState) anchoredDraggableState.currentValue$delegate;
                return !isNaN ? anchoredDraggableState.computeTarget(floatValue, RecyclerView.DECELERATION_RATE, parcelableSnapshotMutableState.getValue()) : parcelableSnapshotMutableState.getValue();
            case 1:
                Object value2 = ((ParcelableSnapshotMutableState) anchoredDraggableState.dragTarget$delegate).getValue();
                if (value2 != null) {
                    return value2;
                }
                float floatValue2 = ((ParcelableSnapshotMutableFloatState) anchoredDraggableState.offset$delegate).getFloatValue();
                boolean isNaN2 = Float.isNaN(floatValue2);
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = (ParcelableSnapshotMutableState) anchoredDraggableState.currentValue$delegate;
                if (isNaN2) {
                    return parcelableSnapshotMutableState2.getValue();
                }
                Object value3 = parcelableSnapshotMutableState2.getValue();
                MapDraggableAnchors anchors = anchoredDraggableState.getAnchors();
                float positionOf = anchors.positionOf(value3);
                if (positionOf != floatValue2 && !Float.isNaN(positionOf)) {
                    if (positionOf < floatValue2) {
                        Object closestAnchor = anchors.closestAnchor(floatValue2, true);
                        if (closestAnchor != null) {
                            return closestAnchor;
                        }
                    } else {
                        Object closestAnchor2 = anchors.closestAnchor(floatValue2, false);
                        if (closestAnchor2 != null) {
                            return closestAnchor2;
                        }
                    }
                }
                return value3;
            case 2:
                float positionOf2 = anchoredDraggableState.getAnchors().positionOf(((ParcelableSnapshotMutableState) anchoredDraggableState.currentValue$delegate).getValue());
                float positionOf3 = anchoredDraggableState.getAnchors().positionOf(((DerivedSnapshotState) anchoredDraggableState.closestValue$delegate).getValue()) - positionOf2;
                float abs = Math.abs(positionOf3);
                if (!Float.isNaN(abs) && abs > 1.0E-6f) {
                    float requireOffset = (anchoredDraggableState.requireOffset() - positionOf2) / positionOf3;
                    if (requireOffset >= 1.0E-6f) {
                        if (requireOffset <= 0.999999f) {
                            f = requireOffset;
                        }
                    }
                    return Float.valueOf(f);
                }
                f = 1.0f;
                return Float.valueOf(f);
            case 3:
                return anchoredDraggableState.getAnchors();
            default:
                return new Pair(anchoredDraggableState.getAnchors(), ((DerivedSnapshotState) anchoredDraggableState.targetValue$delegate).getValue());
        }
    }
}
