package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.b;

/* loaded from: classes12.dex */
public final class v351 {
    public volatile Map a = b.f();

    public final void a(Map map) {
        synchronized (this) {
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap(b.n(this.a, map));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str = (String) entry.getKey();
                    if (jl40.l((String) entry.getValue(), "null")) {
                        linkedHashMap.remove(str);
                    }
                }
                this.a = linkedHashMap;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
