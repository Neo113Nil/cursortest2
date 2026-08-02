package com.google.gson;

import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonWriter;
import defpackage.b6e;
import defpackage.xq0;
import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes3.dex */
public abstract class JsonElement {
    public int a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final JsonArray g() {
        if (this instanceof JsonArray) {
            return (JsonArray) this;
        }
        b6e.u(this, "Not a JSON Array: ");
        return null;
    }

    public final JsonObject m() {
        if (this instanceof JsonObject) {
            return (JsonObject) this;
        }
        b6e.u(this, "Not a JSON Object: ");
        return null;
    }

    public final JsonPrimitive n() {
        if (this instanceof JsonPrimitive) {
            return (JsonPrimitive) this;
        }
        b6e.u(this, "Not a JSON Primitive: ");
        return null;
    }

    public long o() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String q() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.N0(Strictness.a);
            TypeAdapters.z.c(jsonWriter, this);
            return stringWriter.toString();
        } catch (IOException e) {
            xq0.w(e);
            return null;
        }
    }
}
