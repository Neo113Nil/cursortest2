package ru.yandex.video.m3.player.ugc_live;

import kotlin.Metadata;
import ru.CryptoPro.JCSP.Key.tls.TlsConstants;
import ru.yandex.video.m3.ott.data.dto.VhVideoData;
import ru.yandex.video.m3.player.impl.tracking.data.DefaultErrorCategoryProvider;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0016B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0006\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f¨\u0006\u0017"}, d2 = {"Lru/yandex/video/m3/player/ugc_live/UgcLiveVideoData;", "", "videoData", "Lru/yandex/video/m3/ott/data/dto/VhVideoData;", "xivaSubscriptionId", "", "isUgcLive", "", "ugcLiveStatus", "viewersCount", "", "(Lru/yandex/video/m3/ott/data/dto/VhVideoData;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Long;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUgcLiveStatus", "()Ljava/lang/String;", "getVideoData", "()Lru/yandex/video/m3/ott/data/dto/VhVideoData;", "getViewersCount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getXivaSubscriptionId", "UgcLiveStatus", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UgcLiveVideoData {
    public static final int $stable = 8;
    private final Boolean isUgcLive;
    private final String ugcLiveStatus;
    private final VhVideoData videoData;
    private final Long viewersCount;
    private final String xivaSubscriptionId;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/player/ugc_live/UgcLiveVideoData$UgcLiveStatus;", "", "()V", "CANCELLED", "", TlsConstants.TLS_FINISHED, "FINISHING", "OFFLINE", "ON_AIR", DefaultErrorCategoryProvider.PREPARING, "READY", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class UgcLiveStatus {
        public static final int $stable = 0;
        public static final String CANCELLED = "cancelled";
        public static final String FINISHED = "finished";
        public static final String FINISHING = "finishing";
        public static final UgcLiveStatus INSTANCE = new UgcLiveStatus();
        public static final String OFFLINE = "offline";
        public static final String ON_AIR = "onair";
        public static final String PREPARING = "preparing";
        public static final String READY = "ready";

        private UgcLiveStatus() {
        }
    }

    public UgcLiveVideoData(VhVideoData vhVideoData, String str, Boolean bool, String str2, Long l) {
        this.videoData = vhVideoData;
        this.xivaSubscriptionId = str;
        this.isUgcLive = bool;
        this.ugcLiveStatus = str2;
        this.viewersCount = l;
    }

    public final String getUgcLiveStatus() {
        return this.ugcLiveStatus;
    }

    public final VhVideoData getVideoData() {
        return this.videoData;
    }

    public final Long getViewersCount() {
        return this.viewersCount;
    }

    public final String getXivaSubscriptionId() {
        return this.xivaSubscriptionId;
    }

    /* renamed from: isUgcLive, reason: from getter */
    public final Boolean getIsUgcLive() {
        return this.isUgcLive;
    }
}
