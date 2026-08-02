package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class LazyLayoutBeyondBoundsInfo$Interval {
    public final int end;
    public final int start;

    public LazyLayoutBeyondBoundsInfo$Interval(int i, int i2) {
        this.start = i;
        this.end = i2;
        if (!(i >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutBeyondBoundsInfo$Interval)) {
            return false;
        }
        LazyLayoutBeyondBoundsInfo$Interval lazyLayoutBeyondBoundsInfo$Interval = (LazyLayoutBeyondBoundsInfo$Interval) obj;
        return this.start == lazyLayoutBeyondBoundsInfo$Interval.start && this.end == lazyLayoutBeyondBoundsInfo$Interval.end;
    }

    public final int hashCode() {
        return Integer.hashCode(this.end) + (Integer.hashCode(this.start) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.start);
        sb.append(", end=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.end, ')');
    }
}
