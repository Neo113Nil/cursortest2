package ru.yandex.video.m3.player.impl.tracking;

import defpackage.ayc0;
import defpackage.sls;
import defpackage.tls;
import defpackage.zy11;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import ru.yandex.video.m3.player.impl.tracking.PlayerAliveStateLog;
import ru.yandex.video.m3.player.impl.tracking.event.PlayerAliveState;
import ru.yandex.video.m3.util.ExecutorsUtilKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\nJ\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\nJ\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\nJ\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\nJ\r\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\nJ\u000f\u0010\u0018\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0018\u0010\nR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR(\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\"\u0010\n\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010%R\u0016\u0010'\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\u0014\u0010+\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/PlayerAliveLogHolder;", "", "Lru/yandex/video/m3/player/impl/tracking/PlayerAliveStateLog$LogConfigs;", "logConfigs", "Ljava/util/concurrent/ScheduledExecutorService;", "scheduledExecutorService", "<init>", "(Lru/yandex/video/m3/player/impl/tracking/PlayerAliveStateLog$LogConfigs;Ljava/util/concurrent/ScheduledExecutorService;)V", "Lzy11;", "internalSyncInitLog", "()V", "internalSyncStopLog", "Lru/yandex/video/m3/player/impl/tracking/event/PlayerAliveState;", "getCurrentState", "()Lru/yandex/video/m3/player/impl/tracking/event/PlayerAliveState;", "", "states", "sendStates", "(Ljava/util/List;)V", "initLog", "saveCurrentState", "startLog", "stopLog", "releaseLog", "internalSyncRestartLog", "Lru/yandex/video/m3/player/impl/tracking/PlayerAliveStateLog$LogConfigs;", "Ljava/util/concurrent/ScheduledExecutorService;", "Lru/yandex/video/m3/player/impl/tracking/PlayerAliveStateLog;", "log", "Lru/yandex/video/m3/player/impl/tracking/PlayerAliveStateLog;", "getLog", "()Lru/yandex/video/m3/player/impl/tracking/PlayerAliveStateLog;", "setLog", "(Lru/yandex/video/m3/player/impl/tracking/PlayerAliveStateLog;)V", "getLog$annotations", "", "isInitialPeriod", "Z", "isStopped", "isReleased", "Lru/yandex/video/m3/player/impl/tracking/PlayerAliveStateLog$LogConfig;", "getCurrentConfig", "()Lru/yandex/video/m3/player/impl/tracking/PlayerAliveStateLog$LogConfig;", "currentConfig", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class PlayerAliveLogHolder {
    public static final int $stable = 8;
    private boolean isInitialPeriod = true;
    private boolean isReleased;
    private boolean isStopped;
    public PlayerAliveStateLog log;
    private final PlayerAliveStateLog.LogConfigs logConfigs;
    private final ScheduledExecutorService scheduledExecutorService;

    public PlayerAliveLogHolder(PlayerAliveStateLog.LogConfigs logConfigs, ScheduledExecutorService scheduledExecutorService) {
        this.logConfigs = logConfigs;
        this.scheduledExecutorService = scheduledExecutorService;
    }

    private final PlayerAliveStateLog.LogConfig getCurrentConfig() {
        PlayerAliveStateLog.LogConfigs logConfigs = this.logConfigs;
        if (logConfigs == null) {
            logConfigs = PlayerAliveStateLog.INSTANCE.getDEFAULT_CONFIGS();
        }
        return this.isInitialPeriod ? logConfigs.getInitial() : logConfigs.getAfterFirstFlush();
    }

    public static /* synthetic */ void getLog$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void internalSyncInitLog() {
        setLog(new PlayerAliveStateLog(getCurrentConfig(), new sls() { // from class: ru.yandex.video.m3.player.impl.tracking.PlayerAliveLogHolder$internalSyncInitLog$1
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m792invoke() {
                PlayerAliveLogHolder.this.getLog().append(PlayerAliveLogHolder.this.getCurrentState());
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m792invoke();
                return zy11.a;
            }
        }, new tls() { // from class: ru.yandex.video.m3.player.impl.tracking.PlayerAliveLogHolder$internalSyncInitLog$2
            {
                super(1);
            }

            public final void invoke(List<PlayerAliveState> list) {
                boolean z;
                if (!list.isEmpty()) {
                    PlayerAliveLogHolder.this.sendStates(list);
                }
                z = PlayerAliveLogHolder.this.isInitialPeriod;
                if (z) {
                    PlayerAliveLogHolder.this.internalSyncRestartLog();
                }
            }

            @Override // defpackage.tls
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<PlayerAliveState>) obj);
                return zy11.a;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void internalSyncStopLog() {
        this.isStopped = true;
        getLog().stopTimer();
        getLog().appendAndFlush(getCurrentState());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void releaseLog$lambda$5(PlayerAliveLogHolder playerAliveLogHolder) {
        playerAliveLogHolder.isReleased = true;
        if (playerAliveLogHolder.isStopped) {
            return;
        }
        playerAliveLogHolder.internalSyncStopLog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void saveCurrentState$lambda$2(PlayerAliveLogHolder playerAliveLogHolder) {
        if (playerAliveLogHolder.isReleased) {
            return;
        }
        playerAliveLogHolder.getLog().append(playerAliveLogHolder.getCurrentState());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startLog$lambda$3(PlayerAliveLogHolder playerAliveLogHolder) {
        if (playerAliveLogHolder.isStopped && !playerAliveLogHolder.isInitialPeriod) {
            playerAliveLogHolder.isInitialPeriod = true;
            playerAliveLogHolder.internalSyncInitLog();
        }
        playerAliveLogHolder.isStopped = false;
        playerAliveLogHolder.getLog().restartTimer(playerAliveLogHolder.scheduledExecutorService);
    }

    public abstract PlayerAliveState getCurrentState();

    public final PlayerAliveStateLog getLog() {
        PlayerAliveStateLog playerAliveStateLog = this.log;
        if (playerAliveStateLog != null) {
            return playerAliveStateLog;
        }
        return null;
    }

    public final void initLog() {
        ExecutorsUtilKt.submitSafely(this.scheduledExecutorService, new ayc0(this, 2));
    }

    public final void internalSyncRestartLog() {
        if (this.isStopped || this.isReleased) {
            return;
        }
        getLog().stopTimer();
        this.isInitialPeriod = false;
        internalSyncInitLog();
        getLog().restartTimer(this.scheduledExecutorService);
    }

    public final void releaseLog() {
        ExecutorsUtilKt.submitSafely(this.scheduledExecutorService, new ayc0(this, 0));
    }

    public final void saveCurrentState() {
        ExecutorsUtilKt.submitSafely(this.scheduledExecutorService, new ayc0(this, 4));
    }

    public abstract void sendStates(List<PlayerAliveState> states);

    public final void setLog(PlayerAliveStateLog playerAliveStateLog) {
        this.log = playerAliveStateLog;
    }

    public final void startLog() {
        ExecutorsUtilKt.submitSafely(this.scheduledExecutorService, new ayc0(this, 1));
    }

    public final void stopLog() {
        ExecutorsUtilKt.submitSafely(this.scheduledExecutorService, new ayc0(this, 3));
    }
}
