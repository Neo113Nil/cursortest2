package defpackage;

import java.util.Map;
import kotlin.Pair;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final class zkv0 {
    public final String a;
    public final String b;
    public final FormattedText c;
    public final FormattedText d;
    public final String e;
    public final z051 f;
    public final String g;
    public final String h;
    public final t76 i;
    public final t0e j;
    public final Map k;
    public final Map l;
    public final int m;

    public zkv0(String str, String str2, FormattedText formattedText, FormattedText formattedText2, String str3, z051 z051Var, String str4, String str5, t76 t76Var, t0e t0eVar, Map map, Map map2, int i) {
        this.a = str;
        this.b = str2;
        this.c = formattedText;
        this.d = formattedText2;
        this.e = str3;
        this.f = z051Var;
        this.g = str4;
        this.h = str5;
        this.i = t76Var;
        this.j = t0eVar;
        this.k = map;
        this.l = map2;
        this.m = i;
    }

    public final Map a() {
        return this.k;
    }

    public final Map b() {
        return this.l;
    }

    public final t0e c() {
        return this.j;
    }

    public final String d() {
        return this.a;
    }

    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zkv0)) {
            return false;
        }
        zkv0 zkv0Var = (zkv0) obj;
        return jl40.l(this.a, zkv0Var.a) && jl40.l(this.b, zkv0Var.b) && jl40.l(this.c, zkv0Var.c) && jl40.l(this.d, zkv0Var.d) && jl40.l(this.e, zkv0Var.e) && this.f.equals(zkv0Var.f) && jl40.l(this.g, zkv0Var.g) && this.h.equals(zkv0Var.h) && jl40.l(this.i, zkv0Var.i) && jl40.l(this.j, zkv0Var.j) && jl40.l(this.k, zkv0Var.k) && this.l.equals(zkv0Var.l) && this.m == zkv0Var.m;
    }

    public final int f() {
        return this.m;
    }

    public final Pair g(u051 u051Var, boolean z) {
        akz0 akz0Var = u051Var.a;
        gkz0 gkz0Var = z ? akz0Var.b : akz0Var.c;
        FormattedText formattedText = gkz0Var.b;
        return formattedText != null ? new Pair(formattedText, gkz0Var.c) : new Pair(this.c, this.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int c = unr0.c(unr0.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c.a), 31, this.d.a);
        String str2 = this.e;
        int b = unr0.b(unr0.b((this.f.hashCode() + ((c + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.g), 31, this.h);
        t76 t76Var = this.i;
        int hashCode2 = (this.j.hashCode() + ((b + (t76Var == null ? 0 : t76Var.hashCode())) * 31)) * 31;
        Map map = this.k;
        return Integer.hashCode(this.m) + unr0.d((hashCode2 + (map != null ? map.hashCode() : 0)) * 31, 31, this.l);
    }

    public final String toString() {
        StringBuilder v = b64.v("SummaryPromotion(id=", this.a, ", metaType=", this.b, ", title=");
        n.C(v, this.c, ", text=", this.d, ", iconUrl=");
        v.append(this.e);
        v.append(", widget=");
        v.append(this.f);
        v.append(", tariffClass=");
        g8e.D(v, this.g, ", cashBack=", this.h, ", bodyAction=");
        v.append(this.i);
        v.append(", configuration=");
        v.append(this.j);
        v.append(", analyticsPayload=");
        v.append(this.k);
        v.append(", clientAnalyticsPayload=");
        v.append(this.l);
        v.append(", priority=");
        return oyr.m(this.m, Extension.C_BRAKE, v);
    }
}
