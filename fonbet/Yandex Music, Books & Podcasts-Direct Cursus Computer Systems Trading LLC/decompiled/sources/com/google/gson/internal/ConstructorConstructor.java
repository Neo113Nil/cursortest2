package com.google.gson.internal;

import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.gson.reflect.TypeToken;
import defpackage.jj4;
import defpackage.l1j;
import defpackage.n;
import defpackage.ra6;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* loaded from: classes3.dex */
public final class ConstructorConstructor {
    public final Map a;
    public final boolean b;
    public final List c;

    public ConstructorConstructor(Map map, boolean z, List list) {
        this.a = map;
        this.b = z;
        this.c = list;
    }

    public static String a(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ff, code lost:
    
        if (com.google.gson.internal.GsonTypes.f(r0[0]) != java.lang.String.class) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ObjectConstructor b(TypeToken typeToken, boolean z) {
        String str;
        ObjectConstructor ra6Var;
        final Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        Map map = this.a;
        jj4 jj4Var = null;
        if (map.get(type) != null) {
            l1j.f();
            return null;
        }
        if (map.get(rawType) != null) {
            l1j.f();
            return null;
        }
        final int i = 0;
        final int i2 = 1;
        ObjectConstructor objectConstructor = EnumSet.class.isAssignableFrom(rawType) ? new ObjectConstructor() { // from class: qa6
            @Override // com.google.gson.internal.ObjectConstructor
            public final Object f() {
                switch (i2) {
                    case 0:
                        Type type2 = type;
                        if (type2 instanceof ParameterizedType) {
                            Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                            if (type3 instanceof Class) {
                                return new EnumMap((Class) type3);
                            }
                            jj4.i(type2, "Invalid EnumMap type: ");
                        } else {
                            jj4.i(type2, "Invalid EnumMap type: ");
                        }
                        return null;
                    default:
                        Type type4 = type;
                        if (type4 instanceof ParameterizedType) {
                            Type type5 = ((ParameterizedType) type4).getActualTypeArguments()[0];
                            if (type5 instanceof Class) {
                                return EnumSet.noneOf((Class) type5);
                            }
                            jj4.i(type4, "Invalid EnumSet type: ");
                        } else {
                            jj4.i(type4, "Invalid EnumSet type: ");
                        }
                        return null;
                }
            }
        } : rawType == EnumMap.class ? new ObjectConstructor() { // from class: qa6
            @Override // com.google.gson.internal.ObjectConstructor
            public final Object f() {
                switch (i) {
                    case 0:
                        Type type2 = type;
                        if (type2 instanceof ParameterizedType) {
                            Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                            if (type3 instanceof Class) {
                                return new EnumMap((Class) type3);
                            }
                            jj4.i(type2, "Invalid EnumMap type: ");
                        } else {
                            jj4.i(type2, "Invalid EnumMap type: ");
                        }
                        return null;
                    default:
                        Type type4 = type;
                        if (type4 instanceof ParameterizedType) {
                            Type type5 = ((ParameterizedType) type4).getActualTypeArguments()[0];
                            if (type5 instanceof Class) {
                                return EnumSet.noneOf((Class) type5);
                            }
                            jj4.i(type4, "Invalid EnumSet type: ");
                        } else {
                            jj4.i(type4, "Invalid EnumSet type: ");
                        }
                        return null;
                }
            }
        } : null;
        if (objectConstructor != null) {
            return objectConstructor;
        }
        ReflectionAccessFilterHelper.a(this.c);
        int i3 = 18;
        if (!Modifier.isAbstract(rawType.getModifiers())) {
            try {
                Constructor declaredConstructor = rawType.getDeclaredConstructor(null);
                ReflectionHelper.RecordHelper recordHelper = ReflectionHelper.a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e) {
                    str = "Failed making constructor '" + ReflectionHelper.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e.getMessage() + ReflectionHelper.g(e);
                }
                ra6Var = str != null ? new ra6(str, 0) : new n(i3, declaredConstructor);
            } catch (NoSuchMethodException unused) {
            }
            if (ra6Var == null) {
                return ra6Var;
            }
            int i4 = 19;
            if (Collection.class.isAssignableFrom(rawType)) {
                if (rawType.isAssignableFrom(ArrayList.class)) {
                    jj4Var = new jj4(20);
                } else if (rawType.isAssignableFrom(LinkedHashSet.class)) {
                    jj4Var = new jj4(21);
                } else if (rawType.isAssignableFrom(TreeSet.class)) {
                    jj4Var = new jj4(22);
                } else if (rawType.isAssignableFrom(ArrayDeque.class)) {
                    jj4Var = new jj4(23);
                }
            } else if (Map.class.isAssignableFrom(rawType)) {
                if (rawType.isAssignableFrom(LinkedTreeMap.class)) {
                    if (type instanceof ParameterizedType) {
                        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                        if (actualTypeArguments.length != 0) {
                        }
                    }
                    jj4Var = new jj4(15);
                }
                if (rawType.isAssignableFrom(LinkedHashMap.class)) {
                    jj4Var = new jj4(16);
                } else if (rawType.isAssignableFrom(TreeMap.class)) {
                    jj4Var = new jj4(17);
                } else if (rawType.isAssignableFrom(ConcurrentHashMap.class)) {
                    jj4Var = new jj4(18);
                } else if (rawType.isAssignableFrom(ConcurrentSkipListMap.class)) {
                    jj4Var = new jj4(19);
                }
            }
            if (jj4Var != null) {
                return jj4Var;
            }
            String a = a(rawType);
            if (a != null) {
                return new ra6(a, 1);
            }
            if (!z) {
                return new ra6("Unable to create instance of " + rawType + "; Register an InstanceCreator or a TypeAdapter for this type.", 2);
            }
            if (this.b) {
                return new n(i4, rawType);
            }
            String str2 = "Unable to create instance of " + rawType + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.";
            if (rawType.getDeclaredConstructors().length == 0) {
                str2 = str2.concat(" Or adjust your R8 configuration to keep the no-args constructor of the class.");
            }
            return new ra6(str2, 3);
        }
        ra6Var = null;
        if (ra6Var == null) {
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
