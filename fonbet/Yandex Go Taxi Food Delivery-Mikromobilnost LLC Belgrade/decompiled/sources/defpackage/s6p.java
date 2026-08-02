package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* loaded from: classes2.dex */
public final class s6p implements KSerializer {
    public static final s6p a = new s6p();
    public static final asq0 b = d6z.g("FTSingleValueTransportNode", new SerialDescriptor[0]);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        ncx ncxVar = decoder instanceof ncx ? (ncx) decoder : null;
        if (ncxVar == null) {
            ny61.r("Expected JsonDecoder");
            return null;
        }
        b t = ncxVar.t();
        if (t instanceof c) {
            if (((c) t).containsKey("ft_node_type")) {
                w6p w6pVar = w6p.a;
                return new r6p(w6p.a(t, ncxVar), null, 2);
            }
            m5p.Companion.getClass();
            return new r6p(null, l5p.a(t), 1);
        }
        if ((t instanceof a) || (t instanceof JsonNull) || (t instanceof d)) {
            m5p.Companion.getClass();
            return new r6p(null, l5p.a(t), 1);
        }
        w511.b();
        return null;
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.j((r6p) obj, r6p.Companion.serializer());
    }
}
