package androidx.work;

import com.squareup.util.Strings;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.ArraysKt__ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class Data {
    public static final Data EMPTY;
    public final HashMap values;

    public final class Builder {
        public static final Operation$State$IN_PROGRESS IN_PROGRESS;
        public static final Operation$State$SUCCESS SUCCESS;
        public Object values = new LinkedHashMap();

        static {
            int i = 13;
            SUCCESS = new Operation$State$SUCCESS(i);
            IN_PROGRESS = new Operation$State$IN_PROGRESS(i);
        }

        public Data build() {
            Data data = new Data((LinkedHashMap) this.values);
            Strings.toByteArrayInternalV1(data);
            return data;
        }

        public void put(String str, Object obj) {
            str.getClass();
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.values;
            if (obj == null) {
                obj = null;
            } else {
                Class<?> cls = obj.getClass();
                ReflectionFactory reflectionFactory = Reflection.factory;
                KClass orCreateKotlinClass = reflectionFactory.getOrCreateKotlinClass(cls);
                if (!orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(Boolean.TYPE)) && !orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(Byte.TYPE)) && !orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(Integer.TYPE)) && !orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(Long.TYPE)) && !orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(Float.TYPE)) && !orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(Double.TYPE)) && !orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(String.class)) && !orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(Boolean[].class)) && !orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(Byte[].class)) && !orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(Integer[].class)) && !orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(Long[].class)) && !orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(Float[].class)) && !orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(Double[].class)) && !orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(String[].class))) {
                    if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(boolean[].class))) {
                        obj = Data_Kt.access$convertPrimitiveArray((boolean[]) obj);
                    } else if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(byte[].class))) {
                        obj = Data_Kt.access$convertPrimitiveArray((byte[]) obj);
                    } else if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(int[].class))) {
                        obj = Data_Kt.access$convertPrimitiveArray((int[]) obj);
                    } else if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(long[].class))) {
                        obj = Data_Kt.access$convertPrimitiveArray((long[]) obj);
                    } else if (orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(float[].class))) {
                        obj = Data_Kt.access$convertPrimitiveArray((float[]) obj);
                    } else {
                        if (!orCreateKotlinClass.equals(reflectionFactory.getOrCreateKotlinClass(double[].class))) {
                            Handlers$$ExternalSyntheticBUOutline0.m$1("Key ", str, " has invalid type ", orCreateKotlinClass);
                            return;
                        }
                        obj = Data_Kt.access$convertPrimitiveArray((double[]) obj);
                    }
                }
            }
            linkedHashMap.put(str, obj);
        }

        public void putAll(HashMap hashMap) {
            hashMap.getClass();
            for (Map.Entry entry : hashMap.entrySet()) {
                put((String) entry.getKey(), entry.getValue());
            }
        }
    }

    static {
        Data data = new Data(new LinkedHashMap());
        Strings.toByteArrayInternalV1(data);
        EMPTY = data;
    }

    public Data(Data data) {
        data.getClass();
        this.values = new HashMap(data.values);
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (obj != null && Data.class.equals(obj.getClass())) {
                HashMap hashMap = ((Data) obj).values;
                HashMap hashMap2 = this.values;
                Set<String> keySet = hashMap2.keySet();
                if (Intrinsics.areEqual(keySet, hashMap.keySet())) {
                    for (String str : keySet) {
                        Object obj2 = hashMap2.get(str);
                        Object obj3 = hashMap.get(str);
                        if (obj2 == null || obj3 == null) {
                            z = obj2 == obj3;
                        } else {
                            if (obj2 instanceof Object[]) {
                                Object[] objArr = (Object[]) obj2;
                                if (obj3 instanceof Object[]) {
                                    z = ArraysKt__ArraysKt.contentDeepEquals(objArr, (Object[]) obj3);
                                }
                            }
                            z = obj2.equals(obj3);
                        }
                        if (!z) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getString(String str) {
        Object obj = this.values.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean hasKeyWithValueOfType(String str) {
        Object obj = this.values.get(str);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : this.values.entrySet()) {
            Object value = entry.getValue();
            i += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return i * 31;
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Data {"), CollectionsKt.joinToString$default(this.values.entrySet(), null, null, null, 0, null, new Data$$ExternalSyntheticLambda0(0), 31), "}");
    }

    public Data(LinkedHashMap linkedHashMap) {
        linkedHashMap.getClass();
        this.values = new HashMap(linkedHashMap);
    }
}
