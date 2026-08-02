package defpackage;

import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes7.dex */
public final class sd81 {
    public final String a;
    public final List b;
    public final LinkedHashMap c;

    public sd81(String str, List list, LinkedHashMap linkedHashMap) {
        this.a = str;
        this.b = list;
        this.c = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd81)) {
            return false;
        }
        sd81 sd81Var = (sd81) obj;
        return jl40.l(this.a, sd81Var.a) && jl40.l(this.b, sd81Var.b) && jl40.l(this.c, sd81Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 923521;
        List list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        LinkedHashMap linkedHashMap = this.c;
        return (hashCode2 + (linkedHashMap != null ? linkedHashMap.hashCode() : 0)) * 31;
    }

    public final String toString() {
        StringBuilder r = xvz.r("FullscreenCacheParams(adUnitId=", this.a, ", age=null, gender=null, contextQuery=null, contextTags=", this.b, ", parameters=");
        r.append(this.c);
        r.append(", preferredTheme=null)");
        return r.toString();
    }
}
