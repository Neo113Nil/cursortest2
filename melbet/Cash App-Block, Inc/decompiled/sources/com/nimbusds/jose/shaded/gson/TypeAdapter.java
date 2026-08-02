package com.nimbusds.jose.shaded.gson;

import com.nimbusds.jose.shaded.gson.stream.JsonReader;
import com.nimbusds.jose.shaded.gson.stream.JsonWriter;

/* loaded from: classes5.dex */
public abstract class TypeAdapter {

    public final class NullSafeTypeAdapter extends TypeAdapter {
        public NullSafeTypeAdapter() {
        }

        @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
        public final Object read(JsonReader jsonReader) {
            if (jsonReader.peek() != 9) {
                return TypeAdapter.this.read(jsonReader);
            }
            jsonReader.nextNull();
            return null;
        }

        public final String toString() {
            return "NullSafeTypeAdapter[" + TypeAdapter.this + "]";
        }

        @Override // com.nimbusds.jose.shaded.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, Object obj) {
            if (obj == null) {
                jsonWriter.nullValue();
            } else {
                TypeAdapter.this.write(jsonWriter, obj);
            }
        }
    }

    public final NullSafeTypeAdapter nullSafe() {
        return !(this instanceof NullSafeTypeAdapter) ? new NullSafeTypeAdapter() : (NullSafeTypeAdapter) this;
    }

    public abstract Object read(JsonReader jsonReader);

    public abstract void write(JsonWriter jsonWriter, Object obj);
}
