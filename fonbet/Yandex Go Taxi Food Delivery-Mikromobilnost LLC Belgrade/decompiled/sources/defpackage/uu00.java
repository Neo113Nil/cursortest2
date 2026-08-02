package defpackage;

import java.util.Map;

/* loaded from: classes9.dex */
public final class uu00 implements vu00 {
    public final String a;
    public final Map b;
    public final Map c;
    public final String d;

    public uu00(String str, Map map, Map map2, String str2) {
        this.a = str;
        this.b = map;
        this.c = map2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!uu00.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        uu00 uu00Var = (uu00) obj;
        return jl40.l(this.a, uu00Var.a) && this.b.equals(uu00Var.b) && jl40.l(this.c, uu00Var.c) && this.d.equals(uu00Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((((this.c.hashCode() + unr0.d(this.a.hashCode() * 31, 31, this.b)) * 31) + 1816680781) * 31);
    }

    public final String toString() {
        return "MapiPostRequest(urlPath='" + this.a + "', headers=" + this.b + ", query=" + this.c + ", contentType='application/json;charset=UTF-8', body='" + this.d + "')";
    }
}
