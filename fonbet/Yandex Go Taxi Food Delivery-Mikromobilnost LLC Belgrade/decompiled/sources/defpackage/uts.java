package defpackage;

import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.geometry.Point;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class uts {
    public final String a;
    public final GeoObject b;
    public final bl00 c;
    public final Point d;
    public final String e;
    public final String f;

    public uts(String str, GeoObject geoObject, bl00 bl00Var, Point point, String str2, String str3) {
        this.a = str;
        this.b = geoObject;
        this.c = bl00Var;
        this.d = point;
        this.e = str2;
        this.f = str3;
    }

    public static uts a(uts utsVar, bl00 bl00Var) {
        String str = utsVar.a;
        GeoObject geoObject = utsVar.b;
        Point point = utsVar.d;
        String str2 = utsVar.e;
        String str3 = utsVar.f;
        utsVar.getClass();
        return new uts(str, geoObject, bl00Var, point, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uts)) {
            return false;
        }
        uts utsVar = (uts) obj;
        return jl40.l(this.a, utsVar.a) && this.b.equals(utsVar.b) && jl40.l(this.c, utsVar.c) && this.d.equals(utsVar.d) && jl40.l(this.e, utsVar.e) && jl40.l(this.f, utsVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + unr0.b((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GasStationPin(oid=");
        sb.append(this.a);
        sb.append(", geoObject=");
        sb.append(this.b);
        sb.append(", gasStationMapKitImage=");
        sb.append(this.c);
        sb.append(", point=");
        sb.append(this.d);
        sb.append(", title=");
        return g8e.r(sb, this.e, ", subtitle=", this.f, Extension.C_BRAKE);
    }
}
