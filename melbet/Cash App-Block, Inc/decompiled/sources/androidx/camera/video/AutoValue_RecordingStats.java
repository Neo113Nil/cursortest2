package androidx.camera.video;

import androidx.room.TransactorKt;

/* loaded from: classes3.dex */
public final class AutoValue_RecordingStats {
    public final AutoValue_AudioStats audioStats;
    public final long numBytesRecorded;
    public final long recordedDurationNanos;

    public AutoValue_RecordingStats(long j, long j2, AutoValue_AudioStats autoValue_AudioStats) {
        this.recordedDurationNanos = j;
        this.numBytesRecorded = j2;
        this.audioStats = autoValue_AudioStats;
    }

    public static AutoValue_RecordingStats of(long j, long j2, AutoValue_AudioStats autoValue_AudioStats) {
        TransactorKt.checkArgument("duration must be positive value.", j >= 0);
        TransactorKt.checkArgument("bytes must be positive value.", j2 >= 0);
        return new AutoValue_RecordingStats(j, j2, autoValue_AudioStats);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_RecordingStats)) {
            return false;
        }
        AutoValue_RecordingStats autoValue_RecordingStats = (AutoValue_RecordingStats) obj;
        return this.recordedDurationNanos == autoValue_RecordingStats.recordedDurationNanos && this.numBytesRecorded == autoValue_RecordingStats.numBytesRecorded && this.audioStats.equals(autoValue_RecordingStats.audioStats);
    }

    public final int hashCode() {
        long j = this.recordedDurationNanos;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.numBytesRecorded;
        return this.audioStats.hashCode() ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        return "RecordingStats{recordedDurationNanos=" + this.recordedDurationNanos + ", numBytesRecorded=" + this.numBytesRecorded + ", audioStats=" + this.audioStats + "}";
    }
}
