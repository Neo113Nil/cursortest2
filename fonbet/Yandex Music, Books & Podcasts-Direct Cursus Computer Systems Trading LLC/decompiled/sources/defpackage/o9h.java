package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class o9h implements rzm {
    public static final /* synthetic */ int b = 0;
    public final Map a;

    static {
        toe.a(Collections.EMPTY_MAP);
    }

    public o9h(LinkedHashMap linkedHashMap) {
        this.a = Collections.unmodifiableMap(linkedHashMap);
    }

    @Override // defpackage.szm
    public final Object get() {
        Map map = this.a;
        LinkedHashMap J = ff7.J(map.size());
        for (Map.Entry entry : map.entrySet()) {
            J.put(entry.getKey(), ((rzm) entry.getValue()).get());
        }
        return Collections.unmodifiableMap(J);
    }
}
