package ru.yandex.taxi.layers;

import defpackage.k4o;
import java.util.EnumMap;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.map_object.MapObjectType;

/* loaded from: classes9.dex */
public final class LayersAnalyticEventEmmiter {
    public final EnumMap a = new EnumMap(MapObjectType.class);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/layers/LayersAnalyticEventEmmiter$Event;", "", "AVAILABLE", "SHOWN", "SEEN", "TAP", "old"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Event {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;
        public static final Event AVAILABLE;
        public static final Event SEEN;
        public static final Event SHOWN;
        public static final Event TAP;

        static {
            Event event = new Event("AVAILABLE", 0);
            AVAILABLE = event;
            Event event2 = new Event("SHOWN", 1);
            SHOWN = event2;
            Event event3 = new Event("SEEN", 2);
            SEEN = event3;
            Event event4 = new Event("TAP", 3);
            TAP = event4;
            Event[] eventArr = {event, event2, event3, event4};
            $VALUES = eventArr;
            $ENTRIES = kotlin.enums.a.a(eventArr);
        }

        public static Event valueOf(String str) {
            return (Event) Enum.valueOf(Event.class, str);
        }

        public static Event[] values() {
            return (Event[]) $VALUES.clone();
        }
    }
}
