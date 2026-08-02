package com.nimbusds.jose.shaded.gson;

import androidx.camera.video.VideoCapture;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.nimbusds.jose.shaded.gson.internal.Excluder;
import com.nimbusds.jose.shaded.gson.internal.GsonTypes;
import com.nimbusds.jose.shaded.gson.internal.LazilyParsedNumber;
import com.nimbusds.jose.shaded.gson.internal.bind.ArrayTypeAdapter;
import com.nimbusds.jose.shaded.gson.internal.bind.MapTypeAdapterFactory;
import com.nimbusds.jose.shaded.gson.internal.bind.NumberTypeAdapter;
import com.nimbusds.jose.shaded.gson.internal.bind.ObjectTypeAdapter;
import com.nimbusds.jose.shaded.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters;
import com.nimbusds.jose.shaded.gson.internal.sql.SqlTypesSupport;
import com.nimbusds.jose.shaded.gson.reflect.TypeToken;
import com.nimbusds.jose.shaded.gson.stream.JsonReader;
import com.nimbusds.jose.shaded.gson.stream.JsonWriter;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes5.dex */
public final class Gson {
    public final VideoCapture.AnonymousClass3 constructorConstructor;
    public final List factories;
    public final FormattingStyle formattingStyle;
    public final boolean htmlSafe;
    public final TypeAdapters.AnonymousClass29 jsonAdapterFactory;
    public final boolean serializeNulls;
    public final int strictness;
    public final ThreadLocal threadLocalAdapterResults = new ThreadLocal();
    public final ConcurrentHashMap typeTokenCache = new ConcurrentHashMap();
    public static final FormattingStyle DEFAULT_FORMATTING_STYLE = FormattingStyle.COMPACT;
    public static final int DEFAULT_OBJECT_TO_NUMBER_STRATEGY = 1;
    public static final int DEFAULT_NUMBER_TO_NUMBER_STRATEGY = 2;

    public final class FutureTypeAdapter extends TypeAdapter {
        public TypeAdapter delegate;

        @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
        public final Object read(JsonReader jsonReader) {
            TypeAdapter typeAdapter = this.delegate;
            if (typeAdapter != null) {
                return typeAdapter.read(jsonReader);
            }
            a$$ExternalSyntheticBUOutline0.m$1("Adapter for type with cyclic dependency has been used before dependency has been resolved");
            return null;
        }

        @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, Object obj) {
            TypeAdapter typeAdapter = this.delegate;
            if (typeAdapter != null) {
                typeAdapter.write(jsonWriter, obj);
            } else {
                a$$ExternalSyntheticBUOutline0.m$1("Adapter for type with cyclic dependency has been used before dependency has been resolved");
            }
        }
    }

    public Gson(Excluder excluder, int i, HashMap hashMap, boolean z, boolean z2, FormattingStyle formattingStyle, int i2, boolean z3, int i3, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i4, int i5, ArrayList arrayList4) {
        VideoCapture.AnonymousClass3 anonymousClass3 = new VideoCapture.AnonymousClass3(hashMap, z3, arrayList4, 9);
        this.constructorConstructor = anonymousClass3;
        this.serializeNulls = z;
        this.htmlSafe = z2;
        this.formattingStyle = formattingStyle;
        this.strictness = i2;
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(TypeAdapters.JSON_ELEMENT_FACTORY);
        final int i6 = 1;
        arrayList5.add(i4 == 1 ? ObjectTypeAdapter.DOUBLE_FACTORY : new ObjectTypeAdapter.AnonymousClass1(i4));
        arrayList5.add(excluder);
        arrayList5.addAll(arrayList3);
        arrayList5.add(TypeAdapters.STRING_FACTORY);
        arrayList5.add(TypeAdapters.INTEGER_FACTORY);
        arrayList5.add(TypeAdapters.BOOLEAN_FACTORY);
        arrayList5.add(TypeAdapters.BYTE_FACTORY);
        arrayList5.add(TypeAdapters.SHORT_FACTORY);
        final int i7 = 2;
        final TypeAdapter typeAdapter = i3 == 1 ? TypeAdapters.LONG : new TypeAdapter() { // from class: com.nimbusds.jose.shaded.gson.Gson.1
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public final Object read(JsonReader jsonReader) {
                switch (i7) {
                    case 0:
                        if (jsonReader.peek() != 9) {
                            return Double.valueOf(jsonReader.nextDouble());
                        }
                        jsonReader.nextNull();
                        return null;
                    case 1:
                        if (jsonReader.peek() != 9) {
                            return Float.valueOf((float) jsonReader.nextDouble());
                        }
                        jsonReader.nextNull();
                        return null;
                    default:
                        if (jsonReader.peek() != 9) {
                            return Long.valueOf(jsonReader.nextLong());
                        }
                        jsonReader.nextNull();
                        return null;
                }
            }

            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Object obj) {
                switch (i7) {
                    case 0:
                        Number number = (Number) obj;
                        if (number != null) {
                            double doubleValue = number.doubleValue();
                            Gson.checkValidFloatingPoint(doubleValue);
                            jsonWriter.value(doubleValue);
                            break;
                        } else {
                            jsonWriter.nullValue();
                            break;
                        }
                    case 1:
                        Number number2 = (Number) obj;
                        if (number2 != null) {
                            float floatValue = number2.floatValue();
                            Gson.checkValidFloatingPoint(floatValue);
                            if (!(number2 instanceof Float)) {
                                number2 = Float.valueOf(floatValue);
                            }
                            jsonWriter.value(number2);
                            break;
                        } else {
                            jsonWriter.nullValue();
                            break;
                        }
                    default:
                        Number number3 = (Number) obj;
                        if (number3 != null) {
                            jsonWriter.value(number3.toString());
                            break;
                        } else {
                            jsonWriter.nullValue();
                            break;
                        }
                }
            }
        };
        arrayList5.add(new TypeAdapters.AnonymousClass30(Long.TYPE, Long.class, typeAdapter));
        final int i8 = 0;
        arrayList5.add(new TypeAdapters.AnonymousClass30(Double.TYPE, Double.class, new TypeAdapter() { // from class: com.nimbusds.jose.shaded.gson.Gson.1
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public final Object read(JsonReader jsonReader) {
                switch (i8) {
                    case 0:
                        if (jsonReader.peek() != 9) {
                            return Double.valueOf(jsonReader.nextDouble());
                        }
                        jsonReader.nextNull();
                        return null;
                    case 1:
                        if (jsonReader.peek() != 9) {
                            return Float.valueOf((float) jsonReader.nextDouble());
                        }
                        jsonReader.nextNull();
                        return null;
                    default:
                        if (jsonReader.peek() != 9) {
                            return Long.valueOf(jsonReader.nextLong());
                        }
                        jsonReader.nextNull();
                        return null;
                }
            }

            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Object obj) {
                switch (i8) {
                    case 0:
                        Number number = (Number) obj;
                        if (number != null) {
                            double doubleValue = number.doubleValue();
                            Gson.checkValidFloatingPoint(doubleValue);
                            jsonWriter.value(doubleValue);
                            break;
                        } else {
                            jsonWriter.nullValue();
                            break;
                        }
                    case 1:
                        Number number2 = (Number) obj;
                        if (number2 != null) {
                            float floatValue = number2.floatValue();
                            Gson.checkValidFloatingPoint(floatValue);
                            if (!(number2 instanceof Float)) {
                                number2 = Float.valueOf(floatValue);
                            }
                            jsonWriter.value(number2);
                            break;
                        } else {
                            jsonWriter.nullValue();
                            break;
                        }
                    default:
                        Number number3 = (Number) obj;
                        if (number3 != null) {
                            jsonWriter.value(number3.toString());
                            break;
                        } else {
                            jsonWriter.nullValue();
                            break;
                        }
                }
            }
        }));
        arrayList5.add(new TypeAdapters.AnonymousClass30(Float.TYPE, Float.class, new TypeAdapter() { // from class: com.nimbusds.jose.shaded.gson.Gson.1
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public final Object read(JsonReader jsonReader) {
                switch (i6) {
                    case 0:
                        if (jsonReader.peek() != 9) {
                            return Double.valueOf(jsonReader.nextDouble());
                        }
                        jsonReader.nextNull();
                        return null;
                    case 1:
                        if (jsonReader.peek() != 9) {
                            return Float.valueOf((float) jsonReader.nextDouble());
                        }
                        jsonReader.nextNull();
                        return null;
                    default:
                        if (jsonReader.peek() != 9) {
                            return Long.valueOf(jsonReader.nextLong());
                        }
                        jsonReader.nextNull();
                        return null;
                }
            }

            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Object obj) {
                switch (i6) {
                    case 0:
                        Number number = (Number) obj;
                        if (number != null) {
                            double doubleValue = number.doubleValue();
                            Gson.checkValidFloatingPoint(doubleValue);
                            jsonWriter.value(doubleValue);
                            break;
                        } else {
                            jsonWriter.nullValue();
                            break;
                        }
                    case 1:
                        Number number2 = (Number) obj;
                        if (number2 != null) {
                            float floatValue = number2.floatValue();
                            Gson.checkValidFloatingPoint(floatValue);
                            if (!(number2 instanceof Float)) {
                                number2 = Float.valueOf(floatValue);
                            }
                            jsonWriter.value(number2);
                            break;
                        } else {
                            jsonWriter.nullValue();
                            break;
                        }
                    default:
                        Number number3 = (Number) obj;
                        if (number3 != null) {
                            jsonWriter.value(number3.toString());
                            break;
                        } else {
                            jsonWriter.nullValue();
                            break;
                        }
                }
            }
        }));
        arrayList5.add(i5 == 2 ? NumberTypeAdapter.LAZILY_PARSED_NUMBER_FACTORY : new TypeAdapters.AnonymousClass31(new NumberTypeAdapter(i5), i6));
        arrayList5.add(TypeAdapters.ATOMIC_INTEGER_FACTORY);
        arrayList5.add(TypeAdapters.ATOMIC_BOOLEAN_FACTORY);
        arrayList5.add(new TypeAdapters.AnonymousClass29(AtomicLong.class, new TypeAdapter() { // from class: com.nimbusds.jose.shaded.gson.Gson.4
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public final Object read(JsonReader jsonReader) {
                int i9 = i8;
                TypeAdapter typeAdapter2 = typeAdapter;
                switch (i9) {
                    case 0:
                        return new AtomicLong(((Number) typeAdapter2.read(jsonReader)).longValue());
                    default:
                        ArrayList arrayList6 = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            arrayList6.add(Long.valueOf(((Number) typeAdapter2.read(jsonReader)).longValue()));
                        }
                        jsonReader.endArray();
                        int size = arrayList6.size();
                        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                        for (int i10 = 0; i10 < size; i10++) {
                            atomicLongArray.set(i10, ((Long) arrayList6.get(i10)).longValue());
                        }
                        return atomicLongArray;
                }
            }

            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Object obj) {
                int i9 = i8;
                TypeAdapter typeAdapter2 = typeAdapter;
                switch (i9) {
                    case 0:
                        typeAdapter2.write(jsonWriter, Long.valueOf(((AtomicLong) obj).get()));
                        break;
                    default:
                        AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                        jsonWriter.beginArray();
                        int length = atomicLongArray.length();
                        for (int i10 = 0; i10 < length; i10++) {
                            typeAdapter2.write(jsonWriter, Long.valueOf(atomicLongArray.get(i10)));
                        }
                        jsonWriter.endArray();
                        break;
                }
            }
        }.nullSafe(), i8));
        arrayList5.add(new TypeAdapters.AnonymousClass29(AtomicLongArray.class, new TypeAdapter() { // from class: com.nimbusds.jose.shaded.gson.Gson.4
            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public final Object read(JsonReader jsonReader) {
                int i9 = i6;
                TypeAdapter typeAdapter2 = typeAdapter;
                switch (i9) {
                    case 0:
                        return new AtomicLong(((Number) typeAdapter2.read(jsonReader)).longValue());
                    default:
                        ArrayList arrayList6 = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            arrayList6.add(Long.valueOf(((Number) typeAdapter2.read(jsonReader)).longValue()));
                        }
                        jsonReader.endArray();
                        int size = arrayList6.size();
                        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                        for (int i10 = 0; i10 < size; i10++) {
                            atomicLongArray.set(i10, ((Long) arrayList6.get(i10)).longValue());
                        }
                        return atomicLongArray;
                }
            }

            @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
            public final void write(JsonWriter jsonWriter, Object obj) {
                int i9 = i6;
                TypeAdapter typeAdapter2 = typeAdapter;
                switch (i9) {
                    case 0:
                        typeAdapter2.write(jsonWriter, Long.valueOf(((AtomicLong) obj).get()));
                        break;
                    default:
                        AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                        jsonWriter.beginArray();
                        int length = atomicLongArray.length();
                        for (int i10 = 0; i10 < length; i10++) {
                            typeAdapter2.write(jsonWriter, Long.valueOf(atomicLongArray.get(i10)));
                        }
                        jsonWriter.endArray();
                        break;
                }
            }
        }.nullSafe(), i8));
        arrayList5.add(TypeAdapters.ATOMIC_INTEGER_ARRAY_FACTORY);
        arrayList5.add(TypeAdapters.CHARACTER_FACTORY);
        arrayList5.add(TypeAdapters.STRING_BUILDER_FACTORY);
        arrayList5.add(TypeAdapters.STRING_BUFFER_FACTORY);
        arrayList5.add(new TypeAdapters.AnonymousClass29(BigDecimal.class, TypeAdapters.BIG_DECIMAL, i8));
        arrayList5.add(new TypeAdapters.AnonymousClass29(BigInteger.class, TypeAdapters.BIG_INTEGER, i8));
        arrayList5.add(new TypeAdapters.AnonymousClass29(LazilyParsedNumber.class, TypeAdapters.LAZILY_PARSED_NUMBER, i8));
        arrayList5.add(TypeAdapters.URL_FACTORY);
        arrayList5.add(TypeAdapters.URI_FACTORY);
        arrayList5.add(TypeAdapters.UUID_FACTORY);
        arrayList5.add(TypeAdapters.CURRENCY_FACTORY);
        arrayList5.add(TypeAdapters.LOCALE_FACTORY);
        arrayList5.add(TypeAdapters.INET_ADDRESS_FACTORY);
        arrayList5.add(TypeAdapters.BIT_SET_FACTORY);
        arrayList5.add(ArrayTypeAdapter.DEFAULT_STYLE_FACTORY);
        arrayList5.add(TypeAdapters.CALENDAR_FACTORY);
        if (SqlTypesSupport.SUPPORTS_SQL_TYPES) {
            arrayList5.add(SqlTypesSupport.TIME_FACTORY);
            arrayList5.add(SqlTypesSupport.DATE_FACTORY);
            arrayList5.add(SqlTypesSupport.TIMESTAMP_FACTORY);
        }
        arrayList5.add(ArrayTypeAdapter.FACTORY);
        arrayList5.add(TypeAdapters.CLASS_FACTORY);
        arrayList5.add(new MapTypeAdapterFactory(anonymousClass3, i6));
        arrayList5.add(new MapTypeAdapterFactory(anonymousClass3, i8));
        TypeAdapters.AnonymousClass29 anonymousClass29 = new TypeAdapters.AnonymousClass29(anonymousClass3);
        this.jsonAdapterFactory = anonymousClass29;
        arrayList5.add(anonymousClass29);
        arrayList5.add(TypeAdapters.ENUM_FACTORY);
        arrayList5.add(new ReflectiveTypeAdapterFactory(anonymousClass3, i, excluder, anonymousClass29, arrayList4));
        this.factories = Collections.unmodifiableList(arrayList5);
    }

    public static void checkValidFloatingPoint(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        r9.strictness = r3;
        r10 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00af, code lost:
    
        if (r10 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d0, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b7, code lost:
    
        if (r9.peek() != 10) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c1, code lost:
    
        throw new com.nimbusds.jose.shaded.gson.JsonSyntaxException("JSON document was not fully consumed.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c9, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cf, code lost:
    
        throw new com.nimbusds.jose.shaded.gson.JsonSyntaxException(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c2, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c8, code lost:
    
        throw new com.nimbusds.jose.shaded.gson.JsonIOException(r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fromJson(String str, Type type2) {
        TypeToken typeToken = new TypeToken(type2);
        Object obj = null;
        if (str == null) {
            return null;
        }
        JsonReader jsonReader = new JsonReader(new StringReader(str));
        int i = this.strictness;
        int i2 = i == 0 ? 2 : i;
        if (i2 == 0) {
            throw null;
        }
        jsonReader.strictness = i2;
        boolean z = true;
        if (i != 0) {
            if (i == 0) {
                throw null;
            }
            jsonReader.strictness = i;
        } else if (i2 == 2) {
            jsonReader.strictness = 1;
        }
        try {
            try {
                try {
                    try {
                        jsonReader.peek();
                        z = false;
                        TypeAdapter adapter = getAdapter(typeToken);
                        Class cls = typeToken.rawType;
                        Object read = adapter.read(jsonReader);
                        Class wrap = GsonTypes.wrap(cls);
                        if (read != null && !wrap.isInstance(read)) {
                            throw new ClassCastException("Type adapter '" + adapter + "' returned wrong type; requested " + cls + " but got instance of " + read.getClass() + "\nVerify that the adapter was registered for the correct type.");
                        }
                        throw null;
                    } catch (EOFException e) {
                        if (!z) {
                            throw new JsonSyntaxException(e);
                        }
                        if (i2 == 0) {
                            throw null;
                        }
                        jsonReader.strictness = i2;
                    }
                } catch (IllegalStateException e2) {
                    throw new JsonSyntaxException(e2);
                }
            } catch (IOException e3) {
                throw new JsonSyntaxException(e3);
            } catch (AssertionError e4) {
                throw new AssertionError("AssertionError (GSON 2.13.1): " + e4.getMessage(), e4);
            }
        } catch (Throwable th) {
            if (i2 == 0) {
                throw null;
            }
            jsonReader.strictness = i2;
            throw th;
        }
    }

    public final TypeAdapter getAdapter(TypeToken typeToken) {
        boolean z;
        ConcurrentHashMap concurrentHashMap = this.typeTokenCache;
        TypeAdapter typeAdapter = (TypeAdapter) concurrentHashMap.get(typeToken);
        if (typeAdapter != null) {
            return typeAdapter;
        }
        ThreadLocal threadLocal = this.threadLocalAdapterResults;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z = true;
        } else {
            TypeAdapter typeAdapter2 = (TypeAdapter) map.get(typeToken);
            if (typeAdapter2 != null) {
                return typeAdapter2;
            }
            z = false;
        }
        try {
            FutureTypeAdapter futureTypeAdapter = new FutureTypeAdapter();
            futureTypeAdapter.delegate = null;
            map.put(typeToken, futureTypeAdapter);
            Iterator it = this.factories.iterator();
            TypeAdapter typeAdapter3 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                typeAdapter3 = ((TypeAdapterFactory) it.next()).create(this, typeToken);
                if (typeAdapter3 != null) {
                    if (futureTypeAdapter.delegate != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    futureTypeAdapter.delegate = typeAdapter3;
                    map.put(typeToken, typeAdapter3);
                }
            }
            if (z) {
                threadLocal.remove();
            }
            if (typeAdapter3 == null) {
                OptionalProvider$$ExternalSyntheticLambda0.m((Object) typeToken, "GSON (2.13.1) cannot handle ");
                return null;
            }
            if (z) {
                concurrentHashMap.putAll(map);
            }
            return typeAdapter3;
        } catch (Throwable th) {
            if (z) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public final void toJson(Map map, Class cls, JsonWriter jsonWriter) {
        TypeAdapter adapter = getAdapter(new TypeToken(cls));
        int i = jsonWriter.strictness;
        int i2 = this.strictness;
        if (i2 != 0) {
            jsonWriter.setStrictness(i2);
        } else if (i == 2) {
            jsonWriter.strictness = 1;
        }
        boolean z = jsonWriter.htmlSafe;
        boolean z2 = jsonWriter.serializeNulls;
        jsonWriter.htmlSafe = this.htmlSafe;
        jsonWriter.serializeNulls = this.serializeNulls;
        try {
            try {
                try {
                    adapter.write(jsonWriter, map);
                } catch (IOException e) {
                    throw new JsonIOException(e);
                }
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.13.1): " + e2.getMessage(), e2);
            }
        } finally {
            jsonWriter.setStrictness(i);
            jsonWriter.htmlSafe = z;
            jsonWriter.serializeNulls = z2;
        }
    }

    public final String toString() {
        return "{serializeNulls:" + this.serializeNulls + ",factories:" + this.factories + ",instanceCreators:" + this.constructorConstructor + "}";
    }
}
