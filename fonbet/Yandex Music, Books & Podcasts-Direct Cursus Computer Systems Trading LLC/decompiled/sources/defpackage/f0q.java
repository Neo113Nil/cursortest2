package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0q {
    public static final f0q b;
    public final Map a;

    static {
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        b = new f0q(e5bVar);
    }

    public f0q(Map map) {
        this.a = map;
    }

    public final f0q a(f0q f0qVar) {
        LinkedHashMap q = uah.q(this.a);
        for (Map.Entry entry : f0qVar.a.entrySet()) {
            f9f f9fVar = (f9f) entry.getKey();
            e0q e0qVar = (e0q) entry.getValue();
            e0q e0qVar2 = (e0q) q.get(f9fVar);
            if (e0qVar2 != null) {
                q.put(f9fVar, e0qVar2.merge(e0qVar));
            } else {
                q.put(f9fVar, e0qVar);
            }
        }
        return new f0q(q);
    }

    public final e0q b(f9f f9fVar) {
        Object obj = this.a.get(f9fVar);
        if (obj instanceof e0q) {
            return (e0q) obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!f0q.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return Intrinsics.d(this.a, ((f0q) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SharedData(slices=" + this.a + ")";
    }
}
