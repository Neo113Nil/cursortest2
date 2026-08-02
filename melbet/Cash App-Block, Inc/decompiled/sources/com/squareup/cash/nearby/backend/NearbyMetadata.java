package com.squareup.cash.nearby.backend;

/* loaded from: classes6.dex */
public final class NearbyMetadata {
    public final int rssi;
    public final long timestampNanos;

    public NearbyMetadata(long j, int i) {
        this.timestampNanos = j;
        this.rssi = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyMetadata)) {
            return false;
        }
        NearbyMetadata nearbyMetadata = (NearbyMetadata) obj;
        return this.timestampNanos == nearbyMetadata.timestampNanos && this.rssi == nearbyMetadata.rssi;
    }

    public final int hashCode() {
        return Integer.hashCode(this.rssi) + (Long.hashCode(this.timestampNanos) * 31);
    }

    public final String toString() {
        return "NearbyMetadata(timestampNanos=" + this.timestampNanos + ", rssi=" + this.rssi + ")";
    }
}
