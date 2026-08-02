package app.cash.zipline.internal.bridge;

import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.PrimitiveKind$INT;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PrimitiveSerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonDecodingException;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import okhttp3.internal.Tags;

/* loaded from: classes3.dex */
public final class LongSerializer implements KSerializer {
    public static final LongSerializer INSTANCE = new LongSerializer();
    public static final PrimitiveSerialDescriptor descriptor = Tags.PrimitiveSerialDescriptor("LongSerializer", PrimitiveKind$INT.INSTANCE$6);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        JsonElement decodeJsonElement = ((JsonDecoder) decoder).decodeJsonElement();
        if ((decodeJsonElement instanceof JsonArray) || (decodeJsonElement instanceof JsonObject) || Intrinsics.areEqual(decodeJsonElement, JsonNull.INSTANCE)) {
            throw new SerializationException("expected a Long");
        }
        if (!(decodeJsonElement instanceof JsonPrimitive)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        try {
            return Long.valueOf(JsonElementKt.parseLongImpl((JsonPrimitive) decodeJsonElement));
        } catch (JsonDecodingException e) {
            throw new NumberFormatException(e.message);
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        long longValue = ((Number) obj).longValue();
        if (-9007199254740991L > longValue || longValue >= 9007199254740992L) {
            encoder.encodeString(String.valueOf(longValue));
        } else {
            encoder.encodeLong(longValue);
        }
    }
}
