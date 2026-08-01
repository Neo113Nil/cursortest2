package D1;

import C1.r;
import C1.s;
import C1.t;
import C1.u;
import C1.v;
import C1.w;
import a.AbstractC0078a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class e implements I1.b, d {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f158b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f159c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f160d;

    /* renamed from: a, reason: collision with root package name */
    public final Class f161a;

    static {
        List F2 = u1.h.F(C1.a.class, C1.l.class, C1.p.class, C1.q.class, r.class, s.class, t.class, u.class, v.class, w.class, C1.b.class, C1.c.class, C1.d.class, C1.e.class, C1.f.class, C1.g.class, C1.h.class, C1.i.class, C1.j.class, C1.k.class, C1.m.class, C1.n.class, C1.o.class);
        ArrayList arrayList = new ArrayList(u1.i.I(F2, 10));
        int i = 0;
        for (Object obj : F2) {
            int i2 = i + 1;
            if (i < 0) {
                u1.h.H();
                throw null;
            }
            arrayList.add(new t1.d((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f158b = u1.s.F(arrayList);
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
        i.d(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            i.b(str);
            sb.append(K1.d.o0(str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f158b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            hashMap3.put(cls.getName(), "kotlin.Function" + intValue);
        }
        f159c = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(u1.s.E(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), K1.d.o0((String) entry2.getValue()));
        }
        f160d = linkedHashMap;
    }

    public e(Class cls) {
        i.e(cls, "jClass");
        this.f161a = cls;
    }

    @Override // D1.d
    public final Class a() {
        return this.f161a;
    }

    public final String b() {
        String str;
        Class cls = this.f161a;
        i.e(cls, "jClass");
        String str2 = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            boolean isArray = cls.isArray();
            LinkedHashMap linkedHashMap = f160d;
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
            return K1.d.n0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return K1.d.n0(simpleName, enclosingConstructor.getName() + '$');
        }
        int indexOf = simpleName.indexOf(36, 0);
        if (indexOf == -1) {
            return simpleName;
        }
        String substring = simpleName.substring(indexOf + 1, simpleName.length());
        i.d(substring, "substring(...)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && AbstractC0078a.G(this).equals(AbstractC0078a.G((I1.b) obj));
    }

    public final int hashCode() {
        return AbstractC0078a.G(this).hashCode();
    }

    public final String toString() {
        return this.f161a.toString() + " (Kotlin reflection is not available)";
    }
}
