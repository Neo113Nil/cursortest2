package ru.yandex.video.m3.ott.data.tracking;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.builders.MapBuilder;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.data.dto.VideoDataSerializer;
import ru.yandex.video.m3.ott.data.dto.OttVideoData;
import ru.yandex.video.m3.player.tracking.BaseVideoDataSerializer;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/ott/data/tracking/OttVideoDataSerializer;", "Lru/yandex/video/m3/data/dto/VideoDataSerializer;", "()V", "serialize", "", "", "", Constants.KEY_DATA, "Lru/yandex/video/m3/data/dto/VideoData;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OttVideoDataSerializer implements VideoDataSerializer {
    public static final int $stable = 0;

    @Override // ru.yandex.video.m3.data.dto.VideoDataSerializer
    public Map<String, Object> serialize(VideoData data) {
        if (!(data instanceof OttVideoData)) {
            return BaseVideoDataSerializer.INSTANCE.getINSTANCE().serialize(data);
        }
        MapBuilder mapBuilder = new MapBuilder();
        OttVideoData ottVideoData = (OttVideoData) data;
        mapBuilder.put("contentId", ottVideoData.getContentId());
        mapBuilder.put("multiplex", Boolean.valueOf(ottVideoData.getMultiplex()));
        mapBuilder.put("watchProgressPosition", Long.valueOf(ottVideoData.getWatchProgressPosition()));
        String contentType = ottVideoData.getContentType();
        if (contentType != null) {
            mapBuilder.put("contentType", contentType);
        }
        return mapBuilder.j();
    }
}
