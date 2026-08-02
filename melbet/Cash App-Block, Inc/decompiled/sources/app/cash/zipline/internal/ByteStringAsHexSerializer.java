package app.cash.zipline.internal;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind$INT;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PrimitiveSerialDescriptor;
import okhttp3.internal.Tags;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class ByteStringAsHexSerializer implements KSerializer {
    public static final ByteStringAsHexSerializer INSTANCE = new ByteStringAsHexSerializer();
    public static final PrimitiveSerialDescriptor descriptor = Tags.PrimitiveSerialDescriptor("ByteString", PrimitiveKind$INT.INSTANCE$8);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        ByteString.Companion companion = ByteString.Companion;
        return ByteString.Companion.decodeHex(decoder.decodeString());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ByteString byteString = (ByteString) obj;
        byteString.getClass();
        encoder.encodeString(byteString.hex());
    }
}
