package kotlinx.datetime;

import java.time.ZoneId;

/* loaded from: classes4.dex */
public class TimeZone {
    public static final /* synthetic */ int b = 0;
    public final ZoneId a;

    static {
        UtcOffset.Companion.getClass();
        ZoneId.of("UTC");
    }

    public TimeZone(ZoneId zoneId) {
        this.a = zoneId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TimeZone) {
            return this.a.equals(((TimeZone) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
