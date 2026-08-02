package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.Format;
import androidx.media3.common.TrackGroup;
import androidx.tracing.Trace;
import bo.app.ng$$ExternalSyntheticLambda0;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class FixedTrackSelection implements ExoTrackSelection {
    public final /* synthetic */ int $r8$classId;
    public final Format[] formats;
    public final TrackGroup group;
    public int hashCode;
    public final int length;
    public final int[] tracks;

    public FixedTrackSelection(int i, TrackGroup trackGroup, int[] iArr) {
        Format[] formatArr;
        this.$r8$classId = i;
        Trace.checkState(iArr.length > 0);
        trackGroup.getClass();
        Format[] formatArr2 = trackGroup.formats;
        this.group = trackGroup;
        int length = iArr.length;
        this.length = length;
        this.formats = new Format[length];
        int i2 = 0;
        while (true) {
            int length2 = iArr.length;
            formatArr = this.formats;
            if (i2 >= length2) {
                break;
            }
            formatArr[i2] = formatArr2[iArr[i2]];
            i2++;
        }
        Arrays.sort(formatArr, new ng$$ExternalSyntheticLambda0(7));
        this.tracks = new int[this.length];
        int i3 = 0;
        while (true) {
            int i4 = this.length;
            if (i3 >= i4) {
                long[] jArr = new long[i4];
                return;
            }
            int[] iArr2 = this.tracks;
            Format format2 = this.formats[i3];
            int i5 = 0;
            while (true) {
                if (i5 >= formatArr2.length) {
                    i5 = -1;
                    break;
                } else if (format2 == formatArr2[i5]) {
                    break;
                } else {
                    i5++;
                }
            }
            iArr2[i3] = i5;
            i3++;
        }
    }

    public static void addCheckpoint(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            ImmutableList.Builder builder = (ImmutableList.Builder) arrayList.get(i);
            if (builder != null) {
                builder.m2032add((Object) new AdaptiveTrackSelection$AdaptationCheckpoint(j, jArr[i]));
            }
        }
    }

    private final void disable$androidx$media3$exoplayer$trackselection$AdaptiveTrackSelection() {
    }

    private final void enable$androidx$media3$exoplayer$trackselection$AdaptiveTrackSelection() {
    }

    private final void onPlaybackSpeed$androidx$media3$exoplayer$trackselection$AdaptiveTrackSelection(float f) {
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void disable() {
        int i = this.$r8$classId;
    }

    public final void disable$androidx$media3$exoplayer$trackselection$BaseTrackSelection() {
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void enable() {
        int i = this.$r8$classId;
    }

    public final void enable$androidx$media3$exoplayer$trackselection$BaseTrackSelection() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            FixedTrackSelection fixedTrackSelection = (FixedTrackSelection) obj;
            if (this.group.equals(fixedTrackSelection.group) && Arrays.equals(this.tracks, fixedTrackSelection.tracks)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public final Format getFormat(int i) {
        return this.formats[i];
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public final int getIndexInTrackGroup(int i) {
        return this.tracks[i];
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public final Format getSelectedFormat() {
        return this.formats[0];
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public final int getSelectedIndexInTrackGroup() {
        return this.tracks[0];
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public final TrackGroup getTrackGroup() {
        return this.group;
    }

    public final int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = Arrays.hashCode(this.tracks) + (System.identityHashCode(this.group) * 31);
        }
        return this.hashCode;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public final int indexOf(int i) {
        for (int i2 = 0; i2 < this.length; i2++) {
            if (this.tracks[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public final int length() {
        return this.tracks.length;
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public final void onPlayWhenReadyChanged(boolean z) {
    }

    @Override // androidx.media3.exoplayer.trackselection.ExoTrackSelection
    public void onPlaybackSpeed(float f) {
        int i = this.$r8$classId;
    }

    public final void onPlaybackSpeed$androidx$media3$exoplayer$trackselection$BaseTrackSelection(float f) {
    }
}
