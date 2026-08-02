package defpackage;

import androidx.media3.common.a;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.v;
import java.util.Map;

/* loaded from: classes10.dex */
public final class vil0 {
    public final int a;
    public final int b;
    public final a c;
    public final ImmutableMap d;
    public final String e;

    public vil0(a aVar, int i, int i2, Map map, String str) {
        this.a = i;
        this.b = i2;
        this.c = aVar;
        this.d = ImmutableMap.a(map);
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vil0.class != obj.getClass()) {
            return false;
        }
        vil0 vil0Var = (vil0) obj;
        if (this.a != vil0Var.a || this.b != vil0Var.b || !this.c.equals(vil0Var.c)) {
            return false;
        }
        ImmutableMap immutableMap = vil0Var.d;
        ImmutableMap immutableMap2 = this.d;
        immutableMap2.getClass();
        return v.b(immutableMap, immutableMap2) && this.e.equals(vil0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((((217 + this.a) * 31) + this.b) * 31)) * 31)) * 31);
    }
}
