package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes9.dex */
public final class xf90 implements KSerializer {
    public final sf90 a = new sf90();

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        throw new IllegalStateException("ParsingContext is fake serializer");
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        throw new IllegalStateException("ParsingContext is fake serializer");
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        throw new IllegalStateException("ParsingContext is fake serializer");
    }
}
