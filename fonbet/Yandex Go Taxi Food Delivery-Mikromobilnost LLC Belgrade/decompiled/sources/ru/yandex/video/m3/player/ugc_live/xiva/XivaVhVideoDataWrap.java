package ru.yandex.video.m3.player.ugc_live.xiva;

import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.dto.VhVideoData;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/player/ugc_live/xiva/XivaVhVideoDataWrap;", "", "vhVideoData", "Lru/yandex/video/m3/ott/data/dto/VhVideoData;", "xivaOutputUgcLiveStatus", "Lru/yandex/video/m3/player/ugc_live/xiva/XivaOutputUgcLiveStatus;", "(Lru/yandex/video/m3/ott/data/dto/VhVideoData;Lru/yandex/video/m3/player/ugc_live/xiva/XivaOutputUgcLiveStatus;)V", "getVhVideoData", "()Lru/yandex/video/m3/ott/data/dto/VhVideoData;", "getXivaOutputUgcLiveStatus", "()Lru/yandex/video/m3/player/ugc_live/xiva/XivaOutputUgcLiveStatus;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class XivaVhVideoDataWrap {
    public static final int $stable = 8;
    private final VhVideoData vhVideoData;
    private final XivaOutputUgcLiveStatus xivaOutputUgcLiveStatus;

    public XivaVhVideoDataWrap(VhVideoData vhVideoData, XivaOutputUgcLiveStatus xivaOutputUgcLiveStatus) {
        this.vhVideoData = vhVideoData;
        this.xivaOutputUgcLiveStatus = xivaOutputUgcLiveStatus;
    }

    public final VhVideoData getVhVideoData() {
        return this.vhVideoData;
    }

    public final XivaOutputUgcLiveStatus getXivaOutputUgcLiveStatus() {
        return this.xivaOutputUgcLiveStatus;
    }
}
