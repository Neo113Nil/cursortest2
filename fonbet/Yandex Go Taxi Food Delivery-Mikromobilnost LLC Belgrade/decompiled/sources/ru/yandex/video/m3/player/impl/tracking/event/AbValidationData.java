package ru.yandex.video.m3.player.impl.tracking.event;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nR\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/event/AbValidationData;", "Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;", "flags", "", "", "", "slots", "testIds", "", "", "(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;)V", "getFlags", "()Ljava/util/Map;", "getSlots", "()Ljava/lang/String;", "getTestIds", "()Ljava/util/List;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AbValidationData extends DefaultEventData {
    public static final int $stable = 8;
    private final Map<String, Object> flags;
    private final String slots;
    private final List<Integer> testIds;

    public AbValidationData(Map<String, ? extends Object> map, String str, List<Integer> list) {
        super(null, 1, null);
        this.flags = map;
        this.slots = str;
        this.testIds = list;
    }

    public final Map<String, Object> getFlags() {
        return this.flags;
    }

    public final String getSlots() {
        return this.slots;
    }

    public final List<Integer> getTestIds() {
        return this.testIds;
    }
}
