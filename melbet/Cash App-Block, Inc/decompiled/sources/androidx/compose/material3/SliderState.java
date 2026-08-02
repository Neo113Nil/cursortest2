package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import androidx.work.Worker$$ExternalSyntheticLambda0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.ClosedFloatRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.JobKt;

/* loaded from: classes3.dex */
public final class SliderState implements DraggableState {
    public final SliderState$dragScope$1 dragScope;
    public final Worker$$ExternalSyntheticLambda0 gestureEndAction;
    public final ParcelableSnapshotMutableState isDragging$delegate;
    public boolean isRtl;
    public Function1 onValueChange;
    public final Orientation orientation;
    public final ParcelableSnapshotMutableFloatState pressOffset$delegate;
    public final ParcelableSnapshotMutableFloatState rawOffset$delegate;
    public final MutatorMutex scrollMutex;
    public final boolean shouldAutoSnap = true;
    public final int steps;
    public final ParcelableSnapshotMutableIntState thumbHeight$delegate;
    public final ParcelableSnapshotMutableIntState thumbWidth$delegate;
    public final float[] tickFractions;
    public final ParcelableSnapshotMutableIntState totalHeight$delegate;
    public final ParcelableSnapshotMutableIntState totalWidth$delegate;
    public final ClosedFloatRange valueRange;
    public final ParcelableSnapshotMutableFloatState valueState$delegate;

    public SliderState(float f, int i, ClosedFloatRange closedFloatRange) {
        float[] fArr;
        this.steps = i;
        this.valueRange = closedFloatRange;
        this.valueState$delegate = new ParcelableSnapshotMutableFloatState(f);
        if (i == 0) {
            fArr = new float[0];
        } else {
            int i2 = i + 2;
            float[] fArr2 = new float[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                fArr2[i3] = i3 / (i + 1);
            }
            fArr = fArr2;
        }
        this.tickFractions = fArr;
        this.totalWidth$delegate = new ParcelableSnapshotMutableIntState(0);
        this.totalHeight$delegate = new ParcelableSnapshotMutableIntState(0);
        this.thumbWidth$delegate = new ParcelableSnapshotMutableIntState(0);
        this.thumbHeight$delegate = new ParcelableSnapshotMutableIntState(0);
        this.orientation = Orientation.Horizontal;
        this.isDragging$delegate = Updater.mutableStateOf$default(Boolean.FALSE);
        this.gestureEndAction = new Worker$$ExternalSyntheticLambda0(this, 7);
        ClosedFloatRange closedFloatRange2 = this.valueRange;
        float f2 = closedFloatRange2._start;
        float f3 = closedFloatRange2._endInclusive - f2;
        this.rawOffset$delegate = new ParcelableSnapshotMutableFloatState(TransactorKt.lerp(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RangesKt___RangesKt.coerceIn(f3 == RecyclerView.DECELERATION_RATE ? 0.0f : (f - f2) / f3, RecyclerView.DECELERATION_RATE, 1.0f)));
        this.pressOffset$delegate = new ParcelableSnapshotMutableFloatState(RecyclerView.DECELERATION_RATE);
        this.dragScope = new SliderState$dragScope$1(this, 0);
        this.scrollMutex = new MutatorMutex();
    }

    public final void dispatchRawDelta(float f) {
        float max;
        float min;
        if (this.orientation == Orientation.Vertical) {
            float intValue = this.totalHeight$delegate.getIntValue();
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = this.thumbHeight$delegate;
            max = Math.max(intValue - (parcelableSnapshotMutableIntState.getIntValue() / 2.0f), RecyclerView.DECELERATION_RATE);
            min = Math.min(parcelableSnapshotMutableIntState.getIntValue() / 2.0f, max);
        } else {
            float intValue2 = this.totalWidth$delegate.getIntValue();
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = this.thumbWidth$delegate;
            max = Math.max(intValue2 - (parcelableSnapshotMutableIntState2.getIntValue() / 2.0f), RecyclerView.DECELERATION_RATE);
            min = Math.min(parcelableSnapshotMutableIntState2.getIntValue() / 2.0f, max);
        }
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = this.rawOffset$delegate;
        float floatValue = parcelableSnapshotMutableFloatState.getFloatValue() + f;
        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState2 = this.pressOffset$delegate;
        parcelableSnapshotMutableFloatState.setFloatValue(parcelableSnapshotMutableFloatState2.getFloatValue() + floatValue);
        parcelableSnapshotMutableFloatState2.setFloatValue(RecyclerView.DECELERATION_RATE);
        float access$snapValueToTick = SliderKt.access$snapValueToTick(parcelableSnapshotMutableFloatState.getFloatValue(), min, max, this.tickFractions);
        ClosedFloatRange closedFloatRange = this.valueRange;
        float f2 = max - min;
        float lerp = TransactorKt.lerp(closedFloatRange._start, closedFloatRange._endInclusive, RangesKt___RangesKt.coerceIn(f2 == RecyclerView.DECELERATION_RATE ? 0.0f : (access$snapValueToTick - min) / f2, RecyclerView.DECELERATION_RATE, 1.0f));
        if (lerp == this.valueState$delegate.getFloatValue()) {
            return;
        }
        Function1 function1 = this.onValueChange;
        if (function1 != null) {
            function1.invoke(Float.valueOf(lerp));
        } else {
            setValue(lerp);
        }
    }

    @Override // androidx.compose.foundation.gestures.DraggableState
    public final Object drag(MutatePriority mutatePriority, Function2 function2, Continuation continuation) {
        Object coroutineScope = JobKt.coroutineScope(new SliderState$drag$2(this, mutatePriority, function2, null, 0), continuation);
        return coroutineScope == CoroutineSingletons.COROUTINE_SUSPENDED ? coroutineScope : Unit.INSTANCE;
    }

    public final float getCoercedValueAsFraction() {
        ClosedFloatRange closedFloatRange = this.valueRange;
        float f = closedFloatRange._start;
        float f2 = closedFloatRange._endInclusive;
        float coerceIn = RangesKt___RangesKt.coerceIn(this.valueState$delegate.getFloatValue(), f, f2);
        float f3 = f2 - f;
        return RangesKt___RangesKt.coerceIn(f3 == RecyclerView.DECELERATION_RATE ? 0.0f : (coerceIn - f) / f3, RecyclerView.DECELERATION_RATE, 1.0f);
    }

    public final void setValue(float f) {
        if (this.shouldAutoSnap) {
            ClosedFloatRange closedFloatRange = this.valueRange;
            float f2 = closedFloatRange._endInclusive;
            float f3 = closedFloatRange._start;
            f = SliderKt.access$snapValueToTick(RangesKt___RangesKt.coerceIn(f, f3, f2), f3, f2, this.tickFractions);
        }
        this.valueState$delegate.setFloatValue(f);
    }
}
