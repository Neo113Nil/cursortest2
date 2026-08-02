package defpackage;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class rhb implements nnr, t0n {
    public final HashMap a;
    public ArrayDeque b;
    public final sft c;

    public rhb() {
        sft sftVar = sft.a;
        this.a = new HashMap();
        this.b = new ArrayDeque();
        this.c = sftVar;
    }

    public final void a(kac kacVar) {
        sft sftVar = this.c;
        synchronized (this) {
            try {
                sftVar.getClass();
                if (!this.a.containsKey(x97.class)) {
                    this.a.put(x97.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.a.get(x97.class)).put(kacVar, sftVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
