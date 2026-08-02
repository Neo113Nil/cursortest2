package defpackage;

import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class vwx0 {
    public final String a;
    public final String b;
    public final Map c;
    public final List d;
    public final Integer e;

    public vwx0(String str, String str2, Map map, List list, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = map;
        this.d = list;
        this.e = num;
    }

    public final String a() {
        String valueOf;
        Integer num = this.e;
        return (num == null || (valueOf = String.valueOf(num.intValue())) == null) ? "no_value" : valueOf;
    }

    public final Map b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }

    public final List e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwx0)) {
            return false;
        }
        vwx0 vwx0Var = (vwx0) obj;
        return jl40.l(this.a, vwx0Var.a) && jl40.l(this.b, vwx0Var.b) && this.c.equals(vwx0Var.c) && jl40.l(this.d, vwx0Var.d) && jl40.l(this.e, vwx0Var.e);
    }

    public final int hashCode() {
        int c = unr0.c(unr0.d(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        Integer num = this.e;
        return c + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("ShownPlaque(plaqueId=", this.a, ", screen=", this.b, ", metricContext=");
        v.append(this.c);
        v.append(", widgetsList=");
        v.append(this.d);
        v.append(", notificationCount=");
        return oo31.j(v, this.e, Extension.C_BRAKE);
    }
}
