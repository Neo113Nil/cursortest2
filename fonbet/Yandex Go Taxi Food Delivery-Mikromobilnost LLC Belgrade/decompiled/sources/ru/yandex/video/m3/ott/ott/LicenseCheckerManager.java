package ru.yandex.video.m3.ott.ott;

import defpackage.h5z0;
import defpackage.ycy;
import defpackage.zy11;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.ott.data.exception.ForbiddenByLicenseException;
import ru.yandex.video.m3.ott.data.repository.LicenseCheckerRepository;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PlayerObserver;
import ru.yandex.video.m3.player.PlayerPlaybackErrorNotifying;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.impl.tracking.TimeCounter;
import ru.yandex.video.m3.util.ExecutorsUtilKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001f B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0013\u001a\u00020\u00122\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u001c\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lru/yandex/video/m3/ott/ott/LicenseCheckerManager;", "", "Lru/yandex/video/m3/ott/data/repository/LicenseCheckerRepository;", "licenseCheckerRepository", "Lru/yandex/video/m3/player/impl/tracking/TimeCounter;", "timeCounter", "Ljava/util/concurrent/ScheduledExecutorService;", "scheduledExecutorService", "Ljava/util/concurrent/ExecutorService;", "executorService", "<init>", "(Lru/yandex/video/m3/ott/data/repository/LicenseCheckerRepository;Lru/yandex/video/m3/player/impl/tracking/TimeCounter;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/ExecutorService;)V", "Lru/yandex/video/m3/player/YandexPlayer;", "player", "Lru/yandex/video/m3/player/PlayerPlaybackErrorNotifying;", "errorNotifying", "", "uuid", "Lzy11;", "start", "(Lru/yandex/video/m3/player/YandexPlayer;Lru/yandex/video/m3/player/PlayerPlaybackErrorNotifying;Ljava/lang/String;)V", "stop", "()V", "Lru/yandex/video/m3/ott/data/repository/LicenseCheckerRepository;", "Lru/yandex/video/m3/player/impl/tracking/TimeCounter;", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/util/concurrent/ExecutorService;", "Lru/yandex/video/m3/player/YandexPlayer;", "Lru/yandex/video/m3/ott/ott/LicenseCheckerManager$PlayerObserverImpl;", "observer", "Lru/yandex/video/m3/ott/ott/LicenseCheckerManager$PlayerObserverImpl;", "Companion", "PlayerObserverImpl", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LicenseCheckerManager {
    private final ExecutorService executorService;
    private final LicenseCheckerRepository licenseCheckerRepository;
    private PlayerObserverImpl observer;
    private YandexPlayer<?> player;
    private final ScheduledExecutorService scheduledExecutorService;
    private final TimeCounter timeCounter;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final long PERIOD_MILLISECONDS = 900000;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\r\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u0018\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001fR(\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/yandex/video/m3/ott/ott/LicenseCheckerManager$PlayerObserverImpl;", "Lru/yandex/video/m3/player/PlayerObserver;", "", "", "uuid", "Lru/yandex/video/m3/player/YandexPlayer;", "player", "Lru/yandex/video/m3/player/PlayerPlaybackErrorNotifying;", "errorNotifying", "Lru/yandex/video/m3/ott/data/repository/LicenseCheckerRepository;", "licenseCheckerRepository", "Ljava/util/concurrent/ScheduledExecutorService;", "scheduledExecutorService", "Ljava/util/concurrent/ExecutorService;", "executorService", "Lru/yandex/video/m3/player/impl/tracking/TimeCounter;", "timeCounter", "<init>", "(Ljava/lang/String;Lru/yandex/video/m3/player/YandexPlayer;Lru/yandex/video/m3/player/PlayerPlaybackErrorNotifying;Lru/yandex/video/m3/ott/data/repository/LicenseCheckerRepository;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/ExecutorService;Lru/yandex/video/m3/player/impl/tracking/TimeCounter;)V", "Lzy11;", "cancelScheduledTask", "()V", "onResumePlayback", "onPausePlayback", "release", "Ljava/lang/String;", "Lru/yandex/video/m3/player/YandexPlayer;", "Lru/yandex/video/m3/player/PlayerPlaybackErrorNotifying;", "Lru/yandex/video/m3/ott/data/repository/LicenseCheckerRepository;", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/util/concurrent/ExecutorService;", "Lru/yandex/video/m3/player/impl/tracking/TimeCounter;", "Ljava/util/concurrent/Future;", "scheduledFuture", "Ljava/util/concurrent/Future;", "getScheduledFuture$video_player_internalRelease", "()Ljava/util/concurrent/Future;", "setScheduledFuture$video_player_internalRelease", "(Ljava/util/concurrent/Future;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PlayerObserverImpl implements PlayerObserver<Object> {
        public static final int $stable = 8;
        private final PlayerPlaybackErrorNotifying errorNotifying;
        private final ExecutorService executorService;
        private final LicenseCheckerRepository licenseCheckerRepository;
        private final YandexPlayer<?> player;
        private final ScheduledExecutorService scheduledExecutorService;
        private Future<?> scheduledFuture;
        private final TimeCounter timeCounter;
        private final String uuid;

        public PlayerObserverImpl(String str, YandexPlayer<?> yandexPlayer, PlayerPlaybackErrorNotifying playerPlaybackErrorNotifying, LicenseCheckerRepository licenseCheckerRepository, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService, TimeCounter timeCounter) {
            this.uuid = str;
            this.player = yandexPlayer;
            this.errorNotifying = playerPlaybackErrorNotifying;
            this.licenseCheckerRepository = licenseCheckerRepository;
            this.scheduledExecutorService = scheduledExecutorService;
            this.executorService = executorService;
            this.timeCounter = timeCounter;
        }

        private final void cancelScheduledTask() {
            Future<?> future = this.scheduledFuture;
            if (future != null) {
                future.cancel(false);
            }
            this.scheduledFuture = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onResumePlayback$lambda$4(PlayerObserverImpl playerObserverImpl) {
            ExecutorsUtilKt.executeSafely(playerObserverImpl.executorService, new ycy(playerObserverImpl, 1));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onResumePlayback$lambda$4$lambda$3(PlayerObserverImpl playerObserverImpl) {
            try {
                playerObserverImpl.licenseCheckerRepository.checkLicense(playerObserverImpl.uuid).get();
            } catch (ForbiddenByLicenseException e) {
                playerObserverImpl.errorNotifying.onPlaybackError(new PlaybackException.ErrorLicenseViolation(e));
            } catch (Exception e2) {
                Throwable cause = e2.getCause();
                zy11 zy11Var = null;
                if (cause != null) {
                    if ((cause instanceof ForbiddenByLicenseException ? (ForbiddenByLicenseException) cause : null) != null) {
                        playerObserverImpl.errorNotifying.onPlaybackError(new PlaybackException.ErrorLicenseViolation(e2));
                        zy11Var = zy11.a;
                    }
                }
                if (zy11Var == null) {
                    h5z0.a.e(e2);
                }
            }
        }

        public final Future<?> getScheduledFuture$video_player_internalRelease() {
            return this.scheduledFuture;
        }

        @Override // ru.yandex.video.m3.player.PlayerObserver
        public void onPausePlayback() {
            this.timeCounter.stop();
            cancelScheduledTask();
        }

        @Override // ru.yandex.video.m3.player.PlayerObserver
        public void onResumePlayback() {
            if (this.player.getVideoType() == VideoType.VOD) {
                this.timeCounter.start();
                Future<?> future = this.scheduledFuture;
                if (future == null) {
                    future = ExecutorsUtilKt.scheduleAtFixedRateSafely(this.scheduledExecutorService, new ycy(this, 0), LicenseCheckerManager.PERIOD_MILLISECONDS - (this.timeCounter.getTime() % LicenseCheckerManager.PERIOD_MILLISECONDS), LicenseCheckerManager.PERIOD_MILLISECONDS, TimeUnit.MILLISECONDS);
                }
                this.scheduledFuture = future;
            }
        }

        public final void release() {
            this.timeCounter.reset();
            cancelScheduledTask();
        }

        public final void setScheduledFuture$video_player_internalRelease(Future<?> future) {
            this.scheduledFuture = future;
        }
    }

    public LicenseCheckerManager(LicenseCheckerRepository licenseCheckerRepository, TimeCounter timeCounter, ScheduledExecutorService scheduledExecutorService, ExecutorService executorService) {
        this.licenseCheckerRepository = licenseCheckerRepository;
        this.timeCounter = timeCounter;
        this.scheduledExecutorService = scheduledExecutorService;
        this.executorService = executorService;
    }

    public final void start(YandexPlayer<?> player, PlayerPlaybackErrorNotifying errorNotifying, String uuid) {
        stop();
        this.player = player;
        PlayerObserverImpl playerObserverImpl = new PlayerObserverImpl(uuid, player, errorNotifying, this.licenseCheckerRepository, this.scheduledExecutorService, this.executorService, this.timeCounter);
        player.addObserver(playerObserverImpl);
        this.observer = playerObserverImpl;
    }

    public final void stop() {
        PlayerObserverImpl playerObserverImpl = this.observer;
        if (playerObserverImpl != null) {
            YandexPlayer<?> yandexPlayer = this.player;
            if (yandexPlayer != null) {
                yandexPlayer.removeObserver(playerObserverImpl);
            }
            playerObserverImpl.release();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lru/yandex/video/m3/ott/ott/LicenseCheckerManager$Companion;", "", "()V", "PERIOD_MILLISECONDS", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
