package defpackage;

import androidx.sqlite.driver.a;
import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;

/* loaded from: classes10.dex */
public final class s5x0 {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public s5x0(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        this.a = str;
        this.b = map;
        this.c = abstractSet;
        this.d = abstractSet2;
    }

    public static final s5x0 a(hkw0 hkw0Var, String str) {
        return gkb1.d(new a(hkw0Var), str);
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5x0)) {
            return false;
        }
        s5x0 s5x0Var = (s5x0) obj;
        if (!this.a.equals(s5x0Var.a) || !this.b.equals(s5x0Var.b) || !jl40.l(this.c, s5x0Var.c)) {
            return false;
        }
        Set set2 = this.d;
        if (set2 == null || (set = s5x0Var.d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.a);
        sb.append("',\n            |    columns = {");
        sb.append(ikb1.d(kotlin.collections.a.x0(this.b.values(), new t5x0())));
        sb.append("\n            |    foreignKeys = {");
        sb.append(ikb1.d(this.c));
        sb.append("\n            |    indices = {");
        Set set = this.d;
        sb.append(ikb1.d(set != null ? kotlin.collections.a.x0(set, new u5x0()) : EmptyList.a));
        sb.append("\n            |}\n        ");
        return vuu0.d(sb.toString());
    }
}
