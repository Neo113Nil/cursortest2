package defpackage;

import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes5.dex */
public final class xxu {
    public final StationId a;
    public final String b;

    public xxu(StationId stationId, String str) {
        this.a = stationId;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxu)) {
            return false;
        }
        xxu xxuVar = (xxu) obj;
        return this.a.equals(xxuVar.a) && this.b.equals(xxuVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WavePromo(notificationStationId=" + this.a + ", notificationHash=" + this.b + ")";
    }
}
