package defpackage;

import java.util.Arrays;
import java.util.LinkedHashMap;

/* loaded from: classes10.dex */
public final class zwv {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(g0c g0cVar, tls tlsVar) {
        LinkedHashMap linkedHashMap = this.a;
        if (linkedHashMap.containsKey(g0cVar)) {
            kbs.j("A `initializer` with the same `clazz` has already been added: ", g0cVar.c(), 46);
        } else {
            linkedHashMap.put(g0cVar, new cs31(g0cVar, tlsVar));
        }
    }

    public final ywv b() {
        cs31[] cs31VarArr = (cs31[]) this.a.values().toArray(new cs31[0]);
        return new ywv((cs31[]) Arrays.copyOf(cs31VarArr, cs31VarArr.length));
    }
}
