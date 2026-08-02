package com.google.gson;

import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.StringReader;

/* loaded from: classes3.dex */
public abstract class JsonParser {
    public static JsonElement a(JsonReader jsonReader) {
        Strictness S = jsonReader.S();
        if (S == Strictness.b) {
            jsonReader.O0(Strictness.a);
        }
        try {
            try {
                return Streams.a(jsonReader);
            } finally {
                jsonReader.O0(S);
            }
        } catch (OutOfMemoryError | StackOverflowError e) {
            throw new JsonParseException("Failed parsing JSON source: " + jsonReader + " to Json", e);
        }
    }

    public static JsonElement b(String str) {
        try {
            try {
                JsonReader jsonReader = new JsonReader(new StringReader(str));
                JsonElement a = a(jsonReader);
                try {
                    a.getClass();
                    if (!(a instanceof JsonNull) && jsonReader.H0() != JsonToken.END_DOCUMENT) {
                        throw new JsonSyntaxException("Did not consume the entire document.");
                    }
                    return a;
                } catch (NumberFormatException e) {
                    e = e;
                    throw new JsonSyntaxException(e);
                }
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            }
        } catch (MalformedJsonException | NumberFormatException e3) {
            e = e3;
        }
    }
}
