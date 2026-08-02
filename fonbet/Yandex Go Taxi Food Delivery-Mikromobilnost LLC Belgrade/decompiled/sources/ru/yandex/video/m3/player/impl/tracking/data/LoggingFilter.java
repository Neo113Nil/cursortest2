package ru.yandex.video.m3.player.impl.tracking.data;

import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;
import ru.yandex.video.m3.player.impl.tracking.event.Event;
import ru.yandex.video.m3.player.impl.tracking.event.EventType;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/data/LoggingFilter;", "", "isAllowedToSendLog", "", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "Lru/yandex/video/m3/player/impl/tracking/event/Event;", "eventType", "Lru/yandex/video/m3/player/impl/tracking/event/EventType;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface LoggingFilter {
    boolean isAllowedToSendLog(Event event, EventType eventType);
}
