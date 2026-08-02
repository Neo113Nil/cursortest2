package com.nimbusds.jose.shaded.gson.internal.bind;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.video.VideoCapture;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.nimbusds.jose.shaded.gson.Gson;
import com.nimbusds.jose.shaded.gson.JsonIOException;
import com.nimbusds.jose.shaded.gson.JsonParseException;
import com.nimbusds.jose.shaded.gson.JsonSyntaxException;
import com.nimbusds.jose.shaded.gson.TypeAdapter;
import com.nimbusds.jose.shaded.gson.TypeAdapterFactory;
import com.nimbusds.jose.shaded.gson.annotations.JsonAdapter;
import com.nimbusds.jose.shaded.gson.annotations.SerializedName;
import com.nimbusds.jose.shaded.gson.internal.Excluder;
import com.nimbusds.jose.shaded.gson.internal.GsonTypes;
import com.nimbusds.jose.shaded.gson.internal.ObjectConstructor;
import com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters;
import com.nimbusds.jose.shaded.gson.internal.reflect.ReflectionHelper;
import com.nimbusds.jose.shaded.gson.reflect.TypeToken;
import com.nimbusds.jose.shaded.gson.stream.JsonReader;
import com.nimbusds.jose.shaded.gson.stream.JsonWriter;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
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
import java.util.Locale;
import java.util.Map;
import operations.ComparingOperation;

/* loaded from: classes5.dex */
public final class ReflectiveTypeAdapterFactory implements TypeAdapterFactory {
    public final VideoCapture.AnonymousClass3 constructorConstructor;
    public final Excluder excluder;
    public final int fieldNamingPolicy;
    public final TypeAdapters.AnonymousClass29 jsonAdapterFactory;
    public final ArrayList reflectionFilters;

    /* renamed from: com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory$2, reason: invalid class name */
    public final class AnonymousClass2 {
        public final Field field;
        public final String fieldName;
        public final String serializedName;
        public final /* synthetic */ Method val$accessor;
        public final /* synthetic */ boolean val$isPrimitive;
        public final /* synthetic */ boolean val$isStaticFinalField;
        public final /* synthetic */ TypeAdapter val$typeAdapter;
        public final /* synthetic */ TypeAdapter val$writeTypeAdapter;

        public AnonymousClass2(String str, Field field, Method method, TypeAdapter typeAdapter, TypeAdapter typeAdapter2, boolean z, boolean z2) {
            this.val$accessor = method;
            this.val$writeTypeAdapter = typeAdapter;
            this.val$typeAdapter = typeAdapter2;
            this.val$isPrimitive = z;
            this.val$isStaticFinalField = z2;
            this.serializedName = str;
            this.field = field;
            this.fieldName = field.getName();
        }

        public final void write(JsonWriter jsonWriter, Object obj) {
            Object obj2;
            Method method = this.val$accessor;
            if (method != null) {
                try {
                    obj2 = method.invoke(obj, null);
                } catch (InvocationTargetException e) {
                    throw new JsonIOException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Accessor ", ReflectionHelper.getAccessibleObjectDescription(method, false), " threw exception"), e.getCause());
                }
            } else {
                obj2 = this.field.get(obj);
            }
            if (obj2 == obj) {
                return;
            }
            jsonWriter.name(this.serializedName);
            this.val$writeTypeAdapter.write(jsonWriter, obj2);
        }
    }

    public abstract class Adapter extends TypeAdapter {
        public final FieldsData fieldsData;

        public Adapter(FieldsData fieldsData) {
            this.fieldsData = fieldsData;
        }

        public abstract Object createAccumulator();

        public abstract Object finalize(Object obj);

        @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
        public final Object read(JsonReader jsonReader) {
            if (jsonReader.peek() == 9) {
                jsonReader.nextNull();
                return null;
            }
            Object createAccumulator = createAccumulator();
            Map map = this.fieldsData.deserializedFields;
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    AnonymousClass2 anonymousClass2 = (AnonymousClass2) map.get(jsonReader.nextName());
                    if (anonymousClass2 == null) {
                        jsonReader.skipValue();
                    } else {
                        readField(createAccumulator, jsonReader, anonymousClass2);
                    }
                }
                jsonReader.endObject();
                return finalize(createAccumulator);
            } catch (IllegalAccessException e) {
                ComparingOperation.DefaultImpls defaultImpls = ReflectionHelper.RECORD_HELPER;
                OptionalProvider$$ExternalSyntheticLambda0.m("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", (Throwable) e);
                return null;
            } catch (IllegalStateException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        public abstract void readField(Object obj, JsonReader jsonReader, AnonymousClass2 anonymousClass2);

        @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, Object obj) {
            if (obj == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                Iterator it = this.fieldsData.serializedFields.iterator();
                while (it.hasNext()) {
                    ((AnonymousClass2) it.next()).write(jsonWriter, obj);
                }
                jsonWriter.endObject();
            } catch (IllegalAccessException e) {
                ComparingOperation.DefaultImpls defaultImpls = ReflectionHelper.RECORD_HELPER;
                OptionalProvider$$ExternalSyntheticLambda0.m("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", (Throwable) e);
            }
        }
    }

    public final class FieldReflectionAdapter extends Adapter {
        public final ObjectConstructor constructor;

        public FieldReflectionAdapter(ObjectConstructor objectConstructor, FieldsData fieldsData) {
            super(fieldsData);
            this.constructor = objectConstructor;
        }

        @Override // com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object createAccumulator() {
            return this.constructor.construct();
        }

        @Override // com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object finalize(Object obj) {
            return obj;
        }

        @Override // com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final void readField(Object obj, JsonReader jsonReader, AnonymousClass2 anonymousClass2) {
            Field field = anonymousClass2.field;
            Object read = anonymousClass2.val$typeAdapter.read(jsonReader);
            if (read == null && anonymousClass2.val$isPrimitive) {
                return;
            }
            if (anonymousClass2.val$isStaticFinalField) {
                throw new JsonIOException("Cannot set value of 'static final' ".concat(ReflectionHelper.getAccessibleObjectDescription(field, false)));
            }
            field.set(obj, read);
        }
    }

    public final class FieldsData {
        public static final FieldsData EMPTY = new FieldsData(Collections.EMPTY_MAP, Collections.EMPTY_LIST);
        public final Map deserializedFields;
        public final List serializedFields;

        public FieldsData(Map map, List list) {
            this.deserializedFields = map;
            this.serializedFields = list;
        }
    }

    public final class RecordAdapter extends Adapter {
        public static final HashMap PRIMITIVE_DEFAULTS;
        public final HashMap componentIndices;
        public final Constructor constructor;
        public final Object[] constructorArgsDefaults;

        static {
            HashMap hashMap = new HashMap();
            hashMap.put(Byte.TYPE, (byte) 0);
            hashMap.put(Short.TYPE, (short) 0);
            hashMap.put(Integer.TYPE, 0);
            hashMap.put(Long.TYPE, 0L);
            hashMap.put(Float.TYPE, Float.valueOf(RecyclerView.DECELERATION_RATE));
            hashMap.put(Double.TYPE, Double.valueOf(0.0d));
            hashMap.put(Character.TYPE, (char) 0);
            hashMap.put(Boolean.TYPE, Boolean.FALSE);
            PRIMITIVE_DEFAULTS = hashMap;
        }

        public RecordAdapter(Class cls, FieldsData fieldsData) {
            super(fieldsData);
            this.componentIndices = new HashMap();
            ComparingOperation.DefaultImpls defaultImpls = ReflectionHelper.RECORD_HELPER;
            Constructor canonicalRecordConstructor = defaultImpls.getCanonicalRecordConstructor(cls);
            this.constructor = canonicalRecordConstructor;
            ReflectionHelper.makeAccessible(canonicalRecordConstructor);
            String[] recordComponentNames = defaultImpls.getRecordComponentNames(cls);
            for (int i = 0; i < recordComponentNames.length; i++) {
                this.componentIndices.put(recordComponentNames[i], Integer.valueOf(i));
            }
            Class<?>[] parameterTypes = this.constructor.getParameterTypes();
            this.constructorArgsDefaults = new Object[parameterTypes.length];
            for (int i2 = 0; i2 < parameterTypes.length; i2++) {
                this.constructorArgsDefaults[i2] = PRIMITIVE_DEFAULTS.get(parameterTypes[i2]);
            }
        }

        @Override // com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object createAccumulator() {
            return (Object[]) this.constructorArgsDefaults.clone();
        }

        @Override // com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object finalize(Object obj) {
            Object[] objArr = (Object[]) obj;
            Constructor constructor = this.constructor;
            try {
                return constructor.newInstance(objArr);
            } catch (IllegalAccessException e) {
                ComparingOperation.DefaultImpls defaultImpls = ReflectionHelper.RECORD_HELPER;
                OptionalProvider$$ExternalSyntheticLambda0.m("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", (Throwable) e);
                return null;
            } catch (IllegalArgumentException | InstantiationException e2) {
                throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(constructor) + "' with args " + Arrays.toString(objArr), e2);
            } catch (InvocationTargetException e3) {
                OptionalProvider$$ExternalSyntheticLambda0.m("Failed to invoke constructor '" + ReflectionHelper.constructorToString(constructor) + "' with args " + Arrays.toString(objArr), e3.getCause());
                return null;
            }
        }

        @Override // com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final void readField(Object obj, JsonReader jsonReader, AnonymousClass2 anonymousClass2) {
            Object[] objArr = (Object[]) obj;
            String str = anonymousClass2.fieldName;
            Integer num = (Integer) this.componentIndices.get(str);
            if (num == null) {
                a$$ExternalSyntheticBUOutline0.m$1(ReflectionHelper.constructorToString(this.constructor), "' for field with name '", str, "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.", "Could not find the index in the constructor '");
                return;
            }
            int intValue = num.intValue();
            Object read = anonymousClass2.val$typeAdapter.read(jsonReader);
            if (read != null || !anonymousClass2.val$isPrimitive) {
                objArr[intValue] = read;
            } else {
                StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("null is not allowed as value for record component '", str, "' of primitive type; at path ");
                m3m.append(jsonReader.getPath(false));
                throw new JsonParseException(m3m.toString());
            }
        }
    }

    public ReflectiveTypeAdapterFactory(VideoCapture.AnonymousClass3 anonymousClass3, int i, Excluder excluder, TypeAdapters.AnonymousClass29 anonymousClass29, ArrayList arrayList) {
        this.constructorConstructor = anonymousClass3;
        this.fieldNamingPolicy = i;
        this.excluder = excluder;
        this.jsonAdapterFactory = anonymousClass29;
        this.reflectionFilters = arrayList;
    }

    public static void createDuplicateFieldException(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + ReflectionHelper.fieldToString(field) + " and " + ReflectionHelper.fieldToString(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    @Override // com.nimbusds.jose.shaded.gson.TypeAdapterFactory
    public final TypeAdapter create(Gson gson, TypeToken typeToken) {
        Class cls = typeToken.rawType;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        ComparingOperation.DefaultImpls defaultImpls = ReflectionHelper.RECORD_HELPER;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new TypeAdapters.AnonymousClass1(2);
        }
        GsonTypes.getFilterResult(this.reflectionFilters);
        return ReflectionHelper.RECORD_HELPER.isRecord(cls) ? new RecordAdapter(cls, getBoundFields(gson, typeToken, cls, true)) : new FieldReflectionAdapter(this.constructorConstructor.get(typeToken, true), getBoundFields(gson, typeToken, cls, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010b  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final FieldsData getBoundFields(Gson gson, TypeToken typeToken, Class cls, boolean z) {
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
        AnonymousClass2 anonymousClass2;
        if (cls.isInterface()) {
            return FieldsData.EMPTY;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        TypeToken typeToken2 = typeToken;
        Class cls2 = cls;
        while (true) {
            Type type2 = typeToken2.f1030type;
            if (cls2 == Object.class) {
                return new FieldsData(linkedHashMap, new ArrayList(linkedHashMap2.values()));
            }
            Field[] declaredFields = cls2.getDeclaredFields();
            if (cls2 != cls && declaredFields.length > 0) {
                GsonTypes.getFilterResult(this.reflectionFilters);
            }
            int length = declaredFields.length;
            ?? r14 = 0;
            int i = 0;
            while (i < length) {
                Field field3 = declaredFields[i];
                boolean includeField = includeField(field3, true);
                boolean includeField2 = includeField(field3, r14);
                if (includeField || includeField2) {
                    if (!z) {
                        z2 = includeField2;
                    } else if (Modifier.isStatic(field3.getModifiers())) {
                        z2 = r14;
                    } else {
                        Method accessor = ReflectionHelper.RECORD_HELPER.getAccessor(cls2, field3);
                        ReflectionHelper.makeAccessible(accessor);
                        if (accessor.getAnnotation(SerializedName.class) != null && field3.getAnnotation(SerializedName.class) == null) {
                            throw new JsonIOException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("@SerializedName on ", ReflectionHelper.getAccessibleObjectDescription(accessor, r14), " is not supported"));
                        }
                        z2 = includeField2;
                        method = accessor;
                        if (method == null) {
                            ReflectionHelper.makeAccessible(field3);
                        }
                        Type resolve = GsonTypes.resolve(type2, cls2, field3.getGenericType(), new HashMap());
                        serializedName = (SerializedName) field3.getAnnotation(SerializedName.class);
                        if (serializedName != null) {
                            switch (this.fieldNamingPolicy) {
                                case 1:
                                    str = field3.getName();
                                    break;
                                case 2:
                                    str = SVG$Unit$EnumUnboxingLocalUtility._upperCaseFirstLetter(field3.getName());
                                    break;
                                case 3:
                                    str = SVG$Unit$EnumUnboxingLocalUtility._upperCaseFirstLetter(SVG$Unit$EnumUnboxingLocalUtility._separateCamelCase(field3.getName(), ' '));
                                    break;
                                case 4:
                                    str = SVG$Unit$EnumUnboxingLocalUtility._separateCamelCase(field3.getName(), '_').toUpperCase(Locale.ENGLISH);
                                    break;
                                case 5:
                                    str = SVG$Unit$EnumUnboxingLocalUtility._separateCamelCase(field3.getName(), '_').toLowerCase(Locale.ENGLISH);
                                    break;
                                case 6:
                                    str = SVG$Unit$EnumUnboxingLocalUtility._separateCamelCase(field3.getName(), '-').toLowerCase(Locale.ENGLISH);
                                    break;
                                default:
                                    str = SVG$Unit$EnumUnboxingLocalUtility._separateCamelCase(field3.getName(), '.').toLowerCase(Locale.ENGLISH);
                                    break;
                            }
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
                        TypeToken typeToken3 = new TypeToken(resolve);
                        Class cls3 = typeToken3.rawType;
                        boolean z5 = (cls3 == null && cls3.isPrimitive()) ? z3 : r14;
                        int modifiers = field3.getModifiers();
                        boolean z6 = (Modifier.isStatic(modifiers) || !Modifier.isFinal(modifiers)) ? r14 : z3;
                        jsonAdapter = (JsonAdapter) field3.getAnnotation(JsonAdapter.class);
                        if (jsonAdapter == null) {
                            field = field3;
                            z4 = z3;
                            list2 = list;
                            gson2 = gson;
                            typeAdapter = this.jsonAdapterFactory.getTypeAdapter(this.constructorConstructor, gson2, typeToken3, jsonAdapter, false);
                        } else {
                            gson2 = gson;
                            z4 = z3;
                            field = field3;
                            list2 = list;
                            typeAdapter = null;
                        }
                        boolean z7 = typeAdapter == null ? z4 : r14;
                        if (typeAdapter == null) {
                            typeAdapter = gson2.getAdapter(typeToken3);
                        }
                        AnonymousClass2 anonymousClass22 = new AnonymousClass2(str2, field, method, includeField ? typeAdapter : z7 ? typeAdapter : new EnumTypeAdapter(gson2, typeAdapter, typeToken3.f1030type), typeAdapter, z5, z6);
                        field2 = field;
                        if (z2) {
                            for (String str3 : list2) {
                                AnonymousClass2 anonymousClass23 = (AnonymousClass2) linkedHashMap.put(str3, anonymousClass22);
                                if (anonymousClass23 != null) {
                                    createDuplicateFieldException(cls, str3, anonymousClass23.field, field2);
                                    throw null;
                                }
                            }
                        }
                        if (includeField && (anonymousClass2 = (AnonymousClass2) linkedHashMap2.put(str2, anonymousClass22)) != null) {
                            createDuplicateFieldException(cls, str2, anonymousClass2.field, field2);
                            throw null;
                        }
                    }
                    method = null;
                    if (method == null) {
                    }
                    Type resolve2 = GsonTypes.resolve(type2, cls2, field3.getGenericType(), new HashMap());
                    serializedName = (SerializedName) field3.getAnnotation(SerializedName.class);
                    if (serializedName != null) {
                    }
                    if (asList.isEmpty()) {
                    }
                    str2 = (String) list.get(r14);
                    TypeToken typeToken32 = new TypeToken(resolve2);
                    Class cls32 = typeToken32.rawType;
                    if (cls32 == null) {
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
                    if (includeField) {
                    }
                    AnonymousClass2 anonymousClass222 = new AnonymousClass2(str2, field, method, includeField ? typeAdapter : z7 ? typeAdapter : new EnumTypeAdapter(gson2, typeAdapter, typeToken32.f1030type), typeAdapter, z5, z6);
                    field2 = field;
                    if (z2) {
                    }
                    if (includeField) {
                        createDuplicateFieldException(cls, str2, anonymousClass2.field, field2);
                        throw null;
                    }
                    continue;
                }
                i++;
                r14 = 0;
            }
            TypeToken typeToken4 = new TypeToken(GsonTypes.resolve(type2, cls2, cls2.getGenericSuperclass(), new HashMap()));
            cls2 = typeToken4.rawType;
            typeToken2 = typeToken4;
        }
    }

    public final boolean includeField(Field field, boolean z) {
        boolean z2;
        Excluder excluder = this.excluder;
        excluder.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || excluder.excludeClass(field.getType(), z)) {
            z2 = true;
        } else {
            List list = z ? excluder.serializationStrategies : excluder.deserializationStrategies;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw Recorder$$ExternalSyntheticOutline2.m(it);
                }
            }
            z2 = false;
        }
        return !z2;
    }
}
