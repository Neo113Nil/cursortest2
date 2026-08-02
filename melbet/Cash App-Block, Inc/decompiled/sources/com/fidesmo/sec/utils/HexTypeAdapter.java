package com.fidesmo.sec.utils;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

/* loaded from: classes4.dex */
public class HexTypeAdapter implements JsonSerializer<byte[]>, JsonDeserializer<byte[]> {
    @Override // com.google.gson.JsonDeserializer
    public byte[] deserialize(JsonElement jsonElement, Type type2, JsonDeserializationContext jsonDeserializationContext) {
        try {
            return Hex.decodeHex(jsonElement.getAsString());
        } catch (IllegalArgumentException e) {
            throw new JsonParseException(e);
        }
    }

    @Override // com.google.gson.JsonSerializer
    public JsonElement serialize(byte[] bArr, Type type2, JsonSerializationContext jsonSerializationContext) {
        return new JsonPrimitive(Hex.encodeHex(bArr));
    }
}
