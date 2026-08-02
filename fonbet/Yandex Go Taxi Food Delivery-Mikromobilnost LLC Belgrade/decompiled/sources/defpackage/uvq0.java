package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public abstract class uvq0 {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public final Object a(String str) {
        svq0 svq0Var = new svq0(str);
        ConcurrentHashMap concurrentHashMap = this.a;
        Object obj = concurrentHashMap.get(svq0Var);
        if (obj != null) {
            return obj;
        }
        Object a = b().a(str);
        Object putIfAbsent = concurrentHashMap.putIfAbsent(svq0Var, a);
        return putIfAbsent == null ? a : putIfAbsent;
    }

    public abstract tvq0 b();
}
