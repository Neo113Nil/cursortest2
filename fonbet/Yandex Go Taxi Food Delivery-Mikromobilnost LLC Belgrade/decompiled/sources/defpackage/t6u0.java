package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.address_details.impl.static_map.api.MapType;

/* loaded from: classes5.dex */
public final class t6u0 {
    public final int a;
    public final int b;
    public final int c;
    public final is00 d;
    public final MapType e;

    public t6u0(int i, is00 is00Var) {
        MapType mapType = MapType.MAP;
        this.a = 120;
        this.b = 320;
        this.c = i;
        this.d = is00Var;
        this.e = mapType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6u0)) {
            return false;
        }
        t6u0 t6u0Var = (t6u0) obj;
        return this.a == t6u0Var.a && this.b == t6u0Var.b && this.c == t6u0Var.c && jl40.l(this.d, t6u0Var.d) && this.e == t6u0Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31)) * 961);
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "StaticMapImageConfig(height=", ", width=", ", zoom=");
        s.append(this.c);
        s.append(", mapStyle=");
        s.append(this.d);
        s.append(", locale=null, type=");
        s.append(this.e);
        s.append(Extension.C_BRAKE);
        return s.toString();
    }
}
