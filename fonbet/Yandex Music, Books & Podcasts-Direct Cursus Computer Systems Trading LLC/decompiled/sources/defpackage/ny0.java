package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class ny0 {
    public final /* synthetic */ int a;

    public /* synthetic */ ny0(int i) {
        this.a = i;
    }

    public static void b(Type type, Class cls) {
        Class<?> P = wdg.P(type);
        if (cls.isAssignableFrom(P)) {
            StringBuilder sb = new StringBuilder("No JsonAdapter for ");
            sb.append(type);
            String simpleName = cls.getSimpleName();
            String simpleName2 = P.getSimpleName();
            sb.append(", you should probably use ");
            sb.append(simpleName);
            sb.append(" instead of ");
            sb.append(simpleName2);
            sb.append(" (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v9, types: [z3f] */
    public final z3f a(Type type, Set set, dei deiVar) {
        LinkedHashSet linkedHashSet;
        ot0 fm4Var;
        Class cls;
        boolean z;
        boolean z2;
        y3f y3fVar;
        Class P;
        Type[] typeArr;
        char c;
        tgj tgjVar;
        Class<?> cls2;
        Constructor<?> declaredConstructor;
        Object[] objArr;
        Type type2 = type;
        int i = this.a;
        Class cls3 = Integer.TYPE;
        boolean z3 = true;
        LinkedHashSet linkedHashSet2 = null;
        switch (i) {
            case 0:
                Type genericComponentType = type2 instanceof GenericArrayType ? ((GenericArrayType) type2).getGenericComponentType() : type2 instanceof Class ? ((Class) type2).getComponentType() : null;
                if (genericComponentType != null && set.isEmpty()) {
                    return new oy0(wdg.P(genericComponentType), deiVar.a(genericComponentType, avt.a, null)).c();
                }
                return null;
            case 1:
                int i2 = 0;
                if ((type2 instanceof Class) || (type2 instanceof ParameterizedType)) {
                    Class P2 = wdg.P(type2);
                    if (!P2.isInterface() && !P2.isEnum() && set.isEmpty()) {
                        if (avt.d(P2)) {
                            b(type2, List.class);
                            b(type2, Set.class);
                            b(type2, Map.class);
                            b(type2, Collection.class);
                            String str = "Platform " + P2;
                            if (type2 instanceof ParameterizedType) {
                                str = str + " in " + type2;
                            }
                            xq0.x(str.concat(" requires explicit JsonAdapter to be registered"));
                            return null;
                        }
                        if (P2.isAnonymousClass()) {
                            xq0.x("Cannot serialize anonymous class ".concat(P2.getName()));
                            return null;
                        }
                        if (P2.isLocalClass()) {
                            xq0.x("Cannot serialize local class ".concat(P2.getName()));
                            return null;
                        }
                        if (P2.getEnclosingClass() != null && !Modifier.isStatic(P2.getModifiers())) {
                            xq0.x("Cannot serialize non-static nested class ".concat(P2.getName()));
                            return null;
                        }
                        if (Modifier.isAbstract(P2.getModifiers())) {
                            xq0.x("Cannot serialize abstract class ".concat(P2.getName()));
                            return null;
                        }
                        Class<? extends Annotation> cls4 = avt.c;
                        if (cls4 != null && P2.isAnnotationPresent(cls4)) {
                            b6e.v(P2.getName(), ". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.", "Cannot serialize Kotlin type ");
                            return null;
                        }
                        try {
                            try {
                                try {
                                    try {
                                        Constructor declaredConstructor2 = P2.getDeclaredConstructor(null);
                                        declaredConstructor2.setAccessible(true);
                                        fm4Var = new fm4(declaredConstructor2, P2);
                                    } catch (Exception unused) {
                                        linkedHashSet = null;
                                        xq0.x("cannot construct instances of ".concat(P2.getName()));
                                    }
                                } catch (NoSuchMethodException unused2) {
                                    Class<?> cls5 = Class.forName("sun.misc.Unsafe");
                                    Field declaredField = cls5.getDeclaredField("theUnsafe");
                                    declaredField.setAccessible(true);
                                    fm4Var = new gm4(cls5.getMethod("allocateInstance", Class.class), declaredField.get(null), P2);
                                }
                            } catch (IllegalAccessException unused3) {
                                linkedHashSet = null;
                                wvs.b();
                            } catch (NoSuchMethodException unused4) {
                                Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                                declaredMethod.setAccessible(true);
                                fm4Var = new fm4(declaredMethod, P2);
                            } catch (InvocationTargetException e) {
                                avt.f(e);
                                throw null;
                            }
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused5) {
                            Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                            declaredMethod2.setAccessible(true);
                            int intValue = ((Integer) declaredMethod2.invoke(null, Object.class)).intValue();
                            Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, cls3);
                            declaredMethod3.setAccessible(true);
                            fm4Var = new hm4(declaredMethod3, P2, intValue);
                        } catch (IllegalAccessException unused6) {
                            linkedHashSet = null;
                            wvs.b();
                        }
                        TreeMap treeMap = new TreeMap();
                        while (type2 != Object.class) {
                            Class P3 = wdg.P(type2);
                            boolean d = avt.d(P3);
                            Field[] declaredFields = P3.getDeclaredFields();
                            int length = declaredFields.length;
                            int i3 = i2;
                            while (i3 < length) {
                                Field field = declaredFields[i3];
                                int modifiers = field.getModifiers();
                                if (Modifier.isStatic(modifiers) || Modifier.isTransient(modifiers) || (!(Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers) || !d) || ((y3fVar = (y3f) field.getAnnotation(y3f.class)) != null && y3fVar.ignore()))) {
                                    cls = P3;
                                    z = d;
                                    z2 = z3;
                                    linkedHashSet = linkedHashSet2;
                                } else {
                                    linkedHashSet = linkedHashSet2;
                                    Type e2 = avt.e(type2, P3, field.getGenericType(), new LinkedHashSet());
                                    Annotation[] annotations = field.getAnnotations();
                                    int length2 = annotations.length;
                                    LinkedHashSet linkedHashSet3 = linkedHashSet;
                                    int i4 = 0;
                                    while (i4 < length2) {
                                        int i5 = i4;
                                        Annotation annotation = annotations[i5];
                                        Class cls6 = P3;
                                        boolean z4 = d;
                                        if (annotation.annotationType().isAnnotationPresent(z6f.class)) {
                                            if (linkedHashSet3 == null) {
                                                linkedHashSet3 = new LinkedHashSet();
                                            }
                                            LinkedHashSet linkedHashSet4 = linkedHashSet3;
                                            linkedHashSet4.add(annotation);
                                            linkedHashSet3 = linkedHashSet4;
                                        }
                                        i4 = i5 + 1;
                                        P3 = cls6;
                                        d = z4;
                                    }
                                    cls = P3;
                                    z = d;
                                    Set unmodifiableSet = linkedHashSet3 != null ? Collections.unmodifiableSet(linkedHashSet3) : avt.a;
                                    String name = field.getName();
                                    z3f a = deiVar.a(e2, unmodifiableSet, name);
                                    z2 = true;
                                    field.setAccessible(true);
                                    if (y3fVar != null) {
                                        String name2 = y3fVar.name();
                                        if (!"\u0000".equals(name2)) {
                                            name = name2;
                                        }
                                    }
                                    im4 im4Var = (im4) treeMap.put(name, new im4(name, field, a));
                                    if (im4Var != null) {
                                        jj4.k("Conflicting fields:\n    ", im4Var.b, "\n    ", field);
                                        return linkedHashSet;
                                    }
                                }
                                i3++;
                                P3 = cls;
                                z3 = z2;
                                linkedHashSet2 = linkedHashSet;
                                d = z;
                            }
                            Class P4 = wdg.P(type2);
                            type2 = avt.e(type2, P4, P4.getGenericSuperclass(), new LinkedHashSet());
                            i2 = 0;
                        }
                        return new jm4(fm4Var, treeMap).c();
                    }
                }
                linkedHashSet = null;
                return linkedHashSet;
            case 2:
                Class P5 = wdg.P(type2);
                if (!set.isEmpty()) {
                    return null;
                }
                if (P5 == List.class || P5 == Collection.class) {
                    return new ny4(deiVar.a(wdg.I(type2), avt.a, null), 0).c();
                }
                if (P5 == Set.class) {
                    return new ny4(deiVar.a(wdg.I(type2), avt.a, null), 1).c();
                }
                return null;
            case 3:
                if (!set.isEmpty() || (P = wdg.P(type2)) != Map.class) {
                    return null;
                }
                if (type2 == Properties.class) {
                    typeArr = new Type[]{String.class, String.class};
                } else {
                    if (!Map.class.isAssignableFrom(P)) {
                        e7o.e();
                        return null;
                    }
                    Type e3 = avt.e(type2, P, avt.c(type2, P, Map.class), new LinkedHashSet());
                    if (!(e3 instanceof ParameterizedType)) {
                        c = 0;
                        typeArr = new Type[]{Object.class, Object.class};
                        return new oy0(deiVar, typeArr[c], typeArr[1]).c();
                    }
                    typeArr = ((ParameterizedType) e3).getActualTypeArguments();
                }
                c = 0;
                return new oy0(deiVar, typeArr[c], typeArr[1]).c();
            case 4:
                return null;
            default:
                bbr bbrVar = ksw.v;
                bbr bbrVar2 = ksw.u;
                bbr bbrVar3 = ksw.t;
                bbr bbrVar4 = ksw.s;
                bbr bbrVar5 = ksw.r;
                bbr bbrVar6 = ksw.q;
                bbr bbrVar7 = ksw.p;
                bbr bbrVar8 = ksw.o;
                if (!set.isEmpty()) {
                    return null;
                }
                if (type2 == Boolean.TYPE) {
                    return bbrVar8;
                }
                if (type2 == Byte.TYPE) {
                    return bbrVar7;
                }
                if (type2 == Character.TYPE) {
                    return bbrVar6;
                }
                if (type2 == Double.TYPE) {
                    return bbrVar5;
                }
                if (type2 == Float.TYPE) {
                    return bbrVar4;
                }
                if (type2 == cls3) {
                    return bbrVar3;
                }
                if (type2 == Long.TYPE) {
                    return bbrVar2;
                }
                if (type2 == Short.TYPE) {
                    return bbrVar;
                }
                if (type2 == Boolean.class) {
                    return bbrVar8.c();
                }
                if (type2 == Byte.class) {
                    return bbrVar7.c();
                }
                if (type2 == Character.class) {
                    return bbrVar6.c();
                }
                if (type2 == Double.class) {
                    return bbrVar5.c();
                }
                if (type2 == Float.class) {
                    return bbrVar4.c();
                }
                if (type2 == Integer.class) {
                    return bbrVar3.c();
                }
                if (type2 == Long.class) {
                    return bbrVar2.c();
                }
                if (type2 == Short.class) {
                    return bbrVar.c();
                }
                if (type2 == String.class) {
                    return ksw.w.c();
                }
                if (type2 == Object.class) {
                    return new dbr(deiVar).c();
                }
                Class P6 = wdg.P(type2);
                Set set2 = avt.a;
                h4f h4fVar = (h4f) P6.getAnnotation(h4f.class);
                if (h4fVar == null || !h4fVar.generateAdapter()) {
                    tgjVar = null;
                } else {
                    try {
                        try {
                            cls2 = Class.forName(P6.getName().replace("$", "_") + "JsonAdapter", true, P6.getClassLoader());
                            try {
                                if (type2 instanceof ParameterizedType) {
                                    Type[] actualTypeArguments = ((ParameterizedType) type2).getActualTypeArguments();
                                    try {
                                        declaredConstructor = cls2.getDeclaredConstructor(dei.class, Type[].class);
                                        objArr = new Object[]{deiVar, actualTypeArguments};
                                    } catch (NoSuchMethodException unused7) {
                                        declaredConstructor = cls2.getDeclaredConstructor(Type[].class);
                                        objArr = new Object[]{actualTypeArguments};
                                    }
                                } else {
                                    try {
                                        declaredConstructor = cls2.getDeclaredConstructor(dei.class);
                                        objArr = new Object[]{deiVar};
                                    } catch (NoSuchMethodException unused8) {
                                        declaredConstructor = cls2.getDeclaredConstructor(null);
                                        objArr = new Object[0];
                                    }
                                }
                                declaredConstructor.setAccessible(true);
                                tgjVar = ((z3f) declaredConstructor.newInstance(objArr)).c();
                            } catch (NoSuchMethodException e4) {
                                e = e4;
                                if ((type2 instanceof ParameterizedType) || cls2.getTypeParameters().length == 0) {
                                    e7o.m("Failed to find the generated JsonAdapter constructor for ", type2, e);
                                    return null;
                                }
                                StringBuilder sb = new StringBuilder("Failed to find the generated JsonAdapter constructor for '");
                                sb.append(type2);
                                String canonicalName = cls2.getCanonicalName();
                                sb.append("'. Suspiciously, the type was not parameterized but the target class '");
                                sb.append(canonicalName);
                                sb.append("' is generic. Consider using Types#newParameterizedType() to define these missing type variables.");
                                throw new RuntimeException(sb.toString(), e);
                            }
                        } catch (NoSuchMethodException e5) {
                            e = e5;
                            cls2 = null;
                        }
                    } catch (ClassNotFoundException e6) {
                        e7o.m("Failed to find the generated JsonAdapter class for ", type2, e6);
                        return null;
                    } catch (IllegalAccessException e7) {
                        e7o.m("Failed to access the generated JsonAdapter for ", type2, e7);
                        return null;
                    } catch (InstantiationException e8) {
                        e7o.m("Failed to instantiate the generated JsonAdapter for ", type2, e8);
                        return null;
                    } catch (InvocationTargetException e9) {
                        avt.f(e9);
                        throw null;
                    }
                }
                if (tgjVar != null) {
                    return tgjVar;
                }
                if (P6.isEnum()) {
                    return new cbr(P6).c();
                }
                return null;
        }
    }
}
