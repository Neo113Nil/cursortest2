package defpackage;

import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class rr51 {
    public final omk a;
    public final String b;
    public final Map c;
    public final List d;
    public final String e;

    public rr51(omk omkVar, String str, Map map, List list, String str2) {
        this.a = omkVar;
        this.b = str;
        this.c = map;
        this.d = list;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rr51)) {
            return false;
        }
        rr51 rr51Var = (rr51) obj;
        return jl40.l(this.e, rr51Var.e) && jl40.l(this.b, rr51Var.b) && jl40.l(this.d, rr51Var.d);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.c(unr0.d(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("YbDivData(divData=");
        sb.append(this.a);
        sb.append(", divDataHash=");
        sb.append(this.b);
        sb.append(", palette=");
        sb.append(this.c);
        sb.append(", variables=");
        sb.append(this.d);
        sb.append(", id=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
