package com.datadog.android.internal.telemetry;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class TracingHeaderTypesSet {
    public final Set types;

    public TracingHeaderTypesSet(Set set) {
        set.getClass();
        this.types = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TracingHeaderTypesSet) && Intrinsics.areEqual(this.types, ((TracingHeaderTypesSet) obj).types);
    }

    public final int hashCode() {
        return this.types.hashCode();
    }

    public final String toString() {
        return "TracingHeaderTypesSet(types=" + this.types + ")";
    }
}
