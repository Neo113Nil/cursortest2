package com.nimbusds.jose.shaded.gson;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.nimbusds.jose.shaded.gson.internal.bind.TypeAdapters;
import com.nimbusds.jose.shaded.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes5.dex */
public abstract class JsonElement {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.strictness = 1;
            TypeAdapters.JSON_ELEMENT.getClass();
            TypeAdapters.AnonymousClass1.write(jsonWriter, this);
            return stringWriter.toString();
        } catch (IOException e) {
            a$$ExternalSyntheticBUOutline0.m$1(e);
            return null;
        }
    }
}
