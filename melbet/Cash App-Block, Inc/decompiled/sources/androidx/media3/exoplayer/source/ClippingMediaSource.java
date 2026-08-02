package androidx.media3.exoplayer.source;

import androidx.camera.video.Recorder;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import androidx.tracing.Trace;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class ClippingMediaSource extends WrappingMediaSource {
    public IllegalClippingException clippingError;
    public ClippingTimeline clippingTimeline;
    public final boolean enableInitialDiscontinuity;
    public final long endUs;
    public final ArrayList mediaPeriods;
    public long periodEndUs;
    public long periodStartUs;
    public final Timeline.Window window;

    public final class Builder {
        public boolean buildCalled;
        public boolean enableInitialDiscontinuity;
        public long endPositionUs;
        public final BaseMediaSource mediaSource;

        public Builder(BaseMediaSource baseMediaSource) {
            baseMediaSource.getClass();
            this.mediaSource = baseMediaSource;
            this.enableInitialDiscontinuity = true;
            this.endPositionUs = Long.MIN_VALUE;
        }
    }

    public final class ClippingTimeline extends ForwardingTimeline {
        public final long durationUs;
        public final long endUs;
        public final boolean isDynamic;
        public final long startUs;

        public ClippingTimeline(Timeline timeline, long j, long j2) {
            super(timeline);
            if (j2 != Long.MIN_VALUE && j2 < j) {
                throw new IllegalClippingException(2, j, j2);
            }
            boolean z = false;
            if (timeline.getPeriodCount() != 1) {
                throw new IllegalClippingException(0);
            }
            Timeline.Window window = timeline.getWindow(0, new Timeline.Window(), 0L);
            long max = Math.max(0L, j);
            if (!window.isPlaceholder && max != 0 && !window.isSeekable) {
                throw new IllegalClippingException(1);
            }
            long max2 = j2 == Long.MIN_VALUE ? window.durationUs : Math.max(0L, j2);
            long j3 = window.durationUs;
            if (j3 != -9223372036854775807L) {
                max2 = max2 > j3 ? j3 : max2;
                if (max > max2) {
                    max = max2;
                }
            }
            this.startUs = max;
            this.endUs = max2;
            this.durationUs = max2 != -9223372036854775807L ? max2 - max : -9223372036854775807L;
            if (window.isDynamic && (max2 == -9223372036854775807L || (j3 != -9223372036854775807L && max2 == j3))) {
                z = true;
            }
            this.isDynamic = z;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public final Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
            this.timeline.getPeriod(0, period, z);
            long j = period.positionInWindowUs - this.startUs;
            long j2 = this.durationUs;
            period.set(period.id, period.uid, 0, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, j, AdPlaybackState.NONE, false);
            return period;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public final Timeline.Window getWindow(int i, Timeline.Window window, long j) {
            this.timeline.getWindow(0, window, 0L);
            long j2 = window.positionInFirstPeriodUs;
            long j3 = this.startUs;
            window.positionInFirstPeriodUs = j2 + j3;
            window.durationUs = this.durationUs;
            window.isDynamic = this.isDynamic;
            long j4 = window.defaultPositionUs;
            if (j4 != -9223372036854775807L) {
                long max = Math.max(j4, j3);
                window.defaultPositionUs = max;
                long j5 = this.endUs;
                if (j5 != -9223372036854775807L) {
                    max = Math.min(max, j5);
                }
                window.defaultPositionUs = max - j3;
            }
            long usToMs = Util.usToMs(j3);
            long j6 = window.presentationStartTimeMs;
            if (j6 != -9223372036854775807L) {
                window.presentationStartTimeMs = j6 + usToMs;
            }
            long j7 = window.windowStartTimeMs;
            if (j7 != -9223372036854775807L) {
                window.windowStartTimeMs = j7 + usToMs;
            }
            return window;
        }
    }

    public ClippingMediaSource(Builder builder) {
        super(builder.mediaSource);
        this.endUs = builder.endPositionUs;
        this.enableInitialDiscontinuity = builder.enableInitialDiscontinuity;
        this.mediaPeriods = new ArrayList();
        this.window = new Timeline.Window();
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final MediaPeriod createPeriod(MediaSource$MediaPeriodId mediaSource$MediaPeriodId, Recorder.AnonymousClass3 anonymousClass3, long j) {
        ClippingMediaPeriod clippingMediaPeriod = new ClippingMediaPeriod(this.mediaSource.createPeriod(mediaSource$MediaPeriodId, anonymousClass3, j), this.enableInitialDiscontinuity, this.periodStartUs, this.periodEndUs, 0);
        this.mediaPeriods.add(clippingMediaPeriod);
        return clippingMediaPeriod;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public final void maybeThrowSourceInfoRefreshError() {
        IllegalClippingException illegalClippingException = this.clippingError;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    public final void onChildSourceInfoRefreshed(Timeline timeline) {
        if (this.clippingError != null) {
            return;
        }
        refreshClippedTimeline(timeline);
    }

    public final void refreshClippedTimeline(Timeline timeline) {
        long j;
        Timeline.Window window = this.window;
        timeline.getWindow(0, window);
        long j2 = window.positionInFirstPeriodUs;
        ClippingTimeline clippingTimeline = this.clippingTimeline;
        long j3 = this.endUs;
        ArrayList arrayList = this.mediaPeriods;
        if (clippingTimeline == null || arrayList.isEmpty()) {
            this.periodStartUs = j2;
            this.periodEndUs = j3 != Long.MIN_VALUE ? j2 + j3 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ClippingMediaPeriod clippingMediaPeriod = (ClippingMediaPeriod) arrayList.get(i);
                long j4 = this.periodStartUs;
                long j5 = this.periodEndUs;
                clippingMediaPeriod.startUs = j4;
                clippingMediaPeriod.endUs = j5;
            }
            j = 0;
        } else {
            j = this.periodStartUs - j2;
            j3 = j3 == Long.MIN_VALUE ? Long.MIN_VALUE : this.periodEndUs - j2;
        }
        try {
            ClippingTimeline clippingTimeline2 = new ClippingTimeline(timeline, j, j3);
            this.clippingTimeline = clippingTimeline2;
            refreshSourceInfo(clippingTimeline2);
        } catch (IllegalClippingException e) {
            this.clippingError = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((ClippingMediaPeriod) arrayList.get(i2)).clippingError = this.clippingError;
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void releasePeriod(MediaPeriod mediaPeriod) {
        ArrayList arrayList = this.mediaPeriods;
        Trace.checkState(arrayList.remove(mediaPeriod));
        this.mediaSource.releasePeriod(((ClippingMediaPeriod) mediaPeriod).mediaPeriod);
        if (arrayList.isEmpty()) {
            ClippingTimeline clippingTimeline = this.clippingTimeline;
            clippingTimeline.getClass();
            refreshClippedTimeline(clippingTimeline.timeline);
        }
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public final void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.clippingError = null;
        this.clippingTimeline = null;
    }

    public final class IllegalClippingException extends IOException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public IllegalClippingException(int i, long j, long j2) {
            super("Illegal clipping: ".concat(r4));
            String str;
            if (i != 0) {
                if (i == 1) {
                    str = "not seekable to start";
                } else if (i != 2) {
                    str = "unknown";
                } else {
                    Trace.checkState((j == -9223372036854775807L || j2 == -9223372036854775807L) ? false : true);
                    str = "start exceeds end. Start time: " + j + ", End time: " + j2;
                }
            } else {
                str = "invalid period count";
            }
        }

        public IllegalClippingException(int i) {
            this(i, -9223372036854775807L, -9223372036854775807L);
        }
    }
}
