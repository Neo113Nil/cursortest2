package com.google.crypto.tink.internal;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public abstract class JsonParser {
    public static final JsonElementTypeAdapter JSON_ELEMENT = new JsonElementTypeAdapter(0);

    /* renamed from: com.google.crypto.tink.internal.JsonParser$1, reason: invalid class name */
    public abstract /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public final class LazilyParsedNumber extends Number {
        public final String value;

        public LazilyParsedNumber(String str) {
            this.value = str;
        }

        @Override // java.lang.Number
        public final double doubleValue() {
            return Double.parseDouble(this.value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof LazilyParsedNumber) {
                return this.value.equals(((LazilyParsedNumber) obj).value);
            }
            return false;
        }

        @Override // java.lang.Number
        public final float floatValue() {
            return Float.parseFloat(this.value);
        }

        public final int hashCode() {
            return this.value.hashCode();
        }

        @Override // java.lang.Number
        public final int intValue() {
            String str = this.value;
            try {
                try {
                    return Integer.parseInt(str);
                } catch (NumberFormatException unused) {
                    return (int) Long.parseLong(str);
                }
            } catch (NumberFormatException unused2) {
                return new BigDecimal(str).intValue();
            }
        }

        @Override // java.lang.Number
        public final long longValue() {
            String str = this.value;
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException unused) {
                return new BigDecimal(str).longValue();
            }
        }

        public final String toString() {
            return this.value;
        }
    }

    public static boolean isValidString(String str) {
        int length = str.length();
        int i = 0;
        while (i != length) {
            char charAt = str.charAt(i);
            int i2 = i + 1;
            if (!Character.isSurrogate(charAt)) {
                i = i2;
            } else {
                if (Character.isLowSurrogate(charAt) || i2 == length || !Character.isLowSurrogate(str.charAt(i2))) {
                    return false;
                }
                i += 2;
            }
        }
        return true;
    }

    public static JsonElement parse(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            jsonReader.setLenient(false);
            return JSON_ELEMENT.read2(jsonReader);
        } catch (NumberFormatException e) {
            throw new IOException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final class JsonElementTypeAdapter extends TypeAdapter<JsonElement> {
        private JsonElementTypeAdapter() {
        }

        public static JsonElement readTerminal$1(JsonReader jsonReader, JsonToken jsonToken) {
            int i = AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken[jsonToken.ordinal()];
            if (i == 3) {
                String nextString = jsonReader.nextString();
                if (JsonParser.isValidString(nextString)) {
                    return new JsonPrimitive(nextString);
                }
                a$$ExternalSyntheticBUOutline0.m$4("illegal characters in string");
                return null;
            }
            if (i == 4) {
                return new JsonPrimitive(new LazilyParsedNumber(jsonReader.nextString()));
            }
            if (i == 5) {
                return new JsonPrimitive(Boolean.valueOf(jsonReader.nextBoolean()));
            }
            if (i == 6) {
                jsonReader.nextNull();
                return JsonNull.INSTANCE;
            }
            OptionalProvider$$ExternalSyntheticLambda0.m$1(jsonToken, "Unexpected token: ");
            return null;
        }

        public static JsonElement tryBeginNesting$1(JsonReader jsonReader, JsonToken jsonToken) {
            int i = AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken[jsonToken.ordinal()];
            if (i == 1) {
                jsonReader.beginArray();
                return new JsonArray();
            }
            if (i != 2) {
                return null;
            }
            jsonReader.beginObject();
            return new JsonObject();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: read */
        public final JsonElement read2(JsonReader jsonReader) {
            String str;
            JsonToken peek = jsonReader.peek();
            JsonElement tryBeginNesting$1 = tryBeginNesting$1(jsonReader, peek);
            if (tryBeginNesting$1 == null) {
                return readTerminal$1(jsonReader, peek);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            while (true) {
                if (jsonReader.hasNext()) {
                    if (tryBeginNesting$1 instanceof JsonObject) {
                        str = jsonReader.nextName();
                        if (!JsonParser.isValidString(str)) {
                            a$$ExternalSyntheticBUOutline0.m$4("illegal characters in string");
                            return null;
                        }
                    } else {
                        str = null;
                    }
                    JsonToken peek2 = jsonReader.peek();
                    JsonElement tryBeginNesting$12 = tryBeginNesting$1(jsonReader, peek2);
                    boolean z = tryBeginNesting$12 != null;
                    if (tryBeginNesting$12 == null) {
                        tryBeginNesting$12 = readTerminal$1(jsonReader, peek2);
                    }
                    if (tryBeginNesting$1 instanceof JsonArray) {
                        ((JsonArray) tryBeginNesting$1).add(tryBeginNesting$12);
                    } else {
                        JsonObject jsonObject = (JsonObject) tryBeginNesting$1;
                        if (jsonObject.has(str)) {
                            a$$ExternalSyntheticBUOutline0.m$4(Recorder$$ExternalSyntheticOutline2.m("duplicate key: ", str));
                            return null;
                        }
                        jsonObject.add(str, tryBeginNesting$12);
                    }
                    if (z) {
                        arrayDeque.addLast(tryBeginNesting$1);
                        if (arrayDeque.size() > 100) {
                            a$$ExternalSyntheticBUOutline0.m$4("too many recursions");
                            return null;
                        }
                        tryBeginNesting$1 = tryBeginNesting$12;
                    } else {
                        continue;
                    }
                } else {
                    if (tryBeginNesting$1 instanceof JsonArray) {
                        jsonReader.endArray();
                    } else {
                        jsonReader.endObject();
                    }
                    if (arrayDeque.isEmpty()) {
                        return tryBeginNesting$1;
                    }
                    tryBeginNesting$1 = (JsonElement) arrayDeque.removeLast();
                }
            }
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, JsonElement jsonElement) {
            throw new UnsupportedOperationException("write is not supported");
        }

        public /* synthetic */ JsonElementTypeAdapter(int i) {
            this();
        }
    }
}
