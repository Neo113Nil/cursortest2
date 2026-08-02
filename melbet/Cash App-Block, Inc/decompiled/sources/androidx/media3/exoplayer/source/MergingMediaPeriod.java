package androidx.media3.exoplayer.source;

import androidx.media3.common.Format;
import androidx.media3.common.Format$$ExternalSyntheticLambda1;
import androidx.media3.common.TrackGroup;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.tracing.Trace;
import androidx.transition.Transition;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.RegularImmutableList;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* loaded from: classes3.dex */
public final class MergingMediaPeriod implements MediaPeriod, MediaPeriod.Callback {
    public MediaPeriod.Callback callback;
    public CompositeSequenceableLoader compositeSequenceableLoader;
    public final Transition.AnonymousClass1 compositeSequenceableLoaderFactory;
    public MediaPeriod[] enabledPeriods;
    public final MediaPeriod[] periods;
    public final boolean[] periodsWithTimeOffsets;
    public final IdentityHashMap streamPeriodIndices;
    public TrackGroupArray trackGroups;
    public final ArrayList childrenPendingPreparation = new ArrayList();
    public final HashMap childTrackGroupByMergedTrackGroup = new HashMap();

    public final class MergingMediaPeriodTrackSelection implements ExoTrackSelection {
        public final TrackGroup trackGroup;
        public final ExoTrackSelection trackSelection;

        public MergingMediaPeriodTrackSelection(ExoTrackSelection exoTrackSelection, TrackGroup trackGroup) {
            this.trackSelection = exoTrackSelection;
            this.trackGroup = trackGroup;
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public final void disable() {
            this.trackSelection.disable();
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public final void enable() {
            this.trackSelection.enable();
        }

        public final boolean equals(Object obj) {
            if (equals$androidx$media3$exoplayer$trackselection$ForwardingTrackSelection(obj) && (obj instanceof MergingMediaPeriodTrackSelection)) {
                return this.trackGroup.equals(((MergingMediaPeriodTrackSelection) obj).trackGroup);
            }
            return false;
        }

        public final boolean equals$androidx$media3$exoplayer$trackselection$ForwardingTrackSelection(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof MergingMediaPeriodTrackSelection) {
                return this.trackSelection.equals(((MergingMediaPeriodTrackSelection) obj).trackSelection);
            }
            return false;
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public final Format getFormat(int i) {
            return this.trackGroup.formats[this.trackSelection.getIndexInTrackGroup(i)];
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public final int getIndexInTrackGroup(int i) {
            return this.trackSelection.getIndexInTrackGroup(i);
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public final Format getSelectedFormat() {
            return this.trackGroup.formats[this.trackSelection.getSelectedIndexInTrackGroup()];
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public final int getSelectedIndexInTrackGroup() {
            return this.trackSelection.getSelectedIndexInTrackGroup();
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public final TrackGroup getTrackGroup() {
            return this.trackGroup;
        }

        public final int hashCode() {
            return this.trackGroup.hashCode() + (this.trackSelection.hashCode() * 31);
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public final int indexOf(int i) {
            return this.trackSelection.indexOf(i);
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public final int length() {
            return this.trackSelection.length();
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public final void onDiscontinuity() {
            this.trackSelection.onDiscontinuity();
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public final void onPlayWhenReadyChanged(boolean z) {
            this.trackSelection.onPlayWhenReadyChanged(z);
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public final void onPlaybackSpeed(float f) {
            this.trackSelection.onPlaybackSpeed(f);
        }

        @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
        public final void onRebuffer() {
            this.trackSelection.onRebuffer();
        }
    }

    public MergingMediaPeriod(Transition.AnonymousClass1 anonymousClass1, long[] jArr, MediaPeriod... mediaPeriodArr) {
        this.compositeSequenceableLoaderFactory = anonymousClass1;
        this.periods = mediaPeriodArr;
        anonymousClass1.getClass();
        ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
        RegularImmutableList regularImmutableList = RegularImmutableList.EMPTY;
        this.compositeSequenceableLoader = new CompositeSequenceableLoader(regularImmutableList, regularImmutableList);
        this.streamPeriodIndices = new IdentityHashMap();
        this.enabledPeriods = new MediaPeriod[0];
        this.periodsWithTimeOffsets = new boolean[mediaPeriodArr.length];
        for (int i = 0; i < mediaPeriodArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.periodsWithTimeOffsets[i] = true;
                this.periods[i] = new TimeOffsetMediaPeriod(mediaPeriodArr[i], j);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean continueLoading(LoadingInfo loadingInfo) {
        ArrayList arrayList = this.childrenPendingPreparation;
        if (arrayList.isEmpty()) {
            return this.compositeSequenceableLoader.continueLoading(loadingInfo);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((MediaPeriod) arrayList.get(i)).continueLoading(loadingInfo);
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void discardBuffer(long j) {
        for (MediaPeriod mediaPeriod : this.enabledPeriods) {
            mediaPeriod.discardBuffer(j);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters) {
        MediaPeriod[] mediaPeriodArr = this.enabledPeriods;
        return (mediaPeriodArr.length > 0 ? mediaPeriodArr[0] : this.periods[0]).getAdjustedSeekPositionUs(j, seekParameters);
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long getBufferedPositionUs() {
        return this.compositeSequenceableLoader.getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long getNextLoadPositionUs() {
        return this.compositeSequenceableLoader.getNextLoadPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final TrackGroupArray getTrackGroups() {
        TrackGroupArray trackGroupArray = this.trackGroups;
        trackGroupArray.getClass();
        return trackGroupArray;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean isLoading() {
        return this.compositeSequenceableLoader.isLoading();
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void maybeThrowPrepareError() {
        for (MediaPeriod mediaPeriod : this.periods) {
            mediaPeriod.maybeThrowPrepareError();
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
    public final void onContinueLoadingRequested(SequenceableLoader sequenceableLoader) {
        MediaPeriod.Callback callback = this.callback;
        callback.getClass();
        callback.onContinueLoadingRequested(this);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
    public final void onPrepared(MediaPeriod mediaPeriod) {
        ArrayList arrayList = this.childrenPendingPreparation;
        arrayList.remove(mediaPeriod);
        if (arrayList.isEmpty()) {
            MediaPeriod[] mediaPeriodArr = this.periods;
            int i = 0;
            for (MediaPeriod mediaPeriod2 : mediaPeriodArr) {
                i += mediaPeriod2.getTrackGroups().length;
            }
            TrackGroup[] trackGroupArr = new TrackGroup[i];
            int i2 = 0;
            for (int i3 = 0; i3 < mediaPeriodArr.length; i3++) {
                TrackGroupArray trackGroups = mediaPeriodArr[i3].getTrackGroups();
                int i4 = trackGroups.length;
                int i5 = 0;
                while (i5 < i4) {
                    TrackGroup trackGroup = trackGroups.get(i5);
                    int i6 = trackGroup.length;
                    Format[] formatArr = new Format[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        Format format2 = trackGroup.formats[i7];
                        Format.Builder buildUpon = format2.buildUpon();
                        String str = format2.primaryTrackGroupId;
                        MediaPeriod[] mediaPeriodArr2 = mediaPeriodArr;
                        StringBuilder sb = new StringBuilder();
                        sb.append(i3);
                        sb.append(":");
                        String str2 = format2.id;
                        if (str2 == null) {
                            str2 = "";
                        }
                        sb.append(str2);
                        buildUpon.id = sb.toString();
                        if (str != null) {
                            buildUpon.primaryTrackGroupId = i3 + ":" + str;
                        }
                        formatArr[i7] = new Format(buildUpon);
                        i7++;
                        mediaPeriodArr = mediaPeriodArr2;
                    }
                    MediaPeriod[] mediaPeriodArr3 = mediaPeriodArr;
                    TrackGroup trackGroup2 = new TrackGroup(i3 + ":" + trackGroup.id, formatArr);
                    this.childTrackGroupByMergedTrackGroup.put(trackGroup2, trackGroup);
                    trackGroupArr[i2] = trackGroup2;
                    i5++;
                    i2++;
                    mediaPeriodArr = mediaPeriodArr3;
                }
            }
            this.trackGroups = new TrackGroupArray(trackGroupArr);
            MediaPeriod.Callback callback = this.callback;
            callback.getClass();
            callback.onPrepared(this);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final void prepare(MediaPeriod.Callback callback, long j) {
        this.callback = callback;
        ArrayList arrayList = this.childrenPendingPreparation;
        MediaPeriod[] mediaPeriodArr = this.periods;
        Collections.addAll(arrayList, mediaPeriodArr);
        for (MediaPeriod mediaPeriod : mediaPeriodArr) {
            mediaPeriod.prepare(this, j);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long readDiscontinuity() {
        long j;
        MediaPeriod mediaPeriod;
        MediaPeriod[] mediaPeriodArr = this.enabledPeriods;
        int length = mediaPeriodArr.length;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        int i = 0;
        while (i < length) {
            MediaPeriod mediaPeriod2 = mediaPeriodArr[i];
            long readDiscontinuity = mediaPeriod2.readDiscontinuity();
            if (readDiscontinuity == j2) {
                j = j2;
                if (j3 != j && mediaPeriod2.seekToUs(j3) != j3) {
                    a$$ExternalSyntheticBUOutline0.m$1("Unexpected child seekToUs result.");
                    return 0L;
                }
            } else if (j3 == j2) {
                MediaPeriod[] mediaPeriodArr2 = this.enabledPeriods;
                int length2 = mediaPeriodArr2.length;
                int i2 = 0;
                while (true) {
                    j = j2;
                    if (i2 >= length2 || (mediaPeriod = mediaPeriodArr2[i2]) == mediaPeriod2) {
                        break;
                    }
                    if (mediaPeriod.seekToUs(readDiscontinuity) != readDiscontinuity) {
                        a$$ExternalSyntheticBUOutline0.m$1("Unexpected child seekToUs result.");
                        return 0L;
                    }
                    i2++;
                    j2 = j;
                }
                j3 = readDiscontinuity;
            } else {
                j = j2;
                if (readDiscontinuity != j3) {
                    a$$ExternalSyntheticBUOutline0.m$1("Conflicting discontinuities.");
                    return 0L;
                }
            }
            i++;
            j2 = j;
        }
        return j3;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final void reevaluateBuffer(long j) {
        this.compositeSequenceableLoader.reevaluateBuffer(j);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long seekToUs(long j) {
        long seekToUs = this.enabledPeriods[0].seekToUs(j);
        int i = 1;
        while (true) {
            MediaPeriod[] mediaPeriodArr = this.enabledPeriods;
            if (i >= mediaPeriodArr.length) {
                return seekToUs;
            }
            if (mediaPeriodArr[i].seekToUs(seekToUs) != seekToUs) {
                a$$ExternalSyntheticBUOutline0.m$1("Unexpected child seekToUs result.");
                return 0L;
            }
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod
    public final long selectTracks(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        int[] iArr;
        int[] iArr2 = new int[exoTrackSelectionArr.length];
        int[] iArr3 = new int[exoTrackSelectionArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = exoTrackSelectionArr.length;
            identityHashMap = this.streamPeriodIndices;
            if (i2 >= length) {
                break;
            }
            SampleStream sampleStream = sampleStreamArr[i2];
            Integer num = sampleStream == null ? null : (Integer) identityHashMap.get(sampleStream);
            iArr2[i2] = num == null ? -1 : num.intValue();
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i2];
            if (exoTrackSelection != null) {
                String str = exoTrackSelection.getTrackGroup().id;
                iArr3[i2] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i2] = -1;
            }
            i2++;
        }
        identityHashMap.clear();
        int length2 = exoTrackSelectionArr.length;
        SampleStream[] sampleStreamArr2 = new SampleStream[length2];
        SampleStream[] sampleStreamArr3 = new SampleStream[exoTrackSelectionArr.length];
        ExoTrackSelection[] exoTrackSelectionArr2 = new ExoTrackSelection[exoTrackSelectionArr.length];
        MediaPeriod[] mediaPeriodArr = this.periods;
        ArrayList arrayList = new ArrayList(mediaPeriodArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < mediaPeriodArr.length) {
            int i4 = i;
            while (i4 < exoTrackSelectionArr.length) {
                sampleStreamArr3[i4] = iArr2[i4] == i3 ? sampleStreamArr[i4] : null;
                if (iArr3[i4] == i3) {
                    ExoTrackSelection exoTrackSelection2 = exoTrackSelectionArr[i4];
                    exoTrackSelection2.getClass();
                    iArr = iArr2;
                    TrackGroup trackGroup = (TrackGroup) this.childTrackGroupByMergedTrackGroup.get(exoTrackSelection2.getTrackGroup());
                    trackGroup.getClass();
                    exoTrackSelectionArr2[i4] = new MergingMediaPeriodTrackSelection(exoTrackSelection2, trackGroup);
                } else {
                    iArr = iArr2;
                    exoTrackSelectionArr2[i4] = null;
                }
                i4++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            MediaPeriod[] mediaPeriodArr2 = mediaPeriodArr;
            int i5 = i3;
            long selectTracks = mediaPeriodArr2[i3].selectTracks(exoTrackSelectionArr2, zArr, sampleStreamArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = selectTracks;
            } else if (selectTracks != j2) {
                a$$ExternalSyntheticBUOutline0.m$1("Children enabled at different positions.");
                return 0L;
            }
            boolean z = false;
            for (int i6 = 0; i6 < exoTrackSelectionArr.length; i6++) {
                if (iArr3[i6] == i5) {
                    SampleStream sampleStream2 = sampleStreamArr3[i6];
                    sampleStream2.getClass();
                    sampleStreamArr2[i6] = sampleStreamArr3[i6];
                    identityHashMap.put(sampleStream2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr4[i6] == i5) {
                    Trace.checkState(sampleStreamArr3[i6] == null);
                }
            }
            if (z) {
                arrayList.add(mediaPeriodArr2[i5]);
            }
            i3 = i5 + 1;
            mediaPeriodArr = mediaPeriodArr2;
            iArr2 = iArr4;
            i = 0;
        }
        int i7 = i;
        System.arraycopy(sampleStreamArr2, i7, sampleStreamArr, i7, length2);
        this.enabledPeriods = (MediaPeriod[]) arrayList.toArray(new MediaPeriod[i7]);
        AbstractList transform = Maps.transform(arrayList, new Format$$ExternalSyntheticLambda1(4));
        this.compositeSequenceableLoaderFactory.getClass();
        this.compositeSequenceableLoader = new CompositeSequenceableLoader(arrayList, transform);
        return j2;
    }
}
