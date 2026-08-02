package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes9.dex */
public final class tr11 implements KSerializer {
    public static final tr11 a = new tr11();
    public static final exv b = uh6.c("kotlin.UShort", wvr0.a);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        return new pr11(decoder.w(b).l());
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.i(b).k(((pr11) obj).a);
    }
}
