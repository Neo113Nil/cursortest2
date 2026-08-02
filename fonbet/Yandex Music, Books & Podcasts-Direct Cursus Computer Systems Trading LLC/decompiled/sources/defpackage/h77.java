package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class h77 {
    public static volatile h77 b;
    public static final AtomicReference c = new AtomicReference();
    public final ConcurrentHashMap a = new ConcurrentHashMap(20);

    public static h77 a() {
        if (b == null) {
            synchronized (h77.class) {
                try {
                    if (b == null) {
                        b = new h77();
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public final i77 b(p2f p2fVar) {
        ConcurrentHashMap concurrentHashMap = this.a;
        i77 i77Var = (i77) concurrentHashMap.get(p2fVar);
        if (i77Var != null) {
            return i77Var;
        }
        if (c.get() == null) {
            concurrentHashMap.putIfAbsent(p2fVar, new g77(p2fVar));
            return (i77) concurrentHashMap.get(p2fVar);
        }
        l1j.f();
        return null;
    }
}
