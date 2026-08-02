package androidx.compose.material3;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.ui.unit.IntSize;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.ClosedFloatRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final /* synthetic */ class SliderKt$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SliderState f$0;

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda3(SliderState sliderState, int i) {
        this.$r8$classId = i;
        this.f$0 = sliderState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        int i2 = this.$r8$classId;
        SliderState sliderState = this.f$0;
        switch (i2) {
            case 0:
                IntSize intSize = (IntSize) obj;
                sliderState.thumbWidth$delegate.setIntValue((int) (intSize.packedValue >> 32));
                sliderState.thumbHeight$delegate.setIntValue((int) (intSize.packedValue & BodyPartID.bodyIdMax));
                return Unit.INSTANCE;
            case 1:
                ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = sliderState.valueState$delegate;
                float floatValue = ((Float) obj).floatValue();
                ClosedFloatRange closedFloatRange = sliderState.valueRange;
                float f = closedFloatRange._start;
                float f2 = closedFloatRange._endInclusive;
                float coerceIn = RangesKt___RangesKt.coerceIn(floatValue, f, f2);
                int i3 = sliderState.steps;
                boolean z = false;
                if (i3 > 0 && (i = i3 + 1) >= 0) {
                    float f3 = coerceIn;
                    float f4 = f3;
                    int i4 = 0;
                    while (true) {
                        float lerp = TransactorKt.lerp(f, f2, i4 / i);
                        float f5 = lerp - coerceIn;
                        if (Math.abs(f5) <= f3) {
                            f3 = Math.abs(f5);
                            f4 = lerp;
                        }
                        if (i4 != i) {
                            i4++;
                        } else {
                            coerceIn = f4;
                        }
                    }
                }
                if (coerceIn != parcelableSnapshotMutableFloatState.getFloatValue()) {
                    if (coerceIn != parcelableSnapshotMutableFloatState.getFloatValue()) {
                        Function1 function1 = sliderState.onValueChange;
                        if (function1 != null) {
                            function1.invoke(Float.valueOf(coerceIn));
                        } else {
                            sliderState.setValue(coerceIn);
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                sliderState.dispatchRawDelta(RecyclerView.DECELERATION_RATE);
                sliderState.gestureEndAction.invoke();
                return Unit.INSTANCE;
        }
    }
}
