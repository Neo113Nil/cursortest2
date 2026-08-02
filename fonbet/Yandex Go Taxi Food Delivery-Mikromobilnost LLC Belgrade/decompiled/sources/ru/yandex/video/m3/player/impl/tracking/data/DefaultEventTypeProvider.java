package ru.yandex.video.m3.player.impl.tracking.data;

import defpackage.w511;
import kotlin.Metadata;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;
import ru.yandex.video.m3.player.impl.tracking.event.EventType;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/data/DefaultEventTypeProvider;", "Lru/yandex/video/m3/player/impl/tracking/data/EventTypeProvider;", "()V", "getEventType", "", "eventType", "Lru/yandex/video/m3/player/impl/tracking/event/EventType;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultEventTypeProvider implements EventTypeProvider {
    public static final int $stable = 0;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EventType.values().length];
            try {
                iArr[EventType.EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventType.FATAL_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EventType.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // ru.yandex.video.m3.player.impl.tracking.data.EventTypeProvider
    public String getEventType(EventType eventType) {
        int i = WhenMappings.$EnumSwitchMapping$0[eventType.ordinal()];
        if (i == 1) {
            return DatabaseHelper.OttTrackingTable.COLUMN_EVENT;
        }
        if (i == 2) {
            return "fatal";
        }
        if (i == 3) {
            return "error";
        }
        w511.b();
        return null;
    }
}
