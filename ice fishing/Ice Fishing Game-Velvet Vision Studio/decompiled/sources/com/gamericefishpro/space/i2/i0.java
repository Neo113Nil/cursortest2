package com.gamericefishpro.space.i2;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements ComponentCallbacks2 {
    public final /* synthetic */ com.gamericefishpro.space.m2.d d;

    public i0(com.gamericefishpro.space.m2.d dVar) {
        this.d = dVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.d.a();
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.d.a();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        this.d.a();
    }
}
