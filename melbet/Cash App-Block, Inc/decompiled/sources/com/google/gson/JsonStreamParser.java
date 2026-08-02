package com.google.gson;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class JsonStreamParser implements Iterator<JsonElement> {
    private final Object lock;
    private final JsonReader parser;

    public JsonStreamParser(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        this.parser = jsonReader;
        jsonReader.setStrictness(Strictness.LENIENT);
        this.lock = new Object();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        boolean z;
        synchronized (this.lock) {
            try {
                try {
                    try {
                        z = this.parser.peek() != JsonToken.END_DOCUMENT;
                    } catch (IOException e) {
                        throw new JsonIOException(e);
                    }
                } catch (MalformedJsonException e2) {
                    throw new JsonSyntaxException(e2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public JsonElement next() {
        if (!hasNext()) {
            a$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        try {
            return Streams.parse(this.parser);
        } catch (OutOfMemoryError | StackOverflowError e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Failed parsing JSON source to Json", e);
            return null;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public JsonStreamParser(String str) {
        this(new StringReader(str));
    }
}
