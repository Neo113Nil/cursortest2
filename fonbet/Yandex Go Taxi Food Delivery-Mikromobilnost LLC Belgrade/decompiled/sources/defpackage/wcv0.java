package defpackage;

import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class wcv0 {
    public final String a;
    public final String b;
    public final String c;
    public final MapBuilder d;

    public wcv0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("name", str);
        mapBuilder.put("eta", str2);
        if (str3 != null) {
            mapBuilder.put("price", str3);
        }
        this.d = mapBuilder.j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wcv0)) {
            return false;
        }
        wcv0 wcv0Var = (wcv0) obj;
        return jl40.l(this.a, wcv0Var.a) && this.b.equals(wcv0Var.b) && jl40.l(this.c, wcv0Var.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return oyr.t(b64.v("TariffClassList(name=", this.a, ", eta=", this.b, ", price="), this.c, Extension.C_BRAKE);
    }
}
