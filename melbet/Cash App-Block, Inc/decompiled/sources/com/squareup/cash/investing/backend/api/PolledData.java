package com.squareup.cash.investing.backend.api;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PolledData {
    public final boolean isStale;
    public final Object value;

    public PolledData(Object obj, boolean z) {
        this.value = obj;
        this.isStale = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PolledData)) {
            return false;
        }
        PolledData polledData = (PolledData) obj;
        return Intrinsics.areEqual(this.value, polledData.value) && this.isStale == polledData.isStale;
    }

    public final Object getValue() {
        return this.value;
    }

    public final int hashCode() {
        Object obj = this.value;
        return Boolean.hashCode(this.isStale) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final boolean isStale() {
        return this.isStale;
    }

    public final String toString() {
        return "PolledData(value=" + this.value + ", isStale=" + this.isStale + ")";
    }
}
