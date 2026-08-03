package n8;

import bc.l;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g extends e {
    private final Class<?> clazz;
    private Object obj;

    public g(Class<?> cls) {
        j.e(cls, "clazz");
        this.clazz = cls;
    }

    private final boolean doesHaveAllParameters(Constructor<?> constructor, b bVar) {
        Type[] genericParameterTypes = constructor.getGenericParameterTypes();
        j.d(genericParameterTypes, "constructor.genericParameterTypes");
        for (Type type : genericParameterTypes) {
            if (type instanceof ParameterizedType) {
                Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                j.d(actualTypeArguments, "param.actualTypeArguments");
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
                j.d(upperBounds, "argType.upperBounds");
                Type type3 = (Type) l.X(upperBounds);
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

    @Override // n8.e
    public Object resolve(b bVar) {
        j.e(bVar, "provider");
        Object obj = this.obj;
        if (obj != null) {
            return obj;
        }
        Constructor<?>[] constructors = this.clazz.getConstructors();
        j.d(constructors, "clazz.constructors");
        int length = constructors.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Constructor<?> constructor = constructors[i10];
            j.d(constructor, "constructor");
            if (doesHaveAllParameters(constructor, bVar)) {
                ArrayList arrayList = new ArrayList();
                Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                j.d(genericParameterTypes, "constructor.genericParameterTypes");
                for (Type type : genericParameterTypes) {
                    if (type instanceof ParameterizedType) {
                        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                        j.d(actualTypeArguments, "param.actualTypeArguments");
                        Type type2 = actualTypeArguments.length == 0 ? null : actualTypeArguments[0];
                        if (type2 instanceof WildcardType) {
                            Type[] upperBounds = ((WildcardType) type2).getUpperBounds();
                            j.d(upperBounds, "argType.upperBounds");
                            Type type3 = (Type) l.X(upperBounds);
                            if (type3 instanceof Class) {
                                arrayList.add(bVar.getAllServices((Class) type3));
                            } else {
                                arrayList.add(null);
                            }
                        } else if (type2 instanceof Class) {
                            arrayList.add(bVar.getAllServices((Class) type2));
                        } else {
                            arrayList.add(null);
                        }
                    } else if (type instanceof Class) {
                        arrayList.add(bVar.getService((Class) type));
                    } else {
                        arrayList.add(null);
                    }
                }
                Object[] array = arrayList.toArray(new Object[0]);
                j.c(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                this.obj = constructor.newInstance(Arrays.copyOf(array, array.length));
            } else {
                i10++;
            }
        }
        return this.obj;
    }
}
