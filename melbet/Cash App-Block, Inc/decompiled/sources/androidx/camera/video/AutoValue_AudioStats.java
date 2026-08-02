package androidx.camera.video;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class AutoValue_AudioStats {
    public final double audioAmplitudeInternal;
    public final long audioBytesRecorded;
    public final int audioState;
    public final Throwable errorCause;

    static {
        Collections.unmodifiableSet(new HashSet(Arrays.asList(2, 3, 4)));
    }

    public AutoValue_AudioStats(int i, double d, long j, Throwable th) {
        this.audioState = i;
        this.audioAmplitudeInternal = d;
        this.audioBytesRecorded = j;
        this.errorCause = th;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AutoValue_AudioStats) {
            AutoValue_AudioStats autoValue_AudioStats = (AutoValue_AudioStats) obj;
            if (this.audioState == autoValue_AudioStats.audioState && Double.doubleToLongBits(this.audioAmplitudeInternal) == Double.doubleToLongBits(autoValue_AudioStats.audioAmplitudeInternal) && this.audioBytesRecorded == autoValue_AudioStats.audioBytesRecorded) {
                Throwable th = autoValue_AudioStats.errorCause;
                Throwable th2 = this.errorCause;
                if (th2 != null ? th2.equals(th) : th == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.audioState ^ 1000003) * 1000003;
        double d = this.audioAmplitudeInternal;
        int doubleToLongBits = (i ^ ((int) (Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32)))) * 1000003;
        long j = this.audioBytesRecorded;
        int i2 = (doubleToLongBits ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Throwable th = this.errorCause;
        return (th == null ? 0 : th.hashCode()) ^ i2;
    }

    public final String toString() {
        return "AudioStats{audioState=" + this.audioState + ", audioAmplitudeInternal=" + this.audioAmplitudeInternal + ", audioBytesRecorded=" + this.audioBytesRecorded + ", errorCause=" + this.errorCause + "}";
    }
}
