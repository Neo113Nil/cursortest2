package androidx.media3.exoplayer.source;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.source.ClippingMediaSource;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import coil3.svg.internal.AndroidSvg;

/* loaded from: classes3.dex */
public final class ClippingMediaPeriod implements MediaPeriod, MediaPeriod.Callback {
    public MediaPeriod.Callback callback;
    public ClippingMediaSource.IllegalClippingException clippingError;
    public long endUs;
    public long lastReportedDiscontinuityUs;
    public final MediaPeriod mediaPeriod;
    public long pendingInitialDiscontinuityPositionUs;
    public ClippingSampleStream[] sampleStreams = new ClippingSampleStream[0];
    public long startUs;

    public final class ClippingSampleStream implements SampleStream {
        public final SampleStream childStream;
        public boolean sentEos;

        public ClippingSampleStream(SampleStream sampleStream) {
            this.childStream = sampleStream;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final boolean isReady() {
            return !ClippingMediaPeriod.this.isPendingInitialDiscontinuity() && this.childStream.isReady();
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final void maybeThrowError() {
            this.childStream.maybeThrowError();
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int readData(AndroidSvg androidSvg, DecoderInputBuffer decoderInputBuffer, int i) {
            ClippingMediaPeriod clippingMediaPeriod = ClippingMediaPeriod.this;
            if (clippingMediaPeriod.isPendingInitialDiscontinuity()) {
                return -3;
            }
            if (this.sentEos) {
                decoderInputBuffer.flags = 4;
                return -4;
            }
            long bufferedPositionUs = clippingMediaPeriod.getBufferedPositionUs();
            int readData = this.childStream.readData(androidSvg, decoderInputBuffer, i);
            if (clippingMediaPeriod.lastReportedDiscontinuityUs != -9223372036854775807L && readData != -3) {
                clippingMediaPeriod.lastReportedDiscontinuityUs = -9223372036854775807L;
            }
            if (readData != -5) {
                long j = clippingMediaPeriod.endUs;
                if (j == Long.MIN_VALUE || ((readData != -4 || decoderInputBuffer.timeUs < j) && !(readData == -3 && bufferedPositionUs == Long.MIN_VALUE && !decoderInputBuffer.waitingForKeys))) {
                    return readData;
                }
                decoderInputBuffer.clear();
                decoderInputBuffer.flags = 4;
                this.sentEos = true;
                return -4;
            }
            long j2 = clippingMediaPeriod.startUs;
            long j3 = clippingMediaPeriod.endUs;
            Format format2 = (Format) androidSvg.renderOptions;
            format2.getClass();
            int i2 = format2.encoderPadding;
            int i3 = format2.encoderDelay;
            if (i3 != 0 || i2 != 0) {
                if (j2 != 0) {
                    i3 = 0;
                }
                if (j3 != Long.MIN_VALUE) {
                    i2 = 0;
                }
                Format.Builder buildUpon = format2.buildUpon();
                buildUpon.encoderDelay = i3;
                buildUpon.encoderPadding = i2;
                androidSvg.renderOptions = new Format(buildUpon);
            }
            return -5;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int skipData(long j) {
            if (ClippingMediaPeriod.this.isPendingInitialDiscontinuity()) {
                return -3;
            }
            return this.childStream.skipData(j);
        }
    }

    public ClippingMediaPeriod(MediaPeriod mediaPeriod, boolean z, long j, long j2, int i) {
        this.mediaPeriod = mediaPeriod;
        this.pendingInitialDiscontinuityPositionUs = z ? j : -9223372036854775807L;
        this.lastReportedDiscontinuityUs = -9223372036854775807L;
        this.startUs = j;
        this.endUs = j2;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean continueLoading(LoadingInfo loadingInfo) {
        return this.mediaPeriod.continueLoading(loadingInfo);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void discardBuffer(long j) {
        this.mediaPeriod.discardBuffer(j);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters) {
        long j2 = this.startUs;
        if (j == j2) {
            return j2;
        }
        long constrainValue = Util.constrainValue(seekParameters.toleranceBeforeUs, 0L, j - j2);
        long j3 = seekParameters.toleranceAfterUs;
        long j4 = this.endUs;
        long constrainValue2 = Util.constrainValue(j3, 0L, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j);
        if (constrainValue != seekParameters.toleranceBeforeUs || constrainValue2 != seekParameters.toleranceAfterUs) {
            seekParameters = new SeekParameters(constrainValue, constrainValue2);
        }
        return this.mediaPeriod.getAdjustedSeekPositionUs(j, seekParameters);
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long getBufferedPositionUs() {
        long bufferedPositionUs = this.mediaPeriod.getBufferedPositionUs();
        if (bufferedPositionUs != Long.MIN_VALUE) {
            long j = this.endUs;
            if (j == Long.MIN_VALUE || bufferedPositionUs < j) {
                return bufferedPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long getNextLoadPositionUs() {
        long nextLoadPositionUs = this.mediaPeriod.getNextLoadPositionUs();
        if (nextLoadPositionUs != Long.MIN_VALUE) {
            long j = this.endUs;
            if (j == Long.MIN_VALUE || nextLoadPositionUs < j) {
                return nextLoadPositionUs;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final TrackGroupArray getTrackGroups() {
        return this.mediaPeriod.getTrackGroups();
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean isLoading() {
        return this.mediaPeriod.isLoading();
    }

    public final boolean isPendingInitialDiscontinuity() {
        return this.pendingInitialDiscontinuityPositionUs != -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void maybeThrowPrepareError() {
        ClippingMediaSource.IllegalClippingException illegalClippingException = this.clippingError;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
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
        if (this.clippingError != null) {
            return;
        }
        MediaPeriod.Callback callback = this.callback;
        callback.getClass();
        callback.onPrepared(this);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void prepare(MediaPeriod.Callback callback, long j) {
        this.callback = callback;
        this.mediaPeriod.prepare(this, j);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long readDiscontinuity() {
        if (isPendingInitialDiscontinuity()) {
            long j = this.pendingInitialDiscontinuityPositionUs;
            this.pendingInitialDiscontinuityPositionUs = -9223372036854775807L;
            this.lastReportedDiscontinuityUs = j;
            long readDiscontinuity = readDiscontinuity();
            return readDiscontinuity != -9223372036854775807L ? readDiscontinuity : j;
        }
        long readDiscontinuity2 = this.mediaPeriod.readDiscontinuity();
        if (readDiscontinuity2 != -9223372036854775807L) {
            long j2 = this.startUs;
            long j3 = this.endUs;
            long max = Math.max(readDiscontinuity2, j2);
            if (j3 != Long.MIN_VALUE) {
                max = Math.min(max, j3);
            }
            if (max != this.lastReportedDiscontinuityUs) {
                this.lastReportedDiscontinuityUs = max;
                return max;
            }
        }
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final void reevaluateBuffer(long j) {
        this.mediaPeriod.reevaluateBuffer(j);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long seekToUs(long j) {
        this.pendingInitialDiscontinuityPositionUs = -9223372036854775807L;
        for (ClippingSampleStream clippingSampleStream : this.sampleStreams) {
            if (clippingSampleStream != null) {
                clippingSampleStream.sentEos = false;
            }
        }
        long seekToUs = this.mediaPeriod.seekToUs(j);
        long j2 = this.startUs;
        long j3 = this.endUs;
        long max = Math.max(seekToUs, j2);
        return j3 != Long.MIN_VALUE ? Math.min(max, j3) : max;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    @Override // androidx.media3.exoplayer.source.MediaPeriod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        long j2;
        int i;
        this.sampleStreams = new ClippingSampleStream[sampleStreamArr.length];
        SampleStream[] sampleStreamArr2 = new SampleStream[sampleStreamArr.length];
        for (int i2 = 0; i2 < sampleStreamArr.length; i2++) {
            ClippingSampleStream[] clippingSampleStreamArr = this.sampleStreams;
            ClippingSampleStream clippingSampleStream = (ClippingSampleStream) sampleStreamArr[i2];
            clippingSampleStreamArr[i2] = clippingSampleStream;
            sampleStreamArr2[i2] = clippingSampleStream != null ? clippingSampleStream.childStream : null;
        }
        long selectTracks = this.mediaPeriod.selectTracks(exoTrackSelectionArr, zArr, sampleStreamArr2, zArr2, j);
        long j3 = this.endUs;
        long max = Math.max(selectTracks, j);
        if (j3 != Long.MIN_VALUE) {
            max = Math.min(max, j3);
        }
        if (isPendingInitialDiscontinuity()) {
            if (selectTracks >= j) {
                if (selectTracks != 0) {
                    for (ExoTrackSelection exoTrackSelection : exoTrackSelectionArr) {
                        if (exoTrackSelection != null) {
                            Format selectedFormat = exoTrackSelection.getSelectedFormat();
                            if (!MimeTypes.allSamplesAreSyncSamples(selectedFormat.sampleMimeType, selectedFormat.codecs)) {
                            }
                        }
                    }
                }
            }
            j2 = max;
            this.pendingInitialDiscontinuityPositionUs = j2;
            for (i = 0; i < sampleStreamArr.length; i++) {
                SampleStream sampleStream = sampleStreamArr2[i];
                ClippingSampleStream[] clippingSampleStreamArr2 = this.sampleStreams;
                if (sampleStream == null) {
                    clippingSampleStreamArr2[i] = null;
                } else {
                    ClippingSampleStream clippingSampleStream2 = clippingSampleStreamArr2[i];
                    if (clippingSampleStream2 == null || clippingSampleStream2.childStream != sampleStream) {
                        clippingSampleStreamArr2[i] = new ClippingSampleStream(sampleStream);
                    }
                }
                sampleStreamArr[i] = clippingSampleStreamArr2[i];
            }
            return max;
        }
        j2 = -9223372036854775807L;
        this.pendingInitialDiscontinuityPositionUs = j2;
        while (i < sampleStreamArr.length) {
        }
        return max;
    }
}
