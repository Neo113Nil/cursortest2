package com.bugsnag.android;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public final class LastRunInfo {
    public final int consecutiveLaunchCrashes;
    public final boolean crashed;
    public final boolean crashedDuringLaunch;

    public LastRunInfo(int i, boolean z, boolean z2) {
        this.consecutiveLaunchCrashes = i;
        this.crashed = z;
        this.crashedDuringLaunch = z2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LastRunInfo(consecutiveLaunchCrashes=");
        sb.append(this.consecutiveLaunchCrashes);
        sb.append(", crashed=");
        sb.append(this.crashed);
        sb.append(", crashedDuringLaunch=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.crashedDuringLaunch, ')');
    }
}
