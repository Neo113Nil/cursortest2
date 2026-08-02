package com.google.firebase;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;

/* loaded from: classes.dex */
public final class AutoValue_StartupTime {
    public final long elapsedRealtime;
    public final long epochMillis;
    public final long uptimeMillis;

    public AutoValue_StartupTime(long j, long j2, long j3) {
        this.epochMillis = j;
        this.elapsedRealtime = j2;
        this.uptimeMillis = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutoValue_StartupTime) {
            AutoValue_StartupTime autoValue_StartupTime = (AutoValue_StartupTime) obj;
            if (this.epochMillis == autoValue_StartupTime.epochMillis && this.elapsedRealtime == autoValue_StartupTime.elapsedRealtime && this.uptimeMillis == autoValue_StartupTime.uptimeMillis) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.epochMillis;
        long j2 = this.elapsedRealtime;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.uptimeMillis;
        return ((int) ((j3 >>> 32) ^ j3)) ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.epochMillis);
        sb.append(", elapsedRealtime=");
        sb.append(this.elapsedRealtime);
        sb.append(", uptimeMillis=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(this.uptimeMillis, "}", sb);
    }
}
