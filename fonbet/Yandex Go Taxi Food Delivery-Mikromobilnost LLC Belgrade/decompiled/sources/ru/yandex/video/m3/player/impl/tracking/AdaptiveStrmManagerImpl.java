package ru.yandex.video.m3.player.impl.tracking;

import defpackage.jl40;
import defpackage.sls;
import defpackage.tls;
import java.util.Map;
import kotlin.Metadata;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.tracking.StrmEventLogger;
import ru.yandex.video.m3.player.tracking.StrmManager;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 32\u00020\u0001:\u00013B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0082\b¢\u0006\u0004\b\t\u0010\nJ?\u0010\u0015\u001a\u00020\u00142\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b2\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rj\u0004\u0018\u0001`\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u0018JI\u0010#\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00122\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010$J'\u0010%\u001a\u00020\u00142\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rj\u0002`\u0010H\u0016¢\u0006\u0004\b%\u0010&J#\u0010'\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rj\u0004\u0018\u0001`\u0010H\u0016¢\u0006\u0004\b'\u0010(J#\u0010,\u001a\u00020\u00142\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*0)H\u0016¢\u0006\u0004\b,\u0010-J\u0011\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b/\u00100R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u00101R\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00101R\u0016\u00102\u001a\u00020\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00101¨\u00064"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/AdaptiveStrmManagerImpl;", "Lru/yandex/video/m3/player/tracking/StrmManager;", "onlineImpl", "offlineImpl", "<init>", "(Lru/yandex/video/m3/player/tracking/StrmManager;Lru/yandex/video/m3/player/tracking/StrmManager;)V", "T", "Lkotlin/Function0;", "block", "syncActual", "(Lsls;)Ljava/lang/Object;", "Lru/yandex/video/m3/player/YandexPlayer;", "player", "", "", "", "Lru/yandex/video/m3/data/AdditionalParameters;", "additionalParameters", "", "isOffline", "Lzy11;", "start", "(Lru/yandex/video/m3/player/YandexPlayer;Ljava/util/Map;Z)V", "stop", "()V", "release", "vsid", "Lru/yandex/video/m3/data/dto/VideoData;", "videoData", "contentId", "", "startPosition", "autoPlay", "", "sourceIndex", "expandManifestUrl", "(Ljava/lang/String;Lru/yandex/video/m3/data/dto/VideoData;Ljava/lang/String;JZIZ)Ljava/lang/String;", "updateAdditionalParameters", "(Ljava/util/Map;)V", "getCurrentAdditionalParameters", "()Ljava/util/Map;", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/impl/tracking/TrackingCommonArguments;", "transform", "updateTrackingCommonArguments", "(Ltls;)V", "Lru/yandex/video/m3/player/tracking/StrmEventLogger;", "getStrmEventLogger", "()Lru/yandex/video/m3/player/tracking/StrmEventLogger;", "Lru/yandex/video/m3/player/tracking/StrmManager;", "actual", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdaptiveStrmManagerImpl implements StrmManager {
    public static final String TAG = "AdaptiveStrmManagerImpl";
    private StrmManager actual;
    private final StrmManager offlineImpl;
    private final StrmManager onlineImpl;
    public static final int $stable = 8;

    public AdaptiveStrmManagerImpl(StrmManager strmManager, StrmManager strmManager2) {
        this.onlineImpl = strmManager;
        this.offlineImpl = strmManager2;
        this.actual = strmManager;
    }

    private final <T> T syncActual(sls block) {
        T t;
        synchronized (this) {
            t = (T) block.invoke();
        }
        return t;
    }

    @Override // ru.yandex.video.m3.player.tracking.StrmManager
    public String expandManifestUrl(String vsid, VideoData videoData, String contentId, long startPosition, boolean autoPlay, int sourceIndex, boolean isOffline) {
        return (isOffline ? this.offlineImpl : this.onlineImpl).expandManifestUrl(vsid, videoData, contentId, startPosition, autoPlay, sourceIndex, isOffline);
    }

    @Override // ru.yandex.video.m3.player.tracking.StrmManager
    public Map<String, Object> getCurrentAdditionalParameters() {
        return this.onlineImpl.getCurrentAdditionalParameters();
    }

    @Override // ru.yandex.video.m3.player.tracking.StrmManager
    public StrmEventLogger getStrmEventLogger() {
        return this.actual.getStrmEventLogger();
    }

    @Override // ru.yandex.video.m3.player.tracking.StrmManager
    public void release() {
        this.offlineImpl.release();
        this.onlineImpl.release();
    }

    @Override // ru.yandex.video.m3.player.tracking.StrmManager
    public void start(YandexPlayer<?> player, Map<String, ? extends Object> additionalParameters, boolean isOffline) {
        synchronized (this) {
            try {
                StrmManager strmManager = this.actual;
                this.actual = isOffline ? this.offlineImpl : this.onlineImpl;
                jl40.l(strmManager, this.offlineImpl);
                if (!jl40.l(this.actual, strmManager)) {
                    strmManager.stop();
                }
                this.actual.start(player, additionalParameters, isOffline);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ru.yandex.video.m3.player.tracking.StrmManager
    public void stop() {
        synchronized (this) {
            this.actual.stop();
        }
    }

    @Override // ru.yandex.video.m3.player.tracking.StrmManager
    public void updateAdditionalParameters(Map<String, ? extends Object> additionalParameters) {
        this.onlineImpl.updateAdditionalParameters(additionalParameters);
    }

    @Override // ru.yandex.video.m3.player.tracking.StrmManager
    public void updateTrackingCommonArguments(tls transform) {
        this.onlineImpl.updateTrackingCommonArguments(transform);
    }
}
