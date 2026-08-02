package com.google.common.collect;

/* loaded from: classes4.dex */
public abstract class AbstractRangeSet {
    public abstract ImmutableSet asRanges();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractRangeSet) {
            return asRanges().equals(((AbstractRangeSet) obj).asRanges());
        }
        return false;
    }

    public final int hashCode() {
        return asRanges().hashCode();
    }

    public final String toString() {
        return asRanges().toString();
    }
}
