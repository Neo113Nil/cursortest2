package com.datadog.android.rum.internal.metric;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ViewInitializationMetricsState {
    public final int config;
    public final Long initializationTime;
    public final NoValueReason noValueReason;

    public ViewInitializationMetricsState(Long l, int i, NoValueReason noValueReason) {
        if (i == 0) {
            throw null;
        }
        this.initializationTime = l;
        this.config = i;
        this.noValueReason = noValueReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewInitializationMetricsState)) {
            return false;
        }
        ViewInitializationMetricsState viewInitializationMetricsState = (ViewInitializationMetricsState) obj;
        return Intrinsics.areEqual(this.initializationTime, viewInitializationMetricsState.initializationTime) && this.config == viewInitializationMetricsState.config && Intrinsics.areEqual(this.noValueReason, viewInitializationMetricsState.noValueReason);
    }

    public final int hashCode() {
        Long l = this.initializationTime;
        int m = Thread$State$EnumUnboxingLocalUtility.m(this.config, (l == null ? 0 : l.hashCode()) * 31, 31);
        NoValueReason noValueReason = this.noValueReason;
        return m + (noValueReason != null ? noValueReason.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewInitializationMetricsState(initializationTime=");
        sb.append(this.initializationTime);
        sb.append(", config=");
        int i = this.config;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "CUSTOM" : "TIME_BASED_CUSTOM" : "TIME_BASED_DEFAULT" : "DISABLED");
        sb.append(", noValueReason=");
        sb.append(this.noValueReason);
        sb.append(")");
        return sb.toString();
    }
}
