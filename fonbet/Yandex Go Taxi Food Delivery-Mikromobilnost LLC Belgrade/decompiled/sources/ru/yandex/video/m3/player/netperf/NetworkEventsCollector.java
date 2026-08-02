package ru.yandex.video.m3.player.netperf;

import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/netperf/NetworkEventsCollector;", "", "Lru/yandex/video/m3/player/netperf/NetPerfEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "Lzy11;", "addEvent", "(Lru/yandex/video/m3/player/netperf/NetPerfEvent;)V", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface NetworkEventsCollector {
    void addEvent(NetPerfEvent event);
}
