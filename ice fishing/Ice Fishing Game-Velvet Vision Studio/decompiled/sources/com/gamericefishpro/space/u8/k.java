package com.gamericefishpro.space.u8;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements com.gamericefishpro.space.v8.d {
    public final WeakReference a;
    public final com.gamericefishpro.space.t8.c b;
    public final boolean c;

    public k(r rVar, com.gamericefishpro.space.t8.c cVar, boolean z) {
        this.a = new WeakReference(rVar);
        this.b = cVar;
        this.c = z;
    }

    @Override // com.gamericefishpro.space.v8.d
    public final void a(com.gamericefishpro.space.s8.b bVar) {
        r rVar = (r) this.a.get();
        if (rVar == null) {
            return;
        }
        Lock lock = rVar.e;
        com.gamericefishpro.space.v8.c0.i("onReportServiceBinding must be called on the GoogleApiClient handler thread", Looper.myLooper() == rVar.d.p.g);
        lock.lock();
        try {
            if (rVar.j(0)) {
                if (!bVar.c()) {
                    rVar.f(bVar, this.b, this.c);
                }
                if (rVar.k()) {
                    rVar.h();
                }
            }
        } finally {
            lock.unlock();
        }
    }
}
