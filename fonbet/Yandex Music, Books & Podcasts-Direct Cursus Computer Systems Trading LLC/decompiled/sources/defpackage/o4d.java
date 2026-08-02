package defpackage;

import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes3.dex */
public final class o4d implements p4d {
    public final StationId a;

    public o4d(StationId stationId) {
        this.a = stationId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o4d) && Intrinsics.d(this.a, ((o4d) obj).a);
    }

    public final int hashCode() {
        StationId stationId = this.a;
        if (stationId == null) {
            return 0;
        }
        return stationId.hashCode();
    }

    public final String toString() {
        return "Stopped(stationId=" + this.a + ")";
    }
}
