package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes9.dex */
public final class qq11 implements KSerializer {
    public static final qq11 a = new qq11();
    public static final exv b = uh6.c("kotlin.UByte", m77.a);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        return new lq11(decoder.w(b).F());
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.i(b).encodeByte(((lq11) obj).a);
    }
}
