package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class u1m {
    public final String a;
    public final Map b;
    public final Map c;

    public /* synthetic */ u1m(int i, String str, Map map) {
        this(b.f(), str, (i & 4) != 0 ? null : map);
    }

    public static u1m a(u1m u1mVar, LinkedHashMap linkedHashMap) {
        String str = u1mVar.a;
        Map map = u1mVar.b;
        u1mVar.getClass();
        return new u1m(map, str, linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!u1m.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        u1m u1mVar = (u1m) obj;
        return jl40.l(this.a, u1mVar.a) && jl40.l(this.b, u1mVar.b) && jl40.l(this.c, u1mVar.c);
    }

    public final int hashCode() {
        int d = unr0.d(this.a.hashCode() * 31, 31, this.b);
        Map map = this.c;
        return d + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DocumentQuery(path=");
        sb.append(this.a);
        sb.append(", params=");
        sb.append(this.b);
        sb.append(", body=");
        return b64.r(sb, this.c, Extension.C_BRAKE);
    }

    public u1m(Map map, String str, Map map2) {
        this.a = str;
        this.b = map;
        this.c = map2;
    }
}
