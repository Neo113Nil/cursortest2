package pc;

import bc.a0;
import bc.z;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e implements vc.b, d {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f5670b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f5671c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f5672d;

    /* renamed from: a, reason: collision with root package name */
    public final Class f5673a;

    static {
        List L = bc.n.L(oc.a.class, oc.c.class, oc.e.class, oc.f.class, oc.g.class, oc.h.class, u0.b.class, u0.b.class, u0.b.class, u0.b.class, u0.b.class, u0.b.class, oc.b.class, u0.b.class, u0.b.class, u0.b.class, u0.b.class, u0.b.class, u0.b.class, u0.b.class, u0.b.class, u0.b.class, oc.d.class);
        ArrayList arrayList = new ArrayList(bc.o.O(L));
        int i10 = 0;
        for (Object obj : L) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                bc.n.N();
                throw null;
            }
            arrayList.add(new ac.i((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f5670b = z.Q(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        j.d(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            j.b(str);
            sb.append(xc.h.z(str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f5670b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            hashMap3.put(cls.getName(), "kotlin.Function" + intValue);
        }
        f5671c = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(a0.B(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), xc.h.z((String) entry2.getValue()));
        }
        f5672d = linkedHashMap;
    }

    public e(Class cls) {
        this.f5673a = cls;
    }

    @Override // pc.d
    public final Class a() {
        return this.f5673a;
    }

    public final String b() {
        String str;
        Class cls = this.f5673a;
        j.e(cls, "jClass");
        String str2 = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        boolean isArray = cls.isArray();
        HashMap hashMap = f5671c;
        if (!isArray) {
            String str3 = (String) hashMap.get(cls.getName());
            return str3 == null ? cls.getCanonicalName() : str3;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (str = (String) hashMap.get(componentType.getName())) != null) {
            str2 = str.concat("Array");
        }
        return str2 == null ? "kotlin.Array" : str2;
    }

    public final String c() {
        String str;
        Class cls = this.f5673a;
        String str2 = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            boolean isArray = cls.isArray();
            LinkedHashMap linkedHashMap = f5672d;
            if (!isArray) {
                String str3 = (String) linkedHashMap.get(cls.getName());
                return str3 == null ? cls.getSimpleName() : str3;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                str2 = str.concat("Array");
            }
            return str2 == null ? "Array" : str2;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return xc.h.y(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return xc.h.y(simpleName, enclosingConstructor.getName() + '$');
        }
        int r5 = xc.h.r(simpleName, '$', 0, 6);
        if (r5 == -1) {
            return simpleName;
        }
        String substring = simpleName.substring(r5 + 1, simpleName.length());
        j.d(substring, "substring(...)");
        return substring;
    }

    public final boolean d(Object obj) {
        Map map = f5670b;
        j.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Class cls = this.f5673a;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return v.d(num.intValue(), obj);
        }
        if (cls.isPrimitive()) {
            cls = a0.o(t.a(cls));
        }
        return cls.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && a0.o(this).equals(a0.o((vc.b) obj));
    }

    public final int hashCode() {
        return a0.o(this).hashCode();
    }

    public final String toString() {
        return this.f5673a.toString() + " (Kotlin reflection is not available)";
    }
}
