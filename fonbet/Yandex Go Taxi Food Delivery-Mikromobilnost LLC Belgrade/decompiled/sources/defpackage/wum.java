package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.builders.MapBuilder;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* loaded from: classes12.dex */
public final class wum implements KSerializer {
    public static final wum a = new wum();
    public static final asq0 b = d6z.g("DtoNode", new SerialDescriptor[0]);

    /* JADX WARN: Multi-variable type inference failed */
    public static sum a(b bVar, ncx ncxVar) {
        if (bVar instanceof c) {
            c cVar = (c) bVar;
            boolean containsKey = cVar.containsKey("ft_node_type");
            if (containsKey) {
                q131 q131Var = q131.a;
                return q131.a(bVar, ncxVar);
            }
            if (containsKey) {
                w511.b();
                return null;
            }
            MapBuilder mapBuilder = new MapBuilder();
            cVar.forEach(new th5(5, new mjf(26, mapBuilder, ncxVar)));
            return new qum(mapBuilder.j());
        }
        if (bVar instanceof a) {
            Iterable iterable = (Iterable) bVar;
            ArrayList arrayList = new ArrayList(tcc.n(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(a((b) it.next(), ncxVar));
            }
            return new num(arrayList);
        }
        if (bVar instanceof JsonNull) {
            return pum.a;
        }
        if (bVar instanceof d) {
            return new rum(bVar);
        }
        w511.b();
        return null;
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        ncx ncxVar = decoder instanceof ncx ? (ncx) decoder : null;
        if (ncxVar != null) {
            return a(ncxVar.t(), ncxVar);
        }
        ny61.r("Expected JsonDecoder");
        return null;
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.j((sum) obj, sum.Companion.serializer());
    }
}
