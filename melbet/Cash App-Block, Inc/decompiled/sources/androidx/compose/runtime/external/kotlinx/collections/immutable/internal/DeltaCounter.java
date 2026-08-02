package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public final class DeltaCounter {
    public int count;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeltaCounter) && this.count == ((DeltaCounter) obj).count;
    }

    public final int hashCode() {
        return Integer.hashCode(this.count);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("DeltaCounter(count="), this.count, ')');
    }
}
