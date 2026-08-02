package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonWriter;
import defpackage.b6e;
import defpackage.e7o;
import defpackage.kac;
import defpackage.vz1;
import defpackage.xq0;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class JsonTreeWriter extends JsonWriter {
    public static final Writer r = new Writer() { // from class: com.google.gson.internal.bind.JsonTreeWriter.1
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    };
    public static final JsonPrimitive s = new JsonPrimitive("closed");
    public final ArrayList o;
    public String p;
    public JsonElement q;

    public JsonTreeWriter() {
        super(r);
        this.o = new ArrayList();
        this.q = JsonNull.a;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter H() {
        ArrayList arrayList = this.o;
        if (arrayList.isEmpty() || this.p != null) {
            e7o.n();
            return null;
        }
        if (Y0() instanceof JsonArray) {
            arrayList.remove(arrayList.size() - 1);
            return this;
        }
        e7o.n();
        return null;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter I() {
        ArrayList arrayList = this.o;
        if (arrayList.isEmpty() || this.p != null) {
            e7o.n();
            return null;
        }
        if (Y0() instanceof JsonObject) {
            arrayList.remove(arrayList.size() - 1);
            return this;
        }
        e7o.n();
        return null;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter P0(double d) {
        if (S() || !(Double.isNaN(d) || Double.isInfinite(d))) {
            Z0(new JsonPrimitive(Double.valueOf(d)));
            return this;
        }
        b6e.i(d, "JSON forbids NaN and infinities: ");
        return null;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter Q0(float f) {
        if (S() || !(Float.isNaN(f) || Float.isInfinite(f))) {
            Z0(new JsonPrimitive(Float.valueOf(f)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + f);
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter R0(long j) {
        Z0(new JsonPrimitive(Long.valueOf(j)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter S0(Boolean bool) {
        if (bool == null) {
            Z0(JsonNull.a);
            return this;
        }
        Z0(new JsonPrimitive(bool));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter T0(Number number) {
        if (number == null) {
            Z0(JsonNull.a);
            return this;
        }
        if (!S()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                kac.j(number, "JSON forbids NaN and infinities: ");
                return null;
            }
        }
        Z0(new JsonPrimitive(number));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter U0(String str) {
        if (str == null) {
            Z0(JsonNull.a);
            return this;
        }
        Z0(new JsonPrimitive(str));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter V0(boolean z) {
        Z0(new JsonPrimitive(Boolean.valueOf(z)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter X(String str) {
        throw new UnsupportedOperationException();
    }

    public final JsonElement X0() {
        ArrayList arrayList = this.o;
        if (arrayList.isEmpty()) {
            return this.q;
        }
        b6e.u(arrayList, "Expected one JSON element but was ");
        return null;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter Y(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.o.isEmpty() || this.p != null) {
            xq0.q("Did not expect a name");
            return null;
        }
        if (Y0() instanceof JsonObject) {
            this.p = str;
            return this;
        }
        xq0.q("Please begin an object before writing a name.");
        return null;
    }

    public final JsonElement Y0() {
        return (JsonElement) vz1.m(this.o, 1);
    }

    public final void Z0(JsonElement jsonElement) {
        if (this.p != null) {
            if (!(jsonElement instanceof JsonNull) || P()) {
                ((JsonObject) Y0()).r(this.p, jsonElement);
            }
            this.p = null;
            return;
        }
        if (this.o.isEmpty()) {
            this.q = jsonElement;
            return;
        }
        JsonElement Y0 = Y0();
        if (Y0 instanceof JsonArray) {
            ((JsonArray) Y0).r(jsonElement);
        } else {
            e7o.n();
        }
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = this.o;
        if (arrayList.isEmpty()) {
            arrayList.add(s);
        } else {
            kac.f("Incomplete document");
        }
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Flushable
    public final void flush() {
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter l0() {
        Z0(JsonNull.a);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter o() {
        JsonArray jsonArray = new JsonArray();
        Z0(jsonArray);
        this.o.add(jsonArray);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter z() {
        JsonObject jsonObject = new JsonObject();
        Z0(jsonObject);
        this.o.add(jsonObject);
        return this;
    }
}
