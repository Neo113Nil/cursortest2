package defpackage;

import java.util.Date;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.persuggest.domain.model.CoordinateProvider$Source;

/* loaded from: classes9.dex */
public final class yne {
    public final int a;
    public final int b;
    public final CoordinateProvider$Source c;
    public final zzs d;
    public final Date e;
    public final Double f;
    public final Map g;
    public final Integer h;

    public yne(int i, int i2, CoordinateProvider$Source coordinateProvider$Source, zzs zzsVar, Date date, Double d, Map map, Integer num) {
        this.a = i;
        this.b = i2;
        this.c = coordinateProvider$Source;
        this.d = zzsVar;
        this.e = date;
        this.f = d;
        this.g = map;
        this.h = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yne)) {
            return false;
        }
        yne yneVar = (yne) obj;
        return this.a == yneVar.a && this.b == yneVar.b && this.c == yneVar.c && this.d.equals(yneVar.d) && this.e.equals(yneVar.e) && jl40.l(this.f, yneVar.f) && jl40.l(this.g, yneVar.g) && jl40.l(this.h, yneVar.h);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + nnm.b(this.d, (this.c.hashCode() + oyr.b(this.b, Integer.hashCode(this.a) * 31, 31)) * 31, 31)) * 31;
        Double d = this.f;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Map map = this.g;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.h;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "CoordinateProvider(speed=", ", accuracy=", ", source=");
        s.append(this.c);
        s.append(", position=");
        s.append(this.d);
        s.append(", updateTime=");
        s.append(this.e);
        s.append(", altitude=");
        s.append(this.f);
        s.append(", altitudeAccuracy=");
        return oo31.j(s, this.h, Extension.C_BRAKE);
    }
}
