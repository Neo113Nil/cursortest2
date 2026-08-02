package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ttv {
    public final int a;
    public final String b;
    public final String c;
    public final MapBuilder d;

    public ttv(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("position", Integer.valueOf(i));
        mapBuilder.put("icon_tag_name", str);
        mapBuilder.put(Constants.KEY_SERVICE, str2);
        this.d = mapBuilder.j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ttv)) {
            return false;
        }
        ttv ttvVar = (ttv) obj;
        return this.a == ttvVar.a && jl40.l(this.b, ttvVar.b) && jl40.l(this.c, ttvVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(unr0.v(this.a, "ServiceList(position=", ", iconTagName=", this.b, ", service="), this.c, Extension.C_BRAKE);
    }
}
