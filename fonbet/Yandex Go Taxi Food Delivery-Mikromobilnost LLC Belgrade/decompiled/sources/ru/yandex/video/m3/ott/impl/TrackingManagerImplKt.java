package ru.yandex.video.m3.ott.impl;

import java.util.Locale;
import kotlin.Metadata;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.ott.data.dto.OttVideoData;
import ru.yandex.video.m3.player.YandexPlayer;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0002H\u0002\u001a\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0005H\u0002¨\u0006\u0006"}, d2 = {"getFts", "", "Lru/yandex/video/m3/player/YandexPlayer;", "getUseDrmType", "", "Lru/yandex/video/m3/data/dto/VideoData;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TrackingManagerImplKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoType.values().length];
            try {
                iArr[VideoType.VOD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getFts(YandexPlayer<?> yandexPlayer) {
        VideoType videoType = yandexPlayer.getVideoType();
        if ((videoType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[videoType.ordinal()]) == 1) {
            return yandexPlayer.getPosition();
        }
        return yandexPlayer.getPosition() + yandexPlayer.getTimelineLeftEdge();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getUseDrmType(VideoData videoData) {
        OttVideoData ottVideoData = videoData instanceof OttVideoData ? (OttVideoData) videoData : null;
        if (ottVideoData == null || ottVideoData.getDrmConfig() == null) {
            return null;
        }
        return "Widevine".toLowerCase(Locale.ROOT);
    }
}
