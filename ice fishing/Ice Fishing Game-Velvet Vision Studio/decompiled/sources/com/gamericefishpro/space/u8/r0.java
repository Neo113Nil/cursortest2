package com.gamericefishpro.space.u8;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements com.gamericefishpro.space.t8.f, com.gamericefishpro.space.t8.g {
    public final com.gamericefishpro.space.t8.c d;
    public final boolean e;
    public x f;

    public r0(com.gamericefishpro.space.t8.c cVar, boolean z) {
        this.d = cVar;
        this.e = z;
    }

    @Override // com.gamericefishpro.space.t8.f
    public final void onConnected(Bundle bundle) {
        com.gamericefishpro.space.v8.c0.h(this.f, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.f.onConnected(bundle);
    }

    @Override // com.gamericefishpro.space.t8.g
    public final void onConnectionFailed(com.gamericefishpro.space.s8.b bVar) {
        com.gamericefishpro.space.t8.c cVar = this.d;
        boolean z = this.e;
        com.gamericefishpro.space.v8.c0.h(this.f, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        x xVar = this.f;
        xVar.d.lock();
        try {
            xVar.n.p(bVar, cVar, z);
        } finally {
            xVar.d.unlock();
        }
    }

    @Override // com.gamericefishpro.space.t8.f
    public final void onConnectionSuspended(int i) {
        com.gamericefishpro.space.v8.c0.h(this.f, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.f.onConnectionSuspended(i);
    }
}
