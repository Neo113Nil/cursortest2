package defpackage;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zdd0 {
    public final String a;
    public final Set b;
    public final Set c;

    public zdd0(String str, Set set, Set set2) {
        this.a = str;
        this.b = set;
        this.c = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdd0)) {
            return false;
        }
        zdd0 zdd0Var = (zdd0) obj;
        return jl40.l(this.a, zdd0Var.a) && jl40.l(this.b, zdd0Var.b) && jl40.l(this.c, zdd0Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Set set = this.b;
        int hashCode2 = (hashCode + (set == null ? 0 : set.hashCode())) * 31;
        Set set2 = this.c;
        return hashCode2 + (set2 != null ? set2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlusPayOffersFilters(tariffId=");
        sb.append(this.a);
        sb.append(", optionsIds=");
        sb.append(this.b);
        sb.append(", features=");
        return qv10.s(sb, this.c, ')');
    }
}
