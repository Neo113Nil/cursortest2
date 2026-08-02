package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public abstract class jto {
    static {
        Long.getLong("rx2.scheduler.drift-tolerance", 15L).longValue();
    }

    public abstract ito a();

    public ka8 b(Runnable runnable) {
        return c(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public ka8 c(Runnable runnable, long j, TimeUnit timeUnit) {
        ito a = a();
        up6.L(runnable, "run is null");
        hto htoVar = new hto(runnable, a);
        a.b(htoVar, j, timeUnit);
        return htoVar;
    }
}
