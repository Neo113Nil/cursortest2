package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.b;

/* loaded from: classes.dex */
public final class wu50 {
    public final LinkedHashMap a;

    public wu50(zu50 zu50Var) {
        Map map = zu50Var.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        this.a = linkedHashMap;
    }

    public final void a(String str, String str2) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        LinkedHashMap linkedHashMap = this.a;
        Object obj = linkedHashMap.get(lowerCase);
        if (obj == null) {
            obj = qv10.w(lowerCase, linkedHashMap);
        }
        ((List) obj).add(str2);
    }

    public final zu50 b() {
        return new zu50(b.t(this.a));
    }

    public final void c(String str) {
        this.a.put("Cache-Control".toLowerCase(Locale.ROOT), scc.i(str));
    }

    public wu50() {
        this.a = new LinkedHashMap();
    }
}
