package com.datadog.android.rum.internal.startup;

/* loaded from: classes4.dex */
public final class RumTTIDInfo {
    public final long durationNs;
    public final RumStartupScenario scenario;

    public RumTTIDInfo(RumStartupScenario rumStartupScenario, long j) {
        this.scenario = rumStartupScenario;
        this.durationNs = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RumTTIDInfo)) {
            return false;
        }
        RumTTIDInfo rumTTIDInfo = (RumTTIDInfo) obj;
        return this.scenario.equals(rumTTIDInfo.scenario) && this.durationNs == rumTTIDInfo.durationNs;
    }

    public final int hashCode() {
        return Long.hashCode(this.durationNs) + (this.scenario.hashCode() * 31);
    }

    public final String toString() {
        return "RumTTIDInfo(scenario=" + this.scenario + ", durationNs=" + this.durationNs + ")";
    }
}
