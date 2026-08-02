package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonDecodingException;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.d;

/* loaded from: classes9.dex */
public final class udx implements KSerializer {
    public static final udx a = new udx();
    public static final asq0 b = d6z.i("kotlinx.serialization.json.JsonPrimitive", h2f0.o, new SerialDescriptor[0]);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        ncx e = y5e.e(decoder);
        b t = e.t();
        if (t instanceof d) {
            return (d) t;
        }
        String str = "Unexpected JSON element, expected JsonPrimitive, had " + qoi0.a(t.getClass());
        String obj = e.d().a.n ? qje.G(-1, t.toString()).toString() : null;
        throw new JsonDecodingException(qje.n(-1, str, null, null, obj), str, null, obj, -1, null);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        d dVar = (d) obj;
        y5e.f(encoder);
        if (dVar instanceof JsonNull) {
            encoder.j(JsonNull.INSTANCE, gdx.a);
        } else {
            encoder.j((adx) dVar, bdx.a);
        }
    }
}
