package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes9.dex */
public final class z96 implements KSerializer {
    public static final z96 a = new z96();
    public static final o2f0 b = new o2f0("kotlin.Boolean", h2f0.g);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        return Boolean.valueOf(decoder.z());
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.l(((Boolean) obj).booleanValue());
    }
}
