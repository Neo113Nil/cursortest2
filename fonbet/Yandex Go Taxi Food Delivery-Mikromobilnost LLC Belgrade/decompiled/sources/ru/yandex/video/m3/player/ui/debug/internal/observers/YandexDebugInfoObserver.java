package ru.yandex.video.m3.player.ui.debug.internal.observers;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.ui.debug.model.AudioTrackData;
import ru.yandex.video.m3.player.ui.debug.model.BytesLoaded;
import ru.yandex.video.m3.player.ui.debug.model.CurrentStreamType;
import ru.yandex.video.m3.player.ui.debug.model.CurrentVideoType;
import ru.yandex.video.m3.player.ui.debug.model.DecoderData;
import ru.yandex.video.m3.player.ui.debug.model.DrmMode;
import ru.yandex.video.m3.player.ui.debug.model.Size;
import ru.yandex.video.m3.player.ui.debug.model.SubtitlesTrackData;
import ru.yandex.video.m3.player.ui.debug.model.VideoTrackData;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020\u001dH\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b.\u0010-J\u001f\u00100\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0016¢\u0006\u0004\b0\u0010!J\u0017\u00103\u001a\u00020\u00042\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\u00042\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u00042\u0006\u00109\u001a\u00020\u0002H\u0016¢\u0006\u0004\b:\u0010\u0006¨\u0006;À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/internal/observers/YandexDebugInfoObserver;", "", "", "contentId", "Lzy11;", "onContentIdInitialized", "(Ljava/lang/String;)V", "Lru/yandex/video/m3/player/ui/debug/model/CurrentVideoType;", "videoType", "Lru/yandex/video/m3/player/ui/debug/model/CurrentStreamType;", "streamType", "onVideoAndStreamTypeInitialized", "(Lru/yandex/video/m3/player/ui/debug/model/CurrentVideoType;Lru/yandex/video/m3/player/ui/debug/model/CurrentStreamType;)V", "Lru/yandex/video/m3/player/ui/debug/model/VideoTrackData;", "videoTrackData", "onVideoTrackChanged", "(Lru/yandex/video/m3/player/ui/debug/model/VideoTrackData;)V", "Lru/yandex/video/m3/player/ui/debug/model/AudioTrackData;", "audioTrackData", "onAudioTrackChanged", "(Lru/yandex/video/m3/player/ui/debug/model/AudioTrackData;)V", "Lru/yandex/video/m3/player/ui/debug/model/SubtitlesTrackData;", "subtitlesTrackData", "onSubtitlesTrackChanged", "(Lru/yandex/video/m3/player/ui/debug/model/SubtitlesTrackData;)V", "Lru/yandex/video/m3/player/ui/debug/model/DrmMode;", "drmMode", "onDrmInitialized", "(Lru/yandex/video/m3/player/ui/debug/model/DrmMode;)V", "", "estimationBytes", ClidProvider.TIMESTAMP, "onBandwidthEstimated", "(JJ)V", "Lru/yandex/video/m3/player/ui/debug/model/BytesLoaded;", "bytesLoaded", "onBytesLoaded", "(Lru/yandex/video/m3/player/ui/debug/model/BytesLoaded;)V", "", "isSuccessful", "onChunkLoadAttempt", "(ZJ)V", "Lru/yandex/video/m3/player/ui/debug/model/DecoderData;", "videoDecoderData", "onVideoDecoderUpdated", "(Lru/yandex/video/m3/player/ui/debug/model/DecoderData;)V", "onAudioDecoderUpdated", "sizeMs", "onBufferSizeChanged", "", "count", "onFramesDropped", "(I)V", "Lru/yandex/video/m3/player/ui/debug/model/Size;", "size", "onViewportSizeChanged", "(Lru/yandex/video/m3/player/ui/debug/model/Size;)V", Constants.KEY_MESSAGE, "onError", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface YandexDebugInfoObserver {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void onAudioDecoderUpdated(YandexDebugInfoObserver yandexDebugInfoObserver, DecoderData decoderData) {
            YandexDebugInfoObserver.super.onAudioDecoderUpdated(decoderData);
        }

        @Deprecated
        public static void onAudioTrackChanged(YandexDebugInfoObserver yandexDebugInfoObserver, AudioTrackData audioTrackData) {
            YandexDebugInfoObserver.super.onAudioTrackChanged(audioTrackData);
        }

        @Deprecated
        public static void onBandwidthEstimated(YandexDebugInfoObserver yandexDebugInfoObserver, long j, long j2) {
            YandexDebugInfoObserver.super.onBandwidthEstimated(j, j2);
        }

        @Deprecated
        public static void onBufferSizeChanged(YandexDebugInfoObserver yandexDebugInfoObserver, long j, long j2) {
            YandexDebugInfoObserver.super.onBufferSizeChanged(j, j2);
        }

        @Deprecated
        public static void onBytesLoaded(YandexDebugInfoObserver yandexDebugInfoObserver, BytesLoaded bytesLoaded) {
            YandexDebugInfoObserver.super.onBytesLoaded(bytesLoaded);
        }

        @Deprecated
        public static void onChunkLoadAttempt(YandexDebugInfoObserver yandexDebugInfoObserver, boolean z, long j) {
            YandexDebugInfoObserver.super.onChunkLoadAttempt(z, j);
        }

        @Deprecated
        public static void onContentIdInitialized(YandexDebugInfoObserver yandexDebugInfoObserver, String str) {
            YandexDebugInfoObserver.super.onContentIdInitialized(str);
        }

        @Deprecated
        public static void onDrmInitialized(YandexDebugInfoObserver yandexDebugInfoObserver, DrmMode drmMode) {
            YandexDebugInfoObserver.super.onDrmInitialized(drmMode);
        }

        @Deprecated
        public static void onError(YandexDebugInfoObserver yandexDebugInfoObserver, String str) {
            YandexDebugInfoObserver.super.onError(str);
        }

        @Deprecated
        public static void onFramesDropped(YandexDebugInfoObserver yandexDebugInfoObserver, int i) {
            YandexDebugInfoObserver.super.onFramesDropped(i);
        }

        @Deprecated
        public static void onSubtitlesTrackChanged(YandexDebugInfoObserver yandexDebugInfoObserver, SubtitlesTrackData subtitlesTrackData) {
            YandexDebugInfoObserver.super.onSubtitlesTrackChanged(subtitlesTrackData);
        }

        @Deprecated
        public static void onVideoAndStreamTypeInitialized(YandexDebugInfoObserver yandexDebugInfoObserver, CurrentVideoType currentVideoType, CurrentStreamType currentStreamType) {
            YandexDebugInfoObserver.super.onVideoAndStreamTypeInitialized(currentVideoType, currentStreamType);
        }

        @Deprecated
        public static void onVideoDecoderUpdated(YandexDebugInfoObserver yandexDebugInfoObserver, DecoderData decoderData) {
            YandexDebugInfoObserver.super.onVideoDecoderUpdated(decoderData);
        }

        @Deprecated
        public static void onVideoTrackChanged(YandexDebugInfoObserver yandexDebugInfoObserver, VideoTrackData videoTrackData) {
            YandexDebugInfoObserver.super.onVideoTrackChanged(videoTrackData);
        }

        @Deprecated
        public static void onViewportSizeChanged(YandexDebugInfoObserver yandexDebugInfoObserver, Size size) {
            YandexDebugInfoObserver.super.onViewportSizeChanged(size);
        }
    }

    default void onAudioDecoderUpdated(DecoderData videoDecoderData) {
    }

    default void onAudioTrackChanged(AudioTrackData audioTrackData) {
    }

    default void onBandwidthEstimated(long estimationBytes, long timestamp) {
    }

    default void onBufferSizeChanged(long sizeMs, long timestamp) {
    }

    default void onBytesLoaded(BytesLoaded bytesLoaded) {
    }

    default void onChunkLoadAttempt(boolean isSuccessful, long timestamp) {
    }

    default void onContentIdInitialized(String contentId) {
    }

    default void onDrmInitialized(DrmMode drmMode) {
    }

    default void onError(String message) {
    }

    default void onFramesDropped(int count) {
    }

    default void onSubtitlesTrackChanged(SubtitlesTrackData subtitlesTrackData) {
    }

    default void onVideoAndStreamTypeInitialized(CurrentVideoType videoType, CurrentStreamType streamType) {
    }

    default void onVideoDecoderUpdated(DecoderData videoDecoderData) {
    }

    default void onVideoTrackChanged(VideoTrackData videoTrackData) {
    }

    default void onViewportSizeChanged(Size size) {
    }
}
