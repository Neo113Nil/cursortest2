package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* loaded from: classes.dex */
public final class zco implements jv2 {
    public static final Set b = j73.f0(new String[]{"_event_version", "_interfaces"});
    public final pho a;

    public zco(pho phoVar) {
        this.a = phoVar;
    }

    public static LinkedHashMap b(c cVar) {
        Object d;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : cVar.a.entrySet()) {
            if (!b.contains(entry.getKey()) && (d = xsq0.d((b) entry.getValue())) != null) {
                linkedHashMap.put(entry.getKey(), d);
            }
        }
        return linkedHashMap;
    }

    @Override // defpackage.e52
    public final void a(String str, c cVar) {
        Map f;
        try {
            int parseInt = Integer.parseInt(((d) ((b) cVar.get("_event_version"))).a());
            b bVar = (b) cVar.get("_interfaces");
            if (bVar != null && !bVar.equals(JsonNull.INSTANCE)) {
                f = (c) bVar;
                this.a.a(str, b(cVar), parseInt, f);
            }
            f = kotlin.collections.b.f();
            this.a.a(str, b(cVar), parseInt, f);
        } catch (Throwable th) {
            jst.e.k(th, "Tovarisch->EvGen problem");
        }
    }
}
