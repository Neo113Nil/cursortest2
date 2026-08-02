package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h4s {
    public static final h4s b;
    public final Map a;

    static {
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        b = new h4s(e5bVar);
    }

    public h4s(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h4s) {
            return Intrinsics.d(this.a, ((h4s) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return k5r.p(new StringBuilder("Tags(tags="), this.a, ')');
    }
}
