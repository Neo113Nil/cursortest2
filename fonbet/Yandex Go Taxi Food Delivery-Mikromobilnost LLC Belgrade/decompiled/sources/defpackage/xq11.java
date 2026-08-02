package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes9.dex */
public final class xq11 implements KSerializer {
    public static final xq11 a = new xq11();
    public static final exv b = uh6.c("kotlin.UInt", h6w.a);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        return new tq11(decoder.w(b).u());
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.i(b).q(((tq11) obj).a);
    }
}
