package defpackage;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import ru.yandex.music.data.wave.recommendations.Icon;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes5.dex */
public final class dgr implements Serializable {
    public static final dgr e;
    private static final long serialVersionUID = -5417347139426723399L;
    public final StationId a;
    public final List b;
    public final String c;
    public final String d;

    static {
        StationId stationId = StationId.a;
        List list = Collections.EMPTY_LIST;
        Icon icon = Icon.a;
        e = new dgr(stationId, list, "", "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dgr(StationId stationId, String str) {
        this(stationId, r0, str, "");
        List singletonList = Collections.singletonList(stationId.toString());
        Icon icon = Icon.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dgr.class == obj.getClass()) {
            dgr dgrVar = (dgr) obj;
            if (this.a.equals(dgrVar.a) && this.b.equals(dgrVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StationDescriptor{stationId=" + this.a + '}';
    }

    public dgr(StationId stationId, List list, String str, String str2) {
        this.a = stationId;
        this.b = list;
        this.c = str;
        this.d = str2;
    }
}
