package com.gamericefishpro.space.ei;

import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.ph.l0;
import com.gamericefishpro.space.ph.m0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements com.gamericefishpro.space.ki.b, e {
    public static final f b = new f(null);
    public static final Map c;
    public static final HashMap d;
    public static final LinkedHashMap e;
    public final Class a;

    static {
        Map destination;
        List listF = com.gamericefishpro.space.ph.x.f(Function0.class, Function1.class, Function2.class, com.gamericefishpro.space.di.c.class, com.gamericefishpro.space.di.d.class, com.gamericefishpro.space.b1.e.class, com.gamericefishpro.space.b1.e.class, com.gamericefishpro.space.b1.e.class, com.gamericefishpro.space.b1.e.class, com.gamericefishpro.space.b1.e.class, com.gamericefishpro.space.b1.e.class, com.gamericefishpro.space.b1.e.class, com.gamericefishpro.space.di.a.class, com.gamericefishpro.space.b1.e.class, com.gamericefishpro.space.b1.e.class, com.gamericefishpro.space.b1.e.class, com.gamericefishpro.space.b1.e.class, com.gamericefishpro.space.b1.e.class, com.gamericefishpro.space.b1.e.class, com.gamericefishpro.space.b1.e.class, com.gamericefishpro.space.b1.e.class, com.gamericefishpro.space.b1.e.class, com.gamericefishpro.space.di.b.class);
        ArrayList pairs = new ArrayList(com.gamericefishpro.space.ph.y.j(listF, 10));
        int i = 0;
        for (Object obj : listF) {
            int i2 = i + 1;
            if (i < 0) {
                com.gamericefishpro.space.ph.x.i();
                throw null;
            }
            pairs.add(new Pair((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        Intrinsics.checkNotNullParameter(pairs, "<this>");
        int size = pairs.size();
        if (size == 0) {
            destination = m0.c();
        } else if (size != 1) {
            destination = new LinkedHashMap(l0.a(pairs.size()));
            Intrinsics.checkNotNullParameter(pairs, "<this>");
            Intrinsics.checkNotNullParameter(destination, "destination");
            Intrinsics.checkNotNullParameter(destination, "<this>");
            Intrinsics.checkNotNullParameter(pairs, "pairs");
            int size2 = pairs.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = pairs.get(i3);
                i3++;
                Pair pair = (Pair) obj2;
                destination.put(pair.d, pair.e);
            }
        } else {
            destination = l0.b((Pair) pairs.get(0));
        }
        c = destination;
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
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            Intrinsics.b(str);
            sb.append(StringsKt.B(str, str));
            sb.append("CompanionObject");
            map3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : c.entrySet()) {
            map3.put(((Class) entry.getKey()).getName(), "kotlin.Function" + ((Number) entry.getValue()).intValue());
        }
        d = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(l0.a(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            Intrinsics.b(str2);
            linkedHashMap.put(key, StringsKt.B(str2, str2));
        }
        e = linkedHashMap;
    }

    public g(Class jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.a = jClass;
    }

    @Override // com.gamericefishpro.space.ei.e
    public final Class a() {
        return this.a;
    }

    public final String b() {
        String str;
        b.getClass();
        Class jClass = this.a;
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
            return null;
        }
        boolean zIsArray = jClass.isArray();
        HashMap map = d;
        if (!zIsArray) {
            String str2 = (String) map.get(jClass.getName());
            return str2 == null ? jClass.getCanonicalName() : str2;
        }
        Class<?> componentType = jClass.getComponentType();
        if (componentType.isPrimitive() && (str = (String) map.get(componentType.getName())) != null) {
            strConcat = str.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    public final String c() {
        String str;
        b.getClass();
        Class jClass = this.a;
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        String strConcat = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (!jClass.isLocalClass()) {
            boolean zIsArray = jClass.isArray();
            LinkedHashMap linkedHashMap = e;
            if (!zIsArray) {
                String str2 = (String) linkedHashMap.get(jClass.getName());
                return str2 == null ? jClass.getSimpleName() : str2;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                strConcat = str.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String missingDelimiterValue = jClass.getSimpleName();
        Method enclosingMethod = jClass.getEnclosingMethod();
        if (enclosingMethod != null) {
            String strA = StringsKt.A(missingDelimiterValue, enclosingMethod.getName() + '$');
            if (strA != null) {
                return strA;
            }
        }
        Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return StringsKt.A(missingDelimiterValue, enclosingConstructor.getName() + '$');
        }
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "<this>");
        Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
        int iT = StringsKt.t(missingDelimiterValue, '$', 0, 6);
        if (iT == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = missingDelimiterValue.substring(iT + 1, missingDelimiterValue.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final boolean d(Object obj) {
        b.getClass();
        Class jClass = this.a;
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Map map = c;
        Intrinsics.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = (Integer) map.get(jClass);
        if (num != null) {
            return e0.d(num.intValue(), obj);
        }
        if (jClass.isPrimitive()) {
            Intrinsics.checkNotNullParameter(jClass, "<this>");
            jClass = d5.D(b0.a(jClass));
        }
        return jClass.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof g) && d5.D(this).equals(d5.D((com.gamericefishpro.space.ki.b) obj));
    }

    public final int hashCode() {
        return d5.D(this).hashCode();
    }

    public final String toString() {
        return this.a + " (Kotlin reflection is not available)";
    }
}
