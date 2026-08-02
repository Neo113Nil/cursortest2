package ru.yandex.video.m3.player.impl.tracking.data;

import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;
import ru.yandex.video.m3.player.impl.tracking.event.Event;
import ru.yandex.video.m3.player.impl.tracking.event.EventType;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/data/DefaultLoggingFilter;", "Lru/yandex/video/m3/player/impl/tracking/data/LoggingFilter;", "()V", "isAllowedToSendLog", "", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "Lru/yandex/video/m3/player/impl/tracking/event/Event;", "eventType", "Lru/yandex/video/m3/player/impl/tracking/event/EventType;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultLoggingFilter implements LoggingFilter {
    public static final int $stable = 0;

    @Override // ru.yandex.video.m3.player.impl.tracking.data.LoggingFilter
    public boolean isAllowedToSendLog(Event event, EventType eventType) {
        return true;
    }
}
