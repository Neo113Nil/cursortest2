package com.gamericefishpro.space.pi;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements m0 {
    public final ScheduledFuture d;

    public l0(ScheduledFuture scheduledFuture) {
        this.d = scheduledFuture;
    }

    @Override // com.gamericefishpro.space.pi.m0
    public final void a() {
        this.d.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.d + ']';
    }
}
