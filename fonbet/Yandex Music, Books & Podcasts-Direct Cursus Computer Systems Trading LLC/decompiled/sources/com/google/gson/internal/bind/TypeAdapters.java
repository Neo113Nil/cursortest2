package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.NumberLimits;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import defpackage.k5r;
import defpackage.ouj;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes3.dex */
public abstract class TypeAdapters {
    public static final TypeAdapterFactory A;
    public static final TypeAdapterFactory B;
    public static final TypeAdapterFactory a = new AnonymousClass29(Class.class, new TypeAdapter<Class>() { // from class: com.google.gson.internal.bind.TypeAdapters.1
        @Override // com.google.gson.TypeAdapter
        public final Object b(JsonReader jsonReader) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?\nSee ".concat("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("java-lang-class-unsupported")));
        }

        @Override // com.google.gson.TypeAdapter
        public final void c(JsonWriter jsonWriter, Object obj) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("java-lang-class-unsupported"));
        }
    }.a());
    public static final TypeAdapterFactory b = new AnonymousClass29(BitSet.class, new TypeAdapter<BitSet>() { // from class: com.google.gson.internal.bind.TypeAdapters.2
        @Override // com.google.gson.TypeAdapter
        public final Object b(JsonReader jsonReader) {
            BitSet bitSet = new BitSet();
            jsonReader.b();
            JsonToken H0 = jsonReader.H0();
            int i2 = 0;
            while (H0 != JsonToken.END_ARRAY) {
                int i3 = AnonymousClass33.a[H0.ordinal()];
                boolean z2 = true;
                if (i3 == 1 || i3 == 2) {
                    int nextInt = jsonReader.nextInt();
                    if (nextInt == 0) {
                        z2 = false;
                    } else if (nextInt != 1) {
                        StringBuilder q2 = k5r.q(nextInt, "Invalid bitset value ", ", expected 0 or 1; at path ");
                        q2.append(jsonReader.R());
                        throw new JsonSyntaxException(q2.toString());
                    }
                } else {
                    if (i3 != 3) {
                        StringBuilder sb = new StringBuilder("Invalid bitset value type: ");
                        sb.append(H0);
                        String path = jsonReader.getPath();
                        sb.append("; at path ");
                        sb.append(path);
                        throw new JsonSyntaxException(sb.toString());
                    }
                    z2 = jsonReader.nextBoolean();
                }
                if (z2) {
                    bitSet.set(i2);
                }
                i2++;
                H0 = jsonReader.H0();
            }
            jsonReader.H();
            return bitSet;
        }

        @Override // com.google.gson.TypeAdapter
        public final void c(JsonWriter jsonWriter, Object obj) {
            BitSet bitSet = (BitSet) obj;
            jsonWriter.o();
            int length = bitSet.length();
            for (int i2 = 0; i2 < length; i2++) {
                jsonWriter.R0(bitSet.get(i2) ? 1L : 0L);
            }
            jsonWriter.H();
        }
    }.a());
    public static final TypeAdapter c;
    public static final TypeAdapterFactory d;
    public static final TypeAdapterFactory e;
    public static final TypeAdapterFactory f;
    public static final TypeAdapterFactory g;
    public static final TypeAdapterFactory h;
    public static final TypeAdapterFactory i;
    public static final TypeAdapterFactory j;
    public static final TypeAdapter k;
    public static final TypeAdapterFactory l;
    public static final TypeAdapter m;
    public static final TypeAdapter n;
    public static final TypeAdapter o;
    public static final TypeAdapterFactory p;
    public static final TypeAdapterFactory q;
    public static final TypeAdapterFactory r;
    public static final TypeAdapterFactory s;
    public static final TypeAdapterFactory t;
    public static final TypeAdapterFactory u;
    public static final TypeAdapterFactory v;
    public static final TypeAdapterFactory w;
    public static final TypeAdapterFactory x;
    public static final TypeAdapterFactory y;
    public static final TypeAdapter z;

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$29, reason: invalid class name */
    class AnonymousClass29 implements TypeAdapterFactory {
        public final /* synthetic */ Class a;
        public final /* synthetic */ TypeAdapter b;

        public AnonymousClass29(Class cls, TypeAdapter typeAdapter) {
            this.a = cls;
            this.b = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapterFactory
        public final TypeAdapter b(Gson gson, TypeToken typeToken) {
            if (typeToken.getRawType() == this.a) {
                return this.b;
            }
            return null;
        }

        public final String toString() {
            return "Factory[type=" + this.a.getName() + ",adapter=" + this.b + "]";
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$30, reason: invalid class name */
    class AnonymousClass30 implements TypeAdapterFactory {
        public final /* synthetic */ Class a;
        public final /* synthetic */ Class b;
        public final /* synthetic */ TypeAdapter c;

        public AnonymousClass30(Class cls, Class cls2, TypeAdapter typeAdapter) {
            this.a = cls;
            this.b = cls2;
            this.c = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapterFactory
        public final TypeAdapter b(Gson gson, TypeToken typeToken) {
            Class rawType = typeToken.getRawType();
            if (rawType == this.a || rawType == this.b) {
                return this.c;
            }
            return null;
        }

        public final String toString() {
            return "Factory[type=" + this.b.getName() + "+" + this.a.getName() + ",adapter=" + this.c + "]";
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$33, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass33 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            a = iArr;
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[JsonToken.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[JsonToken.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        TypeAdapter<Boolean> typeAdapter = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.3
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) {
                JsonToken H0 = jsonReader.H0();
                if (H0 != JsonToken.NULL) {
                    return H0 == JsonToken.STRING ? Boolean.valueOf(Boolean.parseBoolean(jsonReader.f0())) : Boolean.valueOf(jsonReader.nextBoolean());
                }
                jsonReader.u0();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) {
                jsonWriter.S0((Boolean) obj);
            }
        };
        c = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.4
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) {
                if (jsonReader.H0() != JsonToken.NULL) {
                    return Boolean.valueOf(jsonReader.f0());
                }
                jsonReader.u0();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) {
                Boolean bool = (Boolean) obj;
                jsonWriter.U0(bool == null ? "null" : bool.toString());
            }
        };
        d = new AnonymousClass30(Boolean.TYPE, Boolean.class, typeAdapter);
        e = new AnonymousClass30(Byte.TYPE, Byte.class, new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.5
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) {
                if (jsonReader.H0() == JsonToken.NULL) {
                    jsonReader.u0();
                    return null;
                }
                try {
                    int nextInt = jsonReader.nextInt();
                    if (nextInt <= 255 && nextInt >= -128) {
                        return Byte.valueOf((byte) nextInt);
                    }
                    StringBuilder q2 = k5r.q(nextInt, "Lossy conversion from ", " to byte; at path ");
                    q2.append(jsonReader.R());
                    throw new JsonSyntaxException(q2.toString());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) {
                if (((Number) obj) == null) {
                    jsonWriter.l0();
                } else {
                    jsonWriter.R0(r4.byteValue());
                }
            }
        });
        f = new AnonymousClass30(Short.TYPE, Short.class, new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.6
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) {
                if (jsonReader.H0() == JsonToken.NULL) {
                    jsonReader.u0();
                    return null;
                }
                try {
                    int nextInt = jsonReader.nextInt();
                    if (nextInt <= 65535 && nextInt >= -32768) {
                        return Short.valueOf((short) nextInt);
                    }
                    StringBuilder q2 = k5r.q(nextInt, "Lossy conversion from ", " to short; at path ");
                    q2.append(jsonReader.R());
                    throw new JsonSyntaxException(q2.toString());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) {
                if (((Number) obj) == null) {
                    jsonWriter.l0();
                } else {
                    jsonWriter.R0(r4.shortValue());
                }
            }
        });
        g = new AnonymousClass30(Integer.TYPE, Integer.class, new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.7
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) {
                if (jsonReader.H0() == JsonToken.NULL) {
                    jsonReader.u0();
                    return null;
                }
                try {
                    return Integer.valueOf(jsonReader.nextInt());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) {
                if (((Number) obj) == null) {
                    jsonWriter.l0();
                } else {
                    jsonWriter.R0(r4.intValue());
                }
            }
        });
        h = new AnonymousClass29(AtomicInteger.class, new TypeAdapter<AtomicInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.8
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) {
                try {
                    return new AtomicInteger(jsonReader.nextInt());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) {
                jsonWriter.R0(((AtomicInteger) obj).get());
            }
        }.a());
        i = new AnonymousClass29(AtomicBoolean.class, new TypeAdapter<AtomicBoolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.9
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) {
                return new AtomicBoolean(jsonReader.nextBoolean());
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) {
                jsonWriter.V0(((AtomicBoolean) obj).get());
            }
        }.a());
        j = new AnonymousClass29(AtomicIntegerArray.class, new TypeAdapter<AtomicIntegerArray>() { // from class: com.google.gson.internal.bind.TypeAdapters.10
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) {
                ArrayList arrayList = new ArrayList();
                jsonReader.b();
                while (jsonReader.hasNext()) {
                    try {
                        arrayList.add(Integer.valueOf(jsonReader.nextInt()));
                    } catch (NumberFormatException e2) {
                        throw new JsonSyntaxException(e2);
                    }
                }
                jsonReader.H();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) {
                jsonWriter.o();
                int length = ((AtomicIntegerArray) obj).length();
                for (int i2 = 0; i2 < length; i2++) {
                    jsonWriter.R0(r6.get(i2));
                }
                jsonWriter.H();
            }
        }.a());
        k = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.11
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) {
                if (jsonReader.H0() == JsonToken.NULL) {
                    jsonReader.u0();
                    return null;
                }
                try {
                    return Long.valueOf(jsonReader.nextLong());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) {
                Number number = (Number) obj;
                if (number == null) {
                    jsonWriter.l0();
                } else {
                    jsonWriter.R0(number.longValue());
                }
            }
        };
        new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.12
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) {
                if (jsonReader.H0() != JsonToken.NULL) {
                    return Float.valueOf((float) jsonReader.nextDouble());
                }
                jsonReader.u0();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) {
                Number number = (Number) obj;
                if (number == null) {
                    jsonWriter.l0();
                    return;
                }
                if (!(number instanceof Float)) {
                    number = Float.valueOf(number.floatValue());
                }
                jsonWriter.T0(number);
            }
        };
        new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.13
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) {
                if (jsonReader.H0() != JsonToken.NULL) {
                    return Double.valueOf(jsonReader.nextDouble());
                }
                jsonReader.u0();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) {
                Number number = (Number) obj;
                if (number == null) {
                    jsonWriter.l0();
                } else {
                    jsonWriter.P0(number.doubleValue());
                }
            }
        };
        l = new AnonymousClass30(Character.TYPE, Character.class, new TypeAdapter<Character>() { // from class: com.google.gson.internal.bind.TypeAdapters.14
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) {
                if (jsonReader.H0() == JsonToken.NULL) {
                    jsonReader.u0();
                    return null;
                }
                String f0 = jsonReader.f0();
                if (f0.length() == 1) {
                    return Character.valueOf(f0.charAt(0));
                }
                StringBuilder u2 = ouj.u("Expecting character, got: ", f0, "; at ");
                u2.append(jsonReader.R());
                throw new JsonSyntaxException(u2.toString());
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) {
                Character ch = (Character) obj;
                jsonWriter.U0(ch == null ? null : String.valueOf(ch));
            }
        });
        TypeAdapter<String> typeAdapter2 = new TypeAdapter<String>() { // from class: com.google.gson.internal.bind.TypeAdapters.15
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) {
                JsonToken H0 = jsonReader.H0();
                if (H0 != JsonToken.NULL) {
                    return H0 == JsonToken.BOOLEAN ? Boolean.toString(jsonReader.nextBoolean()) : jsonReader.f0();
                }
                jsonReader.u0();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) {
                jsonWriter.U0((String) obj);
            }
        };
        m = new TypeAdapter<BigDecimal>() { // from class: com.google.gson.internal.bind.TypeAdapters.16
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) {
                if (jsonReader.H0() == JsonToken.NULL) {
                    jsonReader.u0();
                    return null;
                }
                String f0 = jsonReader.f0();
                try {
                    return NumberLimits.b(f0);
                } catch (NumberFormatException e2) {
                    StringBuilder u2 = ouj.u("Failed parsing '", f0, "' as BigDecimal; at path ");
                    u2.append(jsonReader.R());
                    throw new JsonSyntaxException(u2.toString(), e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) {
                jsonWriter.T0((BigDecimal) obj);
            }
        };
        n = new TypeAdapter<BigInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.17
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) {
                if (jsonReader.H0() == JsonToken.NULL) {
                    jsonReader.u0();
                    return null;
                }
                String f0 = jsonReader.f0();
                try {
                    NumberLimits.a(f0);
                    return new BigInteger(f0);
                } catch (NumberFormatException e2) {
                    StringBuilder u2 = ouj.u("Failed parsing '", f0, "' as BigInteger; at path ");
                    u2.append(jsonReader.R());
                    throw new JsonSyntaxException(u2.toString(), e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) {
                jsonWriter.T0((BigInteger) obj);
            }
        };
        o = new TypeAdapter<LazilyParsedNumber>() { // from class: com.google.gson.internal.bind.TypeAdapters.18
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) {
                if (jsonReader.H0() != JsonToken.NULL) {
                    return new LazilyParsedNumber(jsonReader.f0());
                }
                jsonReader.u0();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) {
                jsonWriter.T0((LazilyParsedNumber) obj);
            }
        };
        p = new AnonymousClass29(String.class, typeAdapter2);
        q = new AnonymousClass29(StringBuilder.class, new TypeAdapter<StringBuilder>() { // from class: com.google.gson.internal.bind.TypeAdapters.19
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) {
                if (jsonReader.H0() != JsonToken.NULL) {
                    return new StringBuilder(jsonReader.f0());
                }
                jsonReader.u0();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) {
                StringBuilder sb = (StringBuilder) obj;
                jsonWriter.U0(sb == null ? null : sb.toString());
            }
        });
        r = new AnonymousClass29(StringBuffer.class, new TypeAdapter<StringBuffer>() { // from class: com.google.gson.internal.bind.TypeAdapters.20
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) {
                if (jsonReader.H0() != JsonToken.NULL) {
                    return new StringBuffer(jsonReader.f0());
                }
                jsonReader.u0();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) {
                StringBuffer stringBuffer = (StringBuffer) obj;
                jsonWriter.U0(stringBuffer == null ? null : stringBuffer.toString());
            }
        });
        s = new AnonymousClass29(URL.class, new TypeAdapter<URL>() { // from class: com.google.gson.internal.bind.TypeAdapters.21
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) {
                if (jsonReader.H0() == JsonToken.NULL) {
                    jsonReader.u0();
                    return null;
                }
                String f0 = jsonReader.f0();
                if (f0.equals("null")) {
                    return null;
                }
                return new URL(f0);
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) {
                URL url = (URL) obj;
                jsonWriter.U0(url == null ? null : url.toExternalForm());
            }
        });
        t = new AnonymousClass29(URI.class, new TypeAdapter<URI>() { // from class: com.google.gson.internal.bind.TypeAdapters.22
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) {
                if (jsonReader.H0() == JsonToken.NULL) {
                    jsonReader.u0();
                    return null;
                }
                try {
                    String f0 = jsonReader.f0();
                    if (f0.equals("null")) {
                        return null;
                    }
                    return new URI(f0);
                } catch (URISyntaxException e2) {
                    throw new JsonIOException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) {
                URI uri = (URI) obj;
                jsonWriter.U0(uri == null ? null : uri.toASCIIString());
            }
        });
        final TypeAdapter<InetAddress> typeAdapter3 = new TypeAdapter<InetAddress>() { // from class: com.google.gson.internal.bind.TypeAdapters.23
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) {
                if (jsonReader.H0() != JsonToken.NULL) {
                    return InetAddress.getByName(jsonReader.f0());
                }
                jsonReader.u0();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) {
                InetAddress inetAddress = (InetAddress) obj;
                jsonWriter.U0(inetAddress == null ? null : inetAddress.getHostAddress());
            }
        };
        final Class<InetAddress> cls = InetAddress.class;
        u = new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.32
            @Override // com.google.gson.TypeAdapterFactory
            public final TypeAdapter b(Gson gson, TypeToken typeToken) {
                final Class<?> rawType = typeToken.getRawType();
                if (cls.isAssignableFrom(rawType)) {
                    return new TypeAdapter<Object>() { // from class: com.google.gson.internal.bind.TypeAdapters.32.1
                        @Override // com.google.gson.TypeAdapter
                        public final Object b(JsonReader jsonReader) {
                            Object b2 = typeAdapter3.b(jsonReader);
                            if (b2 != null) {
                                Class cls2 = rawType;
                                if (!cls2.isInstance(b2)) {
                                    throw new JsonSyntaxException("Expected a " + cls2.getName() + " but was " + b2.getClass().getName() + "; at path " + jsonReader.R());
                                }
                            }
                            return b2;
                        }

                        @Override // com.google.gson.TypeAdapter
                        public final void c(JsonWriter jsonWriter, Object obj) {
                            typeAdapter3.c(jsonWriter, obj);
                        }
                    };
                }
                return null;
            }

            public final String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + typeAdapter3 + "]";
            }
        };
        v = new AnonymousClass29(UUID.class, new TypeAdapter<UUID>() { // from class: com.google.gson.internal.bind.TypeAdapters.24
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) {
                if (jsonReader.H0() == JsonToken.NULL) {
                    jsonReader.u0();
                    return null;
                }
                String f0 = jsonReader.f0();
                try {
                    return UUID.fromString(f0);
                } catch (IllegalArgumentException e2) {
                    StringBuilder u2 = ouj.u("Failed parsing '", f0, "' as UUID; at path ");
                    u2.append(jsonReader.R());
                    throw new JsonSyntaxException(u2.toString(), e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) {
                UUID uuid = (UUID) obj;
                jsonWriter.U0(uuid == null ? null : uuid.toString());
            }
        });
        w = new AnonymousClass29(Currency.class, new TypeAdapter<Currency>() { // from class: com.google.gson.internal.bind.TypeAdapters.25
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) {
                String f0 = jsonReader.f0();
                try {
                    return Currency.getInstance(f0);
                } catch (IllegalArgumentException e2) {
                    StringBuilder u2 = ouj.u("Failed parsing '", f0, "' as Currency; at path ");
                    u2.append(jsonReader.R());
                    throw new JsonSyntaxException(u2.toString(), e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) {
                jsonWriter.U0(((Currency) obj).getCurrencyCode());
            }
        }.a());
        final TypeAdapter<Calendar> typeAdapter4 = new TypeAdapter<Calendar>() { // from class: com.google.gson.internal.bind.TypeAdapters.26
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) {
                int nextInt;
                if (jsonReader.H0() == JsonToken.NULL) {
                    jsonReader.u0();
                    return null;
                }
                jsonReader.g();
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (jsonReader.H0() != JsonToken.END_OBJECT) {
                    String L = jsonReader.L();
                    nextInt = jsonReader.nextInt();
                    L.getClass();
                    switch (L) {
                        case "dayOfMonth":
                            i4 = nextInt;
                            break;
                        case "minute":
                            i6 = nextInt;
                            break;
                        case "second":
                            i7 = nextInt;
                            break;
                        case "year":
                            i2 = nextInt;
                            break;
                        case "month":
                            i3 = nextInt;
                            break;
                        case "hourOfDay":
                            i5 = nextInt;
                            break;
                    }
                }
                jsonReader.I();
                return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) {
                if (((Calendar) obj) == null) {
                    jsonWriter.l0();
                    return;
                }
                jsonWriter.z();
                jsonWriter.Y("year");
                jsonWriter.R0(r4.get(1));
                jsonWriter.Y("month");
                jsonWriter.R0(r4.get(2));
                jsonWriter.Y("dayOfMonth");
                jsonWriter.R0(r4.get(5));
                jsonWriter.Y("hourOfDay");
                jsonWriter.R0(r4.get(11));
                jsonWriter.Y("minute");
                jsonWriter.R0(r4.get(12));
                jsonWriter.Y("second");
                jsonWriter.R0(r4.get(13));
                jsonWriter.I();
            }
        };
        x = new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.31
            @Override // com.google.gson.TypeAdapterFactory
            public final TypeAdapter b(Gson gson, TypeToken typeToken) {
                Class rawType = typeToken.getRawType();
                if (rawType == Calendar.class || rawType == GregorianCalendar.class) {
                    return TypeAdapter.this;
                }
                return null;
            }

            public final String toString() {
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + TypeAdapter.this + "]";
            }
        };
        y = new AnonymousClass29(Locale.class, new TypeAdapter<Locale>() { // from class: com.google.gson.internal.bind.TypeAdapters.27
            @Override // com.google.gson.TypeAdapter
            public final Object b(JsonReader jsonReader) {
                if (jsonReader.H0() == JsonToken.NULL) {
                    jsonReader.u0();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(jsonReader.f0(), "_");
                String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                return (nextToken2 == null && nextToken3 == null) ? new Locale(nextToken) : nextToken3 == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, nextToken3);
            }

            @Override // com.google.gson.TypeAdapter
            public final void c(JsonWriter jsonWriter, Object obj) {
                Locale locale = (Locale) obj;
                jsonWriter.U0(locale == null ? null : locale.toString());
            }
        });
        final JsonElementTypeAdapter jsonElementTypeAdapter = JsonElementTypeAdapter.a;
        z = jsonElementTypeAdapter;
        final Class<JsonElement> cls2 = JsonElement.class;
        A = new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.32
            @Override // com.google.gson.TypeAdapterFactory
            public final TypeAdapter b(Gson gson, TypeToken typeToken) {
                final Class rawType = typeToken.getRawType();
                if (cls2.isAssignableFrom(rawType)) {
                    return new TypeAdapter<Object>() { // from class: com.google.gson.internal.bind.TypeAdapters.32.1
                        @Override // com.google.gson.TypeAdapter
                        public final Object b(JsonReader jsonReader) {
                            Object b2 = jsonElementTypeAdapter.b(jsonReader);
                            if (b2 != null) {
                                Class cls22 = rawType;
                                if (!cls22.isInstance(b2)) {
                                    throw new JsonSyntaxException("Expected a " + cls22.getName() + " but was " + b2.getClass().getName() + "; at path " + jsonReader.R());
                                }
                            }
                            return b2;
                        }

                        @Override // com.google.gson.TypeAdapter
                        public final void c(JsonWriter jsonWriter, Object obj) {
                            jsonElementTypeAdapter.c(jsonWriter, obj);
                        }
                    };
                }
                return null;
            }

            public final String toString() {
                return "Factory[typeHierarchy=" + cls2.getName() + ",adapter=" + jsonElementTypeAdapter + "]";
            }
        };
        B = EnumTypeAdapter.d;
    }

    public static TypeAdapterFactory a(final TypeToken typeToken, final TypeAdapter typeAdapter) {
        return new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.TypeAdapters.28
            @Override // com.google.gson.TypeAdapterFactory
            public final TypeAdapter b(Gson gson, TypeToken typeToken2) {
                if (typeToken2.equals(TypeToken.this)) {
                    return typeAdapter;
                }
                return null;
            }
        };
    }

    public static TypeAdapterFactory b(Class cls, TypeAdapter typeAdapter) {
        return new AnonymousClass29(cls, typeAdapter);
    }

    public static TypeAdapterFactory c(Class cls, Class cls2, TypeAdapter typeAdapter) {
        return new AnonymousClass30(cls, cls2, typeAdapter);
    }
}
