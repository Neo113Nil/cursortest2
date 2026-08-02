package ru.yandex.video.m3.player.tracking;

import defpackage.tls;
import defpackage.w511;
import java.util.Map;
import kotlin.Metadata;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.player.YandexPlayer;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JA\u0010\u000b\u001a\u00020\n2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH&¢\u0006\u0004\b\u000f\u0010\u000eJI\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001b\u001a\u00020\n2\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004j\u0002`\u0006H&¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004j\u0004\u0018\u0001`\u0006H&¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\"\u001a\u00020\n2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0\u001fH&¢\u0006\u0004\b\"\u0010#J\u0011\u0010%\u001a\u0004\u0018\u00010$H&¢\u0006\u0004\b%\u0010&¨\u0006'À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/tracking/StrmManager;", "", "Lru/yandex/video/m3/player/YandexPlayer;", "player", "", "", "Lru/yandex/video/m3/data/AdditionalParameters;", "additionalParameters", "", "isOffline", "Lzy11;", "start", "(Lru/yandex/video/m3/player/YandexPlayer;Ljava/util/Map;Z)V", "release", "()V", "stop", "vsid", "Lru/yandex/video/m3/data/dto/VideoData;", "videoData", "contentId", "", "startPosition", "autoPlay", "", "sourceIndex", "expandManifestUrl", "(Ljava/lang/String;Lru/yandex/video/m3/data/dto/VideoData;Ljava/lang/String;JZIZ)Ljava/lang/String;", "updateAdditionalParameters", "(Ljava/util/Map;)V", "getCurrentAdditionalParameters", "()Ljava/util/Map;", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/impl/tracking/TrackingCommonArguments;", "transform", "updateTrackingCommonArguments", "(Ltls;)V", "Lru/yandex/video/m3/player/tracking/StrmEventLogger;", "getStrmEventLogger", "()Lru/yandex/video/m3/player/tracking/StrmEventLogger;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface StrmManager {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ void start$default(StrmManager strmManager, YandexPlayer yandexPlayer, Map map, boolean z, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: start");
            return;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        strmManager.start(yandexPlayer, map, z);
    }

    String expandManifestUrl(String vsid, VideoData videoData, String contentId, long startPosition, boolean autoPlay, int sourceIndex, boolean isOffline);

    Map<String, Object> getCurrentAdditionalParameters();

    StrmEventLogger getStrmEventLogger();

    void release();

    void start(YandexPlayer<?> player, Map<String, ? extends Object> additionalParameters, boolean isOffline);

    void stop();

    void updateAdditionalParameters(Map<String, ? extends Object> additionalParameters);

    void updateTrackingCommonArguments(tls transform);
}
