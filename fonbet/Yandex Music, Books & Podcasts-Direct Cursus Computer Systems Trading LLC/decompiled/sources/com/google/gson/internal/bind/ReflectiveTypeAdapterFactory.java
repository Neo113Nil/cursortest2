package com.google.gson.internal.bind;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.GsonTypes;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.ReflectionAccessFilterHelper;
import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import defpackage.erq;
import defpackage.frq;
import defpackage.hrg;
import defpackage.kac;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ReflectiveTypeAdapterFactory implements TypeAdapterFactory {
    public final ConstructorConstructor a;
    public final FieldNamingStrategy b;
    public final Excluder c;
    public final JsonAdapterAnnotationTypeAdapterFactory d;
    public final List e;

    /* renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$1, reason: invalid class name */
    class AnonymousClass1 extends TypeAdapter<Object> {
        @Override // com.google.gson.TypeAdapter
        public final Object b(JsonReader jsonReader) {
            jsonReader.w();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public final void c(JsonWriter jsonWriter, Object obj) {
            jsonWriter.l0();
        }

        public final String toString() {
            return "AnonymousOrNonStaticLocalClassAdapter";
        }
    }

    /* renamed from: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$2, reason: invalid class name */
    class AnonymousClass2 extends BoundField {
        public final /* synthetic */ Method d;
        public final /* synthetic */ TypeAdapter e;
        public final /* synthetic */ TypeAdapter f;
        public final /* synthetic */ boolean g;
        public final /* synthetic */ boolean h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Field field, Method method, TypeAdapter typeAdapter, TypeAdapter typeAdapter2, boolean z, boolean z2) {
            super(str, field);
            this.d = method;
            this.e = typeAdapter;
            this.f = typeAdapter2;
            this.g = z;
            this.h = z2;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField
        public final void a(JsonWriter jsonWriter, Object obj) {
            Object obj2;
            Method method = this.d;
            if (method != null) {
                try {
                    obj2 = method.invoke(obj, null);
                } catch (InvocationTargetException e) {
                    throw new JsonIOException(hrg.q("Accessor ", ReflectionHelper.d(method, false), " threw exception"), e.getCause());
                }
            } else {
                obj2 = this.b.get(obj);
            }
            if (obj2 == obj) {
                return;
            }
            jsonWriter.Y(this.a);
            this.e.c(jsonWriter, obj2);
        }
    }

    public static abstract class Adapter<T, A> extends TypeAdapter<T> {
        public final FieldsData a;

        public Adapter(FieldsData fieldsData) {
            this.a = fieldsData;
        }

        @Override // com.google.gson.TypeAdapter
        public final Object b(JsonReader jsonReader) {
            if (jsonReader.H0() == JsonToken.NULL) {
                jsonReader.u0();
                return null;
            }
            Object d = d();
            Map map = this.a.a;
            try {
                jsonReader.g();
                while (jsonReader.hasNext()) {
                    BoundField boundField = (BoundField) map.get(jsonReader.L());
                    if (boundField == null) {
                        jsonReader.w();
                    } else {
                        f(d, jsonReader, boundField);
                    }
                }
                jsonReader.I();
                return e(d);
            } catch (IllegalAccessException e) {
                ReflectionHelper.RecordHelper recordHelper = ReflectionHelper.a;
                kac.k("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
                return null;
            } catch (IllegalStateException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public final void c(JsonWriter jsonWriter, Object obj) {
            if (obj == null) {
                jsonWriter.l0();
                return;
            }
            jsonWriter.z();
            try {
                Iterator it = this.a.b.iterator();
                while (it.hasNext()) {
                    ((BoundField) it.next()).a(jsonWriter, obj);
                }
                jsonWriter.I();
            } catch (IllegalAccessException e) {
                ReflectionHelper.RecordHelper recordHelper = ReflectionHelper.a;
                kac.k("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            }
        }

        public abstract Object d();

        public abstract Object e(Object obj);

        public abstract void f(Object obj, JsonReader jsonReader, BoundField boundField);
    }

    public static abstract class BoundField {
        public final String a;
        public final Field b;
        public final String c;

        public BoundField(String str, Field field) {
            this.a = str;
            this.b = field;
            this.c = field.getName();
        }

        public abstract void a(JsonWriter jsonWriter, Object obj);
    }

    public static final class FieldReflectionAdapter<T> extends Adapter<T, T> {
        public final ObjectConstructor b;

        public FieldReflectionAdapter(ObjectConstructor objectConstructor, FieldsData fieldsData) {
            super(fieldsData);
            this.b = objectConstructor;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object d() {
            return this.b.f();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object e(Object obj) {
            return obj;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final void f(Object obj, JsonReader jsonReader, BoundField boundField) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) boundField;
            Field field = anonymousClass2.b;
            Object b = anonymousClass2.f.b(jsonReader);
            if (b == null && anonymousClass2.g) {
                return;
            }
            if (anonymousClass2.h) {
                throw new JsonIOException("Cannot set value of 'static final' ".concat(ReflectionHelper.d(field, false)));
            }
            field.set(obj, b);
        }
    }

    public static class FieldsData {
        public static final FieldsData c = new FieldsData(Collections.EMPTY_LIST, Collections.EMPTY_MAP);
        public final Map a;
        public final List b;

        public FieldsData(List list, Map map) {
            this.a = map;
            this.b = list;
        }
    }

    public static final class RecordAdapter<T> extends Adapter<T, Object[]> {
        public static final HashMap e;
        public final Constructor b;
        public final Object[] c;
        public final HashMap d;

        static {
            HashMap hashMap = new HashMap();
            hashMap.put(Byte.TYPE, (byte) 0);
            hashMap.put(Short.TYPE, (short) 0);
            hashMap.put(Integer.TYPE, 0);
            hashMap.put(Long.TYPE, 0L);
            hashMap.put(Float.TYPE, Float.valueOf(0.0f));
            hashMap.put(Double.TYPE, Double.valueOf(0.0d));
            hashMap.put(Character.TYPE, (char) 0);
            hashMap.put(Boolean.TYPE, Boolean.FALSE);
            e = hashMap;
        }

        public RecordAdapter(Class cls, FieldsData fieldsData) {
            super(fieldsData);
            this.d = new HashMap();
            Constructor f = ReflectionHelper.f(cls);
            this.b = f;
            ReflectionHelper.j(f);
            String[] h = ReflectionHelper.h(cls);
            for (int i = 0; i < h.length; i++) {
                this.d.put(h[i], Integer.valueOf(i));
            }
            Class<?>[] parameterTypes = this.b.getParameterTypes();
            this.c = new Object[parameterTypes.length];
            for (int i2 = 0; i2 < parameterTypes.length; i2++) {
                this.c[i2] = e.get(parameterTypes[i2]);
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object d() {
            return (Object[]) this.c.clone();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object e(Object obj) {
            Object[] objArr = (Object[]) obj;
            Constructor constructor = this.b;
            try {
                return constructor.newInstance(objArr);
            } catch (IllegalAccessException e2) {
                ReflectionHelper.RecordHelper recordHelper = ReflectionHelper.a;
                kac.k("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
                return null;
            } catch (IllegalArgumentException e3) {
                e = e3;
                throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.b(constructor) + "' with args " + Arrays.toString(objArr), e);
            } catch (InstantiationException e4) {
                e = e4;
                throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.b(constructor) + "' with args " + Arrays.toString(objArr), e);
            } catch (InvocationTargetException e5) {
                kac.k("Failed to invoke constructor '" + ReflectionHelper.b(constructor) + "' with args " + Arrays.toString(objArr), e5.getCause());
                return null;
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final void f(Object obj, JsonReader jsonReader, BoundField boundField) {
            Object[] objArr = (Object[]) obj;
            String str = boundField.c;
            Integer num = (Integer) this.d.get(str);
            if (num == null) {
                throw new IllegalStateException("Could not find the index in the constructor '" + ReflectionHelper.b(this.b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
            }
            int intValue = num.intValue();
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) boundField;
            Object b = anonymousClass2.f.b(jsonReader);
            if (b != null || !anonymousClass2.g) {
                objArr[intValue] = b;
                return;
            }
            throw new JsonParseException("null is not allowed as value for record component '" + anonymousClass2.c + "' of primitive type; at path " + jsonReader.getPath());
        }
    }

    public ReflectiveTypeAdapterFactory(ConstructorConstructor constructorConstructor, FieldNamingStrategy fieldNamingStrategy, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List list) {
        this.a = constructorConstructor;
        this.b = fieldNamingStrategy;
        this.c = excluder;
        this.d = jsonAdapterAnnotationTypeAdapterFactory;
        this.e = list;
    }

    public static void a(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + ReflectionHelper.c(field) + " and " + ReflectionHelper.c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    @Override // com.google.gson.TypeAdapterFactory
    public final TypeAdapter b(Gson gson, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        ReflectionHelper.RecordHelper recordHelper = ReflectionHelper.a;
        if (!Modifier.isStatic(rawType.getModifiers()) && (rawType.isAnonymousClass() || rawType.isLocalClass())) {
            return new AnonymousClass1();
        }
        ReflectionAccessFilterHelper.a(this.e);
        return ReflectionHelper.i(rawType) ? new RecordAdapter(rawType, c(gson, typeToken, rawType, true)) : new FieldReflectionAdapter(this.a.b(typeToken, true), c(gson, typeToken, rawType, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ae  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final FieldsData c(Gson gson, TypeToken typeToken, Class cls, boolean z) {
        boolean z2;
        Method method;
        SerializedName serializedName;
        List asList;
        String str;
        boolean z3;
        List list;
        String str2;
        JsonAdapter jsonAdapter;
        Gson gson2;
        boolean z4;
        Field field;
        List<String> list2;
        TypeAdapter typeAdapter;
        Field field2;
        BoundField boundField;
        if (cls.isInterface()) {
            return FieldsData.c;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        TypeToken typeToken2 = typeToken;
        Class cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            if (cls2 != cls && declaredFields.length > 0) {
                ReflectionAccessFilterHelper.a(this.e);
            }
            int length = declaredFields.length;
            ?? r14 = 0;
            int i = 0;
            while (i < length) {
                Field field3 = declaredFields[i];
                boolean d = d(field3, true);
                boolean d2 = d(field3, r14);
                if (d || d2) {
                    if (!z) {
                        z2 = d2;
                    } else if (Modifier.isStatic(field3.getModifiers())) {
                        z2 = r14;
                    } else {
                        Method e = ReflectionHelper.e(cls2, field3);
                        ReflectionHelper.j(e);
                        if (e.getAnnotation(SerializedName.class) != null && field3.getAnnotation(SerializedName.class) == null) {
                            throw new JsonIOException(hrg.q("@SerializedName on ", ReflectionHelper.d(e, r14), " is not supported"));
                        }
                        z2 = d2;
                        method = e;
                        if (method == null) {
                            ReflectionHelper.j(field3);
                        }
                        Type h = GsonTypes.h(typeToken2.getType(), cls2, field3.getGenericType(), new HashMap());
                        serializedName = (SerializedName) field3.getAnnotation(SerializedName.class);
                        if (serializedName != null) {
                            str = this.b.a(field3);
                            asList = Collections.EMPTY_LIST;
                        } else {
                            String value = serializedName.value();
                            asList = Arrays.asList(serializedName.alternate());
                            str = value;
                        }
                        if (asList.isEmpty()) {
                            z3 = true;
                            ArrayList arrayList = new ArrayList(asList.size() + 1);
                            arrayList.add(str);
                            arrayList.addAll(asList);
                            list = arrayList;
                        } else {
                            z3 = true;
                            list = Collections.singletonList(str);
                        }
                        str2 = (String) list.get(r14);
                        TypeToken<?> typeToken3 = TypeToken.get(h);
                        Class<? super Object> rawType = typeToken3.getRawType();
                        boolean z5 = (rawType == null && rawType.isPrimitive()) ? z3 : r14;
                        int modifiers = field3.getModifiers();
                        boolean z6 = (Modifier.isStatic(modifiers) || !Modifier.isFinal(modifiers)) ? r14 : z3;
                        jsonAdapter = (JsonAdapter) field3.getAnnotation(JsonAdapter.class);
                        if (jsonAdapter == null) {
                            field = field3;
                            z4 = z3;
                            list2 = list;
                            gson2 = gson;
                            typeAdapter = this.d.a(this.a, gson2, typeToken3, jsonAdapter, false);
                        } else {
                            gson2 = gson;
                            z4 = z3;
                            field = field3;
                            list2 = list;
                            typeAdapter = null;
                        }
                        boolean z7 = typeAdapter == null ? z4 : r14;
                        if (typeAdapter == null) {
                            typeAdapter = gson2.f(typeToken3);
                        }
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(str2, field, method, d ? typeAdapter : z7 ? typeAdapter : new TypeAdapterRuntimeTypeWrapper(gson2, typeAdapter, typeToken3.getType()), typeAdapter, z5, z6);
                        field2 = field;
                        if (z2) {
                            for (String str3 : list2) {
                                BoundField boundField2 = (BoundField) linkedHashMap.put(str3, anonymousClass2);
                                if (boundField2 != null) {
                                    a(cls, str3, boundField2.b, field2);
                                    throw null;
                                }
                            }
                        }
                        if (d && (boundField = (BoundField) linkedHashMap2.put(str2, anonymousClass2)) != null) {
                            a(cls, str2, boundField.b, field2);
                            throw null;
                        }
                    }
                    method = null;
                    if (method == null) {
                    }
                    Type h2 = GsonTypes.h(typeToken2.getType(), cls2, field3.getGenericType(), new HashMap());
                    serializedName = (SerializedName) field3.getAnnotation(SerializedName.class);
                    if (serializedName != null) {
                    }
                    if (asList.isEmpty()) {
                    }
                    str2 = (String) list.get(r14);
                    TypeToken<?> typeToken32 = TypeToken.get(h2);
                    Class<? super Object> rawType2 = typeToken32.getRawType();
                    if (rawType2 == null) {
                    }
                    int modifiers2 = field3.getModifiers();
                    if (Modifier.isStatic(modifiers2)) {
                    }
                    jsonAdapter = (JsonAdapter) field3.getAnnotation(JsonAdapter.class);
                    if (jsonAdapter == null) {
                    }
                    if (typeAdapter == null) {
                    }
                    if (typeAdapter == null) {
                    }
                    if (d) {
                    }
                    AnonymousClass2 anonymousClass22 = new AnonymousClass2(str2, field, method, d ? typeAdapter : z7 ? typeAdapter : new TypeAdapterRuntimeTypeWrapper(gson2, typeAdapter, typeToken32.getType()), typeAdapter, z5, z6);
                    field2 = field;
                    if (z2) {
                    }
                    if (d) {
                        a(cls, str2, boundField.b, field2);
                        throw null;
                    }
                    continue;
                }
                i++;
                r14 = 0;
            }
            typeToken2 = TypeToken.get(GsonTypes.h(typeToken2.getType(), cls2, cls2.getGenericSuperclass(), new HashMap()));
            cls2 = typeToken2.getRawType();
        }
        return new FieldsData(new ArrayList(linkedHashMap2.values()), linkedHashMap);
    }

    public final boolean d(Field field, boolean z) {
        boolean z2;
        Excluder excluder = this.c;
        excluder.getClass();
        if ((136 & field.getModifiers()) == 0 && !field.isSynthetic() && !excluder.d(field.getType(), z)) {
            List list = z ? excluder.a : excluder.b;
            if (!list.isEmpty()) {
                FieldAttributes fieldAttributes = new FieldAttributes(field);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((frq) ((ExclusionStrategy) it.next())).getClass();
                    if (fieldAttributes.a.getAnnotation(erq.class) != null) {
                    }
                }
            }
            z2 = false;
            return !z2;
        }
        z2 = true;
        return !z2;
    }
}
