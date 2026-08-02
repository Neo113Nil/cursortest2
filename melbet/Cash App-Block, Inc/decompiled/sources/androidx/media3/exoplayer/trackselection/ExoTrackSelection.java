package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.Format;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Log;

/* loaded from: classes3.dex */
public interface ExoTrackSelection {

    public final class Definition {
        public final TrackGroup group;
        public final int[] tracks;

        public Definition(TrackGroup trackGroup, int... iArr) {
            if (iArr.length == 0) {
                Log.e("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.group = trackGroup;
            this.tracks = iArr;
        }
    }

    void disable();

    void enable();

    Format getFormat(int i);

    int getIndexInTrackGroup(int i);

    Format getSelectedFormat();

    int getSelectedIndexInTrackGroup();

    TrackGroup getTrackGroup();

    int indexOf(int i);

    int length();

    default void onDiscontinuity() {
    }

    void onPlayWhenReadyChanged(boolean z);

    void onPlaybackSpeed(float f);

    default void onRebuffer() {
    }
}
