package com.datadog.android.rum.internal.domain.state;

/* loaded from: classes4.dex */
public final class SlowFrameRecord {
    public long durationNs;
    public final long startTimestampNs;

    public SlowFrameRecord(long j, long j2) {
        this.startTimestampNs = j;
        this.durationNs = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlowFrameRecord)) {
            return false;
        }
        SlowFrameRecord slowFrameRecord = (SlowFrameRecord) obj;
        return this.startTimestampNs == slowFrameRecord.startTimestampNs && this.durationNs == slowFrameRecord.durationNs;
    }

    public final int hashCode() {
        return Long.hashCode(this.durationNs) + (Long.hashCode(this.startTimestampNs) * 31);
    }

    public final String toString() {
        return (this.durationNs / 1000000.0d) + "ms";
    }
}
