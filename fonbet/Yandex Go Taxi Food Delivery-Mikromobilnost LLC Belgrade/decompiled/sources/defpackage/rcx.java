package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* loaded from: classes9.dex */
public final class rcx implements KSerializer {
    public static final rcx a = new rcx();
    public static final asq0 b = d6z.h("kotlinx.serialization.json.JsonElement", r5e0.g, new SerialDescriptor[0], new p0u(9));

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        return y5e.e(decoder).t();
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        b bVar = (b) obj;
        y5e.f(encoder);
        if (bVar instanceof d) {
            encoder.j(bVar, udx.a);
            return;
        }
        if (bVar instanceof c) {
            encoder.j(bVar, mdx.a);
        } else if (bVar instanceof a) {
            encoder.j(bVar, zbx.a);
        } else {
            w511.b();
        }
    }
}
