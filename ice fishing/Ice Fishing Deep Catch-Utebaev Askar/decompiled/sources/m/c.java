package m;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.c0;
import kotlin.collections.d0;
import kotlin.collections.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l.h;
import l.i;
import l.j;
import l.k;
import l.l;
import l.m;
import l.n;
import l.p;
import l.q;
import l.r;
import l.s;
import l.t;

/* JADX INFO: loaded from: classes.dex */
public final class c implements o.a, a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f207b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f208c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f209a;

    static {
        Map destination;
        List listB = o.b(Function0.class, Function1.class, Function2.class, n.class, l.o.class, p.class, q.class, r.class, s.class, t.class, l.a.class, l.b.class, l.c.class, l.d.class, l.e.class, l.f.class, l.g.class, h.class, i.class, j.class, k.class, l.class, m.class);
        ArrayList<Pair> pairs = new ArrayList(kotlin.collections.p.c(listB));
        int i2 = 0;
        for (Object obj : listB) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            pairs.add(new Pair((Class) obj, Integer.valueOf(i2)));
            i2 = i3;
        }
        Intrinsics.checkNotNullParameter(pairs, "<this>");
        int size = pairs.size();
        if (size == 0) {
            destination = d0.c();
        } else if (size != 1) {
            destination = new LinkedHashMap(c0.a(pairs.size()));
            Intrinsics.checkNotNullParameter(pairs, "<this>");
            Intrinsics.checkNotNullParameter(destination, "destination");
            Intrinsics.checkNotNullParameter(destination, "<this>");
            Intrinsics.checkNotNullParameter(pairs, "pairs");
            for (Pair pair : pairs) {
                destination.put(pair.f155a, pair.f156b);
            }
        } else {
            destination = c0.b((Pair) pairs.get(0));
        }
        f208c = destination;
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "primitiveFqNames.values");
        for (String kotlinName : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            Intrinsics.checkNotNullExpressionValue(kotlinName, "kotlinName");
            sb.append(kotlin.text.q.k(kotlinName));
            sb.append("CompanionObject");
            map3.put(sb.toString(), kotlinName.concat(".Companion"));
        }
        for (Map.Entry entry : f208c.entrySet()) {
            map3.put(((Class) entry.getKey()).getName(), "kotlin.Function" + ((Number) entry.getValue()).intValue());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(c0.a(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), kotlin.text.q.k((String) entry2.getValue()));
        }
    }

    public c(Class jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.f209a = jClass;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && Intrinsics.a(a.c.d(this), a.c.d((o.a) obj));
    }

    public final int hashCode() {
        return a.c.d(this).hashCode();
    }

    public final String toString() {
        return this.f209a.toString() + " (Kotlin reflection is not available)";
    }
}
