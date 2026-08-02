package androidx.media3.exoplayer.source;

import androidx.camera.video.Recorder;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;

/* loaded from: classes3.dex */
public final class MaskingMediaPeriod implements MediaPeriod, MediaPeriod.Callback {
    public final Recorder.AnonymousClass3 allocator;
    public MediaPeriod.Callback callback;
    public final MediaSource$MediaPeriodId id;
    public MediaPeriod mediaPeriod;
    public BaseMediaSource mediaSource;
    public long preparePositionOverrideUs = -9223372036854775807L;
    public final long preparePositionUs;

    public MaskingMediaPeriod(MediaSource$MediaPeriodId mediaSource$MediaPeriodId, Recorder.AnonymousClass3 anonymousClass3, long j) {
        this.id = mediaSource$MediaPeriodId;
        this.allocator = anonymousClass3;
        this.preparePositionUs = j;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean continueLoading(LoadingInfo loadingInfo) {
        MediaPeriod mediaPeriod = this.mediaPeriod;
        return mediaPeriod != null && mediaPeriod.continueLoading(loadingInfo);
    }

    public final void createPeriod(MediaSource$MediaPeriodId mediaSource$MediaPeriodId) {
        long j = this.preparePositionOverrideUs;
        if (j == -9223372036854775807L) {
            j = this.preparePositionUs;
        }
        BaseMediaSource baseMediaSource = this.mediaSource;
        baseMediaSource.getClass();
        MediaPeriod createPeriod = baseMediaSource.createPeriod(mediaSource$MediaPeriodId, this.allocator, j);
        this.mediaPeriod = createPeriod;
        if (this.callback != null) {
            createPeriod.prepare(this, j);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void discardBuffer(long j) {
        MediaPeriod mediaPeriod = this.mediaPeriod;
        String str = Util.DEVICE_DEBUG_INFO;
        mediaPeriod.discardBuffer(j);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters) {
        MediaPeriod mediaPeriod = this.mediaPeriod;
        String str = Util.DEVICE_DEBUG_INFO;
        return mediaPeriod.getAdjustedSeekPositionUs(j, seekParameters);
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long getBufferedPositionUs() {
        MediaPeriod mediaPeriod = this.mediaPeriod;
        String str = Util.DEVICE_DEBUG_INFO;
        return mediaPeriod.getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long getNextLoadPositionUs() {
        MediaPeriod mediaPeriod = this.mediaPeriod;
        String str = Util.DEVICE_DEBUG_INFO;
        return mediaPeriod.getNextLoadPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final TrackGroupArray getTrackGroups() {
        MediaPeriod mediaPeriod = this.mediaPeriod;
        String str = Util.DEVICE_DEBUG_INFO;
        return mediaPeriod.getTrackGroups();
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean isLoading() {
        MediaPeriod mediaPeriod = this.mediaPeriod;
        return mediaPeriod != null && mediaPeriod.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void maybeThrowPrepareError() {
        MediaPeriod mediaPeriod = this.mediaPeriod;
        if (mediaPeriod != null) {
            mediaPeriod.maybeThrowPrepareError();
            return;
        }
        BaseMediaSource baseMediaSource = this.mediaSource;
        if (baseMediaSource != null) {
            baseMediaSource.maybeThrowSourceInfoRefreshError();
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
    public final void onContinueLoadingRequested(SequenceableLoader sequenceableLoader) {
        MediaPeriod.Callback callback = this.callback;
        String str = Util.DEVICE_DEBUG_INFO;
        callback.onContinueLoadingRequested(this);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
    public final void onPrepared(MediaPeriod mediaPeriod) {
        MediaPeriod.Callback callback = this.callback;
        String str = Util.DEVICE_DEBUG_INFO;
        callback.onPrepared(this);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void prepare(MediaPeriod.Callback callback, long j) {
        this.callback = callback;
        MediaPeriod mediaPeriod = this.mediaPeriod;
        if (mediaPeriod != null) {
            long j2 = this.preparePositionOverrideUs;
            if (j2 == -9223372036854775807L) {
                j2 = this.preparePositionUs;
            }
            mediaPeriod.prepare(this, j2);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long readDiscontinuity() {
        MediaPeriod mediaPeriod = this.mediaPeriod;
        String str = Util.DEVICE_DEBUG_INFO;
        return mediaPeriod.readDiscontinuity();
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final void reevaluateBuffer(long j) {
        MediaPeriod mediaPeriod = this.mediaPeriod;
        String str = Util.DEVICE_DEBUG_INFO;
        mediaPeriod.reevaluateBuffer(j);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long seekToUs(long j) {
        MediaPeriod mediaPeriod = this.mediaPeriod;
        String str = Util.DEVICE_DEBUG_INFO;
        return mediaPeriod.seekToUs(j);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        long j2 = this.preparePositionOverrideUs;
        if (j2 != -9223372036854775807L && j == this.preparePositionUs) {
            j = j2;
        }
        this.preparePositionOverrideUs = -9223372036854775807L;
        MediaPeriod mediaPeriod = this.mediaPeriod;
        String str = Util.DEVICE_DEBUG_INFO;
        return mediaPeriod.selectTracks(exoTrackSelectionArr, zArr, sampleStreamArr, zArr2, j);
    }
}
