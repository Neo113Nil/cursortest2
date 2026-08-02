package ru.yandex.video.m3.player.impl.tracking.data;

import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;
import ru.yandex.video.m3.player.impl.tracking.event.Event;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/data/DefaultEventNameProvider;", "Lru/yandex/video/m3/player/impl/tracking/data/EventNameProvider;", "()V", "getEventName", "", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "Lru/yandex/video/m3/player/impl/tracking/event/Event;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultEventNameProvider implements EventNameProvider {
    public static final int $stable = 0;

    @Override // ru.yandex.video.m3.player.impl.tracking.data.EventNameProvider
    public String getEventName(Event event) {
        return event.getEventName();
    }
}
