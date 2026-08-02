package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class k2b {
    public final mib a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public k2b(mib mibVar) {
        this.a = mibVar;
    }

    public final void a(int i, f6q f6qVar) {
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.b.get(Integer.valueOf(i));
        if (atomicBoolean == null || !atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        etn.M(this.a, "effect_lost_control", new j2b(i, f6qVar, 0));
    }

    public final void b(int i, f6q f6qVar) {
        if (this.b.putIfAbsent(Integer.valueOf(i), new AtomicBoolean(false)) == null) {
            etn.M(this.a, "effects_session_applied", new j2b(i, f6qVar, 1));
        }
    }
}
