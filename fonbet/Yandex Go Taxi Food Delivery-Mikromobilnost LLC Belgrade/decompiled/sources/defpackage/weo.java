package defpackage;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class weo implements vzu0, xyf0 {
    public final HashMap a = new HashMap();
    public ArrayDeque b = new ArrayDeque();
    public final Executor c;

    public weo(Executor executor) {
        this.c = executor;
    }

    public final synchronized void a(Executor executor, kfo kfoVar) {
        try {
            executor.getClass();
            if (!this.a.containsKey(vng.class)) {
                this.a.put(vng.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.a.get(vng.class)).put(kfoVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}
