package androidx.media3.exoplayer.trackselection;

import androidx.media3.exoplayer.source.TrackGroupArray;

/* loaded from: classes3.dex */
public final class MappingTrackSelector$MappedTrackInfo {
    public final int rendererCount;
    public final int[][][] rendererFormatSupports;
    public final int[] rendererMixedMimeTypeAdaptiveSupports;
    public final TrackGroupArray[] rendererTrackGroups;
    public final int[] rendererTrackTypes;
    public final TrackGroupArray unmappedTrackGroups;

    public MappingTrackSelector$MappedTrackInfo(int[] iArr, TrackGroupArray[] trackGroupArrayArr, int[] iArr2, int[][][] iArr3, TrackGroupArray trackGroupArray) {
        this.rendererTrackTypes = iArr;
        this.rendererTrackGroups = trackGroupArrayArr;
        this.rendererFormatSupports = iArr3;
        this.rendererMixedMimeTypeAdaptiveSupports = iArr2;
        this.unmappedTrackGroups = trackGroupArray;
        this.rendererCount = iArr.length;
    }
}
