package androidx.media3.exoplayer.source;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import coil3.svg.internal.AndroidSvg;

/* loaded from: classes3.dex */
public final class TimeOffsetMediaPeriod implements MediaPeriod, MediaPeriod.Callback {
    public MediaPeriod.Callback callback;
    public final MediaPeriod mediaPeriod;
    public final long timeOffsetUs;

    public final class TimeOffsetSampleStream implements SampleStream {
        public final SampleStream sampleStream;
        public final long timeOffsetUs;

        public TimeOffsetSampleStream(SampleStream sampleStream, long j) {
            this.sampleStream = sampleStream;
            this.timeOffsetUs = j;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final boolean isReady() {
            return this.sampleStream.isReady();
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final void maybeThrowError() {
            this.sampleStream.maybeThrowError();
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int readData(AndroidSvg androidSvg, DecoderInputBuffer decoderInputBuffer, int i) {
            int readData = this.sampleStream.readData(androidSvg, decoderInputBuffer, i);
            if (readData == -4) {
                decoderInputBuffer.timeUs += this.timeOffsetUs;
            }
            return readData;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int skipData(long j) {
            return this.sampleStream.skipData(j - this.timeOffsetUs);
        }
    }

    public TimeOffsetMediaPeriod(MediaPeriod mediaPeriod, long j) {
        this.mediaPeriod = mediaPeriod;
        this.timeOffsetUs = j;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean continueLoading(LoadingInfo loadingInfo) {
        LoadingInfo.Builder builder = new LoadingInfo.Builder();
        long j = loadingInfo.playbackPositionUs;
        builder.playbackSpeed = loadingInfo.playbackSpeed;
        builder.lastRebufferRealtimeMs = loadingInfo.lastRebufferRealtimeMs;
        builder.playbackPositionUs = j - this.timeOffsetUs;
        return this.mediaPeriod.continueLoading(new LoadingInfo(builder));
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void discardBuffer(long j) {
        this.mediaPeriod.discardBuffer(j - this.timeOffsetUs);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters) {
        long j2 = this.timeOffsetUs;
        return this.mediaPeriod.getAdjustedSeekPositionUs(j - j2, seekParameters) + j2;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.mediaPeriod.getBufferedPositionUs();
        if (bufferedPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return bufferedPositionUs + this.timeOffsetUs;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.mediaPeriod.getNextLoadPositionUs();
        if (nextLoadPositionUs == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return nextLoadPositionUs + this.timeOffsetUs;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final TrackGroupArray getTrackGroups() {
        return this.mediaPeriod.getTrackGroups();
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean isLoading() {
        return this.mediaPeriod.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void maybeThrowPrepareError() {
        this.mediaPeriod.maybeThrowPrepareError();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
    public final void onContinueLoadingRequested(SequenceableLoader sequenceableLoader) {
        MediaPeriod.Callback callback = this.callback;
        callback.getClass();
        callback.onContinueLoadingRequested(this);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
    public final void onPrepared(MediaPeriod mediaPeriod) {
        MediaPeriod.Callback callback = this.callback;
        callback.getClass();
        callback.onPrepared(this);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void prepare(MediaPeriod.Callback callback, long j) {
        this.callback = callback;
        this.mediaPeriod.prepare(this, j - this.timeOffsetUs);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long readDiscontinuity() {
        long readDiscontinuity = this.mediaPeriod.readDiscontinuity();
        if (readDiscontinuity == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return readDiscontinuity + this.timeOffsetUs;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final void reevaluateBuffer(long j) {
        this.mediaPeriod.reevaluateBuffer(j - this.timeOffsetUs);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long seekToUs(long j) {
        long j2 = this.timeOffsetUs;
        return this.mediaPeriod.seekToUs(j - j2) + j2;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        SampleStream[] sampleStreamArr2 = new SampleStream[sampleStreamArr.length];
        int i = 0;
        while (true) {
            SampleStream sampleStream = null;
            if (i >= sampleStreamArr.length) {
                break;
            }
            TimeOffsetSampleStream timeOffsetSampleStream = (TimeOffsetSampleStream) sampleStreamArr[i];
            if (timeOffsetSampleStream != null) {
                sampleStream = timeOffsetSampleStream.sampleStream;
            }
            sampleStreamArr2[i] = sampleStream;
            i++;
        }
        MediaPeriod mediaPeriod = this.mediaPeriod;
        long j2 = this.timeOffsetUs;
        long selectTracks = mediaPeriod.selectTracks(exoTrackSelectionArr, zArr, sampleStreamArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < sampleStreamArr.length; i2++) {
            SampleStream sampleStream2 = sampleStreamArr2[i2];
            if (sampleStream2 == null) {
                sampleStreamArr[i2] = null;
            } else {
                SampleStream sampleStream3 = sampleStreamArr[i2];
                if (sampleStream3 == null || ((TimeOffsetSampleStream) sampleStream3).sampleStream != sampleStream2) {
                    sampleStreamArr[i2] = new TimeOffsetSampleStream(sampleStream2, j2);
                }
            }
        }
        return selectTracks + j2;
    }
}
