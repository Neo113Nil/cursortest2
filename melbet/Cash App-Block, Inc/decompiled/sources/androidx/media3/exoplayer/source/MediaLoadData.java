package androidx.media3.exoplayer.source;

import androidx.media3.common.Format;
import com.datadog.android.api.InternalLogger;
import kotlin.random.Random;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes3.dex */
public final class MediaLoadData {
    public final long mediaEndTimeMs;
    public final long mediaStartTimeMs;
    public final Object trackFormat;
    public int trackType;

    public MediaLoadData(InternalLogger internalLogger, long j, long j2, int i) {
        internalLogger.getClass();
        this.trackFormat = internalLogger;
        this.mediaStartTimeMs = j;
        this.mediaEndTimeMs = j2;
        this.trackType = i;
    }

    /* renamed from: nextDelay-UwyO8pc, reason: not valid java name */
    public long m1145nextDelayUwyO8pc() {
        DurationUnit durationUnit = DurationUnit.MILLISECONDS;
        double m4175toDoubleimpl = Duration.m4175toDoubleimpl(this.mediaEndTimeMs, durationUnit);
        int i = this.trackType;
        this.trackType = i + 1;
        double min = Math.min(m4175toDoubleimpl, Duration.m4175toDoubleimpl(Duration.m4174timesUwyO8pc(this.mediaStartTimeMs, Math.pow(2.0d, i)), durationUnit));
        return DurationKt.toDuration(((Random) this.trackFormat).nextDouble(0.0d, min) + (min / 2.0d), durationUnit);
    }

    public MediaLoadData(long j, long j2, Random.Default r5) {
        r5.getClass();
        this.mediaStartTimeMs = j;
        this.mediaEndTimeMs = j2;
        this.trackFormat = r5;
    }

    public MediaLoadData(int i, Format format2, long j, long j2) {
        this.trackType = i;
        this.trackFormat = format2;
        this.mediaStartTimeMs = j;
        this.mediaEndTimeMs = j2;
    }
}
