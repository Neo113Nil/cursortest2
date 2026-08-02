package ru.yandex.video.m3.player.impl.tracking;

import defpackage.tls;
import java.util.Map;
import kotlin.Metadata;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.player.YandexPlayer;
import ru.yandex.video.m3.player.tracking.StrmEventLogger;
import ru.yandex.video.m3.player.tracking.StrmManager;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000e\u001a\u00020\r2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006j\u0004\u0018\u0001`\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0003JI\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001d\u001a\u00020\r2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\u001f\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006j\u0004\u0018\u0001`\tH\u0016¢\u0006\u0004\b\u001f\u0010 J#\u0010$\u001a\u00020\r2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\"0!H\u0016¢\u0006\u0004\b$\u0010%J\u0011\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/OfflineStrmManagerImpl;", "Lru/yandex/video/m3/player/tracking/StrmManager;", "<init>", "()V", "Lru/yandex/video/m3/player/YandexPlayer;", "player", "", "", "", "Lru/yandex/video/m3/data/AdditionalParameters;", "additionalParameters", "", "isOffline", "Lzy11;", "start", "(Lru/yandex/video/m3/player/YandexPlayer;Ljava/util/Map;Z)V", "release", "stop", "vsid", "Lru/yandex/video/m3/data/dto/VideoData;", "videoData", "contentId", "", "startPosition", "autoPlay", "", "sourceIndex", "expandManifestUrl", "(Ljava/lang/String;Lru/yandex/video/m3/data/dto/VideoData;Ljava/lang/String;JZIZ)Ljava/lang/String;", "updateAdditionalParameters", "(Ljava/util/Map;)V", "getCurrentAdditionalParameters", "()Ljava/util/Map;", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/impl/tracking/TrackingCommonArguments;", "transform", "updateTrackingCommonArguments", "(Ltls;)V", "Lru/yandex/video/m3/player/tracking/StrmEventLogger;", "getStrmEventLogger", "()Lru/yandex/video/m3/player/tracking/StrmEventLogger;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OfflineStrmManagerImpl implements StrmManager {
    public static final int $stable = 0;

    @Override // ru.yandex.video.m3.player.tracking.StrmManager
    public String expandManifestUrl(String vsid, VideoData videoData, String contentId, long startPosition, boolean autoPlay, int sourceIndex, boolean isOffline) {
        return videoData.getManifestUrl();
    }

    @Override // ru.yandex.video.m3.player.tracking.StrmManager
    public Map<String, Object> getCurrentAdditionalParameters() {
        return null;
    }

    @Override // ru.yandex.video.m3.player.tracking.StrmManager
    public StrmEventLogger getStrmEventLogger() {
        return null;
    }

    @Override // ru.yandex.video.m3.player.tracking.StrmManager
    public void release() {
    }

    @Override // ru.yandex.video.m3.player.tracking.StrmManager
    public void start(YandexPlayer<?> player, Map<String, ? extends Object> additionalParameters, boolean isOffline) {
    }

    @Override // ru.yandex.video.m3.player.tracking.StrmManager
    public void stop() {
    }

    @Override // ru.yandex.video.m3.player.tracking.StrmManager
    public void updateAdditionalParameters(Map<String, ? extends Object> additionalParameters) {
    }

    @Override // ru.yandex.video.m3.player.tracking.StrmManager
    public void updateTrackingCommonArguments(tls transform) {
    }
}
