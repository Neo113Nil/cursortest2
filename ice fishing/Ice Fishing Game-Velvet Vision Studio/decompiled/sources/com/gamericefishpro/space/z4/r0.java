package com.gamericefishpro.space.z4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements Runnable {
    public final w d;
    public final o e;
    public boolean i;

    public r0(w registry, o event) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(event, "event");
        this.d = registry;
        this.e = event;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.i) {
            return;
        }
        this.d.d(this.e);
        this.i = true;
    }
}
