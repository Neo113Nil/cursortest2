package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes2.dex */
public final class v521 extends jex {
    @Override // defpackage.jex
    public final b a(b bVar) {
        c m = qcx.m(bVar);
        b bVar2 = (b) m.get("trackId");
        b bVar3 = (b) m.get("type");
        Object obj = (b) m.get("payload");
        return new c(kotlin.collections.b.n(aob1.b(new Pair("trackId", bVar2), new Pair("dtoMessageType", bVar3)), obj instanceof c ? (Map) obj : kotlin.collections.b.f()));
    }

    @Override // defpackage.jex
    public final b b(b bVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(qcx.m(bVar));
        return new c(aob1.b(new Pair("type", linkedHashMap.remove("dtoMessageType")), new Pair("trackId", linkedHashMap.remove("trackId")), new Pair("payload", !linkedHashMap.isEmpty() ? new c(linkedHashMap) : null)));
    }
}
