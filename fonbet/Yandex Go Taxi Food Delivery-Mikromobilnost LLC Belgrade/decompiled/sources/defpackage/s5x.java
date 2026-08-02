package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.a;

/* loaded from: classes9.dex */
public final class s5x implements KSerializer {
    public static final s5x a = new s5x();
    public static final KSerializer b;
    public static final SerialDescriptor c;

    static {
        KSerializer serializer = a.Companion.serializer();
        b = serializer;
        c = serializer.getDescriptor();
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        return oab1.j((a) decoder.B(b));
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return c;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.j(oab1.i((r5x) obj), b);
    }
}
