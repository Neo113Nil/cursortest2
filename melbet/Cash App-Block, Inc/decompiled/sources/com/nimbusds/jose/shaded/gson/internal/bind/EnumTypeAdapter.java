package com.nimbusds.jose.shaded.gson.internal.bind;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.mlkit.vision.text.zzc;
import com.nimbusds.jose.shaded.gson.Gson;
import com.nimbusds.jose.shaded.gson.JsonSyntaxException;
import com.nimbusds.jose.shaded.gson.TypeAdapter;
import com.nimbusds.jose.shaded.gson.TypeAdapterFactory;
import com.nimbusds.jose.shaded.gson.annotations.SerializedName;
import com.nimbusds.jose.shaded.gson.internal.GsonTypes;
import com.nimbusds.jose.shaded.gson.internal.ObjectConstructor;
import com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.nimbusds.jose.shaded.gson.internal.sql.SqlDateTypeAdapter;
import com.nimbusds.jose.shaded.gson.reflect.TypeToken;
import com.nimbusds.jose.shaded.gson.stream.JsonReader;
import com.nimbusds.jose.shaded.gson.stream.JsonWriter;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class EnumTypeAdapter extends TypeAdapter {
    public static final AnonymousClass1 FACTORY = new AnonymousClass1(0);
    public final /* synthetic */ int $r8$classId;
    public final Object constantToName;
    public final Object nameToConstant;
    public final Object stringToConstant;

    /* renamed from: com.nimbusds.jose.shaded.gson.internal.bind.EnumTypeAdapter$1, reason: invalid class name */
    public final class AnonymousClass1 implements TypeAdapterFactory {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ AnonymousClass1(int i) {
            this.$r8$classId = i;
        }

        @Override // com.nimbusds.jose.shaded.gson.TypeAdapterFactory
        public final TypeAdapter create(Gson gson, TypeToken typeToken) {
            switch (this.$r8$classId) {
                case 0:
                    Class cls = typeToken.rawType;
                    if (!Enum.class.isAssignableFrom(cls) || cls == Enum.class) {
                        return null;
                    }
                    if (!cls.isEnum()) {
                        cls = cls.getSuperclass();
                    }
                    return new EnumTypeAdapter(cls);
                case 1:
                    Type type2 = typeToken.f1030type;
                    boolean z = type2 instanceof GenericArrayType;
                    if (!z && (!(type2 instanceof Class) || !((Class) type2).isArray())) {
                        return null;
                    }
                    Type genericComponentType = z ? ((GenericArrayType) type2).getGenericComponentType() : ((Class) type2).getComponentType();
                    return new ArrayTypeAdapter(gson, gson.getAdapter(new TypeToken(genericComponentType)), GsonTypes.getRawType(genericComponentType));
                case 2:
                    if (typeToken.rawType == Date.class) {
                        return new ArrayTypeAdapter(DefaultDateTypeAdapter$DateType.DATE, 2, 2);
                    }
                    return null;
                case 3:
                    throw new AssertionError("Factory should not be used");
                case 4:
                    if (typeToken.rawType == java.sql.Date.class) {
                        return new SqlDateTypeAdapter(0);
                    }
                    return null;
                case 5:
                    if (typeToken.rawType == Time.class) {
                        return new SqlDateTypeAdapter(1);
                    }
                    return null;
                default:
                    if (typeToken.rawType != Timestamp.class) {
                        return null;
                    }
                    gson.getClass();
                    return new SqlDateTypeAdapter(gson.getAdapter(new TypeToken(Date.class)));
            }
        }

        public String toString() {
            switch (this.$r8$classId) {
                case 2:
                    return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
                default:
                    return super.toString();
            }
        }
    }

    public EnumTypeAdapter(Class cls) {
        this.$r8$classId = 0;
        this.nameToConstant = new HashMap();
        this.stringToConstant = new HashMap();
        this.constantToName = new HashMap();
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i] = field;
                    i++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r5 = (Enum) field2.get(null);
                String name = r5.name();
                String str = r5.toString();
                SerializedName serializedName = (SerializedName) field2.getAnnotation(SerializedName.class);
                if (serializedName != null) {
                    name = serializedName.value();
                    for (String str2 : serializedName.alternate()) {
                        ((HashMap) this.nameToConstant).put(str2, r5);
                    }
                }
                ((HashMap) this.nameToConstant).put(name, r5);
                ((HashMap) this.stringToConstant).put(str, r5);
                ((HashMap) this.constantToName).put(r5, name);
            }
        } catch (IllegalAccessException e) {
            a$$ExternalSyntheticBUOutline0.m$1(e);
            throw null;
        }
    }

    @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
    public final Object read(JsonReader jsonReader) {
        Map map = null;
        switch (this.$r8$classId) {
            case 0:
                if (jsonReader.peek() == 9) {
                    jsonReader.nextNull();
                    return null;
                }
                String nextString = jsonReader.nextString();
                Enum r1 = (Enum) ((HashMap) this.nameToConstant).get(nextString);
                return r1 == null ? (Enum) ((HashMap) this.stringToConstant).get(nextString) : r1;
            case 1:
                int peek = jsonReader.peek();
                if (peek == 9) {
                    jsonReader.nextNull();
                } else {
                    map = (Map) ((ObjectConstructor) this.constantToName).construct();
                    if (peek == 1) {
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            jsonReader.beginArray();
                            Object read = ((TypeAdapter) ((EnumTypeAdapter) this.nameToConstant).stringToConstant).read(jsonReader);
                            if (map.put(read, ((TypeAdapter) ((EnumTypeAdapter) this.stringToConstant).stringToConstant).read(jsonReader)) != null) {
                                throw new JsonSyntaxException(Boxes$$ExternalSyntheticOutline1.m("duplicate key: ", read));
                            }
                            jsonReader.endArray();
                        }
                        jsonReader.endArray();
                    } else {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            zzc.INSTANCE.getClass();
                            int i = jsonReader.peeked;
                            if (i == 0) {
                                i = jsonReader.doPeek();
                            }
                            if (i == 13) {
                                jsonReader.peeked = 9;
                            } else if (i == 12) {
                                jsonReader.peeked = 8;
                            } else {
                                if (i != 14) {
                                    throw jsonReader.unexpectedTokenError("a name");
                                }
                                jsonReader.peeked = 10;
                            }
                            Object read2 = ((TypeAdapter) ((EnumTypeAdapter) this.nameToConstant).stringToConstant).read(jsonReader);
                            if (map.put(read2, ((TypeAdapter) ((EnumTypeAdapter) this.stringToConstant).stringToConstant).read(jsonReader)) != null) {
                                throw new JsonSyntaxException(Boxes$$ExternalSyntheticOutline1.m("duplicate key: ", read2));
                            }
                        }
                        jsonReader.endObject();
                    }
                }
                return map;
            default:
                return ((TypeAdapter) this.stringToConstant).read(jsonReader);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        if ((r0 instanceof com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter) != false) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.reflect.Type] */
    @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void write(JsonWriter jsonWriter, Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.constantToName;
        Object obj3 = this.stringToConstant;
        switch (i) {
            case 0:
                Enum r5 = (Enum) obj;
                jsonWriter.value(r5 == null ? null : (String) ((HashMap) obj2).get(r5));
                break;
            case 1:
                Map map = (Map) obj;
                EnumTypeAdapter enumTypeAdapter = (EnumTypeAdapter) obj3;
                if (map == null) {
                    jsonWriter.nullValue();
                    break;
                } else {
                    jsonWriter.beginObject();
                    for (Map.Entry entry : map.entrySet()) {
                        jsonWriter.name(String.valueOf(entry.getKey()));
                        enumTypeAdapter.write(jsonWriter, entry.getValue());
                    }
                    jsonWriter.endObject();
                    break;
                }
            default:
                TypeAdapter typeAdapter = (TypeAdapter) obj3;
                ?? r1 = (Type) obj2;
                Class<?> cls = (obj == null || !((r1 instanceof Class) || (r1 instanceof TypeVariable))) ? r1 : obj.getClass();
                if (cls != r1) {
                    TypeAdapter adapter = ((Gson) this.nameToConstant).getAdapter(new TypeToken(cls));
                    if (adapter instanceof ReflectiveTypeAdapterFactory.Adapter) {
                        TypeAdapter typeAdapter2 = typeAdapter;
                        while (typeAdapter2 instanceof Gson.FutureTypeAdapter) {
                            TypeAdapter typeAdapter3 = ((Gson.FutureTypeAdapter) typeAdapter2).delegate;
                            if (typeAdapter3 == null) {
                                a$$ExternalSyntheticBUOutline0.m$1("Adapter for type with cyclic dependency has been used before dependency has been resolved");
                                break;
                            } else if (typeAdapter3 == typeAdapter2) {
                                break;
                            } else {
                                typeAdapter2 = typeAdapter3;
                            }
                        }
                    }
                    typeAdapter = adapter;
                }
                typeAdapter.write(jsonWriter, obj);
                break;
        }
    }

    public EnumTypeAdapter(MapTypeAdapterFactory mapTypeAdapterFactory, EnumTypeAdapter enumTypeAdapter, EnumTypeAdapter enumTypeAdapter2, ObjectConstructor objectConstructor) {
        this.$r8$classId = 1;
        this.nameToConstant = enumTypeAdapter;
        this.stringToConstant = enumTypeAdapter2;
        this.constantToName = objectConstructor;
    }

    public EnumTypeAdapter(Gson gson, TypeAdapter typeAdapter, Type type2) {
        this.$r8$classId = 2;
        this.nameToConstant = gson;
        this.stringToConstant = typeAdapter;
        this.constantToName = type2;
    }
}
