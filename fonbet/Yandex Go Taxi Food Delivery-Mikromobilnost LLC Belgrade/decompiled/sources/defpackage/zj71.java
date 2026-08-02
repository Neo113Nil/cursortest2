package defpackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.hm2;

/* loaded from: classes7.dex */
public final class zj71 {
    public final String a;
    public final HashMap b;
    public final no61 c;

    public zj71(String str, HashMap hashMap, no61 no61Var) {
        this.a = str;
        this.b = hashMap;
        this.c = no61Var;
        hashMap.put("sdk_version", "8.0.0-beta.1");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zj71)) {
            return false;
        }
        zj71 zj71Var = (zj71) obj;
        return jl40.l(this.a, zj71Var.a) && jl40.l(this.b, zj71Var.b) && jl40.l(this.c, zj71Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        no61 no61Var = this.c;
        return hashCode + (no61Var == null ? 0 : no61Var.hashCode());
    }

    public final String toString() {
        return "Report(eventName=" + this.a + ", data=" + this.b + ", abExperiments=" + this.c + Extension.C_BRAKE;
    }

    public zj71(hm2 hm2Var, Map map, no61 no61Var) {
        this(hm2Var.b, new LinkedHashMap(map), no61Var);
    }
}
