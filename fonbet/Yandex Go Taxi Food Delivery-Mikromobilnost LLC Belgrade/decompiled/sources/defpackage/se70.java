package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class se70 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Map e;
    public final Map f;
    public final String g;
    public final re70 h;
    public final qe70 i;

    public se70(String str, String str2, String str3, String str4, Map map, Map map2, String str5, re70 re70Var, qe70 qe70Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = map;
        this.f = map2;
        this.g = str5;
        this.h = re70Var;
        this.i = qe70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se70)) {
            return false;
        }
        se70 se70Var = (se70) obj;
        return this.a.equals(se70Var.a) && jl40.l(this.b, se70Var.b) && jl40.l(this.c, se70Var.c) && jl40.l(this.d, se70Var.d) && jl40.l(this.e, se70Var.e) && this.f.equals(se70Var.f) && this.g.equals(se70Var.g) && this.h.equals(se70Var.h) && jl40.l(this.i, se70Var.i);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map map = this.e;
        int b = unr0.b(unr0.b(unr0.d((hashCode4 + (map == null ? 0 : map.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h.a);
        qe70 qe70Var = this.i;
        return b + (qe70Var != null ? qe70Var.hashCode() : 0);
    }

    public final String toString() {
        return "OptionOfferDetails(title=" + this.a + ", text=" + this.b + ", description=" + this.c + ", additionText=" + this.d + ", payload=" + this.e + ", image=" + this.f + ", offerName=" + this.g + ", option=" + this.h + ", backgroundTv=" + this.i + ')';
    }
}
