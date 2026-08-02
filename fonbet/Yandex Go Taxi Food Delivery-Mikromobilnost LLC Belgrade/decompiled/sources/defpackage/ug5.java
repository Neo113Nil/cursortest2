package defpackage;

import java.util.Map;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ug5 {
    public final Map a;
    public final Map b;
    public final String c;

    public ug5(int i, String str, Map map, Map map2) {
        map = (i & 1) != 0 ? null : map;
        map2 = (i & 4) != 0 ? b.f() : map2;
        str = (i & 8) != 0 ? null : str;
        this.a = map;
        this.b = map2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug5)) {
            return false;
        }
        ug5 ug5Var = (ug5) obj;
        return jl40.l(this.a, ug5Var.a) && jl40.l(this.b, ug5Var.b) && jl40.l(this.c, ug5Var.c);
    }

    public final int hashCode() {
        Map map = this.a;
        int d = unr0.d((map == null ? 0 : map.hashCode()) * 961, 31, this.b);
        String str = this.c;
        return d + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BduiDocumentQuery(body=");
        sb.append(this.a);
        sb.append(", documentJson=null, params=");
        sb.append(this.b);
        sb.append(", path=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }

    public ug5() {
        this(15, null, null, null);
    }
}
