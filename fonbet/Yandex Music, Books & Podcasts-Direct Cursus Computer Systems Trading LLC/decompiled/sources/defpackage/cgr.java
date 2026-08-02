package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes5.dex */
public final class cgr {
    public final StationId a;
    public final String b;
    public final String c;
    public final jcv d;
    public final Map e;
    public final boolean f;

    public cgr(StationId stationId, String str, String str2, jcv jcvVar, Map map, boolean z) {
        this.a = stationId;
        this.b = str;
        this.c = str2;
        this.d = jcvVar;
        this.e = map;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgr)) {
            return false;
        }
        cgr cgrVar = (cgr) obj;
        return this.a.equals(cgrVar.a) && this.b.equals(cgrVar.b) && this.c.equals(cgrVar.c) && Intrinsics.d(this.d, cgrVar.d) && this.e.equals(cgrVar.e) && this.f == cgrVar.f;
    }

    public final int hashCode() {
        int c = k5r.c(k5r.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        jcv jcvVar = this.d;
        return Boolean.hashCode(this.f) + f1d.b(this.e, (c + (jcvVar == null ? 0 : jcvVar.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "StationContext(stationId=" + this.a + ", name=" + this.b + ", idForFrom=" + this.c + ", specialImage=" + this.d + ", restrictions=" + this.e + ", notificationDotEnabled=" + this.f + ")";
    }
}
