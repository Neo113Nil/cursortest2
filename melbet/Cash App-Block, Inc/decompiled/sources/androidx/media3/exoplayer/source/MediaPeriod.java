package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;

/* loaded from: classes3.dex */
public interface MediaPeriod extends SequenceableLoader {

    public interface Callback {
        void onContinueLoadingRequested(SequenceableLoader sequenceableLoader);

        void onPrepared(MediaPeriod mediaPeriod);
    }

    void discardBuffer(long j);

    long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters);

    TrackGroupArray getTrackGroups();

    void maybeThrowPrepareError();

    void prepare(Callback callback, long j);

    long readDiscontinuity();

    long seekToUs(long j);

    long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j);
}
