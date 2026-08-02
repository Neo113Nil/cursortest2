package j$.time;

import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public abstract class Clock {
    public abstract ZoneId a();

    public abstract Instant b();

    public static Clock systemDefaultZone() {
        String id = TimeZone.getDefault().getID();
        Map map = ZoneId.a;
        Objects.requireNonNull(id, "zoneId");
        Objects.requireNonNull(map, "aliasMap");
        String str = (String) map.get(id);
        if (str != null) {
            id = str;
        }
        return new a(ZoneId.of(id));
    }
}
