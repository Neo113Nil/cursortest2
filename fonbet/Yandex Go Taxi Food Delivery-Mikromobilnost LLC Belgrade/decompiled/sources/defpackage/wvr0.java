package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes9.dex */
public final class wvr0 implements KSerializer {
    public static final wvr0 a = new wvr0();
    public static final o2f0 b = new o2f0("kotlin.Short", h2f0.n);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        return Short.valueOf(decoder.l());
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.k(((Number) obj).shortValue());
    }
}
