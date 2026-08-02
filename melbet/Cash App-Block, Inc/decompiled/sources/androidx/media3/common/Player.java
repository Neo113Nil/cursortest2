package androidx.media3.common;

import android.util.SparseBooleanArray;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.tracing.Trace;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public interface Player {

    public final class Commands {
        public final FlagSet flags;

        static {
            new SparseBooleanArray();
            Trace.checkState(!false);
            Util.intToStringMaxRadix(0);
        }

        public Commands(FlagSet flagSet) {
            this.flags = flagSet;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Commands) {
                return this.flags.equals(((Commands) obj).flags);
            }
            return false;
        }

        public final int hashCode() {
            return this.flags.flags.hashCode();
        }
    }

    public final class Events {
        public final FlagSet flags;

        public Events(FlagSet flagSet) {
            this.flags = flagSet;
        }

        public final boolean containsAny(int... iArr) {
            for (int i : iArr) {
                if (this.flags.flags.get(i)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Events) {
                return this.flags.equals(((Events) obj).flags);
            }
            return false;
        }

        public final int hashCode() {
            return this.flags.flags.hashCode();
        }
    }

    public interface Listener {
        default void onAudioSessionIdChanged(int i) {
        }

        default void onAvailableCommandsChanged(Commands commands) {
        }

        default void onCues(CueGroup cueGroup) {
        }

        default void onCues(List list) {
        }

        default void onEvents(ExoPlayerImpl exoPlayerImpl, Events events) {
        }

        default void onIsLoadingChanged(boolean z) {
        }

        default void onIsPlayingChanged(boolean z) {
        }

        default void onMediaItemTransition(MediaItem mediaItem, int i) {
        }

        default void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        }

        default void onMetadata(Metadata metadata) {
        }

        default void onPlayWhenReadyChanged(int i, boolean z) {
        }

        default void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        }

        default void onPlaybackStateChanged(int i) {
        }

        default void onPlaybackSuppressionReasonChanged(int i) {
        }

        default void onPlayerError(PlaybackException playbackException) {
        }

        default void onPlayerErrorChanged(PlaybackException playbackException) {
        }

        default void onPlayerStateChanged(int i, boolean z) {
        }

        default void onPositionDiscontinuity(int i, PositionInfo positionInfo, PositionInfo positionInfo2) {
        }

        default void onRenderedFirstFrame() {
        }

        default void onRepeatModeChanged(int i) {
        }

        default void onShuffleModeEnabledChanged(boolean z) {
        }

        default void onSkipSilenceEnabledChanged(boolean z) {
        }

        default void onSurfaceSizeChanged(int i, int i2) {
        }

        default void onTimelineChanged(int i) {
        }

        default void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
        }

        default void onTracksChanged(Tracks tracks) {
        }

        default void onVideoSizeChanged(VideoSize videoSize) {
        }

        default void onVolumeChanged(float f) {
        }
    }

    public final class PositionInfo {
        public final int adGroupIndex;
        public final int adIndexInAdGroup;
        public final long contentPositionMs;
        public final MediaItem mediaItem;
        public final int mediaItemIndex;
        public final int periodIndex;
        public final Object periodUid;
        public final long positionMs;
        public final Object windowUid;

        static {
            Fragment$5$$ExternalSyntheticOutline0.m$1(0, 1, 2, 3, 4);
            Util.intToStringMaxRadix(5);
            Util.intToStringMaxRadix(6);
        }

        public PositionInfo(Object obj, int i, MediaItem mediaItem, Object obj2, int i2, long j, long j2, int i3, int i4) {
            Trace.checkArgument(i >= 0);
            Trace.checkArgument(i2 >= 0);
            this.windowUid = obj;
            this.mediaItemIndex = i;
            this.mediaItem = mediaItem;
            this.periodUid = obj2;
            this.periodIndex = i2;
            this.positionMs = j;
            this.contentPositionMs = j2;
            this.adGroupIndex = i3;
            this.adIndexInAdGroup = i4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PositionInfo.class == obj.getClass()) {
                PositionInfo positionInfo = (PositionInfo) obj;
                if (this.mediaItemIndex == positionInfo.mediaItemIndex && this.periodIndex == positionInfo.periodIndex && this.positionMs == positionInfo.positionMs && this.contentPositionMs == positionInfo.contentPositionMs && this.adGroupIndex == positionInfo.adGroupIndex && this.adIndexInAdGroup == positionInfo.adIndexInAdGroup && Objects.equals(this.mediaItem, positionInfo.mediaItem) && Objects.equals(this.windowUid, positionInfo.windowUid) && Objects.equals(this.periodUid, positionInfo.periodUid)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(this.windowUid, Integer.valueOf(this.mediaItemIndex), this.mediaItem, this.periodUid, Integer.valueOf(this.periodIndex), Long.valueOf(this.positionMs), Long.valueOf(this.contentPositionMs), Integer.valueOf(this.adGroupIndex), Integer.valueOf(this.adIndexInAdGroup));
        }

        public final String toString() {
            String str = "mediaItem=" + this.mediaItemIndex + ", period=" + this.periodIndex + ", pos=" + this.positionMs;
            int i = this.adGroupIndex;
            if (i == -1) {
                return str;
            }
            StringBuilder m108m = Recorder$$ExternalSyntheticOutline2.m108m(str, ", contentPos=");
            m108m.append(this.contentPositionMs);
            m108m.append(", adGroup=");
            m108m.append(i);
            m108m.append(", ad=");
            m108m.append(this.adIndexInAdGroup);
            return m108m.toString();
        }
    }
}
