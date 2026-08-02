package ru.yandex.video.m3.ott.impl;

import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.d5z0;
import defpackage.g8e;
import defpackage.h5z0;
import defpackage.jl40;
import defpackage.unr0;
import defpackage.wwd;
import defpackage.xwd;
import defpackage.zy11;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import ru.yandex.video.m3.ott.data.dto.Ott;
import ru.yandex.video.m3.ott.data.net.ConcurrencyArbiterApi;
import ru.yandex.video.m3.ott.data.net.ConcurrencyArbiterHeartbeat;
import ru.yandex.video.m3.ott.ott.ConcurrencyArbiterManager;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PlayerObserver;
import ru.yandex.video.m3.player.PlayerPlaybackErrorNotifying;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.util.ExecutorsUtilKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00102\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u001c\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/yandex/video/m3/ott/impl/ConcurrencyArbiterManagerImpl;", "Lru/yandex/video/m3/ott/ott/ConcurrencyArbiterManager;", "Lru/yandex/video/m3/ott/data/net/ConcurrencyArbiterApi;", "arbiterApi", "Ljava/util/concurrent/ExecutorService;", "executorService", "Ljava/util/concurrent/ScheduledExecutorService;", "scheduledExecutorService", "<init>", "(Lru/yandex/video/m3/ott/data/net/ConcurrencyArbiterApi;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ScheduledExecutorService;)V", "Lru/yandex/video/m3/player/YandexPlayer;", "player", "Lru/yandex/video/m3/player/PlayerPlaybackErrorNotifying;", "errorNotifying", "Lru/yandex/video/m3/ott/data/dto/Ott$ConcurrencyArbiterConfig;", "concurrencyArbiterConfig", "Ljava/util/concurrent/Future;", "ensureStarted", "(Lru/yandex/video/m3/player/YandexPlayer;Lru/yandex/video/m3/player/PlayerPlaybackErrorNotifying;Lru/yandex/video/m3/ott/data/dto/Ott$ConcurrencyArbiterConfig;)Ljava/util/concurrent/Future;", "Lzy11;", "stop", "()V", "Lru/yandex/video/m3/ott/data/net/ConcurrencyArbiterApi;", "Ljava/util/concurrent/ExecutorService;", "Ljava/util/concurrent/ScheduledExecutorService;", "Lru/yandex/video/m3/player/YandexPlayer;", "Lru/yandex/video/m3/ott/data/dto/Ott$ConcurrencyArbiterConfig;", "Lru/yandex/video/m3/ott/impl/ConcurrencyArbiterManagerImpl$PlayerObserverImpl;", "observer", "Lru/yandex/video/m3/ott/impl/ConcurrencyArbiterManagerImpl$PlayerObserverImpl;", "PlayerObserverImpl", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ConcurrencyArbiterManagerImpl implements ConcurrencyArbiterManager {
    public static final int $stable = 8;
    private final ConcurrencyArbiterApi arbiterApi;
    private volatile Ott.ConcurrencyArbiterConfig concurrencyArbiterConfig;
    private final ExecutorService executorService;
    private volatile PlayerObserverImpl observer;
    private volatile YandexPlayer<?> player;
    private final ScheduledExecutorService scheduledExecutorService;

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001d\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\"R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010#R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010$R\u001c\u0010%\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010'\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/yandex/video/m3/ott/impl/ConcurrencyArbiterManagerImpl$PlayerObserverImpl;", "Lru/yandex/video/m3/player/PlayerObserver;", "", "Lru/yandex/video/m3/ott/data/dto/Ott$ConcurrencyArbiterConfig;", "concurrencyArbiterConfig", "Lru/yandex/video/m3/player/PlayerPlaybackErrorNotifying;", "errorNotifying", "Lru/yandex/video/m3/ott/data/net/ConcurrencyArbiterApi;", "concurrencyArbiterApi", "Ljava/util/concurrent/ExecutorService;", "executorService", "Ljava/util/concurrent/ScheduledExecutorService;", "scheduledExecutorService", "<init>", "(Lru/yandex/video/m3/ott/data/dto/Ott$ConcurrencyArbiterConfig;Lru/yandex/video/m3/player/PlayerPlaybackErrorNotifying;Lru/yandex/video/m3/ott/data/net/ConcurrencyArbiterApi;Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ScheduledExecutorService;)V", "", "heartbeat", "Lzy11;", "startScheduledWorkHeartbeat", "(J)V", "onResumePlayback", "()V", "onPausePlayback", "onPlaybackEnded", "Lru/yandex/video/m3/player/PlaybackException;", "playbackException", "onPlaybackError", "(Lru/yandex/video/m3/player/PlaybackException;)V", "Ljava/util/concurrent/Future;", "ensureStarted", "()Ljava/util/concurrent/Future;", "release", "Lru/yandex/video/m3/ott/data/dto/Ott$ConcurrencyArbiterConfig;", "Lru/yandex/video/m3/player/PlayerPlaybackErrorNotifying;", "Lru/yandex/video/m3/ott/data/net/ConcurrencyArbiterApi;", "Ljava/util/concurrent/ExecutorService;", "Ljava/util/concurrent/ScheduledExecutorService;", "future", "Ljava/util/concurrent/Future;", "scheduledFuture", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isStarted", "Ljava/util/concurrent/atomic/AtomicBoolean;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PlayerObserverImpl implements PlayerObserver<Object> {
        public static final int $stable = 8;
        private final ConcurrencyArbiterApi concurrencyArbiterApi;
        private final Ott.ConcurrencyArbiterConfig concurrencyArbiterConfig;
        private final PlayerPlaybackErrorNotifying errorNotifying;
        private final ExecutorService executorService;
        private Future<?> future;
        private final AtomicBoolean isStarted = new AtomicBoolean(false);
        private final ScheduledExecutorService scheduledExecutorService;
        private Future<?> scheduledFuture;

        public PlayerObserverImpl(Ott.ConcurrencyArbiterConfig concurrencyArbiterConfig, PlayerPlaybackErrorNotifying playerPlaybackErrorNotifying, ConcurrencyArbiterApi concurrencyArbiterApi, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
            this.concurrencyArbiterConfig = concurrencyArbiterConfig;
            this.errorNotifying = playerPlaybackErrorNotifying;
            this.concurrencyArbiterApi = concurrencyArbiterApi;
            this.executorService = executorService;
            this.scheduledExecutorService = scheduledExecutorService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void ensureStarted$lambda$5(PlayerObserverImpl playerObserverImpl) {
            ConcurrencyArbiterHeartbeat failure;
            Throwable a;
            try {
                failure = playerObserverImpl.concurrencyArbiterApi.start(playerObserverImpl.concurrencyArbiterConfig).get();
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (playerObserverImpl.concurrencyArbiterConfig.getHandleArbiterErrors() && (a = Result.a(failure)) != null) {
                playerObserverImpl.isStarted.set(false);
                throw a;
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            ConcurrencyArbiterHeartbeat concurrencyArbiterHeartbeat = (ConcurrencyArbiterHeartbeat) failure;
            if (concurrencyArbiterHeartbeat != null) {
                playerObserverImpl.startScheduledWorkHeartbeat(concurrencyArbiterHeartbeat.getHeartbeatInMillis());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void release$lambda$9(PlayerObserverImpl playerObserverImpl) {
            Object failure;
            try {
                playerObserverImpl.concurrencyArbiterApi.finish(playerObserverImpl.concurrencyArbiterConfig).get();
                failure = zy11.a;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                h5z0.a.a(g8e.s(a, new StringBuilder("Send concurrencyArbiter finish failed. Error: ")), new Object[0]);
            }
        }

        private final void startScheduledWorkHeartbeat(long heartbeat) {
            Future<?> future = this.scheduledFuture;
            int i = 1;
            if (future != null) {
                future.cancel(true);
            }
            long max = heartbeat - Math.max(10000L, (long) (heartbeat * 0.05f));
            d5z0 d5z0Var = h5z0.a;
            StringBuilder w = unr0.w(heartbeat, "startScheduledWorkHeartbeat heartbeat=", " newHeartbeatDelayMs=");
            w.append(max);
            d5z0Var.a(w.toString(), new Object[0]);
            this.scheduledFuture = ExecutorsUtilKt.scheduleSafely(this.scheduledExecutorService, new xwd(this, heartbeat, i), max, TimeUnit.MILLISECONDS);
            d5z0Var.a(WriteBlocks.OK, new Object[0]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void startScheduledWorkHeartbeat$lambda$12(PlayerObserverImpl playerObserverImpl, long j) {
            Future<?> future = playerObserverImpl.future;
            if (future != null) {
                future.cancel(true);
            }
            playerObserverImpl.future = ExecutorsUtilKt.submitSafely(playerObserverImpl.executorService, new xwd(playerObserverImpl, j, 0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void startScheduledWorkHeartbeat$lambda$12$lambda$11(PlayerObserverImpl playerObserverImpl, long j) {
            Object failure;
            try {
                failure = (ConcurrencyArbiterHeartbeat) playerObserverImpl.concurrencyArbiterApi.heartbeat(playerObserverImpl.concurrencyArbiterConfig).get();
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            ConcurrencyArbiterHeartbeat concurrencyArbiterHeartbeat = (ConcurrencyArbiterHeartbeat) failure;
            long heartbeatInMillis = concurrencyArbiterHeartbeat != null ? concurrencyArbiterHeartbeat.getHeartbeatInMillis() : j;
            if (heartbeatInMillis != j) {
                playerObserverImpl.startScheduledWorkHeartbeat(heartbeatInMillis);
            }
        }

        public final Future<?> ensureStarted() {
            int i = 1;
            if (!this.isStarted.compareAndSet(false, true)) {
                return null;
            }
            Future<?> future = this.future;
            if (future != null) {
                future.cancel(true);
            }
            Future<?> submit = this.executorService.submit(new wwd(this, i));
            this.future = submit;
            return submit;
        }

        @Override // ru.yandex.video.m3.player.PlayerObserver
        public void onPausePlayback() {
            super.onPausePlayback();
            release();
        }

        @Override // ru.yandex.video.m3.player.PlayerObserver
        public void onPlaybackEnded() {
            release();
        }

        @Override // ru.yandex.video.m3.player.PlayerObserver
        public void onPlaybackError(PlaybackException playbackException) {
            release();
        }

        @Override // ru.yandex.video.m3.player.PlayerObserver
        public void onResumePlayback() {
            Object failure;
            try {
                Future<?> ensureStarted = ensureStarted();
                failure = ensureStarted != null ? ensureStarted.get() : null;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a = Result.a(failure);
            if (a != null) {
                this.errorNotifying.onPlaybackError(new PlaybackException.PlaybackForbidden(a));
            }
        }

        public final void release() {
            int i = 0;
            if (this.isStarted.compareAndSet(true, false)) {
                Future<?> future = this.future;
                if (future != null) {
                    future.cancel(true);
                }
                Future<?> future2 = this.scheduledFuture;
                if (future2 != null) {
                    future2.cancel(true);
                }
                ExecutorsUtilKt.submitSafely(this.executorService, new wwd(this, i));
            }
        }
    }

    public ConcurrencyArbiterManagerImpl(ConcurrencyArbiterApi concurrencyArbiterApi, ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.arbiterApi = concurrencyArbiterApi;
        this.executorService = executorService;
        this.scheduledExecutorService = scheduledExecutorService;
    }

    @Override // ru.yandex.video.m3.ott.ott.ConcurrencyArbiterManager
    public Future<?> ensureStarted(YandexPlayer<?> player, PlayerPlaybackErrorNotifying errorNotifying, Ott.ConcurrencyArbiterConfig concurrencyArbiterConfig) {
        if (jl40.l(this.concurrencyArbiterConfig, concurrencyArbiterConfig)) {
            return null;
        }
        PlayerObserverImpl playerObserverImpl = this.observer;
        if (playerObserverImpl != null) {
            playerObserverImpl.release();
            YandexPlayer<?> yandexPlayer = this.player;
            if (yandexPlayer != null) {
                yandexPlayer.removeObserver(playerObserverImpl);
            }
        }
        this.player = player;
        this.concurrencyArbiterConfig = concurrencyArbiterConfig;
        if (concurrencyArbiterConfig == null) {
            this.observer = null;
            return null;
        }
        PlayerObserverImpl playerObserverImpl2 = new PlayerObserverImpl(concurrencyArbiterConfig, errorNotifying, this.arbiterApi, this.executorService, this.scheduledExecutorService);
        this.observer = playerObserverImpl2;
        player.addObserver(playerObserverImpl2);
        return playerObserverImpl2.ensureStarted();
    }

    @Override // ru.yandex.video.m3.ott.ott.ConcurrencyArbiterManager
    public void stop() {
        PlayerObserverImpl playerObserverImpl = this.observer;
        if (playerObserverImpl != null) {
            playerObserverImpl.release();
            YandexPlayer<?> yandexPlayer = this.player;
            if (yandexPlayer != null) {
                yandexPlayer.removeObserver(playerObserverImpl);
            }
        }
        this.player = null;
        this.observer = null;
    }
}
