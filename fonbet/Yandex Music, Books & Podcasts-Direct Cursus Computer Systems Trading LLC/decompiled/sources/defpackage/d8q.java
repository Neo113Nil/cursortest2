package defpackage;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class d8q {
    public static final d8q d = new d8q(new dxl());
    public final IdentityHashMap a = new IdentityHashMap();
    public final dxl b;
    public ScheduledExecutorService c;

    public d8q(dxl dxlVar) {
        this.b = dxlVar;
    }

    public static Object a(c8q c8qVar) {
        Object obj;
        d8q d8qVar = d;
        synchronized (d8qVar) {
            try {
                b8q b8qVar = (b8q) d8qVar.a.get(c8qVar);
                if (b8qVar == null) {
                    b8qVar = new b8q(c8qVar.f());
                    d8qVar.a.put(c8qVar, b8qVar);
                }
                ScheduledFuture scheduledFuture = b8qVar.c;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    b8qVar.c = null;
                }
                b8qVar.b++;
                obj = b8qVar.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public static void b(c8q c8qVar, Object obj) {
        d8q d8qVar = d;
        synchronized (d8qVar) {
            try {
                b8q b8qVar = (b8q) d8qVar.a.get(c8qVar);
                if (b8qVar == null) {
                    throw new IllegalArgumentException("No cached instance found for " + c8qVar);
                }
                o2g.J("Releasing the wrong instance", obj == b8qVar.a);
                o2g.U("Refcount has already reached zero", b8qVar.b > 0);
                int i = b8qVar.b - 1;
                b8qVar.b = i;
                if (i == 0) {
                    o2g.U("Destroy task already scheduled", b8qVar.c == null);
                    if (d8qVar.c == null) {
                        d8qVar.b.getClass();
                        d8qVar.c = Executors.newSingleThreadScheduledExecutor(xqd.e("grpc-shared-destroyer-%d"));
                    }
                    b8qVar.c = d8qVar.c.schedule(new arg(new t5(d8qVar, b8qVar, c8qVar, obj, 10)), 1L, TimeUnit.SECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
