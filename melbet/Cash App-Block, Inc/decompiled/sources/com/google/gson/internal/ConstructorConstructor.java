package com.google.gson.internal;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.braze.Braze$Companion$$ExternalSyntheticLambda21;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.gson.InstanceCreator;
import com.google.gson.JsonIOException;
import com.google.gson.ReflectionAccessFilter;
import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
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

/* loaded from: classes4.dex */
public final class ConstructorConstructor {
    private final Map<Type, InstanceCreator<?>> instanceCreators;
    private final List<ReflectionAccessFilter> reflectionFilters;
    private final boolean useJdkUnsafe;

    public ConstructorConstructor(Map<Type, InstanceCreator<?>> map, boolean z, List<ReflectionAccessFilter> list) {
        this.instanceCreators = map;
        this.useJdkUnsafe = z;
        this.reflectionFilters = list;
    }

    public static String checkInstantiable(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + TroubleshootingGuide.createUrl("r8-abstract-class");
    }

    private static boolean hasStringKeyType(Type type2) {
        if (!(type2 instanceof ParameterizedType)) {
            return true;
        }
        Type[] actualTypeArguments = ((ParameterizedType) type2).getActualTypeArguments();
        return actualTypeArguments.length != 0 && GsonTypes.getRawType(actualTypeArguments[0]) == String.class;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$get$2(String str) {
        throw new JsonIOException(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$get$3(String str) {
        throw new JsonIOException(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$get$4(String str) {
        throw new JsonIOException(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Collection lambda$newCollectionConstructor$10() {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Collection lambda$newCollectionConstructor$11() {
        return new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Collection lambda$newCollectionConstructor$12() {
        return new TreeSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Collection lambda$newCollectionConstructor$13() {
        return new ArrayDeque();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$newDefaultConstructor$7(String str) {
        throw new JsonIOException(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$newDefaultConstructor$8(String str) {
        throw new JsonIOException(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$newDefaultConstructor$9(Constructor constructor) {
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e) {
            throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(constructor) + "' with no args", e2);
        } catch (InvocationTargetException e3) {
            OptionalProvider$$ExternalSyntheticLambda0.m("Failed to invoke constructor '" + ReflectionHelper.constructorToString(constructor) + "' with no args", e3.getCause());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map lambda$newMapConstructor$14() {
        return new LinkedTreeMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map lambda$newMapConstructor$15() {
        return new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map lambda$newMapConstructor$16() {
        return new TreeMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map lambda$newMapConstructor$17() {
        return new ConcurrentHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Map lambda$newMapConstructor$18() {
        return new ConcurrentSkipListMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$newSpecialCollectionConstructor$5(Type type2) {
        if (!(type2 instanceof ParameterizedType)) {
            AesGcmSiv$$ExternalSyntheticLambda0.m(type2, "Invalid EnumSet type: ");
            return null;
        }
        Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
        if (type3 instanceof Class) {
            return EnumSet.noneOf((Class) type3);
        }
        AesGcmSiv$$ExternalSyntheticLambda0.m(type2, "Invalid EnumSet type: ");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$newSpecialCollectionConstructor$6(Type type2) {
        if (!(type2 instanceof ParameterizedType)) {
            AesGcmSiv$$ExternalSyntheticLambda0.m(type2, "Invalid EnumMap type: ");
            return null;
        }
        Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
        if (type3 instanceof Class) {
            return new EnumMap((Class) type3);
        }
        AesGcmSiv$$ExternalSyntheticLambda0.m(type2, "Invalid EnumMap type: ");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$newUnsafeAllocator$19(Class cls) {
        try {
            return UnsafeAllocator.INSTANCE.newInstance(cls);
        } catch (Exception e) {
            OptionalProvider$$ExternalSyntheticLambda0.m(Boxes$$ExternalSyntheticOutline1.m(cls, "Unable to create instance of ", ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem."), (Throwable) e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$newUnsafeAllocator$20(String str) {
        throw new JsonIOException(str);
    }

    private static ObjectConstructor<? extends Collection<? extends Object>> newCollectionConstructor(Class<?> cls) {
        if (cls.isAssignableFrom(ArrayList.class)) {
            return new AesGcmSiv$$ExternalSyntheticLambda0(20);
        }
        if (cls.isAssignableFrom(LinkedHashSet.class)) {
            return new AesGcmSiv$$ExternalSyntheticLambda0(21);
        }
        if (cls.isAssignableFrom(TreeSet.class)) {
            return new AesGcmSiv$$ExternalSyntheticLambda0(22);
        }
        if (cls.isAssignableFrom(ArrayDeque.class)) {
            return new AesGcmSiv$$ExternalSyntheticLambda0(23);
        }
        return null;
    }

    private static <T> ObjectConstructor<T> newDefaultConstructor(Class<? super T> cls, ReflectionAccessFilter.FilterResult filterResult) {
        String tryMakeAccessible;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(null);
            ReflectionAccessFilter.FilterResult filterResult2 = ReflectionAccessFilter.FilterResult.ALLOW;
            return (filterResult == filterResult2 || (ReflectionAccessFilterHelper.canAccess(declaredConstructor, null) && (filterResult != ReflectionAccessFilter.FilterResult.BLOCK_ALL || Modifier.isPublic(declaredConstructor.getModifiers())))) ? (filterResult != filterResult2 || (tryMakeAccessible = ReflectionHelper.tryMakeAccessible(declaredConstructor)) == null) ? new ConstructorConstructor$$ExternalSyntheticLambda21(declaredConstructor, 0) : new Braze$Companion$$ExternalSyntheticLambda21(tryMakeAccessible, 6) : new Braze$Companion$$ExternalSyntheticLambda21(Boxes$$ExternalSyntheticOutline1.m(cls, "Unable to invoke no-args constructor of ", "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter."), 5);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private static <T> ObjectConstructor<T> newDefaultImplementationConstructor(Type type2, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return (ObjectConstructor<T>) newCollectionConstructor(cls);
        }
        if (Map.class.isAssignableFrom(cls)) {
            return (ObjectConstructor<T>) newMapConstructor(type2, cls);
        }
        return null;
    }

    private static ObjectConstructor<? extends Map<? extends Object, Object>> newMapConstructor(Type type2, Class<?> cls) {
        if (cls.isAssignableFrom(LinkedTreeMap.class) && hasStringKeyType(type2)) {
            return new AesGcmSiv$$ExternalSyntheticLambda0(15);
        }
        if (cls.isAssignableFrom(LinkedHashMap.class)) {
            return new AesGcmSiv$$ExternalSyntheticLambda0(16);
        }
        if (cls.isAssignableFrom(TreeMap.class)) {
            return new AesGcmSiv$$ExternalSyntheticLambda0(17);
        }
        if (cls.isAssignableFrom(ConcurrentHashMap.class)) {
            return new AesGcmSiv$$ExternalSyntheticLambda0(18);
        }
        if (cls.isAssignableFrom(ConcurrentSkipListMap.class)) {
            return new AesGcmSiv$$ExternalSyntheticLambda0(19);
        }
        return null;
    }

    private static <T> ObjectConstructor<T> newSpecialCollectionConstructor(Type type2, Class<? super T> cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new ConstructorConstructor$$ExternalSyntheticLambda12(0, type2);
        }
        if (cls == EnumMap.class) {
            return new ConstructorConstructor$$ExternalSyntheticLambda12(1, type2);
        }
        return null;
    }

    private <T> ObjectConstructor<T> newUnsafeAllocator(Class<? super T> cls) {
        if (this.useJdkUnsafe) {
            return new ConstructorConstructor$$ExternalSyntheticLambda10(cls, 0);
        }
        String m = Boxes$$ExternalSyntheticOutline1.m(cls, "Unable to create instance of ", "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
        if (cls.getDeclaredConstructors().length == 0) {
            m = m.concat(" Or adjust your R8 configuration to keep the no-args constructor of the class.");
        }
        return new Braze$Companion$$ExternalSyntheticLambda21(m, 4);
    }

    public <T> ObjectConstructor<T> get(TypeToken<T> typeToken, boolean z) {
        final Type type2 = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        final InstanceCreator<?> instanceCreator = this.instanceCreators.get(type2);
        if (instanceCreator != null) {
            final int i = 0;
            return new ObjectConstructor() { // from class: com.google.gson.internal.ConstructorConstructor$$ExternalSyntheticLambda1
                @Override // com.google.gson.internal.ObjectConstructor, com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
                public final Object construct() {
                    Object createInstance;
                    Object createInstance2;
                    int i2 = i;
                    Type type3 = type2;
                    InstanceCreator instanceCreator2 = instanceCreator;
                    switch (i2) {
                        case 0:
                            createInstance = instanceCreator2.createInstance(type3);
                            return createInstance;
                        default:
                            createInstance2 = instanceCreator2.createInstance(type3);
                            return createInstance2;
                    }
                }
            };
        }
        final InstanceCreator<?> instanceCreator2 = this.instanceCreators.get(rawType);
        if (instanceCreator2 != null) {
            final int i2 = 1;
            return new ObjectConstructor() { // from class: com.google.gson.internal.ConstructorConstructor$$ExternalSyntheticLambda1
                @Override // com.google.gson.internal.ObjectConstructor, com.nimbusds.jose.shaded.gson.internal.ObjectConstructor
                public final Object construct() {
                    Object createInstance;
                    Object createInstance2;
                    int i22 = i2;
                    Type type3 = type2;
                    InstanceCreator instanceCreator22 = instanceCreator2;
                    switch (i22) {
                        case 0:
                            createInstance = instanceCreator22.createInstance(type3);
                            return createInstance;
                        default:
                            createInstance2 = instanceCreator22.createInstance(type3);
                            return createInstance2;
                    }
                }
            };
        }
        ObjectConstructor<T> newSpecialCollectionConstructor = newSpecialCollectionConstructor(type2, rawType);
        if (newSpecialCollectionConstructor != null) {
            return newSpecialCollectionConstructor;
        }
        ReflectionAccessFilter.FilterResult filterResult = ReflectionAccessFilterHelper.getFilterResult(this.reflectionFilters, rawType);
        ObjectConstructor<T> newDefaultConstructor = newDefaultConstructor(rawType, filterResult);
        if (newDefaultConstructor != null) {
            return newDefaultConstructor;
        }
        ObjectConstructor<T> newDefaultImplementationConstructor = newDefaultImplementationConstructor(type2, rawType);
        if (newDefaultImplementationConstructor != null) {
            return newDefaultImplementationConstructor;
        }
        String checkInstantiable = checkInstantiable(rawType);
        return checkInstantiable != null ? new Braze$Companion$$ExternalSyntheticLambda21(checkInstantiable, 7) : !z ? new Braze$Companion$$ExternalSyntheticLambda21(Boxes$$ExternalSyntheticOutline1.m(rawType, "Unable to create instance of ", "; Register an InstanceCreator or a TypeAdapter for this type."), 8) : filterResult != ReflectionAccessFilter.FilterResult.ALLOW ? new Braze$Companion$$ExternalSyntheticLambda21(Boxes$$ExternalSyntheticOutline1.m(rawType, "Unable to create instance of ", "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection."), 9) : newUnsafeAllocator(rawType);
    }

    public String toString() {
        return this.instanceCreators.toString();
    }

    public <T> ObjectConstructor<T> get(TypeToken<T> typeToken) {
        return get(typeToken, true);
    }
}
