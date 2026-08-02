package ru.yandex.video.m3.ott.data.net;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\u001c\u0010\u0004\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006j\u0002`\b0\u0005H&¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/ott/data/net/OttTrackingApi;", "", "sendEvents", "Ljava/util/concurrent/Future;", "events", "", "", "", "Lru/yandex/video/m3/ott/data/dto/OttTrackingEvent;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface OttTrackingApi {
    Future<?> sendEvents(List<? extends Map<String, ? extends Object>> events);
}
