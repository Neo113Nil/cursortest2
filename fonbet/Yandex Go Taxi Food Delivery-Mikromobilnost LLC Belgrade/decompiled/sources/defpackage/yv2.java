package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.json.c;

/* loaded from: classes2.dex */
public final class yv2 implements tv2 {
    public final lir a;

    public yv2(lir lirVar) {
        this.a = lirVar;
    }

    @Override // defpackage.tv2
    public final void a(String str, c cVar) {
        Map t = b.t(cVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(t.size()));
        for (Map.Entry entry : t.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.toString());
        }
        this.a.a(new kir(str, linkedHashMap));
    }

    @Override // defpackage.tv2
    public final void b(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.toString());
        }
        this.a.a(new kir("FeedSDKEventBox", linkedHashMap));
    }
}
