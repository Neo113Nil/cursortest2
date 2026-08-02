package ru.yandex.video.m3.ott.ott;

import defpackage.kux0;
import defpackage.vg3;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.ott.data.dto.Ott;
import ru.yandex.video.m3.ott.data.dto.OttVideoData;
import ru.yandex.video.m3.ott.data.repository.ProfileRepository;
import ru.yandex.video.m3.ott.data.repository.TimingsRepository;
import ru.yandex.video.m3.player.PlayerObserver;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.util.ExecutorsUtilKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000  2\u00020\u0001:\u0002 !B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0013\u001a\u00020\u00122\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u001c\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lru/yandex/video/m3/ott/ott/TimingsManager;", "", "Lru/yandex/video/m3/ott/data/repository/ProfileRepository;", "profileRepository", "Lru/yandex/video/m3/ott/data/repository/TimingsRepository;", "timingsRepository", "Ljava/util/concurrent/ExecutorService;", "executorService", "Ljava/util/concurrent/ScheduledExecutorService;", "scheduledExecutorService", "", "periodSeconds", "<init>", "(Lru/yandex/video/m3/ott/data/repository/ProfileRepository;Lru/yandex/video/m3/ott/data/repository/TimingsRepository;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ScheduledExecutorService;J)V", "Lru/yandex/video/m3/player/YandexPlayer;", "player", "Lru/yandex/video/m3/ott/data/dto/OttVideoData;", "videoData", "Lzy11;", "start", "(Lru/yandex/video/m3/player/YandexPlayer;Lru/yandex/video/m3/ott/data/dto/OttVideoData;)V", "stop", "()V", "Lru/yandex/video/m3/ott/data/repository/ProfileRepository;", "Lru/yandex/video/m3/ott/data/repository/TimingsRepository;", "Ljava/util/concurrent/ExecutorService;", "Ljava/util/concurrent/ScheduledExecutorService;", "J", "Lru/yandex/video/m3/player/YandexPlayer;", "Lru/yandex/video/m3/ott/ott/TimingsManager$PlayerObserverImpl;", "playerObserver", "Lru/yandex/video/m3/ott/ott/TimingsManager$PlayerObserverImpl;", "Companion", "PlayerObserverImpl", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TimingsManager {
    public static final long DEFAULT_PERIOD_SECONDS = 5;
    private final ExecutorService executorService;
    private final long periodSeconds;
    private YandexPlayer<?> player;
    private PlayerObserverImpl playerObserver;
    private final ProfileRepository profileRepository;
    private final ScheduledExecutorService scheduledExecutorService;
    private final TimingsRepository timingsRepository;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u001d\u0010\u0015R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010!R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\"R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010#R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010$R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010%R\u001c\u0010'\u001a\b\u0012\u0002\b\u0003\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/yandex/video/m3/ott/ott/TimingsManager$PlayerObserverImpl;", "Lru/yandex/video/m3/player/PlayerObserver;", "", "Lru/yandex/video/m3/player/YandexPlayer;", "player", "Lru/yandex/video/m3/ott/data/dto/OttVideoData;", "videoData", "Lru/yandex/video/m3/ott/data/repository/ProfileRepository;", "profileRepository", "Lru/yandex/video/m3/ott/data/repository/TimingsRepository;", "timingsRepository", "Ljava/util/concurrent/ExecutorService;", "executorService", "Ljava/util/concurrent/ScheduledExecutorService;", "scheduledExecutorService", "", "periodSeconds", "<init>", "(Lru/yandex/video/m3/player/YandexPlayer;Lru/yandex/video/m3/ott/data/dto/OttVideoData;Lru/yandex/video/m3/ott/data/repository/ProfileRepository;Lru/yandex/video/m3/ott/data/repository/TimingsRepository;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ScheduledExecutorService;J)V", "Lzy11;", "sendTimingAsync", "()V", "onResumePlayback", "onPausePlayback", "onPlaybackEnded", "newPositionMs", "oldPositionMs", "onSeek", "(JJ)V", "release$video_player_internalRelease", "release", "Lru/yandex/video/m3/player/YandexPlayer;", "Lru/yandex/video/m3/ott/data/dto/OttVideoData;", "Lru/yandex/video/m3/ott/data/repository/ProfileRepository;", "Lru/yandex/video/m3/ott/data/repository/TimingsRepository;", "Ljava/util/concurrent/ExecutorService;", "Ljava/util/concurrent/ScheduledExecutorService;", "J", "Ljava/util/concurrent/ScheduledFuture;", "scheduleFuture", "Ljava/util/concurrent/ScheduledFuture;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PlayerObserverImpl implements PlayerObserver<Object> {
        public static final int $stable = 8;
        private final ExecutorService executorService;
        private final long periodSeconds;
        private final YandexPlayer<?> player;
        private final ProfileRepository profileRepository;
        private ScheduledFuture<?> scheduleFuture;
        private final ScheduledExecutorService scheduledExecutorService;
        private final TimingsRepository timingsRepository;
        private final OttVideoData videoData;

        public PlayerObserverImpl(YandexPlayer<?> yandexPlayer, OttVideoData ottVideoData, ProfileRepository profileRepository, TimingsRepository timingsRepository, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, long j) {
            this.player = yandexPlayer;
            this.videoData = ottVideoData;
            this.profileRepository = profileRepository;
            this.timingsRepository = timingsRepository;
            this.executorService = executorService;
            this.scheduledExecutorService = scheduledExecutorService;
            this.periodSeconds = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void sendTimingAsync() {
            ExecutorsUtilKt.executeSafely(this.executorService, new vg3(this, this.player.getPosition(), 5));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void sendTimingAsync$lambda$3(PlayerObserverImpl playerObserverImpl, long j) {
            try {
                Ott.Profile profile = playerObserverImpl.profileRepository.getProfile().get();
                if (profile == null) {
                    return;
                }
                playerObserverImpl.timingsRepository.sendTiming(new Ott.TimingsInfo(profile.getId(), playerObserverImpl.videoData.getContentId(), playerObserverImpl.videoData.getParentContentId(), j / 1000)).get();
            } catch (Throwable unused) {
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerObserver
        public void onPausePlayback() {
            release$video_player_internalRelease();
        }

        @Override // ru.yandex.video.m3.player.PlayerObserver
        public void onPlaybackEnded() {
            if (this.player.getVideoType() == VideoType.VOD) {
                sendTimingAsync();
            }
            release$video_player_internalRelease();
        }

        @Override // ru.yandex.video.m3.player.PlayerObserver
        public void onResumePlayback() {
            if (this.player.getVideoType() == VideoType.VOD) {
                this.scheduleFuture = ExecutorsUtilKt.scheduleAtFixedRateSafely(this.scheduledExecutorService, new kux0(13, this), 0L, this.periodSeconds, TimeUnit.SECONDS);
            }
        }

        @Override // ru.yandex.video.m3.player.PlayerObserver
        public void onSeek(long newPositionMs, long oldPositionMs) {
            if (this.player.getVideoType() == VideoType.VOD) {
                sendTimingAsync();
            }
        }

        public final void release$video_player_internalRelease() {
            ScheduledFuture<?> scheduledFuture = this.scheduleFuture;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.scheduleFuture = null;
        }
    }

    public /* synthetic */ TimingsManager(ProfileRepository profileRepository, TimingsRepository timingsRepository, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(profileRepository, timingsRepository, executorService, scheduledExecutorService, (i & 16) != 0 ? 5L : j);
    }

    public final void start(YandexPlayer<?> player, OttVideoData videoData) {
        stop();
        this.player = player;
        PlayerObserverImpl playerObserverImpl = new PlayerObserverImpl(player, videoData, this.profileRepository, this.timingsRepository, this.executorService, this.scheduledExecutorService, this.periodSeconds);
        this.playerObserver = playerObserverImpl;
        player.addObserver(playerObserverImpl);
    }

    public final void stop() {
        PlayerObserverImpl playerObserverImpl;
        YandexPlayer<?> yandexPlayer = this.player;
        if (yandexPlayer != null && (playerObserverImpl = this.playerObserver) != null) {
            playerObserverImpl.release$video_player_internalRelease();
            yandexPlayer.removeObserver(playerObserverImpl);
        }
        this.player = null;
        this.playerObserver = null;
    }

    public TimingsManager(ProfileRepository profileRepository, TimingsRepository timingsRepository, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService, long j) {
        this.profileRepository = profileRepository;
        this.timingsRepository = timingsRepository;
        this.executorService = executorService;
        this.scheduledExecutorService = scheduledExecutorService;
        this.periodSeconds = j;
    }
}
