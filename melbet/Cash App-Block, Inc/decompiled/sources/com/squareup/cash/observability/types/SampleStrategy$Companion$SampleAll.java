package com.squareup.cash.observability.types;

/* loaded from: classes.dex */
public final class SampleStrategy$Companion$SampleAll implements SampleStrategy {
    public static final SampleStrategy$Companion$SampleAll INSTANCE = new SampleStrategy$Companion$SampleAll();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof SampleStrategy$Companion$SampleAll);
    }

    public final int hashCode() {
        return -995583976;
    }

    @Override // com.squareup.cash.observability.types.SampleStrategy
    public final boolean shouldCollectEvent(ReportedError reportedError) {
        reportedError.getClass();
        return true;
    }

    public final String toString() {
        return "SampleAll";
    }
}
