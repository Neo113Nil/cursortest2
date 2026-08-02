package androidx.compose.ui.semantics;

import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatRange;
import kotlin.ranges.ClosedFloatingPointRange;

/* loaded from: classes3.dex */
public final class ProgressBarRangeInfo {
    public static final ProgressBarRangeInfo Indeterminate = new ProgressBarRangeInfo(RecyclerView.DECELERATION_RATE, new ClosedFloatRange(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE), 0);
    public final float current;
    public final ClosedFloatingPointRange range;
    public final int steps;

    public ProgressBarRangeInfo(float f, ClosedFloatingPointRange closedFloatingPointRange, int i) {
        this.current = f;
        this.range = closedFloatingPointRange;
        this.steps = i;
        if (Float.isNaN(f)) {
            a$$ExternalSyntheticBUOutline0.m$3("current must not be NaN");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgressBarRangeInfo)) {
            return false;
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) obj;
        return this.current == progressBarRangeInfo.current && Intrinsics.areEqual(this.range, progressBarRangeInfo.range) && this.steps == progressBarRangeInfo.steps;
    }

    public final float getCurrent() {
        return this.current;
    }

    public final ClosedFloatingPointRange getRange() {
        return this.range;
    }

    public final int getSteps() {
        return this.steps;
    }

    public final int hashCode() {
        return ((this.range.hashCode() + (Float.hashCode(this.current) * 31)) * 31) + this.steps;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarRangeInfo(current=");
        sb.append(this.current);
        sb.append(", range=");
        sb.append(this.range);
        sb.append(", steps=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.steps, ')');
    }
}
