package ru.yandex.video.m3.player;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.data.Ad;
import ru.yandex.video.m3.data.PlaybackParameters;
import ru.yandex.video.m3.data.PlaybackStats;
import ru.yandex.video.m3.data.PlaybackViewState;
import ru.yandex.video.m3.data.StreamType;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.player.ad.AdsLoaderHolder;
import ru.yandex.video.m3.player.decoder.YandexCodecManager;
import ru.yandex.video.m3.player.skips.YandexPlayerSkipsManager;
import ru.yandex.video.m3.player.tracking.AdditionalTrackingReporter;
import ru.yandex.video.m3.player.tracks.Track;

@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u0000 \u0081\u0001*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\u0081\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\u00020\u00062\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\fj\u0002`\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0012H&¢\u0006\u0004\b\u0015\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0012H&¢\u0006\u0004\b\u0016\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u001a\u0010\u001eJ\u001d\u0010!\u001a\u00020\u00062\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH&¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0006H&¢\u0006\u0004\b#\u0010$J\u001d\u0010'\u001a\u00020\u00062\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H&¢\u0006\u0004\b'\u0010(J\u001d\u0010)\u001a\u00020\u00062\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H&¢\u0006\u0004\b)\u0010(J\u0017\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*H&¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*H&¢\u0006\u0004\b.\u0010-J\u000f\u0010/\u001a\u00020\u0006H&¢\u0006\u0004\b/\u0010$J\u000f\u00100\u001a\u00020\u0006H&¢\u0006\u0004\b0\u0010$J\u000f\u00101\u001a\u00020\u0006H&¢\u0006\u0004\b1\u0010$J\u000f\u00102\u001a\u00020\u0006H&¢\u0006\u0004\b2\u0010$J\u000f\u00104\u001a\u000203H&¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u000203H&¢\u0006\u0004\b6\u00105J\u000f\u00107\u001a\u000203H&¢\u0006\u0004\b7\u00105J\u000f\u00108\u001a\u000203H&¢\u0006\u0004\b8\u00105J\u000f\u00109\u001a\u000203H&¢\u0006\u0004\b9\u00105J\u000f\u0010:\u001a\u000203H&¢\u0006\u0004\b:\u00105J\u0011\u0010<\u001a\u0004\u0018\u00010;H&¢\u0006\u0004\b<\u0010=J\u0011\u0010>\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b>\u0010?J\u0011\u0010A\u001a\u0004\u0018\u00010@H&¢\u0006\u0004\bA\u0010BJ\u0011\u0010D\u001a\u0004\u0018\u00010CH&¢\u0006\u0004\bD\u0010EJ\u000f\u0010G\u001a\u00020FH&¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020FH&¢\u0006\u0004\bI\u0010HJ\u0017\u0010K\u001a\u00020\u00062\u0006\u0010J\u001a\u000203H&¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\rH&¢\u0006\u0004\bM\u0010?J\u000f\u0010N\u001a\u00020\u0003H&¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u0006H&¢\u0006\u0004\bP\u0010$J\u0017\u0010S\u001a\u00020\u00062\u0006\u0010R\u001a\u00020QH&¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020QH&¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020FH&¢\u0006\u0004\bW\u0010HJ\u0017\u0010Y\u001a\u00020\u00062\u0006\u0010X\u001a\u00020FH&¢\u0006\u0004\bY\u0010ZJ\u0017\u0010\\\u001a\u00020\u00062\u0006\u0010[\u001a\u00020FH&¢\u0006\u0004\b\\\u0010ZJ\u0017\u0010^\u001a\u00020\u00062\u0006\u0010]\u001a\u00020QH&¢\u0006\u0004\b^\u0010TJ\u000f\u0010_\u001a\u00020QH&¢\u0006\u0004\b_\u0010VJ\u000f\u0010`\u001a\u000203H&¢\u0006\u0004\b`\u00105J\u000f\u0010a\u001a\u00020FH&¢\u0006\u0004\ba\u0010HJ\u000f\u0010b\u001a\u00028\u0000H&¢\u0006\u0004\bb\u0010cJ\u0015\u0010f\u001a\b\u0012\u0004\u0012\u00020e0dH&¢\u0006\u0004\bf\u0010gJ\u0011\u0010i\u001a\u0004\u0018\u00010hH&¢\u0006\u0004\bi\u0010jJ\u0011\u0010l\u001a\u0004\u0018\u00010kH&¢\u0006\u0004\bl\u0010mJ\u0017\u0010o\u001a\u00020\u00062\u0006\u0010n\u001a\u00020FH&¢\u0006\u0004\bo\u0010ZJ\u000f\u0010q\u001a\u00020pH&¢\u0006\u0004\bq\u0010rJ\u000f\u0010t\u001a\u00020sH&¢\u0006\u0004\bt\u0010uJ\u0017\u0010x\u001a\u00020\u00062\u0006\u0010w\u001a\u00020vH&¢\u0006\u0004\bx\u0010yJ\u000f\u0010{\u001a\u00020zH&¢\u0006\u0004\b{\u0010|R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~R\u0015\u0010w\u001a\u00020v8&X¦\u0004¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001¨\u0006\u0082\u0001À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/YandexPlayer;", "", CA20Status.STATUS_CERTIFICATE_H, "", "surfaceWidth", "surfaceHeight", "Lzy11;", "setSurfaceSize", "(II)V", "quality", "setServiceQuality", "(I)V", "", "", "Lru/yandex/video/m3/data/AdditionalParameters;", "extraParameters", "appendAdditionalParameters", "(Ljava/util/Map;)V", "Lru/yandex/video/m3/player/tracks/Track;", "getAudioTrack", "()Lru/yandex/video/m3/player/tracks/Track;", "getVideoTrack", "getSubtitlesTrack", "contentId", "Lru/yandex/video/m3/data/PlaybackParameters;", "playbackParameters", "prepare", "(Ljava/lang/String;Lru/yandex/video/m3/data/PlaybackParameters;)V", "Lru/yandex/video/m3/data/dto/VideoData;", "videoData", "(Lru/yandex/video/m3/data/dto/VideoData;Lru/yandex/video/m3/data/PlaybackParameters;)V", "Lru/yandex/video/m3/player/PlayerDelegate;", "playerDelegate", "connectTo", "(Lru/yandex/video/m3/player/PlayerDelegate;)V", "disconnectFromCurrentDelegate", "()V", "Lru/yandex/video/m3/player/PlayerObserver;", "observer", "addObserver", "(Lru/yandex/video/m3/player/PlayerObserver;)V", "removeObserver", "Lru/yandex/video/m3/player/PlayerAnalyticsObserver;", "analyticsObserver", "addAnalyticsObserver", "(Lru/yandex/video/m3/player/PlayerAnalyticsObserver;)V", "removeAnalyticsObserver", "play", "pause", "stop", "stopKeepingDecoders", "", "getPosition", "()J", "getBufferedPosition", "getLiveEdgePosition", "getTimelineLeftEdge", "getContentDuration", "getAvailableWindowDuration", "Lru/yandex/video/m3/data/PlaybackStats;", "getPlaybackStats", "()Lru/yandex/video/m3/data/PlaybackStats;", "getVideoContentId", "()Ljava/lang/String;", "Lru/yandex/video/m3/data/VideoType;", "getVideoType", "()Lru/yandex/video/m3/data/VideoType;", "Lru/yandex/video/m3/data/StreamType;", "getStreamType", "()Lru/yandex/video/m3/data/StreamType;", "", "isPlaying", "()Z", "isPlayingAd", "position", "seekTo", "(J)V", "getVideoSessionId", "getPlayerIndex", "()I", "release", "", "volume", "setVolume", "(F)V", "getVolume", "()F", "isMuted", "muted", "setMuted", "(Z)V", "handleAudioFocus", "setHandleAudioFocus", "speed", "setPlaybackSpeed", "getPlaybackSpeed", "getLiveOffset", "isInLive", "getHidedPlayer", "()Ljava/lang/Object;", "", "Lru/yandex/video/m3/data/Ad;", "getAdsList", "()Ljava/util/List;", "Lru/yandex/video/m3/player/tracking/AdditionalTrackingReporter;", "getAdditionalTrackingReporter", "()Lru/yandex/video/m3/player/tracking/AdditionalTrackingReporter;", "Lru/yandex/video/m3/player/ad/AdsLoaderHolder;", "getAdsLoaderHolder", "()Lru/yandex/video/m3/player/ad/AdsLoaderHolder;", "isFullscreen", "notifyFullscreenModeChanged", "Lru/yandex/video/m3/player/skips/YandexPlayerSkipsManager;", "getSkipsManager", "()Lru/yandex/video/m3/player/skips/YandexPlayerSkipsManager;", "Lru/yandex/video/m3/player/decoder/YandexCodecManager;", "getCodecManager", "()Lru/yandex/video/m3/player/decoder/YandexCodecManager;", "Lru/yandex/video/m3/player/RepeatMode;", "repeatMode", "setRepeatMode", "(Lru/yandex/video/m3/player/RepeatMode;)V", "Lru/yandex/video/m3/data/PlaybackViewState;", "getPlaybackViewState", "()Lru/yandex/video/m3/data/PlaybackViewState;", "getVideoData", "()Lru/yandex/video/m3/data/dto/VideoData;", "getRepeatMode", "()Lru/yandex/video/m3/player/RepeatMode;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface YandexPlayer<H> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final long TIME_CONTENT_DURATION_NOT_PRESENTED = -1;
    public static final long TIME_INF = Long.MIN_VALUE;
    public static final long TIME_UNSET = -9223372036854775807L;
    public static final long TIME_UNSET_DEPRECATED = -1;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/yandex/video/m3/player/YandexPlayer$Companion;", "", "()V", "TIME_CONTENT_DURATION_NOT_PRESENTED", "", "TIME_INF", "TIME_UNSET", "TIME_UNSET_DEPRECATED", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final long TIME_CONTENT_DURATION_NOT_PRESENTED = -1;
        public static final long TIME_INF = Long.MIN_VALUE;
        public static final long TIME_UNSET = -9223372036854775807L;
        public static final long TIME_UNSET_DEPRECATED = -1;

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static <H> String getVideoContentId(YandexPlayer<H> yandexPlayer) {
            return YandexPlayer.super.getVideoContentId();
        }

        @Deprecated
        public static <H> void setServiceQuality(YandexPlayer<H> yandexPlayer, int i) {
            YandexPlayer.super.setServiceQuality(i);
        }
    }

    void addAnalyticsObserver(PlayerAnalyticsObserver analyticsObserver);

    void addObserver(PlayerObserver<? super H> observer);

    void appendAdditionalParameters(Map<String, ? extends Object> extraParameters);

    void connectTo(PlayerDelegate<H> playerDelegate);

    void disconnectFromCurrentDelegate();

    AdditionalTrackingReporter getAdditionalTrackingReporter();

    List<Ad> getAdsList();

    AdsLoaderHolder getAdsLoaderHolder();

    Track getAudioTrack();

    long getAvailableWindowDuration();

    long getBufferedPosition();

    /* renamed from: getCodecManager */
    YandexCodecManager getDecoderManager();

    long getContentDuration();

    H getHidedPlayer();

    long getLiveEdgePosition();

    long getLiveOffset();

    float getPlaybackSpeed();

    PlaybackStats getPlaybackStats();

    PlaybackViewState getPlaybackViewState();

    int getPlayerIndex();

    long getPosition();

    RepeatMode getRepeatMode();

    YandexPlayerSkipsManager getSkipsManager();

    StreamType getStreamType();

    Track getSubtitlesTrack();

    long getTimelineLeftEdge();

    default String getVideoContentId() {
        return null;
    }

    /* renamed from: getVideoData */
    VideoData getVideoDataInternal();

    String getVideoSessionId();

    Track getVideoTrack();

    VideoType getVideoType();

    float getVolume();

    boolean isInLive();

    boolean isMuted();

    boolean isPlaying();

    boolean isPlayingAd();

    void notifyFullscreenModeChanged(boolean isFullscreen);

    void pause();

    void play();

    void prepare(String contentId, PlaybackParameters playbackParameters);

    void prepare(VideoData videoData, PlaybackParameters playbackParameters);

    void release();

    void removeAnalyticsObserver(PlayerAnalyticsObserver analyticsObserver);

    void removeObserver(PlayerObserver<? super H> observer);

    void seekTo(long position);

    void setHandleAudioFocus(boolean handleAudioFocus);

    void setMuted(boolean muted);

    void setPlaybackSpeed(float speed);

    void setRepeatMode(RepeatMode repeatMode);

    default void setServiceQuality(int quality) {
    }

    void setSurfaceSize(int surfaceWidth, int surfaceHeight);

    void setVolume(float volume);

    void stop();

    void stopKeepingDecoders();
}
