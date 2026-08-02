package androidx.media3.exoplayer.video;

import android.util.Range;
import androidx.recyclerview.widget.RecyclerView;
import androidx.tracing.Trace;

/* loaded from: classes3.dex */
public final class VideoFrameReleaseEarlyTimeForecaster {
    public double derivativeOfEarlyTime;
    public Range derivativeOfEarlyTimeRange;
    public long lastFrameEarlyUs;
    public long lastFramePresentationTimeUs;

    public VideoFrameReleaseEarlyTimeForecaster() {
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d));
        this.derivativeOfEarlyTimeRange = range;
        this.derivativeOfEarlyTime = ((Double) range.getUpper()).doubleValue();
        this.lastFramePresentationTimeUs = -9223372036854775807L;
        this.lastFrameEarlyUs = -9223372036854775807L;
    }

    public final void onVideoFrameProcessed(long j, long j2) {
        double doubleValue;
        Trace.checkArgument(j != -9223372036854775807L);
        Trace.checkArgument(j2 != -9223372036854775807L);
        long j3 = this.lastFramePresentationTimeUs;
        if (j3 != -9223372036854775807L) {
            if (this.lastFrameEarlyUs != -9223372036854775807L && j != j3) {
                doubleValue = (j2 - r4) / (j - j3);
                this.derivativeOfEarlyTime = (((Double) this.derivativeOfEarlyTimeRange.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d) + (this.derivativeOfEarlyTime * 0.800000011920929d);
                this.lastFramePresentationTimeUs = j;
                this.lastFrameEarlyUs = j2;
            }
        }
        doubleValue = ((Double) this.derivativeOfEarlyTimeRange.getUpper()).doubleValue();
        this.derivativeOfEarlyTime = (((Double) this.derivativeOfEarlyTimeRange.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d) + (this.derivativeOfEarlyTime * 0.800000011920929d);
        this.lastFramePresentationTimeUs = j;
        this.lastFrameEarlyUs = j2;
    }

    public final void reset() {
        this.derivativeOfEarlyTime = ((Double) this.derivativeOfEarlyTimeRange.getUpper()).doubleValue();
        this.lastFramePresentationTimeUs = -9223372036854775807L;
        this.lastFrameEarlyUs = -9223372036854775807L;
    }

    public final void setPlaybackSpeed(float f) {
        Trace.checkArgument(f > RecyclerView.DECELERATION_RATE);
        this.derivativeOfEarlyTimeRange = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / f));
        reset();
    }
}
