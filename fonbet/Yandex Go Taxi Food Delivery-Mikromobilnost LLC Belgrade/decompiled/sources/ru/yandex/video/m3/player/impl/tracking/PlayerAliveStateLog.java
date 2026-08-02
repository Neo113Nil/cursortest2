package ru.yandex.video.m3.player.impl.tracking;

import defpackage.jl40;
import defpackage.qv10;
import defpackage.sls;
import defpackage.tls;
import defpackage.unr0;
import defpackage.wnb0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.impl.tracking.event.PlaybackState;
import ru.yandex.video.m3.player.impl.tracking.event.PlayerAliveState;
import ru.yandex.video.m3.util.ExecutorsUtilKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 12\u00020\u0001:\u0003123B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR)\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010 R \u0010\"\u001a\u00020!8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010\u0016\u001a\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010#R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001c\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00064"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/PlayerAliveStateLog;", "", "Lru/yandex/video/m3/player/impl/tracking/PlayerAliveStateLog$LogConfig;", ConfigConstants.CONFIG, "Lkotlin/Function0;", "Lzy11;", "onLogTime", "Lkotlin/Function1;", "", "Lru/yandex/video/m3/player/impl/tracking/event/PlayerAliveState;", "onFlush", "<init>", "(Lru/yandex/video/m3/player/impl/tracking/PlayerAliveStateLog$LogConfig;Lsls;Ltls;)V", ClidProvider.STATE, "append", "(Lru/yandex/video/m3/player/impl/tracking/event/PlayerAliveState;)V", "appendAndFlush", "Ljava/util/concurrent/ScheduledExecutorService;", "scheduledExecutorService", "restartTimer", "(Ljava/util/concurrent/ScheduledExecutorService;)V", "stopTimer", "()V", "Lru/yandex/video/m3/player/impl/tracking/PlayerAliveStateLog$LogConfig;", "getConfig", "()Lru/yandex/video/m3/player/impl/tracking/PlayerAliveStateLog$LogConfig;", "Lsls;", "getOnLogTime", "()Lsls;", "Ltls;", "getOnFlush", "()Ltls;", "Ljava/util/concurrent/ScheduledExecutorService;", "", "flushDistance", "J", "getFlushDistance", "()J", "getFlushDistance$annotations", "logDistance", "", "logs", "Ljava/util/List;", "Ljava/util/concurrent/Future;", "timer", "Ljava/util/concurrent/Future;", "", "isTimerTask", "Z", "Companion", "LogConfig", "LogConfigs", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PlayerAliveStateLog {
    private static final LogConfigs DEFAULT_CONFIGS;
    private final LogConfig config;
    private final long flushDistance;
    private volatile boolean isTimerTask;
    private final long logDistance;
    private final List<PlayerAliveState> logs;
    private final tls onFlush;
    private final sls onLogTime;
    private ScheduledExecutorService scheduledExecutorService;
    private Future<?> timer;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/PlayerAliveStateLog$LogConfig;", "", "appendPeriod", "", "flushPeriod", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "firstLogImmediately", "", "(JJLjava/util/concurrent/TimeUnit;Z)V", "getAppendPeriod", "()J", "getFirstLogImmediately", "()Z", "getFlushPeriod", "getTimeUnit", "()Ljava/util/concurrent/TimeUnit;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class LogConfig {
        public static final int $stable = 0;
        private final long appendPeriod;
        private final boolean firstLogImmediately;
        private final long flushPeriod;
        private final TimeUnit timeUnit;

        public LogConfig(long j, long j2, TimeUnit timeUnit, boolean z) {
            this.appendPeriod = j;
            this.flushPeriod = j2;
            this.timeUnit = timeUnit;
            this.firstLogImmediately = z;
        }

        public static /* synthetic */ LogConfig copy$default(LogConfig logConfig, long j, long j2, TimeUnit timeUnit, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                j = logConfig.appendPeriod;
            }
            long j3 = j;
            if ((i & 2) != 0) {
                j2 = logConfig.flushPeriod;
            }
            long j4 = j2;
            if ((i & 4) != 0) {
                timeUnit = logConfig.timeUnit;
            }
            TimeUnit timeUnit2 = timeUnit;
            if ((i & 8) != 0) {
                z = logConfig.firstLogImmediately;
            }
            return logConfig.copy(j3, j4, timeUnit2, z);
        }

        /* renamed from: component1, reason: from getter */
        public final long getAppendPeriod() {
            return this.appendPeriod;
        }

        /* renamed from: component2, reason: from getter */
        public final long getFlushPeriod() {
            return this.flushPeriod;
        }

        /* renamed from: component3, reason: from getter */
        public final TimeUnit getTimeUnit() {
            return this.timeUnit;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getFirstLogImmediately() {
            return this.firstLogImmediately;
        }

        public final LogConfig copy(long appendPeriod, long flushPeriod, TimeUnit timeUnit, boolean firstLogImmediately) {
            return new LogConfig(appendPeriod, flushPeriod, timeUnit, firstLogImmediately);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LogConfig)) {
                return false;
            }
            LogConfig logConfig = (LogConfig) other;
            return this.appendPeriod == logConfig.appendPeriod && this.flushPeriod == logConfig.flushPeriod && this.timeUnit == logConfig.timeUnit && this.firstLogImmediately == logConfig.firstLogImmediately;
        }

        public final long getAppendPeriod() {
            return this.appendPeriod;
        }

        public final boolean getFirstLogImmediately() {
            return this.firstLogImmediately;
        }

        public final long getFlushPeriod() {
            return this.flushPeriod;
        }

        public final TimeUnit getTimeUnit() {
            return this.timeUnit;
        }

        public int hashCode() {
            return Boolean.hashCode(this.firstLogImmediately) + ((this.timeUnit.hashCode() + qv10.c(Long.hashCode(this.appendPeriod) * 31, 31, this.flushPeriod)) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("LogConfig(appendPeriod=");
            sb.append(this.appendPeriod);
            sb.append(", flushPeriod=");
            sb.append(this.flushPeriod);
            sb.append(", timeUnit=");
            sb.append(this.timeUnit);
            sb.append(", firstLogImmediately=");
            return unr0.u(sb, this.firstLogImmediately, ')');
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/PlayerAliveStateLog$LogConfigs;", "", "initial", "Lru/yandex/video/m3/player/impl/tracking/PlayerAliveStateLog$LogConfig;", "afterFirstFlush", "(Lru/yandex/video/m3/player/impl/tracking/PlayerAliveStateLog$LogConfig;Lru/yandex/video/m3/player/impl/tracking/PlayerAliveStateLog$LogConfig;)V", "getAfterFirstFlush", "()Lru/yandex/video/m3/player/impl/tracking/PlayerAliveStateLog$LogConfig;", "getInitial", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class LogConfigs {
        public static final int $stable = 0;
        private final LogConfig afterFirstFlush;
        private final LogConfig initial;

        public LogConfigs(LogConfig logConfig, LogConfig logConfig2) {
            this.initial = logConfig;
            this.afterFirstFlush = logConfig2;
        }

        public static /* synthetic */ LogConfigs copy$default(LogConfigs logConfigs, LogConfig logConfig, LogConfig logConfig2, int i, Object obj) {
            if ((i & 1) != 0) {
                logConfig = logConfigs.initial;
            }
            if ((i & 2) != 0) {
                logConfig2 = logConfigs.afterFirstFlush;
            }
            return logConfigs.copy(logConfig, logConfig2);
        }

        /* renamed from: component1, reason: from getter */
        public final LogConfig getInitial() {
            return this.initial;
        }

        /* renamed from: component2, reason: from getter */
        public final LogConfig getAfterFirstFlush() {
            return this.afterFirstFlush;
        }

        public final LogConfigs copy(LogConfig initial, LogConfig afterFirstFlush) {
            return new LogConfigs(initial, afterFirstFlush);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LogConfigs)) {
                return false;
            }
            LogConfigs logConfigs = (LogConfigs) other;
            return jl40.l(this.initial, logConfigs.initial) && jl40.l(this.afterFirstFlush, logConfigs.afterFirstFlush);
        }

        public final LogConfig getAfterFirstFlush() {
            return this.afterFirstFlush;
        }

        public final LogConfig getInitial() {
            return this.initial;
        }

        public int hashCode() {
            return this.afterFirstFlush.hashCode() + (this.initial.hashCode() * 31);
        }

        public String toString() {
            return "LogConfigs(initial=" + this.initial + ", afterFirstFlush=" + this.afterFirstFlush + ')';
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        DEFAULT_CONFIGS = new LogConfigs(new LogConfig(1L, 10L, timeUnit, true), new LogConfig(5L, 30L, timeUnit, false));
    }

    public PlayerAliveStateLog(LogConfig logConfig, sls slsVar, tls tlsVar) {
        long flushPeriod;
        long appendPeriod;
        this.config = logConfig;
        this.onLogTime = slsVar;
        this.onFlush = tlsVar;
        TimeUnit timeUnit = logConfig.getTimeUnit();
        if (logConfig.getFirstLogImmediately()) {
            flushPeriod = logConfig.getFlushPeriod();
            appendPeriod = logConfig.getAppendPeriod() / 2;
        } else {
            flushPeriod = logConfig.getFlushPeriod() - logConfig.getAppendPeriod();
            appendPeriod = logConfig.getAppendPeriod() / 2;
        }
        this.flushDistance = timeUnit.toMillis(flushPeriod - appendPeriod);
        this.logDistance = (long) (logConfig.getTimeUnit().toMillis(logConfig.getAppendPeriod()) * 0.8d);
        this.logs = new ArrayList();
    }

    public static /* synthetic */ void getFlushDistance$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void restartTimer$lambda$0(PlayerAliveStateLog playerAliveStateLog) {
        playerAliveStateLog.isTimerTask = true;
        playerAliveStateLog.onLogTime.invoke();
        playerAliveStateLog.isTimerTask = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (r2 != (r3 != null ? r3.getState() : null)) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void append(PlayerAliveState state) {
        PlayerAliveState playerAliveState = (PlayerAliveState) a.b0(this.logs);
        long timestamp = playerAliveState != null ? playerAliveState.getTimestamp() : 0L;
        long timestamp2 = state.getTimestamp() - timestamp;
        if (!this.logs.isEmpty() && timestamp2 < this.logDistance) {
            PlaybackState state2 = state.getState();
            PlayerAliveState playerAliveState2 = (PlayerAliveState) a.b0(this.logs);
        }
        this.logs.add(state);
        if (this.timer != null && !this.isTimerTask) {
            ScheduledExecutorService scheduledExecutorService = this.scheduledExecutorService;
            restartTimer(scheduledExecutorService != null ? scheduledExecutorService : null);
        }
        if (Math.max(state.getTimestamp(), timestamp) - ((PlayerAliveState) a.P(this.logs)).getTimestamp() >= this.flushDistance) {
            this.onFlush.invoke(a.J0(this.logs));
            this.logs.clear();
        }
    }

    public final void appendAndFlush(PlayerAliveState state) {
        this.logs.add(state);
        this.onFlush.invoke(a.J0(this.logs));
        this.logs.clear();
    }

    public final LogConfig getConfig() {
        return this.config;
    }

    public final long getFlushDistance() {
        return this.flushDistance;
    }

    public final tls getOnFlush() {
        return this.onFlush;
    }

    public final sls getOnLogTime() {
        return this.onLogTime;
    }

    public final void restartTimer(ScheduledExecutorService scheduledExecutorService) {
        this.scheduledExecutorService = scheduledExecutorService;
        Future<?> future = this.timer;
        if (future != null) {
            future.cancel(true);
        }
        this.timer = ExecutorsUtilKt.scheduleAtFixedRateSafely(scheduledExecutorService, new wnb0(7, this), (this.config.getFirstLogImmediately() && this.timer == null) ? 0L : this.config.getAppendPeriod(), this.config.getAppendPeriod(), this.config.getTimeUnit());
    }

    public final void stopTimer() {
        Future<?> future = this.timer;
        if (future != null) {
            future.cancel(true);
        }
        this.timer = null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/PlayerAliveStateLog$Companion;", "", "()V", "DEFAULT_CONFIGS", "Lru/yandex/video/m3/player/impl/tracking/PlayerAliveStateLog$LogConfigs;", "getDEFAULT_CONFIGS", "()Lru/yandex/video/m3/player/impl/tracking/PlayerAliveStateLog$LogConfigs;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LogConfigs getDEFAULT_CONFIGS() {
            return PlayerAliveStateLog.DEFAULT_CONFIGS;
        }

        private Companion() {
        }
    }
}
