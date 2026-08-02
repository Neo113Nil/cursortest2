package ru.yandex.video.m3.player.observers;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.yandex.video.m3.data.Ad;
import ru.yandex.video.m3.data.AdConfig;
import ru.yandex.video.m3.data.AdMetadata;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.player.AdException;
import ru.yandex.video.m3.player.PreparingParams;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b`\u0018\u00002\u00020\u0001J3\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004j\u0004\u0018\u0001`\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u0018J\u001d\u0010 \u001a\u00020\b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00130\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010$\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J\u0019\u0010&\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b&\u0010%J\u0017\u0010)\u001a\u00020\b2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010\u0018J\u0017\u0010.\u001a\u00020\b2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b0\u0010\u0016J\u000f\u00101\u001a\u00020\bH\u0016¢\u0006\u0004\b1\u0010\u0018J\u000f\u00102\u001a\u00020\bH\u0016¢\u0006\u0004\b2\u0010\u0018J\u000f\u00103\u001a\u00020\bH\u0016¢\u0006\u0004\b3\u0010\u0018J\u000f\u00104\u001a\u00020\bH\u0016¢\u0006\u0004\b4\u0010\u0018J\u000f\u00105\u001a\u00020\bH\u0016¢\u0006\u0004\b5\u0010\u0018¨\u00066À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/observers/InternalPlayerObserver;", "", "Lru/yandex/video/m3/player/PreparingParams;", "preparingParams", "", "", "Lru/yandex/video/m3/data/AdditionalParameters;", "additionalParameters", "Lzy11;", "onPreparingInternal", "(Lru/yandex/video/m3/player/PreparingParams;Ljava/util/Map;)V", "Lru/yandex/video/m3/data/dto/VideoData;", "videoData", "", "startPosition", "", "autoPlay", "onPreparedInternal", "(Lru/yandex/video/m3/data/dto/VideoData;Ljava/lang/Long;Z)V", "Lru/yandex/video/m3/data/Ad;", "ad", "onAdStart", "(Lru/yandex/video/m3/data/Ad;)V", "onAdEnd", "()V", "", "index", "onAdPodStart", "(Lru/yandex/video/m3/data/Ad;I)V", "onAdPodEnd", "", "adList", "onAdListChanged", "(Ljava/util/List;)V", "Lru/yandex/video/m3/data/AdConfig;", "adConfig", "onAdConfigSet", "(Lru/yandex/video/m3/data/AdConfig;)V", "onPreparingWithAdConfig", "Lru/yandex/video/m3/player/AdException;", Constants.KEY_EXCEPTION, "onAdError", "(Lru/yandex/video/m3/player/AdException;)V", "onAdSkipped", "Lru/yandex/video/m3/data/AdMetadata;", "adMetadata", "onAdMetadata", "(Lru/yandex/video/m3/data/AdMetadata;)V", "onAdSkipAvailable", "onEngineBufferingStart", "onEngineBufferingEnd", "onPausePlayback", "onResumePlayback", "onPlayerReleased", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface InternalPlayerObserver {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static void onAdConfigSet(InternalPlayerObserver internalPlayerObserver, AdConfig adConfig) {
            InternalPlayerObserver.super.onAdConfigSet(adConfig);
        }

        @Deprecated
        public static void onAdEnd(InternalPlayerObserver internalPlayerObserver) {
            InternalPlayerObserver.super.onAdEnd();
        }

        @Deprecated
        public static void onAdError(InternalPlayerObserver internalPlayerObserver, AdException adException) {
            InternalPlayerObserver.super.onAdError(adException);
        }

        @Deprecated
        public static void onAdListChanged(InternalPlayerObserver internalPlayerObserver, List<Ad> list) {
            InternalPlayerObserver.super.onAdListChanged(list);
        }

        @Deprecated
        public static void onAdMetadata(InternalPlayerObserver internalPlayerObserver, AdMetadata adMetadata) {
            InternalPlayerObserver.super.onAdMetadata(adMetadata);
        }

        @Deprecated
        public static void onAdPodEnd(InternalPlayerObserver internalPlayerObserver) {
            InternalPlayerObserver.super.onAdPodEnd();
        }

        @Deprecated
        public static void onAdPodStart(InternalPlayerObserver internalPlayerObserver, Ad ad, int i) {
            InternalPlayerObserver.super.onAdPodStart(ad, i);
        }

        @Deprecated
        public static void onAdSkipAvailable(InternalPlayerObserver internalPlayerObserver, Ad ad) {
            InternalPlayerObserver.super.onAdSkipAvailable(ad);
        }

        @Deprecated
        public static void onAdSkipped(InternalPlayerObserver internalPlayerObserver) {
            InternalPlayerObserver.super.onAdSkipped();
        }

        @Deprecated
        public static void onAdStart(InternalPlayerObserver internalPlayerObserver, Ad ad) {
            InternalPlayerObserver.super.onAdStart(ad);
        }

        @Deprecated
        public static void onEngineBufferingEnd(InternalPlayerObserver internalPlayerObserver) {
            InternalPlayerObserver.super.onEngineBufferingEnd();
        }

        @Deprecated
        public static void onEngineBufferingStart(InternalPlayerObserver internalPlayerObserver) {
            InternalPlayerObserver.super.onEngineBufferingStart();
        }

        @Deprecated
        public static void onPausePlayback(InternalPlayerObserver internalPlayerObserver) {
            InternalPlayerObserver.super.onPausePlayback();
        }

        @Deprecated
        public static void onPlayerReleased(InternalPlayerObserver internalPlayerObserver) {
            InternalPlayerObserver.super.onPlayerReleased();
        }

        @Deprecated
        public static void onPreparedInternal(InternalPlayerObserver internalPlayerObserver, VideoData videoData, Long l, boolean z) {
            InternalPlayerObserver.super.onPreparedInternal(videoData, l, z);
        }

        @Deprecated
        public static void onPreparingInternal(InternalPlayerObserver internalPlayerObserver, PreparingParams preparingParams, Map<String, ? extends Object> map) {
            InternalPlayerObserver.super.onPreparingInternal(preparingParams, map);
        }

        @Deprecated
        public static void onPreparingWithAdConfig(InternalPlayerObserver internalPlayerObserver, AdConfig adConfig) {
            InternalPlayerObserver.super.onPreparingWithAdConfig(adConfig);
        }

        @Deprecated
        public static void onResumePlayback(InternalPlayerObserver internalPlayerObserver) {
            InternalPlayerObserver.super.onResumePlayback();
        }
    }

    default void onAdConfigSet(AdConfig adConfig) {
    }

    default void onAdEnd() {
    }

    default void onAdError(AdException exception) {
    }

    default void onAdListChanged(List<Ad> adList) {
    }

    default void onAdMetadata(AdMetadata adMetadata) {
    }

    default void onAdPodEnd() {
    }

    default void onAdPodStart(Ad ad, int index) {
    }

    default void onAdSkipAvailable(Ad ad) {
    }

    default void onAdSkipped() {
    }

    default void onAdStart(Ad ad) {
    }

    default void onEngineBufferingEnd() {
    }

    default void onEngineBufferingStart() {
    }

    default void onPausePlayback() {
    }

    default void onPlayerReleased() {
    }

    default void onPreparedInternal(VideoData videoData, Long startPosition, boolean autoPlay) {
    }

    default void onPreparingInternal(PreparingParams preparingParams, Map<String, ? extends Object> additionalParameters) {
    }

    default void onPreparingWithAdConfig(AdConfig adConfig) {
    }

    default void onResumePlayback() {
    }
}
