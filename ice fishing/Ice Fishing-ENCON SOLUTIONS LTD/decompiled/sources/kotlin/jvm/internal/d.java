package kotlin.jvm.internal;

import h1.C0234d;
import i1.AbstractC0253j;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import t1.InterfaceC1046a;
import t1.t;
import t1.u;
import t1.v;
import t1.w;

/* loaded from: classes.dex */
public final class d implements x1.c, c {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f8067b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f8068c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f8069d;

    /* renamed from: a, reason: collision with root package name */
    public final Class f8070a;

    static {
        List B2 = AbstractC0253j.B(InterfaceC1046a.class, t1.l.class, t1.p.class, t1.q.class, t1.r.class, t1.s.class, t.class, u.class, v.class, w.class, t1.b.class, t1.c.class, t1.d.class, t1.e.class, t1.f.class, t1.g.class, t1.h.class, t1.i.class, t1.j.class, t1.k.class, t1.m.class, t1.n.class, t1.o.class);
        ArrayList arrayList = new ArrayList(i1.k.E(B2));
        int i2 = 0;
        for (Object obj : B2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC0253j.D();
                throw null;
            }
            arrayList.add(new C0234d((Class) obj, Integer.valueOf(i2)));
            i2 = i3;
        }
        f8067b = i1.u.L(arrayList);
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
            sb.append(z1.g.i0(str, str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f8067b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            hashMap3.put(cls.getName(), "kotlin.Function" + intValue);
        }
        f8068c = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(i1.v.G(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            i.b(str2);
            linkedHashMap.put(key, z1.g.i0(str2, str2));
        }
        f8069d = linkedHashMap;
    }

    public d(Class jClass) {
        i.e(jClass, "jClass");
        this.f8070a = jClass;
    }

    @Override // kotlin.jvm.internal.c
    public final Class a() {
        return this.f8070a;
    }

    public final String b() {
        String str;
        Class jClass = this.f8070a;
        i.e(jClass, "jClass");
        String str2 = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (!jClass.isLocalClass()) {
            boolean isArray = jClass.isArray();
            LinkedHashMap linkedHashMap = f8069d;
            if (!isArray) {
                String str3 = (String) linkedHashMap.get(jClass.getName());
                return str3 == null ? jClass.getSimpleName() : str3;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                str2 = str.concat("Array");
            }
            return str2 == null ? "Array" : str2;
        }
        String simpleName = jClass.getSimpleName();
        Method enclosingMethod = jClass.getEnclosingMethod();
        if (enclosingMethod != null) {
            return z1.g.h0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return z1.g.h0(simpleName, enclosingConstructor.getName() + '$');
        }
        int X2 = z1.g.X(simpleName, '$', 0, false, 6);
        if (X2 == -1) {
            return simpleName;
        }
        String substring = simpleName.substring(X2 + 1, simpleName.length());
        i.d(substring, "substring(...)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && R1.d.q(this).equals(R1.d.q((x1.c) obj));
    }

    public final int hashCode() {
        return R1.d.q(this).hashCode();
    }

    public final String toString() {
        return this.f8070a + " (Kotlin reflection is not available)";
    }
}
