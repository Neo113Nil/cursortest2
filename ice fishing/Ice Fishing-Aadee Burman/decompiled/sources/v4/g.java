package v4;

import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class g extends e {
    private final Class<?> clazz;
    private Object obj;

    public g(Class<?> clazz) {
        kotlin.jvm.internal.h.e(clazz, "clazz");
        this.clazz = clazz;
    }

    private final boolean doesHaveAllParameters(Constructor<?> constructor, b bVar) {
        Type[] genericParameterTypes = constructor.getGenericParameterTypes();
        kotlin.jvm.internal.h.d(genericParameterTypes, "getGenericParameterTypes(...)");
        for (Type type : genericParameterTypes) {
            if (type instanceof ParameterizedType) {
                Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                kotlin.jvm.internal.h.d(actualTypeArguments, "getActualTypeArguments(...)");
                Type type2 = actualTypeArguments.length == 0 ? null : actualTypeArguments[0];
                if (!(type2 instanceof WildcardType)) {
                    if (type2 instanceof Class) {
                        if (!bVar.hasService((Class) type2)) {
                            com.onesignal.debug.internal.logging.b.error$default("Constructor " + constructor + " could not find service: " + type2, null, 2, null);
                        }
                    }
                    return false;
                }
                Type[] upperBounds = ((WildcardType) type2).getUpperBounds();
                kotlin.jvm.internal.h.d(upperBounds, "getUpperBounds(...)");
                if (upperBounds.length == 0) {
                    throw new NoSuchElementException("Array is empty.");
                }
                Type type3 = upperBounds[0];
                if ((type3 instanceof Class) && !bVar.hasService((Class) type3)) {
                    com.onesignal.debug.internal.logging.b.error$default("Constructor " + constructor + " could not find service: " + type3, null, 2, null);
                    return false;
                }
            } else {
                if (!(type instanceof Class)) {
                    com.onesignal.debug.internal.logging.b.error$default("Constructor " + constructor + " could not identify param type: " + type, null, 2, null);
                    return false;
                }
                if (!bVar.hasService((Class) type)) {
                    com.onesignal.debug.internal.logging.b.error$default("Constructor " + constructor + " could not find service: " + type, null, 2, null);
                    return false;
                }
            }
        }
        return true;
    }

    @Override // v4.e
    public Object resolve(b provider) {
        kotlin.jvm.internal.h.e(provider, "provider");
        Object obj = this.obj;
        if (obj != null) {
            return obj;
        }
        Constructor<?>[] constructors = this.clazz.getConstructors();
        kotlin.jvm.internal.h.d(constructors, "getConstructors(...)");
        int length = constructors.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Constructor<?> constructor = constructors[i];
            kotlin.jvm.internal.h.b(constructor);
            if (doesHaveAllParameters(constructor, provider)) {
                ArrayList arrayList = new ArrayList();
                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                kotlin.jvm.internal.h.d(genericParameterTypes, "getGenericParameterTypes(...)");
                for (Type type : genericParameterTypes) {
                    if (type instanceof ParameterizedType) {
                        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                        kotlin.jvm.internal.h.d(actualTypeArguments, "getActualTypeArguments(...)");
                        Type type2 = actualTypeArguments.length == 0 ? null : actualTypeArguments[0];
                        if (type2 instanceof WildcardType) {
                            Type[] upperBounds = ((WildcardType) type2).getUpperBounds();
                            kotlin.jvm.internal.h.d(upperBounds, "getUpperBounds(...)");
                            if (upperBounds.length == 0) {
                                throw new NoSuchElementException("Array is empty.");
                            }
                            Type type3 = upperBounds[0];
                            if (type3 instanceof Class) {
                                arrayList.add(provider.getAllServices((Class) type3));
                            } else {
                                arrayList.add(null);
                            }
                        } else if (type2 instanceof Class) {
                            arrayList.add(provider.getAllServices((Class) type2));
                        } else {
                            arrayList.add(null);
                        }
                    } else if (type instanceof Class) {
                        arrayList.add(provider.getService((Class) type));
                    } else {
                        arrayList.add(null);
                    }
                }
                Object[] array = arrayList.toArray(new Object[0]);
                this.obj = constructor.newInstance(Arrays.copyOf(array, array.length));
            } else {
                i++;
            }
        }
        return this.obj;
    }
}
