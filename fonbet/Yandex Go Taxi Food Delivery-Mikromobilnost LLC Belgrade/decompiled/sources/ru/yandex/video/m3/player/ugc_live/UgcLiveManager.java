package ru.yandex.video.m3.player.ugc_live;

import defpackage.jxi;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.dto.VhVideoData;
import ru.yandex.video.m3.player.tracking.StrmEventLogger;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\nH'¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH'¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H'¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H'¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/ugc_live/UgcLiveManager;", "", "Lru/yandex/video/m3/player/ugc_live/UgcLiveStateChangeListener;", "listener", "Lzy11;", "setUgcLiveStateChangedListener", "(Lru/yandex/video/m3/player/ugc_live/UgcLiveStateChangeListener;)V", "Lru/yandex/video/m3/player/ugc_live/UgcLiveState;", "getState", "()Lru/yandex/video/m3/player/ugc_live/UgcLiveState;", "Lru/yandex/video/m3/player/ugc_live/ViewersCountChangeListener;", "setViewersCountChangeListener", "(Lru/yandex/video/m3/player/ugc_live/ViewersCountChangeListener;)V", "", "getViewersCount", "()Ljava/lang/Long;", "Lru/yandex/video/m3/player/ugc_live/UgcLiveVideoData;", "initialUgcLiveVideoData", "", "xivaSubscriptionId", "vsid", "Lru/yandex/video/m3/player/tracking/StrmEventLogger;", "strmEventLogger", "Lru/yandex/video/m3/ott/data/dto/VhVideoData;", "getVhVideoData", "(Lru/yandex/video/m3/player/ugc_live/UgcLiveVideoData;Ljava/lang/String;Ljava/lang/String;Lru/yandex/video/m3/player/tracking/StrmEventLogger;)Lru/yandex/video/m3/ott/data/dto/VhVideoData;", "release", "()V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface UgcLiveManager {
    UgcLiveState getState();

    @jxi
    VhVideoData getVhVideoData(UgcLiveVideoData initialUgcLiveVideoData, String xivaSubscriptionId, String vsid, StrmEventLogger strmEventLogger);

    Long getViewersCount();

    void release();

    void setUgcLiveStateChangedListener(UgcLiveStateChangeListener listener);

    void setViewersCountChangeListener(ViewersCountChangeListener listener);
}
