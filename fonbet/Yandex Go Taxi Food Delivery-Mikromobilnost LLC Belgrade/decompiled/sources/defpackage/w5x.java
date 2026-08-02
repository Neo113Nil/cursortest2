package defpackage;

import kotlin.Pair;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes9.dex */
public final class w5x implements KSerializer {
    public static final w5x a = new w5x();
    public static final KSerializer b;
    public static final SerialDescriptor c;

    static {
        KSerializer serializer = c.Companion.serializer();
        b = serializer;
        c = serializer.getDescriptor();
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        c cVar = (c) decoder.B(b);
        Object obj = cVar.get("name");
        if (obj == null) {
            ny61.g("Name field is missing");
            return null;
        }
        String a2 = qcx.n((b) obj).a();
        Object obj2 = cVar.get("text");
        if (obj2 == null) {
            ny61.g("Text field is missing");
            return null;
        }
        char[] charArray = qcx.n((b) obj2).a().toCharArray();
        b bVar = (b) cVar.get("props");
        return new v5x(a2, charArray, bVar != null ? cma1.M0(qcx.m(bVar)) : kotlin.collections.b.f());
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return c;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        v5x v5xVar = (v5x) obj;
        encoder.j(new c(kotlin.collections.b.i(new Pair("name", qcx.c(v5xVar.a)), new Pair("text", qcx.c(new String(v5xVar.b))), new Pair("props", cma1.R0(v5xVar.c)))), b);
    }
}
