package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class pg {
    public final String a;
    public final Map b;
    public final Map c;

    public pg(String str, Map map, Map map2) {
        this.a = str;
        this.b = map;
        this.c = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!pg.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        pg pgVar = (pg) obj;
        return Intrinsics.d(this.a, pgVar.a) && Intrinsics.d(this.b, pgVar.b) && Intrinsics.d(this.c, pgVar.c);
    }

    public final int hashCode() {
        int b = f1d.b(this.b, this.a.hashCode() * 31, 31);
        Map map = this.c;
        return b + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "ActionQuery(path=" + this.a + ", params=" + this.b + ", body=" + this.c + ")";
    }
}
