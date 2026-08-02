package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes9.dex */
public final class wa7 implements KSerializer {
    public static final wa7 a = new wa7();
    public static final SerialDescriptor b = c.Companion.serializer().getDescriptor();

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        ncx ncxVar = decoder instanceof ncx ? (ncx) decoder : null;
        if (ncxVar == null) {
            yci0.m("CacheAwareTypedExperiments can be deserialized only from JSON");
            return null;
        }
        b t = ncxVar.t();
        c cVar = t instanceof c ? (c) t : null;
        EmptyList emptyList = EmptyList.a;
        if (cVar == null) {
            return new xa7(emptyList, false);
        }
        Object obj = cVar.get("items");
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar == null) {
            return new xa7(emptyList, true);
        }
        try {
            return new xa7((List) ncxVar.d().a(new p53(ncxVar.a().b(qoi0.a(un11.class), emptyList), 0), aVar), true);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            throw new SerializationException("Failed to decode cached typed experiments", e2);
        }
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.y();
    }
}
