package defpackage;

import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes3.dex */
public final class n4d implements p4d {
    public final StationId a;

    public n4d(StationId stationId) {
        this.a = stationId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n4d) && this.a.equals(((n4d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Playing(stationId=" + this.a + ")";
    }
}
