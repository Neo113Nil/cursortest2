package com.gamericefishpro.space.wa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements com.gamericefishpro.space.u8.b {
    public static final AtomicReference a = new AtomicReference();

    @Override // com.gamericefishpro.space.u8.b
    public final void a(boolean z) {
        synchronized (g.j) {
            try {
                ArrayList arrayList = new ArrayList(g.k.values());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    g gVar = (g) obj;
                    if (gVar.e.get()) {
                        Iterator it = gVar.i.iterator();
                        while (it.hasNext()) {
                            g gVar2 = ((d) it.next()).a;
                            if (!z) {
                                ((com.gamericefishpro.space.lb.d) gVar2.h.get()).b();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
