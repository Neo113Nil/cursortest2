package androidx.compose.material;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.ui.unit.IntOffset;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class SwipeableState$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DismissState f$0;

    public /* synthetic */ SwipeableState$$ExternalSyntheticLambda2(DismissState dismissState, int i) {
        this.$r8$classId = i;
        this.f$0 = dismissState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        DismissState dismissState = this.f$0;
        switch (i) {
            case 0:
                float floatValue = ((Float) obj).floatValue();
                ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = dismissState.absoluteOffset;
                float floatValue2 = parcelableSnapshotMutableFloatState.getFloatValue() + floatValue;
                float coerceIn = RangesKt___RangesKt.coerceIn(floatValue2, dismissState.minBound, dismissState.maxBound);
                float f = floatValue2 - coerceIn;
                ResistanceConfig resistanceConfig = (ResistanceConfig) dismissState.resistance$delegate.getValue();
                float f2 = RecyclerView.DECELERATION_RATE;
                if (resistanceConfig != null) {
                    float f3 = f < RecyclerView.DECELERATION_RATE ? resistanceConfig.factorAtMin : resistanceConfig.factorAtMax;
                    if (f3 != RecyclerView.DECELERATION_RATE) {
                        float f4 = resistanceConfig.basis;
                        float f5 = f / f4;
                        if (f5 < -1.0f) {
                            f5 = -1.0f;
                        }
                        if (f5 > 1.0f) {
                            f5 = 1.0f;
                        }
                        f2 = ((float) Math.sin((f5 * 3.1415927f) / 2.0f)) * (f4 / f3);
                    }
                }
                dismissState.offsetState.setFloatValue(coerceIn + f2);
                dismissState.overflowState.setFloatValue(f);
                parcelableSnapshotMutableFloatState.setFloatValue(floatValue2);
                return Unit.INSTANCE;
            default:
                return new IntOffset(MathKt__MathJVMKt.roundToInt(((Number) dismissState.offsetState.getValue()).floatValue()) << 32);
        }
    }
}
