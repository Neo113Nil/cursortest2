package defpackage;

import com.yandex.media.ynison.service.s;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes4.dex */
public final class wab implements xab {
    public final s a;
    public final rse b;
    public final o4q c;
    public final StationId d;
    public final gxc e;
    public final jyr f = btf.b(new ita(5, this));

    public wab(s sVar, rse rseVar, o4q o4qVar, StationId stationId, gxc gxcVar) {
        this.a = sVar;
        this.b = rseVar;
        this.c = o4qVar;
        this.d = stationId;
        this.e = gxcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wab)) {
            return false;
        }
        wab wabVar = (wab) obj;
        return Intrinsics.d(this.a, wabVar.a) && this.b.equals(wabVar.b) && this.c == wabVar.c && Intrinsics.d(this.d, wabVar.d) && this.e.equals(wabVar.e);
    }

    public final int hashCode() {
        s sVar = this.a;
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + ((sVar == null ? 0 : sVar.hashCode()) * 31)) * 31)) * 31;
        StationId stationId = this.d;
        return this.e.hashCode() + ((hashCode + (stationId != null ? stationId.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "WaveEntityKey(waveSession=" + this.a + ", trackSources=" + this.b + ", entityMode=" + this.c + ", fallbackStationId=" + this.d + ", fromData=" + this.e + ")";
    }
}
