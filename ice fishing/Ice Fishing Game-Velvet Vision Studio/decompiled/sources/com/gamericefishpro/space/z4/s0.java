package com.gamericefishpro.space.z4;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s0 {
    public final com.gamericefishpro.space.e5.d a = new com.gamericefishpro.space.e5.d();

    public final void a(String key, AutoCloseable closeable) {
        AutoCloseable autoCloseable;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        com.gamericefishpro.space.e5.d dVar = this.a;
        if (dVar != null) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(closeable, "closeable");
            if (dVar.d) {
                com.gamericefishpro.space.e5.d.a(closeable);
                return;
            }
            synchronized (dVar.a) {
                autoCloseable = (AutoCloseable) dVar.b.put(key, closeable);
            }
            com.gamericefishpro.space.e5.d.a(autoCloseable);
        }
    }

    public final void b() {
        com.gamericefishpro.space.e5.d dVar = this.a;
        if (dVar != null && !dVar.d) {
            dVar.d = true;
            synchronized (dVar.a) {
                try {
                    Iterator it = dVar.b.values().iterator();
                    while (it.hasNext()) {
                        com.gamericefishpro.space.e5.d.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = dVar.c.iterator();
                    while (it2.hasNext()) {
                        com.gamericefishpro.space.e5.d.a((AutoCloseable) it2.next());
                    }
                    dVar.c.clear();
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String key) {
        AutoCloseable autoCloseable;
        Intrinsics.checkNotNullParameter(key, "key");
        com.gamericefishpro.space.e5.d dVar = this.a;
        if (dVar == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (dVar.a) {
            autoCloseable = (AutoCloseable) dVar.b.get(key);
        }
        return autoCloseable;
    }

    public void d() {
    }
}
