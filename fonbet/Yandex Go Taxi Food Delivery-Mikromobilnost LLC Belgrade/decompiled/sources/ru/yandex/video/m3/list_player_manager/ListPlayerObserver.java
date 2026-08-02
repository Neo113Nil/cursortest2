package ru.yandex.video.m3.list_player_manager;

import java.util.List;
import kotlin.Metadata;
import ru.yandex.video.m3.list_player_manager.impl.track.TrackType;
import ru.yandex.video.m3.list_player_manager.impl.track.TrackVariant;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PreparingParams;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\bJ\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\bJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\bJ!\u0010\"\u001a\u00020\u00042\b\b\u0001\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J'\u0010&\u001a\u00020\u00042\b\b\u0001\u0010\u001f\u001a\u00020\u001e2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020 0$H\u0016¢\u0006\u0004\b&\u0010'¨\u0006(À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/list_player_manager/ListPlayerObserver;", "", "Lru/yandex/video/m3/player/PreparingParams;", "params", "Lzy11;", "onPreparingStarted", "(Lru/yandex/video/m3/player/PreparingParams;)V", "onLoadingStart", "()V", "onLoadingFinished", "onReadyForFirstPlayback", "Lru/yandex/video/m3/player/PlaybackException;", "playbackException", "onPlaybackError", "(Lru/yandex/video/m3/player/PlaybackException;)V", "onResumePlayback", "onPausePlayback", "onPlaybackEnded", "", "positionMs", "onPlaybackProgress", "(J)V", "bufferSizeMs", "onBufferSizeChanged", "onNewSourceIsSet", "", "muted", "onMutedChanged", "(Z)V", "onRepeat", "", PlaybackException.ErrorInRenderer.TRACK_TYPE, "Lru/yandex/video/m3/list_player_manager/impl/track/TrackVariant;", "newTrackVariant", "onTrackChanged", "(ILru/yandex/video/m3/list_player_manager/impl/track/TrackVariant;)V", "", "availableTracks", "onAvailableTracksChanged", "(ILjava/util/List;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface ListPlayerObserver {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static void onAvailableTracksChanged(ListPlayerObserver listPlayerObserver, @TrackType int i, List<TrackVariant> list) {
            ListPlayerObserver.super.onAvailableTracksChanged(i, list);
        }

        @Deprecated
        public static void onBufferSizeChanged(ListPlayerObserver listPlayerObserver, long j) {
            ListPlayerObserver.super.onBufferSizeChanged(j);
        }

        @Deprecated
        public static void onLoadingFinished(ListPlayerObserver listPlayerObserver) {
            ListPlayerObserver.super.onLoadingFinished();
        }

        @Deprecated
        public static void onLoadingStart(ListPlayerObserver listPlayerObserver) {
            ListPlayerObserver.super.onLoadingStart();
        }

        @Deprecated
        public static void onMutedChanged(ListPlayerObserver listPlayerObserver, boolean z) {
            ListPlayerObserver.super.onMutedChanged(z);
        }

        @Deprecated
        public static void onNewSourceIsSet(ListPlayerObserver listPlayerObserver) {
            ListPlayerObserver.super.onNewSourceIsSet();
        }

        @Deprecated
        public static void onPausePlayback(ListPlayerObserver listPlayerObserver) {
            ListPlayerObserver.super.onPausePlayback();
        }

        @Deprecated
        public static void onPlaybackEnded(ListPlayerObserver listPlayerObserver) {
            ListPlayerObserver.super.onPlaybackEnded();
        }

        @Deprecated
        public static void onPlaybackError(ListPlayerObserver listPlayerObserver, PlaybackException playbackException) {
            ListPlayerObserver.super.onPlaybackError(playbackException);
        }

        @Deprecated
        public static void onPlaybackProgress(ListPlayerObserver listPlayerObserver, long j) {
            ListPlayerObserver.super.onPlaybackProgress(j);
        }

        @Deprecated
        public static void onPreparingStarted(ListPlayerObserver listPlayerObserver, PreparingParams preparingParams) {
            ListPlayerObserver.super.onPreparingStarted(preparingParams);
        }

        @Deprecated
        public static void onReadyForFirstPlayback(ListPlayerObserver listPlayerObserver) {
            ListPlayerObserver.super.onReadyForFirstPlayback();
        }

        @Deprecated
        public static void onRepeat(ListPlayerObserver listPlayerObserver) {
            ListPlayerObserver.super.onRepeat();
        }

        @Deprecated
        public static void onResumePlayback(ListPlayerObserver listPlayerObserver) {
            ListPlayerObserver.super.onResumePlayback();
        }

        @Deprecated
        public static void onTrackChanged(ListPlayerObserver listPlayerObserver, @TrackType int i, TrackVariant trackVariant) {
            ListPlayerObserver.super.onTrackChanged(i, trackVariant);
        }
    }

    default void onAvailableTracksChanged(@TrackType int trackType, List<TrackVariant> availableTracks) {
    }

    default void onBufferSizeChanged(long bufferSizeMs) {
    }

    default void onLoadingFinished() {
    }

    default void onLoadingStart() {
    }

    default void onMutedChanged(boolean muted) {
    }

    default void onNewSourceIsSet() {
    }

    default void onPausePlayback() {
    }

    default void onPlaybackEnded() {
    }

    default void onPlaybackError(PlaybackException playbackException) {
    }

    default void onPlaybackProgress(long positionMs) {
    }

    default void onPreparingStarted(PreparingParams params) {
    }

    default void onReadyForFirstPlayback() {
    }

    default void onRepeat() {
    }

    default void onResumePlayback() {
    }

    default void onTrackChanged(@TrackType int trackType, TrackVariant newTrackVariant) {
    }
}
