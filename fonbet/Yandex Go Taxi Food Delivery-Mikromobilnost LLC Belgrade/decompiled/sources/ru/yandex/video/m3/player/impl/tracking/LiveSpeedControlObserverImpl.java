package ru.yandex.video.m3.player.impl.tracking;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import ru.yandex.video.m3.player.live.LiveSpeedControlObserver;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R$\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010!\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00078V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0016\u0010&\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#R$\u0010)\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00078V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010 ¨\u0006*"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/LiveSpeedControlObserverImpl;", "Lru/yandex/video/m3/player/live/LiveSpeedControlObserver;", "<init>", "()V", "", "hasAvailableInfo", "()Z", "", "offset", "diffFromCurrentLiveOffset", "Lzy11;", "setExoPlayerLiveOffset", "(JLjava/lang/Long;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "", "_adjustedSpeed", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicLong;", "_currentTargetOffset", "Ljava/util/concurrent/atomic/AtomicLong;", "_targetOffsetOverride", "_exoLiveOffset", "_diffExoFromLiveOffset", "value", "getAdjustedSpeed", "()F", "setAdjustedSpeed", "(F)V", "adjustedSpeed", "getCurrentTargetOffsetMs", "()J", "setCurrentTargetOffsetMs", "(J)V", "currentTargetOffsetMs", "getExoPlayerLiveOffset", "()Ljava/lang/Long;", "exoPlayerLiveOffset", "getLiveOffsetDifference", "liveOffsetDifference", "getTargetOffsetOverride", "setTargetOffsetOverride", "targetOffsetOverride", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LiveSpeedControlObserverImpl implements LiveSpeedControlObserver {
    public static final int $stable = 8;
    private final AtomicReference<Float> _adjustedSpeed = new AtomicReference<>();
    private final AtomicLong _currentTargetOffset = new AtomicLong();
    private final AtomicLong _targetOffsetOverride = new AtomicLong();
    private final AtomicLong _exoLiveOffset = new AtomicLong();
    private final AtomicLong _diffExoFromLiveOffset = new AtomicLong(-9223372036854775807L);

    @Override // ru.yandex.video.m3.player.live.LiveSpeedControlObserver, ru.yandex.video.m3.player.live.LiveSpeedControlInfoProvider
    public float getAdjustedSpeed() {
        Float f = this._adjustedSpeed.get();
        if (f == null) {
            return 1.0f;
        }
        return f.floatValue();
    }

    @Override // ru.yandex.video.m3.player.live.LiveSpeedControlObserver, ru.yandex.video.m3.player.live.LiveSpeedControlInfoProvider
    public long getCurrentTargetOffsetMs() {
        return this._currentTargetOffset.get();
    }

    @Override // ru.yandex.video.m3.player.live.LiveSpeedControlInfoProvider
    public Long getExoPlayerLiveOffset() {
        Long valueOf = Long.valueOf(this._exoLiveOffset.get());
        if (valueOf.longValue() != -9223372036854775807L) {
            return valueOf;
        }
        return null;
    }

    @Override // ru.yandex.video.m3.player.live.LiveSpeedControlInfoProvider
    public Long getLiveOffsetDifference() {
        Long valueOf = Long.valueOf(this._diffExoFromLiveOffset.get());
        if (valueOf.longValue() == -9223372036854775807L || this._exoLiveOffset.get() == -9223372036854775807L) {
            return null;
        }
        return valueOf;
    }

    @Override // ru.yandex.video.m3.player.live.LiveSpeedControlObserver, ru.yandex.video.m3.player.live.LiveSpeedControlInfoProvider
    public long getTargetOffsetOverride() {
        return this._targetOffsetOverride.get();
    }

    @Override // ru.yandex.video.m3.player.live.LiveSpeedControlInfoProvider
    public boolean hasAvailableInfo() {
        return this._adjustedSpeed.get() != null;
    }

    @Override // ru.yandex.video.m3.player.live.LiveSpeedControlObserver
    public void setAdjustedSpeed(float f) {
        this._adjustedSpeed.set(Float.valueOf(f));
    }

    @Override // ru.yandex.video.m3.player.live.LiveSpeedControlObserver
    public void setCurrentTargetOffsetMs(long j) {
        this._currentTargetOffset.set(j);
    }

    @Override // ru.yandex.video.m3.player.live.LiveSpeedControlObserver
    public void setExoPlayerLiveOffset(long offset, Long diffFromCurrentLiveOffset) {
        this._exoLiveOffset.set(offset);
        if (diffFromCurrentLiveOffset != null) {
            this._diffExoFromLiveOffset.set(diffFromCurrentLiveOffset.longValue());
        }
    }

    @Override // ru.yandex.video.m3.player.live.LiveSpeedControlObserver
    public void setTargetOffsetOverride(long j) {
        this._targetOffsetOverride.set(j);
    }
}
