package ru.yandex.video.m3.player;

import defpackage.g8e;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.qv10;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Result;
import ru.yandex.video.m3.data.Ad;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.data.dto.VideoDataSerializer;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.drm.PrepareDrm;
import ru.yandex.video.m3.player.tracking.BaseVideoDataSerializer;
import ru.yandex.video.m3.player.tracks.Track;
import ru.yandex.video.m3.player.tracks.TrackType;
import ru.yandex.video.m3.player.utils.PlayerLogger;
import ru.yandex.video.m3.player.utils.PlayerLoggerExtensionsKt;
import ru.yandex.video.m3.player.utils.ResourceProvider;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 f*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001fB#\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010$\u001a\u00020#2\n\u0010 \u001a\u0006\u0012\u0002\b\u00030\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b$\u0010%J\u0019\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010\f\u001a\u00028\u0000H\u0017¢\u0006\u0004\b'\u0010(J+\u0010-\u001a\u00020\u00112\u001a\u0010,\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020*\u0018\u00010)j\u0004\u0018\u0001`+H\u0016¢\u0006\u0004\b-\u0010.J)\u0010/\u001a\u00020\u00112\u0006\u0010\f\u001a\u00028\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b/\u0010\u0013J\u000f\u00100\u001a\u00020\u0011H\u0017¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0011H\u0016¢\u0006\u0004\b2\u00101J\u0017\u00104\u001a\u00020\u00112\u0006\u00103\u001a\u00020\rH\u0016¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\u000f2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0011H\u0016¢\u0006\u0004\b:\u00101J\u000f\u0010;\u001a\u00020\u0011H\u0017¢\u0006\u0004\b;\u00101J\u0019\u0010<\u001a\u0004\u0018\u00010\u00182\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b>\u0010?J#\u0010A\u001a\u0004\u0018\u00010\r2\b\u0010@\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u0011H\u0016¢\u0006\u0004\bC\u00101J\u000f\u0010D\u001a\u00020\u0011H\u0016¢\u0006\u0004\bD\u00101J\u001f\u0010G\u001a\u00020\u00112\u0006\u0010E\u001a\u00020\u00182\u0006\u0010F\u001a\u00020\u000fH\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010K\u001a\u00020\u00112\u0006\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u0011H\u0016¢\u0006\u0004\bM\u00101J\u001f\u0010P\u001a\u00020\u00112\u0006\u0010J\u001a\u00020I2\u0006\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\u0011H\u0016¢\u0006\u0004\bR\u00101J\u0017\u0010U\u001a\u00020\u00112\u0006\u0010T\u001a\u00020SH\u0016¢\u0006\u0004\bU\u0010VJ\u0017\u0010X\u001a\u00020\u00112\u0006\u0010W\u001a\u00020\u000fH\u0016¢\u0006\u0004\bX\u0010YJ\u0017\u0010\\\u001a\u00020\u00112\u0006\u0010Z\u001a\u00020\u000fH\u0000¢\u0006\u0004\b[\u0010YR\u001e\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0005\u0010]\u001a\u0004\b^\u0010_R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010`R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010aR\u0014\u0010c\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010Z\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010e¨\u0006g"}, d2 = {"Lru/yandex/video/m3/player/BasePlayerStrategy;", "Lru/yandex/video/m3/data/dto/VideoData;", "T", "Lru/yandex/video/m3/player/PlayerStrategy;", "Lru/yandex/video/m3/player/YandexPlayer;", "player", "Lru/yandex/video/m3/player/utils/ResourceProvider;", "resourceProvider", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "playerLogger", "<init>", "(Lru/yandex/video/m3/player/YandexPlayer;Lru/yandex/video/m3/player/utils/ResourceProvider;Lru/yandex/video/m3/player/utils/PlayerLogger;)V", "videoData", "", "startPosition", "", "autoPlay", "Lzy11;", "onPreparedInternal$video_player_internalRelease", "(Lru/yandex/video/m3/data/dto/VideoData;Ljava/lang/Long;Z)V", "onPreparedInternal", "Lru/yandex/video/m3/data/dto/VideoDataSerializer;", "getVideoDataSerializer", "()Lru/yandex/video/m3/data/dto/VideoDataSerializer;", "", "contentId", "Ljava/util/concurrent/Future;", "prepareVideoData", "(Ljava/lang/String;)Ljava/util/concurrent/Future;", "reloadVideoData", "()Z", "Lru/yandex/video/m3/player/PlayerDelegate;", "playerDelegate", "Lru/yandex/video/m3/player/tracks/TrackType;", PlaybackException.ErrorInRenderer.TRACK_TYPE, "Lru/yandex/video/m3/player/tracks/Track;", "prepareTrack", "(Lru/yandex/video/m3/player/PlayerDelegate;Lru/yandex/video/m3/player/tracks/TrackType;Lru/yandex/video/m3/data/dto/VideoData;)Lru/yandex/video/m3/player/tracks/Track;", "Lru/yandex/video/m3/player/drm/PrepareDrm;", "prepareDrm", "(Lru/yandex/video/m3/data/dto/VideoData;)Lru/yandex/video/m3/player/drm/PrepareDrm;", "", "", "Lru/yandex/video/m3/data/AdditionalParameters;", "additionalParameters", "onPreparing", "(Ljava/util/Map;)V", "onPrepared", "onResumePlayback", "()V", "onPausePlayback", "position", "onPlaybackProgress", "(J)V", "Lru/yandex/video/m3/player/PlaybackException;", "playbackException", "onPlaybackError", "(Lru/yandex/video/m3/player/PlaybackException;)Z", "onSeek", "onRelease", "getContentId", "(Lru/yandex/video/m3/data/dto/VideoData;)Ljava/lang/String;", "isDrmProxyMode", "(Lru/yandex/video/m3/data/dto/VideoData;)Z", "userAskedStartPosition", "getStartPosition", "(Ljava/lang/Long;Lru/yandex/video/m3/data/dto/VideoData;)Ljava/lang/Long;", "onBufferingStart", "onBufferingEnd", "url", "autoplay", "onNewMediaItem", "(Ljava/lang/String;Z)V", "Lru/yandex/video/m3/data/Ad;", "ad", "onAdStart", "(Lru/yandex/video/m3/data/Ad;)V", "onAdEnd", "", "index", "onAdPodStart", "(Lru/yandex/video/m3/data/Ad;I)V", "onAdPodEnd", "Lru/yandex/video/m3/player/AdException;", Constants.KEY_EXCEPTION, "onAdError", "(Lru/yandex/video/m3/player/AdException;)V", "isFullscreen", "onFullscreenInfoUpdated", "(Z)V", "experimentalDoAutoPlayLogicInsidePlayer", "setExperimentalDoAutoPlayLogicInsidePlayer$video_player_internalRelease", "setExperimentalDoAutoPlayLogicInsidePlayer", "Lru/yandex/video/m3/player/YandexPlayer;", "getPlayer", "()Lru/yandex/video/m3/player/YandexPlayer;", "Lru/yandex/video/m3/player/utils/ResourceProvider;", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "countReloadVideoDataToResumePlayback", "Ljava/util/concurrent/atomic/AtomicInteger;", "Z", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class BasePlayerStrategy<T extends VideoData> implements PlayerStrategy<T> {
    private static final String DIAGNOSTIC_ERROR_EXPIRED_SIGNATURE = "EXPIRED_SIGNATURE";
    private static final int MAX_REPLAY_COUNT_ON_ERROR = 1;
    private static final String TAG = "BasePlayerStrategy";
    private final AtomicInteger countReloadVideoDataToResumePlayback = new AtomicInteger(0);
    private boolean experimentalDoAutoPlayLogicInsidePlayer;
    private final YandexPlayer<?> player;
    private final PlayerLogger playerLogger;
    private final ResourceProvider resourceProvider;
    public static final int $stable = 8;

    public BasePlayerStrategy(YandexPlayer<?> yandexPlayer, ResourceProvider resourceProvider, PlayerLogger playerLogger) {
        this.player = yandexPlayer;
        this.resourceProvider = resourceProvider;
        this.playerLogger = playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            PlayerLogger.verbose$default(playerLogger, TAG, "init", null, new Object[]{"getVideoSessionId=" + yandexPlayer.getVideoSessionId()}, 4, null);
        }
    }

    public String getContentId(T videoData) {
        return null;
    }

    public final YandexPlayer<?> getPlayer() {
        return this.player;
    }

    @Override // ru.yandex.video.m3.player.PlayerStrategy
    public Long getStartPosition(Long userAskedStartPosition, T videoData) {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            PlayerLogger.verbose$default(playerLogger, TAG, "getStartPosition", null, new Object[]{"userAskedStartPosition=" + userAskedStartPosition}, 4, null);
        }
        return userAskedStartPosition;
    }

    public VideoDataSerializer getVideoDataSerializer() {
        return BaseVideoDataSerializer.INSTANCE.getINSTANCE();
    }

    public boolean isDrmProxyMode(T videoData) {
        return true;
    }

    @Override // ru.yandex.video.m3.player.PlayerStrategy
    public void onAdEnd() {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            PlayerLogger.verbose$default(playerLogger, TAG, "onAdEnd", null, new Object[0], 4, null);
        }
    }

    @Override // ru.yandex.video.m3.player.PlayerStrategy
    public void onAdError(AdException exception) {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            PlayerLogger.verbose$default(playerLogger, TAG, "onAdError", null, new Object[]{"exception=" + exception}, 4, null);
        }
    }

    @Override // ru.yandex.video.m3.player.PlayerStrategy
    public void onAdPodEnd() {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            PlayerLogger.verbose$default(playerLogger, TAG, "onAdPodEnd", null, new Object[0], 4, null);
        }
    }

    @Override // ru.yandex.video.m3.player.PlayerStrategy
    public void onAdPodStart(Ad ad, int index) {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            PlayerLogger.verbose$default(playerLogger, TAG, "onAdPodStart", null, new Object[]{"ad=" + ad, oyr.i(index, "index: ")}, 4, null);
        }
    }

    @Override // ru.yandex.video.m3.player.PlayerStrategy
    public void onAdStart(Ad ad) {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            PlayerLogger.verbose$default(playerLogger, TAG, "onAdStart", null, new Object[]{"ad=" + ad}, 4, null);
        }
    }

    @Override // ru.yandex.video.m3.player.PlayerStrategy
    public void onBufferingEnd() {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            PlayerLogger.verbose$default(playerLogger, TAG, "onBufferingEnd", null, new Object[0], 4, null);
        }
    }

    @Override // ru.yandex.video.m3.player.PlayerStrategy
    public void onBufferingStart() {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            PlayerLogger.verbose$default(playerLogger, TAG, "onBufferingStart", null, new Object[0], 4, null);
        }
    }

    @Override // ru.yandex.video.m3.player.PlayerStrategy
    public void onFullscreenInfoUpdated(boolean isFullscreen) {
    }

    @Override // ru.yandex.video.m3.player.PlayerStrategy
    public void onNewMediaItem(String url, boolean autoplay) {
    }

    @Override // ru.yandex.video.m3.player.PlayerStrategy
    public void onPausePlayback() {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            PlayerLogger.verbose$default(playerLogger, TAG, "onPausePlayback", null, new Object[0], 4, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.yandex.video.m3.player.PlayerStrategy
    public boolean onPlaybackError(PlaybackException playbackException) {
        Object failure;
        Object failure2;
        this.playerLogger.error(TAG, "onPlaybackError", "received", playbackException, new Object[0]);
        if (!(playbackException instanceof PlaybackException.DrmThrowable.ErrorKeysExpired ? true : playbackException instanceof PlaybackException.DrmThrowable.ErrorAuthentication)) {
            if (playbackException instanceof PlaybackException.ErrorConnection.UnavailableForLegalReasons ? true : playbackException instanceof PlaybackException.ErrorConnection.Forbidden ? true : playbackException instanceof PlaybackException.ErrorConnection.Unauthorized) {
                return this.countReloadVideoDataToResumePlayback.incrementAndGet() > 1 || !reloadVideoData();
            }
            if (!(playbackException instanceof PlaybackException.DrmThrowable.ErrorDiagnosticFatal)) {
                PlayerLogger playerLogger = this.playerLogger;
                if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
                    playerLogger.verbose(TAG, "onPlaybackError", "Do nothing", new Object[0]);
                }
                return true;
            }
            if (!jl40.l(((PlaybackException.DrmThrowable.ErrorDiagnosticFatal) playbackException).getError(), DIAGNOSTIC_ERROR_EXPIRED_SIGNATURE) || this.countReloadVideoDataToResumePlayback.incrementAndGet() > 1 || !reloadVideoData()) {
                return true;
            }
            PlayerLogger playerLogger2 = this.playerLogger;
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger2)) {
                playerLogger2.verbose(TAG, "onPlaybackError", "prepare on EXPIRED_SIGNATURE fatal diagnostic error", new Object[0]);
            }
            return false;
        }
        try {
            failure = Boolean.valueOf(isDrmProxyMode(this.player.getVideoDataInternal()));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Boolean bool = (Boolean) failure;
        if (this.countReloadVideoDataToResumePlayback.incrementAndGet() > 1 || !jl40.l(bool, Boolean.TRUE) || !reloadVideoData()) {
            PlayerLogger playerLogger3 = this.playerLogger;
            if (PlayerLoggerExtensionsKt.getEnabled(playerLogger3)) {
                playerLogger3.verbose(TAG, "onPlaybackError", "player.stop()", new Object[0]);
            }
            this.player.stop();
            return true;
        }
        try {
            failure2 = getContentId(this.player.getVideoDataInternal());
        } catch (Throwable th2) {
            failure2 = new Result.Failure(th2);
        }
        String str = (String) (failure2 instanceof Result.Failure ? null : failure2);
        PlayerLogger playerLogger4 = this.playerLogger;
        if (!PlayerLoggerExtensionsKt.getEnabled(playerLogger4)) {
            return false;
        }
        playerLogger4.verbose(TAG, "onPlaybackError", "re-preparing", g8e.o("contentId=", str));
        return false;
    }

    @Override // ru.yandex.video.m3.player.PlayerStrategy
    public void onPlaybackProgress(long position) {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            PlayerLogger.verbose$default(playerLogger, TAG, "onPlaybackProgress", null, new Object[]{qv10.j(position, "position=")}, 4, null);
        }
    }

    public void onPrepared(T videoData, Long startPosition, boolean autoPlay) {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            PlayerLogger.verbose$default(playerLogger, TAG, "onPrepared", null, new Object[0], 4, null);
        }
        if (this.experimentalDoAutoPlayLogicInsidePlayer) {
            return;
        }
        YandexPlayer<?> yandexPlayer = this.player;
        if (autoPlay) {
            yandexPlayer.play();
        } else {
            yandexPlayer.pause();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onPreparedInternal$video_player_internalRelease(VideoData videoData, Long startPosition, boolean autoPlay) throws ClassCastException {
        onPrepared(videoData, startPosition, autoPlay);
    }

    public void onPreparing(Map<String, ? extends Object> additionalParameters) {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            PlayerLogger.verbose$default(playerLogger, TAG, "onPreparing", null, new Object[0], 4, null);
        }
    }

    public void onRelease() {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            PlayerLogger.verbose$default(playerLogger, TAG, "onRelease", null, new Object[0], 4, null);
        }
    }

    @Override // ru.yandex.video.m3.player.PlayerStrategy
    public void onResumePlayback() {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            PlayerLogger.verbose$default(playerLogger, TAG, "onResumePlayback", null, new Object[0], 4, null);
        }
        this.countReloadVideoDataToResumePlayback.set(0);
    }

    @Override // ru.yandex.video.m3.player.PlayerStrategy
    public void onSeek() {
        PlayerLogger playerLogger = this.playerLogger;
        if (PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            PlayerLogger.verbose$default(playerLogger, TAG, "onSeek", null, new Object[0], 4, null);
        }
    }

    @Override // ru.yandex.video.m3.player.PlayerStrategy
    public PrepareDrm prepareDrm(T videoData) {
        PlayerLogger playerLogger = this.playerLogger;
        if (!PlayerLoggerExtensionsKt.getEnabled(playerLogger)) {
            return null;
        }
        playerLogger.verbose(TAG, "prepareDrm", "Do nothing, return null", new Object[0]);
        return null;
    }

    @Override // ru.yandex.video.m3.player.PlayerStrategy
    public Track prepareTrack(PlayerDelegate<?> playerDelegate, TrackType trackType, T videoData) {
        PlayerLogger.verbose$default(this.playerLogger, TAG, "prepareTrack", null, new Object[]{"trackType=" + trackType}, 4, null);
        return PlayerDelegate.getTrack$default(playerDelegate, trackType, this.resourceProvider, null, 4, null);
    }

    @Override // ru.yandex.video.m3.player.PlayerStrategy
    public Future<T> prepareVideoData(String contentId) {
        throw new IllegalStateException("Not implementation prepareVideoData");
    }

    @Override // ru.yandex.video.m3.player.PlayerStrategy
    public boolean reloadVideoData() {
        return false;
    }

    public final void setExperimentalDoAutoPlayLogicInsidePlayer$video_player_internalRelease(boolean experimentalDoAutoPlayLogicInsidePlayer) {
        this.experimentalDoAutoPlayLogicInsidePlayer = experimentalDoAutoPlayLogicInsidePlayer;
    }
}
