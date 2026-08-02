package ru.yandex.video.m3.player.impl.load_control;

import defpackage.a9z0;
import defpackage.au1;
import defpackage.b64;
import defpackage.fyi0;
import defpackage.lk91;
import defpackage.loo;
import defpackage.nwy;
import defpackage.owy;
import defpackage.sf10;
import defpackage.vyc0;
import defpackage.yzz0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.video.m3.data.loadcontrol.LoadControlState;
import ru.yandex.video.m3.player.PlayerAnalyticsObserver;
import ru.yandex.video.m3.player.PreparingParams;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.impl.tracking.TimeCounterImpl;
import ru.yandex.video.m3.player.impl.tracking.WatchedTimeProviderImpl;
import ru.yandex.video.m3.player.impl.utils.SystemTimeProvider;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 ,2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002,-B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\n2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\n2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010$\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010&R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001c\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010+¨\u0006."}, d2 = {"Lru/yandex/video/m3/player/impl/load_control/WatchTimeDependsBufferLoadControl;", "Lru/yandex/video/m3/player/impl/load_control/YandexLoadControl;", "Lowy;", "Lru/yandex/video/m3/player/PlayerAnalyticsObserver;", "internalLoadControl", "", "Lru/yandex/video/m3/player/impl/load_control/WatchTimeDependsBufferLoadControl$Edge;", "edges", "<init>", "(Lru/yandex/video/m3/player/impl/load_control/YandexLoadControl;Ljava/util/List;)V", "Lzy11;", "stopWatchTimeProvider", "()V", "resetWatchTimeProvider", "Lau1;", "getAllocator", "()Lau1;", "Lru/yandex/video/m3/player/YandexPlayer;", "yandexPlayer", "start", "(Lru/yandex/video/m3/player/YandexPlayer;)V", "release", "Lru/yandex/video/m3/player/PreparingParams;", "params", "onPreparingStarted", "(Lru/yandex/video/m3/player/PreparingParams;)V", "Lnwy;", "parameters", "", "shouldContinueLoading", "(Lnwy;)Z", "Lru/yandex/video/m3/data/loadcontrol/LoadControlState;", "getLoadControlState", "()Lru/yandex/video/m3/data/loadcontrol/LoadControlState;", "", "watchTimeMs", "getMaxBufferLengthByWatchTime", "(J)Ljava/lang/Long;", "Lru/yandex/video/m3/player/impl/load_control/YandexLoadControl;", "Ljava/util/List;", "Lru/yandex/video/m3/player/impl/tracking/WatchedTimeProviderImpl;", "watchedTimeProvider", "Lru/yandex/video/m3/player/impl/tracking/WatchedTimeProviderImpl;", "Lru/yandex/video/m3/player/YandexPlayer;", "Companion", "Edge", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WatchTimeDependsBufferLoadControl implements YandexLoadControl, owy, PlayerAnalyticsObserver {
    private final List<Edge> edges;
    private final YandexLoadControl internalLoadControl;
    private volatile WatchedTimeProviderImpl watchedTimeProvider;
    private volatile YandexPlayer<?> yandexPlayer;
    public static final int $stable = 8;
    private static final SystemTimeProvider timeProvider = new SystemTimeProvider();

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/yandex/video/m3/player/impl/load_control/WatchTimeDependsBufferLoadControl$Edge;", "", "watchTimeMs", "", "bufferLengthMs", "(JJ)V", "getBufferLengthMs", "()J", "getWatchTimeMs", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Edge {
        public static final int $stable = 0;
        private final long bufferLengthMs;
        private final long watchTimeMs;

        public Edge(long j, long j2) {
            this.watchTimeMs = j;
            this.bufferLengthMs = j2;
        }

        public static /* synthetic */ Edge copy$default(Edge edge, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = edge.watchTimeMs;
            }
            if ((i & 2) != 0) {
                j2 = edge.bufferLengthMs;
            }
            return edge.copy(j, j2);
        }

        /* renamed from: component1, reason: from getter */
        public final long getWatchTimeMs() {
            return this.watchTimeMs;
        }

        /* renamed from: component2, reason: from getter */
        public final long getBufferLengthMs() {
            return this.bufferLengthMs;
        }

        public final Edge copy(long watchTimeMs, long bufferLengthMs) {
            return new Edge(watchTimeMs, bufferLengthMs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Edge)) {
                return false;
            }
            Edge edge = (Edge) other;
            return this.watchTimeMs == edge.watchTimeMs && this.bufferLengthMs == edge.bufferLengthMs;
        }

        public final long getBufferLengthMs() {
            return this.bufferLengthMs;
        }

        public final long getWatchTimeMs() {
            return this.watchTimeMs;
        }

        public int hashCode() {
            return Long.hashCode(this.bufferLengthMs) + (Long.hashCode(this.watchTimeMs) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Edge(watchTimeMs=");
            sb.append(this.watchTimeMs);
            sb.append(", bufferLengthMs=");
            return b64.o(sb, this.bufferLengthMs, ')');
        }
    }

    public WatchTimeDependsBufferLoadControl(YandexLoadControl yandexLoadControl, List<Edge> list) {
        this.internalLoadControl = yandexLoadControl;
        this.edges = list;
    }

    private final void resetWatchTimeProvider() {
        stopWatchTimeProvider();
        YandexPlayer<?> yandexPlayer = this.yandexPlayer;
        if (yandexPlayer != null) {
            WatchedTimeProviderImpl watchedTimeProviderImpl = new WatchedTimeProviderImpl(yandexPlayer, new TimeCounterImpl(timeProvider));
            this.watchedTimeProvider = watchedTimeProviderImpl;
            yandexPlayer.addObserver(watchedTimeProviderImpl);
            this.watchedTimeProvider = watchedTimeProviderImpl;
        }
    }

    private final void stopWatchTimeProvider() {
        YandexPlayer<?> yandexPlayer;
        WatchedTimeProviderImpl watchedTimeProviderImpl = this.watchedTimeProvider;
        if (watchedTimeProviderImpl != null && (yandexPlayer = this.yandexPlayer) != null) {
            yandexPlayer.removeObserver(watchedTimeProviderImpl);
        }
        this.watchedTimeProvider = null;
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl, defpackage.owy
    public au1 getAllocator() {
        return this.internalLoadControl.getAllocator();
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl, defpackage.owy
    @Deprecated
    public /* bridge */ /* synthetic */ long getBackBufferDurationUs() {
        super.getBackBufferDurationUs();
        throw null;
    }

    @Override // ru.yandex.video.m3.player.DependentLifecycleLoadControl
    public LoadControlState getLoadControlState() {
        return this.internalLoadControl.getLoadControlState();
    }

    public final Long getMaxBufferLengthByWatchTime(long watchTimeMs) {
        Object obj;
        Iterator<T> it = this.edges.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Edge) obj).getWatchTimeMs() >= watchTimeMs) {
                break;
            }
        }
        Edge edge = (Edge) obj;
        if (edge != null) {
            return Long.valueOf(edge.getBufferLengthMs());
        }
        return null;
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl, defpackage.owy
    @Deprecated
    public /* bridge */ /* synthetic */ void onPrepared() {
        super.onPrepared();
        throw null;
    }

    @Override // ru.yandex.video.m3.player.PlayerAnalyticsObserver
    public void onPreparingStarted(PreparingParams params) {
        resetWatchTimeProvider();
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl, defpackage.owy
    @Deprecated
    public /* bridge */ /* synthetic */ void onReleased() {
        super.onReleased();
        throw null;
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl, defpackage.owy
    @Deprecated
    public /* bridge */ /* synthetic */ void onStopped() {
        super.onStopped();
        throw null;
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl
    @Deprecated
    public void onTracksSelected(vyc0 vyc0Var, a9z0 a9z0Var, sf10 sf10Var, fyi0[] fyi0VarArr, yzz0 yzz0Var, loo[] looVarArr) {
        onTracksSelected(a9z0Var, sf10Var, fyi0VarArr, yzz0Var, looVarArr);
    }

    @Override // ru.yandex.video.m3.player.DependentLifecycleLoadControl
    public void release(YandexPlayer<?> yandexPlayer) {
        this.internalLoadControl.release(yandexPlayer);
        stopWatchTimeProvider();
        yandexPlayer.removeAnalyticsObserver(this);
        this.yandexPlayer = null;
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl, defpackage.owy
    @Deprecated
    public /* bridge */ /* synthetic */ boolean retainBackBufferFromKeyframe() {
        super.retainBackBufferFromKeyframe();
        throw null;
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl, defpackage.owy
    public boolean shouldContinueLoading(nwy parameters) {
        WatchedTimeProviderImpl watchedTimeProviderImpl = this.watchedTimeProvider;
        Long maxBufferLengthByWatchTime = watchedTimeProviderImpl != null ? getMaxBufferLengthByWatchTime(watchedTimeProviderImpl.getWatchedTime()) : null;
        return maxBufferLengthByWatchTime != null ? parameters.e < maxBufferLengthByWatchTime.longValue() * 1000 : this.internalLoadControl.shouldContinueLoading(parameters);
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl, defpackage.owy
    public boolean shouldContinuePreloading(a9z0 a9z0Var, sf10 sf10Var, long j) {
        lk91.j("shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl, defpackage.owy
    public boolean shouldStartPlayback(nwy nwyVar) {
        return shouldStartPlayback(nwyVar.b, nwyVar.c, nwyVar.e, nwyVar.f, nwyVar.g, nwyVar.h);
    }

    @Override // ru.yandex.video.m3.player.DependentLifecycleLoadControl
    public void start(YandexPlayer<?> yandexPlayer) {
        this.internalLoadControl.start(yandexPlayer);
        this.yandexPlayer = yandexPlayer;
        resetWatchTimeProvider();
        yandexPlayer.addAnalyticsObserver(this);
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl, defpackage.owy
    public long getBackBufferDurationUs(vyc0 vyc0Var) {
        return getBackBufferDurationUs();
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl, defpackage.owy
    public void onPrepared(vyc0 vyc0Var) {
        onPrepared();
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl, defpackage.owy
    public void onReleased(vyc0 vyc0Var) {
        onReleased();
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl, defpackage.owy
    public void onStopped(vyc0 vyc0Var) {
        onStopped();
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl, defpackage.owy
    public boolean retainBackBufferFromKeyframe(vyc0 vyc0Var) {
        return retainBackBufferFromKeyframe();
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl, defpackage.owy
    public void onTracksSelected(nwy nwyVar, yzz0 yzz0Var, loo[] looVarArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl, defpackage.owy
    @Deprecated
    public /* bridge */ /* synthetic */ void onTracksSelected(fyi0[] fyi0VarArr, yzz0 yzz0Var, loo[] looVarArr) {
        super.onTracksSelected(fyi0VarArr, yzz0Var, looVarArr);
        throw null;
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl, defpackage.owy
    @Deprecated
    public void onTracksSelected(a9z0 a9z0Var, sf10 sf10Var, fyi0[] fyi0VarArr, yzz0 yzz0Var, loo[] looVarArr) {
        onTracksSelected(fyi0VarArr, yzz0Var, looVarArr);
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl, defpackage.owy
    @Deprecated
    public /* bridge */ /* synthetic */ boolean shouldStartPlayback(long j, float f, boolean z, long j2) {
        super.shouldStartPlayback(j, f, z, j2);
        throw null;
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl, defpackage.owy
    @Deprecated
    public boolean shouldStartPlayback(a9z0 a9z0Var, sf10 sf10Var, long j, float f, boolean z, long j2) {
        return shouldStartPlayback(j, f, z, j2);
    }

    @Override // ru.yandex.video.m3.player.impl.load_control.YandexLoadControl, defpackage.owy
    @Deprecated
    public /* bridge */ /* synthetic */ boolean shouldContinueLoading(long j, long j2, float f) {
        super.shouldContinueLoading(j, j2, f);
        throw null;
    }
}
