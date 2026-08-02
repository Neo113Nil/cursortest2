package com.squareup.cash.observability.types;

import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;

/* loaded from: classes6.dex */
public final class SampleStrategy$Companion$OneIn implements SampleStrategy {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof SampleStrategy$Companion$OneIn);
    }

    public final int hashCode() {
        return Integer.hashCode(10);
    }

    @Override // com.squareup.cash.observability.types.SampleStrategy
    public final boolean shouldCollectEvent(ReportedError reportedError) {
        reportedError.getClass();
        return RangesKt___RangesKt.random(new IntRange(1, 10, 1), Random.Default) == 1;
    }

    public final String toString() {
        return "OneIn(frequency=10)";
    }
}
