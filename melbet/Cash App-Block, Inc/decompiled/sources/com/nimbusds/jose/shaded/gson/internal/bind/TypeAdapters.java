package com.nimbusds.jose.shaded.gson.internal.bind;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.VideoCapture;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.nimbusds.jose.shaded.gson.Gson;
import com.nimbusds.jose.shaded.gson.JsonArray;
import com.nimbusds.jose.shaded.gson.JsonElement;
import com.nimbusds.jose.shaded.gson.JsonIOException;
import com.nimbusds.jose.shaded.gson.JsonNull;
import com.nimbusds.jose.shaded.gson.JsonObject;
import com.nimbusds.jose.shaded.gson.JsonPrimitive;
import com.nimbusds.jose.shaded.gson.JsonSyntaxException;
import com.nimbusds.jose.shaded.gson.TypeAdapter;
import com.nimbusds.jose.shaded.gson.TypeAdapterFactory;
import com.nimbusds.jose.shaded.gson.annotations.JsonAdapter;
import com.nimbusds.jose.shaded.gson.internal.GsonTypes;
import com.nimbusds.jose.shaded.gson.internal.LazilyParsedNumber;
import com.nimbusds.jose.shaded.gson.internal.LinkedTreeMap;
import com.nimbusds.jose.shaded.gson.internal.bind.EnumTypeAdapter;
import com.nimbusds.jose.shaded.gson.reflect.TypeToken;
import com.nimbusds.jose.shaded.gson.stream.JsonReader;
import com.nimbusds.jose.shaded.gson.stream.JsonWriter;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.LinkedHashTreeMap;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.slf4j.Marker;

/* loaded from: classes5.dex */
public abstract class TypeAdapters {
    public static final AnonymousClass29 ATOMIC_BOOLEAN_FACTORY;
    public static final AnonymousClass29 ATOMIC_INTEGER_ARRAY_FACTORY;
    public static final AnonymousClass29 ATOMIC_INTEGER_FACTORY;
    public static final AnonymousClass1 BIG_DECIMAL;
    public static final AnonymousClass1 BIG_INTEGER;
    public static final AnonymousClass29 BIT_SET_FACTORY;
    public static final AnonymousClass1 BOOLEAN_AS_STRING;
    public static final AnonymousClass30 BOOLEAN_FACTORY;
    public static final AnonymousClass30 BYTE_FACTORY;
    public static final AnonymousClass31 CALENDAR_FACTORY;
    public static final AnonymousClass30 CHARACTER_FACTORY;
    public static final AnonymousClass29 CLASS_FACTORY;
    public static final AnonymousClass29 CURRENCY_FACTORY;
    public static final EnumTypeAdapter.AnonymousClass1 ENUM_FACTORY;
    public static final AnonymousClass29 INET_ADDRESS_FACTORY;
    public static final AnonymousClass30 INTEGER_FACTORY;
    public static final AnonymousClass1 JSON_ELEMENT;
    public static final AnonymousClass29 JSON_ELEMENT_FACTORY;
    public static final AnonymousClass1 LAZILY_PARSED_NUMBER;
    public static final AnonymousClass29 LOCALE_FACTORY;
    public static final AnonymousClass1 LONG;
    public static final AnonymousClass30 SHORT_FACTORY;
    public static final AnonymousClass29 STRING_BUFFER_FACTORY;
    public static final AnonymousClass29 STRING_BUILDER_FACTORY;
    public static final AnonymousClass29 STRING_FACTORY;
    public static final AnonymousClass29 URI_FACTORY;
    public static final AnonymousClass29 URL_FACTORY;
    public static final AnonymousClass29 UUID_FACTORY;

    /* renamed from: com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters$30, reason: invalid class name */
    public final class AnonymousClass30 implements TypeAdapterFactory {
        public final /* synthetic */ Class val$boxed;
        public final /* synthetic */ TypeAdapter val$typeAdapter;
        public final /* synthetic */ Class val$unboxed;

        public AnonymousClass30(Class cls, Class cls2, TypeAdapter typeAdapter) {
            this.val$unboxed = cls;
            this.val$boxed = cls2;
            this.val$typeAdapter = typeAdapter;
        }

        @Override // com.nimbusds.jose.shaded.gson.TypeAdapterFactory
        public final TypeAdapter create(Gson gson, TypeToken typeToken) {
            Class cls = typeToken.rawType;
            if (cls == this.val$unboxed || cls == this.val$boxed) {
                return this.val$typeAdapter;
            }
            return null;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Factory[type=");
            Boxes$$ExternalSyntheticOutline1.m(this.val$boxed, sb, Marker.ANY_NON_NULL_MARKER);
            Boxes$$ExternalSyntheticOutline1.m(this.val$unboxed, sb, ",adapter=");
            sb.append(this.val$typeAdapter);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters$31, reason: invalid class name */
    public final class AnonymousClass31 implements TypeAdapterFactory {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ TypeAdapter val$typeAdapter;

        public /* synthetic */ AnonymousClass31(TypeAdapter typeAdapter, int i) {
            this.$r8$classId = i;
            this.val$typeAdapter = typeAdapter;
        }

        @Override // com.nimbusds.jose.shaded.gson.TypeAdapterFactory
        public final TypeAdapter create(Gson gson, TypeToken typeToken) {
            int i = this.$r8$classId;
            TypeAdapter typeAdapter = this.val$typeAdapter;
            switch (i) {
                case 0:
                    Class cls = typeToken.rawType;
                    if (cls == Calendar.class || cls == GregorianCalendar.class) {
                        return (AnonymousClass1) typeAdapter;
                    }
                    return null;
                default:
                    if (typeToken.rawType == Number.class) {
                        return (NumberTypeAdapter) typeAdapter;
                    }
                    return null;
            }
        }

        public String toString() {
            switch (this.$r8$classId) {
                case 0:
                    return "Factory[type=" + Calendar.class.getName() + Marker.ANY_NON_NULL_MARKER + GregorianCalendar.class.getName() + ",adapter=" + ((AnonymousClass1) this.val$typeAdapter) + "]";
                default:
                    return super.toString();
            }
        }
    }

    static {
        int i = 0;
        CLASS_FACTORY = new AnonymousClass29(Class.class, new AnonymousClass1(i).nullSafe(), i);
        BIT_SET_FACTORY = new AnonymousClass29(BitSet.class, new AnonymousClass1(21).nullSafe(), i);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(22);
        BOOLEAN_AS_STRING = new AnonymousClass1(23);
        BOOLEAN_FACTORY = new AnonymousClass30(Boolean.TYPE, Boolean.class, anonymousClass1);
        BYTE_FACTORY = new AnonymousClass30(Byte.TYPE, Byte.class, new AnonymousClass1(24));
        SHORT_FACTORY = new AnonymousClass30(Short.TYPE, Short.class, new AnonymousClass1(25));
        INTEGER_FACTORY = new AnonymousClass30(Integer.TYPE, Integer.class, new AnonymousClass1(26));
        ATOMIC_INTEGER_FACTORY = new AnonymousClass29(AtomicInteger.class, new AnonymousClass1(27).nullSafe(), i);
        ATOMIC_BOOLEAN_FACTORY = new AnonymousClass29(AtomicBoolean.class, new AnonymousClass1(28).nullSafe(), i);
        ATOMIC_INTEGER_ARRAY_FACTORY = new AnonymousClass29(AtomicIntegerArray.class, new AnonymousClass1(3).nullSafe(), i);
        LONG = new AnonymousClass1(4);
        CHARACTER_FACTORY = new AnonymousClass30(Character.TYPE, Character.class, new AnonymousClass1(7));
        AnonymousClass1 anonymousClass12 = new AnonymousClass1(8);
        BIG_DECIMAL = new AnonymousClass1(9);
        BIG_INTEGER = new AnonymousClass1(10);
        LAZILY_PARSED_NUMBER = new AnonymousClass1(11);
        STRING_FACTORY = new AnonymousClass29(String.class, anonymousClass12, i);
        STRING_BUILDER_FACTORY = new AnonymousClass29(StringBuilder.class, new AnonymousClass1(12), i);
        STRING_BUFFER_FACTORY = new AnonymousClass29(StringBuffer.class, new AnonymousClass1(13), i);
        URL_FACTORY = new AnonymousClass29(URL.class, new AnonymousClass1(14), i);
        URI_FACTORY = new AnonymousClass29(URI.class, new AnonymousClass1(15), i);
        int i2 = 1;
        INET_ADDRESS_FACTORY = new AnonymousClass29(InetAddress.class, new AnonymousClass1(16), i2);
        UUID_FACTORY = new AnonymousClass29(UUID.class, new AnonymousClass1(17), i);
        CURRENCY_FACTORY = new AnonymousClass29(Currency.class, new AnonymousClass1(18).nullSafe(), i);
        CALENDAR_FACTORY = new AnonymousClass31(new AnonymousClass1(19), i);
        LOCALE_FACTORY = new AnonymousClass29(Locale.class, new AnonymousClass1(20), i);
        AnonymousClass1 anonymousClass13 = AnonymousClass1.ADAPTER;
        JSON_ELEMENT = anonymousClass13;
        JSON_ELEMENT_FACTORY = new AnonymousClass29(JsonElement.class, anonymousClass13, i2);
        ENUM_FACTORY = EnumTypeAdapter.FACTORY;
    }

    /* renamed from: com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters$29, reason: invalid class name */
    public final class AnonymousClass29 implements TypeAdapterFactory {
        public static final EnumTypeAdapter.AnonymousClass1 TREE_TYPE_CLASS_DUMMY_FACTORY = new EnumTypeAdapter.AnonymousClass1(3);
        public final /* synthetic */ int $r8$classId;
        public final Object val$type;
        public final Object val$typeAdapter;

        public AnonymousClass29(VideoCapture.AnonymousClass3 anonymousClass3) {
            this.$r8$classId = 2;
            this.val$type = anonymousClass3;
            this.val$typeAdapter = new ConcurrentHashMap();
        }

        @Override // com.nimbusds.jose.shaded.gson.TypeAdapterFactory
        public final TypeAdapter create(Gson gson, TypeToken typeToken) {
            int i = this.$r8$classId;
            Object obj = this.val$type;
            switch (i) {
                case 0:
                    if (typeToken.rawType == ((Class) obj)) {
                        return (TypeAdapter) this.val$typeAdapter;
                    }
                    return null;
                case 1:
                    Class<?> cls = typeToken.rawType;
                    if (((Class) obj).isAssignableFrom(cls)) {
                        return new ArrayTypeAdapter(3, this, cls);
                    }
                    return null;
                default:
                    JsonAdapter jsonAdapter = (JsonAdapter) typeToken.rawType.getAnnotation(JsonAdapter.class);
                    if (jsonAdapter == null) {
                        return null;
                    }
                    return getTypeAdapter((VideoCapture.AnonymousClass3) obj, gson, typeToken, jsonAdapter, true);
            }
        }

        public TypeAdapter getTypeAdapter(VideoCapture.AnonymousClass3 anonymousClass3, Gson gson, TypeToken typeToken, JsonAdapter jsonAdapter, boolean z) {
            TypeAdapter create;
            Object construct = anonymousClass3.get(new TypeToken(jsonAdapter.value()), true).construct();
            boolean nullSafe = jsonAdapter.nullSafe();
            if (construct instanceof TypeAdapter) {
                create = (TypeAdapter) construct;
            } else {
                if (!(construct instanceof TypeAdapterFactory)) {
                    Drop$$ExternalSyntheticBUOutline0.m(construct.getClass().getName(), " as a @JsonAdapter for ", GsonTypes.typeToString(typeToken.f1030type), ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.", "Invalid attempt to bind an instance of ");
                    return null;
                }
                TypeAdapterFactory typeAdapterFactory = (TypeAdapterFactory) construct;
                if (z) {
                    TypeAdapterFactory typeAdapterFactory2 = (TypeAdapterFactory) ((ConcurrentHashMap) this.val$typeAdapter).putIfAbsent(typeToken.rawType, typeAdapterFactory);
                    if (typeAdapterFactory2 != null) {
                        typeAdapterFactory = typeAdapterFactory2;
                    }
                }
                create = typeAdapterFactory.create(gson, typeToken);
            }
            return (create == null || !nullSafe) ? create : create.nullSafe();
        }

        public String toString() {
            int i = this.$r8$classId;
            Object obj = this.val$typeAdapter;
            Object obj2 = this.val$type;
            switch (i) {
                case 0:
                    StringBuilder sb = new StringBuilder("Factory[type=");
                    Boxes$$ExternalSyntheticOutline1.m((Class) obj2, sb, ",adapter=");
                    sb.append((TypeAdapter) obj);
                    sb.append("]");
                    return sb.toString();
                case 1:
                    StringBuilder sb2 = new StringBuilder("Factory[typeHierarchy=");
                    Boxes$$ExternalSyntheticOutline1.m((Class) obj2, sb2, ",adapter=");
                    sb2.append((TypeAdapter) obj);
                    sb2.append("]");
                    return sb2.toString();
                default:
                    return super.toString();
            }
        }

        public /* synthetic */ AnonymousClass29(Class cls, TypeAdapter typeAdapter, int i) {
            this.$r8$classId = i;
            this.val$type = cls;
            this.val$typeAdapter = typeAdapter;
        }
    }

    /* renamed from: com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters$1, reason: invalid class name */
    public final class AnonymousClass1 extends TypeAdapter {
        public static final AnonymousClass1 ADAPTER = new AnonymousClass1(1);
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ AnonymousClass1(int i) {
            this.$r8$classId = i;
        }

        public static JsonElement readTerminal(int i, JsonReader jsonReader) {
            int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i);
            if (ordinal == 5) {
                return new JsonPrimitive(jsonReader.nextString());
            }
            if (ordinal == 6) {
                return new JsonPrimitive(new LazilyParsedNumber(jsonReader.nextString()));
            }
            if (ordinal == 7) {
                return new JsonPrimitive(Boolean.valueOf(jsonReader.nextBoolean()));
            }
            if (ordinal == 8) {
                jsonReader.nextNull();
                return JsonNull.INSTANCE;
            }
            a$$ExternalSyntheticBUOutline0.m$1("Unexpected token: ".concat(SVG$Unit$EnumUnboxingLocalUtility.stringValueOf(i)));
            return null;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:154:0x01fe, code lost:
        
            if (r0.equals("month") == false) goto L112;
         */
        @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object read(JsonReader jsonReader) {
            JsonElement jsonArray;
            JsonElement jsonArray2;
            boolean z;
            switch (this.$r8$classId) {
                case 0:
                    throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee ".concat("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("java-lang-class-unsupported")));
                case 1:
                    int peek = jsonReader.peek();
                    int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(peek);
                    if (ordinal == 0) {
                        jsonReader.beginArray();
                        jsonArray = new JsonArray();
                    } else if (ordinal != 2) {
                        jsonArray = null;
                    } else {
                        jsonReader.beginObject();
                        jsonArray = new JsonObject();
                    }
                    if (jsonArray == null) {
                        return readTerminal(peek, jsonReader);
                    }
                    ArrayDeque arrayDeque = new ArrayDeque();
                    while (true) {
                        if (jsonReader.hasNext()) {
                            String nextName = jsonArray instanceof JsonObject ? jsonReader.nextName() : null;
                            int peek2 = jsonReader.peek();
                            int ordinal2 = CameraSelector$$ExternalSyntheticOutline0.ordinal(peek2);
                            if (ordinal2 == 0) {
                                jsonReader.beginArray();
                                jsonArray2 = new JsonArray();
                            } else if (ordinal2 != 2) {
                                jsonArray2 = null;
                            } else {
                                jsonReader.beginObject();
                                jsonArray2 = new JsonObject();
                            }
                            boolean z2 = jsonArray2 != null;
                            if (jsonArray2 == null) {
                                jsonArray2 = readTerminal(peek2, jsonReader);
                            }
                            if (jsonArray instanceof JsonArray) {
                                ((JsonArray) jsonArray).elements.add(jsonArray2);
                            } else {
                                ((JsonObject) jsonArray).members.put(nextName, jsonArray2);
                            }
                            if (z2) {
                                arrayDeque.addLast(jsonArray);
                                jsonArray = jsonArray2;
                            }
                        } else {
                            if (jsonArray instanceof JsonArray) {
                                jsonReader.endArray();
                            } else {
                                jsonReader.endObject();
                            }
                            if (arrayDeque.isEmpty()) {
                                return jsonArray;
                            }
                            jsonArray = (JsonElement) arrayDeque.removeLast();
                        }
                    }
                case 2:
                    jsonReader.skipValue();
                    return null;
                case 3:
                    ArrayList arrayList = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        try {
                            arrayList.add(Integer.valueOf(jsonReader.nextInt()));
                        } catch (NumberFormatException e) {
                            throw new JsonSyntaxException(e);
                        }
                    }
                    jsonReader.endArray();
                    int size = arrayList.size();
                    AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                    for (int i = 0; i < size; i++) {
                        atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
                    }
                    return atomicIntegerArray;
                case 4:
                    if (jsonReader.peek() == 9) {
                        jsonReader.nextNull();
                        return null;
                    }
                    try {
                        return Long.valueOf(jsonReader.nextLong());
                    } catch (NumberFormatException e2) {
                        throw new JsonSyntaxException(e2);
                    }
                case 5:
                    if (jsonReader.peek() != 9) {
                        return Float.valueOf((float) jsonReader.nextDouble());
                    }
                    jsonReader.nextNull();
                    return null;
                case 6:
                    if (jsonReader.peek() != 9) {
                        return Double.valueOf(jsonReader.nextDouble());
                    }
                    jsonReader.nextNull();
                    return null;
                case 7:
                    if (jsonReader.peek() == 9) {
                        jsonReader.nextNull();
                        return null;
                    }
                    String nextString = jsonReader.nextString();
                    if (nextString.length() == 1) {
                        return Character.valueOf(nextString.charAt(0));
                    }
                    StringBuilder m3m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Expecting character, got: ", nextString, "; at ");
                    m3m.append(jsonReader.getPath(true));
                    throw new JsonSyntaxException(m3m.toString());
                case 8:
                    int peek3 = jsonReader.peek();
                    if (peek3 != 9) {
                        return peek3 == 8 ? Boolean.toString(jsonReader.nextBoolean()) : jsonReader.nextString();
                    }
                    jsonReader.nextNull();
                    return null;
                case 9:
                    if (jsonReader.peek() == 9) {
                        jsonReader.nextNull();
                        return null;
                    }
                    String nextString2 = jsonReader.nextString();
                    try {
                        return GsonTypes.parseBigDecimal(nextString2);
                    } catch (NumberFormatException e3) {
                        StringBuilder m3m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Failed parsing '", nextString2, "' as BigDecimal; at path ");
                        m3m2.append(jsonReader.getPath(true));
                        throw new JsonSyntaxException(m3m2.toString(), e3);
                    }
                case 10:
                    if (jsonReader.peek() == 9) {
                        jsonReader.nextNull();
                        return null;
                    }
                    String nextString3 = jsonReader.nextString();
                    try {
                        GsonTypes.checkNumberStringLength(nextString3);
                        return new BigInteger(nextString3);
                    } catch (NumberFormatException e4) {
                        StringBuilder m3m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Failed parsing '", nextString3, "' as BigInteger; at path ");
                        m3m3.append(jsonReader.getPath(true));
                        throw new JsonSyntaxException(m3m3.toString(), e4);
                    }
                case 11:
                    if (jsonReader.peek() != 9) {
                        return new LazilyParsedNumber(jsonReader.nextString());
                    }
                    jsonReader.nextNull();
                    return null;
                case 12:
                    if (jsonReader.peek() != 9) {
                        return new StringBuilder(jsonReader.nextString());
                    }
                    jsonReader.nextNull();
                    return null;
                case 13:
                    if (jsonReader.peek() != 9) {
                        return new StringBuffer(jsonReader.nextString());
                    }
                    jsonReader.nextNull();
                    return null;
                case 14:
                    if (jsonReader.peek() == 9) {
                        jsonReader.nextNull();
                        return null;
                    }
                    String nextString4 = jsonReader.nextString();
                    if (nextString4.equals("null")) {
                        return null;
                    }
                    return new URL(nextString4);
                case 15:
                    if (jsonReader.peek() == 9) {
                        jsonReader.nextNull();
                        return null;
                    }
                    try {
                        String nextString5 = jsonReader.nextString();
                        if (nextString5.equals("null")) {
                            return null;
                        }
                        return new URI(nextString5);
                    } catch (URISyntaxException e5) {
                        throw new JsonIOException(e5);
                    }
                case 16:
                    if (jsonReader.peek() != 9) {
                        return InetAddress.getByName(jsonReader.nextString());
                    }
                    jsonReader.nextNull();
                    return null;
                case 17:
                    if (jsonReader.peek() == 9) {
                        jsonReader.nextNull();
                        return null;
                    }
                    String nextString6 = jsonReader.nextString();
                    try {
                        return UUID.fromString(nextString6);
                    } catch (IllegalArgumentException e6) {
                        StringBuilder m3m4 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Failed parsing '", nextString6, "' as UUID; at path ");
                        m3m4.append(jsonReader.getPath(true));
                        throw new JsonSyntaxException(m3m4.toString(), e6);
                    }
                case 18:
                    String nextString7 = jsonReader.nextString();
                    try {
                        return Currency.getInstance(nextString7);
                    } catch (IllegalArgumentException e7) {
                        StringBuilder m3m5 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("Failed parsing '", nextString7, "' as Currency; at path ");
                        m3m5.append(jsonReader.getPath(true));
                        throw new JsonSyntaxException(m3m5.toString(), e7);
                    }
                case 19:
                    if (jsonReader.peek() == 9) {
                        jsonReader.nextNull();
                        return null;
                    }
                    jsonReader.beginObject();
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    int i5 = 0;
                    int i6 = 0;
                    int i7 = 0;
                    while (true) {
                        char c = 4;
                        if (jsonReader.peek() == 4) {
                            jsonReader.endObject();
                            return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
                        }
                        String nextName2 = jsonReader.nextName();
                        int nextInt = jsonReader.nextInt();
                        switch (nextName2.hashCode()) {
                            case -1181204563:
                                if (nextName2.equals("dayOfMonth")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -1074026988:
                                if (nextName2.equals("minute")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case -906279820:
                                if (nextName2.equals("second")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 3704893:
                                if (nextName2.equals("year")) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 104080000:
                                break;
                            case 985252545:
                                if (nextName2.equals("hourOfDay")) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                                i4 = nextInt;
                                break;
                            case 1:
                                i6 = nextInt;
                                break;
                            case 2:
                                i7 = nextInt;
                                break;
                            case 3:
                                i2 = nextInt;
                                break;
                            case 4:
                                i3 = nextInt;
                                break;
                            case 5:
                                i5 = nextInt;
                                break;
                        }
                    }
                    break;
                case 20:
                    if (jsonReader.peek() == 9) {
                        jsonReader.nextNull();
                        return null;
                    }
                    StringTokenizer stringTokenizer = new StringTokenizer(jsonReader.nextString(), "_");
                    String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                    String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                    String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                    return (nextToken2 == null && nextToken3 == null) ? new Locale(nextToken) : nextToken3 == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, nextToken3);
                case 21:
                    BitSet bitSet = new BitSet();
                    jsonReader.beginArray();
                    int peek4 = jsonReader.peek();
                    int i8 = 0;
                    while (peek4 != 2) {
                        int ordinal3 = CameraSelector$$ExternalSyntheticOutline0.ordinal(peek4);
                        if (ordinal3 == 5 || ordinal3 == 6) {
                            int nextInt2 = jsonReader.nextInt();
                            if (nextInt2 == 0) {
                                z = false;
                            } else {
                                if (nextInt2 != 1) {
                                    StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(nextInt2, "Invalid bitset value ", ", expected 0 or 1; at path ");
                                    m2m.append(jsonReader.getPath(true));
                                    throw new JsonSyntaxException(m2m.toString());
                                }
                                z = true;
                            }
                        } else {
                            if (ordinal3 != 7) {
                                throw new JsonSyntaxException("Invalid bitset value type: " + SVG$Unit$EnumUnboxingLocalUtility.stringValueOf(peek4) + "; at path " + jsonReader.getPath(false));
                            }
                            z = jsonReader.nextBoolean();
                        }
                        if (z) {
                            bitSet.set(i8);
                        }
                        i8++;
                        peek4 = jsonReader.peek();
                    }
                    jsonReader.endArray();
                    return bitSet;
                case 22:
                    int peek5 = jsonReader.peek();
                    if (peek5 != 9) {
                        return peek5 == 6 ? Boolean.valueOf(Boolean.parseBoolean(jsonReader.nextString())) : Boolean.valueOf(jsonReader.nextBoolean());
                    }
                    jsonReader.nextNull();
                    return null;
                case 23:
                    if (jsonReader.peek() != 9) {
                        return Boolean.valueOf(jsonReader.nextString());
                    }
                    jsonReader.nextNull();
                    return null;
                case 24:
                    if (jsonReader.peek() == 9) {
                        jsonReader.nextNull();
                        return null;
                    }
                    try {
                        int nextInt3 = jsonReader.nextInt();
                        if (nextInt3 <= 255 && nextInt3 >= -128) {
                            return Byte.valueOf((byte) nextInt3);
                        }
                        StringBuilder m2m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(nextInt3, "Lossy conversion from ", " to byte; at path ");
                        m2m2.append(jsonReader.getPath(true));
                        throw new JsonSyntaxException(m2m2.toString());
                    } catch (NumberFormatException e8) {
                        throw new JsonSyntaxException(e8);
                    }
                case 25:
                    if (jsonReader.peek() == 9) {
                        jsonReader.nextNull();
                        return null;
                    }
                    try {
                        int nextInt4 = jsonReader.nextInt();
                        if (nextInt4 <= 65535 && nextInt4 >= -32768) {
                            return Short.valueOf((short) nextInt4);
                        }
                        StringBuilder m2m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(nextInt4, "Lossy conversion from ", " to short; at path ");
                        m2m3.append(jsonReader.getPath(true));
                        throw new JsonSyntaxException(m2m3.toString());
                    } catch (NumberFormatException e9) {
                        throw new JsonSyntaxException(e9);
                    }
                case 26:
                    if (jsonReader.peek() == 9) {
                        jsonReader.nextNull();
                        return null;
                    }
                    try {
                        return Integer.valueOf(jsonReader.nextInt());
                    } catch (NumberFormatException e10) {
                        throw new JsonSyntaxException(e10);
                    }
                case 27:
                    try {
                        return new AtomicInteger(jsonReader.nextInt());
                    } catch (NumberFormatException e11) {
                        throw new JsonSyntaxException(e11);
                    }
                default:
                    return new AtomicBoolean(jsonReader.nextBoolean());
            }
        }

        public String toString() {
            switch (this.$r8$classId) {
                case 2:
                    return "AnonymousOrNonStaticLocalClassAdapter";
                default:
                    return super.toString();
            }
        }

        @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, Object obj) {
            int i = 0;
            switch (this.$r8$classId) {
                case 0:
                    throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("java-lang-class-unsupported"));
                case 1:
                    write(jsonWriter, (JsonElement) obj);
                    return;
                case 2:
                    jsonWriter.nullValue();
                    return;
                case 3:
                    jsonWriter.beginArray();
                    int length = ((AtomicIntegerArray) obj).length();
                    while (i < length) {
                        jsonWriter.value(r5.get(i));
                        i++;
                    }
                    jsonWriter.endArray();
                    return;
                case 4:
                    Number number = (Number) obj;
                    if (number == null) {
                        jsonWriter.nullValue();
                        return;
                    } else {
                        jsonWriter.value(number.longValue());
                        return;
                    }
                case 5:
                    Number number2 = (Number) obj;
                    if (number2 == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    if (!(number2 instanceof Float)) {
                        number2 = Float.valueOf(number2.floatValue());
                    }
                    jsonWriter.value(number2);
                    return;
                case 6:
                    Number number3 = (Number) obj;
                    if (number3 == null) {
                        jsonWriter.nullValue();
                        return;
                    } else {
                        jsonWriter.value(number3.doubleValue());
                        return;
                    }
                case 7:
                    Character ch = (Character) obj;
                    jsonWriter.value(ch != null ? String.valueOf(ch) : null);
                    return;
                case 8:
                    jsonWriter.value((String) obj);
                    return;
                case 9:
                    jsonWriter.value((BigDecimal) obj);
                    return;
                case 10:
                    jsonWriter.value((BigInteger) obj);
                    return;
                case 11:
                    jsonWriter.value((LazilyParsedNumber) obj);
                    return;
                case 12:
                    StringBuilder sb = (StringBuilder) obj;
                    jsonWriter.value(sb != null ? sb.toString() : null);
                    return;
                case 13:
                    StringBuffer stringBuffer = (StringBuffer) obj;
                    jsonWriter.value(stringBuffer != null ? stringBuffer.toString() : null);
                    return;
                case 14:
                    URL url = (URL) obj;
                    jsonWriter.value(url != null ? url.toExternalForm() : null);
                    return;
                case 15:
                    URI uri = (URI) obj;
                    jsonWriter.value(uri != null ? uri.toASCIIString() : null);
                    return;
                case 16:
                    InetAddress inetAddress = (InetAddress) obj;
                    jsonWriter.value(inetAddress != null ? inetAddress.getHostAddress() : null);
                    return;
                case 17:
                    UUID uuid = (UUID) obj;
                    jsonWriter.value(uuid != null ? uuid.toString() : null);
                    return;
                case 18:
                    jsonWriter.value(((Currency) obj).getCurrencyCode());
                    return;
                case 19:
                    if (((Calendar) obj) == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("year");
                    jsonWriter.value(r5.get(1));
                    jsonWriter.name("month");
                    jsonWriter.value(r5.get(2));
                    jsonWriter.name("dayOfMonth");
                    jsonWriter.value(r5.get(5));
                    jsonWriter.name("hourOfDay");
                    jsonWriter.value(r5.get(11));
                    jsonWriter.name("minute");
                    jsonWriter.value(r5.get(12));
                    jsonWriter.name("second");
                    jsonWriter.value(r5.get(13));
                    jsonWriter.endObject();
                    return;
                case 20:
                    Locale locale = (Locale) obj;
                    jsonWriter.value(locale != null ? locale.toString() : null);
                    return;
                case 21:
                    BitSet bitSet = (BitSet) obj;
                    jsonWriter.beginArray();
                    int length2 = bitSet.length();
                    while (i < length2) {
                        jsonWriter.value(bitSet.get(i) ? 1L : 0L);
                        i++;
                    }
                    jsonWriter.endArray();
                    return;
                case 22:
                    Boolean bool = (Boolean) obj;
                    if (bool == null) {
                        jsonWriter.nullValue();
                        return;
                    }
                    jsonWriter.writeDeferredName();
                    jsonWriter.beforeValue();
                    jsonWriter.out.write(bool.booleanValue() ? "true" : "false");
                    return;
                case 23:
                    Boolean bool2 = (Boolean) obj;
                    jsonWriter.value(bool2 == null ? "null" : bool2.toString());
                    return;
                case 24:
                    if (((Number) obj) == null) {
                        jsonWriter.nullValue();
                        return;
                    } else {
                        jsonWriter.value(r5.byteValue());
                        return;
                    }
                case 25:
                    if (((Number) obj) == null) {
                        jsonWriter.nullValue();
                        return;
                    } else {
                        jsonWriter.value(r5.shortValue());
                        return;
                    }
                case 26:
                    if (((Number) obj) == null) {
                        jsonWriter.nullValue();
                        return;
                    } else {
                        jsonWriter.value(r5.intValue());
                        return;
                    }
                case 27:
                    jsonWriter.value(((AtomicInteger) obj).get());
                    return;
                default:
                    jsonWriter.value(((AtomicBoolean) obj).get());
                    return;
            }
        }

        public static void write(JsonWriter jsonWriter, JsonElement jsonElement) {
            boolean parseBoolean;
            if (jsonElement != null && !(jsonElement instanceof JsonNull)) {
                if (jsonElement instanceof JsonPrimitive) {
                    JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElement;
                    Serializable serializable = jsonPrimitive.value;
                    if (serializable instanceof Number) {
                        jsonWriter.value(jsonPrimitive.getAsNumber());
                        return;
                    }
                    if (serializable instanceof Boolean) {
                        if (serializable instanceof Boolean) {
                            parseBoolean = ((Boolean) serializable).booleanValue();
                        } else {
                            parseBoolean = Boolean.parseBoolean(jsonPrimitive.getAsString());
                        }
                        jsonWriter.value(parseBoolean);
                        return;
                    }
                    jsonWriter.value(jsonPrimitive.getAsString());
                    return;
                }
                boolean z = jsonElement instanceof JsonArray;
                if (z) {
                    jsonWriter.beginArray();
                    if (z) {
                        Iterator it = ((JsonArray) jsonElement).elements.iterator();
                        while (it.hasNext()) {
                            write(jsonWriter, (JsonElement) it.next());
                        }
                        jsonWriter.endArray();
                        return;
                    }
                    OptionalProvider$$ExternalSyntheticLambda0.m$1(jsonElement, "Not a JSON Array: ");
                    return;
                }
                boolean z2 = jsonElement instanceof JsonObject;
                if (z2) {
                    jsonWriter.beginObject();
                    if (z2) {
                        Iterator it2 = ((LinkedTreeMap.KeySet) ((JsonObject) jsonElement).members.entrySet()).iterator();
                        while (((LinkedHashTreeMap.LinkedTreeMapIterator) it2).hasNext()) {
                            LinkedTreeMap.Node nextNode = ((LinkedTreeMap.KeySet.AnonymousClass1) it2).nextNode();
                            jsonWriter.name((String) nextNode.getKey());
                            write(jsonWriter, (JsonElement) nextNode.getValue());
                        }
                        jsonWriter.endObject();
                        return;
                    }
                    OptionalProvider$$ExternalSyntheticLambda0.m$1(jsonElement, "Not a JSON Object: ");
                    return;
                }
                Path$$ExternalSyntheticBUOutline0.m(jsonElement.getClass(), "Couldn't write ");
                return;
            }
            jsonWriter.nullValue();
        }
    }
}
