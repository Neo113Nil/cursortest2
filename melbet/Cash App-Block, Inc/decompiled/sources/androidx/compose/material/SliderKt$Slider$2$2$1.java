package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import app.cash.local.views.internal.CartItemCounterViewKt$CartItemCounterView$1$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.ranges.ClosedFloatRange;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class SliderKt$Slider$2$2$1 extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ Object $maxPx;
    public final /* synthetic */ Object $minPx;
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object $valueRange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$Slider$2$2$1(ClosedFloatingPointRange closedFloatingPointRange, Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2) {
        super(1, ArrayIteratorKt.class, "scaleToOffset", "Slider$lambda$3$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
        this.$valueRange = closedFloatingPointRange;
        this.$minPx = ref$FloatRef;
        this.$maxPx = ref$FloatRef2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.$maxPx;
        Object obj3 = this.$minPx;
        Object obj4 = this.$valueRange;
        switch (i) {
            case 0:
                float floatValue = ((Number) obj).floatValue();
                ClosedFloatRange closedFloatRange = (ClosedFloatRange) ((ClosedFloatingPointRange) obj4);
                float f = closedFloatRange._start;
                float f2 = closedFloatRange._endInclusive;
                float f3 = ((Ref$FloatRef) obj3).element;
                float f4 = ((Ref$FloatRef) obj2).element;
                float f5 = f2 - f;
                float f6 = RecyclerView.DECELERATION_RATE;
                float f7 = f5 == RecyclerView.DECELERATION_RATE ? 0.0f : (floatValue - f) / f5;
                if (f7 >= RecyclerView.DECELERATION_RATE) {
                    f6 = f7;
                }
                if (f6 > 1.0f) {
                    f6 = 1.0f;
                }
                return Float.valueOf(TransactorKt.lerp(f3, f4, f6));
            default:
                int intValue = ((Number) obj).intValue();
                CoroutineScope coroutineScope = (CoroutineScope) obj4;
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj3;
                MutableState mutableState = (MutableState) obj2;
                parcelableSnapshotMutableIntState.setIntValue(intValue);
                if (intValue == 100) {
                    JobKt.launch$default(coroutineScope, null, null, new CartItemCounterViewKt$CartItemCounterView$1$1(mutableState, parcelableSnapshotMutableIntState, (Continuation) null), 3);
                } else {
                    mutableState.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$Slider$2$2$1(CoroutineScope coroutineScope, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, MutableState mutableState) {
        super(1, ArrayIteratorKt.class, "updateProgress", "Content$updateProgress(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableIntState;Landroidx/compose/runtime/MutableState;I)V", 0);
        this.$valueRange = coroutineScope;
        this.$minPx = parcelableSnapshotMutableIntState;
        this.$maxPx = mutableState;
    }
}
