package defpackage;

import kotlin.time.Instant;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes9.dex */
public final class t3w implements KSerializer {
    public static final t3w a = new t3w();
    public static final o2f0 b = new o2f0("kotlin.time.Instant", h2f0.o);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        Instant instant = Instant.a;
        return ej91.d(decoder.p()).toInstant();
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.t(ej91.c((Instant) obj));
    }
}
