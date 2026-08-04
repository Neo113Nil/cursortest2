package com.gamericefishpro.space.u8;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements com.gamericefishpro.space.t8.f, com.gamericefishpro.space.t8.g {
    public final /* synthetic */ r d;

    public /* synthetic */ p(r rVar) {
        this.d = rVar;
    }

    @Override // com.gamericefishpro.space.t8.f
    public final void onConnected(Bundle bundle) {
        r rVar = this.d;
        com.gamericefishpro.space.v8.c0.g(rVar.K);
        com.gamericefishpro.space.p9.a aVar = rVar.D;
        com.gamericefishpro.space.v8.c0.g(aVar);
        aVar.B(new o(rVar));
    }

    @Override // com.gamericefishpro.space.t8.g
    public final void onConnectionFailed(com.gamericefishpro.space.s8.b bVar) {
        r rVar = this.d;
        Lock lock = rVar.e;
        lock.lock();
        try {
            if (rVar.E && !bVar.b()) {
                rVar.a();
                rVar.h();
            } else {
                rVar.e(bVar);
            }
        } finally {
            lock.unlock();
        }
    }

    @Override // com.gamericefishpro.space.t8.f
    public final void onConnectionSuspended(int i) {
    }
}
