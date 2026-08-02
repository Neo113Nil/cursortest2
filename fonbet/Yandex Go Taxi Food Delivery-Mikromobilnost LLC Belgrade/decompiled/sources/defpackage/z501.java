package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class z501 {
    public final pzf a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public z501(pzf pzfVar) {
        this.a = pzfVar;
    }

    public final kbg a(String str) {
        ConcurrentHashMap concurrentHashMap = this.b;
        Object obj = concurrentHashMap.get(str);
        if (obj == null) {
            f801 f801Var = new f801(str);
            pzf pzfVar = this.a;
            pzfVar.getClass();
            kbg kbgVar = new kbg(pzfVar, f801Var);
            Object putIfAbsent = concurrentHashMap.putIfAbsent(str, kbgVar);
            obj = putIfAbsent == null ? kbgVar : putIfAbsent;
        }
        return (kbg) obj;
    }
}
