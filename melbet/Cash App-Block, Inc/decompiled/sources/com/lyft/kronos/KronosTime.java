package com.lyft.kronos;

import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class KronosTime {
    public final long posixTimeMs;
    public final Long timeSinceLastNtpSyncMs;

    public KronosTime(long j, Long l) {
        this.posixTimeMs = j;
        this.timeSinceLastNtpSyncMs = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KronosTime)) {
            return false;
        }
        KronosTime kronosTime = (KronosTime) obj;
        return this.posixTimeMs == kronosTime.posixTimeMs && Intrinsics.areEqual(this.timeSinceLastNtpSyncMs, kronosTime.timeSinceLastNtpSyncMs);
    }

    public final int hashCode() {
        long j = this.posixTimeMs;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        Long l = this.timeSinceLastNtpSyncMs;
        return i + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KronosTime(posixTimeMs=");
        sb.append(this.posixTimeMs);
        sb.append(", timeSinceLastNtpSyncMs=");
        return Thread$State$EnumUnboxingLocalUtility.m(sb, this.timeSinceLastNtpSyncMs, ")");
    }
}
