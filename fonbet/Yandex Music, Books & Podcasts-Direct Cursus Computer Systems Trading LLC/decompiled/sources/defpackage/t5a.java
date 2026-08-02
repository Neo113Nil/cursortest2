package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t5a {
    public final String a;
    public final Map b;
    public final Map c;

    public t5a(String str, Map map, Map map2) {
        this.a = str;
        this.b = map;
        this.c = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t5a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        t5a t5aVar = (t5a) obj;
        return Intrinsics.d(this.a, t5aVar.a) && Intrinsics.d(this.b, t5aVar.b) && Intrinsics.d(this.c, t5aVar.c);
    }

    public final int hashCode() {
        int b = f1d.b(this.b, this.a.hashCode() * 31, 31);
        Map map = this.c;
        return b + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "DocumentQuery(path=" + this.a + ", params=" + this.b + ", body=" + this.c + ")";
    }
}
