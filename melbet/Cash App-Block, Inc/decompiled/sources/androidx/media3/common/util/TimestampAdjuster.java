package androidx.media3.common.util;

import java.math.RoundingMode;

/* loaded from: classes3.dex */
public final class TimestampAdjuster {
    public long firstSampleTimestampUs;
    public long lastUnadjustedTimestampUs;
    public final ThreadLocal nextSampleTimestampUs = new ThreadLocal();
    public long timestampOffsetUs;

    public TimestampAdjuster(long j) {
        reset(j);
    }

    public final synchronized long adjustSampleTimestamp(long j) {
        long j2;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            synchronized (this) {
                if (!(this.timestampOffsetUs != -9223372036854775807L)) {
                    long j3 = this.firstSampleTimestampUs;
                    if (j3 == 9223372036854775806L) {
                        Long l = (Long) this.nextSampleTimestampUs.get();
                        l.getClass();
                        j3 = l.longValue();
                    }
                    this.timestampOffsetUs = j3 - j;
                    notifyAll();
                }
                this.lastUnadjustedTimestampUs = j;
                j2 = j + this.timestampOffsetUs;
            }
            return j2;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long adjustTsTimestamp(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.lastUnadjustedTimestampUs;
            if (j2 != -9223372036854775807L) {
                String str = Util.DEVICE_DEBUG_INFO;
                long scaleLargeValue = Util.scaleLargeValue(j2, 90000L, 1000000L, RoundingMode.DOWN);
                long j3 = (4294967296L + scaleLargeValue) / 8589934592L;
                long j4 = ((j3 - 1) * 8589934592L) + j;
                long j5 = (j3 * 8589934592L) + j;
                j = Math.abs(j4 - scaleLargeValue) < Math.abs(j5 - scaleLargeValue) ? j4 : j5;
            }
            long j6 = j;
            String str2 = Util.DEVICE_DEBUG_INFO;
            return adjustSampleTimestamp(Util.scaleLargeValue(j6, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long adjustTsTimestampGreaterThanPreviousTimestamp(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.lastUnadjustedTimestampUs;
            if (j2 != -9223372036854775807L) {
                String str = Util.DEVICE_DEBUG_INFO;
                long scaleLargeValue = Util.scaleLargeValue(j2, 90000L, 1000000L, RoundingMode.DOWN);
                long j3 = scaleLargeValue / 8589934592L;
                long j4 = (j3 * 8589934592L) + j;
                j = j4 >= scaleLargeValue ? j4 : ((j3 + 1) * 8589934592L) + j;
            }
            long j5 = j;
            String str2 = Util.DEVICE_DEBUG_INFO;
            return adjustSampleTimestamp(Util.scaleLargeValue(j5, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long getFirstSampleTimestampUs() {
        long j;
        j = this.firstSampleTimestampUs;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    public final synchronized void reset(long j) {
        this.firstSampleTimestampUs = j;
        this.timestampOffsetUs = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.lastUnadjustedTimestampUs = -9223372036854775807L;
    }
}
