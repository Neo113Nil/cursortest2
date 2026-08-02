package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m6k implements Iterable, j9f {
    public static final m6k b;
    public final Map a;

    static {
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        b = new m6k(e5bVar);
    }

    public m6k(Map map) {
        this.a = map;
    }

    public final Object a(String str) {
        l6k l6kVar = (l6k) this.a.get(str);
        if (l6kVar != null) {
            return l6kVar.a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m6k) {
            return Intrinsics.d(this.a, ((m6k) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new Pair((String) entry.getKey(), (l6k) entry.getValue()));
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return k5r.p(new StringBuilder("Parameters(entries="), this.a, ')');
    }
}
