package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* loaded from: classes4.dex */
public final class z1t0 implements KSerializer {
    public static final z1t0 a = new z1t0();

    public static ruw a(b bVar) {
        if (bVar == null) {
            return new ruw(15, null);
        }
        if (bVar instanceof c) {
            return (ruw) sbx.d.a(ruw.Companion.serializer(), bVar);
        }
        if (bVar instanceof d) {
            return new ruw(7, avu0.j(qcx.n(bVar).a()));
        }
        ny61.g(qv10.l(bVar.getClass(), "Unexpected element "));
        return null;
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        b t = ((ncx) decoder).t();
        c cVar = t instanceof c ? (c) t : null;
        return new y1t0(a(cVar != null ? (b) cVar.get("intervalStart") : null), a(cVar != null ? (b) cVar.get("intervalEnd") : null));
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return d6z.f("SnappingInterval", new SerialDescriptor[0], new ukr0(27));
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        y1t0.Companion.serializer().serialize(encoder, (y1t0) obj);
    }
}
