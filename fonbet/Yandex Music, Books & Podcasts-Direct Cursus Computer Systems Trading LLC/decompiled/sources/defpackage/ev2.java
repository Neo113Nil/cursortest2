package defpackage;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class ev2 extends InheritableThreadLocal {
    @Override // java.lang.InheritableThreadLocal
    public final Object childValue(Object obj) {
        Map map = (Map) obj;
        if (map == null) {
            return null;
        }
        return new HashMap(map);
    }
}
