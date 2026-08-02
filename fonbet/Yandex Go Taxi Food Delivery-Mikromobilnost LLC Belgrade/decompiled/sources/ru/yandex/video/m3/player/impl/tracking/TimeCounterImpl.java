package ru.yandex.video.m3.player.impl.tracking;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import ru.yandex.video.m3.player.impl.utils.TimeProvider;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/TimeCounterImpl;", "Lru/yandex/video/m3/player/impl/tracking/TimeCounter;", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "timeProvider", "<init>", "(Lru/yandex/video/m3/player/impl/utils/TimeProvider;)V", "Lzy11;", "start", "()V", "stop", "", "isEverStarted", "()Z", "", "getTime", "()J", "reset", "Lru/yandex/video/m3/player/impl/utils/TimeProvider;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "firstResumeFlag", "Ljava/util/concurrent/atomic/AtomicBoolean;", "paused", "Z", "counter", "J", "lastResumeTime", "lastPauseTime", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TimeCounterImpl implements TimeCounter {
    public static final int $stable = 8;
    private long counter;
    private long lastPauseTime;
    private long lastResumeTime;
    private final TimeProvider timeProvider;
    private AtomicBoolean firstResumeFlag = new AtomicBoolean(false);
    private boolean paused = true;

    public TimeCounterImpl(TimeProvider timeProvider) {
        this.timeProvider = timeProvider;
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.TimeCounter
    public synchronized long getTime() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.paused ? this.counter : (this.timeProvider.elapsedRealtime() - this.lastResumeTime) + this.counter;
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.TimeCounter
    public boolean isEverStarted() {
        return this.firstResumeFlag.get();
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.TimeCounter
    public synchronized void reset() {
        this.firstResumeFlag.set(false);
        this.paused = true;
        this.counter = 0L;
        this.lastResumeTime = 0L;
        this.lastPauseTime = 0L;
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.TimeCounter
    public synchronized void start() {
        this.firstResumeFlag.set(true);
        if (this.paused) {
            this.lastResumeTime = this.timeProvider.elapsedRealtime();
            this.paused = false;
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.TimeCounter
    public synchronized void stop() {
        if (!this.paused) {
            long elapsedRealtime = this.timeProvider.elapsedRealtime();
            this.lastPauseTime = elapsedRealtime;
            this.counter = (elapsedRealtime - this.lastResumeTime) + this.counter;
            this.paused = true;
        }
    }
}
