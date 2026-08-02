package com.google.gson.internal.bind;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class JsonTreeWriter extends JsonWriter {
    private String pendingName;
    private JsonElement product;
    private final List<JsonElement> stack;
    private static final Writer UNWRITABLE_WRITER = new Writer() { // from class: com.google.gson.internal.bind.JsonTreeWriter.1
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    };
    private static final JsonPrimitive SENTINEL_CLOSED = new JsonPrimitive("closed");

    public JsonTreeWriter() {
        super(UNWRITABLE_WRITER);
        this.stack = new ArrayList();
        this.product = JsonNull.INSTANCE;
    }

    private JsonElement peek() {
        return this.stack.get(r1.size() - 1);
    }

    private void put(JsonElement jsonElement) {
        if (this.pendingName != null) {
            if (!jsonElement.isJsonNull() || getSerializeNulls()) {
                ((JsonObject) peek()).add(this.pendingName, jsonElement);
            }
            this.pendingName = null;
            return;
        }
        if (this.stack.isEmpty()) {
            this.product = jsonElement;
            return;
        }
        JsonElement peek = peek();
        if (peek instanceof JsonArray) {
            ((JsonArray) peek).add(jsonElement);
        } else {
            Path$$ExternalSyntheticBUOutline0.m();
        }
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter beginArray() {
        JsonArray jsonArray = new JsonArray();
        put(jsonArray);
        this.stack.add(jsonArray);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter beginObject() {
        JsonObject jsonObject = new JsonObject();
        put(jsonObject);
        this.stack.add(jsonObject);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.stack.isEmpty()) {
            this.stack.add(SENTINEL_CLOSED);
        } else {
            a$$ExternalSyntheticBUOutline0.m$4("Incomplete document");
        }
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter endArray() {
        if (this.stack.isEmpty() || this.pendingName != null) {
            Path$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        if (!(peek() instanceof JsonArray)) {
            Path$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        this.stack.remove(r0.size() - 1);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter endObject() {
        if (this.stack.isEmpty() || this.pendingName != null) {
            Path$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        if (!(peek() instanceof JsonObject)) {
            Path$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        this.stack.remove(r0.size() - 1);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Flushable
    public void flush() {
    }

    public JsonElement get() {
        if (this.stack.isEmpty()) {
            return this.product;
        }
        a$$ExternalSyntheticBUOutline0.m$2(this.stack, "Expected one JSON element but was ");
        return null;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter jsonValue(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter name(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.stack.isEmpty() || this.pendingName != null) {
            a$$ExternalSyntheticBUOutline0.m$1("Did not expect a name");
            return null;
        }
        if (peek() instanceof JsonObject) {
            this.pendingName = str;
            return this;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Please begin an object before writing a name.");
        return null;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter nullValue() {
        put(JsonNull.INSTANCE);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(Number number) {
        if (number == null) {
            return nullValue();
        }
        if (!isLenient()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                OptionalProvider$$ExternalSyntheticLambda0.m((Object) number, "JSON forbids NaN and infinities: ");
                return null;
            }
        }
        put(new JsonPrimitive(number));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(boolean z) {
        put(new JsonPrimitive(Boolean.valueOf(z)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(Boolean bool) {
        if (bool == null) {
            return nullValue();
        }
        put(new JsonPrimitive(bool));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(float f) {
        if (!isLenient() && (Float.isNaN(f) || Float.isInfinite(f))) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("JSON forbids NaN and infinities: ", f);
            return null;
        }
        put(new JsonPrimitive(Float.valueOf(f)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(double d) {
        if (!isLenient() && (Double.isNaN(d) || Double.isInfinite(d))) {
            OptionalProvider$$ExternalSyntheticLambda0.m("JSON forbids NaN and infinities: ", d);
            return null;
        }
        put(new JsonPrimitive(Double.valueOf(d)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(long j) {
        put(new JsonPrimitive(Long.valueOf(j)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public JsonWriter value(String str) {
        if (str == null) {
            return nullValue();
        }
        put(new JsonPrimitive(str));
        return this;
    }
}
