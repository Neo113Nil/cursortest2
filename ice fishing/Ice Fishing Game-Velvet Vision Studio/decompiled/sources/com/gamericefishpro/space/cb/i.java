package com.gamericefishpro.space.cb;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends com.gamericefishpro.space.h3.h implements ScheduledFuture {
    public final ScheduledFuture A;

    public i(h hVar) {
        this.A = hVar.a(new com.gamericefishpro.space.vb.c(4, this));
    }

    @Override // com.gamericefishpro.space.h3.h
    public final void c() {
        ScheduledFuture scheduledFuture = this.A;
        Object obj = this.d;
        scheduledFuture.cancel((obj instanceof com.gamericefishpro.space.h3.a) && ((com.gamericefishpro.space.h3.a) obj).a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.A.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.A.getDelay(timeUnit);
    }
}
