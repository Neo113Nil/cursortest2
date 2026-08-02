package ru.yandex.video.m3.player.live;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\r\u001a\u00020\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0012\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0015\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/live/LiveSpeedControlObserver;", "Lru/yandex/video/m3/player/live/LiveSpeedControlInfoProvider;", "", "offset", "diffFromCurrentLiveOffset", "Lzy11;", "setExoPlayerLiveOffset", "(JLjava/lang/Long;)V", "", "getAdjustedSpeed", "()F", "setAdjustedSpeed", "(F)V", "adjustedSpeed", "getCurrentTargetOffsetMs", "()J", "setCurrentTargetOffsetMs", "(J)V", "currentTargetOffsetMs", "getTargetOffsetOverride", "setTargetOffsetOverride", "targetOffsetOverride", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface LiveSpeedControlObserver extends LiveSpeedControlInfoProvider {
    @Override // ru.yandex.video.m3.player.live.LiveSpeedControlInfoProvider
    float getAdjustedSpeed();

    @Override // ru.yandex.video.m3.player.live.LiveSpeedControlInfoProvider
    long getCurrentTargetOffsetMs();

    @Override // ru.yandex.video.m3.player.live.LiveSpeedControlInfoProvider
    long getTargetOffsetOverride();

    void setAdjustedSpeed(float f);

    void setCurrentTargetOffsetMs(long j);

    void setExoPlayerLiveOffset(long offset, Long diffFromCurrentLiveOffset);

    void setTargetOffsetOverride(long j);
}
