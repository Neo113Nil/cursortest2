package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes9.dex */
public final class u6x implements KSerializer {
    public static final u6x a = new u6x();
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
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(cVar.a.size()));
        for (Map.Entry entry : cVar.a.entrySet()) {
            linkedHashMap.put(entry.getKey(), uh6.V((b) entry.getValue()));
        }
        return new s6x(linkedHashMap);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return c;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        KSerializer kSerializer = b;
        Map map = ((s6x) obj).a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), uh6.S((q6x) entry.getValue()));
        }
        encoder.j(new c(linkedHashMap), kSerializer);
    }
}
