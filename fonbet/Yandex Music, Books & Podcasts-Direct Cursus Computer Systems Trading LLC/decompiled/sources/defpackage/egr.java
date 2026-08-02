package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.data.wave.recommendations.Icon;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes5.dex */
public final class egr {
    public final StationId a;
    public final String b;
    public final Icon c;
    public final String d;
    public final String e;
    public final Map f;
    public final Object g;

    public egr(StationId stationId, String str, Icon icon, String str2, String str3, Map map, Map map2) {
        this.a = stationId;
        this.b = str;
        this.c = icon;
        this.d = str2;
        this.e = str3;
        this.f = map;
        this.g = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egr)) {
            return false;
        }
        egr egrVar = (egr) obj;
        return this.a.equals(egrVar.a) && this.b.equals(egrVar.b) && this.c.equals(egrVar.c) && this.d.equals(egrVar.d) && Intrinsics.d(this.e, egrVar.e) && this.f.equals(egrVar.f) && this.g.equals(egrVar.g);
    }

    public final int hashCode() {
        int c = k5r.c((this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
        String str = this.e;
        return this.g.hashCode() + f1d.b(this.f, (c + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "StationFullData(stationId=" + this.a + ", name=" + this.b + ", icon=" + this.c + ", idForFrom=" + this.d + ", customName=" + this.e + ", restrictions=" + this.f + ", settings=" + this.g + ")";
    }
}
