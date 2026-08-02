package ru.yandex.video.m3.player.ugc_live;

import defpackage.jl40;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.dto.VhVideoData;
import ru.yandex.video.m3.player.impl.tracking.device.DeviceInfoProvider;
import ru.yandex.video.m3.player.tracking.StrmEventLogger;
import ru.yandex.video.m3.player.ugc_live.UgcLiveException;
import ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u0000 32\u00020\u00012\u00020\u0002:\u00013B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000bH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010)R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010*R\u0016\u0010+\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010-\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00101\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, d2 = {"Lru/yandex/video/m3/player/ugc_live/UgcLiveManagerImpl;", "Lru/yandex/video/m3/player/ugc_live/UgcLiveManager;", "Lru/yandex/video/m3/player/ugc_live/ViewersCountChangeListener;", "Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfoProvider;", "deviceInfoProvider", "", "yandexUid", "<init>", "(Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfoProvider;Ljava/lang/String;)V", "Lru/yandex/video/m3/player/ugc_live/UgcLiveState;", "ugcLiveState", "Lzy11;", "setUgcLiveState", "(Lru/yandex/video/m3/player/ugc_live/UgcLiveState;)V", "", "viewersCount", "setViewersCount", "(Ljava/lang/Long;)V", "Lru/yandex/video/m3/player/ugc_live/UgcLiveStateChangeListener;", "listener", "setUgcLiveStateChangedListener", "(Lru/yandex/video/m3/player/ugc_live/UgcLiveStateChangeListener;)V", "getState", "()Lru/yandex/video/m3/player/ugc_live/UgcLiveState;", "setViewersCountChangeListener", "(Lru/yandex/video/m3/player/ugc_live/ViewersCountChangeListener;)V", "getViewersCount", "()Ljava/lang/Long;", "Lru/yandex/video/m3/player/ugc_live/UgcLiveVideoData;", "initialUgcLiveVideoData", "xivaSubscriptionId", "vsid", "Lru/yandex/video/m3/player/tracking/StrmEventLogger;", "strmEventLogger", "Lru/yandex/video/m3/ott/data/dto/VhVideoData;", "getVhVideoData", "(Lru/yandex/video/m3/player/ugc_live/UgcLiveVideoData;Ljava/lang/String;Ljava/lang/String;Lru/yandex/video/m3/player/tracking/StrmEventLogger;)Lru/yandex/video/m3/ott/data/dto/VhVideoData;", "release", "()V", "onViewersCountChanged", "(J)V", "Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfoProvider;", "Ljava/lang/String;", "currentUgcLiveState", "Lru/yandex/video/m3/player/ugc_live/UgcLiveState;", "currentViewsCount", "Ljava/lang/Long;", "stateChangeListener", "Lru/yandex/video/m3/player/ugc_live/UgcLiveStateChangeListener;", "viewsCountChangeListener", "Lru/yandex/video/m3/player/ugc_live/ViewersCountChangeListener;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UgcLiveManagerImpl implements UgcLiveManager, ViewersCountChangeListener {
    private static final String UNAUTHORIZED_USER_ID = "0";
    private volatile UgcLiveState currentUgcLiveState = UgcLiveState.Waiting;
    private volatile Long currentViewsCount;
    private final DeviceInfoProvider deviceInfoProvider;
    private volatile UgcLiveStateChangeListener stateChangeListener;
    private volatile ViewersCountChangeListener viewsCountChangeListener;
    private final String yandexUid;
    public static final int $stable = 8;

    public UgcLiveManagerImpl(DeviceInfoProvider deviceInfoProvider, String str) {
        this.deviceInfoProvider = deviceInfoProvider;
        this.yandexUid = str;
    }

    private final void setUgcLiveState(UgcLiveState ugcLiveState) {
        UgcLiveStateChangeListener ugcLiveStateChangeListener;
        if (ugcLiveState != this.currentUgcLiveState && (ugcLiveStateChangeListener = this.stateChangeListener) != null) {
            ugcLiveStateChangeListener.onUgcLiveStateChanged(ugcLiveState);
        }
        this.currentUgcLiveState = ugcLiveState;
    }

    private final void setViewersCount(Long viewersCount) {
        ViewersCountChangeListener viewersCountChangeListener;
        if (viewersCount != null && !viewersCount.equals(this.currentViewsCount) && (viewersCountChangeListener = this.viewsCountChangeListener) != null) {
            viewersCountChangeListener.onViewersCountChanged(viewersCount.longValue());
        }
        this.currentViewsCount = viewersCount;
    }

    @Override // ru.yandex.video.m3.player.ugc_live.UgcLiveManager
    /* renamed from: getState, reason: from getter */
    public UgcLiveState getCurrentUgcLiveState() {
        return this.currentUgcLiveState;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0060, code lost:
    
        return r1.getVideoData();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (r2.equals(ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData.UgcLiveStatus.READY) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b7, code lost:
    
        return ru.yandex.video.m3.ott.data.dto.VhVideoDataKt.VhVideoData$default("mock", "mock()", null, 4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b8, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b9, code lost:
    
        r0.setUgcLiveState(ru.yandex.video.m3.player.ugc_live.UgcLiveState.Cancelled);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00be, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        if (r2.equals(ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData.UgcLiveStatus.ON_AIR) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        if (r2.equals(ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData.UgcLiveStatus.PREPARING) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0083, code lost:
    
        if (r2.equals(ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData.UgcLiveStatus.OFFLINE) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r2.equals(ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData.UgcLiveStatus.FINISHING) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0057, code lost:
    
        setUgcLiveState(ru.yandex.video.m3.player.ugc_live.UgcLiveState.OnAir);
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    @Override // ru.yandex.video.m3.player.ugc_live.UgcLiveManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VhVideoData getVhVideoData(UgcLiveVideoData initialUgcLiveVideoData, String xivaSubscriptionId, String vsid, StrmEventLogger strmEventLogger) {
        setUgcLiveState(UgcLiveState.Waiting);
        setViewersCount(initialUgcLiveVideoData.getViewersCount());
        if (!jl40.l(initialUgcLiveVideoData.getIsUgcLive(), Boolean.TRUE)) {
            setUgcLiveState(UgcLiveState.OnAir);
            return initialUgcLiveVideoData.getVideoData();
        }
        String ugcLiveStatus = initialUgcLiveVideoData.getUgcLiveStatus();
        if (ugcLiveStatus == null) {
            throw new UgcLiveException.UgcLiveStatusIsNull("initialUgcLiveVideoData with null UgcLive status");
        }
        switch (ugcLiveStatus.hashCode()) {
            case -1548612125:
                break;
            case -1011416060:
                break;
            case -673660814:
                if (ugcLiveStatus.equals(UgcLiveVideoData.UgcLiveStatus.FINISHED)) {
                    setUgcLiveState(UgcLiveState.Finished);
                    return initialUgcLiveVideoData.getVideoData();
                }
                if (initialUgcLiveVideoData.getVideoData() != null) {
                    setUgcLiveState(UgcLiveState.OnAir);
                    return initialUgcLiveVideoData.getVideoData();
                }
                throw new UgcLiveException.UnknownUgcLiveStatus("ugcLiveStatus = " + initialUgcLiveVideoData.getUgcLiveStatus());
            case 105884427:
                break;
            case 108386723:
                break;
            case 476588369:
                if (ugcLiveStatus.equals("cancelled")) {
                    setUgcLiveState(UgcLiveState.Cancelled);
                    throw new UgcLiveException.BroadcastIsCancelled("initialUgcLiveVideoData is already cancelled");
                }
                if (initialUgcLiveVideoData.getVideoData() != null) {
                }
                break;
            case 591355503:
                break;
            default:
                if (initialUgcLiveVideoData.getVideoData() != null) {
                }
                break;
        }
    }

    @Override // ru.yandex.video.m3.player.ugc_live.UgcLiveManager
    /* renamed from: getViewersCount, reason: from getter */
    public Long getCurrentViewsCount() {
        return this.currentViewsCount;
    }

    @Override // ru.yandex.video.m3.player.ugc_live.ViewersCountChangeListener
    public void onViewersCountChanged(long viewersCount) {
        setViewersCount(Long.valueOf(viewersCount));
    }

    @Override // ru.yandex.video.m3.player.ugc_live.UgcLiveManager
    public void release() {
    }

    @Override // ru.yandex.video.m3.player.ugc_live.UgcLiveManager
    public void setUgcLiveStateChangedListener(UgcLiveStateChangeListener listener) {
        this.stateChangeListener = listener;
    }

    @Override // ru.yandex.video.m3.player.ugc_live.UgcLiveManager
    public void setViewersCountChangeListener(ViewersCountChangeListener listener) {
        this.viewsCountChangeListener = listener;
    }
}
