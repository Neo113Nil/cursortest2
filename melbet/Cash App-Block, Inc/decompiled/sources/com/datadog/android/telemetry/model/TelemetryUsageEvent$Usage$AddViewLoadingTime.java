package com.datadog.android.telemetry.model;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class TelemetryUsageEvent$Usage$AddViewLoadingTime {
    public final boolean noActiveView;
    public final boolean noView;
    public final boolean overwritten;

    public TelemetryUsageEvent$Usage$AddViewLoadingTime(boolean z, boolean z2, boolean z3) {
        this.noView = z;
        this.noActiveView = z2;
        this.overwritten = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TelemetryUsageEvent$Usage$AddViewLoadingTime)) {
            return false;
        }
        TelemetryUsageEvent$Usage$AddViewLoadingTime telemetryUsageEvent$Usage$AddViewLoadingTime = (TelemetryUsageEvent$Usage$AddViewLoadingTime) obj;
        return this.noView == telemetryUsageEvent$Usage$AddViewLoadingTime.noView && this.noActiveView == telemetryUsageEvent$Usage$AddViewLoadingTime.noActiveView && this.overwritten == telemetryUsageEvent$Usage$AddViewLoadingTime.overwritten;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.overwritten) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.noView) * 31, 31, this.noActiveView);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(NavAction$$ExternalSyntheticOutline0.m("AddViewLoadingTime(noView=", ", noActiveView=", ", overwritten=", this.noView, this.noActiveView), this.overwritten, ")");
    }
}
