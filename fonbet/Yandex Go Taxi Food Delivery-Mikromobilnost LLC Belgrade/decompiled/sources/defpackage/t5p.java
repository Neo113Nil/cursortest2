package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
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
public final class t5p implements KSerializer {
    public static final t5p a = new t5p();
    public static final asq0 b = d6z.g("FTDtoTransportNode", new SerialDescriptor[0]);

    /* JADX WARN: Multi-variable type inference failed */
    public static s5p a(b bVar, ncx ncxVar) {
        if (bVar instanceof c) {
            if (((c) bVar).containsKey("ft_node_type")) {
                w6p w6pVar = w6p.a;
                return new s5p(w6p.a(bVar, ncxVar), null, null, null, 14);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((Map) bVar).entrySet()) {
                linkedHashMap.put((String) entry.getKey(), a((b) entry.getValue(), ncxVar));
            }
            return new s5p(null, linkedHashMap, null, null, 13);
        }
        if (bVar instanceof a) {
            Iterable iterable = (Iterable) bVar;
            ArrayList arrayList = new ArrayList(tcc.n(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(a((b) it.next(), ncxVar));
            }
            return new s5p(null, null, arrayList, null, 11);
        }
        if (bVar instanceof JsonNull) {
            return new s5p(null, null, null, new m5p(null), 7);
        }
        if (bVar instanceof d) {
            m5p.Companion.getClass();
            return new s5p(null, null, null, l5p.a(bVar), 7);
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
        encoder.j((s5p) obj, s5p.Companion.serializer());
    }
}
