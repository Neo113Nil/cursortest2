package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;

/* loaded from: classes.dex */
public final class fah implements r7f {
    public Object a;
    public boolean b;
    public final ArrayList c = new ArrayList();

    public static Object a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj2 != null) {
            if (obj instanceof List) {
                if (!(obj2 instanceof List)) {
                    rj7.j("Cannot merge ", obj, " with ", obj2);
                    return null;
                }
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list.size() != list2.size()) {
                    rj7.j("Cannot merge ", obj, " with ", obj2);
                    return null;
                }
                IntRange f = u75.f((Collection) obj);
                ArrayList arrayList = new ArrayList(v75.o(f, 10));
                ype it = f.iterator();
                while (it.c) {
                    int nextInt = it.nextInt();
                    arrayList.add(a(list.get(nextInt), list2.get(nextInt)));
                }
                return arrayList;
            }
            if (obj instanceof Map) {
                if (!(obj2 instanceof Map)) {
                    rj7.j("Cannot merge ", obj, " with ", obj2);
                    return null;
                }
                Map map = (Map) obj;
                Map map2 = (Map) obj2;
                LinkedHashSet<String> i = wop.i(map.keySet(), map2.keySet());
                ArrayList arrayList2 = new ArrayList(v75.o(i, 10));
                for (String str : i) {
                    arrayList2.add(new Pair(str, a(map.get(str), map2.get(str))));
                }
                return uah.n(arrayList2);
            }
            if (!obj.equals(obj2)) {
                b6e.n("Cannot merge ", obj, " with ", obj2);
                return null;
            }
        }
        return obj;
    }

    @Override // defpackage.r7f
    public final r7f B0() {
        g(null);
        return this;
    }

    @Override // defpackage.r7f
    public final r7f J(boolean z) {
        g(Boolean.valueOf(z));
        return this;
    }

    @Override // defpackage.r7f
    public final r7f Z(String str) {
        eah eahVar = (eah) CollectionsKt.Y(this.c);
        if (!(eahVar instanceof dah)) {
            xq0.q("Check failed.");
            return null;
        }
        dah dahVar = (dah) eahVar;
        if (dahVar.b == null) {
            dahVar.b = str;
            return this;
        }
        xq0.q("Check failed.");
        return null;
    }

    public final Object b() {
        if (this.b) {
            return this.a;
        }
        xq0.q("Check failed.");
        return null;
    }

    public final void g(Object obj) {
        eah eahVar = (eah) CollectionsKt.Z(this.c);
        if (!(eahVar instanceof dah)) {
            if (eahVar instanceof cah) {
                ((cah) eahVar).a.add(obj);
                return;
            } else {
                this.a = obj;
                this.b = true;
                return;
            }
        }
        dah dahVar = (dah) eahVar;
        LinkedHashMap linkedHashMap = dahVar.a;
        String str = dahVar.b;
        if (str == null) {
            xq0.q("Check failed.");
            return;
        }
        if (linkedHashMap.containsKey(str)) {
            linkedHashMap.put(str, a(linkedHashMap.get(str), obj));
        } else {
            linkedHashMap.put(str, obj);
        }
        dahVar.b = null;
    }

    @Override // defpackage.r7f
    public final r7f i0(o5f o5fVar) {
        o5fVar.getClass();
        g(o5fVar);
        return this;
    }

    @Override // defpackage.r7f
    public final r7f j() {
        this.c.add(new dah(new LinkedHashMap()));
        return this;
    }

    @Override // defpackage.r7f
    public final r7f l() {
        eah eahVar = (eah) this.c.remove(r0.size() - 1);
        if (eahVar instanceof cah) {
            g(((cah) eahVar).a);
            return this;
        }
        xq0.q("Check failed.");
        return null;
    }

    @Override // defpackage.r7f
    public final r7f m() {
        this.c.add(new cah(new ArrayList()));
        return this;
    }

    @Override // defpackage.r7f
    public final r7f m0(String str) {
        str.getClass();
        g(str);
        return this;
    }

    @Override // defpackage.r7f
    public final r7f p() {
        eah eahVar = (eah) this.c.remove(r0.size() - 1);
        if (eahVar instanceof dah) {
            g(((dah) eahVar).a);
            return this;
        }
        xq0.q("Check failed.");
        return null;
    }

    @Override // defpackage.r7f
    public final r7f t(long j) {
        g(Long.valueOf(j));
        return this;
    }

    @Override // defpackage.r7f
    public final r7f u(int i) {
        g(Integer.valueOf(i));
        return this;
    }

    @Override // defpackage.r7f
    public final r7f y(double d) {
        g(Double.valueOf(d));
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
