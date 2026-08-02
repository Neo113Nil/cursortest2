package ru.yandex.video.m3.player.live;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0011\u001a\u00020\u0012H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0012\u0010\u000f\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\t¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/live/LiveSpeedControlInfoProvider;", "", "adjustedSpeed", "", "getAdjustedSpeed", "()F", "currentTargetOffsetMs", "", "getCurrentTargetOffsetMs", "()J", "exoPlayerLiveOffset", "getExoPlayerLiveOffset", "()Ljava/lang/Long;", "liveOffsetDifference", "getLiveOffsetDifference", "targetOffsetOverride", "getTargetOffsetOverride", "hasAvailableInfo", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface LiveSpeedControlInfoProvider {
    float getAdjustedSpeed();

    long getCurrentTargetOffsetMs();

    Long getExoPlayerLiveOffset();

    Long getLiveOffsetDifference();

    long getTargetOffsetOverride();

    boolean hasAvailableInfo();
}
